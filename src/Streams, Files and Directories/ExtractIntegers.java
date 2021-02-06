import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String basePath = "C:\\Users\\User1\\Downloads\\04. Java-Advanced-Files" +
                "-and-Streams-Lab-Resources\\";
        String inputPath = basePath + "input.txt";
        String outputPath = basePath + "integers.txt";


        try (FileInputStream inputStream = new FileInputStream(inputPath);
             FileOutputStream outputStream = new FileOutputStream(outputPath)) {
            Scanner scanner = new Scanner(inputStream);
            PrintStream writer = new PrintStream(outputStream);
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    writer.println(number);
                }
                scanner.next();
            }
        }
        catch (IOException e) {
            System.out.println("Really bad!");
        }
    }
}