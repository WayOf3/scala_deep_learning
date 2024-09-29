package com.bigdata.scala.chapter02

// javadoc
object Scala05_Name_1 {

  def main(args: Array[String]): Unit = {

    // TODO 标识符

    // 因为scala是一个完全面向函数式变长语言，所以可以声明特殊符号作为标识符
    // 使用特殊符号作为Scala的标识符合，规则不要记，错了改就完了
    // 如果非要想记，常用在代码中的符号不要用 : = () [] '' ""
    val * = "zhangsan"
    val + = "zhangsan"
    val - = "zhangsan"
    val / = "zhangsan"
    val % = "zhangsan"
    val @@ = "zhangsan"
    val ## = "zhangsan"

    // TODO 如果采用特殊符号形成特殊的文字 标识特殊的含义 称之为颜文字
    // 本质上特殊符号在编译后会被编译器进行转换，所以可以使用
    // 一般情况下，标识符不推荐使用$开头
    val  :-> =  "zhangsan"
//    val  $colon$minus$greater = "zhangsan"
    val  :-----> =  "zhangsan"

    println(:->)



    // TODO Scala中的关键字和保留字和java有区别

  }

}
