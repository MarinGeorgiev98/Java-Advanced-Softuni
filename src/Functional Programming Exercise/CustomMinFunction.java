import java.util.*;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Function<int[], Integer> func = array -> {
            int minElement = array[0];
            for (Integer integer : array) {
                if (integer < minElement) {
                    minElement = integer;
                }
            }
            return minElement;
        };

        System.out.println(func.apply(arr));
    }
}