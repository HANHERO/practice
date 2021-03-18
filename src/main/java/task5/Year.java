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
        System.out.println(findDay(startDay, currentDay, month));
    }

    public static String findDay(int a, int b, int c) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int numberOfDays = b - 1;
        if (a > 7 || a < 1) {
            return "День недели должен быть в пределе 1-7. Введенный день недели: " + a;
        }
        if (c > 12 || c < 1) {
            return "Месяц должен быть в пределе 1-12. Введенный месяц: " + c;
        }
        if (b > daysInMonth[c] || b < 1) {
            return "Искомый день должен быть не меньше 1 и не больше числа дней в заданном месяце. " +
                    "Заданный месяц: " + c + " Искомый день: " + b;
        }
        String[] week = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};

        for (int i = 0; i < c; i++) {
            numberOfDays = numberOfDays + daysInMonth[i];
        }

        return week[(numberOfDays + a - 1) % 7];
    }
}