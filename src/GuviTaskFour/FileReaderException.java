package GuviTaskFour;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file name to read: ");
        String fileName = scanner.nextLine();

        try {
            // Attempt to open the file
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            System.out.println("File content:");
            // Read and print file content
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            // Handle the case where the file doesn't exist
            System.out.println("Error:FileNotFoundException - Please make sure the file exists.");
        } finally {
            scanner.close();
        }
    }
}

