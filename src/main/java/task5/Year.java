package task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Main class of the Year program.<br><br>
 *
 * <b>Why is this program needed?</b><br>
 * Еhe purpose of the program is to find the day of the week of a given date,
 * starting from the day of the week of the first day of the year.<br>
 * <b>How to use this program?</b><br>
 * You need to run this program and follow the directions in the console.
 * If the input data is valid, the calculation result will be displayed in the console,
 * otherwise, error information will be displayed.<br>
 * <b>Usage example</b><br>
 * For example, you want to know the day of the week of the first day of summer this year.
 * You know that the first of January this year was Friday. You need to run the program and enter "5 1 6".
 * And you wil see in the console "TUESDAY".
 *
 * @author Michael Pilipenko
 * @see DayOfWeek
 * @see Month
 * @version 1.0
 *
 */
public class Year {
    private static final byte[] DAYS_IN_MONTH = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int MIN_DAY_OF_WEEK = 1;
    private static final int MAX_DAY_OF_WEEK = 7;
    private static final int MIN_NUMBER_OF_MONTH = 1;
    private static final int MAX_NUMBER_OF_MONTH = 12;
    private static final int MIN_DAYS_IN_MONTH = 1;

    /**
     * This is where user input is expected and validates. If the input is valid,
     * then the method sends it for calculation and displays the result to the console.
     * Otherwise, displays information about the error.
     *
     * @param args the input arguments. Not used in this version.
     */
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

            System.out.print(findDay(DayOfWeek.values()[startDay], currentDay, Month.values()[month]).toString());

        } catch (IOException ioE) {
            System.out.print(ioE.getMessage());
            ioE.printStackTrace();
        }
    }

    private static DayOfWeek findDay(DayOfWeek startDay, int currentDay, Month month) {
        int numberOfDays =  currentDay - 1;

        for (int i = 0; i < month.ordinal(); i++) {
            numberOfDays += DAYS_IN_MONTH[i];
        }

        int daysFromFirstDayInYearWithShift = numberOfDays + startDay.ordinal() - 1;
        int numberOfDayOfWeek = daysFromFirstDayInYearWithShift % MAX_DAY_OF_WEEK;

        return DayOfWeek.values()[numberOfDayOfWeek];
    }
}