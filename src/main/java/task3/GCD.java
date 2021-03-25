package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Main class of program for finding the greatest common divisor<br><br>
 *
 * <b>Why is this program needed?</b><br>
 * The purpose of this program is finding the greatest common divisor for four values.<br>
 * <b>How to use this program?</b><br>
 * You need to run this program and follow the directions in the console.
 * If the input data is valid, the calculation result will be displayed in the console,
 * otherwise, error information will be displayed.<br>
 * <b>Usage example</b><br>
 * You need to calculate the GCD of 35, 150, 95, 250. Run the program, then enter the numbers.
 * After calculating you will see message in the console: НОД = 5, it is GCD.
 *
 * @author Michael Pilipenko
 * @version 1.0
 */
public class GCD {

    /**
     * The entry point of application. At this point, the program expects user input, checks it for validity,
     * if the input is valid, then the numbers are transferred to the calculation and the result is displayed
     * in the console, otherwise information about the error is displayed.
     *
     * @param args the input arguments. Not used in this version.
     */
    public static void main(String[] args) {
        System.out.print("Введите 4 числа через энтер: ");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            int c = Integer.parseInt(br.readLine());
            int d = Integer.parseInt(br.readLine());
            System.out.print("НОД = " + calculateGCD(a, b, c, d));
        } catch (IOException ioE) {
            System.out.println("Неправильный ввод значений.");
            ioE.printStackTrace();
        }
    }

    /**
     *This method calculates the gcd.<br>
     * <b>The principle of the method</b><br>
     * The method tries to divide each value by the smallest, if division is obtained without a remainder,
     * then this smallest number is GCD, otherwise the method tries to divide the numbers by the minimum
     * minus one and so on, until there is a number at which division occurs without a remainder.
     *
     * @param a the first number
     * @param b the second number
     * @param c the third number
     * @param d the fourth number
     * @return the GCD of four numbers
     */
    public static int calculateGCD(int a, int b, int c, int d) {
        boolean isFounded = false;
        int[] mass = new int[]{a, b, c, d};
        int nod = 0;
        int min = findMinABSNotZeroElement(mass);

        for (int i = min; i >= 1; i--) {
            for (int k : mass) {
                isFounded = (k % i) == 0;
                if (!isFounded) {
                    break;
                }
            }

            if (isFounded) {
                nod = i;
                break;
            }
        }

        return nod;
    }

    private static int findMinABSNotZeroElement(int[] mass) {
        int min = Integer.MAX_VALUE;
        for (int j : mass) {
            int absJ = Math.abs(j);

            if (j == Integer.MIN_VALUE) {
                continue;
            }

            if (min > absJ && j != 0) {
                min = absJ;
            }
        }
        return min;
    }
}