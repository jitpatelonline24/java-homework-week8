package java_week8_homework;

import java.util.Scanner;

/**
 * First and last digit sum
 */
public class Programme_7_FirstAndLastDigitSum {

    public static void main(String[] args) {
        //Scanner declare value from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 Digit number:");
        int number = scanner.nextInt();
        int sum = sumFirstAndLastDigit(number);
        System.out.println("Sum of First Digit and Last Digit: " + sum);
        scanner.close(); //scanner close object
    }

    public static int sumFirstAndLastDigit(int n) {
        int firstDigit = 0;
        int lastDigit = 0;

        if (n >= 0) {
            lastDigit = n % 10; // to get the last digit

            //to get the first digit
            while (n != 0) {
                firstDigit = Math.abs(n % 10);
                n = n / 10;
            }
            return (lastDigit + firstDigit);
        }
        return -1;  //if negative enter -1
    }
}