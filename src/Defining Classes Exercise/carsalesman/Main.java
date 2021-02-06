package carsalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, Engine> engineMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            Engine engine;
            String[] input = scan.nextLine().split(" ");
            String model = input[0];
            int power = Integer.parseInt(input[1]);
            if (input.length == 2) {
                engine = new Engine(model, power);
            }
            else if (input.length == 4) {
                int displacement = Integer.parseInt(input[2]);
                engine = new Engine(model, power, displacement, input[3]);
            }
            else {
                try {
                    int displacement = Integer.parseInt(input[2]);
                    engine = new Engine(model, power, displacement);
                }
                catch (NumberFormatException ex) {
                    String efficiency = input[2];
                    engine = new Engine(model, power, efficiency);
                }
            }
            engineMap.put(model, engine);
        }

        List<Car> cars = new ArrayList<>();

        int j = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < j; i++) {
            Car car;
            String[] input = scan.nextLine().split(" ");
            String model = input[0];
            String engineModel = input[1];
            if (input.length == 2) {
                car = new Car(model, engineMap.get(engineModel));
            }
            else if (input.length == 4) {
                int weight = Integer.parseInt(input[2]);
                car = new Car(model, engineMap.get(engineModel), weight, input[3]);
            }
            else {
                try {
                    int weight = Integer.parseInt(input[2]);
                    car = new Car(model, engineMap.get(engineModel), weight);
                }
                catch (NumberFormatException ex) {
                    String color = input[2];
                    car = new Car(model, engineMap.get(engineModel), color);
                }
            }
            cars.add(car);
        }

        cars
                .forEach(System.out::println);
    }
}