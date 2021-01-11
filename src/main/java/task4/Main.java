package task4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите порядковый номер необходимого числа Фибоначчи: ");
        try {
            int fibDigit = Integer.parseInt(br.readLine());
            System.out.println(fib(fibDigit));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static BigInteger fib(int n) {
        BigInteger[] fibMass = new BigInteger[Math.abs(n) + 2];
        fibMass[0] = new BigInteger("0");
        if (n < 0) {
            fibMass[1] = new BigInteger("-1");
            for (int i = 2; i < Math.abs(n) + 1; i++) {
                fibMass[i] = fibMass[i - 1].add(fibMass[i - 2]);
            }
            System.out.print("Вы ввели отрицателый номер числа Фибоначчи, вот его значение: ");
            if (Math.abs(n) % 2 == 1) {
                return fibMass[Math.abs(n)].multiply(new BigInteger("-1"));
            } else return fibMass[Math.abs(n)];
        } else {
            fibMass[1] = new BigInteger("1");
            for (int i = 2; i < Math.abs(n) + 1; i++) {
                fibMass[i] = fibMass[i - 1].add(fibMass[i - 2]);
            }
            return fibMass[n];
        }
    }
}
