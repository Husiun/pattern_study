package com.xy.pattern.flyweightpattern;

/**
 * pojo类，
 *
 * @author Ying Xiong
 * @date 2017/12/7
 */
public class SignInfo {
    //姓名
    private String name;
    //考试科目
    private String subject;
    //考试地点
    private String location;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
