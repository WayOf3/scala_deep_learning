package com.bigdata.scala.test.SalaryManage;

import java.util.Calendar;


/**
 * 设计一个所有员工的总父类Employee，具有姓名，生日的属性,具有根据生日月份确定工资一个方法
 */

public abstract class Employee {
    private String name; // 姓名

    private int month; // 生日月份



    // 构造方法
    public Employee(String name,int month) {
        this.name = name;
        this.month = month;
    }


    // set和get方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }



    // 抽象方法只有声明没有实现。需要注意的是 abstract 关键字只能用于普通方法，不能用于 static
    public abstract double getSalary();

    public double getSalaryByBirth() {
        // 日历类实例
        Calendar calendar = Calendar.getInstance();
        int currentMonth = calendar.get(Calendar.MONTH) + 1; // 默认0-11

        return this.month == currentMonth ? 100:0;

    }


}
