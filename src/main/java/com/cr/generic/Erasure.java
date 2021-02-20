package com.cr.generic;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Erasure {

    public static void main(String[] args) {
        Generic<String> generic = new Generic<>();
        System.out.println(generic.getClass());

        Field[] fields = generic.getClass().getDeclaredFields();
        for(Field field : fields) {
            System.out.println(field.getType());
        }

        Method[] methods = generic.getClass().getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("/////////////////////////////////////////////////////////////////////");
    }

}
