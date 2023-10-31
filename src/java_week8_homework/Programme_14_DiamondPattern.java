package java_week8_homework;

import java.util.Scanner;

/**
 * +
 * Write a program in Java to display the pattern like a diamond.
 * While loop
 */
public class Programme_14_DiamondPattern {

    public static void main(String[] args) {
        //scanner declaration for input value from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows to print: ");
        int number = scanner.nextInt();
        System.out.println("Enter Symbol:  ");
        char c = scanner.next().charAt(0);
        printDiamond();
        scanner.close();
    }

    public static void printDiamond() {
        //variable initialize to get the row to print star
        int number = 7;
        int a = 1;  //row value
        int b; //declare column value

        while (a <= number) {
            b = 1;

            //Inner loop declaration 1
            while (b <= number - a) {
                System.out.print(" ");
                b++;
            }
            b = 1;
            //Inner loop declaration 2
            while (b <= a * 2 - 1) {
                System.out.print("*");
                b++;
            }
            System.out.println();
            a++;
        }
        // for decrease number declaration
        a = number - 1;

        while (a > 0) {
            b = 1;
            while (b <= number - a) {
                System.out.print(" ");
                b++;
            }
            b = 1;
            //Inner loop 2
            while (b <= a * 2 - 1) {
                System.out.print("*");
                b++;
            }
            System.out.println();
            a--;
        }
    }
}

