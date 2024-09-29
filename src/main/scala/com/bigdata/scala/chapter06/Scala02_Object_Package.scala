package com
package bigdata
package scala{
  package chapter06 {
    object Scala02_Object_Package {

      def main(args: Array[String]): Unit = {

        // TODO 面向对象编程
        // TODO java :
        // 包:package
        // 用法:包名的规则
        //    域名的反写 + 项目的名称 + 模块的名称 + 程序的分类(分层)名称
        //    com.atguigu + gmall + user + util(service , bean)
        //    com.atguigu.gmall.user.util
        // 用途: 1.分类管理
        //      2.区分类 java.util.Date java.sql.Date
        //      3.包权限
        //      4.包的路径和源码的存放路径相同
        // 分析
        //     1.声明一个User,含义不明确，最好见名知义，类名起的准确一些
        //        UserUtil,UserBean,UserService
        //        DateUtil,DateBean,DateService
        //     2.如果可以通过类名对类进行区分，那么其实包没有那么重要
        //     3.权限不好用
        //     4.包语法在执行的过程中，只要从classpath环境变量中可以查找到，就应该可以
        //       所以和源码的物理路径没有任何关系
        //  TODO Scala的package语法比java的语法更加丰富
        //  1.package关键字可以多次声明，体现不同包的关系
        //  java中的点表示从属关系
        //  2.可以给包设定作用域，体现上下级关系
        //  3.将包当作对象 : package object xxxx
        //    包对象中声明的属性和方法，在当前包和它的子包都可以直接访问
        //  4.scala中包名和物理路径没有关系
        testPackageObject()

      }


    }

  }
}



