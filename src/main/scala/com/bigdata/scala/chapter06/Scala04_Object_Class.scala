package com.bigdata.scala.chapter06

import scala.collection.mutable

// 伴生类
class Scala04_Object_Class{

}


// 伴生对象
object Scala04_Object_Class {

      def main(args: Array[String]): Unit = {

        // TODO 面向对象编程

        // TODO 类
        // java :
        // public class User {
        // }

        // 1.一个源码文件中，类可以声明多个，但是公共类只能有一个，而且和源码文件名称相同
        // 2.抽取对象的相同的内容(模板)
        // 3.使用class声明类

        // scala和java的class语法大同小异
        // 1.scala源码中所有声明的类都可以是公共
        // 使用Object关键字也可以声明类，但是同时也会生产另外一个对象的类
        // 主要目的是为了模拟静态语法
        // TODO 对象名称(类名)，方法
        // 一般情况下，将java中的成员方法和属性声明在object声明类中.
        // 一般情况下，将java中的静态方法和属性声明在object声明在另外一个类($)中
            // User User = new User()
            // User.xxxx
        // TODO 将Object声明的类称之为伴生类，将object声明的对象称之为伴生对象
        // 伴生类和伴生对象可以同时出现在一个源码文件中
        // IDEA工具会动态识别伴生类和伴生对象(图标)







      }


}


//class XXX {
//
//}
//class YYY {
//
//}






