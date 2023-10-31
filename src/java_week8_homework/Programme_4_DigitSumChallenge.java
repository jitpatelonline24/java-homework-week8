package java_week8_homework;

import java.util.Scanner;

/**
 * Digit Sum Challenge
 */
public class Programme_4_DigitSumChallenge {

    public static void main(String[] args) {
        //scanner declare for input value from console

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 Digit number: ");
        int number = scanner.nextInt();
        sumDigits(number);
        scanner.close(); //close the scanner
    }

    public static void sumDigits(int number) {
        if (number >= 10) {
            int sum = 0;
            while (number > 0) {
                sum = sum + (number % 10); //to get last digit answer sum with previous last digit
                number = number / 10; //to get remaining number after removing last digit
            }
            System.out.println("Addition of digits is: " + sum);
        }
        System.out.println(-1); //if number is not greater than to 10 then return -1
    }
}