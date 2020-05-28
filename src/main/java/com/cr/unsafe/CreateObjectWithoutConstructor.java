package com.cr.unsafe;

import sun.misc.Unsafe;

public class CreateObjectWithoutConstructor {

    public static void main(String[] args) throws InstantiationException {
        Unsafe unsafe = GetUnsafeInstance.get();
        //使用这种方式创建对象不会调用构造函数
        User user = (User) unsafe.allocateInstance(User.class);
        //User{name='null', age=0}
        System.out.println(user);
    }

}
