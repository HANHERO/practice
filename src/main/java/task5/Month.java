package task5;

/**
 * The enum Month.
 *
 *
 * @see Year
 * @author Michael Pilipenko
 * @version 1.0
 *
 */
public enum Month {

    /**January month.*/
    JANUARY(0),
    /**February month.*/
    FEBRUARY(31),
    /**March month.*/
    MARCH(28),
    /**April month.*/
    APRIL(31),
    /**May month.*/
    MAY(30),
    /**June month.*/
    JUNE(31),
    /**July month.*/
    JULY(30),
    /**August month.*/
    AUGUST(31),
    /**September month.*/
    SEPTEMBER(31),
    /**October month.*/
    OCTOBER(30),
    /**November month.*/
    NOVEMBER(31),
    /**December month.*/
    DECEMBER(30),

    THIRTEENTH(31);

    Month(int i) {
        daysToAdd = i;
    }
    int daysToAdd;
}
