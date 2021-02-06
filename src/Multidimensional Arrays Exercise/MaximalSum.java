import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][cols];
        int maxSum = Integer.MIN_VALUE;

        for (int r = 0; r < rows; r++) {
            String[] inputArr = scan.nextLine().split(" ");
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = Integer.parseInt(inputArr[c]);
            }
        }

        int[][] maxMatrix = new int[3][3];

        for (int r = 0; r < rows - 2; r++) {
            for (int c = 0; c < cols - 2; c++) {
                int a = matrix[r][c];
                int b = matrix[r + 1][c];
                int cc = matrix[r + 2][c];
                int d = matrix[r][c + 1];
                int e = matrix[r][c + 2];
                int f = matrix[r + 1][c + 1];
                int g = matrix[r + 1][c + 2];
                int h = matrix[r + 2][c + 1];
                int i = matrix[r + 2][c + 2];
                int temp = a + b + cc + d + e + f + g + h + i;
                if (maxSum < temp) {
                    maxSum = temp;
                    maxMatrix[0][0] = a;
                    maxMatrix[0][1] = d;
                    maxMatrix[0][2] = e;
                    maxMatrix[1][0] = b;
                    maxMatrix[1][1] = f;
                    maxMatrix[1][2] = g;
                    maxMatrix[2][0] = cc;
                    maxMatrix[2][1] = h;
                    maxMatrix[2][2] = i;
                }
            }
        }

        System.out.printf ("Sum = %d", maxSum);
        System.out.println();
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(maxMatrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}