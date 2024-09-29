package com.bigdata.scala.chapter04

object Scala04_for {

  def main(args: Array[String]): Unit = {



      // TODO 循环控制
    // 如果表达式条件成立，那么会执行循环体操作，然后再判断条件,依此类推
    // 循环表达式 {
    //  循环体
    // }

    // 循环控制主要为 for,while
    // TODO for 循环

    /*
      TODO java :
      for( int i = 0; i < array.length;i++) {
          sout(i)
      }

      for ( Object obj : Array ) {
          sout(obj)
      }

      scala :
      for (obj : Object <- Array ) {
          println(obj)
      }

     */

    val array = 1 to 5 // 从1到5 1，2，3，4，5
    val array1 = 1 until  5 // 从1到5 1，2，3，4
    val array2 = Range(1,5)
    for ( i: Int <- array2  ) {
//        println(i)
    }

    // 如果循环的变量的类型可以通过循环判断出来，那么类型可以省略
    for ( i <- array2) {
      println(i)
    }





  }

}
