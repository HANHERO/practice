package task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Main class of program for finding fibonacci numbers.
 *
 * <b>Why is this program needed?</b><br>
 * You need this program if you want to find fibonacci numbers<br>
 * <b>How to use this program?</b><br>
 * You need to run this program and follow the directions in the console.
 * If the input data is valid, the calculation result will be displayed in the console,
 * otherwise, error information will be displayed.<br>
 * <b>Usage example</b><br>
 * For example you need to know the hundredth fibonacci number. Run the program enter 100 and wait,
 * result "354224848179261915075" will be displayed in the console.
 *
 * @author Michael Pilipenko
 * @version 1.0
 */
public class Fib {
    /**Variables temp, a and b. Used as temporary storage for calculating Fibonacci sequence.*/
    private static BigInteger a = BigInteger.valueOf(0);
    private static BigInteger b = BigInteger.valueOf(1);


    /**
     * The entry point of application. This is where user input is expected and validates.
     * If the input is valid, then the method sends it for calculation and displays the result to the console.
     * Otherwise, displays information about the error.
     *
     * @param args the input arguments. Not used in this version.
     */
    public static void main(String[] args){
        System.out.print("Введите порядковый номер необходимого числа Фибоначчи: ");
        try (Scanner sc = new Scanner(System.in)) {

            int fibDigit = Integer.parseInt(sc.nextLine());
            System.out.println(findFib(fibDigit));

        } catch (IllegalArgumentException iAE) {
            System.out.println("Введено не число.");
            iAE.printStackTrace();
        }
    }

    /**
     * Find fib method calculates fibonacci number.
     * <p>
     * The principle of its operation is to add the previous numbers by the modulus to obtain the next.
     * If param n is negative and even then the fibonacci number is multiplied by -1.
     * If param n is zero method returns zero;
     *
     * @param n is int. This is the index number of Fibonacci sequence.
     * @return the big integer.
     */
    public static BigInteger findFib(int n) {
        int nABS = Math.abs(n);

        for (int i = 1; i < nABS; i++) {
            //temp = b;
            //b = a.add(b);
            //a = temp;
            a = a.add(b);
            b = a.subtract(b);
            a = a.subtract(b);
            b = a.add(b);
        }

        if (n == 0) {
            b = BigInteger.valueOf(0);
        } else if (n < 0 && (n % 2) == 0) { //if the number is negative and even
            b = b.multiply(BigInteger.valueOf(-1));
        }
        return b;
    }
}
