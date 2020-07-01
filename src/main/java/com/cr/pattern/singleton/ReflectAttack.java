package com.cr.pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectAttack {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //使用反射依旧可以创建对象
        Constructor<HungrySingleton> declaredConstructor = HungrySingleton.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        HungrySingleton instance = declaredConstructor.newInstance();

        //饿汉模式可以在构造函数中使用如下方式防止反射创建对象
        /**
         * private HungrySingleton() {
         *   if (instance != null) {
         *     throw new RuntimeException("不允许使用反射创建对象");
         *   }
         * }
         */
    }

}
