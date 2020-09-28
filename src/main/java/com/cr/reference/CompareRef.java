package com.cr.reference;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CompareRef {


    public static void main(String[] args) throws InterruptedException {
        //strongRef();
        //softRef();
        weakRef();
    }

    static void strongRef() throws InterruptedException {
        List<Object1M> list = new ArrayList<>();
        while(true){
            list.add(new Object1M());
            System.out.println(list.size());
            TimeUnit.MILLISECONDS.sleep(500);
        }
    }

    static void softRef() throws InterruptedException {
        List<SoftReference<Object1M>> list = new ArrayList<>();
        while(true){
            list.add(new SoftReference<>(new Object1M()));
            System.out.println(list.size());
            //设置500毫秒会报错
            TimeUnit.MILLISECONDS.sleep(2000);
        }
    }

    static void weakRef() throws InterruptedException {
        List<WeakReference<Object1M>> list = new ArrayList<>();
        while(true){
            list.add(new WeakReference<>(new Object1M()));
            System.out.println(list.size());
            TimeUnit.MILLISECONDS.sleep(500);
        }

    }

    private static class Object1M {
        private byte[] _1MB = new byte[1024 * 1024];

        @Override
        protected void finalize() throws Throwable {
            System.out.println("GC...");
        }
    }

}
