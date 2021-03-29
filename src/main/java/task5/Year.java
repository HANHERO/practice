package task5;


import java.util.Scanner;

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
 * @version 1.0
 * @see DayOfWeek
 * @see Month
 */
public class Year {

    /**
     * The Min days in month. The first day in month.
     */
    private static final int FIRST_DAY_IN_MONTH = 1;

    /**
     * This is where user input is expected and validates. If the input is valid,
     * then the method sends it for calculation and displays the result to the console.
     * Otherwise, displays information about the error.
     *
     * @param args the input arguments. Not used in this version.
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Введите день недели Нового года числом, искомый день и искомый месяц через пробел: ");
            String input = sc.nextLine();

            String[] inputArray = input.split(" ");

            int startDay = Integer.parseInt(inputArray[0]);
            int currentDay = Integer.parseInt(inputArray[1]);
            int month = Integer.parseInt(inputArray[2]);

            if (startDay > DayOfWeek.SUNDAY.getDay() || startDay < DayOfWeek.MONDAY.getDay()) {
                throw new IllegalArgumentException("День недели должен быть в пределе 1-7. Введенный день недели: " + startDay);
            }

            if (month < (Month.JANUARY.ordinal() + 1) || month > (Month.DECEMBER.ordinal() + 1)) {
                throw new IllegalArgumentException("Месяц должен быть в пределе 1-12. Введенный месяц: " + month);
            }

            if (currentDay > Month.values()[month-1].getDaysInMonth() || currentDay < FIRST_DAY_IN_MONTH) {
                throw new IllegalArgumentException("Искомый день должен быть не меньше 1 и не больше числа дней в заданном месяце. " +
                        "Заданный месяц: " + month + " Искомый день: " + currentDay);
            }

            System.out.print(findDay(DayOfWeek.values()[startDay - 1], currentDay, Month.values()[month - 1]).toString());

        } catch (IllegalArgumentException iAE) {
            System.out.print(iAE.getMessage());
            iAE.printStackTrace();
        }
    }

    private static DayOfWeek findDay(DayOfWeek startDay, int currentDay, Month month) {
        int numberOfDays = currentDay - 1;

        if (month.ordinal() > Month.JANUARY.ordinal()) {
            for (int i = 0; i < month.ordinal(); i++) {
                numberOfDays += Month.values()[i].getDaysInMonth();
            }
        }

        int daysFromFirstDayInYearWithShift = numberOfDays + startDay.ordinal();
        int numberOfDayOfWeek = daysFromFirstDayInYearWithShift % DayOfWeek.SUNDAY.getDay();

        return DayOfWeek.values()[numberOfDayOfWeek];
    }
}