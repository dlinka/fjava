package com.cr.queue;

import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueUsage {

    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();

        //没有容量,直接false
        System.out.println(queue.offer(1));

        //程序在这里会被阻塞,程序不能结束
        queue.put(1);

        //这块代码放到上面,程序就可以结束
        new Thread(() -> {
            try {
                queue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

}
