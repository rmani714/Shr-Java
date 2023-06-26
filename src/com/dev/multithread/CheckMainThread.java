package com.dev.multithread;

public class CheckMainThread {

    public static void main(String[] args) {
        MainThread mainThread1 = new MainThread();

        MainThread mainThread2 = new MainThread();

        MainThread mainThread3 = new MainThread();

        mainThread1.run();
        mainThread2.run();
        mainThread3.run();
    }
}
