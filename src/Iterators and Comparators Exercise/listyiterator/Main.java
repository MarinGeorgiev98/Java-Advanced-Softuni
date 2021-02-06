package listyiterator;

import javax.naming.OperationNotSupportedException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] objects = scan.nextLine().split(" ");

        String[] elements = new String[objects.length - 1];

        for (int i = 1; i < objects.length; i++) {
            elements[i - 1] = objects[i];
        }

        ListyIterator<String> iterator = new ListyIterator<>(elements);

        String input = scan.nextLine();

        while (!input.equals("END")) {
            switch (input) {
                case "Move":
                    System.out.println(iterator.move());
                    break;
                case "HasNext":
                    System.out.println(iterator.hasNext());
                    break;
                case "Print":
                    try {
                        iterator.print();
                    } catch (OperationNotSupportedException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
            input = scan.nextLine();
        }
    }
}