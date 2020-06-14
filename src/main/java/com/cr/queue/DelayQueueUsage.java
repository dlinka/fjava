package com.cr.queue;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueUsage {

    public static void main(String[] args) throws InterruptedException {
        long now = System.currentTimeMillis();
        Task task1 = new Task("task1", now + 21000);
        Task task2 = new Task("task2", now + 1700);

        DelayQueue<Task> delayQueue = new DelayQueue<>();
        delayQueue.put(task1);
        delayQueue.put(task2);

        System.out.println(now);
        while (true) {
            System.out.println(delayQueue.take());
        }
    }

    static class Task implements Delayed {
        private String name;
        private long time;

        public Task(String name, long time) {
            this.name = name;
            this.time = time;
        }

        @Override
        public long getDelay(TimeUnit unit) {
            //time单位毫秒
            return unit.convert(time - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override
        public int compareTo(Delayed o) {
            long time = this.getDelay(TimeUnit.MICROSECONDS);
            long oTime = o.getDelay(TimeUnit.MICROSECONDS);
            return time > oTime ? 1 : time == oTime ? 0 : -1;
        }

        @Override
        public String toString() {
            return "Task{" +
                    "name='" + name + '\'' +
                    ", time=" + time +
                    '}';
        }
    }

}
