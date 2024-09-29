package com.bigdata.scala.chapter06


object Scala03_Object_Import_Object {

      def main(args: Array[String]): Unit = {
        // TODO 面向对象编程
        // 引入对象
        // println方法 我们从来就没有声明过，但是可以直接调用
        // scala中默认导入Predef对象,类似于静态导入
        // 但是scala中使用object声明的对象其实模拟静态语法。但是本质上是一个对象
        //所有这里其实就是导入对象
        // Predef.println("zhangsan")

        // 导入对象的所有内容
        // 这里的导入对象必须使用val声明
        val user = new User()
        import user._
        test()
        test()
        test()
        test()

      }


}

class User {
  def test(): Unit = {
    println("user test...")
  }
}




