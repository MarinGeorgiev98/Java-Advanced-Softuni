package scale;

public class Scale <T extends Comparable<T>> {

    private T l;
    private T r;
    public Scale(T l, T r) {
        this.l = l;
        this.r = r;
    }

    public T getHeavier (T l, T r) {
        int compareResult = this.l.compareTo(this.r);
        if (compareResult == 0) {
            return null;
        }
        return compareResult > 0
                ? this.l
                : this.r;
    }
}