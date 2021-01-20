package task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число А: ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Введите число B: ");
        int b = Integer.parseInt(br.readLine());
        System.out.println(s(a, b));
    }

    public static String s(int a, int b) {
        a = a + b; // 5 + 3 = 8
        b = a - b; // 8 - 5 = 3
        a = a - b; // 8 - 3 = 5
        return "A = " + a + ", B = " + b;
    }
}