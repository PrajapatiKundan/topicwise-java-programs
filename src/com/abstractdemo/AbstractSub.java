package com.abstractdemo;

abstract class AbstractSub extends AbstractSuper{
    void abstractSuperInstanceMethod1() {
        System.out.println("AbstractSub: abstractSuperInstanceMethod1");
    }

    abstract void abstractSuperInstanceMethod3();
}
