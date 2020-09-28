package com.cr.reference;

import java.lang.ref.SoftReference;
import java.util.concurrent.TimeUnit;

public class SoftRef {

    public static void main(String[] args) throws InterruptedException {
        //如果内存空间够,垃圾回收器不会回收SoftReference
        SoftReference sf = new SoftReference(new Object());
        System.out.println(sf.get());

        System.gc();
        //等待2秒完成GC
        TimeUnit.SECONDS.sleep(2);
        System.out.println(sf.get());
    }
}
