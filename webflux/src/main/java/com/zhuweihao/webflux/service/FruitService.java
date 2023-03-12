package com.zhuweihao.webflux.service;



import com.zhuweihao.webflux.pojo.Fruit;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * @Author zhuweihao
 * @Date 2023/3/7 16:54
 * @Description com.zhuweihao.SpringFramework.service
 */
public interface FruitService {

    //根据id查询用户
    Mono<Fruit> getFruitById(Integer id);

    //查询所有用户
    Flux<Fruit> getAll();

    //添加记录
    Mono<Void> saveFruitInfo(Mono<Fruit> fruitMono);
}
