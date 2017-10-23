package com.xy.pattern.facadepattern;



/**
 * 需要写信邮寄的客户
 *
 * @author Ying Xiong
 * @date 2017/10/23
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("@@@@@@@@@@@@@@@@@@@@没有门面类@@@@@@@@@@@@@@@@@@@");
        /**
         * 现在有一个需要写信邮寄的人，那么他写一封信必须清楚寄信的四个过程，缺一不可，而且顺序也不能乱
         */
        //创建写信过程的对象
        LetterProcess letterProcess = new LetterProcessImpl();
        //四个过程缺一不可的执行，才能顺利的把写好的信邮寄出去
        letterProcess.writeContext("hello,are you ok");
        letterProcess.fillEnvelope("beijing fengtai 000088");
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();


        System.out.println("@@@@@@@@@@@@@@@@@@@@@门面类出现@@@@@@@@@@@@@@@@@@@@@@@@@");
        /**
         * 门面类出现，将写信的具体过程封装起来
         * 客户只需要提供信件内容和地址即可
         */
        //新建一个门面类
        ModenPostOffice modenPostOffice = new ModenPostOffice();
        String context = "my love,are you fine ,i miss you very";
        String envelope = "bijie,guizhou china";
        modenPostOffice.sendLetter(context,envelope);
        System.out.println("写信就是这么easy");

    }
}
