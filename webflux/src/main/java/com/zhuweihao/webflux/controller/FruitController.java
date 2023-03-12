package com.zhuweihao.webflux.controller;

import com.zhuweihao.webflux.pojo.Fruit;
import com.zhuweihao.webflux.service.FruitService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.server.RouterFunction;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author zhuweihao
 * @Date 2023/3/7 16:28
 * @Description com.zhuweihao.SpringFramework.controller
 */
@RestController
public class FruitController {
    @Resource
    private FruitService fruitService;

    @GetMapping("/fruit/{id}")
    public Mono<Fruit> getFruitById(@PathVariable Integer id){
        return fruitService.getFruitById(id);
    }
    @GetMapping("/fruit/all")
    public Flux<Fruit> getFruits(){
        return fruitService.getAll();
    }
    @PostMapping("/fruit/save")
    public Mono<Void> saveFruit(@RequestBody Fruit fruit){
        Mono<Fruit> fruitMono = Mono.just(fruit);
        return fruitService.saveFruitInfo(fruitMono);
    }
}
