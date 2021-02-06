import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rowsAndCols = Integer.parseInt(scan.nextLine());
        int[][] matrix = new int[rowsAndCols][rowsAndCols];
        for (int r = 0; r < rowsAndCols; r++) {
            String[] input = scan.nextLine().split(" ");
            for (int c = 0; c < rowsAndCols; c++) {
                matrix[r][c] = Integer.parseInt(input[c]);
            }
        }
        int primarySum = 0;
        int secondarySum = 0;
        for (int i = 0; i < rowsAndCols; i++) {
            primarySum += matrix[i][i];
        }
        for (int i = 0; i < rowsAndCols; i++) {
            secondarySum += matrix[i][rowsAndCols - 1 - i];
        }

        int difference = Math.abs(primarySum - secondarySum);
        System.out.println(difference);
    }
}