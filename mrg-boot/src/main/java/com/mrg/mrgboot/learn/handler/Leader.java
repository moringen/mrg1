package com.mrg.mrgboot.learn.handler;

/**
 * 定义一个处理请求的接口, 内持继任者(可选):
 * @author hwakzhao
 * @since 2018-11-06
 **/
public abstract class  Leader {

    protected Leader superior ;

    protected String name ;

    protected Leader(Leader superior, String name) {
        this.superior = superior;
        this.name = name;
    }

    public abstract  void handle(Request request);

}
