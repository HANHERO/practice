package task4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * The type Fib.
 */
public class Fib {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.print("Введите порядковый номер необходимого числа Фибоначчи: ");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int fibDigit = Integer.parseInt(br.readLine());
            System.out.println(findFib(fibDigit));
        } catch (Exception e) {
            System.out.println("Введено не число.");
            e.printStackTrace();
        }
    }

    /**
     * Find fib big integer.
     *
     * @param n the n
     * @return the big integer
     */
    public static BigInteger findFib(int n) {
        BigInteger temp;
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        int nABS = Math.abs(n);

        for (int i = 1; i < nABS; i++) {
            temp = b;
            b = a.add(b);
            a = temp;
        }

        if (n == 0) {
            b = BigInteger.valueOf(0);
        }

        if (n < 0 && (n % 2) == 0) { //if the number is negative and even
            b = b.multiply(BigInteger.valueOf(-1));
        }
        return b;
    }
}
