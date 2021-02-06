import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        String basePath = "C:\\Users\\User1\\Downloads\\04. Java-Advanced-Files" +
                "-and-Streams-Lab-Resources\\";
        String inputPath = basePath + "input.txt";
        String outputPath = basePath + "output2.txt";

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(inputPath);
            outputStream = new FileOutputStream(outputPath);

            int readByte = inputStream.read();
            while (readByte >= 0) {
                if (readByte == ' ' || readByte == '\n') {
                    outputStream.write(readByte);
                }
                else {
                    String digits = String.valueOf(readByte);
                    for (int i = 0; i < digits.length(); i++) {
                        outputStream.write(digits.charAt(i));
                    }
                }
                readByte = inputStream.read();
            }
        }
        catch (IOException e) {
            System.out.println("Really bad!");
        }
        finally {
            if (inputStream != null && outputStream != null) {
                inputStream.close();
                outputStream.close();
            }
        }
    }
}