package com.cr.generic;

public class ServiceImpl1<T> implements Service<T> {
    private T t;

    public ServiceImpl1(T t) {
        this.t = t;
    }

    @Override
    public T get() {
        return this.t;
    }

    public static void main(String[] args) {
        Service<Integer> service = new ServiceImpl1<>(1);
        service.get();
    }
}
