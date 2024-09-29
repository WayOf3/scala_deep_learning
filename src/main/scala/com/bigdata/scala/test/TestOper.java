package com.bigdata.scala.test;

public class TestOper {

    public static void main(String[] args) {

        // JDK 1.5之后，Java可以将基本数据类型和引用数据类型(包装类)可以进行自动的的转换
        // 装箱 & 拆箱
        // 基本数据类型 =》 装箱(包装类型.valueOf) => 包装类型
        // 包装类型 =》 拆箱 包装类型变量.intValue =》 基本数据类型
//        Integer i = 100;
//        Integer j = 100;
//
//        System.out.println(i == j);
//
//        Integer i1 = 200;
//        Integer j1 = 200;
//
//        System.out.println(i1 == j1);

        // 赋值运算符： 将等号右边的计算结果给左边
//        int i = 0;
//        int j = ++i;
        // ++ 放置在变量的后面，先赋值，再加一，如果放置在前面，那么先加一，再赋值
        // ++ 运算不是原子性运算，所以会有多步操作，多个步骤间会存在临时计算结果
        // 计算过程中应该存在临时变量，会保存临时计算结果
//        i = i++; // _tmp = i = 0; i = 0 + 1 = 1; i = _tmp = 0
//        System.out.println("i = " + i); // 1
//        System.out.println("j = " + j); // 1

        // TODO 字符串判断是否非空
        // 不是null且也不是空字符串

//        1;
    }

    public static boolean isNotEmptyString(String  s) {

        return s != null && !s.trim().equals("");

    }

}
