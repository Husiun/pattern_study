package prototypepattern;

import java.util.Random;

/**
 * 测试类
 *
 * @author Ying Xiong
 * @date 2018/1/19
 */
public class Client {
    //最大发送量
    private final static int MAX_SEND = 6;
    public static void main(String[] args) {
        int i = 0;
       Mail mail = new Mail(new AdvTemplate());
        //共同的部分
        mail.setTail("最终解释权归xx银行所有");
        //产生邮件的不同部分
        while(i < MAX_SEND){
            Mail cloneMail = mail.clone();
            //称谓
            cloneMail.setAppletion(getRandomString(5)+"先生(女士)");
            cloneMail.setReceiver(getRandomString(5)+"@"+getRandomString(3)+".com");
            sendMail(cloneMail);
            i++;
        }
    }

    private static void sendMail(Mail mail){
        System.out.println("发送给"+mail.getReceiver()+"主题为"+mail.getSubject()+"的邮件，发送成功.....");
    }

    private static String getRandomString(int maxlength){
        String string = "qwertyuioiuytrewertyjdfghjhgfdasBNBCVHJHGFDFGHEsdfghgdfgSDFGFVzxcvbnbcjhgfdiuytrsdfff";
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0;i < maxlength;i ++){
            stringBuilder.append(string.charAt(random.nextInt(string.length())));
        }
        return stringBuilder.toString();
    }
}
