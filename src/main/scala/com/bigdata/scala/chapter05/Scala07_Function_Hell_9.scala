package com.bigdata.scala.chapter05

object Scala07_Function_Hell_9 {


  def main(args: Array[String]): Unit = {


    // TODO 函数式编程语言 - 地狱版
    def test(f: String => Unit ) : Unit = {
        f("zhangsan")
    }

    def fun( name : String ): Unit = {
        println("Name : " + name )
    }

//    test( fun )

//    test(
//      ( name : String ) => println("Name : " + name )
//
//    )
//
//    test(
//      ( name ) => println("Name : " + name )
//
//    )
//
//    test(
//      name => println("Name : " + name )
//
//    )
//
//    // 参数按照顺序只使用一次，可以使用下滑线代替，但是不能嵌套使用
    // 匿名函数的至简原则的最简版本就是下面的代码
//    test(println(_))

    // 下面的代码根本就不是至简原则
    test(println)




  }




}
