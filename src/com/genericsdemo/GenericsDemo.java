package com.genericsdemo;

import java.util.Arrays;
import java.util.List;

interface Container<T> {
    void set(T a);
    T get();
}

class Store<T> implements Container<T> {
    private T a;

    @Override
    public void set(T a) {
        this.a = a;
    }

    @Override
    public T get() {
        return a;
    }
}
public class GenericsDemo {
    public static void main(String[] args) {
        Container<String> stringStore = new Store<>();
        stringStore.set("Java");
        System.out.println("stringStore: " + stringStore.get());

        Container<Integer> integerStore = new Store<>();
        integerStore.set(1000);
        System.out.println("integerStore: " + integerStore.get());

        Container<List<Integer>> listStore = new Store<>();
        listStore.set(Arrays.asList(1, 2, 3, 4));
        System.out.println("listStore: " + listStore.get());
    }
}
