package com.bigdata.scala.chapter04

object Scala04_for_2 {

  def main(args: Array[String]): Unit = {



      // TODO 循环控制
    // TODO 循环返回值 : Unit
//    val result = for (i <- 1 to 3) {
//      i
//    }
//
//    println(result)

    // TODO 如果想要将集合中的数据进行处理后返回，可以采用特殊的关键字 : yield
//    val result = for ( i <- 1 to 3) {
//        i * 2
//    }
//
//    println(result )

    // TODO java中线程对象有yield方法，在scala中如何调用 ``
//    Thread.`yield`()

    // 九层妖塔
    for ( i <- 1 to 9 ) {
      print( s"${" " * (9 - i)}"  )
      print( s"${"*" * (2 * i - 1)}")
      print( s"${" " * (9 - i)}")
      println()
    }









  }

}
