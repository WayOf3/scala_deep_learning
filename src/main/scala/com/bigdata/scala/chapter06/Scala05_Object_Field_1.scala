package com.bigdata.scala.chapter06

import scala.beans.BeanProperty

object Scala05_Object_Field_1 {

      def main(args: Array[String]): Unit = {

        // TODO 面向对象编程 - 属性




        val  user = new User()
        user.name = "lisi"
        println(user.name)

        user name_$eq "wangwu"
        println(user.name)

        // user.age = 40
//        user.age = 40

//        user.setName()
//        user.setName()

      }

      // 使用val 声明类的属性，在编译时，会给属性增加final关键字
      // 类的属性在编译时，都是private权限
      // 类的属性在编译时，会同时生成属性的公共的set,get方法，但是名字不是以set,get开头的
      // 当访问属性时，等同于调用对象的属性的get方法
      // 当给属性赋值时，等同于调用对象的属性的set方法
      // java中Bean对象由Bean开发规范.
      // 属性私有化，提供公共的set,get方法，方法以set,get开头
      // scala中对象属性不遵循Bean规范，这样，和其他的技术框架集成的时候，会出现很多问题。
      // 所以为了能够和其他框架相集成，scala提供了一个注解，解决了Bean规范的问题
      // 属性的权限修饰符如果采用private,那么编译时set,get方法也是private
      // 增加@BeanProperty 注解的属性不能声明private权限 (编译后其实是private)
      class User {

        @BeanProperty  var name : String = _

        @BeanProperty  var age : Int = 30

        val email = "zhangsan@zhangsan"

      }

}



