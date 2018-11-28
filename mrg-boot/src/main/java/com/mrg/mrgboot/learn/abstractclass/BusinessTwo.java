package com.mrg.mrgboot.learn.abstractclass;

/**
 * 模板模式  业务实现2
 * @author hwakzhao
 * @create 2018-11-02
 **/
public class BusinessTwo extends   AbstractBusiness {
    @Override
    protected void onSuccess() {
        System.out.println("TWO");
    }
}
