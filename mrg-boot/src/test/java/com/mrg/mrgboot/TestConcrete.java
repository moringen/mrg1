package com.mrg.mrgboot;

import com.mrg.mrgboot.learn.ConcreteAggregate;
import com.mrg.mrgboot.learn.ConcreteState.Context;
import com.mrg.mrgboot.learn.ConcreteState.PayWait;
import org.junit.Test;

import java.util.Iterator;

public class TestConcrete {

    @Test
    public void client(){
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
}

