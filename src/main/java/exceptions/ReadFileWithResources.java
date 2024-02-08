package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileWithResources {

    public static void main(String[] args) {
        // Specify the path of the file you want to read
        String filePath = "C:\\Users\\Rithika Reddy\\Desktop\\class 15.txt";

        // Using try-with-resources to automatically close the file stream
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read and print each line until the end of the file
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            // Handle exceptions (e.g., file not found, I/O errors)
            e.printStackTrace();
        }
    }
}
