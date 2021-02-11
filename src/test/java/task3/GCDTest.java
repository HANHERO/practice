package task3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static task3.GCD.f;

public class GCDTest {

    @Test
    public void setUpScenarios() {
        final int min = -2147483648;
        final int max = 2147483647;
        final int gFM = (min/2)*(-1);

        ////////////////////////////1. Граничные значения области определения
        s(gFM, min, min, min, min);
       // s(1, min, min, min, min + 1);
       // s(1, min, min, min + 1, min);
       // s(1, min, min, min + 1, min + 1);
       // s(1, min, min + 1, min, min);
       // s(1, min, min + 1, min, min + 1);
       // s(1, min, min + 1, min + 1, min);
       // s(1, min, min + 1, min + 1, min + 1);
       // s(1, min + 1, min, min, min);
       // s(1, min + 1, min, min, min + 1);
       // s(1, min + 1, min, min + 1, min);
       // s(1, min + 1, min, min + 1, min + 1);
       // s(1, min + 1, min + 1, min, min);
       // s(1, min + 1, min + 1, min, min + 1);
       // s(1, min + 1, min + 1, min + 1, min);
//
       // s(max, min, min, min, max);
       // s(1, min, min, min + 1, max);
       // s(1, min, min, min + 1, max - 1);
       // s(1, min, min + 1, min, max);
       // s(1, min, min + 1, min, max - 1);
       // s(1, min, min + 1, min + 1, max);
       // s(1, min, min + 1, min + 1, max - 1);
       // s(1, min + 1, min, min, max);
       // s(1, min + 1, min, min, max - 1);
       // s(1, min + 1, min, min + 1, max);
       // s(1, min + 1, min, min + 1, max - 1);
       // s(1, min + 1, min + 1, min, max);
       // s(1, min + 1, min + 1, min, max - 1);
       // s(1, min + 1, min + 1, min + 1, max);
//
       // s(max, min, min, max, min);
       // s(1, min, min, max, min + 1);
       // s(1, min, min, max - 1, min);
       // s(1, min, min, max - 1, min + 1);
       // s(1, min, min + 1, max, min);
       // s(1, min, min + 1, max, min + 1);
       // s(1, min, min + 1, max - 1, min);
       // s(1, min, min + 1, max - 1, min + 1);
       // s(1, min + 1, min, max, min);
       // s(1, min + 1, min, max, min + 1);
       // s(1, min + 1, min, max - 1, min);
       // s(1, min + 1, min, max - 1, min + 1);
       // s(1, min + 1, min + 1, max, min);
       // s(1, min + 1, min + 1, max, min + 1);
       // s(1, min + 1, min + 1, max - 1, min);
//
       // s(max, min, min, max, max);
       // s(1, min, min, max, max - 1);
       // s(1, min, min, max - 1, max);
       // s(1, min, min, max - 1, max - 1);
       // s(1, min, min + 1, max, max);
       // s(1, min, min + 1, max, max - 1);
       // s(1, min, min + 1, max - 1, max);
       // s(1, min, min + 1, max - 1, max - 1);
       // s(1, min + 1, min, max, max);
       // s(1, min + 1, min, max, max - 1);
       // s(1, min + 1, min, max - 1, max);
       // s(1, min + 1, min, max - 1, max - 1);
       // s(1, min + 1, min + 1, max, max);
       // s(1, min + 1, min + 1, max, max - 1);
       // s(1, min + 1, min + 1, max - 1, max);
//
       // s(max, min, max, min, min);
       // s(1, min, max, min, min + 1);
       // s(1, min, max, min + 1, min);
       // s(1, min, max, min + 1, min + 1);
       // s(1, min, max - 1, min, min);
       // s(1, min, max - 1, min, min + 1);
       // s(1, min, max - 1, min + 1, min);
       // s(1, min, max - 1, min + 1, min + 1);
       // s(1, min + 1, max, min, min);
       // s(1, min + 1, max, min, min + 1);
       // s(1, min + 1, max, min + 1, min);
       // s(1, min + 1, max, min + 1, min + 1);
       // s(1, min + 1, max - 1, min, min);
       // s(1, min + 1, max - 1, min, min + 1);
       // s(1, min + 1, max - 1, min + 1, min);
//
       // s(max, min, max, min, max);
       // s(1, min, max, min, max - 1);
       // s(1, min, max, min + 1, max);
       // s(1, min, max, min + 1, max - 1);
       // s(1, min, max - 1, min, max);
       // s(1, min, max - 1, min, max - 1);
       // s(1, min, max - 1, min + 1, max);
       // s(1, min, max - 1, min + 1, max - 1);
       // s(1, min + 1, max, min, max);
       // s(1, min + 1, max, min, max - 1);
       // s(1, min + 1, max, min + 1, max);
       // s(1, min + 1, max, min + 1, max - 1);
       // s(1, min + 1, max - 1, min, max);
       // s(1, min + 1, max - 1, min, max - 1);
       // s(1, min + 1, max - 1, min + 1, max);
//
       // s(max, min, max, max, min);
       // s(1, min, max, max, min + 1);
       // s(1, min, max, max - 1, min);
       // s(1, min, max, max - 1, min + 1);
       // s(1, min, max - 1, max, min);
       // s(1, min, max - 1, max, min + 1);
       // s(1, min, max - 1, max - 1, min);
       // s(1, min, max - 1, max - 1, min + 1);
       // s(1, min + 1, max, max, min);
       // s(1, min + 1, max, max, min + 1);
       // s(1, min + 1, max, max - 1, min);
       // s(1, min + 1, max, max - 1, min + 1);
       // s(1, min + 1, max - 1, max, min);
       // s(1, min + 1, max - 1, max, min + 1);
       // s(1, min + 1, max - 1, max - 1, min);
//
       // s(max, min, max, max, max);
       // s(1, min, max, max, max - 1);
       // s(1, min, max, max - 1, max);
       // s(1, min, max, max - 1, max - 1);
       // s(1, min, max - 1, max, max);
       // s(1, min, max - 1, max, max - 1);
       // s(1, min, max - 1, max - 1, max);
       // s(1, min, max - 1, max - 1, max - 1);
       // s(1, min + 1, max, max, max);
       // s(1, min + 1, max, max, max - 1);
       // s(1, min + 1, max, max - 1, max);
       // s(1, min + 1, max, max - 1, max - 1);
       // s(1, min + 1, max - 1, max, max);
       // s(1, min + 1, max - 1, max, max - 1);
       // s(1, min + 1, max - 1, max - 1, max);
//
       // s(max, max, min, min, min);
       // s(1, max, min, min, min + 1);
       // s(1, max, min, min + 1, min);
       // s(1, max, min, min + 1, min + 1);
       // s(1, max, min + 1, min, min);
       // s(1, max, min + 1, min, min + 1);
       // s(1, max, min + 1, min + 1, min);
       // s(1, max, min + 1, min + 1, min + 1);
       // s(1, max - 1, min, min, min);
       // s(1, max - 1, min, min, min + 1);
       // s(1, max - 1, min, min + 1, min);
       // s(1, max - 1, min, min + 1, min + 1);
       // s(1, max - 1, min + 1, min, min);
       // s(1, max - 1, min + 1, min, min + 1);
       // s(1, max - 1, min + 1, min + 1, min);
//
       // s(max, max, min, min, max);
       // s(1, max, min, min, max - 1);
       // s(1, max, min, min + 1, max);
       // s(1, max, min, min + 1, max - 1);
       // s(1, max, min + 1, min, max);
       // s(1, max, min + 1, min, max - 1);
       // s(1, max, min + 1, min + 1, max);
       // s(1, max, min + 1, min + 1, max - 1);
       // s(1, max - 1, min, min, max);
       // s(1, max - 1, min, min, max - 1);
       // s(1, max - 1, min, min + 1, max);
       // s(1, max - 1, min, min + 1, max - 1);
       // s(1, max - 1, min + 1, min, max);
       // s(1, max - 1, min + 1, min, max - 1);
       // s(1, max - 1, min + 1, min + 1, max);
//
       // s(max, max, min, max, min);
       // s(1, max, min, max, min + 1);
       // s(1, max, min, max - 1, min);
       // s(1, max, min, max - 1, min + 1);
       // s(1, max, min + 1, max, min);
       // s(1, max, min + 1, max, min + 1);
       // s(1, max, min + 1, max - 1, min);
       // s(1, max, min + 1, max - 1, min + 1);
       // s(1, max - 1, min, max, min);
       // s(1, max - 1, min, max, min + 1);
       // s(1, max - 1, min, max - 1, min);
       // s(1, max - 1, min, max - 1, min + 1);
       // s(1, max - 1, min + 1, max, min);
       // s(1, max - 1, min + 1, max, min + 1);
       // s(1, max - 1, min + 1, max - 1, min);
//
       // s(max, max, min, max, max);
       // s(1, max, min, max, max - 1);
       // s(1, max, min, max - 1, max);
       // s(1, max, min, max - 1, max - 1);
       // s(1, max, min + 1, max, max);
       // s(1, max, min + 1, max, max - 1);
       // s(1, max, min + 1, max - 1, max);
       // s(1, max, min + 1, max - 1, max - 1);
       // s(1, max - 1, min, max, max);
       // s(1, max - 1, min, max, max - 1);
       // s(1, max - 1, min, max - 1, max);
       // s(1, max - 1, min, max - 1, max - 1);
       // s(1, max - 1, min + 1, max, max);
       // s(1, max - 1, min + 1, max, max - 1);
       // s(1, max - 1, min + 1, max - 1, max);
//
       // s(max, max, max, min, min);
       // s(1, max, max, min, min + 1);
       // s(1, max, max, min + 1, min);
       // s(1, max, max, min + 1, min + 1);
       // s(1, max, max - 1, min, min);
       // s(1, max, max - 1, min, min + 1);
       // s(1, max, max - 1, min + 1, min);
       // s(1, max, max - 1, min + 1, min + 1);
       // s(1, max - 1, max, min, min);
       // s(1, max - 1, max, min, min + 1);
       // s(1, max - 1, max, min + 1, min);
       // s(1, max - 1, max, min + 1, min + 1);
       // s(1, max - 1, max - 1, min, min);
       // s(1, max - 1, max - 1, min, min + 1);
       // s(1, max - 1, max - 1, min + 1, min);
//
       // s(max, max, max, min, max);
       // s(1, max, max, min, max - 1);
       // s(1, max, max, min + 1, max);
       // s(1, max, max, min + 1, max - 1);
       // s(1, max, max - 1, min, max);
       // s(1, max, max - 1, min, max - 1);
       // s(1, max, max - 1, min + 1, max);
       // s(1, max, max - 1, min + 1, max - 1);
       // s(1, max - 1, max, min, max);
       // s(1, max - 1, max, min, max - 1);
       // s(1, max - 1, max, min + 1, max);
       // s(1, max - 1, max, min + 1, max - 1);
       // s(1, max - 1, max - 1, min, max);
       // s(1, max - 1, max - 1, min, max - 1);
       // s(1, max - 1, max - 1, min + 1, max);
//
       // s(max, max, max, max, min);
       // s(1, max, max, max, min + 1);
       // s(1, max, max, max - 1, min);
       // s(1, max, max, max - 1, min + 1);
       // s(1, max, max - 1, max, min);
       // s(1, max, max - 1, max, min + 1);
       // s(1, max, max - 1, max - 1, min);
       // s(1, max, max - 1, max - 1, min + 1);
       // s(1, max - 1, max, max, min);
       // s(1, max - 1, max, max, min + 1);
       // s(1, max - 1, max, max - 1, min);
       // s(1, max - 1, max, max - 1, min + 1);
       // s(1, max - 1, max - 1, max, min);
       // s(1, max - 1, max - 1, max, min + 1);
       // s(1, max - 1, max - 1, max - 1, min);
//
       // s(max, max, max, max, max);
       // s(1, max, max, max, max - 1);
       // s(1, max, max, max - 1, max);
       // s(1, max, max, max - 1, max - 1);
       // s(1, max, max - 1, max, max);
       // s(1, max, max - 1, max, max - 1);
       // s(1, max, max - 1, max - 1, max);
       // s(1, max, max - 1, max - 1, max - 1);
       // s(1, max - 1, max, max, max);
       // s(1, max - 1, max, max, max - 1);
       // s(1, max - 1, max, max - 1, max);
       // s(1, max - 1, max, max - 1, max - 1);
       // s(1, max - 1, max - 1, max, max);
       // s(1, max - 1, max - 1, max, max - 1);
       // s(1, max - 1, max - 1, max - 1, max);
        //////////////////////////////2. Классы эквивалентности
        //////////////////////////////2.1 Границы классов эквивалентности
        //s(max, max, max, max, max);
        //s(gFM, min, min, min, min);

        s(12, 12, 12, 12, -2147483640);
        s(12, 12, 12, 12, 2147483640);

        s(12, 12, 12, -2147483640, 12);
        s(12, 12, 12, 2147483640, 12);

        s(12, 12, -2147483640, 12, 12);
        s(12, 12, 2147483640, 12, 12);

        s(12, -2147483640, 12, 12, 12);
        s(12, 2147483640, 12, 12, 12);


        s(6, 12, 12, 12, -2147483646);
        s(6, 12, 12, 12, 2147483646);

        s(6, 12, 12, -2147483646, 12);
        s(6, 12, 12, 2147483646, 12);

        s(6, 12, -2147483646, 12, 12);
        s(6, 12, 2147483646, 12, 12);

        s(6, -2147483646, 12, 12, 12);
        s(6, 2147483646, 12, 12, 12);


        s(4, 12, 12, 12, -2147483648);
        s(4, 12, 12, 12, 2147483644);

        s(4, 12, 12, -2147483648, 12);
        s(4, 12, 12, 2147483644, 12);

        s(4, 12, -2147483648, 12, 12);
        s(4, 12, 2147483644, 12, 12);

        s(4, -2147483648, 12, 12, 12);
        s(4, 2147483644, 12, 12, 12);


        s(3, 12, 12, 12, -2147483643);
        s(3, 12, 12, 12, 2147483643);

        s(3, 12, 12, -2147483643, 12);
        s(3, 12, 12, 2147483643, 12);

        s(3, 12, -2147483643, 12, 12);
        s(3, 12, 2147483643, 12, 12);

        s(3, -2147483643, 12, 12, 12);
        s(3, 2147483643, 12, 12, 12);


        s(2, 12, 12, 12, -2147483638);
        s(2, 12, 12, 12, 2147483638);

        s(2, 12, 12, -2147483638, 12);
        s(2, 12, 12, 2147483638, 12);

        s(2, 12, -2147483638, 12, 12);
        s(2, 12, 2147483638, 12, 12);

        s(2, -2147483638, 12, 12, 12);
        s(2, 2147483638, 12, 12, 12);


        s(1, 12, 12, 12, min+1);
        s(1, 12, 12, 12, max);

        s(1, 12, 12, min+1, 12);
        s(1, 12, 12, max, 12);

        s(1, 12, min+1, 12, 12);
        s(1, 12, max, 12, 12);

        s(1, min+1, 12, 12, 12);
        s(1, max, 12, 12, 12);



        //////////////////////////////2.2 Впритык слева и справа от границы
        s(12, 12, 12, 12, -2147483628);
        s(12, 12, 12, 12, 2147483628);

        s(12, 12, 12, -2147483628, 12);
        s(12, 12, 12, 2147483628, 12);

        s(12, 12, -2147483628, 12, 12);
        s(12, 12, 2147483628, 12, 12);

        s(12, -2147483628, 12, 12, 12);
        s(12, 2147483628, 12, 12, 12);


        s(6, 12, 12, 12, -2147483634);
        s(6, 12, 12, 12, 2147483634);

        s(6, 12, 12, -2147483634, 12);
        s(6, 12, 12, 2147483634, 12);

        s(6, 12, -2147483634, 12, 12);
        s(6, 12, 2147483634, 12, 12);

        s(6, -2147483634, 12, 12, 12);
        s(6, 2147483634, 12, 12, 12);


        s(4, 12, 12, 12, -2147483636);
        s(4, 12, 12, 12, 2147483632);

        s(4, 12, 12, -2147483636, 12);
        s(4, 12, 12, 2147483632, 12);

        s(4, 12, -2147483636, 12, 12);
        s(4, 12, 2147483632, 12, 12);

        s(4, -2147483636, 12, 12, 12);
        s(4, 2147483632, 12, 12, 12);


        s(3, 12, 12, 12, -2147483637);
        s(3, 12, 12, 12, 2147483637);

        s(3, 12, 12, -2147483637, 12);
        s(3, 12, 12, 2147483637, 12);

        s(3, 12, -2147483637, 12, 12);
        s(3, 12, 2147483637, 12, 12);

        s(3, -2147483637, 12, 12, 12);
        s(3, 2147483637, 12, 12, 12);


        s(2, 12, 12, 12, -2147483626);
        s(2, 12, 12, 12, 2147483626);

        s(2, 12, 12, -2147483626, 12);
        s(2, 12, 12, 2147483626, 12);

        s(2, 12, -2147483626, 12, 12);
        s(2, 12, 2147483626, 12, 12);

        s(2, -2147483626, 12, 12, 12);
        s(2, 2147483626, 12, 12, 12);


        s(1, 12, 12, 12, min+3);
        s(1, 12, 12, 12, max-2);

        s(1, 12, 12, min+3, 12);
        s(1, 12, 12, max-2, 12);

        s(1, 12, min+3, 12, 12);
        s(1, 12, max-2, 12, 12);

        s(1, min+3, 12, 12, 12);
        s(1, max-2, 12, 12, 12);

        //////////////////////////////2.3 Внутри класса эквивалентности
        s(max, max, max, max, max);
        s(gFM, min, min, min, min);

        s(12, 12, 12, 12, 48);
        s(12, 12, 12, 48, 12);
        s(12, 12, 48, 12, 12);
        s(12, 48, 12, 12, 12);

        s(6, 12, 12, 12, 6);
        s(6, 12, 12, 6, 12);
        s(6, 12, 6, 12, 12);
        s(6, 6, 12, 12, 12);

        s(4, 12, 12, 12, 4);
        s(4, 12, 12, 4, 12);
        s(4, 12, 4, 12, 12);
        s(4, 4, 12, 12, 12);

        s(3, 12, 12, 12, 3);
        s(3, 12, 12, 3, 12);
        s(3, 12, 3, 12, 12);
        s(3, 3, 12, 12, 12);

        s(2, 12, 12, 12, 2);
        s(2, 12, 12, 2, 12);
        s(2, 12, 2, 12, 12);
        s(2, 2, 12, 12, 12);

        s(1, 12, 12, 12, 1);
        s(1, 12, 12, 1, 12);
        s(1, 12, 1, 12, 12);
        s(1, 1, 12, 12, 12);

        //////////////////////////////3. Предметная область
        s(2, 4, 6, 8, 10);
        s(3, 6, 9, 12, 15);
        s(5, 10, 15, 20, 25);
        s(7, 14, 21, 28, 35);
        s(9, 18, 27, 36, 45);
        s(64, 128, 192, 256, 320);

        //////////////////////////////4. Реализация
        s(9, 81, 27, 18, 0);
        s(9, 81, 27, 0, 45);
        s(27, 81, 27, 0, 0);
        s(9, 81, 0, 18, 45);
        s(9, 81, 0, 18, 0);
        s(9, 81, 0, 0, 45);
        s(81, 81, 0, 0, 0);
        s(9, 0, 27, 18, 45);
        s(9, 0, 27, 18, 0);
        s(9, 0, 27, 0, 45);
        s(27, 0, 27, 0, 0);
        s(9, 0, 0, 18, 45);
        s(18, 0, 0, 18, 0);
        s(45, 0, 0, 0, 45);
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
        s(5, 5, 5, 5, 5);
        s(5, 5, 5, 5, -5);
        s(5, 5, 5, -5, 5);
        s(5, 5, 5, -5, -5);
        s(5, 5, -5, 5, 5);
        s(5, 5, -5, 5, -5);
        s(5, 5, -5, -5, 5);
        s(5, 5, -5, -5, -5);
        s(5, -5, 5, 5, 5);
        s(5, -5, 5, 5, -5);
        s(5, -5, 5, -5, 5);
        s(5, -5, 5, -5, -5);
        s(5, -5, -5, 5, 5);
        s(5, -5, -5, 5, -5);
        s(5, -5, -5, -5, 5);
        s(5, -5, -5, -5, -5);
        s(2, -4, -6, 42, -32);
        s(3, -3, -9, 18, -12);
        s(4, -8, -12, -16, 40);
        s(6, -18, -12, -24, -30);
        s(7, 14, -21, -49, 70);
        s(8, -64, -16, 24, -24);
        s(9, 18, -81, -27, -45);
        s(10, -100, -40, -50, -5000);
        s(11, -22, 33, -44, -55);
        s(12, -144, -132, -24, -48);
        s(13, -39, -78, -26, 13);
        s(14, -28, 14, -42, -56);
        s(15, -45, -30, 135, -150);
        s(16, -32, -64, 128, -48);
        s(17, 34, -51, -68, -136);
        s(18, -324, -36, -18, -36);
        s(19, -38, -57, 190, -190);
        s(20, 40, -80, -100, -500);
        s(321, -321, 963, -963, 1926);
        s(71, 142, -142, -71, -10082);
        s(42, -84, -42, -42, -84);
        s(1232, 1232, -1232, 2464, -2464);
        s(76, -456, -76, -912, -1824);
        s(52, 104, -52, -52, -104);
        s(123, -123, 123, -123, -123);
        s(32, -32, -32, -32, -32);
        s(54, -54, -54, -54, 54);
        s(55, -55, 110, -220, -880);
        s(66, -66, -66, -3300, 66);
        s(77, -77, -77, -231, -231);
        s(88, -88, -88, -88, 88);
        s(99, -99, -99, 99, -198);

    }
    private void s(int gcd, int a, int b, int c, int d) {
        assertEquals(gcd, f(a, b, c, d));
    }
}
