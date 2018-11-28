package com.mrg.mrgboot.learn.handler;

/**
 *    -- 总经理
 * @author hwakzhao
 * @since 2018-11-06
 **/
public class GeneralManager extends  Leader {

    public GeneralManager(Leader superior, String name) {
        super(superior, name);
    }

    @Override
    public void handle(Request request) {

        if (request.getType().equals("请假")) {

            if (request.getCount() <= 30) {

                System.out.println("[ " + request.getContent() + "] 请假 [" + request.getCount() + "]天, 总经理 [" + name + "] 审批通过");

            } else {

                System.out.println("[ " + request.getContent() + "] 你干脆辞职算了");

            }
        } else if (request.getType().equals("涨薪")) {

            if (request.getCount() <= 10_000) {

                System.out.println("[ " + request.getContent() + "]  涨薪 [" + request.getCount() + "]RMB, 总经理 [" + name + "] 审批通过");

            } else {
                System.out.println("你咋不上天呢");
            }
        }


    }

}
