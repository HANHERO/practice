package task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Year {
    private static final byte[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        String message = "";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] week = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
            int minDayOfWeek = 1;
            int maxDayOfWeek = 7;
            int minNumberOfMonth = 1;
            int maxNumberOfMonth = 12;
            int minDaysInMonth = 1;

            System.out.print("Введите день недели Нового года числом, искомый день и искомый месяц через пробел: ");
            String input = br.readLine();

            String[] inputArray = input.split(" ");

            int startDay = Integer.parseInt(inputArray[0]);
            int currentDay = Integer.parseInt(inputArray[1]);
            int month = Integer.parseInt(inputArray[2]);

            if (startDay > maxDayOfWeek || startDay < minDayOfWeek) {
                message = "День недели должен быть в пределе 1-7. Введенный день недели: " + startDay;
                throw new IOException();
            }

            if (month > maxNumberOfMonth || month < minNumberOfMonth) {
                message = "Месяц должен быть в пределе 1-12. Введенный месяц: " + month;
                throw new IOException();
            }

            if (currentDay > daysInMonth[month] || currentDay < minDaysInMonth) {
                message = "Искомый день должен быть не меньше 1 и не больше числа дней в заданном месяце. " +
                        "Заданный месяц: " + month + " Искомый день: " + currentDay;
                throw new IOException();
            }

            message = week[findDay(startDay, currentDay, month)];

        } catch (Exception e) {
            System.out.print("Некоректный ввод. ");
            e.printStackTrace();
        }finally {
            System.out.print(message);
        }
    }

    private static byte findDay(int startDay, int currentDay, int month) {
        int numberOfDays =  currentDay - 1;

        for (byte i = 0; i < month; i++) {
            numberOfDays += daysInMonth[i]; //Counting the number of days from the first day of the year to the required one.
        }

        int daysFromFirstDayInYearWithShift = numberOfDays + startDay - 1;

        return (byte) (daysFromFirstDayInYearWithShift % 7);
    }
}