package com.cr.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorUsage implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int result = o1.length() - o2.length();
        if (result > 0) {
            return 1;
        } else if (result == 0) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("333");
        list.add("22");
        Collections.sort(list, new ComparatorUsage());
        System.out.println(list);
    }

}
