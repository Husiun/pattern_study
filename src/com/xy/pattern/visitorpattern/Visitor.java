package com.xy.pattern.visitorpattern;

/**
 * 访问者 具体实现类
 * 具体访问者，通过实现方法定义具体访问以后干的事情
 *
 * @author Ying Xiong
 * @date 2017/10/26
 */
public class Visitor implements IVisitor {
    //访问普通员工
    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployeeInfo(commonEmployee));
    }

    //访问经理
    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
    }

    //组装基本信息
    private String getBasicInfo(Employee employee){
        String info = "姓名："+employee.getName()+"\t";
        info += "性别："+(employee.getSex()==Employee.FEMALE?"女":"男")+"\t";
        info += "薪资："+employee.getSalary()+"\t";
        return info;
    }

    //组装普通员工信息
    private String getCommonEmployeeInfo(CommonEmployee commonEmployee){
        String basicInfo = getBasicInfo(commonEmployee);
        String commonInfo = "工作："+commonEmployee.getJob();
        return basicInfo+commonInfo;
    }

    //组装经理信息
    private String getManagerInfo(Manager manager){
        String basicInfo = getBasicInfo(manager);
        String managerInfo = "业绩："+manager.getPerformance();
        return basicInfo+managerInfo;
    }
}
