import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
// We cannot change the object inside the method
// but we can change it element by element.

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Function<List<Integer>, List<Integer>> add = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i) + 1);
            }
            return list;
        };
        Function<List<Integer>, List<Integer>> subtract = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i) - 1);
            }
            return list;
        };
        Function<List<Integer>, List<Integer>> multiply = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i) * 2);
            }
            return list;
        };
        Consumer<Integer> print = x -> System.out.print(x + " ");
        List<Integer> numbers = Arrays.
                stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scan.nextLine();
        while (!command.equals("end")) {
            if (command.equals("add")) {
                numbers = add.apply(numbers);
            }
            else if (command.equals("subtract")) {
                numbers = subtract.apply(numbers);
            }
            else if (command.equals("multiply")) {
                numbers = multiply.apply(numbers);
            }
            else if (command.equals("print")) {
                numbers
                        .forEach(e -> print.accept(e));
            }
            System.out.println();
            command = scan.nextLine();
        }
    }
}