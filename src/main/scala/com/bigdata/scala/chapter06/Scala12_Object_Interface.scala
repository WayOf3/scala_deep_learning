package com.bigdata.scala.chapter06

object Scala12_Object_Interface {

  def main(args: Array[String]): Unit = {

    // TODO 面向对象编程 - 接口
    // interface在java中表示接口
    // 什么是接口?
    // scala中没有接口的概念
    // scala可以将多个对象中相同的特征从对象中剥离出来，形成一个独立的语法结构
    // 称之为特质，如果一个对象符合这个特征(特质),那么可以将特质混入到这个对象

    // 向类中混入特质，有2种方式
    // 1.如果存在父类，那么采用with
    // 2.如果没有父类，那么可以采用extends来混入，
    //    如果需要混入多个特质，那么第一个采用extends,后面都采用with
    val cat = new Cat()
    cat.run()

    // TODO 特质的本质是接口，编译后的字节码就是interface

  }

  // 特质
  trait Run {
    def run() :Unit
  }
  class Cat extends Run {

    override def run(): Unit = {
        println("cat run...")
    }

  }

  class Person {

  }

  class User extends Person with Run {

    override def run(): Unit = {
      println("user run...")
    }


  }


}
