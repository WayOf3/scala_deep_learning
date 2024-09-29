package com.bigdata.scala.chapter04

object Scala03_If_Return_2 {

  def main(args: Array[String]): Unit = {



      // TODO 分支流程
      // Scala中分支流程判断没有 三元运算符号，可以采用if来代替
      // Scala中也没有swith 语法
      // 1.如果表达式中的逻辑代码只有一行，可以省略大括号
      // xxxx ? a : b
      val age = 30
//      val result = if ( age == 30 ) {
//        "30"
//      } else {
//        "other"
//      }

      val result = if ( age == 30 ) "30" else "other"
      println(result)


  }

}
