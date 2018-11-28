package com.mrg.mrgboot.learn.receiver;

/**
 * <p>抽象命令接口: 类中对需要执行的操作进行声明, 且包含一个Receiver, 并公布一个execute()方法用来调用Receiver执行命令:</p>
 * @author hwakzhao
 * @create 2018-11-02
 **/
public abstract class Command {

    protected  CookReceiver cookReceiver ;

    public Command(CookReceiver cookReceiver) {
        this.cookReceiver = cookReceiver;
    }

    public abstract  void execute();

}
