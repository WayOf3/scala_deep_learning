package com.bigdata.scala.chapter04

object Scala01_Flow {

  def main(args: Array[String]): Unit = {

      // TODO 默认情况下，程序流程为顺序执行
      // 前面的代码执行完毕后，才能执行后续的代码

      // TODO 分支流程
      // 语法上使用if进行流程的分支处理(判断)
      // if关键字可以独立使用，称之为单分支
      val age = 40
//      if ( age == 30 ) {
//        println("年龄等于30")
//      }
//
//      println("年龄不等于30")

    // if关键字可以和else联合使用，称之为双分支
//    if ( age == 30 ) {
//      println("年龄等于30")
//    } else {
//      println("年龄不等于30")
//    }
    // if关键字可以和elseif联合使用，称之为多分支
    if ( age < 16) {
      println("少年")
    } else if ( age < 30) {
      println("青年")
    } else if ( age < 45 ) {
      println("壮年")
    } else if ( age < 60 ){
      println("中年")
    } else {
      println("老年")
    }


  }

}
