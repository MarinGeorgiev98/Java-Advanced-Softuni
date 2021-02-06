import java.util.*;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] arr = scan.nextLine().toCharArray();
        
        TreeMap<Character, Integer> symbols = new TreeMap<>();

        for (char c : arr) {
            symbols.putIfAbsent(c,0);
            symbols.put(c, symbols.get(c) + 1);
        }
            symbols
                    .forEach((k, v) -> System.out.printf("%c: %d time/s%n", k, v));
    }
}