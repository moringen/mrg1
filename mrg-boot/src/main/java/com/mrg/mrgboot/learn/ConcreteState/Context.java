package com.mrg.mrgboot.learn.ConcreteState;

/**
 *
 * <p>定义客户感兴趣的接口</p>
 * <p>维护一个ConcreteState子类实例 -当前状态</p>
 * @author hwakzhao
 * @create 2018-11-01
 **/
public class Context {

    private State current;

    public Context(State current) {
        this.current = current;
    }

    public State getCurrent() {
        return current;
    }

    public void setCurrent(State current) {
        this.current = current;
    }

    public void request(){

        if (current != null){

            current.handle(this);
        }
    }
}
