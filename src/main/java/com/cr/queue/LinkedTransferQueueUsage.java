package com.cr.queue;

import java.util.concurrent.LinkedTransferQueue;

public class LinkedTransferQueueUsage {

    public static void main(String[] args) throws InterruptedException {
        LinkedTransferQueue<Integer> blockingQueue = new LinkedTransferQueue<>();

        //transfer是直接把元素给消费者,如果没有消费者,程序会被阻塞
        blockingQueue.transfer(1);

        //这块代码放到上面,程序就可以结束
        new Thread(()->{
            try {
                blockingQueue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
