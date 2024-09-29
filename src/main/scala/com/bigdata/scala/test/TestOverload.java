package com.bigdata.scala.test;

public class TestOverload {

    public static void main(String[] args) {

        // 方法的重载
        // 1.方法名称相同
        // 2.方法参数列表不相同(个数，类型，顺序)
//        AA aa = new AA();
//        test(aa); // aa
//
//
//        BB bb = new BB();
//        test(bb); // bb

        //  查找方法，以类型为基础进行查找，如果指定类型不存在，会扩大类型的范围继续查找
        // 父类范围>子类范围
        AA aa = new BB();
        test(aa);

    }
//    public static void test(AA aa) {
//        System.out.println("aaaa");
//    }

    public static void test(Object bb) {
        System.out.println("bbbb");
    }

}

class AA {

}

class BB  extends AA {

}