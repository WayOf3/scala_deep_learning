package com.bigdata.scala.chapter06

object Scala14_Object_Trait_2 {

  def main(args: Array[String]): Unit = {

    // TODO 面向对象编程 - 特征的初始化顺序

    // trait 可以在构建对象时，将新的功能混入(添加)到对象中
    //      Trait > current Class
    // 1.将trait理解为抽象类，所以trait的初始化顺序应该由于当前类
      val user = new User()
    // 2.如果类同时有父类和特质，那么父类的初始化优先
    //    Parent Class > Trait > current Class
    // 3.如果类同时有多个特质
    //    从左到右依次初始化
    // 4.如果父类和子类同时有Trait
    //    Parent Trait > Parent Class  > Current Trait > Current Class
    // 5.在同一个构建过程中，初始化只会执行一次。

  }

  trait MyTrait {
    println("1111")
  }


  trait MyTrait1 {
    println("2222")
  }

  class Parent extends MyTrait1 {
    println("3333")
  }


  class User extends Parent with MyTrait with MyTrait1 {
    println("4444")
  }

  // 2
  // 3
  // 1
  // 2
  // 4



}
