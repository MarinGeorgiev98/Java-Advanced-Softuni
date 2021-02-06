import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateForNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Predicate<String> testValidation = str -> str.length() <= n;

        List<String> names = Arrays
                .stream(scan.nextLine().split(" "))
                .filter(testValidation)
                .collect(Collectors.toList());
        names
                .forEach(System.out::println);
    }
}