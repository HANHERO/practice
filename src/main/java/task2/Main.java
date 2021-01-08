package task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите номер квартиры (1 - 2147483647): ");
            int appNumber = Integer.parseInt(br.readLine());
            System.out.print("Введите количество квартир на этаже (1 - 2147483647): ");
            int numberOfApOnFloor = Integer.parseInt(br.readLine());
            System.out.print("Введите количество этажей (1 - 2147483647): ");
            int numberOfFloors = Integer.parseInt(br.readLine());
            System.out.println(determinateEntranceAndFloor(appNumber, numberOfApOnFloor, numberOfFloors));
        } catch (Exception e) {
            System.out.println("Введены не корректные данные");
        }
    }

    public static String determinateEntranceAndFloor(int apNumber, int numberOfApOnFloor, int numberOfFloors) {
        if (apNumber <= 0 || numberOfApOnFloor <= 0 || numberOfFloors <= 0) {
            return "Введены не корректные данные.";
        }

        int entrance = 1;
        int floor = 1;

        while (apNumber - numberOfApOnFloor > 0) {
            apNumber -= numberOfApOnFloor;
            floor++;
        }

        while (floor - numberOfFloors > 0) {
            floor -= numberOfFloors;
            entrance++;
        }

        return floor + " этаж, " + entrance + " подъезд.";
    }
}