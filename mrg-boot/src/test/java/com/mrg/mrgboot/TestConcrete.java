package com.mrg.mrgboot;

import com.mrg.mrgboot.learn.ConcreteAggregate;
import com.mrg.mrgboot.learn.ConcreteState.Context;
import com.mrg.mrgboot.learn.ConcreteState.PayWait;
import com.mrg.mrgboot.learn.abstractclass.AbstractBusiness;
import com.mrg.mrgboot.learn.abstractclass.BusinessOne;
import com.mrg.mrgboot.learn.abstractclass.BusinessTwo;
import com.mrg.mrgboot.learn.handler.*;
import com.mrg.mrgboot.learn.receiver.*;
import org.junit.Test;

import java.util.Iterator;

public class TestConcrete {

    @Test
    public void concreteAggregate(){
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.add("aa");
        aggregate.add("bb");
        aggregate.add("remove");
        aggregate.add("cc");
        aggregate.add("dd");
        aggregate.add("remove");
        aggregate.add("ee");

        Iterator<String> iter = aggregate.iterator();
        while (iter.hasNext()){
            String item = iter.next();
            System.out.println(item);

            if (item.equals("remove")){
                iter.remove();
            }
        }

        System.out.println("********----------********");
        for (String item : aggregate){
            System.out.println(item);
        }
    }

    /**
     * 状态模式
     */
    @Test
    public void concreteState(){

        Context context =new Context(PayWait.getInstance());
        context.request();
        context.request();
        context.request();

    }

    /**
     * 模板方法模式
     */
    @Test
    public  void concreteAbstractClass(){
        AbstractBusiness  one = new BusinessOne() ;

        one.run();

        AbstractBusiness  two = new BusinessTwo();

        two.run();
    }

    /**
     * 命令模式
     */
    @Test
    public void concreteCommand() {
        // 开业准备
        WaiterInvoker waiter = new WaiterInvoker();
        CookReceiver cook = new CookReceiver();
        Command doYangTuiCommand = new DoYangTuiCommand(cook);
        Command doJiTuiCommand = new DoJiTuiCommand(cook);

        // 接收订单
        waiter.addCommand(doYangTuiCommand);
        waiter.addCommand(doJiTuiCommand);

        // 在厨师制作完成之前还可以撤销订单
        waiter.cancelCommand(doYangTuiCommand);

        // 通知执行
        waiter.notifyExecute();
    }

    /**
     * 责任链模式
     */
    @Test
    public void concreteHandler() {

        Leader generalManger = new GeneralManager(null, "刘备");
        Leader manager = new Manager(generalManger, "诸葛亮");
        Leader director = new Director(manager, "赵云");

        director.handle(new Request("请假", "翡青", 32));
        director.handle(new Request("涨薪", "zjf", 1500));
    }


}

