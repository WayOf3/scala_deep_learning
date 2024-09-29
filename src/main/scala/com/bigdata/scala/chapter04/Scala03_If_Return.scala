package com.bigdata.scala.chapter04

object Scala03_If_Return {

  def main(args: Array[String]): Unit = {



      // TODO 分支流程
      // scala中表达式都有返回结果
      // 这里的返回结果其实就是满足条件后的最后一个代码的执行结果
      // 结果的类型是: 所有分支条件返回结果的通用类型
      //    结果的取值是程序运行后才获取的，所有可以明确结果
      //    scala语言是强类型语言，需要在编译时就明确类型的
      //    String + Unit => Any
      val age = 30
//      val result = if ( age == 30 ) {
//        // println("年龄等于30") // 返回结果就是Unit
//        1
//        2
//        "zhangsan"
//      } else {
//        println("年龄不等于30")
//      }

    val result = if ( age == 30 ) {

      "zhangsan"
    } else {
      null
    }
    // java中void表示没有返回值，scala语言采用Unit类型来代替void,只有一个对象，打印后为()
    println(result)



  }

}
