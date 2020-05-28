package com.cr.unsafe;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class SetPrivateProperty {

    public static void main(String[] args) throws NoSuchFieldException {
        Unsafe unsafe = GetUnsafeInstance.get();
        Field name = User.class.getDeclaredField("name");
        Field age = User.class.getDeclaredField("age");
        User user = new User("cr", 27);
        unsafe.putObject(user, unsafe.objectFieldOffset(name), "zj");
        unsafe.putInt(user, unsafe.objectFieldOffset(age), 18);
        //User{name='zj', age=18}
        System.out.println(user);
    }

}
