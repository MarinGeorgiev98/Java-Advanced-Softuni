import java.util.*;
import java.util.function.Predicate;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int[] divisors = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Predicate<Integer> tester = num -> {
            for (int divisor: divisors) {
                if (num % divisor != 0) {
                    return false;
                }
            }
            return true;
        };
        for (int i = 1; i <= n; i++) {
            if (tester.test(i)) {
                System.out.print(i + " ");
            }
        }
    }
}