package GuviTaskFour;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListToArrayExample {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create a List to store user inputs
        List<String> list = new ArrayList<>();

        System.out.println("Enter the number of elements in the list:");
        int n = scanner.nextInt(); // Read the number of elements
        scanner.nextLine(); // Consume the newline character

        // Read n elements from the user
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            String element = scanner.nextLine();
            list.add(element);
        }

        // Convert the List to an array
        String[] array = list.toArray(new String[0]);

        // Print the array
        System.out.println("Array elements:");
        for (String element : array) {
            System.out.println(element);
        }

        scanner.close();
    }
}
