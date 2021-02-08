package task5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Year {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите день недели Нового года числом (4 = четверг): ");
        int startDay = Integer.parseInt(br.readLine());
        System.out.print("Введите искомый день: ");
        int currentDay = Integer.parseInt(br.readLine());
        System.out.print("Введите искомый месяц: ");
        int month = Integer.parseInt(br.readLine());
        System.out.println(f(startDay, currentDay, month));
    }

    public static String f(int s, int c, int m) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int numberOfDays = c - 1;
        /*if (s > 7 || s < 1) {
            return "День недели должен быть в пределе 1-7";
        }
        if (m > 12 || m < 1) {
            return "Месяц должен быть в пределе 1-12";
        }
        if (c > daysInMonth[m] || c < 1) {
            return "Искомый день должен быть не меньше 1 и не больше числа дней в заданном месяце";
        }*/
        String[] week = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};

        for (int i = 0; i < m; i++) {
            numberOfDays = numberOfDays + daysInMonth[i];
        }

        return week[(numberOfDays + s - 1) % 7];
    }
}