import java.util.*;

public class MaxSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] sizes = Arrays.stream(scan.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = sizes[0];
        int cols = sizes[1];
        int[][] matrix = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            matrix[r] = Arrays.stream(scan.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        int maxValue = Integer.MIN_VALUE;
        int[][] maxMatrix = new int[2][2];
        for (int r = 0; r < rows - 1; r++) {
            for (int c = 0; c < cols - 1; c++) {
                int right = matrix[r][c + 1];
                int below = matrix[r + 1][c];
                int diagonal = matrix[r + 1][c + 1];
                int sum = matrix[r][c] + right + below + diagonal;
                if (maxValue < sum) {
                    maxValue = sum;
                    maxMatrix[0][0] = matrix[r][c];
                    maxMatrix[0][1] = right;
                    maxMatrix[1][0] = below;
                    maxMatrix[1][1] = diagonal;
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(maxMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(maxValue);
    }
}