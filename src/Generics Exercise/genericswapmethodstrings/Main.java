package genericswapmethodstrings;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Box<String>> boxes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Box<String> box = new Box<>(scan.nextLine());
            boxes.add(box);
        }
        String[] input = scan.nextLine().split(" ");
        int firstIndex = Integer.parseInt(input[0]);
        int secondIndex = Integer.parseInt(input[1]);
        Box<String> tempBox = boxes.get(firstIndex);
        boxes.set(firstIndex, boxes.get(secondIndex));
        boxes.set(secondIndex, tempBox);
        boxes.forEach(System.out::println);
    }
}