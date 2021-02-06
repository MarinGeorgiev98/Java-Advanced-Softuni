package linkedlist;

import java.util.function.Consumer;

public class LinkedList {

    public class Node {
        private int element;
        private Node next;
        private Node prev;

        public Node(int element) {
            this.element = element;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addFirst (int element) {
        if (this.head == null) {
            addlast(element);
        }
        else {
            Node newNode = new Node(element);
            this.head.prev = newNode;
            newNode.next = this.head;
            this.head = newNode;
        }
        this.size++;
     }
    public void addlast(int element) {
        Node newNode = new Node(element);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        }
        else {
            newNode.prev = this.tail;
            this.tail.next = newNode;
            this.tail = newNode;
            if (this.head.next == null) {
                this.head.next = newNode;
            }
        }
        this.size++;
    }

    public int size() {
        return this.size;
    }
    public Integer removeFirst() {
        if (this.head != null) {
            int element = this.head.element;
            this.head = this.head.next;
            if (this.head != null) {
                this.head.prev = null;
            }
            else {
                this.tail = null;
            }
            this.size--;
            return element;
        }
            return null;
    }

    public Integer removeLast() {
        if (this.tail != null) {
            int element = this.tail.element;
            this.tail = this.tail.prev;
            if (this.tail != null) {
                this.tail.next = null;
            }
            else {
                this.head = null;
            }
            this.size--;
            return element;
        }
        return null;
    }

    public void forEach(Consumer<Integer> consumer) {
        if (this.size == 1) {
            System.out.println(this.head.element);
            // If we have only 1 element, we just print it.
        }
        else {
            Node currentNode = this.head;
            while (currentNode != null) {
                consumer.accept(currentNode.element);
                //It is equivalent to
                // System.out.println(currentNode.element).
                currentNode = currentNode.next;
            }
        }
    }
    public int get (int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Invalid index!");
        }

        Node currentNode = this.head;
        int begin = 0;
        while (begin < index) {
            currentNode = currentNode.next;
            begin++;
        }
        return currentNode.element;
    }

    public int[] toArray () {
        int[] elements = new int[this.size];
        int index = 0;
        Node currentNode = this.head;
        while (currentNode != null) {
            elements[index++] = currentNode.element;
            currentNode = currentNode.next;
        }
        return elements;
    }
}