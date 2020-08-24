package com.cr.compare;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableUsage implements Comparable<ComparableUsage> {

    private Integer val;

    public ComparableUsage(Integer val) {
        this.val = val;
    }

    @Override
    public int compareTo(ComparableUsage o) {
        return val.compareTo(o.getVal());
    }

    public Integer getVal() {
        return val;
    }

    public static void main(String[] args) {
        ArrayList<ComparableUsage> list = new ArrayList<>();
        list.add(new ComparableUsage(2));
        list.add(new ComparableUsage(7));
        list.add(new ComparableUsage(1));
        list.add(new ComparableUsage(6));
        Collections.sort(list);
        System.out.println(list);
    }

    @Override
    public String toString() {
        return "ComparableUsage{" +
                "val=" + val +
                '}';
    }

}
