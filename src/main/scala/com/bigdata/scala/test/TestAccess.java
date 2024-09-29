package com.bigdata.scala.test;

public class TestAccess {

    public static void main(String[] args) throws Exception{

        // TODO 权限
        // 权限是什么? 权力和限制
        // 权限的应用: 用户和平台的关系(User ,Vip,Superadmin)
        // Java权限 : 以方法为例，方法的提供者和方法调用者之间关系，决定了访问权限
        // 1.private: 私有的. 同类
        // 2.(default) : 包权限， 同类，同包
        // 3.protected: 受保护权限,同类，同包，子类
        // 4. public : 公共的，同类，同包，子类，所有类

        // TODO 对象有什么方法？
        // clone方法来自object,所以AAA对象有clone方法。
        // clone方法的提供者: java.lang.Object -> 重写后test.AAA
        // clone方法的调用者: test.TestAccess
        AAA aaa = new AAA();

        // 这里的点，不是调用的意思,表示从属关系
        aaa.clone();

    }
}

class AAA {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
