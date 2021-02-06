import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];
        for (int r = 0; r < rows; r++) {
            String[] inputArr = scan.nextLine().split(" ");
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = inputArr[c];
            }
        }
        String command = scan.nextLine();
        while (!command.equals("END")) {
            String[] tokens = command.split(" ");
            if (tokens[0].equals("swap")) {
                int a = Integer.parseInt(tokens[1]);
                int b = Integer.parseInt(tokens[2]);
                int c = Integer.parseInt(tokens[3]);
                int d = Integer.parseInt(tokens[4]);
                if (isInBounds(a, b, c, cols, d, rows) && tokens.length == 5) {
                    String temp = matrix[a][b];
                    matrix[a][b]= matrix[c][d];
                    matrix[c][d] = temp;
                    for (int r = 0; r < rows; r++) {
                        for (int col = 0; col < cols; col++) {
                            System.out.print(matrix[r][col] + " ");
                        }
                        System.out.println();
                    }
                }
                else {
                    System.out.println("Invalid input!");
                }
            }
            else {
                System.out.println("Invalid input!");
            }
            command = scan.nextLine();
        }
    }

    private static boolean isInBounds(int a, int b, int c,
                                      int cols, int d, int rows) {
        return a < rows && b < cols
                && c < rows && d < cols;
    }
}