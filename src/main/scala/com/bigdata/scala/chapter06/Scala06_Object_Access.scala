package com.bigdata.scala.chapter06

import scala.beans.BeanProperty

object Scala06_Object_Access {

      def main(args: Array[String]): Unit = {

        // TODO 面向对象编程 - 访问权限
        // scala中的访问权限和java类似,也有4种不同的权限
        // 1.private : 私有，同类
        // 2.private[包名] : 包私有，同类，同包(包括子包)
        // 3.protected : 受保护的，同类，子类
        // 4.(default) : 公共的，任何地方都可以使用





      }

      class User {

            private var name : String = "zhangsan"
            private[chapter06] var age : String = "zhangsan"
            protected  var email : String = "zhangsan"
            var address : String = "zhangsan"

            def test(): Unit = {
                  println(this.name)
                  println(this.age)
                  println(this.email)
                  println(this.address)
            }

      }

      class Emp {

            def test(): Unit = {
                  val user = new User()
                  //println(user.name) // X 同类才能访问
                  println(user.age) // 同包能访问
                  // println(user.email) // X 同类和子类才能访问
                  println(user.address) // 哪都能用
            }

      }

      class Student extends User {

            def test1(): Unit = {
                  val user = new User()
                  //println(user.name) // X 同类才能访问
                  //println(user.age) // 同包能访问
                  //println(user.email) // X 同类和子类才能访问
                  println(user.address) // 哪都能用
            }

      }

}


package subchapter06 {

      import com.bigdata.scala.chapter06.Scala06_Object_Access.User

      class SubClass {

            def test(): Unit = {
                  val user = new User()
                  //println(user.name) // X 同类才能访问
                  println(user.age) // 同包能访问
                  // println(user.email) // X 同类和子类才能访问
                  println(user.address) // 哪都能用
            }

      }
}



