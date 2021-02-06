package scale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Scale<Integer> scale = new Scale(5, 7);

        System.out.println(scale.getHeavier(5, 7));
    }
}