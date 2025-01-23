package com.bigdata.scala.test.SalaryManage;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("请输入拿固定工资的人数:");
        int number1=sc.nextInt();
        //创建一个数组，保存number1个固定工资的人数
        SalariedEmployee[] salariedemployee=new SalariedEmployee[number1];

        System.out.println("请输入拿无固定底薪的人数:");
        int number2=sc.nextInt();
        SalesEmployee[] salesEmployee=new SalesEmployee[number2];

        System.out.println("请输入拿有固定底薪的人数:");
        int number3=sc.nextInt();
        BasePlusSalesEmployee[] basePlusSalesEmployee=new BasePlusSalesEmployee[number3];

        System.out.println("请输入打小时工的人数:");
        int number4=sc.nextInt();
        HourlyEmployee[] hourlyEmployee=new HourlyEmployee[number4];

        int type;
        do {

            System.out.println("***欢迎使用员工工资管理系统****");
            System.out.println("**************************");
            System.out.println("0-退出         1-固定工资员工");
            System.out.println("2-无固定底薪    3-有固定底薪");
            System.out.println("4-小时工       5-打印工资表 ");


            System.out.println("请输入选项:");
            type=sc.nextInt();
            switch (type) {
                case 1:
                    for (int i = 0; i < salariedemployee.length; ++i) {
                        System.out.println("请输入第"+(i+1)+"个员工姓名:");
                        String name = sc.next();
                        System.out.println("请输入第"+(i+1)+"个员工出生月份:");
                        int month = sc.nextInt();
                        System.out.println("请输入第"+(i+1)+"个员工月薪:");
                        double monthSalary = sc.nextDouble();
                        SalariedEmployee salariedemployees = new SalariedEmployee(name, month, monthSalary);
                        salariedemployee[i] = salariedemployees;
                    }
                    break;
                case 2:
                    for (int i = 0; i < salesEmployee.length; ++i) {
                        System.out.println("请输入第"+(i+1)+"个员工姓名:");
                        String name = sc.next();
                        System.out.println("请输入第"+(i+1)+"个员工出生月份:");
                        int month = sc.nextInt();
                        System.out.println("请输入第"+(i+1)+"个员工销售额:");
                        int sales = sc.nextInt();
                        SalesEmployee salesEmployees = new SalesEmployee(name, month, sales);
                        salesEmployee[i] = salesEmployees;
                    }
                    break;
                case 3:
                    for (int i = 0; i < basePlusSalesEmployee.length; ++i) {
                        System.out.println("请输入第"+(i+1)+"个员工姓名:");
                        String name = sc.next();
                        System.out.println("请输入第"+(i+1)+"个员工出生月份:");
                        int month = sc.nextInt();
                        System.out.println("请输入第"+(i+1)+"个员工销售额:");
                        int sales = sc.nextInt();
                        System.out.println("请输入第"+(i+1)+"个员工底薪:");
                        int salarlies = sc.nextInt();
                        BasePlusSalesEmployee basePlusSalesEmployees = new BasePlusSalesEmployee(name, month, sales, salarlies);
                        basePlusSalesEmployee[i] = basePlusSalesEmployees;
                    }
                    break;
                case 4:
                    for (int i = 0; i < hourlyEmployee.length; ++i) {
                        System.out.println("请输入第"+(i+1)+"个员工姓名:");
                        String name = sc.next();
                        System.out.println("请输入第"+(i+1)+"个员工出生月份:");
                        int month = sc.nextInt();
                        System.out.println("请输入第"+(i+1)+"个员工每月工作时长(h):");
                        int timemonth = sc.nextInt();
                        System.out.println("请输入第"+(i+1)+"个员工每小时时薪:");
                        int timesalaries = sc.nextInt();
                        HourlyEmployee hourlyEmployees = new HourlyEmployee(name, month, timesalaries, timemonth);
                        hourlyEmployee[i] = hourlyEmployees;
                    }
                    break;
                case 5:
                    for (int i = 0; i < salariedemployee.length; ++i) {
                        System.out.println("员工姓名:" + salariedemployee[i].getName() + "\t\t" + "员工薪资:" + salariedemployee[i].getSalary());
                    }
                    for (int i = 0; i < salesEmployee.length; ++i) {
                        System.out.println("员工姓名:" + salesEmployee[i].getName() + "\t\t" + "员工薪资:" + salesEmployee[i].getSalary());
                    }
                    for (int i = 0; i < basePlusSalesEmployee.length; ++i) {
                        System.out.println("员工姓名:" + basePlusSalesEmployee[i].getName() + "\t\t" + "员工薪资:" + basePlusSalesEmployee[i].getSalary());
                    }
                    for (int i = 0; i < hourlyEmployee.length; ++i){
                        System.out.println("员工姓名:" + hourlyEmployee[i].getName() + "\t\t" + "员工薪资:" + hourlyEmployee[i].getSalary());
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("您的输入有误!请重新输入");
            }

        }while(type!=0);

    }
}
