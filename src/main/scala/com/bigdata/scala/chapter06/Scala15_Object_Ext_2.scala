package com.bigdata.scala.chapter06

import java.lang.reflect.Field

object Scala15_Object_Ext_2 {

  def main(args: Array[String]): Unit = {


    println(Color.RED)
    println(Color.RED.id)


  }

  // 枚举类
  object Color extends Enumeration {
    val RED = Value(1,"red")
    val YELLOW = Value(2,"yellow")
    val BLUE = Value(3,"blue")
  }

}
