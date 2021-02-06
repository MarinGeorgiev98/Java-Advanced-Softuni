package jaroft;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Jar<Integer> jar = new Jar<>();

        jar.add(5);
        jar.add(5);

        System.out.println(jar.remove());
    }
}