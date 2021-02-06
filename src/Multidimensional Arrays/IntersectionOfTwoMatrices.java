import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = Integer.parseInt(scan.nextLine());
        int cols = Integer.parseInt(scan.nextLine());
        char[][] firstMatrix = new char[rows][cols];
        for (int r = 0; r < rows; r++) {
            String[] elements = scan.nextLine().split(" ");
            for (int c = 0; c < elements.length; c++) {
                firstMatrix[r][c] = elements[c].charAt(0);
            }
        }

        char[][] secondMatrix = new char[rows][cols];
        for (int r = 0; r < rows; r++) {
            String[] elements = scan.nextLine().split(" ");
            for (int c = 0; c < elements.length; c++) {
                secondMatrix[r][c] = elements[c].charAt(0);
            }
        }

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (firstMatrix[r][c] == secondMatrix[r][c]) {
                    System.out.print(firstMatrix[r][c] + " ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}