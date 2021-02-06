import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();
        String[] operations = scan.nextLine().split(" ");
        String[] qEl = scan.nextLine().split(" ");
        int queueSize = Integer.parseInt(operations[0]);
        int toRemove = Integer.parseInt(operations[1]);
        for (String s : qEl) {
            queue.offer(s);
        }
        for (int i = 0; i < toRemove; i++) {
            queue.poll();
        }
        if (queue.isEmpty()) {
            System.out.println(0);
            return;
        }
        if (queue.contains(operations[2])) {
            System.out.println("true");
        }
        else {
            int smallest = Integer.MAX_VALUE;
            for (String q : queue) {
                int temp = Integer.parseInt(queue.poll());
                if (temp < smallest) {
                    smallest = temp;
                }
            }
            System.out.println(smallest);
        }
    }
}