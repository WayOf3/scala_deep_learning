package com.bigdata.scala.chapter06

import com.bigdata.scala.chapter06.Scala06_Object_Access.Student

object Scala010_Object_Extends {

      def main(args: Array[String]): Unit = {


        /*
        ‌单继承确实指的是一个类只能直接继承自一个父类‌。
        这种继承方式是最简单和最常见的，旨在保持代码的简单性和可维护性。单继承不支持多继承，
        即一个子类不能同时继承多个父类，但支持多层继承，意味着一个类可以继承自另一个类，
        而那个类又可以继承自另一个类，以此类推。这种结构有助于组织复杂的类层次结构，使得代码更加清晰和易于管理‌
         */
        // TODO 面向对象编程 - 继承
        // scala的继承和java是一致的：父子类
        // 1.存在父子类
        // 2.主要目的是为了复用功能和属性
        // scala中类的继承和java的继承是一样的，也是单继承，不能多继承，因为会产生歧义。
        // 这种由于多继承所产生的歧义，称之为【钻石问题】
        // 4.构造对象时，父类对象优于子类对象构建。
        // 5.如果父类的构造方法存在参数，那么需要显示地调用父类地构造方法并传参数
//            val s = new Student( 20 )
//            val t = new Teacher()
        // 6.构造方法存在访问权限，可以设定为私有的,需要在参数列表(主构造函数)的前面增加private关键字
        //    如果类构造方法私有化，那么如何构建对象
        //    6.1.辅助构造方法可以使用
        //    6.2.采用伴生对象可以访问伴生类的私有内容


        // TODO 1.当构造方法私有化， 通过辅助构造方法构建对象  实际上辅助构造方法是对主构造方法的重载 需要参数个数或者类型不一样 apply方法则没有限制
        // var p = new Person(20,"alice")


        // TODO 2.通过伴生对象apply方法构建对象
        var p  = Person.apply(20)
        // var p  = Person(20)
      }


       class Person private ( var age : Int ) { // 主构造方法
            var name : String = _
            println("person")

         // 辅助构造方法
//          def this( age :Int,name:String ) = {
//
//            this(age) // 调用主构造函数
//            this.age = age
//
//          }


      }

//      class Student ( age : Int ) extends Person ( age ) { // 子类地构造参数传给父类
//            println("student")
//      }
//
//      class Teacher extends Person ( 30 ) {
//            println("teacher...")
//      }

      object Person {
            def apply(age: Int): Person = new Person(age)

      }




}



