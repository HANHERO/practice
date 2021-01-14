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
            System.out.println(determ(appNumber, numberOfApOnFloor, numberOfFloors));
        } catch (Exception e) {
            System.out.println("Введены не корректные данные");
        }
    }

    public static String determ(int apNum, int apps, int floors) {
        if (apNum <= 0 || apps <= 0 || floors <= 0) {
            return "Введены не корректные данные.";
        }

        int entrance = 1;
        int floor = 1;

        while (apNum - apps > 0) {
            apNum -= apps;
            floor++;
        }

        while (floor - floors > 0) {
            floor -= floors;
            entrance++;
        }

        return floor + " этаж, " + entrance + " подъезд.";
    }
}