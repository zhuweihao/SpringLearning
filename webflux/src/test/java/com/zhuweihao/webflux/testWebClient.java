package com.zhuweihao.webflux;

import com.zhuweihao.webflux.pojo.Fruit;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

/**
 * @Author zhuweihao
 * @Date 2023/3/13 16:57
 * @Description com.zhuweihao.webflux
 */
@SpringBootTest
public class testWebClient {
    @Test
    public void test() {
        Flux<Fruit> fruitFlux = WebClient.create()
                .get()
                .uri("http://localhost:8080/server/fruitall")
                .retrieve()
                .bodyToFlux(Fruit.class);
        fruitFlux
                .map(fruit -> {
                    fruit.setPrice(100);
                    System.out.println("fruit = " + fruit);
                    return fruit;
                })
                .subscribe(fruit -> {
                    System.out.println("fruit = " + fruit);
                });
    }
}
