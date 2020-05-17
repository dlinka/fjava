package com.cr.bit;

public class BitMoveOperation {

    public static void main(String[] args) {
        BitMoveOperation bo = new BitMoveOperation();
        bo.leftMove();
        bo.rightMove();
        bo.noSymbolRightMove();
    }

    //补码进行左移n位
    //符号位也移动
    //右边补零
    //移动的位数如果大于等于32位,就对32取余
    //移动32位,相当于不移动,移动40位,相当于移动8位
    public void leftMove() {
        int num = 12333292;
        System.out.println(num << 8);
    }

    //补码进行右移n位
    //左边补上符号位
    //正数全补上0,负数全补上1
    //移动的位数如果大于等于32位,也对32取余
    public void rightMove() {
        int num = 12333292;
        System.out.println(num >> 8);
    }

    //补码进行右移n位
    //左边全补上0
    //移动的位数如果大于等于32位,也对32取余
    public void noSymbolRightMove() {
        int num = -1;
        System.out.println(num >>> 8);
    }
}
