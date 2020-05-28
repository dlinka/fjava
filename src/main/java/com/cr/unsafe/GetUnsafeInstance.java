package com.cr.unsafe;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class GetUnsafeInstance {

    public static Unsafe get() {
        Field field = null;
        try {
            field = Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        field.setAccessible(true);

        Unsafe unsafe = null;
        try {
            unsafe = (Unsafe) field.get(null);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return unsafe;
    }

}
