package com.zhuweihao.webflux.server;

import com.zhuweihao.webflux.handler.FruitHandler;
import com.zhuweihao.webflux.service.FruitService;
import com.zhuweihao.webflux.service.impl.FruitServiceImpl;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.http.server.reactive.ReactorHttpHandlerAdapter;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.netty.http.server.HttpServer;

import java.io.IOException;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.toHttpHandler;

/**
 * @Author zhuweihao
 * @Date 2023/3/12 21:01
 * @Description com.zhuweihao.webflux.server
 */
public class FruitServer {

    public static void main(String[] args) {
        FruitServer fruitServer = new FruitServer();
        fruitServer.createReactorServer();
        System.out.println("enter to exit");
        try {
            System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //创建Router路由
    public RouterFunction<ServerResponse> routerFunction() {
        FruitService fruitService = new FruitServiceImpl();
        FruitHandler fruitHandler = new FruitHandler(fruitService);
        return RouterFunctions.route(GET("/fruit/{id}").and(accept(MediaType.APPLICATION_JSON)), fruitHandler::getFruitById)
                .andRoute(GET("/fruit/all").and(accept(MediaType.APPLICATION_JSON)), fruitHandler::getAllFruit);
    }

    //创建服务器完成适配
    public void createReactorServer(){
        //路由和handler适配
        RouterFunction<ServerResponse> route = routerFunction();
        HttpHandler httpHandler = toHttpHandler(route);
        ReactorHttpHandlerAdapter adapter = new ReactorHttpHandlerAdapter(httpHandler);
        //创建服务器
        HttpServer httpServer = HttpServer.create();
        httpServer.handle(adapter).bindNow();
    }
}
