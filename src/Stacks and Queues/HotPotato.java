import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int n = Integer.parseInt(scan.nextLine());
        ArrayDeque<String> children = new ArrayDeque<>();
        Collections.addAll(children, input);

        while (children.size() > 1) {
            for (int i = 1; i < n; i++) {
                String child = children.remove();
                children.add(child);
            }
            System.out.printf("Removed %s", children.remove());
            System.out.println();
        }

        System.out.printf("Last is %s", children.peek());
    }
}