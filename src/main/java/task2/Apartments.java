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
    /**
     * <b>Main</b> is used for both the entry point to the application and
     * the entry point for the desired apartment and characteristics of the house.
     *
     * @param args the input arguments of main
     */
    public static void main(String[] args) {
        String errorMessage = "Введены не корректные данные.";

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Введите номер квартиры, количество квартир на этаже и количество этажей через пробел: ");
            String input = br.readLine();
            String[] inputArray = input.split(" ");

            if (inputArray.length != 3) {
                errorMessage = "Введено неверное число параметров: " + inputArray.length;
                throw new IOException();
            }

            int apartmentNumber = Integer.parseInt(inputArray[0]);
            int apartmentsOnTheFloor = Integer.parseInt(inputArray[1]);
            int floors = Integer.parseInt(inputArray[2]);

            if ((long) apartmentsOnTheFloor * floors > Integer.MAX_VALUE) {
                errorMessage = "Введены не корректные данные. Квартир на этаже " + apartmentsOnTheFloor + ", этажей в подъезде " + floors +
                        ", квартир в подъезде " + (long) apartmentsOnTheFloor * floors + " > " + Integer.MAX_VALUE;
                throw new IOException();
            }

            if (apartmentNumber < 1 || apartmentsOnTheFloor < 1 || floors < 1) {
                errorMessage = "Введены не корректные данные. Номер квартиры  " + apartmentNumber + ", квартир на этаже "
                        + apartmentsOnTheFloor + ", этажей в подъезде " + floors;
                throw new IOException();
            }

            int[] outputArray = determineFloorAndEntrance(apartmentNumber, apartmentsOnTheFloor, floors);
            System.out.println(outputArray[0] + " этаж, " + outputArray[1] + " подъезд.");

        } catch (Exception e) {
            System.out.println(errorMessage);
            e.printStackTrace();
        }
    }

    private static int[] determineFloorAndEntrance(int apartmentNumber, int apartmentsOnTheFloor, int floors) {
        int apartmentsInTheEntrance = apartmentsOnTheFloor * floors;
        int determinedFloor = ((apartmentNumber - 1) % apartmentsInTheEntrance) / apartmentsOnTheFloor + 1;
        int determineEntrance = (apartmentNumber - 1) / apartmentsInTheEntrance + 1;

        return new int[]{determinedFloor, determineEntrance};
    }
}