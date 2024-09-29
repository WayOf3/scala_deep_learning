package com.bigdata.scala.chapter05

object Scala07_Function_Hell_3 {


  def main(args: Array[String]): Unit = {


    // TODO 函数式编程语言 - 地狱版

    /*
    TODO java :
    public void test( User user ) {
      User.xxx();
    }

    User user = new User();
    test(user)

    test(new User())


     */
    // TODO 将函数对象作为参数使用
    def fun() : Unit = {
      println("test...")
    }

    def test( f : () => Unit ) : Unit = {
      f()
    }

    val f = fun _
    val f1 : () => Unit = fun
    test(f)

  }




}
