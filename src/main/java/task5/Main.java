package task5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
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

    public static String findDay(int start, int current, int month) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int numberOfDays = current - 1;
        if (start > 7 || start < 1) {
            return "День недели должен быть в пределе 1-7";
        }
        if (month > 12 || month < 1) {
            return "Месяц должен быть в пределе 1-12";
        }
        if (current > daysInMonth[month] || current < 1) {
            return "Искомый день должен быть не меньше 1 и не больше числа дней в заданном месяце";
        }
        String[] week = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};

        for (int i = 0; i < month; i++) {
            numberOfDays = numberOfDays + daysInMonth[i];
        }

        return week[(numberOfDays + start - 1) % 7];
    }
}