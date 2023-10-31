package java_week8_homework;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number
 */
public class Programme_6_NumberTriangle {
    public static void main(String[] args) {
        //Scanner to input value from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of raw required: ");
        int rowNumber = scanner.nextInt();
        trianglePrint(rowNumber);
        scanner.close(); //close the scanner object
    }

    public static void trianglePrint(int r) {

        //use of nested for loop
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
