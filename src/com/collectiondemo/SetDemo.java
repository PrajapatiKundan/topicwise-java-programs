package com.collectiondemo;

import com.shared.Book;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();

        stringSet.add("book1");
        stringSet.add("book2");
        stringSet.add("book1"); // Set does not have duplicates. I won't throw error but ignore it.

        System.out.println("stringSet: " + stringSet);


        Book book1 = new Book("Harry potter", "J K Rollings", 2000);
        Book book2 = new Book("Harry potter", "J K Rollings", 2000);

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());

        System.out.println("bookSet: " + bookSet);
         /*
            Even though both books are identical, still add it to bookSet for this issue we have to overwrite hashCase
            and equals method
         */
    }
}
