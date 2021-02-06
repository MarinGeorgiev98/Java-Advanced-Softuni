package arraycreator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer[] numbers = ArrayCreator.create(4, 0);
        String[] strings = ArrayCreator.create(String.class, 5, "");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}