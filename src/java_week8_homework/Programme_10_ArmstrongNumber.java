package java_week8_homework;

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 */
public class Programme_10_ArmstrongNumber {

    //Main method to declare scanner for input value from console
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        isArmstrongNumber(num);
        scanner.close(); //close the scanner object
    }

    public static void isArmstrongNumber(int number) {
        int originalNumber, remainder, result = 0;
        originalNumber = number; //taking a copy of original number for comparison

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        //comparing original number and result number
        if (result == number)
            System.out.println(number + " is an Armstrong number: ");
        else
            System.out.println(number + " is not an Armstrong number: ");
    }
}
