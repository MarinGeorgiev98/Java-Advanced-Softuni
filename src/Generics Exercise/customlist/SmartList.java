package customlist;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;

public class SmartList<T extends Object & Comparable>{
    private static final int INITIAL_CAPACITY = 4;
    private T[] data;
    private int size;

    public SmartList() {
        this.data = (T[]) Array.newInstance(Object.class, INITIAL_CAPACITY);
        this.size = 0;
    }
    public int getSize() {
        return this.size;
    }
    public void add(T element) {
        if (this.size == this.data.length) {
            resize();
        }
        data[this.size] = element;
        this.size++;
    }
    public T remove (int index) {
        T element = this.data[index];
        for (int i = index; i < this.size - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.data[this.size--] = null;
        return element;
    }

    public boolean contains(T element) {
        for (int i = 0; i < this.size; i++) {
            if (this.data[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void swap (int i1, int i2) {
        T temp = this.data[i1];
        this.data[i1] = this.data[i2];
        this.data[i2] = temp;
    }

    public int countGreaterThan(T element) {
        return (int) Arrays.stream(this.data, 0, this.size)
                .filter(e -> 0 < e.compareTo(element))
                .count();
    }

    public T getMax() {
        return (T) Arrays.stream(this.data, 0, this.size)
                //because the values of other elements in the array
                // are nulls - they are objects
                .max(T::compareTo)
                .orElse(null);
    }

    public T getMin() {
        return (T) Arrays.stream(this.data, 0, this.size)
                .min(T::compareTo)
                .orElse(null);
    }

    private void resize() {
        T[] temp = (T[]) Array.newInstance(Object.class, this.data.length * 2);
        for (int i = 0; i < this.data.length; i++) {
            temp[i] = this.data[i];
        }
        this.data = temp;
    }

    public void foreach (Consumer<T> consumer) {
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.data[i]);
        }
    }
}