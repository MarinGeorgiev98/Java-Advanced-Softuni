import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterByAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, Integer> nameAgePairs = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] split = scan.nextLine().split(", ");
            String name = split[0];
            int age = Integer.parseInt(split[1]);
            nameAgePairs.put(name, age);
        }
        String condition = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String format = scan.nextLine();

        Predicate<Integer> returnFilter = getPredicate(condition, age);
        Consumer<Map.Entry<String, Integer>> printer = getPrinter(format);
        nameAgePairs
                .entrySet()
                .stream()
                .filter(e -> returnFilter.test(e.getValue()))
                .forEach(e -> printer.accept(e));
    }

    private static Consumer<Map.Entry<String, Integer>> getPrinter(String format) {
        Consumer<Map.Entry<String, Integer>> printer;
        if (format.equals("name")) {
            printer = e -> System.out.println(e.getKey());
        }
        else if (format.equals("age")) {
            printer = e -> System.out.println(e.getValue());
        }
        else {
            printer = e -> System.out.println(
                    String.format("%s - %d", e.getKey(), e.getValue()));
        }
        return printer;
    }

    private static Predicate<Integer> getPredicate(String condition, int age) {
        Predicate<Integer> result;
        if (condition.equals("younger")) {
            result = n -> n <= age;
        }
        else {
            result = n -> n >= age;
        }
        return result;
    }
}