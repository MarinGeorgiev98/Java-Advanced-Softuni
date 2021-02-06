import java.util.*;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = Integer.parseInt(scan.nextLine());
        int[][] matrix = new int[rows][];

        for (int r = 0; r < rows; r++) {
            matrix[r] = Arrays.stream(scan.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        int row = scan.nextInt();
        int col = scan.nextInt();
        int wrongValue = matrix[row][col];

        List<Integer> values = new ArrayList<>();
        List<int[]> indexes = new ArrayList<>();

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == wrongValue) {
                    int validValue = getValidValue(matrix, r, c, wrongValue);
                    values.add(validValue);
                    indexes.add(new int[]{r, c});
                }
            }
        }

        for (int i = 0; i < values.size(); i++) {
            matrix[indexes.get(i)[0]][indexes.get(i)[1]] = values.get(i);
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int getValidValue(int[][] matrix, int r, int c, int wrongValue) {
        int sum = 0;
        if (isInBounds(r + 1, c, matrix) && matrix[r + 1][c] != wrongValue) {
            sum += matrix[r + 1][c];
        }
        if (isInBounds(r - 1, c, matrix) && matrix[r - 1][c] != wrongValue) {
            sum += matrix[r - 1][c];
        }
        if (isInBounds(r, c + 1, matrix) && matrix[r][c + 1] != wrongValue) {
            sum += matrix[r][c + 1];
        }
        if (isInBounds(r, c - 1, matrix) && matrix[r][c - 1] != wrongValue) {
            sum += matrix[r][c - 1];
        }
        return sum;
    }

    private static boolean isInBounds(int r, int c, int [][] matrix) {
        return r >= 0 && r < matrix.length && c >= 0 && c < matrix[r].length;
    }
}