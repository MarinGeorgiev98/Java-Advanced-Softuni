import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> print = new ArrayDeque<>();
        String input = scan.nextLine();

        while (!input.equals("print")) {
            if (input.equals("cancel")) {
                if (print.isEmpty()) {
                    System.out.println("Printer is on standby");
                }
                else {
                    System.out.println(String.format("Canceled %s", print.poll()));
                }
            }
            else {
                print.offer(input);
            }
            input = scan.nextLine();
        }

        while(!print.isEmpty()) {
            System.out.println(String.format("%s", print.poll()));
        }
    }
}