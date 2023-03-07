package com.zhuweihao.SpringFramework.bean;

import com.zhuweihao.SpringFramework.pojo.Book;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author zhuweihao
 * @Date 2023/3/7 11:08
 * @Description com.zhuweihao.SpringFramework.factorybean
 */
public class myFactoryBean implements FactoryBean<Book> {

    //定义返回bean
    @Override
    public Book getObject() throws Exception {
        Book book = new Book("算法设计","张三");
        return book;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
