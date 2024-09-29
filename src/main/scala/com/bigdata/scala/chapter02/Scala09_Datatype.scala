package com.bigdata.scala.chapter02

import java.io.InputStream
import java.net.{ServerSocket, Socket}

// javadoc
object Scala09_Datatype {

  def main(args: Array[String]): Unit = {

    // TODO java的数据类型主要分为2大类:
    // 1.基本数据类型：（不是面向对象）
    // 2.引用数据类型 (面向对象)
    // TODO scala语言是一个完全面向对象的语言
    // 所有的基本数据类型在scala中都有专门的类型
    // byte
    val b : Byte = 10
    val  s :Short = 10
    // int
    val age : Int = 10
    val age1 : Long = 10
    val age2 : Float = 10
    val age3 : Double = 10
    val age4 : Char = 10
    val age5 : Boolean = true

    // TODO Scala中的数据类型也分2大类
    // 1.任意的值类型
    // 对应java的基本数据类型的scala类型都是值类型
    // Unit表示方法没有返回值，只有一个对象:()
    // StringOps :和字符串相关的一个类型
    println(test())


    // 2.任意的引用类型
    // 所有的java类型 ，scala集合，scala类型 都是引用类型
    // 引用类型的取值为空时，一般赋值为null但是null本身也应该有类型Null，也表示有对象
    val name: Null = null

    // 3.Nothing
    // 一般应该于异常处理。
  }

  def test(): Unit = {

  }

  def test1(): Nothing = {
    throw new Exception()
  }

}
