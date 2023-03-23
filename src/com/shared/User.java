package com.shared;

public class User {
    int id;
    String userType;

    public User() {
        System.out.println("User default constructor");
    }
    public static void staticMethod() {
        System.out.println("User: staticMethod");
    }

    public void instanceMethod(double d) {
        System.out.println("User: instanceMethod");
    }
    public void instanceMethod(int i) {
        System.out.println("User: instanceMethod");
    }
    public void postAReview() {
        System.out.println("User: postAReview");
    }

    public void displayUserInfo() {
        System.out.println(this);
    }

    public final void finalMethod() {
        System.out.println("User: finalMethod");
    }
}
