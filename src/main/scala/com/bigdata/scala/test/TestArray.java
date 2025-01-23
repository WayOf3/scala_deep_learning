package com.bigdata.scala.test;


import java.util.Arrays;

public class TestArray {

    public static void main(String[] args) {

        // 声明数组
        int[] a;

        // 初始化数组
        a = new int[5];


        // foreach 循环遍历数组 默认int 为0
        for (int i : a){
            System.out.println(i);
        }



        boolean[] b = new boolean[6];

        // for 循环遍历数组 默认boolean 为 false
        for ( int j = 0; j < b.length; j++ ) {
            System.out.println(b[j]);
        }

        // 数组初始化及匿名数组
        int[] c = {1,3,2,4,5};

        // 数组浅拷贝 两个数组指向同一块内存地址 引用同一份数据
        int[] d = c;

        d[2] = 10;

        System.out.println(c[2]);

        // 数组深拷贝 两个变量不再引用同一份数据
        int[] e = Arrays.copyOf(c,c.length);
        e[3] = 11;
        System.out.println(c[3]);


        // 数组排序 默认使用快速排序
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));



        // 二维数组
        int[][] f = new int[5][5];


        //foreach循环遍历
        for (int[] i: f) {
            for (int item : i) {
                System.out.println(item);
            }
        }

        // for循环遍历
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f[i].length; j++) {
                System.out.println(f[i][j]);
            }
        }

        // 规范化打印二维数组
        System.out.println(Arrays.deepToString(f));








    }
}
