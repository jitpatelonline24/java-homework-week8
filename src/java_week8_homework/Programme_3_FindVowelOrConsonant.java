package java_week8_homework;


import java.util.Scanner;

/**
 * . Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.  * For eg: * Input an alphabet:  * Expected Output:  * Input letter is Consonant
 */
public class Programme_3_FindVowelOrConsonant {

    public static void main(String[] args) {
        //main method for input value from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Alphabet: ");
        String input = scanner.next().toLowerCase(); //convert input to lowercase

        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")
                || input.equals("o") || input.equals("u");

        if (input.length() > 1) {
            System.out.println("Error. Not a Single Character");
        } else if (!(lowercase)) {
            System.out.println("Error. (Entered value is not a character");
        } else if (vowels) {
            System.out.println("Input Letter is Vowel:");
        } else {
            System.out.println("Input letter is Consonant");
        }
        scanner.close();  //close the scanner object
    }
}