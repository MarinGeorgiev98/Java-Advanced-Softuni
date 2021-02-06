import java.util.*;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((e1, e2) -> {
                    int result = 0;
                    if (e1 % 2 == 0 && e2 % 2 != 0) {
                        result = -1;
                        // Negative value means that the right number (e2) is bigger,
                        // so sorted() pushes e1 forward:
                        // -1 : e1 < e2
                        // 0 : e1 == e2
                        // +1 : e1 > e2
                    }
                    else if (e1 % 2 != 0 && e2 % 2 == 0) {
                        result = 1;
                    }
                    else {
                        result = e1 - e2;
                    }
                    return result;
                })
                .forEach(e -> System.out.print(e + " "));
    }
}