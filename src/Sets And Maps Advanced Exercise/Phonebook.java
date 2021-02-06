import java.util.*;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, String> phonebook = new LinkedHashMap<>();

        String command = scan.nextLine();
        while(!command.equals("search")) {
            String[] tokens = command.split("-");
            String name = tokens[0];
            String phone = tokens[1];
            phonebook.put(name, phone);
            command = scan.nextLine();
        }

        String input = scan.nextLine();
        while(!input.equals("stop")) {
            if (phonebook.containsKey(input)) {
                System.out.printf("%s -> %s%n", input, phonebook.get(input));
            }
            else {
                System.out.printf("Contact %s does not exist.%n", input);
            }
            input = scan.nextLine();
        }
    }
}