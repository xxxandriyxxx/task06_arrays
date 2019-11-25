package com.epam.container;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class StringContainer<T extends String> {

    private String[] items;

    public StringContainer() {
        items = new String[0];
    }

    public boolean add(T item) {
        try {
            if (items.length == 0) {
                items = new String[1];
                items[0] = item;
            } else {
                String[] newItems = new String[items.length + 1];
                newItems[0] = item;
                for (int i = 1; i < newItems.length; i++) {
                    newItems[i] = items[i - 1];
                }
                items = newItems;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean remove(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(item)) {
                items = ArrayUtils.removeElement(items, items[i]);
                return true;
            }
        }
        return false;
    }

    public boolean remove(int index) {
        try {
            items = ArrayUtils.removeElement(items, items[index]);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public java.lang.String toString() {
        return Arrays.toString(items);
    }
}
