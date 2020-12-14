package com.cr.generic;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 泛型擦除
 */
public class GenericErasure {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Generic1<String> g1 = new Generic1<>();
        g1.setT("cr");
        System.out.println(g1.getClass().getName());

        Field[] g1Fields = g1.getClass().getDeclaredFields();
        System.out.println(g1Fields[0].getName() + " - " + g1Fields[0].getType().getName());

        Method[] g1Methods = g1.getClass().getDeclaredMethods();
        for (Method method : g1Methods) {
            System.out.println(method);
        }

        System.out.println("/////////////////////////////////////////////////////////////////////");
    }

}
