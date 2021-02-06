import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Integer> parts = new ArrayDeque<>();
        String input = scan.nextLine();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                parts.push(i);
            }
            else if (input.charAt(i) == ')') {
                int startIndex = parts.pop();
                String current = input.substring(startIndex, i + 1);
                System.out.println(current);
            }
        }
    }
}