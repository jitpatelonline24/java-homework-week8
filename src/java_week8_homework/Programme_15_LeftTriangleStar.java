package java_week8_homework;

import java.util.Scanner;

/**
 * Display left angle triangle of * using nested for loops
 */
public class Programme_15_LeftTriangleStar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int a = scanner.nextInt();
        triangle(a);
        scanner.close();
    }

    public static void triangle(int a) {
        for (int i = 1; i <= a; i++) {
            for (int k = 1; k <= i + 1; k++) {
                System.out.print("");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}