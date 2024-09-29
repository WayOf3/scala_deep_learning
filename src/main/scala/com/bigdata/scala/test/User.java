package com.bigdata.scala.test;

public class User {

    public User() {


    }

    public User( String name ) {
        this.name = name;
    }
    public String name;
    public static int age ;
    public static void test() {

    }
    static {
        age = 30;
        System.out.println("user...");
    }


}
