package com.mrg.mrgboot.learn.ConcreteState;

/**
 *  状态1  待支付
 * @author hwakzhao
 * @create 2018-11-01
 **/
public class PayWait implements  State{

    static final PayWait instance = new PayWait() ;

    public static  PayWait getInstance(){
        System.out.println("当前状态 待支付  --1" );
        return instance ;
    }

    @Override
    public void handle(Context context) {

        if (context.getCurrent() == this){
            System.out.println("当前状态变成支付成功  --2" );
            context.setCurrent(PaySuccess.getInstance());
        }

    }
}
