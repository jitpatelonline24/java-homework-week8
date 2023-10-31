package java_week8_homework;

import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered
 */
public class Programme_2_MinAndMaxInput {

    public int max(int[] array) {
        int max = 0;

        for(int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    //find min number in an user entered array

    public int min(int[] array) {
        int min = array[0];

        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    //main method to calling instance method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a total number: ");
        int arraySize = scanner.nextInt(); //declaring array size

        // store array method

        int[] array1 = new int[arraySize];
        for (int i = 0; i <= arraySize - 1; i++) {
            System.out.println("Enter Number: "+(i+1));
            array1[i] = scanner.nextInt();
        }
        Programme_2_MinAndMaxInput minAndMaxInput = new Programme_2_MinAndMaxInput();
        System.out.println("Maximum value in Array is: " + minAndMaxInput.max(array1));
        System.out.println("Minimum value in Array is: " + minAndMaxInput.min(array1));
    }
}