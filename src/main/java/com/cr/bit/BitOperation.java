package com.cr.bit;

public class BitOperation {

    public static void main(String[] args) {
        BitOperation bo = new BitOperation();
        bo.bitAND();
        bo.bitOR();
        bo.bitXOR();
    }

    //与运算
    //&
    //两个位都为1时,才为1
    public void bitAND() {
        System.out.println(1 & 1); //1
        System.out.println(1 & 0); //0
        System.out.println(0 & 0); //0
    }

    //或运算
    //|
    //两个位都为0时,才为0
    public void bitOR() {
        System.out.println(1 | 1); //1
        System.out.println(1 | 0); //1
        System.out.println(0 | 0); //0
    }

    //异或运算
    //^
    //两个位相同为0,相异为1
    public void bitXOR() {
        System.out.println(1 ^ 1); //0
        System.out.println(0 ^ 0); //0
        System.out.println(1 ^ 0); //1
    }

}
