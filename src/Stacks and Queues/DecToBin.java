import java.util.ArrayDeque;
import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        ArrayDeque<Integer> num = new ArrayDeque<>();

        if(n == 0) {
            System.out.println(0);
        }

        while(n != 0) {
            num.push(n % 2);
            n = n / 2;
        }
        int size = num.size();
        for (int i = 0; i < size; i++) {
            System.out.print(num.pop());
        }
    }
}