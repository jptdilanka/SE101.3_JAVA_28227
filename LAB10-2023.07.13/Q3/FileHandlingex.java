package com.mycompany.filehandlingex;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileHandlingex {

    public static void main(String[] args) {
        String fileName = "non_existent_file.txt";

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            // Read the file (if it exists)
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error: File '" + fileName + "' not found.");
        }
    }
}
