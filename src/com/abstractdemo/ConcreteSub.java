package com.abstractdemo;

public class ConcreteSub extends AbstractSub{
    void abstractSuperInstanceMethod2() {
        System.out.println("ConcreteSub: abstractSuperInstanceMethod2");
    }

    void abstractSuperInstanceMethod3() {
        System.out.println("ConcreteSub: abstractSuperInstanceMethod3");
    }

    public static void main(String[] args) {
        ConcreteSub concrete = new ConcreteSub();
        concrete.abstractSuperInstanceMethod1();
        concrete.abstractSuperInstanceMethod2();
        concrete.abstractSuperInstanceMethod3();
    }
}
