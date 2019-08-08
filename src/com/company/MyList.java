package com.company;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];

    }

    public void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }


    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        this.elements[this.size++] = e;

    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("index:" + i + ",Size" + i);
        }
        return (E) elements[i];
    }

    public int getSize(int i) {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
