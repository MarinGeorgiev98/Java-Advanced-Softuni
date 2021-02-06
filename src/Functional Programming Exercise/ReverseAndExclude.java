import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
        Collections.reverse(numbers);
        BiFunction<Integer, Integer, Boolean> isDivisible = (x,d) -> x % d == 0;
        int divider = Integer.parseInt(scan.nextLine());
        numbers.removeIf(number -> isDivisible.apply(number, divider));
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}