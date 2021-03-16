package task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*try {
            System.out.print("Введите номер квартиры: ");
            int appNumber = Integer.parseInt(br.readLine());
            System.out.print("Введите количество квартир на этаже: ");
            int numberOfApOnFloor = Integer.parseInt(br.readLine());
            System.out.print("Введите количество этажей: ");
            int numberOfFloors = Integer.parseInt(br.readLine());
            System.out.println(d(appNumber, numberOfApOnFloor, numberOfFloors));
        } catch (Exception e) {
            System.out.println("Введены не корректные данные.");
        }*/
        System.out.print(d(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])));
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