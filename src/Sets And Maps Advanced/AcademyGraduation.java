import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeMap<String, Double> studentScores = new TreeMap<>();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            Double avgScore = Arrays.stream(scan.nextLine().split(" "))
                    .mapToDouble(Double::parseDouble)
                    .average().getAsDouble();
            studentScores.put(name, avgScore);
        }

        for (String name : studentScores.keySet()) {
            System.out.printf("%s is graduated with %f%n", name,
                    studentScores.get(name));
        }
    }
}