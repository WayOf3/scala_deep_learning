package com.bigdata.scala.chapter06

object Scala05_Object_Field {

      def main(args: Array[String]): Unit = {

        // TODO 面向对象编程 - 属性


        // 1.scala给类声明属性等同于给类声明变量
        //    类中的变量称之为属性
        // 2.变量使用var,val声明
        // 3.变量的类型如果可以推断出来，那么就可以省略
        // 4.变量必须显示的初始化
        //   java中属性可以默认初始化的，所以属性的赋值可以不用写
        //   scala中属性必须明确初始化，但是也希望和java保持一致
        //   可以采用下划线进行赋值，表示由系统进行默认初始化
        //   如果使用下划线进行赋值,那么属性的类型不能省略
        //   val 声明的属性不能使用下划线赋值

        val  user = new User()
        user.name = "lisi"
//        user.age = 40

      }


      class User {

        var name : String = _

        val age : Int = 30

        val email = "zhangsan@zhangsan"

      }

}



