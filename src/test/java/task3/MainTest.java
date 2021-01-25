package task3;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static task3.Main.f;

public class MainTest {
    private final int min = -2147483647;
    private final int max = 2147483647;

    private void a(int e, int a){
        assertEquals(e, a);
    }

    //////////////////////////////1. Граничные значения области определения
    @Test public void boundaryValues() {
        a(max, f(new int[]{min, min, min, min}));
        a(max, f(new int[]{min, min, min, max}));
        a(max, f(new int[]{min, min, max, min}));
        a(max, f(new int[]{min, min, max, max}));
        a(max, f(new int[]{min, max, min, min}));
        a(max, f(new int[]{min, max, min, max}));
        a(max, f(new int[]{min, max, max, min}));
        a(max, f(new int[]{min, max, max, max}));
        a(max, f(new int[]{max, min, min, min}));
        a(max, f(new int[]{max, min, min, max}));
        a(max, f(new int[]{max, min, max, min}));
        a(max, f(new int[]{max, min, max, max}));
        a(max, f(new int[]{max, max, min, min}));
        a(max, f(new int[]{max, max, min, max}));
        a(max, f(new int[]{max, max, max, min}));
        a(max, f(new int[]{max, max, max, max}));
    }

    //////////////////////////////2. Классы эквивалентности
    //////////////////////////////2.1 Границы классов эквивалентности

    //////////////////////////////2.2 Впритык слева и справа от границы

    //////////////////////////////2.3 Внутри класса эквивалентности

    //////////////////////////////3. Предметная область
    @Test public void subjectArea() {
        a(2, f(new int[]{4,6,8,24}));
        a(3, f(new int[]{9,18,24,54}));
        a(5, f(new int[]{25,15,100,30}));
        a(7, f(new int[]{14,49,28,56}));
        a(9, f(new int[]{81,90,144,162}));
    }
    //////////////////////////////4. Реализация
    @Test public void real() {
        a(8, f(new int[]{0,8,8,88}));
        a(4, f(new int[]{4,0,8,12}));
        a(10, f(new int[]{30,20,0,10}));
        a(6, f(new int[]{24,6,12,0}));
        a(Integer.MAX_VALUE, f(new int[]{0,0,0,0}));
    }
    //////////////////////////////5. Случайные значения
    @Test public void random() {
        a(10, f(new int[]{10, 20, 30, 40}));
        a(2, f(new int[]{2, 4, 8, 16}));
        a(10, f(new int[]{50, 400, 30, 170}));
        a(1, f(new int[]{7, 100, 200, 400}));
        a(7, f(new int[]{49, -70, 21, 35}));
        a(11, f(new int[]{33, 22, 121, 99}));
        a(3, f(new int[]{30, 30, 30, 3}));
        a(2, f(new int[]{122, 24, 86, 16}));
        a(100, f(new int[]{500, 4000, 300, 1700}));
        a(10, f(new int[]{70, 1000, 2000, 4000}));
        a(1, f(new int[]{15, 20, 30, 4}));
        a(20, f(new int[]{20, 40, 80, 160}));
        a(3, f(new int[]{0, 30, 3, 0}));
        a(1, f(new int[]{7, 1, 200, 400}));
        a(35, f(new int[]{490, -70, 210, 35}));
        a(11, f(new int[]{33, 22, 121, 99}));
        a(10, f(new int[]{10, 20, 30, 40}));
        a(4, f(new int[]{8, 4, 8, 16}));
        a(10, f(new int[]{50, 400, 30, 170}));
        a(8, f(new int[]{8, 64, 72, 80}));
        a(12, f(new int[]{12, 24, 36, 144}));
        a(7, f(new int[]{21, 49, 70, 14}));
        a(57, f(new int[]{57, 57, 114, 228}));
        a(19, f(new int[]{38, 380, 19, 38}));
        a(7, f(new int[]{49, 70, 21, 35}));
        a(11, f(new int[]{33, 22, 121, 99}));
        a(10, f(new int[]{10, 20, 30, 40}));
        a(2, f(new int[]{2, 4, 8, 16}));
        a(10, f(new int[]{50, 400, 30, 170}));
        a(1, f(new int[]{7, 100, 200, 400}));
    }
    //////////////////////////////6. Другие особые значения

}