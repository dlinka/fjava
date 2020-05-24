package com.cr.excetion;

public class UserImpl implements IUser {

    //接口中没有声明异常
    //如果实现类中声明异常会导致编译不通过
    @Override
    public void getUser() {}

    //接口中有声明异常
    //实现类中可以不用声明异常
    //但是调用的时候需要抛出异常
    @Override
    public void getAllUser() {}

}
