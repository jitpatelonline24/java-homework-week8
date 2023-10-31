package java_week8_homework;

import java.util.Scanner;

public class Programme_12_PrimeNumber {

    //main method scanner declaration for input value from console
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        String message = isPrime(num);
        System.out.println(message);
        scanner.close();
    }

    public static String isPrime(int number) {
        if (number <= 1)
            return "Invalid Input";

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return "not a Prime Number: ";
            }
        }
        return "Prime Number:";
    }
}
