package prototypepattern;

/**
 * 定义邮件标题和邮件内容
 *
 * @author Ying Xiong
 * @date 2018/1/19
 */
public class AdvTemplate {

    private String advSubject = "xx银行信用卡节日刷卡活动";
    private String advContext = "尊敬的用户：节日期间只要刷卡就返回现金";

    public String getAdvContext() {
        return advContext;
    }

    public String getAdvSubject() {
        return advSubject;
    }
}
