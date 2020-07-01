package com.cr.pattern.singleton;

public class InnerClassSingleton {
    private static class InnerClassHolder {
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    private InnerClassSingleton() {
    }

    public static InnerClassSingleton getInstance() {
        return InnerClassHolder.instance;
    }
}
