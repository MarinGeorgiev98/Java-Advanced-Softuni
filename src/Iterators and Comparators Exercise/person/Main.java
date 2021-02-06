package person;

import java.util.*;
import java.util.prefs.PreferencesFactory;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        String command = scan.nextLine();

        while (!command.equals("END")) {
            String[] arr = command.split(" ");
            String name = arr[0];
            int age = Integer.parseInt(arr[1]);
            String town = arr[2];
            Person p1 = new Person(name, age, town);
            people.add(p1);
            command = scan.nextLine();
        }
        int n = Integer.parseInt(scan.nextLine());
        int counter = 0;
        for (Person person : people) {
            if (people.get(n - 1).compareTo(person) == 0) {
                counter++;
            }
        }
        if (counter == 1) {
            System.out.println("No matches");
        }
        else {
            System.out.printf("%d %d %d", counter, people.size() - counter, people.size());
        }
    }
}