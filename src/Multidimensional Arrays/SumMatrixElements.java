import java.util.*;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int[] input = Arrays.stream(scan.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = input[0];
        int cols = input[1];
        int[][] matrix = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            String[] tokens = scan.nextLine().split(", ");
            for (int c = 0; c < tokens.length; c++) {
                int number = Integer.parseInt(tokens[c]);
                sum = sum + number;
                matrix[r][c] = number;
            }
        }

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }
}