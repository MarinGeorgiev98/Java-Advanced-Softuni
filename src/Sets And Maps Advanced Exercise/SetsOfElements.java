import java.util.*;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashSet<String> first = new LinkedHashSet<>();
        LinkedHashSet<String> second = new LinkedHashSet<>();
        LinkedHashSet<String> repeated = new LinkedHashSet<>();
        
        String[] input = scan.nextLine().split(" ");
        int firstSize = Integer.parseInt(input[0]);
        int secondSize = Integer.parseInt(input[1]);

        for (int i = 0; i < firstSize; i++) {
            String num = scan.nextLine();
            first.add(num);
        }

        for (int i = 0; i < secondSize; i++) {
            String num = scan.nextLine();
            second.add(num);
        }

        for (String element : first) {
            if (second.contains(element)) {
                repeated.add(element);
            }
        }

        for (String element : repeated) {
            System.out.print(element + " ");
        }
    }
}