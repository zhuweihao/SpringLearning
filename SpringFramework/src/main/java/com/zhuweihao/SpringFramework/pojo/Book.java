package com.zhuweihao.SpringFramework.pojo;

/**
 * @Author zhuweihao
 * @Date 2023/3/6 11:56
 * @Description com.zhuweihao.SpringFramework.pojo
 */
public class Book {
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
