package com.cr.reference;

import java.lang.ref.SoftReference;

public class Soft {

    public static void main(String[] args) {
        //如果内存空间够,垃圾回收器就不会回收,反之,回收
        SoftReference sf = new SoftReference(new Object());
        System.out.println(sf.get());
        System.gc();
        System.out.println(sf.get());
    }
}
