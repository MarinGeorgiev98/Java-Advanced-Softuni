import java.util.*;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, String> emails = new LinkedHashMap<>();
        String input = scan.nextLine();

        while(!input.equals("stop")) {
            String email = scan.nextLine();
            String[] arr = email.split("\\.");
            if (arr[1].toLowerCase().equals("us") ||
                    arr[1].toLowerCase().equals("uk") ||
                    arr[1].toLowerCase().equals("com")) {
                input = scan.nextLine();
                continue;
            }
            else {
                emails.put(input, email);
            }
            input = scan.nextLine();
        }

        for (String email : emails.keySet()) {
            System.out.printf("%s -> %s%n", email, emails.get(email));
        }
    }
}