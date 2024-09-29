package com.bigdata.scala.chapter05

object Scala10_Function_Curry {


  def main(args: Array[String]): Unit = {


    // TODO 函数式编程语言 - 函数柯里化(Curry)
    def test ( a : Int,b: Int) : Unit = {
      for (i <- 1 to a) {
        println(i)
      }

      for ( i <- 1 to b) {
        println(i)
      }
    }


    val a = 10 // 10 min
    val b = 20 // 60 min

    // 函数的参数之间可能没有关系，那么如果在传值的时候，同时传递，其实就有耦合性，而且增加调用的难度
    // 所谓的函数科里化,就是为了将函数简单化，将无关的参数进行分离,可以设定多个参数列表
//    test(10,20)


//    def test1 ( a : Int) (b: Int) : Unit = {
//      for (i <- 1 to a) {
//        println(i)
//      }
//
//      for ( i <- 1 to b) {
//        println(i)
//      }
//    }
//
//    val intToUnit: Int => Unit = test1(10)
//
//    test1(10)(20)

    def outer() = {

      def inner() :Unit = {
        println(" inner...")
      }

      inner _
    }

    val inner: () => Unit = outer()
    inner()
    outer()()







  }




}
