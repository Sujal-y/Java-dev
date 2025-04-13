package src.oops_labs.lab6;

import java.util.*;
import java.util.Arrays;

class StringOperations{

    // Method to check if a string is palindrome
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

    // Method to sort string alphabetically
    public static String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
public class prog1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            int choice;
            do {
                System.out.println("\nMenu:");
                System.out.println("1. Check if palindrome");
                System.out.println("2. Sort string alphabetically");
                System.out.println("3. Reverse the string");
                System.out.println("4. Concatenate original and reversed string");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        if (StringOperations.isPalindrome(input)) {
                            System.out.println("The string is a palindrome.");
                        } else {
                            System.out.println("The string is not a palindrome.");
                        }
                        break;
                    case 2:
                        System.out.println("Alphabetically sorted string: " + StringOperations.sortString(input));
                        break;
                    case 3:
                        System.out.println("Reversed string: " + StringOperations.reverseString(input));
                        break;
                    case 4:
                        System.out.println("Concatenated string: " + input + StringOperations.reverseString(input));
                        break;
                    case 5:
                        System.out.println("Exiting program.");
                        break;
                    default:
                        System.out.println("Invalid choice! Please enter a valid option.");
                }
            } while (choice != 5);

            scanner.close();
        }

    }
