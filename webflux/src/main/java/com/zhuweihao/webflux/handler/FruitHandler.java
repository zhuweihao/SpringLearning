package com.zhuweihao.webflux.handler;

import com.zhuweihao.webflux.pojo.Fruit;
import com.zhuweihao.webflux.service.FruitService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;


/**
 * @Author zhuweihao
 * @Date 2023/3/12 20:46
 * @Description com.zhuweihao.webflux.handler
 */
@Component
public class FruitHandler {
    @Resource
    public FruitService fruitService;

    public Mono<ServerResponse> getFruitById(ServerRequest request){
        //获取id
        Integer id = Integer.valueOf(request.pathVariable("id"));
        //调用service方法得到数据
        Mono<Fruit> fruitMono = this.fruitService.getFruitById(id);
        //返回fruitMono
        return fruitMono.flatMap(fruit -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(fruitMono,Fruit.class));
    }

    public Mono<ServerResponse> getAllFruit(ServerRequest serverRequest){
        Flux<Fruit> fruitFlux = this.fruitService.getAll();
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(fruitFlux,Fruit.class);
    }

    public Mono<ServerResponse> saveFruit(ServerRequest serverRequest){
        Mono<Fruit> fruitMono = serverRequest.bodyToMono(Fruit.class);
        return ServerResponse.ok().build(this.fruitService.saveFruitInfo(fruitMono));
    }
}
