package task4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Fib {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите порядковый номер необходимого числа Фибоначчи: ");
        try {
            int fibDigit = Integer.parseInt(br.readLine());
            System.out.println(f(fibDigit));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static BigInteger f(int n) {
        BigInteger temp;
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        int nABS = Math.abs(n);
        if (n == 0) {
            return a;
        }
        for (int i = 1; i < nABS; i++) {
            temp = b;
            b = a.add(b);
            a = temp;
        }
        if (n < 0 && n % 2 == 0) {
            return b.multiply(new BigInteger("-1"));
        }
        return b;
    }
}
