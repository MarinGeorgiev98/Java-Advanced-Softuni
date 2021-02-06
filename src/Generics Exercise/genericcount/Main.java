package genericcount;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Box<String>> boxes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Box<String> box = new Box<>(scan.nextLine());
            boxes.add(box);
        }
        Box<String> comparer = new Box<>(scan.nextLine());

        System.out.println(findAllOccurences(boxes, comparer));
    }

     private static <T extends Comparable> int findAllOccurences
            (List<Box<T>> boxes, Box<T> comparer) {
        int count = 0;
         for (Box<T> box : boxes) {
             if (box.getElement().compareTo(comparer.getElement()) > 0) {
                 count++;
             }
         }
        return count;
    }
}