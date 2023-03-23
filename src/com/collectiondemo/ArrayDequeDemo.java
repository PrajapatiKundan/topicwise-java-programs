package com.collectiondemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void dequeTest() {
        System.out.println("---Inside dequeTest---");

        Deque<String> deque = new ArrayDeque<>();

        // Queue - FIFO
        deque.add("Book1");
        deque.add("Book2");
        deque.add("Book3");

        System.out.println(">> Printing Queue");
        System.out.println(deque.remove());
        System.out.println(deque.remove());
        System.out.println(deque.remove());

        // Stack - LIFO
        deque.push("Book4");
        deque.push("Book5");
        deque.push("Book6");

        System.out.println(">> Printing Stack");
        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque.pop());
    }
    public static void main(String[] args) {
        dequeTest();
    }
}
