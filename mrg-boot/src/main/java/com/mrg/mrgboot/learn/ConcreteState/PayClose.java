package com.mrg.mrgboot.learn.ConcreteState;

/**
 *  状态3  支付关闭
 * @author hwakzhao
 * @create 2018-11-01
 **/
public class PayClose implements  State{

    static final PayClose instance = new PayClose() ;

    public static PayClose getInstance(){
        return instance ;
    }

    @Override
    public void handle(Context context) {

        if (context.getCurrent() == this){

          System.out.println("最后一个状态了  可咋整");
          context.setCurrent(null);
        }

    }
}
