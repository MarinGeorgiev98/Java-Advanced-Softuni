import java.util.*;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

         List<Integer> evens =
                 Arrays.stream(scan.nextLine().split(", "))
                 .map(Integer::parseInt)
                 .filter(n -> n % 2 == 0)
                 .collect(Collectors.toList());

        List<String> toPrint = evens
                .stream()
                .map(n -> n.toString())
                .collect(Collectors.toList());
        System.out.println(String.join(", ", toPrint));

        evens = evens.
                stream()
                .sorted()
                .collect(Collectors.toList());
        toPrint.clear();
        toPrint = evens
                .stream()
                .map(Object::toString)
                .collect(Collectors.toList());
        System.out.println(String.join(", ", toPrint));
    }
}