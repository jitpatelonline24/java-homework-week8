package java_week8_homework;

import java.util.Scanner;

public class Programme_9_FibonacciNumber {
    /**
     * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
     */

    //main method
    public static void main(String[] args) {
        //Scanner for input number from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for Fibonacci Series: ");
        int number = scanner.nextInt();
        fibonacci(number);
        scanner.close();  //close the scanner
    }
    public static void fibonacci(int number1) {
        int firstNum = 1;
        int secondNum = 1;

        //using for loop for logic
        for (int i = 1; i <= number1; ++i) {
            System.out.print(firstNum + " ");


            //Calculating fibonacci numbers with two numbers
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}
