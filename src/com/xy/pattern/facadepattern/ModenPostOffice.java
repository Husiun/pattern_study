package com.xy.pattern.facadepattern;

/**
 * 开发一个邮局类，他封装了写信邮寄的四个过程，
 * 需要客户做的只是把写信的内容，和信封的内容告诉他就行
 *
 * @author Ying Xiong
 * @date 2017/10/23
 */
public class ModenPostOffice {
    //写信过程对象
    private LetterProcess letterProcess = new LetterProcessImpl();

    /**
     * 将写信寄信的具体四个过程封装起来
     * @param context 信的内容
     * @param envelope 信封的内容
     */
    public void sendLetter(String context,String envelope){
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(envelope);
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }
}
