import java.util.*;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean isFound = false;
        int[] input = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = input[0];
        int cols = input[1];
        int[][] matrix = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            String[] tokens = scan.nextLine().split(" ");
            for (int c = 0; c < tokens.length; c++) {
                matrix[r][c] = Integer.parseInt(tokens[c]);
            }
        }

        int number = Integer.parseInt(scan.nextLine());

        for (int r = 0; r < matrix.length; r++) {
            int[] array = matrix[r];
            for (int c = 0; c < array.length; c++) {
                if (array[c] == number) {
                    System.out.println(String.format("%d %d", r, c));
                    isFound = true;
                }
            }
        }

        if (!isFound) {
            System.out.println("not found");
        }
    }
}