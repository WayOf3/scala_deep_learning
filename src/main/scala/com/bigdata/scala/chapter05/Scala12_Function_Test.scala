package com.bigdata.scala.chapter05

object Scala12_Function_Test {


  def main(args: Array[String]): Unit = {









    def fun (x : Int,y : Int) : Int =  {
      x + y
    }

    def test( x : Int,y : Int, fun : (Int,Int) => Int ): Int = {
      fun(x,y)
    }

     def fun1(name:String) : String =  {
       name.substring(0,1)
     }

    def test1(fun1: String => String) : String = {
      fun1("zhangsan")
    }


    def fun2( x : Int ) : Int =  {
      x * 2
    }

    def test2( fun2: Int => Int) : Int =  {
      fun2(4)
    }


    // TODO 将简化版本的函数式编程代码恢复成完整代码
   // x => x.substring(0,1)
    println(test(10,20, fun ))

//    println(test1(_.substring(0,1)))
    println( test1( fun1 ))

//    println( test2( _ * 2) )

    println( test2( fun2 ) )

    // TODO Scala中字符串也有乘法能力(重复拼接在一块)
    val name = "zhangsan"
    val newName = name * 2
    println(newName)

    // 使用一个for循环实现九层妖塔



    // TODO 控制抽象可以实现自定义语法
//    while ( 条件表达式 ) {
//      循环体
//    }

    def myWhile (cond : => Boolean)( op : => Unit): Unit = {
      if (cond) {
        op
        myWhile(cond)(op)
      }
    }

    val age = 30
    myWhile ( age == 30 ) {
      println("age = 30")
    }











  }




}
