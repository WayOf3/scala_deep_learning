package com.bigdata.scala.chapter06

object Scala011_Object_Abstract {

      def main(args: Array[String]): Unit = {



        // TODO 面向对象编程 - 抽象
        // 不完整的东西就可以理解为抽象的
        // 抽象方法:不完整的方法
        // 抽象类: 不完整的类
        // 因为类中包含方法，如果方法不完整，那么类也就不完整，那么类就是抽象类
        // 抽象类前面需要增加abstract
        // 既然类是不完整的，所以无法直接构建对象
        // 如果想要构建对象，需要子类继承后补充完整再构建
        val user = new ChildUser()
//        val user1 = new User()



      }

      abstract class  User{

        // TODO 不完整的方法(只有声明，没有实现)，称之为抽象方法
        def test() :Unit

      }

      class ChildUser extends User {
        def test(): Unit = {

        }
      }



}



