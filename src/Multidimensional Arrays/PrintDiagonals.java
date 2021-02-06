import java.util.*;

public class PrintDiagonals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rowsAndCols = Integer.parseInt(scan.nextLine());
        int[][] matrix = new int[rowsAndCols][rowsAndCols];
        for (int r = 0; r < rowsAndCols; r++) {
            matrix[r] = Arrays.stream(scan.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        for (int i = 0; i < rowsAndCols; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
        int c = 0;
        for (int i = rowsAndCols - 1; i >= 0 ; i--) {
            System.out.print(matrix[i][c] + " ");
            c++;
        }
    }
}