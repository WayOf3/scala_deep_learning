package com.bigdata.scala.chapter02

// javadoc
object Scala05_Name {

  def main(args: Array[String]): Unit = {

    // TODO 标识符

    // 一般情况下，所谓的标识符就是起名
    // 类名，对象名，属性名，方法名，参数名
    // java中标识符有规则
    // 1.数字，字母，下划线，美元符号
    // 2.数字不能开头
    // 3.长度没用限制
    // 4.不能是关键字和保留字
    // 5.区分大小写
    // 6.可以转换为unicode编码的文字都可以声明为标识符
    // 中文?， 日文?， 韩文?
    // scala中标识符基本规则和java一致

    val name  = "zhangsan"
    val namee1  = "zhangsan"
    val name_e1  = "zhangsan"
    val name$e1  = "zhangsan"
    // 如果非要使用和关键字
    val `private`  = "zhangsan"
    println(`private`)
    val Private = "zhangsan"



  }

}
