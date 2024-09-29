package com.bigdata.scala.chapter06

object Scala09_Object_Instance_Method_1 {

      def main(args: Array[String]): Unit = {

        // TODO 面向对象编程 - 实例化 - 对象的构造方法
        // java中的构造方法可以重载
        //scala中的构造方法如何重载?
        // TODO scala中的构造方法分为2大类:
        // 1.主构造方法: 完成类的初始化
        // 2.辅助构造方法: 在类的初始化后，完成类的辅助功能，属性赋值
        //                        辅助构造方法必须直接或间接地调用主构造方法
        //                        辅助构造方法有重载的概念，但是主构造方法没有
        //                        辅助构造方法采用this关键字声明
        //                        多个辅助构造方法在调用时，需要提前声明

        val user = new User("zhangsan",30)
      }

      class User() {

        println("1111")



        def this( name : String ) = {
          this() // 指类的初始化 调用主构造方法
          println("2222")
        }

        def this( name : String , age : Int ) = {
          this(name) // 调用第一个辅助构造方法 间接调用主构造也可以
          println("3333")
        }

        println("4444")
      }


}



