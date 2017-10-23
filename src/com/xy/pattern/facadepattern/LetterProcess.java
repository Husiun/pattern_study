package com.xy.pattern.facadepattern;

/**
 * 模拟写信的过程，学习门面设计模式，定义一个写信过程的接口
 *
 * @author Ying Xiong
 * @date 2017/10/23
 */
public interface LetterProcess {
    //首先写信的内容
    void writeContext(String context);
    //写信封的内容
    void fillEnvelope(String envelope);
    //将信装进信封
    void letterIntoEnvelope();
    //邮寄信
    void sendLetter();
}
