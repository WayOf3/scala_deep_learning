package com.bigdata.scala.chapter02

// javadoc
object Scala02_Var {

  def main(args: Array[String]): Unit = {

    // TODO 变量
    // Scala中声明变量需要采用特殊的方式
    // java => 变量类型 变量名称 = 变量值
    // String name = "zhangsan"
    // TODO 声明变量
    // Scala 中声明变量需要采用特殊的方式
    //      1.采用var val关键字来声明
    //      2.变量名称应该放置在变量类型之前
    //      3.变量名和变量类型之间采用冒号分隔
    //      4.scala中变量必须显示地初始化
    var name : String = "zhangsan";
    val email : String = "zhangsan";

    // TODO 使用(访问) 变量
    println(name)
    println(email)



  }

}
