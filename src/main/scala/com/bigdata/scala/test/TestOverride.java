package com.bigdata.scala.test;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class TestOverride {

    public static void main(String[] args) {


        // TODO 方法的重写
        // 1.应该存在父子类关系
        // 2.不使用在子类的场合，所以需要改变父类的功能实现。
        // 3.方法名相同，参数列表相同,异常不能超出父类的范围（总的异常范围）\
        //     子类重写方法的权限不能低于父类的方法
        // 4.重写方法后，子类的方法可以代替父类方法使用

//        CC cc = new CC();
//        System.out.println(cc.sum()); // 20
//
//        DD dd = new DD();
//        System.out.println(dd.sum());// 40

        // 方法重写就是在同一块内存区域中存在两个一样的方法，该如何区分的问题?
        // JVM在调用对象的成员方法时，会遵循动态绑定机制：
        // 所谓的动态绑定机制，就是在方法运行时，将方法和当前运行对象的实际内存进行绑定
        // 然后调用。
        // 动态绑定机制和属性没有任何关系 属性在哪里声明在哪里使用
        CC cc = new DD();// 当前cc的实际内存是DD  如果子类找不到，会向父类查找方法
        System.out.println(cc.sum()); // 40


        // true
        System.out.println( cc instanceof CC);

    }


}

class CC {
    public int i = 10;
    public int sum() {
        return getI() + 10;
    }

    public int getI() {
        return i;
    }
}

class DD extends CC {
    public int i = 20;
//    public int sum() {
//        return i + 20;
//    }

    public int getI() {
        return i;
    }
}
