package com.cr.excetion;

import java.util.HashMap;
import java.util.Map;

public class FinallyReturn {

    public static void main(String[] args) {
        System.out.println(test1());
        System.out.println(test2());
        System.out.println(test3_1());
        System.out.println(test3_2());
        System.out.println(test4());
    }

    //finally在return语句执行之后执行
    private static int test1() {
        int result = 1;
        try {
            return result += 1;
        } finally {
            if (result == 2) {
            }
        }
    }

    //finally里的return语句会覆盖try中的return语句
    private static int test2() {
        int result = 1;
        try {
            return result += 1;
        } finally {
            return 5;
        }
    }

    //finally里修改返回值不影响try中的返回值
    private static int test3_1() {
        int result = 1;
        try {
            return result += 1;
        } finally {
            result = 1000;
        }
    }

    private static Map<String, Integer> test3_2() {
        Map<String, Integer> map = new HashMap<>();
        try {
            map.put("key", 1);
            return map;
        } finally {
            map.put("key", 2);
            map = null;
        }
    }

    public static int test4() {
        int result = 1;
        try {
            result = 1 / 0;
            result = 2;
            return result;
        } catch (Exception e) {
            result = 3;
            return result;
        } finally {
            if (result != 3) result = 4;
        }
    }

}
