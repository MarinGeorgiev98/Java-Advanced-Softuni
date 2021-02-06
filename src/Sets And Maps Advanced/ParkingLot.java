import java.util.*;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashSet<String> carNums = new LinkedHashSet<>();
        String command = scan.nextLine();

        while (!command.equals("END")) {
            String[] tokens = command.split(", ");
            String direction = tokens[0];
            String carNumber = tokens[1];
            if (direction.equals("IN")) {
                carNums.add(carNumber);
            }
            else {
                carNums.remove(carNumber);
            }
            command = scan.nextLine();
        }

        if (carNums.size() == 0) {
            System.out.println("Parking Lot is Empty");
        }
        else {
            for (String carNum : carNums) {
                System.out.println(carNum);
            }
        }
    }
}