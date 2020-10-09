package com.cr.io;

import java.nio.ByteBuffer;

public class ByteBufferUsage {

    public static void main(String[] args) {
        //init();
        //putget();
        //loop();
        slice();
    }

    //初始化
    private static void init() {
        //1
        ByteBuffer buffer1 = ByteBuffer.allocate(10);

        //2
        byte[] arr = new byte[10];
        ByteBuffer buffer2 = ByteBuffer.wrap(arr);
    }

    private static void putget(){
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.putInt(10);
        //4
        System.out.println(buffer.position());
        //10
        System.out.println(buffer.limit());

        //get之前需要置位
        //看到这个方法你才知道limit和capacity的区别
        //flip的源码会将limit置位4
        buffer.flip();

        //0
        System.out.println(buffer.position());
        //4
        System.out.println(buffer.limit());
        System.out.println(buffer.getInt());
    }

    private static void loop() {
        ByteBuffer buffer;
        byte[] num = new byte[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = (byte) (i+1);
        }
        buffer = ByteBuffer.wrap(num);
        while(buffer.hasRemaining()){
            System.out.println(buffer.get());
        }
    }

    private static void slice() {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.putInt(10);

        ByteBuffer slice = buffer.slice();
        //0
        System.out.println(slice.position());
        //6
        System.out.println(slice.limit());
        //6
        System.out.println(slice.capacity());
    }

}
