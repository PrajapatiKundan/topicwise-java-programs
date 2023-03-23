interface A {
    int VAL = 5;

    void foo();

    void bar();
}

interface B {
    int VAL = DefaultMethodDemo.getValue();

    void foo();
    abstract void go();
}

interface C extends A {
    void foobar();

    default void go() {
        System.out.println("C: go");
    }
}

abstract class AbstractA implements A {
    public void bar() {
        System.out.println("AbstractA: bar");
    }
    public void go() {
        System.out.println("AbstractA: go");
    }
}

class X extends AbstractA implements A, B, C {
    public void foo() {
        System.out.println("X: foo");
    }

    public void foobar() {
        System.out.println("X: foobar");
    }

    public void go() {
        C.super.go();
    }
}

public class DefaultMethodDemo {
    public static int getValue() {
        return 42;
    }

    public static void main(String[] args) {
        C c = new X();
        c.go();
    }
}
