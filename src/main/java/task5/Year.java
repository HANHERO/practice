package task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Year {
    private static final byte[] DAYS_IN_MONTH = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int MIN_DAY_OF_WEEK = 1;
    private static final int MAX_DAY_OF_WEEK = 7;
    private static final int MIN_NUMBER_OF_MONTH = 1;
    private static final int MAX_NUMBER_OF_MONTH = 12;
    private static final int MIN_DAYS_IN_MONTH = 1;

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.print("Введите день недели Нового года числом, искомый день и искомый месяц через пробел: ");
            String input = br.readLine();

            String[] inputArray = input.split(" ");

            int startDay = Integer.parseInt(inputArray[0]);
            int currentDay = Integer.parseInt(inputArray[1]);
            int month = Integer.parseInt(inputArray[2]);

            if (startDay > MAX_DAY_OF_WEEK || startDay < MIN_DAY_OF_WEEK) {
                throw new IOException("День недели должен быть в пределе 1-7. Введенный день недели: " + startDay);
            }

            if (month > MAX_NUMBER_OF_MONTH || month < MIN_NUMBER_OF_MONTH) {
                throw new IOException("Месяц должен быть в пределе 1-12. Введенный месяц: " + month);
            }

            if (currentDay > DAYS_IN_MONTH[month] || currentDay < MIN_DAYS_IN_MONTH) {
                throw new IOException("Искомый день должен быть не меньше 1 и не больше числа дней в заданном месяце. " +
                        "Заданный месяц: " + month + " Искомый день: " + currentDay);
            }

            System.out.print(findDay(startDay, currentDay, month).toString());

        } catch (Exception e) {
            System.out.print(e.getMessage());
            e.printStackTrace();
        }
    }

    private static DayOfWeek findDay(int startDay, int currentDay, int month) {
        int numberOfDays =  currentDay - 1;

        for (int i = 0; i < month; i++) {
            numberOfDays += DAYS_IN_MONTH[i];
        }

        int daysFromFirstDayInYearWithShift = numberOfDays + startDay - 1;
        int numberOfDayOfWeek = daysFromFirstDayInYearWithShift % MAX_DAY_OF_WEEK;

        return DayOfWeek.values()[numberOfDayOfWeek];
    }
}