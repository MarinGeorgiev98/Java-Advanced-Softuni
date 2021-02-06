import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashMap<Double, Integer> numbers = new LinkedHashMap<>();
        String[] input = scan.nextLine().split(" ");

        for (String s : input) {
            Double num = Double.parseDouble(s);
            if (numbers.containsKey(num)) {
                numbers.put(num, numbers.get(num) + 1);
            }
            else {
                numbers.put(num, 1);
            }
        }

        for (Double key : numbers.keySet()) {
            System.out.printf("%.1f -> %d", key, numbers.get(key));
            System.out.println();
        }
    }
}