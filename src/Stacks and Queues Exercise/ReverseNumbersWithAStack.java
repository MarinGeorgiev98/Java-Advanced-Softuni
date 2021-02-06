import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> numbers = new ArrayDeque<>();
        String[] n = scan.nextLine().split(" ");
        for (String s : n) {
            numbers.push(s);
        }

        int temp = numbers.size();
        for (int i = 0; i < temp; i++) {
            System.out.print(numbers.pop() + " ");
        }
    }
}