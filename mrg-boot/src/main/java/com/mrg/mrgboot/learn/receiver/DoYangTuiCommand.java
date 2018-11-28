package com.mrg.mrgboot.learn.receiver;

/**
 * @author hwakzhao
 * @create 2018-11-02
 **/
public class DoYangTuiCommand extends  Command {

    public DoYangTuiCommand(CookReceiver cookReceiver) {
        super(cookReceiver);
    }

    @Override
    public void execute() {
     cookReceiver.doYangTui();
    }


}
