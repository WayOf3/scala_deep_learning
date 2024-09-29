package com.bigdata.scala.chapter04

object Scala03_If_Return_1 {

  def main(args: Array[String]): Unit = {



      // TODO 分支流程
      val age = 30
      val result: Any = if (age == 30) {
        1
      } else {
        "zhangsan"
      }
      // Any类型的数据无法进行数据增加
//      println(result + 1)



  }

}
