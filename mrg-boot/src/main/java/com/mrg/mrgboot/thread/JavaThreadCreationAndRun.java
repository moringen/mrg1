package com.mrg.mrgboot.thread;
/**
 * 线程学习 哈哈哈
 * @author hwakzhao
 * @since 2018-11-02
 **/
public class JavaThreadCreationAndRun {

    static class  Helper implements  Runnable{

        private  static String massage ;

        public Helper(String massage) {
            this.massage = massage ;
        }

        private  void doSomething(String message){

            System.out.println("The doSomething method  was executed by thread :"
            + Thread.currentThread().getName());
            System.out.println("Do something with " + massage);

        }

        @Override
        public void run() {

            doSomething(massage);
        }
    }

    public static void main(String[] args) {
        System.out.println("The main method was executed thread :" +Thread.currentThread().getName());

        Helper helper =new Helper("Java Thread AnyWhere ");

        //创建一个线程
        Thread thread =new Thread(helper);
        //设置线程名
        thread.setName("A-Worker-Thread");

        thread.run();
        //启动线程
        thread.start();

    }


}
