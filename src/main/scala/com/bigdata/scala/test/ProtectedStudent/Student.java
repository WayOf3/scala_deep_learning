package com.bigdata.scala.test.ProtectedStudent;

public class Student {

    protected String name;

    protected int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
//        Student student = new Student("yuxing",22);
//        System.out.println(student.age);
    }
}
