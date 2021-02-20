package com.cr.generic;

import java.io.Serializable;

public class TypeInfer {
    public static <T> T infer(T t1, T t2) {
        return t2;
    }

    public static void main(String[] args) {
        Serializable cr = TypeInfer.infer("CR", 27);
        System.out.println(cr.getClass());
    }
}
