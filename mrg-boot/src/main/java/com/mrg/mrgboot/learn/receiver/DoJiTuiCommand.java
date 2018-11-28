package com.mrg.mrgboot.learn.receiver;

/**
 * @author hwakzhao
 * @create 2018-11-02
 **/
public class DoJiTuiCommand extends  Command {

    public DoJiTuiCommand(CookReceiver cookReceiver) {
        super(cookReceiver);
    }

    @Override
    public void execute() {
     cookReceiver.doJITui();
    }


}
