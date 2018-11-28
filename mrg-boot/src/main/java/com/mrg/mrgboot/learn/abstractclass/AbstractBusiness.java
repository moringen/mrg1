package com.mrg.mrgboot.learn.abstractclass;

/**
 * 模板方法模式
 * @author hwakzhao
 * @create 2018-11-02
 **/
public abstract  class AbstractBusiness {

    public void run(){
        System.out.println("1111");
        if (checkOne()) {
            onSuccess();
        }
    }

    protected  abstract  void onSuccess();

    private  boolean checkOne(){
        return  true ;
    }

}
