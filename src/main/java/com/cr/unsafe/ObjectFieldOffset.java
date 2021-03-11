package com.cr.unsafe;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * 1.内存中的顺序:
 *      int > byte > boolean > reference
 * 2.对象头占用12个字节
 *      i1的offset为12
 * 3.占用空间:
 *      int占用4个字节(i2-i1)
 *      byte占用1个字节(b2-b1)
 *      boolean占用1个字节(bl2-bl1)
 *      reference占用4个字节(s2-s1)
 * 4.对象的Shallow Size(只计算引用,不计算引用对象的大小)大小:
 *      取最大offset,加上field长度,再加上加上padding
 *
 * 参考:https://www.cnblogs.com/zhanjindong/p/3757767.html
 */
public class ObjectFieldOffset {

    private String s1;
    private String s2;

    private int i1;
    private int i2;

    private byte b1;
    private byte b2;
    private byte b3;

    private boolean bl1;
    private boolean bl2;

    public static void main(String[] args) {
        Unsafe unsafe = GetUnsafeInstance.get();

        Field[] fields = ObjectFieldOffset.class.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + " offset: " + unsafe.objectFieldOffset(field));
        }
    }


}
