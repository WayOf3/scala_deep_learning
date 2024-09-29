package com.bigdata.scala.chapter06

object Scala09_Object_Instance_Method {

      def main(args: Array[String]): Unit = {

        // TODO 面向对象编程 - 实例化 - 对象的构造方法
        // 1.java中类的构造方法默认由JVM提供的: 无参，公共的
//        val user = new User()

        //2.scala中类的构造方法默认由JVM提供，无参，公共的，小括号可以省略
//        val user1 = new User
        // 3.如果开发人员给类提供了构造方法(任意),JVM不会提供默认的构造方法
        // 4.new 构建对象时，应该执行构造方法
        // 5.java中构造方法和类的名称是一致的，但是scala中构造方法和类的名称没有关系
//        user.User();
        // 6.scala是完全面向函数式编程语言，所以万物皆函数，声明类就等同于声明函数
        // 声明类的同时所声明的函数其实就是构造函数，当new的时候，函数就会执行

        // 7.scala的构造函数主要功能就是类的实例化(类主体内容的执行)

        // 8.构造方法可以传递参数
        val user = new User("zhangsan")
      }

      class User(name: String) {

        // 类的主体 & 构造函数体
        println("user instance...")
//          def User() = {
//             println("user instance...")
//          }
      }

}



