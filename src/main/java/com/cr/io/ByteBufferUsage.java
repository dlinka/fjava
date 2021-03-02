package com.cr.io;

import java.nio.ByteBuffer;

public class ByteBufferUsage {

    //初始化
    private static void init() {
        ByteBuffer bb1 = ByteBuffer.allocate(10);

        byte[] arr = new byte[10];
        ByteBuffer bb2 = ByteBuffer.wrap(arr);
    }

    private static void flip(){
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.putInt(10);
        System.out.println(buffer.position()); //4
        System.out.println(buffer.limit()); //10

        //limit等于4,position等于0
        //这里就看出来limit的作用:如果想读取已经写入的数据,就需要一个标识去标识数据的结尾
        buffer.flip();

        System.out.println(buffer.position()); //0
        System.out.println(buffer.limit()); //4
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
        ByteBuffer bb1 = ByteBuffer.allocate(10);
        bb1.putInt(10);

        //返回position到limit之间的数据
        ByteBuffer bb2 = bb1.slice();
        System.out.println(bb2.position()); //0
        System.out.println(bb2.limit()); //6
        System.out.println(bb2.capacity()); //6
    }

    public static void main(String[] args) {
        init();
        loop();
        slice();
    }


}
