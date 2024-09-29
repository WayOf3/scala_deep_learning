package com.bigdata.scala.chapter05

object Scala07_Function_Hell_5 {


  def main(args: Array[String]): Unit = {


    // TODO 函数式编程语言 - 地狱版

    // 如果函数的名称不重要，那么在传参时，就可以省略函数名称
//    def test( f: (Int,Int) => Int  ) :Unit = {
//      val result = f(10,20)
//      println(result)
//    }

//    def sum(x : Int,y:Int) : Int = {
//      x + y
//    }

    // test(sum)

    // 如果函数没有名称和def,那么是匿名函数，一般就是作为参数使用
//    test(
//      (x : Int,y:Int) => {
//        x + y
//      }
//    )

    // TODO 匿名函数作为参数使用时，可以采用【至简原则】
    // 1.匿名函数的逻辑代码只有一行,那么大括号可以省略
//    test(
//      (x : Int,y:Int) => x + y
//
//    )

    // 2.匿名函数的参数类型可以推断出来，那么参数；类型可以省略
//    test(
//      ( x ,y )  => x + y
//
//    )

    // 3.匿名函数中如果参数列表的个数只有一个，那么小括号可以省略
    // 4.匿名函数中如果参数按照顺序只执行一次的场合，那么可以使用下划线代替参数，省略参数列表和箭头

    // test(_ - _)
    // 这里的第一个下划线就表示第一个参数，依此类推，数值表示任意

    def test( f: (String) => Unit  ) :Unit = {
      f("zhangsan")
    }
//
//    def fun(name :String) : Unit = {
//      println(name)
//    }
//
//    test(
//      (name :String) => {
//        println(name)
//      }
//    )
//
//    test(
//      (name :String) => println(name)
//    )
//
//    test(
//      (name) => println(name)
//    )
//
//    test(
//      name => println(name)
//    )

    test(println(_))








  }




}
