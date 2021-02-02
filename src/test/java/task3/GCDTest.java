package task3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static task3.GCD.f;

import java.util.ArrayList;

public class GCDTest {
    private final ArrayList<TestScenario> testScenarios = new ArrayList<>();

    private void setUpScenarios() {
        final int min = -2147483647;
        final int max = 2147483647;
        //////////////////////////////1. Граничные значения области определения
        s(max, min, min, min, min);
        s(1, min, min, min, min + 1);
        s(1, min, min, min + 1, min);
        s(1, min, min, min + 1, min + 1);
        s(1, min, min + 1, min, min);
        s(1, min, min + 1, min, min + 1);
        s(1, min, min + 1, min + 1, min);
        s(1, min, min + 1, min + 1, min + 1);
        s(1, min + 1, min, min, min);
        s(1, min + 1, min, min, min + 1);
        s(1, min + 1, min, min + 1, min);
        s(1, min + 1, min, min + 1, min + 1);
        s(1, min + 1, min + 1, min, min);
        s(1, min + 1, min + 1, min, min + 1);
        s(1, min + 1, min + 1, min + 1, min);

        s(max, min, min, min, max);
        s(1, min, min, min, max - 1);
        s(1, min, min, min + 1, max);
        s(1, min, min, min + 1, max - 1);
        s(1, min, min + 1, min, max);
        s(1, min, min + 1, min, max - 1);
        s(1, min, min + 1, min + 1, max);
        s(1, min, min + 1, min + 1, max - 1);
        s(1, min + 1, min, min, max);
        s(1, min + 1, min, min, max - 1);
        s(1, min + 1, min, min + 1, max);
        s(1, min + 1, min, min + 1, max - 1);
        s(1, min + 1, min + 1, min, max);
        s(1, min + 1, min + 1, min, max - 1);
        s(1, min + 1, min + 1, min + 1, max);

        s(max, min, min, max, min);
        s(1, min, min, max, min + 1);
        s(1, min, min, max - 1, min);
        s(1, min, min, max - 1, min + 1);
        s(1, min, min + 1, max, min);
        s(1, min, min + 1, max, min + 1);
        s(1, min, min + 1, max - 1, min);
        s(1, min, min + 1, max - 1, min + 1);
        s(1, min + 1, min, max, min);
        s(1, min + 1, min, max, min + 1);
        s(1, min + 1, min, max - 1, min);
        s(1, min + 1, min, max - 1, min + 1);
        s(1, min + 1, min + 1, max, min);
        s(1, min + 1, min + 1, max, min + 1);
        s(1, min + 1, min + 1, max - 1, min);

        s(max, min, min, max, max);
        s(1, min, min, max, max - 1);
        s(1, min, min, max - 1, max);
        s(1, min, min, max - 1, max - 1);
        s(1, min, min + 1, max, max);
        s(1, min, min + 1, max, max - 1);
        s(1, min, min + 1, max - 1, max);
        s(1, min, min + 1, max - 1, max - 1);
        s(1, min + 1, min, max, max);
        s(1, min + 1, min, max, max - 1);
        s(1, min + 1, min, max - 1, max);
        s(1, min + 1, min, max - 1, max - 1);
        s(1, min + 1, min + 1, max, max);
        s(1, min + 1, min + 1, max, max - 1);
        s(1, min + 1, min + 1, max - 1, max);

        s(max, min, max, min, min);
        s(1, min, max, min, min + 1);
        s(1, min, max, min + 1, min);
        s(1, min, max, min + 1, min + 1);
        s(1, min, max - 1, min, min);
        s(1, min, max - 1, min, min + 1);
        s(1, min, max - 1, min + 1, min);
        s(1, min, max - 1, min + 1, min + 1);
        s(1, min + 1, max, min, min);
        s(1, min + 1, max, min, min + 1);
        s(1, min + 1, max, min + 1, min);
        s(1, min + 1, max, min + 1, min + 1);
        s(1, min + 1, max - 1, min, min);
        s(1, min + 1, max - 1, min, min + 1);
        s(1, min + 1, max - 1, min + 1, min);

        s(max, min, max, min, max);
        s(1, min, max, min, max - 1);
        s(1, min, max, min + 1, max);
        s(1, min, max, min + 1, max - 1);
        s(1, min, max - 1, min, max);
        s(1, min, max - 1, min, max - 1);
        s(1, min, max - 1, min + 1, max);
        s(1, min, max - 1, min + 1, max - 1);
        s(1, min + 1, max, min, max);
        s(1, min + 1, max, min, max - 1);
        s(1, min + 1, max, min + 1, max);
        s(1, min + 1, max, min + 1, max - 1);
        s(1, min + 1, max - 1, min, max);
        s(1, min + 1, max - 1, min, max - 1);
        s(1, min + 1, max - 1, min + 1, max);

        s(max, min, max, max, min);
        s(1, min, max, max, min + 1);
        s(1, min, max, max - 1, min);
        s(1, min, max, max - 1, min + 1);
        s(1, min, max - 1, max, min);
        s(1, min, max - 1, max, min + 1);
        s(1, min, max - 1, max - 1, min);
        s(1, min, max - 1, max - 1, min + 1);
        s(1, min + 1, max, max, min);
        s(1, min + 1, max, max, min + 1);
        s(1, min + 1, max, max - 1, min);
        s(1, min + 1, max, max - 1, min + 1);
        s(1, min + 1, max - 1, max, min);
        s(1, min + 1, max - 1, max, min + 1);
        s(1, min + 1, max - 1, max - 1, min);

        s(max, min, max, max, max);
        s(1, min, max, max, max - 1);
        s(1, min, max, max - 1, max);
        s(1, min, max, max - 1, max - 1);
        s(1, min, max - 1, max, max);
        s(1, min, max - 1, max, max - 1);
        s(1, min, max - 1, max - 1, max);
        s(1, min, max - 1, max - 1, max - 1);
        s(1, min + 1, max, max, max);
        s(1, min + 1, max, max, max - 1);
        s(1, min + 1, max, max - 1, max);
        s(1, min + 1, max, max - 1, max - 1);
        s(1, min + 1, max - 1, max, max);
        s(1, min + 1, max - 1, max, max - 1);
        s(1, min + 1, max - 1, max - 1, max);

        s(max, max, min, min, min);
        s(1, max, min, min, min + 1);
        s(1, max, min, min + 1, min);
        s(1, max, min, min + 1, min + 1);
        s(1, max, min + 1, min, min);
        s(1, max, min + 1, min, min + 1);
        s(1, max, min + 1, min + 1, min);
        s(1, max, min + 1, min + 1, min + 1);
        s(1, max - 1, min, min, min);
        s(1, max - 1, min, min, min + 1);
        s(1, max - 1, min, min + 1, min);
        s(1, max - 1, min, min + 1, min + 1);
        s(1, max - 1, min + 1, min, min);
        s(1, max - 1, min + 1, min, min + 1);
        s(1, max - 1, min + 1, min + 1, min);

        s(max, max, min, min, max);
        s(1, max, min, min, max - 1);
        s(1, max, min, min + 1, max);
        s(1, max, min, min + 1, max - 1);
        s(1, max, min + 1, min, max);
        s(1, max, min + 1, min, max - 1);
        s(1, max, min + 1, min + 1, max);
        s(1, max, min + 1, min + 1, max - 1);
        s(1, max - 1, min, min, max);
        s(1, max - 1, min, min, max - 1);
        s(1, max - 1, min, min + 1, max);
        s(1, max - 1, min, min + 1, max - 1);
        s(1, max - 1, min + 1, min, max);
        s(1, max - 1, min + 1, min, max - 1);
        s(1, max - 1, min + 1, min + 1, max);

        s(max, max, min, max, min);
        s(1, max, min, max, min + 1);
        s(1, max, min, max - 1, min);
        s(1, max, min, max - 1, min + 1);
        s(1, max, min + 1, max, min);
        s(1, max, min + 1, max, min + 1);
        s(1, max, min + 1, max - 1, min);
        s(1, max, min + 1, max - 1, min + 1);
        s(1, max - 1, min, max, min);
        s(1, max - 1, min, max, min + 1);
        s(1, max - 1, min, max - 1, min);
        s(1, max - 1, min, max - 1, min + 1);
        s(1, max - 1, min + 1, max, min);
        s(1, max - 1, min + 1, max, min + 1);
        s(1, max - 1, min + 1, max - 1, min);

        s(max, max, min, max, max);
        s(1, max, min, max, max - 1);
        s(1, max, min, max - 1, max);
        s(1, max, min, max - 1, max - 1);
        s(1, max, min + 1, max, max);
        s(1, max, min + 1, max, max - 1);
        s(1, max, min + 1, max - 1, max);
        s(1, max, min + 1, max - 1, max - 1);
        s(1, max - 1, min, max, max);
        s(1, max - 1, min, max, max - 1);
        s(1, max - 1, min, max - 1, max);
        s(1, max - 1, min, max - 1, max - 1);
        s(1, max - 1, min + 1, max, max);
        s(1, max - 1, min + 1, max, max - 1);
        s(1, max - 1, min + 1, max - 1, max);

        s(max, max, max, min, min);
        s(1, max, max, min, min + 1);
        s(1, max, max, min + 1, min);
        s(1, max, max, min + 1, min + 1);
        s(1, max, max - 1, min, min);
        s(1, max, max - 1, min, min + 1);
        s(1, max, max - 1, min + 1, min);
        s(1, max, max - 1, min + 1, min + 1);
        s(1, max - 1, max, min, min);
        s(1, max - 1, max, min, min + 1);
        s(1, max - 1, max, min + 1, min);
        s(1, max - 1, max, min + 1, min + 1);
        s(1, max - 1, max - 1, min, min);
        s(1, max - 1, max - 1, min, min + 1);
        s(1, max - 1, max - 1, min + 1, min);

        s(max, max, max, min, max);
        s(1, max, max, min, max-1);
        s(1, max, max, min+1, max);
        s(1, max, max, min+1, max-1);
        s(1, max, max-1, min, max);
        s(1, max, max-1, min, max-1);
        s(1, max, max-1, min+1, max);
        s(1, max, max-1, min+1, max-1);
        s(1, max-1, max, min, max);
        s(1, max-1, max, min, max-1);
        s(1, max-1, max, min+1, max);
        s(1, max-1, max, min+1, max-1);
        s(1, max-1, max-1, min, max);
        s(1, max-1, max-1, min, max-1);
        s(1, max-1, max-1, min+1, max);

        s(max, max, max, max, min);
        s(1, max, max, max, min+1);
        s(1, max, max, max-1, min);
        s(1, max, max, max-1, min+1);
        s(1, max, max-1, max, min);
        s(1, max, max-1, max, min+1);
        s(1, max, max-1, max-1, min);
        s(1, max, max-1, max-1, min+1);
        s(1, max-1, max, max, min);
        s(1, max-1, max, max, min+1);
        s(1, max-1, max, max-1, min);
        s(1, max-1, max, max-1, min+1);
        s(1, max-1, max-1, max, min);
        s(1, max-1, max-1, max, min+1);
        s(1, max-1, max-1, max-1, min);

        s(max, max, max, max, max);
        s(1, max, max, max, max-1);
        s(1, max, max, max-1, max);
        s(1, max, max, max-1, max-1);
        s(1, max, max-1, max, max);
        s(1, max, max-1, max, max-1);
        s(1, max, max-1, max-1, max);
        s(1, max, max-1, max-1, max-1);
        s(1, max-1, max, max, max);
        s(1, max-1, max, max, max-1);
        s(1, max-1, max, max-1, max);
        s(1, max-1, max, max-1, max-1);
        s(1, max-1, max-1, max, max);
        s(1, max-1, max-1, max, max-1);
        s(1, max-1, max-1, max-1, max);
        //////////////////////////////2. Классы эквивалентности
        //////////////////////////////2.1 Границы классов эквивалентности

        //////////////////////////////2.2 Впритык слева и справа от границы

        //////////////////////////////2.3 Внутри класса эквивалентности

        //////////////////////////////3. Предметная область
        s(2, 4, 6, 8, 24);
        s(3, 9, 18, 24, 54);
        s(5, 25, 15, 100, 30);
        s(7, 14, 49, 28, 56);
        s(9, 81, 90, 144, 162);
        //////////////////////////////4. Реализация
        s(8, 0, 8, 8, 88);
        s(4, 4, 0, 8, 12);
        s(10, 30, 20, 0, 10);
        s(6, 24, 6, 12, 0);
        s(max, 0, 0, 0, 0);
        //////////////////////////////5. Случайные значения
        s(10, 10, 20, 30, 40);
        s(2, 2, 4, 8, 16);
        s(10, 50, 400, 30, 170);
        s(1, 7, 100, 200, 400);
        s(7, 49, -70, 21, 35);
        s(11, 33, 22, 121, 99);
        s(3, 30, 30, 30, 3);
        s(2, 122, 24, 86, 16);
        s(100, 500, 4000, 300, 1700);
        s(10, 70, 1000, 2000, 4000);
        s(1, 15, 20, 30, 4);
        s(20, 20, 40, 80, 160);
        s(3, 0, 30, 3, 0);
        s(1, 7, 1, 200, 400);
        s(35, 490, -70, 210, 35);
        s(11, 33, 22, 121, 99);
        s(10, 10, 20, 30, 40);
        s(4, 8, 4, 8, 16);
        s(10, 50, 400, 30, 170);
        s(8, 8, 64, 72, 80);
        s(12, 12, 24, 36, 144);
        s(7, 21, 49, 70, 14);
        s(57, 57, 57, 114, 228);
        s(19, 38, 380, 19, 38);
        s(7, 49, 70, 21, 35);
        s(11, 33, 22, 121, 99);
        s(10, 10, 20, 30, 40);
        s(2, 2, 4, 8, 16);
        s(10, 50, 400, 30, 170);
        s(1, 7, 100, 200, 400);
        //////////////////////////////6. Другие особые значения


    }

    private void s(int gcd, int a, int b, int c, int d) {
        testScenarios.add(new TestScenario(gcd, a, b, c, d));
    }

    @Test
    public void start() {
        setUpScenarios();
        for (TestScenario tS : testScenarios) {
            assertEquals(tS.gcd, f(new int[]{tS.a, tS.b, tS.c, tS.d}));
        }
        System.out.println(testScenarios.size());
    }
}
