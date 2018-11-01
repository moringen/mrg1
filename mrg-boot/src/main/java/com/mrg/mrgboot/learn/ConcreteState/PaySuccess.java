package com.mrg.mrgboot.learn.ConcreteState;

/**
 *  状态2 支付成功
 * @author hwakzhao
 * @create 2018-11-01
 **/
public class PaySuccess implements  State {

    static PaySuccess instance = new PaySuccess() ;

    public static PaySuccess getInstance() {
        return instance;
    }

    @Override
    public void handle(Context context) {

        if (context.getCurrent() == this ){

            System.out.println("当前状态变成支付关闭  --3");
            context.setCurrent(PayClose.getInstance());

        }
    }
}
