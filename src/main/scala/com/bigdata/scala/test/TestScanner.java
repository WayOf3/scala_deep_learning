package com.bigdata.scala.test;

import java.util.Scanner;

public class TestScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        if ( age >= 70 ) {
            System.out.println("老人");
        } else if ( age >= 30 ) {
            System.out.println("中年");
        } else if ( age >= 18 ){
            System.out.println("青年");
        } else {
            System.out.println("小孩");
        }
    }
}
