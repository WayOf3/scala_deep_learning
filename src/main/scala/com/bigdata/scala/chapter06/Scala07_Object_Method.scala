package com.bigdata.scala.chapter06

import scala.beans.BeanProperty

object Scala07_Object_Method {

      def main(args: Array[String]): Unit = {

        // TODO 面向对象编程 - 方法
        // 类的方法其实就是类中声明的函数
        // 方法的生命周期是和类，对象，相关
        // 类中的函数遵循方法的约束: 函数不能重名，方法可以重载，重写
        // 访问的访问权限和属性的访问权限一致
        new User().test
        User.test

        // TODO 对象构建后，可以直接使用的方法
        // 1.Object类中的方法可以直接使用
        val user1: User = new User()
        val user2: User = new User()
        println(user1.equals(user2))
        // 2.scala中能用的方法
//        println(user1.eq(user2)) //地址
//        user.!=(2)
//        user.ne(3)
//        println(user.isInstanceOf[User]) // 对象类型
//        val obj: User = user.asInstanceOf[User] // 强制类型转换
//        println(obj)
      }


      class User {
          def test() : Unit = {
            println("class user test...")
          }

      }

      object User {
          def test() : Unit = {
            println("object user test...")
          }
      }

}



