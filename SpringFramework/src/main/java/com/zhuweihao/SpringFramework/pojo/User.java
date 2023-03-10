package com.zhuweihao.SpringFramework.pojo;

/**
 * @Author zhuweihao
 * @Date 2023/2/27 11:19
 * @Description com.zhuweihao.SpringFramework.pojo
 */
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", book=" + book +
                '}';
    }
}
