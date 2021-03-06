package task5;

/**
 * The enum Month.
 *
 * @author Michael Pilipenko
 * @version 1.0
 * @see Year
 */
public enum Month {

    /**January month.*/
    JANUARY(31),

    /**February month.*/
    FEBRUARY(28),

    /**March month.*/
    MARCH(31),

    /**April month.*/
    APRIL(30),

    /**May month.*/
    MAY(31),

    /**June month.*/
    JUNE(30),

    /**July month.*/
    JULY(31),

    /**August month.*/
    AUGUST(31),

    /**September month.*/
    SEPTEMBER(30),

    /**October month.*/
    OCTOBER(31),

    /**November month.*/
    NOVEMBER(30),

    /** December month.*/
    DECEMBER(31);

    /**Constructor month*/
    Month(int i) {
        daysInMonth = i;
    }

    /**Days in month.*/
    private final int daysInMonth;

    /**
     * Gets days in month.
     *
     * @return the days in month
     */
    public int getDaysInMonth() {
        return daysInMonth;
    }
}
