package GuviTaskFour;
import java.util.Scanner;

public class ExceptionOutOfBounce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demonstrating ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.print("Enter an index to access the array (0-4): ");
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Invalid index!");
        }

        // Demonstrating StringIndexOutOfBoundsException
        try {
            System.out.print("\nEnter a string: ");
            String input = scanner.next();
            System.out.print("Enter an index to access the character in the string: ");
            int index = scanner.nextInt();
            System.out.println("Character at index " + index + ": " + input.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: Invalid index!");
        }

        scanner.close();
    }
}


