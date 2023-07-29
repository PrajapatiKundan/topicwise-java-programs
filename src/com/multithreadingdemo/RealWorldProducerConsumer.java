package com.multithreadingdemo;

import java.util.LinkedList;

class Store {
    private LinkedList<Integer> storage = new LinkedList<>();
    private final int storageCapacity = 5;

    public synchronized void produce(int i) {
        // 3. Producer cannot produce beyond storage capacity, and has to wait
        //    until consumer consume any item
        if(storage.size() == storageCapacity) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        storage.add(i);
        System.out.println("Produced item: " + i);
        notify();
    }

    public synchronized void consume() {
        //2. If store is empty then consume is not allowed, and consumer
        //   has to wait until item produced
        if (storage.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Consumed item: " + storage.removeFirst());
        notify();
    }
}

class Producer extends Thread {
    Store store = new Store();

    @Override
    public void run() {
        // Consider this for loop as machine that produce 20 items in a day
        for(int i = 1; i <= 20; i++) {
            // Add produced item in storage
            store.produce(i);
        }
    }

    Producer(Store store) {
        this.store = store;
    }
}

class Consumer extends Thread {
    Store store = new Store();

    @Override
    public void run() {
        // We can consume only 20 items per day
        for (int i = 1; i <= 20; i++) {
            store.consume();
        }
    }

    Consumer(Store store) {
        this.store = store;
    }
}

public class RealWorldProducerConsumer {
    public static void main(String[] args) {
        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);

        producer.start();
        consumer.start();
    }
}

// Solution:
// 1. produce() and consume() must be synchronized because at a time only either producer or
//    consumer allowed at store.
// 2. If store is empty then consume is not allowed, and consumer
//    has to wait until item produced
// 3. Producer cannot produce beyond storage capacity, and has to wait
//    until consumer consume any item
// 4. Consumer must notify producer if it consume any item
// 5. Produce must notify consumer if it produce item
//