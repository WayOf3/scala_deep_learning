package com.bigdata.scala.test;

public class Child extends Parent{
        public String name = "Lisi";

        public void test() {
            // 字节码中根本就没有super这个变量
            // super 关键字只在编译时用于关联父类，运行时无效
            System.out.println(super.name);
            System.out.println(this.name);
        }

}
