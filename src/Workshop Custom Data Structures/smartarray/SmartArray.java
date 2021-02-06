package smartarray;

import java.util.function.Consumer;

public class SmartArray {
    private static final int INITIAL_CAPACITY = 4;
    public int[] data;
    private int size;
    private int capacity;

    public SmartArray() {
        this.data = new int[INITIAL_CAPACITY];
        this.capacity = INITIAL_CAPACITY;
        this.size = 0;
    }

    public void add(int element) {
        if (this.size == this.capacity) {
            this.resize();
        }
        this.data[this.size] = element;
        this.size++;
    }
    public void add(int index, int element) {
        checkIsertIndex(index);
        if (this.size == this.capacity) {
            this.resize();
        }
        this.size++;
        this.shiftRight(index);
        for (int i = index + 1; i < this.size; i++) {
            this.data[i + 1] = data[i];
        }
        this.data[index] = element;
    }

    private void checkIsertIndex(int index) {
        if (index < 0 || index > this.size) {
            String message = String.format
                    ("Index %d is out of bounds for length %d",
                            index, this.size);
            throw new IndexOutOfBoundsException();
        }
    }
    public boolean contains(int element) {
        for (int i = 0; i < this.size; i++) {
            if (element == this.data[i]) {
                return true;
            }
        }
        return false;
    }

    public void forEach (Consumer <Integer> consumer) {
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.data[i]);
        }
    }

    private void shiftRight(int index) {
        for (int i = this.size - 1; i > index; i--) {
            this.data[i] = data[i - 1];
        }
    }

    private int checkIndex(int index){
        if (index < 0 || index >= this.size) {
            String message = String.format
                    ("Index %d is out of bounds for length %d",
                            index, this.size);
            throw new IndexOutOfBoundsException();
        }
        return this.data[index];
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

    public int get(int index) {
        checkIndex(index);
        return this.data[index];
    }
    public int remove(int index) {
        int temp = this.get(index);
        this.shiftLeft(index);
        this.size--;
        if (this.capacity / this.size >= 4) {
            this.shrink();
        }
        return temp;
    }

    private void shrink() {
        this.capacity = size * 2;
        int[] temp = new int[this.capacity];
        for (int i = 0; i < this.size; i++) {
            temp[i] = this.data[i];
        }
        this.data = temp;
    }

    private void shiftLeft(int index) {
        for (int i = index + 1; i < this.size; i++) {
            data[i - 1] = this.data[i];
        }
    }
}