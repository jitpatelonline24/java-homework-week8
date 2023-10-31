package java_week8_homework;

import java.util.Scanner;

/**
 * Even Digit Sum
 */
public class Programme_11_EvenDigitSum {
    public static int sumEvenDigits(int number) {
        int digit;
        int sum = 0;

        //Process for positive number
        if (number >= 0) {
            while (number != 0) {
                digit = number % 10;  //taking the last digit

                //divide the number by 2 to check even number
                if (digit % 2 == 0) {
                    sum = sum + digit;
                }
                number = number / 10;
            }
            return sum;
        } else {
            return -1; //if the number is negative than returns -1
        }
    }

    public static void main(String[] args) {
        //Scanner declaration for input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Even number sum is : "+ sumEvenDigits(num));
        scanner.close();
    }
}
