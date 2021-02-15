package task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите номер квартиры (1 - 2147483647): ");
            int appNumber = Integer.parseInt(br.readLine());
            System.out.print("Введите количество квартир на этаже (1 - 2147483647): ");
            int numberOfApOnFloor = Integer.parseInt(br.readLine());
            System.out.print("Введите количество этажей (1 - 2147483647): ");
            int numberOfFloors = Integer.parseInt(br.readLine());
            System.out.println(d(appNumber, numberOfApOnFloor, numberOfFloors));
        } catch (Exception e) {
            System.out.println("Введены не корректные данные.");
        }
    }

    public static String d(int apNum, int apps, int floors) {
        if ((long) apps * floors > Integer.MAX_VALUE || apNum < 1 || apps < 1 || floors < 1) {
            return "Введены не корректные данные.";
        }
        int appInEntrance = apps * floors;
        int entrance = ((apNum - 1) / appInEntrance) + 1;
        int floor = (((apNum - 1) % appInEntrance) / apps) + 1;

        return floor + " этаж, " + entrance + " подъезд.";
    }
}