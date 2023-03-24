package com.collectiondemo;

import com.shared.Student;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        Student student1 = new Student(100, "Rakesh");
        Student student2 = new Student(100, "Rakesh");
        Student student3 = new Student(101, "Kartik");
        Student student4 = new Student(102, "Sachin");

        Set<Student> students = new TreeSet<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        for (Student student : students) {
            System.out.println(student);
        }
    }


}
