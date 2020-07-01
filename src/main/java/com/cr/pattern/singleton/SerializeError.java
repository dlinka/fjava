package com.cr.pattern.singleton;

import java.io.*;

public class SerializeError {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HungrySingleton instance = HungrySingleton.getInstance();

        //先序列化对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serialize-error"));
        oos.writeObject(instance);
        oos.close();

        //再反序列化对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serialize-error"));
        HungrySingleton obj = (HungrySingleton) ois.readObject();

        //结果返回false
        System.out.println(instance == obj);
    }

}
