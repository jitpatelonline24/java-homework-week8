package java_week8_homework;

import java.util.Scanner;

/**
 * Shared Digit
 */
public class Programme_13_SharedDigit {

    public static boolean hasSharedDigit(int fn, int sn) {

        //condition is number should be between 10-99
        if ((fn >= 10 && fn <= 99) &&(sn >= 10 && sn <= 99)) {
            int firstDigitFirstNumber = (fn / 10);
            int lastDigitFirstNumber = (fn % 10);
            int firstDigitSecondNumber = (sn / 10);
            int lastDigitSecondNumber = (sn % 10);
            return (firstDigitFirstNumber == firstDigitSecondNumber) || (firstDigitFirstNumber == lastDigitSecondNumber)
                    || (lastDigitFirstNumber==lastDigitSecondNumber);
        }
        return false;
    }

        public static void main (String[]args){
            //Scanner for input value from console
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter First number: (10-99): ");
            int firstNumber = scanner.nextInt();
            System.out.println("Enter Second Number: (10-99):");
            int secondNumber = scanner.nextInt();
            boolean result = hasSharedDigit(firstNumber, secondNumber);
            System.out.println(result);
            scanner.close();
        }
}

