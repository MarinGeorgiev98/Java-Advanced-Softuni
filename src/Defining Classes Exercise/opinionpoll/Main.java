package opinionpoll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Person> people = new TreeMap<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person = new Person(name, age);
            people.put(name, person);
        }

        people
                .entrySet()
                .stream()
                .filter(e -> e.getValue().getAge() > 30)
                .forEach(e -> System.out.printf("%s - %d%n",
                        e.getKey(), e.getValue().getAge()));
    }
}