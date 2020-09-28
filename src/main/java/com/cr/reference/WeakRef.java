package com.cr.reference;

import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

public class WeakRef {

    public static void main(String[] args) throws InterruptedException {
        //只要发生GC就会回收WeakReference
        WeakReference wr = new WeakReference(new Object());
        System.out.println(wr.get());

        System.gc();
        //等待2秒完成GC
        TimeUnit.SECONDS.sleep(2);
        System.out.println(wr.get());
    }
}
