package com.bigdata.scala.test;

public class TestThread {

    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread();
        t1.start();


        Thread t2 = new Thread();
        t2.start();

        // TODO sleep & wait方法的区别
        // 核心区别就在于字体不一样
        // IDEA 方法用什么字体是怎么确定的?
        // sleep方法是静态的,属于类，和对象无关
        t1.sleep(1000); // 休眠的线程不是t1,哪一个线程调用了sleep方法，哪一个线程休眠
        // wait方法是成员的，属于对象
        t2.wait(); // 等待的线程是t2

    }
}
