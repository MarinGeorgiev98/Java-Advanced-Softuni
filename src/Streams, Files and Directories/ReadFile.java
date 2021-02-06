import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        String path = "C:\\Users\\User1\\Downloads\\04. Java-Advanced-Files" +
                "-and-Streams-Lab-Resources\\" + "input.txt";
        FileInputStream in = new FileInputStream(path);
        int oneByte = in.read();
        while (oneByte >= 0) {
            System.out.print(Integer.toBinaryString(oneByte) + " ");
            oneByte = in.read();
        }
    }
}