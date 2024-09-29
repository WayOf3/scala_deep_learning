package com.bigdata.scala.chapter04

object Scala04_for_1 {

  def main(args: Array[String]): Unit = {



      // TODO 循环控制
    val array = 1 to 5 // 从1到5 1，2，3，4，5
    val array1 = 1 to 5 by 2
    val array2 = Range(1,5,2)


    // TODO 循环守卫 : 循环表达式中添加逻辑判断
//    for ( i <- array if i != 3) {
//      println(i)
//    }

    // TODO 循环步长，表示循环的增长幅度，默认幅度为1
//    for ( i <- array2 ) {
//      println(i)
//    }

    // TODO 循环嵌套
//    for ( i <- 1 to 3 ) {
//        for ( j <- 1 to 3) {
//            println("i = " + i + ", j = " + j)
//        }
//    }

    for ( i <- Range(1,5); j <- Range(1,4)) {
//      println("i = " +  i + ",j ="  + j)
    }

    // TODO 引入变量
//    for ( i <- 1 to 3) {
//      val j = i - 1
//      println(j)
//    }

        for ( i <- 1 to 3; j = i - 1) {
          println(j)
        }






  }

}
