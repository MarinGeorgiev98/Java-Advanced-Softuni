import java.util.*;

public class Party {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeSet<String> regular = new TreeSet<>();
        TreeSet<String> vip = new TreeSet<>();

        String input = scan.nextLine();

        while (!input.equals("PARTY")) {
            if (Character.isDigit(input.charAt(0))) {
                vip.add(input);
            }
            else {
                regular.add(input);
            }
            input = scan.nextLine();
        }

        String command = scan.nextLine();

        while (!command.equals("END")) {
            if (Character.isDigit(command.charAt(0))) {
                vip.remove(command);
            }
            else {
                regular.remove(command);
            }
            command = scan.nextLine();
        }

        System.out.println(regular.size() + vip.size());

        for (String s : vip) {
            System.out.println(s);
        }

        for (String s : regular) {
            System.out.println(s);
        }
    }
}