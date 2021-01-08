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
        System.out.println(findDayOfWeek(startDay, currentDay, month));
    }

    public static String findDayOfWeek(int startDay, int currentDay, int month) {
        if (startDay <= 0 || currentDay <= 0 || month <= 0) {
            return "День недели Нового года, искомый день и искомый месяц должны быть положительными числами";
        }
        String[] week = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int numberOfDays = currentDay - 1;
        for (int i = 0; i < month; i++) {
            numberOfDays = numberOfDays + daysInMonth[i];
        }

        return week[(numberOfDays + startDay - 1) % 7];
    }
}