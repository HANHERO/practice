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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите порядковый номер необходимого числа Фибоначчи: ");
        try {
            int fibDigit = Integer.parseInt(br.readLine());
            System.out.println(findFib(fibDigit));
        } catch (Exception e) {
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
        if (n < 0 && n % 2 == 0) {
            b = b.multiply(BigInteger.valueOf(-1));
        } else if (n == 0) {
            b = BigInteger.valueOf(0);
        }
        return b;
    }
}
