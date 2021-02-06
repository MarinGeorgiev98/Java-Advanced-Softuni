import java.util.*;

public class AvgStGrades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeMap<String, List<Double>> students = new TreeMap<>();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            String name = input[0];
            Double grade = Double.parseDouble(input[1]);
            students.putIfAbsent(name, new ArrayList<>());
            students.get(name).add(grade);
        }

        for (String studentName : students.keySet()) {
            System.out.printf("%s -> ", studentName);
            double sum = 0;
            for (Double grade : students.get(studentName)) {
                sum += grade;
                System.out.printf("%.2f ", grade);
            }

            System.out.printf("(avg: %.2f)", sum / students.get(studentName).size());
            System.out.println();
        }
    }
}