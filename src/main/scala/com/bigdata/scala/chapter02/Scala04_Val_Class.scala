package com.bigdata.scala.chapter02

// javadoc
object Scala04_Val_Class {

  def main(args: Array[String]): Unit = {

    // TODO 变量

    // TODO 声明变量


    val email : String = "zhangsan";

    // Scala语言的目的是为了简化代码的开发，让开发程序更加容易
    // Hive => SQL => MR
    // Scala语言中存在一个开发原则，至简原则
    // 能简单则简单，能简洁则简洁
    //    编译器可以帮助我们补充完整
    //    JAVA和scala是一个强类型的语言，所以编译时一定要确定变量的类型，那么变量的取值也就确定了。
    // 如果变量的值确定了，那么变量的类型其实也确定了,所以写程序时，类型可以省略由编译器。
    // TODO 多态不适用这个场合
    var name  = "lisi"
    println(name)



  }

}
