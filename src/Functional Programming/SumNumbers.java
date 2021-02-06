import java.util.*;
import java.util.function.Function;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");
        Function<String, Integer> parser = x -> Integer.parseInt(x);
        int sum = 0;
        for (String number : input) {
            sum+= parser.apply(number);
        }

        System.out.println("Count = " + input.length);
        System.out.println("Sum = " + sum);
    }
}