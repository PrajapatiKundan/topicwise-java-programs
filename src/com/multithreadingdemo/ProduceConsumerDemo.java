package com.multithreadingdemo;
/*
class ShareData {
    private int data;
    private boolean writeable = true;

    public synchronized void produce(int data) {
        if(!writeable) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        this.data = data;
        System.out.println("Produced: " + data);
        writeable = false;
        notify();
    }

    public synchronized int consume() {
        if (writeable) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        writeable = true;
        notify();
        return data;
    }
}

class Producer extends Thread {
    ShareData shareData;
    Producer(ShareData shareData) {
        this.shareData = shareData;
    }

    @Override
    public void run() {
        for(int i =1; i <= 10; i++) {
            shareData.produce(i);
            try {
                sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer extends Thread {
    ShareData shareData;
    Consumer(ShareData shareData) {
        this.shareData = shareData;
    }

    @Override
    public void run() {
        for(int i =1; i <= 10; i++) {
            System.out.println("Consumed value is: " + shareData.consume());
        }
    }
}

public class ProduceConsumerDemo {
    public static void main(String[] args) {
        ShareData shareData = new ShareData();
        Producer p = new Producer(shareData);
        Consumer c = new Consumer(shareData);

        p.start();
        c.start();
    }
}
*/