package GuviTaskFour;

import java.util.*;

public class EmployeeTreeMap {

    public static void main(String[] args) {
        // Create a TreeMap to store employee IDs and names
        TreeMap<Integer, String> employeeMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee details (ID and Name). Type 'done' to finish:");

        // Input employee details
        while (true) {
            System.out.print("Enter Employee ID (or type 'done'): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                int id = Integer.parseInt(input); // Parse ID as an integer
                System.out.print("Enter Employee Name: ");
                String name = scanner.nextLine();
                employeeMap.put(id, name);
            } catch (NumberFormatException e) {
                System.out.println("Invalid ID. Please enter a numeric value.");
            }
        }

        // Extract names and sort them alphabetically
        List<String> names = new ArrayList<>(employeeMap.values());
        Collections.sort(names);

        // Print names in alphabetical order
        System.out.println("\nEmployee Names in Alphabetical Order:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}

