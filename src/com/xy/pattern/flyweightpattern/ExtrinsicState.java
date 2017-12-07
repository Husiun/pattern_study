package com.xy.pattern.flyweightpattern;

/**
 * 外部条件类
 *
 * @author Ying Xiong
 * @date 2017/12/7
 */
public class ExtrinsicState {
    //科目
    private String subject;
    //地点
    private String location;

    public ExtrinsicState() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    //因为要放入map中，所以这两个方法必须重写
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof ExtrinsicState){
            ExtrinsicState state = (ExtrinsicState)obj;
            return state.getSubject().equals(subject)&&state.getLocation().equals(location);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return subject.hashCode()+location.hashCode();
    }
}
