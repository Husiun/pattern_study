package com.xy.pattern.commandpattern;

/**
 * 客户类
 *
 * @author Ying Xiong
 * @date 2017/12/13
 */
public class Client {
    public static void main(String[] args) {
        //客户下达命令
        Command command = new PageAddCommand();
        //接头人拿到命令
        Invoker invoker = new Invoker();
        //接头人内部分配并要求内部人员执行
        invoker.setCommand(command);
        invoker.action();
    }

    /**
     * 命令模式使得命令有条的进行着，总是从客户到接头人再内部执行
     * 如果新增命令，那么新加类去继承command就好，
     * 但是这样也有一个缺点，如果有很多命令的时候，类就会很多，系统会变得臃肿，不易维护
     */
}
