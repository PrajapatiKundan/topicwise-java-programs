package com.shared;

public class Staff extends User {
    int id;
    String userType;

    public Staff () {
        userType = "Staff";
        System.out.println("Staff constructor 1");
    }

    public Staff (int id) {
        this();
        this.id = id;
        System.out.println("Staff constructor 2");
    }
    // Not overriding method
    public void instanceMethod(int i) {
        System.out.println("Staff: instanceMethod");
    }

    public void postAReview() {
        System.out.println("Staff: postAReview");
    }
    public static void staticMethod() {
        System.out.println("Staff: staticMethod");
    }
}
