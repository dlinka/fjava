package com.cr.generic;

public class GenericClassAndGenericMethod<T> {

    public void test1(T t) {
        System.out.println(t.getClass().getName());
    }

    public <T> T test2(T t) {
        return t;
    }

    public static void main(String[] args) {
        GenericClassAndGenericMethod<String> t = new GenericClassAndGenericMethod();
        t.test1("CR");
        t.test2(new Integer(1));
    }
}
