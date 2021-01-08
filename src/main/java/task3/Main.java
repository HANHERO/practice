package task3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 4 числа через энтер: ");
        int[] mass = {Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()),
                Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine())};

        System.out.println("НОД = " + findNOD(mass));
    }

    public static int findNOD(int[] mass) {
        boolean isFounded = false;
        int nod = 1;

        for (int i = findMinABSNotZeroElement(mass); i >= 1; i--) {
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

    public static int findMinABSNotZeroElement(int[] mass) {
        int min = Integer.MAX_VALUE;
        for (int j : mass) {
            if (min > Math.abs(j) && j != 0) {
                min = Math.abs(j);
            }
        }
        return min;
    }
}
