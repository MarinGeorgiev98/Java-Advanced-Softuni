// not 100;
import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> elements = new ArrayDeque<>();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split(" ");
            if (tokens[0].equals("1")) {
                elements.push(tokens[1]);
            }
            else if (tokens[0].equals("2")) {
                elements.pop();
            }
            else {
                int smallest = Integer.MAX_VALUE;
                for (String element : elements) {
                    int temp = Integer.parseInt(elements.pop());
                    if (temp < smallest) {
                        smallest = temp;
                    }
                }
                System.out.println(smallest);
            }
        }
    }
}