import java.util.*;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");
        int size = Integer.parseInt(input[0]);
        String pattern = input[1];
        int[][] matrix;

        if (pattern.equals("A")) {
            matrix = fillPatternA(size);

        }
        else {
            matrix = fillPatternB(size);
        }

        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] fillPatternA(int size) {
        int[][] matrix = new int[size][size];
        int sum = 1;
        for (int c = 0; c < size; c++) {
            for (int r = 0; r < size; r++) {
                matrix[r][c] = sum;
                sum = sum + 1;
            }
        }
        return matrix;
    }

    private static int[][] fillPatternB(int size) {
        int[][] matrix = new int[size][size];
        int sum = 1;
        for (int c = 0; c < size; c++) {
            if (c % 2 == 0) {
                for (int r = 0; r < size; r++) {
                    matrix[r][c] = sum++;
                }
            }
            else {
                for (int r = size - 1; r >= 0; r--) {
                    matrix[r][c] = sum++;
                }
            }
        }
        return matrix;
    }
}