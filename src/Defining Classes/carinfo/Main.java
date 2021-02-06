package carinfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            Car car = new Car();
            String[] input = scan.nextLine().split(" ");
            car.setMake(input[0]);
            car.setModel(input[1]);
            car.setHorsePower(Integer.parseInt(input[2]));
            System.out.println(car.carInfo());
        }
    }
}