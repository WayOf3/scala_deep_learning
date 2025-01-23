package com.bigdata.scala.test.SalaryManage;

import java.util.Calendar;

/**
 * HourlyEmployee是Employee的子类， 独立的属性：每小时的工资数，每月工作的小时数
 */
public class HourlyEmployee extends Employee{

    // 每小时工资
    private double perHourSalary;

    // 每月工作小时数
    private int workHoursMonth;


    public double getPerHourSalary() {
        return perHourSalary;
    }

    public void setPerHourSalary(double perHourSalary) {
        this.perHourSalary = perHourSalary;
    }

    public int getWorkHoursMonth() {
        return workHoursMonth;
    }

    public void setWorkHoursMonth(int workHoursMonth) {
        this.workHoursMonth = workHoursMonth;
    }

    public HourlyEmployee(String name, int month, double perHourSalary , int workHoursMonth) {
        super(name, month); // 调用父类构造方法
        this.perHourSalary = perHourSalary;
        this.workHoursMonth = workHoursMonth;
    }


    // 按⼩时拿⼯资的员⼯，每⽉⼯作超出160⼩时的部分按照1.5倍⼯资发放
    // 计算工资方法
    // 每月工作超出160小时的部分按照1.5倍工资发放
    @Override
    public double getSalary() {


        if ( this.getWorkHoursMonth() < 160 && this.getWorkHoursMonth() > 0 ){

            return this.getPerHourSalary() * this.getWorkHoursMonth() + this.getSalaryByBirth();

        } else {
            return this.getPerHourSalary() * 160 + 1.5 * this.getPerHourSalary() * (this.getWorkHoursMonth() - 160)   + this.getSalaryByBirth();
        }

    }
}
