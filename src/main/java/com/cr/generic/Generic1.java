package com.cr.generic;

public class Generic1<T> {
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
