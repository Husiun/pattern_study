package compositepattern.improve;

/**
 * 抽象类
 *
 * @author Ying Xiong
 * @date 2018/1/17
 */
public abstract class Corp {
    /**
     * 抽象出枝和叶共有的地方
     */
    private String name = "";
    private String position = "";
    private int salary = 0;
    public Corp(String _name,String _position,int _salary){
        this.name=_name;
        this.position=_position;
        this.salary=_salary;
    }

    public String getInfo(){
        StringBuilder info = new StringBuilder();
        info.append("姓名:"+name).append("职位:"+position).append("薪水："+salary);
        return info.toString();
    }
}
