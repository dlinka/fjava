package com.cr.generic;

public class Generic<T> {
    private T t;

    public void test(T t) {
        System.out.println(t);
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

}
