package com.dev.multithread;


import javax.swing.text.AsyncBoxView;


public class MainThread  implements Runnable {

    @Override
    public void run() {

        try {
            Thread.sleep(1000);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println("Thread Running : "+Thread.currentThread()  + "Child Thread state : "+ ChildThread.thread1.getState());

        try {
            Thread.sleep(2000);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println("Thread Running : "+Thread.currentThread()  + "Child Thread state : "+ ChildThread.thread1.getState());
    }
}
