import java.util.*;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> history = new ArrayDeque<>();

        String input = scan.nextLine();

        String current = "";

        while (!input.equals("Home")) {
            boolean errorCheck = false;
            if(input.equals("back")) {
                if(history.size() < 2) {
                    System.out.println("no previous URLs");
                    errorCheck = true;
                }
                else {
                    history.pop();
                }
            }
            else {
                history.push(input);
            }
            if(!errorCheck) {
                System.out.println(history.peek());
            }
            input = scan.nextLine();
        }
    }
}