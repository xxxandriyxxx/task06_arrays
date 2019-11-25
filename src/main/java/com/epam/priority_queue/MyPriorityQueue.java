package com.epam.priority_queue;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyPriorityQueue<T extends Object & Comparable<T>> {

    private T[] items;

    public MyPriorityQueue() {
        items = (T[]) new Object[0];
    }

    public boolean add(T item) {
        try {
            if (items.length == 0) {
                items = (T[]) new Object[1];
                items[0] = item;
            } else {
                T[] newItems = (T[]) new Object[items.length + 1];
                newItems[0] = item;
                for (int i = 1; i < newItems.length; i++) {
                    newItems[i] = items[i - 1];
                }
                Arrays.sort(newItems);
                items = newItems;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public T element() {
        try {
            return items[0];
        } catch (Exception e) {
            throw new NoSuchElementException();
        }
    }

    public T peek() {
        try {
            return element();
        } catch (Exception e) {
            return null;
        }
    }

    public boolean remove(T object) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(object)) {
                items = ArrayUtils.removeElement(items, items[i]);
                return true;
            }
        }
        return false;
    }

    public T poll() {
        try {
            T object = items[0];
            T[] newItems = (T[]) new Object[items.length - 1];
            for (int i = 0; i < newItems.length; i++) {
                newItems[i] = items[i + 1];
            }
            items = newItems;
            return object;
        } catch (Exception e) {
            return null;
        }
    }

    public boolean contains(T object) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(object)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return items.length;
    }

    public void clear() {
        items = (T[]) new Object[0];
    }

    @Override
    public String toString() {
        return "MyPriorityQueue " + Arrays.toString(items);
    }

}
