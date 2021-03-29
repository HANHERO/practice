package task1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Main class of program swaps the given variables.<br><br>
 * <b>Why is this program needed?</b><br>
 * This program needed if you want to swap two variables.<br>
 * <b>How to use this program?</b><br>
 * When you when you run the program you will see a prompt to enter the first value, enter the first value and
 * press enter. Next, you will be asked to enter a second value, enter it. After that, the program will output
 * the result to the console as [a, b]. Where 'a' is equal to original 'b' and 'b' is equal to original 'a';<br>
 * <b>Usage example</b><br>
 * You need to swap two values 5 and 7 for example. Run the program, read the first message in the console and input 5,
 * read the next one and input 7. After that you will see the message like: [7, 5], numbers swapped;
 *
 * @author Michael Pilipenko
 * @version 1.0
 */
public class Swap {

    /**
     * The entry point of application. Asks for input of values, in case of incorrect input it displays
     * an error message, otherwise it outputs the result of the program's work to the console.
     *
     * @param args the input arguments. Not used in this version.
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите число А: ");
            int a = Integer.parseInt(sc.nextLine());
            System.out.print("Введите число B: ");
            int b = Integer.parseInt(sc.nextLine());
            System.out.println(Arrays.toString(swap(a, b)));
        } catch (IllegalArgumentException iAE) {
            System.out.println("Вы ввели не число.");
            iAE.printStackTrace();
        }
    }

    /**
     * This method swaps values without using temporary variables.<br>
     * Method of work by example:<br>
     * <pre>
     * a = 5; b = 7;
     *
     * a = a + b;  //a = 5 + 7 = 12
     * b = a - b;  //b = 12 - 7 = 5
     * a = a - b;  //a = 12 - 5 = 7</pre>
     *
     * @param a the first value
     * @param b the second value
     * @return the int array of swapped values
     */
    public static int[] swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return new int[]{a, b};
    }
}