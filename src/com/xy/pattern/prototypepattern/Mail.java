package prototypepattern;

/**
 * 邮件对象
 *
 * @author Ying Xiong
 * @date 2018/1/19
 */
public class Mail implements Cloneable{
    /**
     * 属性
     */
    private String receiver;
    private String subject;
    private String appletion;
    private String context;
    private String tail;//末尾


    public Mail(AdvTemplate advTemplate) {
        this.subject = advTemplate.getAdvSubject();
        this.context = advTemplate.getAdvContext();
    }

    //重写Object的clone方法
    @Override
    public Mail clone() {
        Mail mail = null;
        try {
            mail = (Mail)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }

    /**  getter and setter**/
    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppletion() {
        return appletion;
    }

    public void setAppletion(String appletion) {
        this.appletion = appletion;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
