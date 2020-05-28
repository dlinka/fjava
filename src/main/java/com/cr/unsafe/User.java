package com.cr.unsafe;

public class User {
    //没有get/set方法
    private String name;
    private int age;

    //没有无参的构造函数
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
