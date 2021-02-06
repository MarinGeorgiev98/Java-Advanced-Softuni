import java.util.Scanner;
import java.util.function.BiFunction;

public class SumNumbers2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        String[] input = scan.nextLine().split(", ");
        BiFunction<Integer, String, Integer> parser = (x, y) -> x + Integer.parseInt(y);
        for (String s : input) {
            sum = parser.apply(sum, s);
        }
        System.out.println("Count = " + input.length);
        System.out.println("Sum = " + sum);
    }
}