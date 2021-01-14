package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 4 числа через энтер: ");
        try {
            int[] mass = {Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()),
                    Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine())};
            System.out.print("НОД = " + findNOD(mass));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int findNOD(int[] mass)  {
        boolean isFounded = false;
        int nod = 0;
        int min = findMinABSNotZeroElement(mass);
        if (min == -1) {
            try {
                throw new IOException();
            }catch (Exception e){

            }

        } else {
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
        }
        return nod;
    }

    private static int findMinABSNotZeroElement(int[] mass) {
        int min = Integer.MAX_VALUE;
        for (int j : mass) {
            if (j == Integer.MIN_VALUE) {
                return -1;
            }
            if (min > Math.abs(j) && j != 0) {
                min = Math.abs(j);
            }
        }
        return min;
    }
}