package com.collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));// [1, 2, 3, 4, 5]
        System.out.println("list1: " + list1);

        // We cannot remove element from ArrayList as below
        /*for (int el : list1) {
            if (el == 3) {
                list1.remove(3);// ConcurrentModificationException
            }
        }*/

        Iterator<Integer> iterator = list1.iterator();
        while(iterator.hasNext()){
            int el = iterator.next();
            System.out.println("element: "+el);
            if(el == 3)
                iterator.remove();// Must invoke .nex() before invoking .remove()
        }

        System.out.println("list1: " + list1);
    }
}
