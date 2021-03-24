package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Введите число А: ");
            int a = Integer.parseInt(br.readLine());
            System.out.print("Введите число B: ");
            int b = Integer.parseInt(br.readLine());
            System.out.println(Arrays.toString(swap(a, b)));
        } catch (IOException ioE) {
            System.out.println("Вы ввели не число.");
            ioE.printStackTrace();
        }
    }

    public static int[] swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return new int[]{a, b};
    }
}