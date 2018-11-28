package com.mrg.mrgboot.learn.handler;

/**
 *    -- 经理
 * @author hwakzhao
 * @since 2018-11-06
 **/
public class Manager extends  Leader {

    public Manager(Leader superior, String name) {
        super(superior, name);
    }

    @Override
    public void handle(Request request) {

        if (request.getType().equals("请假") && request.getCount() <= 20) {

            System.out.println("[ " + request.getContent() + "] 请假 [" + request.getCount() + "]天, 经理 [" + name + "] 审批通过");

        } else if (request.getType().equals("涨薪") && request.getCount() <= 1000) {

            System.out.println("[ " + request.getContent() + "]  涨薪 [" + request.getCount() + "]RMB, 经理 [" + name + "] 审批通过");

        } else {

            if (superior != null) {
                superior.handle(request);
            }

        }

    }

}
