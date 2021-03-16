package task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите номер квартиры, количество квартир на этаже и количество этажей через пробел: ");
            String input = br.readLine();
            String[] inputArray = input.split(" ");
            if (inputArray.length == 3) {
                System.out.println(d(Integer.parseInt(inputArray[0]), Integer.parseInt(inputArray[1]), Integer.parseInt(inputArray[2])));
            }else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.print("Введены не корректные данные.");
        }
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