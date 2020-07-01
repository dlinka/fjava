package com.cr.pattern.singleton;

import java.io.Serializable;

//为了测试序列化问题才增加的Serializable接口
public class HungrySingleton implements Serializable {
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
