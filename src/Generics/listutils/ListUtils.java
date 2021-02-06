package listutils;

import java.util.*;

public class ListUtils<T> {

    public static <T extends Comparable<T>> T getMax(List<T> list) {
        if (list.size() == 0) {
            throw new IllegalArgumentException("max on empty list");
        }
        T currentMax = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (currentMax.compareTo(list.get(i)) < 0) {
                currentMax = list.get(i);
            }
        }
        return currentMax;
    }

    public static <T extends Comparable<T>> T getMin(List<T> list) {
        if (list.size() == 0) {
            throw new IllegalArgumentException("max on empty list");
        }
        T min = list
                .stream()
                .reduce(list.get(0), (e1, e2) -> e1.compareTo(e2) > 0 ? e2 : e1);
        return min;
    }
}