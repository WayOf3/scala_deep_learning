package com.bigdata.scala.test;

public class TestFunction {
    public static void main(String[] args) {
        // 阶乘
        // 一个大于1的数的阶乘等于这个数乘以这个数减一的阶乘
        // 5! = 5 * 4！
        System.out.println(test(5)); // 120
    }
    // 阶乘
    public static int test(int num) {
        if ( num <= 1 ) {
            return 1;
        } else {
            return num * test(num - 1);
        }
    }
}
