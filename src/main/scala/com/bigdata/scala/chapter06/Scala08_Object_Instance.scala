package com.bigdata.scala.chapter06

import com.bigdata.scala.chapter06.Scala07_Object_Method.User

object Scala08_Object_Instance {

      def main(args: Array[String]): Unit = {

        // TODO 面向对象编程 - 实例化 - 对象
        // 1.可以通过new构建对象
        // val user = new User()
        // 2.可以通过反射构建对象
        // 3.clone
        // 4.反序列化
        // scala中可以使用object关键字构建单例对象
//        println(Scala08_Object_Instance)
        // 6.scala中有一个方法可以构建对象，实际上采用的就是new,但是编译器可以动态识别
        // apply方法可以省略，后面的集合对象基本上都是采用这种方式构建
//        val user = User.apply()
        val user = User()
        println(user)

      }

      class User {

      }

      object User {
        def apply() :User = new User()
      }
}



