package String;

import java.util.Scanner;

public class String_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. User-defined string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // 2. Print original string
        System.out.println("Original string: " + str);

        // 3. Convert to uppercase and lowercase
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // 4. Find the length of the string
        System.out.println("Length of string: " + str.length());

        // 5. Print first and last character (only if not empty)
        if (!str.isEmpty()) {
            System.out.println("First character: " + str.charAt(0));
            System.out.println("Last character: " + str.charAt(str.length() - 1));
        } else {
            System.out.println("String is empty!");
        }

        // 6. Check if the string contains letter 'a'
        System.out.println("Contains 'a': " + str.contains("a"));
    }
}