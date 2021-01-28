package task2;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static task2.Main.d;

public class AppTest {
    private final ArrayList<TestScenario> testScenarios = new ArrayList<>();

    private void setUpScenarios() {
        final int min = 1;
        final int max = Integer.MAX_VALUE;
        ///////////////////////////////////////1 Граничные значения области определения.
        s("1 этаж, 1 подъезд.", min, min, min);
        s("1 этаж, 1 подъезд.", min, min, max);
        s("1 этаж, 1 подъезд.", min, max, min);
        s("1 этаж, 1 подъезд.", min, max, max);
        s("1 этаж, 2147483647 подъезд.", max, min, min);
        s("2147483647 этаж, 1 подъезд.", max, min, max);
        s("1 этаж, 1 подъезд.", max, max, min);
        s("1 этаж, 1 подъезд.", max, max, max);
        s("1 этаж, 2 подъезд.", min + 1, min, min);
        s("1 этаж, 1 подъезд.", min, min + 1, min);
        s("1 этаж, 1 подъезд.", min, min, min + 1);
        s("2 этаж, 1 подъезд.", min + 1, min, max);
        s("1 этаж, 1 подъезд.", min, min + 1, max);
        s("1 этаж, 1 подъезд.", min, min, max - 1);
        s("1 этаж, 1 подъезд.", min + 1, max, min);
        s("1 этаж, 1 подъезд.", min, max - 1, min);
        s("1 этаж, 1 подъезд.", min, max, min + 1);
        s("1 этаж, 1 подъезд.", min + 1, max, max);
        s("1 этаж, 1 подъезд.", min, max - 1, max);
        s("1 этаж, 1 подъезд.", min, max, max - 1);
        s("1 этаж, 2147483646 подъезд.", max - 1, min, min);
        s("1 этаж, 1073741824 подъезд.", max, min + 1, min);
        s("1 этаж, 1073741824 подъезд.", max, min, min + 1);
        s("2147483646 этаж, 1 подъезд.", max - 1, min, max);
        s("1073741824 этаж, 1 подъезд.", max, min + 1, max);
        s("1 этаж, 2 подъезд.", max, min, max - 1);
        s("1 этаж, 1 подъезд.", max - 1, max, min);
        s("1 этаж, 2 подъезд.", max, max - 1, min);
        s("1 этаж, 1 подъезд.", max, max, min + 1);
        s("1 этаж, 1 подъезд.", max - 1, max, max);
        s("2 этаж, 1 подъезд.", max, max - 1, max);
        s("1 этаж, 1 подъезд.", max, max, max - 1);
        s("1 этаж, 1 подъезд.", min + 1, min + 1, min);
        s("1 этаж, 1 подъезд.", min, min + 1, min + 1);
        s("2 этаж, 1 подъезд.", min + 1, min, min + 1);
        s("1 этаж, 1 подъезд.", min + 1, min + 1, max);
        s("1 этаж, 1 подъезд.", min, min + 1, max - 1);
        s("2 этаж, 1 подъезд.", min + 1, min, max - 1);
        s("1 этаж, 1 подъезд.", min + 1, max - 1, min);
        s("1 этаж, 1 подъезд.", min, max - 1, min + 1);
        s("1 этаж, 1 подъезд.", min + 1, max, min + 1);
        s("1 этаж, 1 подъезд.", min + 1, max - 1, max);
        s("1 этаж, 1 подъезд.", min, max - 1, max - 1);
        s("1 этаж, 1 подъезд.", min + 1, max, max - 1);
        s("1 этаж, 1073741823 подъезд.", max - 1, min + 1, min);
        s("2 этаж, 536870912 подъезд.", max, min + 1, min + 1);//////проверить дополнительно аналог
        s("2 этаж, 1073741823 подъезд.", max - 1, min, min + 1);//////проверить дополнительно аналог
        s("1073741823 этаж, 1 подъезд.", max - 1, min + 1, max);
        s("1073741824 этаж, 1 подъезд.", max, min + 1, max - 1);
        s("2147483646 этаж, 1 подъезд.", max - 1, min, max - 1);
        s("1 этаж, 1 подъезд.",max-1, max-1, min);
        s("2 этаж, 1 подъезд.",max, max-1, min+1);
        s("1 этаж, 1 подъезд.",max-1, max, min+1);
        s("1 этаж, 1 подъезд.",max-1, max-1, max);
        s("2 этаж, 1 подъезд.",max, max-1, max-1);
        s("1 этаж, 1 подъезд.",max-1, max, max-1);
        ////////////////////////////////////////2 Классы эквивалентности
        ////////////////////////////////////////2.1 Границы классов эквивалентности

        ////////////////////////////////////////2.2 Впритык слева и справа от грацницы

        ////////////////////////////////////////2.3 Внутри класса эквивалентности

        ////////////////////////////////////////3. Предметная область
        s("4 этаж, 1 подъезд.", 19, 6, 9);
        s("4 этаж, 1 подъезд.", 20, 6, 9);
        s("4 этаж, 1 подъезд.", 21, 6, 9);
        s("4 этаж, 1 подъезд.", 22, 6, 9);
        s("4 этаж, 1 подъезд.", 23, 6, 9);
        s("4 этаж, 1 подъезд.", 24, 6, 9);
        s("3 этаж, 1 подъезд.", 18, 6, 9);
        s("3 этаж, 1 подъезд.", 17, 6, 9);
        s("3 этаж, 1 подъезд.", 16, 6, 9);
        s("3 этаж, 1 подъезд.", 14, 6, 9);
        s("3 этаж, 1 подъезд.", 13, 6, 9);
        s("3 этаж, 1 подъезд.", 15, 6, 9);
        s("2 этаж, 1 подъезд.", 7, 6, 9);
        s("2 этаж, 1 подъезд.", 8, 6, 9);
        s("2 этаж, 1 подъезд.", 9, 6, 9);
        s("2 этаж, 1 подъезд.", 10, 6, 9);
        s("2 этаж, 1 подъезд.", 11, 6, 9);
        s("2 этаж, 1 подъезд.", 12, 6, 9);
        s("2 этаж, 4 подъезд.", 113, 4, 9);
        s("1 этаж, 3 подъезд.", 44, 4, 5);
        s("5 этаж, 2 подъезд.", 56, 4, 9);
        s("9 этаж, 9 подъезд.", 322, 4, 9);
        s("9 этаж, 2 подъезд.", 108, 6, 9);
        ////////////////////////////////////////4. Реализация

        ///////////////////////////////////////5. Случайные значения
        s("1 этаж, 10 подъезд.", 30, 3, 1);
        s("1 этаж, 6 подъезд.", 44, 4, 2);
        s("1 этаж, 3 подъезд.", 56, 8, 3);
        s("4 этаж, 1 подъезд.", 25, 7, 4);
        s("5 этаж, 1 подъезд.", 108, 22, 5);
        s("3 этаж, 1 подъезд.", 113, 45, 6);
        s("1 этаж, 1 подъезд.", 44, 52, 7);
        s("5 этаж, 1 подъезд.", 56, 12, 8);
        s("1 этаж, 2 подъезд.", 322, 33, 9);
        s("2 этаж, 1 подъезд.", 99, 85, 10);
        s("6 этаж, 1 подъезд.", 113, 21, 11);
        s("11 этаж, 1 подъезд.", 44, 4, 12);
        s("4 этаж, 1 подъезд.", 46, 12, 13);
        s("2 этаж, 2 подъезд.", 322, 70, 3);
        //s("9 этаж, 2 подъезд.", 108, 8, 15);
        //s("2 этаж, 4 подъезд.", 113, 2, 16);
        //s("1 этаж, 3 подъезд.", 44, 1, 17);
        //s("5 этаж, 2 подъезд.", 56, 7, 18);
        //s("9 этаж, 9 подъезд.", 322, 11, 19);
        //s("9 этаж, 2 подъезд.", 108, 13, 100);

        s("2 этаж, 1 подъезд.", 12, 6, 5);
        s("1 этаж, 2 подъезд.",40, 4, 9);
        s("3 этаж, 1 подъезд.",15, 5, 10);
        s("2 этаж, 4 подъезд.",24, 3, 2);
        s("4 этаж, 1 подъезд.",16, 4, 4);

        ///////////////////////////////////////6. Другие особые значения
        s("2 этаж, 25 подъезд.", 99, 2, 2);
        s("2 этаж, 49 подъезд.", 98, 1, 2);
    }

    private void s(String e, int a, int b, int c) {
        testScenarios.add(new TestScenario(e, a, b, c));
    }

    @Test
    public void start() {
        setUpScenarios();
        for (TestScenario tS : testScenarios) {
            assertEquals(tS.e, d(tS.apNum, tS.apps, tS.floors));
        }
    }
}
