package customstack;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class CustomStack {
    public static final int INITIAL_CAPACITY = 4;
    private int[] data;
    private int size;
    private int capacity;

    CustomStack() {
        this.data = new int[INITIAL_CAPACITY];
        this.capacity = INITIAL_CAPACITY;
        this.size = 0;
    }
    public int getSize() {
        return this.size;
    }
    public void push (int element) {
        if (this.size == this.capacity) {
            this.resize();
        }
        this.data[this.size++] = element;
    }

    public int pop() {
        int temp = this.data[this.size - 1];
        this.size--;
        return temp;
    }
    private void checkEmpty () {
        if (this.size == 0) {
            throw new NoSuchElementException();
        }
    }

    public int peek () {
        checkEmpty();
        return this.data[this.size - 1];
    }
    public void forEach (Consumer<Integer> consumer) {
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.data[i]);
        }
    }
    private void resize() {
        int[] temp = new int[this.capacity];
        for (int i = 0; i < this.capacity; i++) {
            temp[i] = this.data[i];
        }
        this.capacity *= 2;

        this.data = new int[capacity];
        for (int i = 0; i < this.capacity / 2; i++) {
            this.data[i] = temp[i];
        }
    }
}