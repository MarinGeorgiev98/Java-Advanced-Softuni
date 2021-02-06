import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeSet<String> elements = new TreeSet<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            for (int j = 0; j < input.length; j++) {
                elements.add(input[j]);
            }
        }

        for (String element : elements) {
            System.out.print(element + " ");
        }
    }
}