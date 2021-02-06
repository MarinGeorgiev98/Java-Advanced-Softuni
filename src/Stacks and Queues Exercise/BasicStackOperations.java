import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> elements = new ArrayDeque<>();
        String[] operations = scan.nextLine().split(" ");
        String[] stackEl = scan.nextLine().split(" ");
        int stackSize = Integer.parseInt(operations[0]);
        int toRemove = Integer.parseInt(operations[1]);
        int check = Integer.parseInt(operations[2]);

        for (String s : stackEl) {
            elements.push(s);
        }

        for (int i = 0; i < toRemove; i++) {
            elements.pop();
        }

        if (elements.isEmpty())  {
            System.out.println(0);
            return;
        }

        if (elements.contains(String.valueOf(check))) {
            System.out.println("true");
        }
        else if (!elements.contains(String.valueOf(check))){
            int temp = Integer.MAX_VALUE;
            for (String element : elements) {
                int smallest = Integer.parseInt(elements.pop());
                if (smallest < temp) {
                    temp = smallest;
                }
            }
            System.out.println(temp);
        }
    }
}