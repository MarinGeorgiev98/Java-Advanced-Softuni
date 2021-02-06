import java.util.*;
import java.util.function.Predicate;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Predicate<Character> upperCase = isUpper -> Character.isUpperCase(isUpper);
        List<String> words = new ArrayList<>();
        String[] input = scan.nextLine().split(" ");
        int counter = 0;
        for (int i = 0; i < input.length; i++) {
            if (upperCase.test(input[i].charAt(0))) {
                words.add(input[i]);
                counter++;
            }
        }
        System.out.println(counter);
        words
                .stream()
                .forEach(e -> System.out.println(e));
    }
}