package com.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(3);
        list1.add(null);
        System.out.println("list1: " + list1);

        list1.remove(3);
        System.out.println("list1: " + list1);

        list1.remove(3);
        System.out.println("list1: " + list1);

        list1.add(0, 10);
        System.out.println("list1: " + list1);

        list1.set(0, 9);
        System.out.println("list1: " + list1);

        /* Bulk operations*/
        Collection<Integer> list2 = new ArrayList<>();
        list2.add(9);
        list2.add(3);

        list1.removeAll(list2);
        System.out.println("list1: " + list1);

        list2.add(1);
        list1.retainAll(list2);
        System.out.println("list1: " + list1);

        list1.addAll(list2);
        System.out.println("list1: " + list1);

        /* Search operation */
        System.out.println("list1.contains(1): " + list1.contains(1));
        System.out.println("list1.indexOf(1): " + list1.indexOf(1));
        System.out.println("list1.lastIndexOf(1): " + list1.lastIndexOf(1));

        /* Range view */
        List<Integer> list3 = list1.subList(2, 3/*3 is exclusive*/);
        System.out.println("list3: " + list3); // [3]

        list3.set(0, 6); // list3: [6] list1: [1, 9, 6, 1]
        System.out.println("list3: " + list3);
        System.out.println("list1: " + list1);

        list3.add(0, 7);
        System.out.println("list3: " + list3);
        System.out.println("list1: " + list1);
    }
}
