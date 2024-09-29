package com.bigdata.scala.chapter06.test




import scala.collection.mutable





object Scala03_Object_Import {

      def main(args: Array[String]): Unit = {
        // TODO 面向对象编程
        // TODO java :
        // 导入:  import
        // 用法:  import java.util.List
        //       import static java.util.*
        //       import static java.util.XXXX.YYYY
        // 用途: 1.导类
        //       2.静态导入
        // 分析  1.DateUtil
        //       2.不方便，不好理解
        // TODO Scala语言将java语法进行了扩展
        // 1.import 是可以导包
//        import  com.bigdata.scala.chapter05
//        chapter05.testPackageChapter05()

        // 2.import关键字可以在任何地方使用
        // import 如果在当前位置使用，那么其他位置就不起作用
//        import java.util.Date
//        val date = new Date()

        // 3.scala导入一个包中所有的类，采用下划线代替java中的*号
//        import java.util._
//        new ArrayList()

        // 4.可以将一个包中的多个类在同一行导入
//        import java.util.{List,ArrayList,Map,HashMap}

        // 5.屏蔽类
        // 如果不同的包中有相同名称类，可以通过屏蔽方式进行编译
//        import java.util._
//        import java.sql.{Date =>_,_}
//        new Date()

        // 6.给类起别名
//        import java.util.{HashMap => JavaHashMap}
//        val map = new JavaHashMap()

        // 7.scala中import的规则
        // 以当前包为基准，导入指定子包中的类，如果找不到，再从顶级包中依次查找，需要采用特殊的操作
        // println(new _root_.java.util.HashMap())

        //8. 有些内容无需导入
        // java中java.lang包中类无需导入
        // scala中scala.lang包中也无需导入
        // scala中scala包中也无需导入
        // scala中Predef对象的方法也无需导入，类似于静态导入
        println("123")



      }

//  def test() : Unit = {
//    val date = new Date()
//  }




}


//package java {
//  package util{
//    class HashMap {
//
//    }
//  }
//
//}



