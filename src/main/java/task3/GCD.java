package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * The type Gcd.
 */
public class GCD {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 4 числа через энтер: ");
        try {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            int c = Integer.parseInt(br.readLine());
            int d = Integer.parseInt(br.readLine());
            System.out.print("НОД = " + calculateGCD(a, b, c, d));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Calculate gcd int.
     *
     * @param a the a
     * @param b the b
     * @param c the c
     * @param d the d
     * @return the int
     */
    public static int calculateGCD(int a, int b, int c, int d) {
        boolean isFounded = false;
        int[] mass = new int[]{a, b, c, d};
        int nod = 0;
        int min = findMinABSNotZeroElement(mass);
        for (int i = min; i >= 1; i--) {
            for (int k : mass) {
                isFounded = k % i == 0;
                if (!isFounded) break;
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
            if (j == Integer.MIN_VALUE) continue;
            if (min > Math.abs(j) && j != 0) {
                min = Math.abs(j);
            }
        }
        return min;
    }
}