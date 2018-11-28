package com.mrg.mrgboot.learn.handler;

/**
 *    -- 总监
 * @author hwakzhao
 * @since 2018-11-06
 **/
public class Director extends  Leader {

    public Director(Leader superior, String name) {
        super(superior, name);
    }

    @Override
    public void handle(Request request) {
        if (request.getType().equals("请假") && request.getCount() <= 10) {

            System.out.println("[ " + request.getContent() + "] 请假 [" + request.getCount() + "]天, 总监 [" + name + "] 审批通过");

        } else {

            if (superior != null) {

                superior.handle(request);

            }
        }
    }

}
