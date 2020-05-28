package com.cr.unsafe;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class ObjectFieldOffset {

    private String s2;
    private String s1;

    private int i1;
    private int i2;

    private byte b1;
    private byte b2;
    private byte b3;

    public static void main(String[] args) {
        Unsafe unsafe = GetUnsafeInstance.get();
        Field[] fields = ObjectFieldOffset.class.getDeclaredFields();
        for (Field field : fields) {

            //通过打印可以得出几个结论
            //1.内存顺序int>byte>reference
            //2.int占用4个字节(i2-i1),byte占用1个字节,引用占用4个字节
            //3.对象头占用12个字节(i1的offset为12)
            //s2 offset: 24
            //s1 offset: 28
            //i1 offset: 12
            //i2 offset: 16
            //b1 offset: 20
            //b2 offset: 21
            //b3 offset: 22
            System.out.println(field.getName() + " offset: " + unsafe.objectFieldOffset(field));
        }
    }


}
