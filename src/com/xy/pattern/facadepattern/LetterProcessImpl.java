package com.xy.pattern.facadepattern;

/**
 * 写信过程的具体实现
 *
 * @author Ying Xiong
 * @date 2017/10/23
 */
public class LetterProcessImpl implements LetterProcess {

    @Override
    public void writeContext(String context) {
        System.out.println("信的内容："+context);
    }

    @Override
    public void fillEnvelope(String envelope) {
        System.out.println("信封的内容:"+envelope);
    }

    @Override
    public void letterIntoEnvelope() {
        System.out.println("把信装进信封");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮寄信件，，，，，，");
    }
}
