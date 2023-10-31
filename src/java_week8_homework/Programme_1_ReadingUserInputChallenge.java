package java_week8_homework;

import java.util.Scanner;

public class Programme_1_ReadingUserInputChallenge {
    /**
     * Read 10 numbers from the console entered by the user and print the sum of those
     * numbers
     */


    public static void main(String[] args) {

        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int totalSum = 0;
        while (true) {
            int order = counter + 1;
            System.out.println("Enter number #  " + order + ": ");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                totalSum += number;
                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid Number: ");
            }
            scanner.nextLine(); //handle end of line (enter key)
        }
        System.out.println("Total Sum of all numbers is = " + totalSum);
        //Closing the scanner object
        scanner.close();
    }

    }


