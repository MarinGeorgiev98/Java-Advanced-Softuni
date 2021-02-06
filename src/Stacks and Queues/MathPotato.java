import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int n = Integer.parseInt(scan.nextLine());
        ArrayDeque<String> children = new ArrayDeque<>();
        Collections.addAll(children, input);

        int cycles = 1;
        while (children.size() > 1) {
            for (int i = 1; i < n; i++) {
                String child = children.remove();
                children.add(child);
            }
            if (!isPrime(cycles)) {
                System.out.printf("Removed %s", children.peek());
                System.out.println();
                children.remove();
            } else {
                System.out.printf("Prime %s", children.peek());
                System.out.println();
            }
            cycles++;
        }

        System.out.printf("Last is %s", children.peek());
    }

    private static boolean isPrime(int number){
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return  true;
    }
}