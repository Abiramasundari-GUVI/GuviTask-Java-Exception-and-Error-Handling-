package GuviTaskFour;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking input from the user
            System.out.print("Enter a number to divide: ");
            int number = scanner.nextInt();

            // Dividing by zero
            int result = number / 0;

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catching the arithmetic exception
            System.out.println("Exception caught: Cannot divide a number by zero.");
        } finally {
            // Executing the final block
            System.out.println("Code execution is done.");
        }

        scanner.close();
    }
}

