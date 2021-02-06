import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Function<List<Integer>, Integer> findRightMostMinElements = numbers ->
                numbers.lastIndexOf
                            (numbers.stream().min(Integer::compareTo).orElse(-1));
        List<Integer> numbers = Arrays.
                stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(findRightMostMinElements.apply(numbers));
    }
}