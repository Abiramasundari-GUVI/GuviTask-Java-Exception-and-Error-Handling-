package GuviTaskFour;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter strings to add to the ArrayList (type 'done' to stop):");

        // Add user input to the ArrayList
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            stringList.add(input);
        }

        // Display the ArrayList before clearing
        System.out.println("ArrayList before removing elements: " + stringList);

        // Remove all elements from the ArrayList
        stringList.clear();

        // Display the ArrayList after clearing
        System.out.println("ArrayList after removing elements: " + stringList);

        scanner.close();
    }
}

