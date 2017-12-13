package com.xy.pattern.commandpattern;

/**
 * 接头人
 *
 * @author Ying Xiong
 * @date 2017/12/13
 */
public class Invoker {
    /**
     * 接头人，以前是客户深入咱们的各个小组去，但是这样费时费力，还不讨好
     * 那么咱们就有个接头人跟客户打交道（一般项目经理），接收客户的命令
     * 至于怎么执行命令客户不知道，这也体现了开发中的高内聚思想
     */
    //持有命令
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    //执行客户命令
    public void action(){
        this.command.excute();
    }
}
