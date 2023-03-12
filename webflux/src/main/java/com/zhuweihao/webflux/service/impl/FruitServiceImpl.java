package com.zhuweihao.webflux.service.impl;

import com.zhuweihao.webflux.dao.FruitDao;
import com.zhuweihao.webflux.pojo.Fruit;
import com.zhuweihao.webflux.service.FruitService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author zhuweihao
 * @Date 2023/3/7 16:54
 * @Description com.zhuweihao.SpringFramework.service.impl
 */
@Service
public class FruitServiceImpl implements FruitService {

    @Resource
    private FruitDao fruitDao;


    @Override
    public Mono<Fruit> getFruitById(Integer id) {
        Fruit fruit = fruitDao.selectById(id);
        return Mono.justOrEmpty(fruit);
    }

    @Override
    public Flux<Fruit> getAll() {
        List<Fruit> fruits = fruitDao.selectAll();
        return Flux.fromIterable(fruits);
    }

    @Override
    public Mono<Void> saveFruitInfo(Mono<Fruit> fruitMono) {
        Mono<Void> voidMono = fruitMono.doOnNext(fruit -> fruitDao.addFruit(fruit)).thenEmpty(Mono.empty());
        return voidMono;
    }
}
