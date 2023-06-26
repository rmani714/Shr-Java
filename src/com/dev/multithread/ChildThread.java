package com.dev.multithread;

class ChildThread implements Runnable{
    static Thread thread1;
    static ChildThread childThread;

    public static void main(String[] args) {
        childThread = new ChildThread();
        thread1 = new Thread(childThread);

        System.out.println("get state of Current Thread :" + thread1.getState());

        thread1.start();

        System.out.println("get state of Current Thread after start :" + thread1.getState());
    }

    @Override
    public void run() {
        MainThread mainThread = new MainThread();
        Thread thread2 = new Thread(mainThread);

        System.out.println("State of Thread 2 : "+ thread2.getState());
        thread2.start();
        System.out.println("State of Thread 2 after starting thread : "+ thread2.getState());

        try {
            Thread.sleep(2000);
        }catch (InterruptedException ii){
            ii.printStackTrace();
        }
        System.out.println("State of Thread 2 after sleep thread : "+ thread2.getState());
        try {
            thread2.join();
        }catch (InterruptedException ii){
            ii.printStackTrace();
        }
        System.out.println("State of Thread 2 after join thread : "+ thread2.getState());
    }
}