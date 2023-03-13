package com.zhuweihao.webflux.webclient;

import com.zhuweihao.webflux.pojo.Fruit;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

/**
 * @Author zhuweihao
 * @Date 2023/3/12 23:06
 * @Description com.zhuweihao.webflux.webclient
 */
public class FruitWebClient {
    public static void main(String[] args) {
        WebClient webClient = WebClient.create("http://localhost:8080");
        Flux<Fruit> fruitFlux = webClient
                .get()
                .uri("/server/fruitall")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToFlux(Fruit.class);
        fruitFlux
                .map(fruit -> {
                    fruit.setPrice(100);
                    System.out.println("fruit = " + fruit);
                    return fruit;
                })
                .buffer()
                .doOnNext(System.out::println)
                .blockFirst();
        Fruit block = webClient
                .get()
                .uri("/fruit/{id}", 4)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Fruit.class)
                .block();
        System.out.println("block = " + block);
    }
}
