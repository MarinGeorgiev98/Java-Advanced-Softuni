import java.util.*;

public class SeashellTreasure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String[][] beach = new String[6][];
        for (int i = 0; i < n; i++) {
            beach[i] = scan.nextLine().split(" ");
        }

        List<String> collectedShells = new LinkedList<>();

        int stolenShells = 0;
        String input = scan.nextLine();

        while (!input.equals("Sunset")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];
            int row = Integer.parseInt(tokens[1]);
            int col = Integer.parseInt(tokens[2]);
            switch (command) {
                case "Collect":
                    if (isValidIndex(row, col, beach)) {
                        if (!beach[row][col].equals("-")) {
                            collectedShells.add(beach[row][col]);
                            beach[row][col] = "-";
                        }
                    }
                    break;
                case "Steal":
                    String direction = tokens[3];
                    if (isValidIndex(row, col, beach)) {
                        if (!beach[row][col].equals("-")) {
                            stolenShells++;
                            beach[row][col] = "-";
                        }
                        stolenShells += stealing (beach, row, col, direction);
                    }
                    break;
            }
            input = scan.nextLine();
        }

        printMatrix(beach);
        System.out.print(String.format("Collected seashells: %d",
                collectedShells.size()));
        if (!collectedShells.isEmpty()) {
            System.out.print(" -> ");
            System.out.println(String.join(", ", collectedShells));
        }
        else {
            System.out.println();
        }
        System.out.printf("Stolen seashells: %d%n", stolenShells);
    }

    private static int stealing(String[][] beach, int row, int col, String direction) {
        int counter = 0;
        switch (direction) {
            case "up":
                for (int i = row; i <= row - 3; i--) {
                    if (isValidIndex(i, col, beach)) {
                        if (!beach[i][col].equals("-")) {
                            counter++;
                            beach[i][col] = "-";
                        }
                    }
                }
                break;
            case "down":
                for (int i = row; i <= row + 3; i++) {
                    if (isValidIndex(i, col, beach)) {
                        if (!beach[i][col].equals("-")) {
                            counter++;
                            beach[i][col] = "-";
                        }
                    }
                }
                break;
            case "right":
                for (int i = col; i <= col + 3; i++) {
                    if (isValidIndex(row, i, beach)) {
                        if (!beach[row][i].equals("-")) {
                            counter++;
                            beach[row][i] = "-";
                        }
                    }
                }
                break;
            case "left":
                for (int i = col; i <= col - 3; i--) {
                    if (isValidIndex(row, i, beach)) {
                        if (!beach[row][i].equals("-")) {
                            counter++;
                            beach[row][i] = "-";
                        }
                    }
                }
                break;
        }
        return counter;
    }

    private static boolean isValidIndex(int row, int col, String[][] beach) {
        if (row >= 0 && row < beach.length) {
            return col >= 0 && col < beach[row].length;
        }
        return false;
    }

    private static void printMatrix(String[][] beach) {
        for (String[] strings : beach) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}