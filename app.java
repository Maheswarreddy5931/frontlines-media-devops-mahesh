import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        // Create a File object representing a file named "myFile.txt"
        File myFile = new File("myFile.txt");

        try {
            // Check if the file already exists
            if (myFile.exists()) {
                System.out.println("File already exists: " + myFile.getName());
            } else {
                // Attempt to create a new file
                if (myFile.createNewFile()) {
                    System.out.println("File created: " + myFile.getName());
                } else {
                    System.out.println("File could not be created.");
                }
            }
        } catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
