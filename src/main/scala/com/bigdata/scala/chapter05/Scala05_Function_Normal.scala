package com.bigdata.scala.chapter05

object Scala05_Function_Normal {


  def main(args: Array[String]): Unit = {


    // TODO 函数式编程语言 - 普通版
    // TODO 参数的个数
    // 函数的参数是没有限制个数，但是个数越多，传值越麻烦，所以并不推荐使用
    def fun1(
            name1: String,
            name2: String,
            name3: String,
            name4: String,
            name5: String
            ): Unit = {

    }
    // TODO 参数个数的简化: 可变参数，类似于java中参数...
    // 在某些场景中，函数的参数可能不需要传递，也可能需要传递，甚至可能需要传递多个，不确定
    // 可变参数因为不确定，所以底层实现时，会采用不同的数组实现
    def fun2( name:String* ): Unit = {
        println(name)
    }

    fun2()
    fun2("zhangsan")
    fun2("zhangsan","lisi","wangwu")


    // TODO 可变参数的位置 ： 参数列表的最后一项
    // 一个参数列表中不可能有多个可变参数
    def fun3 ( password: Int,name : String* ) : Unit = {

    }

    fun3(10,"zhangsan")






  }




}
