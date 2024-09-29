package com.bigdata.scala.test;

public class TestClassType {
    public static void main(String[] args) {

        // 当数值不变的时候，扩大精度，那么类型就会发送变化
        // 0000 0001 byte
        // 0000 0000 0000 0001 short
        // 0000 0000 0000 0000 0000 0000 0000 0001

//        byte b = 10;
//        test(b);
        char c = 'A' + 1;
        System.out.println(c);
    }

//    public static void test (byte b) {
//        System.out.println("bbbb");
//    }

//    public static void test (short s) {
//        System.out.println("ssss");
//    }

    public static void test (char c) {
        System.out.println("cccc");
    }

    public static void test (int i) {
        System.out.println("iiii");
    }
}
