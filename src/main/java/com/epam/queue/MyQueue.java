package com.epam.queue;


import java.util.NoSuchElementException;

public class MyQueue<T extends Car> {


    private Object[] items;

    public MyQueue() {
        items = new Object[0];
    }

    @Override
    public void addFirst(Object o) {
        if (items.length == 0) {
            items = new Object[1];
            items[0] = o;
        } else {
            Object[] newItems = new Object[items.length + 1];
            newItems[0] = o;
            for (int i = 1; i < newItems.length; i++) {
                newItems[i] = items[i - 1];
            }
            items = newItems;
        }
    }

    @Override
    public void addLast(Object o) {
        if (items.length == 0) {
            items = new Object[1];
            items[0] = o;
        } else {
            Object[] newItems = new Object[items.length + 1];
            newItems[newItems.length - 1] = o;
            for (int i = 0; i < newItems.length - 1; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
    }

    @Override
    public boolean offerFirst(Object o) {
        try {
            addFirst(o);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean offerLast(Object o) {
        try {
            addLast(o);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public Object removeFirst() {
        Object object = items[0];
        Object[] newItems = new Object[items.length - 1];
        try {
            for (int i = 0; i < newItems.length; i++) {
                newItems[i] = items[i + 1];
            }
            items = newItems;
            return object;
        } catch (Exception e) {
            throw new NoSuchElementException();
        }
    }

    @Override
    public Object removeLast() {
        Object object = items[items.length - 1];
        Object[] newItems = new Object[items.length - 1];
        try {
            for (int i = 0; i < newItems.length; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
            return object;
        } catch (Exception e) {
            throw new NoSuchElementException();
        }
    }

    @Override
    public Object pollFirst() {
        try {
            return removeFirst();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Object pollLast() {
        try {
            return removeLast();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Object getFirst() {
        try {
            return items[0];
        } catch (Exception e) {
            throw new NoSuchElementException();
        }
    }

    @Override
    public Object getLast() {
        try {
            return items[items.length - 1];
        } catch (Exception e) {
            throw new NoSuchElementException();
        }
    }

    @Override
    public Object peekFirst() {
        try {
            return getFirst();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Object peekLast() {
        try {
            return getLast();
        } catch (Exception e) {
            return null;
        }
    }

}
