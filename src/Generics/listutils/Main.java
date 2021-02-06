package listutils;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.asList(1, 2, 4, 7);
        System.out.println(ListUtils.getMin(numbers));
    }
}