package com.multithreadingdemo;

class MyTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Inside run...");
        for(int i = 0; i <= 5; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
}

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(new MyTask());
        t.start();
        t.join();
        System.out.println("Inside main...");
        for(int i = 0; i <= 5; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
}
