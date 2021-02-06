package listyiterator;

import javax.naming.OperationNotSupportedException;
import java.util.*;

public class ListyIterator<T> {
    private List<T> elements;
    private int index;

    public ListyIterator(T... args) {
        if (args.length == 0) {
            this.index = -1; // We make the index invalid
        }
        this.elements = Arrays.asList(args);
        this.index = 0;
    }

    public boolean move() {
        if (this.index < this.elements.size() - 1) {
            this.index++;
            return true;
        }
        return false;
    }
    public boolean hasNext() {
        return this.index < this.elements.size() - 1;
    }

    public void print() throws OperationNotSupportedException {
        if (this.elements.size() == 0) {
            throw new OperationNotSupportedException("Invalid Operation!");
        }
        System.out.println(this.elements.get(this.index));
    }
}