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
        int appInPod = apps * floors;
        int pod = ((apNum - 1) / appInPod) + 1;
        int et = (((apNum - 1) % appInPod) / apps) + 1;

        return et + " этаж, " + pod + " подъезд.";
    }
}