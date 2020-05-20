package com.cr.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        Class<User> userClass = User.class;
        ClassAnnotation classAnnotation = userClass.getAnnotation(ClassAnnotation.class);
        System.out.println(classAnnotation.description());

        Method[] methods = userClass.getMethods();
        for (Method method : methods) {
            if(method.isAnnotationPresent(MethodAnnotation.class)){
                MethodAnnotation methodAnnotation = method.getAnnotation(MethodAnnotation.class);
                System.out.println(methodAnnotation.description());
            }
        }

        Field[] declaredFields = userClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            if(declaredField.isAnnotationPresent(FieldAnnotation.class)){
                FieldAnnotation fieldAnnotation = declaredField.getAnnotation(FieldAnnotation.class);
                System.out.println(fieldAnnotation.description());
            }
        }
    }

}
