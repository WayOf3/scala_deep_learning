package com.bigdata.scala.chapter06

object Scala12_Object_object {

  def main(args: Array[String]): Unit = {

    // TODO 面向对象编程 -object
    // object 关键字声明的是类，也同时是伴生对象
    // apply方法可以用于构建对象，但是不仅仅用于构建对象
    // apply 方法可以被编译器动态识别，所以可以省略
    val  user1 = new User()  // TODO 此处代码指向的是类的构造方法，完成对象的初始化操作
    println("**************************")
    val user2 = User  // TODO 直接访问类名，其实访问的不是类，而是类的伴生对象
    println("**************************")
    val user3 = User.apply() // TODO apply方法主要应用于构建对象
    println("**************************")
    val user4 = User() // TODO apply方法由于应用场景比较多，所以编译器可以动态识别，所以调用时可以省略

  }

  class User {
    println("user")
  }

  object User {
    def apply(): User = {
      println("user apply...")
      new User()
    }
  }

}
