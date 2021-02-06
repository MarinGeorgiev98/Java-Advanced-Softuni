import java.util.*;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Consumer<String> print = x -> System.out.println(x);
        String[] input = scan.nextLine().split(" ");

        Arrays.stream(input)
                .forEach(e -> print.accept(e));
    }
}