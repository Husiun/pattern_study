package com.xy.pattern.visitorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试类
 *
 * @author Ying Xiong
 * @date 2017/10/26
 */
public class Client {
    public static void main(String[] args) {
        for (Employee employee:mockEmployee()) {
            employee.accept(new Visitor());
        }
    }

    //产生员工或者经理
    //在设计模式中定义为结构对象角色，由容器组成，
    public static List<Employee> mockEmployee(){
        List<Employee> employeeList = new ArrayList<Employee>();
        CommonEmployee commonEmployee1 = new CommonEmployee();
        commonEmployee1.setName("张三");
        commonEmployee1.setSex(1);
        commonEmployee1.setSalary(1800);
        commonEmployee1.setJob("酷币的工作，没有足够的money");
        employeeList.add(commonEmployee1);
        //员工2
        CommonEmployee commonEmployee2 = new CommonEmployee();
        commonEmployee2.setName("李四");
        commonEmployee2.setSex(0);
        commonEmployee2.setSalary(2000);
        commonEmployee2.setJob("也是酷币，，，，");
        employeeList.add(commonEmployee2);
        Manager manager = new Manager();
        manager.setName("王麻子");
        manager.setSex(1);
        manager.setSalary(6000);
        manager.setPerformance("就是要业绩，，，，");
        employeeList.add(manager);
        return employeeList;
    }
}
