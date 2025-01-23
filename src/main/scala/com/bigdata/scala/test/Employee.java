package com.bigdata.scala.test;

import java.time.LocalDate;  // 包导入类

// 静态导入 如果想使用某个类的静态方法或者静态域 可以使用 import static 关键字
import static java.lang.System.*;

public class Employee {

    // 姓名
    private String name;

    // 薪资
    private Double salary;


    // 入职日期
    private LocalDate hireDay;

    // 是否离职
    private Boolean active;

    // 如果不定义构造器，Java会默认添加一个无参构造器
    // 如果定义构造器，Java会默认添加的一个无参构造器会失效

    public Employee (String name,Double salary,int year,int month,int day, Boolean active) {

        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year,month,day);
        this.active = active;

    }


    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public Boolean getActive() {
        return active;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void addSalary(Double salary) {
        this.salary += salary;

    }

    public static void main(String[] args) {


        Employee employee = new Employee("yuxing",50000.0,2024, 10, 7,true);
        System.out.println(employee);
        System.out.println(employee.getName());


        employee.setName("yuxing2");
        System.out.println(employee.getName());

        employee.addSalary(10000.0);
        System.out.println(employee.getSalary());


        out.println("Hello");

    }


}
