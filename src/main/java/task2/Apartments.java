package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * A program that finds the location of a given apartment in a house based on its characteristics.<br><br>
 * <b>Why is this program needed?</b><br>
 * If you want to know where the apartment is in the building, you know the apartment number,
 * the number of floors in the building and the number of apartments on the floor.<br>
 * <b>How to use this program?</b><br>
 * You need to run the program and follow the instructions in the console to enter the apartment number,
 * the number of apartments on the floor and the number of floors in the house through a space.
 * Next, the program will make calculations and display a message like:<br> <i>N этаж, M подъезд.</i><br>
 * where <i>N</i> is the floor and <i>M</i> is the entrance of the required apartment. <br>
 * <b>Usage example</b><br>
 * You need to determine where apartment №86 is located in a building with 9 floors and 6 apartments per floor.
 * Run this application you will see a message: "Введите номер квартиры, количество квартир на этаже и количество этажей через пробел: "
 * (without quotes) you should enter: "86 6 9" (without quotes), and then you will see: "6 этаж, 2 подъезд." (without quotes). <br>
 *
 * @author Michael Pilipenko
 * @version 1.0
 */
public class Apartments {
    private static final String ERROR_MESSAGE = "Введены не корректные данные.";
    /**
     * <b>Main</b> is used for both the entry point to the application and
     * the entry point for the desired apartment and characteristics of the house.
     *
     * @param args the input arguments of main
     */
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите номер квартиры, количество квартир на этаже и количество этажей через пробел: ");
            String input = br.readLine();
            String[] inputArray = input.split(" ");
            if (inputArray.length == 3) {
                System.out.print(determineFloorAndEntrance(Integer.parseInt(inputArray[0]),
                        Integer.parseInt(inputArray[1]), Integer.parseInt(inputArray[2])));
            } else {
                throw new IOException();
            }
        } catch (Exception e) {
            System.out.print(ERROR_MESSAGE);
        }
    }

    /**
     * Determine the floor and entrance of the apartment according to the specified parameters.
     *
     * @param apNum  the apartment number
     * @param apps   apartment on the floor
     * @param floors number of floors in entrance
     * @return the string
     */
    public static String determineFloorAndEntrance(int apNum, int apps, int floors) {
        if ((long) apps * floors > Integer.MAX_VALUE) {
            return ERROR_MESSAGE + " Квартир на этаже " + apps + ", этажей в подъезде " + floors +
                    ", квартир в подъезде " + (long) apps * floors + " > " + Integer.MAX_VALUE;
        }
        if (apNum < 1 || apps < 1 || floors < 1) {
            return ERROR_MESSAGE + " Номер квартиры  " + apNum + ", квартир на этаже "
                    + apps + ", этажей в подъезде " + floors;
        }
        int appInPod = apps * floors;
        int pod = (apNum - 1) / appInPod + 1;
        int et = ((apNum - 1) % appInPod) / apps + 1;

        return et + " этаж, " + pod + " подъезд.";
    }
}