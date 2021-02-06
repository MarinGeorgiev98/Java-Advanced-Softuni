import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] rowAndCols = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = rowAndCols[0];
        int cols = rowAndCols[1];
        int[][] firstMatrix = readMatrix(rows, cols, scan);

        rowAndCols = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        rows = rowAndCols[0];
        cols = rowAndCols[1];
        int[][] secondMatrix = readMatrix(rows, cols, scan);

        if (areEqual(firstMatrix, secondMatrix)) {
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
    }

    private static boolean areEqual(int[][] firstMatrix, int[][] secondMatrix) {
        boolean areEqual = true;
        if (firstMatrix.length != secondMatrix.length) {
            areEqual = false;
        }
        else {
            for (int r = 0; r < firstMatrix.length; r++) {
                int[] firstArray = firstMatrix[r];
                int[] secondArray = secondMatrix[r];
                if (firstArray.length != secondArray.length) {
                    areEqual = false;
                    break;
                }
                else {
                    for (int c = 0; c < firstArray.length; c++) {
                        if(firstArray[c] != secondArray[c]) {
                            return  false;
                        }
                    }
                }
            }
        }
        return areEqual;
    }

    private static int[][] readMatrix(int rows, int cols, Scanner scan) {
        int[][] matrix = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            String[] elements = scan.nextLine().split(" ");
            for (int c = 0; c < elements.length; c++) {
                int number = Integer.parseInt(elements[c]);
                matrix[r][c] = number;
            }
        }
        return matrix;
    }
}