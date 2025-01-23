package com.bigdata.scala.chapter06



object Scala14_Object_Trait_1 {

  def main(args: Array[String]): Unit = {

    // TODO 面向对象编程 - 特质
    // 1.java中所有的接口在scala中使用，都是当成特质来用的
    // 2.特质的用法

    // TODO 开发程序一般要遵循相应的开发规则(原则)
    // OCP原则： OpenClose
    // 开发程序代码时，应该对功能的扩展开放(Open)
    // 开发程序代码时，应该对功能的修改关闭(Close)

    // trait 可以在构建对象时，将新的功能混入(添加)到对象中
    val user = new User() with Update
    user.insertUser()
    user.updateUser()

  }

  // sql = "select * from user"

//  class Parent {
//        def  updateUser(): Unit = {
//          println("update user...")
//        }
//  }

  trait Update {
      def  updateUser(): Unit = {
        println("update user...")
      }
  }
  class User  {
    def  insertUser(): Unit = {
        println("insert user...")
    }

//    def  updateUser(): Unit = {
//      println("update user...")
//    }

  }



}
