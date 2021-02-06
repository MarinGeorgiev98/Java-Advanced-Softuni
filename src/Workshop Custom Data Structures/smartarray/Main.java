package smartarray;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        SmartArray sArray = new SmartArray();

        for (int i = 0; i < 6; i++) {
            sArray.add(i);
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(sArray.data[i]);
        }
        sArray.forEach(System.out::println);
    }
}