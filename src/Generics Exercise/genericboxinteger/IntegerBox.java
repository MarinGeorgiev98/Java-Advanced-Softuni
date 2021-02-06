package genericboxinteger;

public class IntegerBox<T> {
    private T element;

    public IntegerBox(T element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return this.element.getClass().getName() + ": " + this.element;
    }
}