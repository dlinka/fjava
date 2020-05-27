package com.cr.reference;

import java.lang.ref.WeakReference;

public class Weak {

    public static void main(String[] args) {
        //只要发生GC就会被回收
        WeakReference wr = new WeakReference(new Object());
        System.out.println(wr.get());
        System.gc();
        System.out.println(wr.get());
    }
}
