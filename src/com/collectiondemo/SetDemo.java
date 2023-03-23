package com.collectiondemo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Book {
    private String title;
    private String author;
    private int year;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", author='" + author + '\'' + ", year=" + year + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return year == book.year && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }
}

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
