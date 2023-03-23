package com.collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();

        // [a, b, c]
        list1.add("a");
        list1.add("b");
        list1.add("c");

        // Display current elements
        for (ListIterator<String> listIterator = list1.listIterator(); listIterator.hasNext(); ) {
            System.out.println(listIterator.nextIndex() + " - " + listIterator.next());
        }

        System.out.println("--------------------");

        ListIterator<String> stringListIterator = list1.listIterator();
        while (stringListIterator.hasNext()) {
            stringListIterator.next();
            // [a | b c] here | => indicates cursor position

            if (stringListIterator.nextIndex() == 1) {

                System.out.println("---Add 'test' at index 1---");
                stringListIterator.add("test");
                System.out.println(list1);
                // [a test | b c]

                System.out.println("---Remove 'test' from index 1---");
                stringListIterator.previous();
                stringListIterator.remove();
                System.out.println(list1);
            }
        }
    }
}
