package GuviTaskFour;

import java.util.Scanner;

//Custom exception class
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

public class Main {
 // Method to check age
 public static void checkAge(int age) throws InvalidAgeException {
     if (age < 18) {
         throw new InvalidAgeException("InvalidAgeException:Age must be 18 or above.");
     }
 }

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter your age: ");
     int age = scanner.nextInt();

     try {
         checkAge(age);
         System.out.println("Age is valid!");
     } catch (InvalidAgeException e) {
         System.out.println("Error: " + e.getMessage());
     } finally {
         scanner.close();
     }
 }
}
