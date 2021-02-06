import java.util.*;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        int startNum = Integer.parseInt(input[0]);
        int endNum = Integer.parseInt(input[1]);
        for (int i = startNum; i <= endNum; i++) {
            numbers.add(i);
        }
        String command = scan.nextLine();
        if (command.equals("even")) {
            numbers
                    .stream()
                    .filter(e -> e % 2 == 0)
                    .forEach(e -> System.out.print(e + " "));
        }
        else {
            numbers
                    .stream()
                    .filter(e -> e % 2 == 1 || e % 2 == -1)
                    .forEach(e -> System.out.print(e + " "));
        }
    }
}