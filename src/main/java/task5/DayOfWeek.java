package task5;

/**
 * The enum Day of week. Contains days of the week.
 *
 * @author Michael Pilipenko
 * @version 1.0
 * @see Year
 */
public enum DayOfWeek {
    /**Monday day of week.*/
    MONDAY(1),
    /**Tuesday day of week.*/
    TUESDAY(2),
    /**Wednesday day of week.*/
    WEDNESDAY(3),
    /**Thursday day of week.*/
    THURSDAY(4),
    /**Friday day of week.*/
    FRIDAY(5),
    /**Saturday day of week.*/
    SATURDAY(6),
    /**Sunday day of week.*/
    SUNDAY(7);

    DayOfWeek(int day) {
        this.day = day;
    }
    /**Stores the number of the day*/
    private final int day;

    /**
     * Gets day.
     *
     * @return the day number.
     */
    public int getDay() {
        return day;
    }
}
