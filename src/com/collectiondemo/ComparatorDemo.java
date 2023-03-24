package com.collectiondemo;

import com.shared.Book;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class TitleComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Book)o1).getTitle().compareTo(((Book)o2).getTitle());
    }
}

class YearComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Integer integer1 = ((Book)o1).getYear();
        Integer integer2 = ((Book)o2).getYear();
        return integer1.compareTo(integer2);
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Harry potter", "J K Rollings", 1997);
        Book book2 = new Book("Harry potter", "J K Rollings", 1997);
        Book book3 = new Book("Harry potter 2", "J K Rollings", 2001);
        Book book4 = new Book("The Hobbits", "J R R Tolkies", 1937);

        System.out.println("Enter 1 to sort by title\nEnter 2 to sort by year");
        System.out.print("Enter sort by option (1, 2): ");

        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();

        Comparator sortBy; // default sort by

        switch (op) {
            case 1:
                sortBy = new TitleComparator();
                System.out.println("---Books are sorted by title---");
                break;
            case 2:
                sortBy = new YearComparator();
                System.out.println("---Books are sorted by year---");
                break;

            default:
                sortBy = new TitleComparator();
                System.out.println("---Invalid option, Books are sorted by title---");
        }

        TreeSet<Book> books = new TreeSet<>(sortBy);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        for(Book book: books) {
            System.out.println(book);
        }
    }
}
