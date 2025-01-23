package com.bigdata.scala.test.ProtectedStudent02;

import com.bigdata.scala.test.ProtectedStudent.Student;

public class Main extends Student{

    public Main(String name, int age) {
        super(name, age);
    }

    public int getAge2() {
        return super.age;
    }

    public static void main(String[] args) {

        Student student = new Student("yuxing",22);
        System.out.println(student.getAge());

        Main s = new Main("yuxing",22);
        int age2 = s.getAge2();
        System.out.println(age2);


    }
}
