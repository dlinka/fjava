package com.cr.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericArray {

    public static void main(String[] args) {
        Generic[] g1 = new Generic[4];

        //数组不能使用泛型
        //Generic1<Integer>[] g1Array = new Generic1<Integer>[4];


        //可以使用通配符
        List<?>[] list = new ArrayList<?>[4];
        list[0] = new ArrayList<String>();
        list[1] = new ArrayList<Integer>();
        System.out.println(list[0].size());
        System.out.println(list[0].get(0));
    }

}
