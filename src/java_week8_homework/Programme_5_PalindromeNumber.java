package java_week8_homework;

import java.util.Scanner;

/**
 * Palindrome Number
 */
public class Programme_5_PalindromeNumber {

    public static void main(String[] args) {

        //main method to declare the scanner for input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        isPalindrome(num);
        scanner.close(); //close the scanner object
    }

    public static void isPalindrome(int num) {
        int reverseNum = 0, remainder;

        //store the number to originalNum
        int originalNum = num;

        //get the reverse of originalNum
        //store it in variable
        while (num != 0) {
            remainder = num % 10;
            reverseNum = reverseNum * 10 + remainder;
            num /= 10;
        }
        if (originalNum == reverseNum) {
            System.out.println(originalNum + " is Palindrome:");
        } else {
            System.out.println(originalNum + " is not Palindrome:");
        }
    }
}
