package com.okres.task5;

import java.util.Arrays;

public class ListImpl {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public ListImpl() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(Object o) {
        if (size == elements.length)
            makeCapacityBigger();
        elements[size++] = o;
    }

    private void makeCapacityBigger() {
        int newCapacity = size * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    public void print() {
        for (Object o : elements) {
            if (o != null)
                System.out.println(o);
        }
    }
}
