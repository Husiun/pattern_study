package com.xy.pattern.visitorpattern;

/**
 * 抽象类，员工类
 * 抽象元素，通过定义accept方法决定哪些访问元素进行访问
 * @author Ying Xiong
 * @date 2017/10/26
 */
public abstract class Employee {
    //0表示男性  1表示女性
    public static final int MALE = 0;
    public static final int FEMALE = 1;
    //fields
    //员工姓名
    private String name;
    //员工工资
    private int salary;
    //员工性别
    private int sex;

    /**************getter and setter**************************/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    /**
     * 抽象节点定义接受访问者访问方法，将访问者作为参数，就像家里邀请
     * 客人一样
     * @param visitor
     */
    //定义抽象方法，允许访问者过来访问
    public abstract void accept(IVisitor visitor);
}
