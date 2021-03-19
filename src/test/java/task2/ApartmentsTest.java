package task2;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static task2.Apartments.main;

public class ApartmentsTest {


    @Test
    public void runScenarios() {
        int min = 1;
        int max = Integer.MAX_VALUE;
        /////////////////////////////////////1 Граничные значения области определения.
        validInputTest(1, 1, min, max, min);
        validInputTest(1, 1, min + 1, max, min);
        validInputTest(1, 1, min, max - 1, min);

        validInputTest(1, 1, min, 214748364, 10);
        validInputTest(1, 1, min + 1, 214748364, 10);
        validInputTest(1, 1, min, 214748363, 10);
        validInputTest(1, 1, min, 214748364, 9);
        validInputTest(1, 1, min, 214748363, 9);

        validInputTest(1, 1, min, 42949672, 50);
        validInputTest(1, 1, min + 1, 42949672, 50);
        validInputTest(1, 1, min, 42949671, 50);
        validInputTest(1, 1, min, 42949672, 49);
        validInputTest(1, 1, min, 42949671, 49);

        validInputTest(1, 1, min, 21474836, 100);
        validInputTest(1, 1, min + 1, 21474836, 100);
        validInputTest(1, 1, min, 21474835, 100);
        validInputTest(1, 1, min, 21474836, 99);
        validInputTest(1, 1, min, 21474835, 99);

        validInputTest(1, 1, min, 4294967, 500);
        validInputTest(1, 1, min + 1, 4294967, 500);
        validInputTest(1, 1, min, 4294966, 500);
        validInputTest(1, 1, min, 4294967, 499);
        validInputTest(1, 1, min, 4294966, 499);

        validInputTest(1, 1, min, 2147483, 1000);
        validInputTest(1, 1, min + 1, 2147483, 1000);
        validInputTest(1, 1, min, 2147482, 1000);
        validInputTest(1, 1, min, 2147483, 999);
        validInputTest(1, 1, min, 2147482, 999);

        validInputTest(1, 1, min, 429496, 5000);
        validInputTest(1, 1, min + 1, 429496, 5000);
        validInputTest(1, 1, min, 429495, 5000);
        validInputTest(1, 1, min, 429496, 4999);
        validInputTest(1, 1, min, 429495, 4999);

        validInputTest(1, 1, min, 214748, 10000);
        validInputTest(1, 1, min + 1, 214748, 10000);
        validInputTest(1, 1, min, 214747, 10000);
        validInputTest(1, 1, min, 214748, 9999);
        validInputTest(1, 1, min, 214747, 9999);

        validInputTest(1, 1, min, 46341, 46340);
        validInputTest(1, 1, min + 1, 46341, 46340);
        validInputTest(1, 1, min, 46340, 46340);
        validInputTest(1, 1, min, 46341, 46339);
        validInputTest(1, 1, min, 46340, 46339);

        validInputTest(1, 1, min, 46340, 46341);
        validInputTest(1, 1, min + 1, 46340, 46341);
        validInputTest(1, 1, min, 46339, 46341);
        validInputTest(1, 1, min, 46340, 46340);
        validInputTest(1, 1, min, 46339, 46340);

        validInputTest(1, 1, min, 10000, 214748);
        validInputTest(1, 1, min + 1, 10000, 214748);
        validInputTest(1, 1, min, 9999, 214748);
        validInputTest(1, 1, min, 10000, 214747);
        validInputTest(1, 1, min, 9999, 214747);

        validInputTest(1, 1, min, 5000, 429496);
        validInputTest(1, 1, min + 1, 5000, 429496);
        validInputTest(1, 1, min, 4999, 429496);
        validInputTest(1, 1, min, 5000, 429495);
        validInputTest(1, 1, min, 4999, 429495);

        validInputTest(1, 1, min, 1000, 2147483);
        validInputTest(1, 1, min + 1, 1000, 2147483);
        validInputTest(1, 1, min, 999, 2147483);
        validInputTest(1, 1, min, 1000, 2147482);
        validInputTest(1, 1, min, 999, 2147482);

        validInputTest(1, 1, min, 500, 4294967);
        validInputTest(1, 1, min + 1, 500, 4294967);
        validInputTest(1, 1, min, 499, 4294967);
        validInputTest(1, 1, min, 500, 4294966);
        validInputTest(1, 1, min, 499, 4294966);

        validInputTest(1, 1, min, 100, 21474836);
        validInputTest(1, 1, min + 1, 100, 21474836);
        validInputTest(1, 1, min, 99, 21474836);
        validInputTest(1, 1, min, 100, 21474835);
        validInputTest(1, 1, min, 99, 21474835);

        validInputTest(1, 1, min, 50, 42949672);
        validInputTest(1, 1, min + 1, 50, 42949672);
        validInputTest(1, 1, min, 49, 42949672);
        validInputTest(1, 1, min, 50, 42949671);
        validInputTest(1, 1, min, 49, 42949671);

        validInputTest(1, 1, min, 10, 214748364);
        validInputTest(1, 1, min + 1, 10, 214748364);
        validInputTest(1, 1, min, 9, 214748364);
        validInputTest(1, 1, min, 10, 214748363);
        validInputTest(1, 1, min, 9, 214748363);

        validInputTest(1, 1, min, min, max);
        validInputTest(2, 1, min + 1, min, max);
        validInputTest(1, 1, min, min, max - 1);

        validInputTest(1, 1, max, max, min);
        validInputTest(1, 1, max - 1, max, min);
        validInputTest(1, 2, max, max - 1, min);

        validInputTest(1, 2, max, 214748364, 10);
        validInputTest(1, 2, max - 1, 214748364, 10);
        validInputTest(2, 2, max, 214748364, 9);
        validInputTest(1, 2, max, 214748363, 10);
        validInputTest(2, 2, max, 214748363, 9);

        validInputTest(1, 2, max, 42949672, 50);
        validInputTest(1, 2, max - 1, 42949672, 50);
        validInputTest(2, 2, max, 42949672, 49);
        validInputTest(1, 2, max, 42949671, 50);
        validInputTest(2, 2, max, 42949671, 49);

        validInputTest(1, 2, max, 21474836, 100);
        validInputTest(1, 2, max - 1, 21474836, 100);
        validInputTest(2, 2, max, 21474836, 99);
        validInputTest(1, 2, max, 21474835, 100);
        validInputTest(2, 2, max, 21474835, 99);

        validInputTest(1, 2, max, 4294967, 500);
        validInputTest(1, 2, max - 1, 4294967, 500);
        validInputTest(2, 2, max, 4294967, 499);
        validInputTest(1, 2, max, 4294966, 500);
        validInputTest(2, 2, max, 4294966, 499);

        validInputTest(1, 2, max, 2147483, 1000);
        validInputTest(1, 2, max - 1, 2147483, 1000);
        validInputTest(2, 2, max, 2147483, 999);
        validInputTest(1, 2, max, 2147482, 1000);
        validInputTest(2, 2, max, 2147482, 999);

        validInputTest(1, 2, max, 429496, 5000);
        validInputTest(1, 2, max - 1, 429496, 5000);
        validInputTest(2, 2, max, 429496, 4999);
        validInputTest(1, 2, max, 429495, 5000);
        validInputTest(2, 2, max, 429495, 4999);

        validInputTest(1, 2, max, 214748, 10000);
        validInputTest(1, 2, max - 1, 214748, 10000);
        validInputTest(2, 2, max, 214748, 9999);
        validInputTest(1, 2, max, 214747, 10000);
        validInputTest(2, 2, max, 214747, 9999);

        validInputTest(1, 2, max, 46341, 46340);
        validInputTest(1, 2, max - 1, 46341, 46340);
        validInputTest(2, 2, max, 46341, 46339);
        validInputTest(2, 2, max, 46340, 46340);
        validInputTest(3, 2, max, 46340, 46339);

        validInputTest(1, 2, max, 46340, 46341);
        validInputTest(1, 2, max - 1, 46340, 46341);
        validInputTest(2, 2, max, 46340, 46340);
        validInputTest(2, 2, max, 46339, 46341);
        validInputTest(3, 2, max, 46339, 46340);

        validInputTest(1, 2, max, 10000, 214748);
        validInputTest(1, 2, max - 1, 10000, 214748);
        validInputTest(2, 2, max, 10000, 214747);
        validInputTest(22, 2, max, 9999, 214748);
        validInputTest(23, 2, max, 9999, 214747);

        validInputTest(1, 2, max, 5000, 429496);
        validInputTest(1, 2, max - 1, 5000, 429496);
        validInputTest(2, 2, max, 5000, 429495);
        validInputTest(87, 2, max, 4999, 429496);
        validInputTest(88, 2, max, 4999, 429495);

        validInputTest(1, 2, max, 1000, 2147483);
        validInputTest(1, 2, max - 1, 1000, 2147483);
        validInputTest(2, 2, max, 1000, 2147482);
        validInputTest(2151, 2, max, 999, 2147483);
        validInputTest(2152, 2, max, 999, 2147482);

        validInputTest(1, 2, max, 500, 4294967);
        validInputTest(1, 2, max - 1, 500, 4294967);
        validInputTest(2, 2, max, 500, 4294966);
        validInputTest(8608, 2, max, 499, 4294967);
        validInputTest(8609, 2, max, 499, 4294966);

        validInputTest(1, 2, max, 100, 21474836);
        validInputTest(1, 2, max - 1, 100, 21474836);
        validInputTest(2, 2, max, 100, 21474835);
        validInputTest(216919, 2, max, 99, 21474836);
        validInputTest(216920, 2, max, 99, 21474835);

        validInputTest(1, 2, max, 50, 42949672);
        validInputTest(1, 2, max - 1, 50, 42949672);
        validInputTest(2, 2, max, 50, 42949671);
        validInputTest(876525, 2, max, 49, 42949672);
        validInputTest(876526, 2, max, 49, 42949671);

        validInputTest(1, 2, max, 10, 214748364);
        validInputTest(1, 2, max - 1, 10, 214748364);
        validInputTest(2, 2, max, 10, 214748363);
        validInputTest(23860931, 2, max, 9, 214748364);
        validInputTest(23860932, 2, max, 9, 214748363);

        validInputTest(2147483647, 1, max, min, max);
        validInputTest(2147483646, 1, max - 1, min, max);
        validInputTest(1, 2, max, min, max - 1);

        validInputTest(1, 1, min, 10, min);
        validInputTest(1, 1, min + 1, 10, min);
        validInputTest(1, 1, min, 10, min + 1);
        validInputTest(1, 1, min, 9, min);
        validInputTest(1, 1, min, 11, min);

        validInputTest(1, 1, min, 100, min);
        validInputTest(1, 1, min + 1, 100, min);
        validInputTest(1, 1, min, 100, min + 1);
        validInputTest(1, 1, min, 99, min);
        validInputTest(1, 1, min, 101, min);

        validInputTest(1, 1, min, 1000, min);
        validInputTest(1, 1, min + 1, 1000, min);
        validInputTest(1, 1, min, 1000, min + 1);
        validInputTest(1, 1, min, 999, min);
        validInputTest(1, 1, min, 1001, min);

        validInputTest(1, 1, min, 10000, min);
        validInputTest(1, 1, min + 1, 10000, min);
        validInputTest(1, 1, min, 10000, min + 1);
        validInputTest(1, 1, min, 9999, min);
        validInputTest(1, 1, min, 10001, min);

        validInputTest(1, 1, min, 100000, min);
        validInputTest(1, 1, min + 1, 100000, min);
        validInputTest(1, 1, min, 100000, min + 1);
        validInputTest(1, 1, min, 99999, min);
        validInputTest(1, 1, min, 100001, min);

        validInputTest(1, 1, min, 1000000, min);
        validInputTest(1, 1, min + 1, 1000000, min);
        validInputTest(1, 1, min, 1000000, min + 1);
        validInputTest(1, 1, min, 999999, min);
        validInputTest(1, 1, min, 1000001, min);

        validInputTest(1, 1, min, 10000000, min);
        validInputTest(1, 1, min + 1, 10000000, min);
        validInputTest(1, 1, min, 10000000, min + 1);
        validInputTest(1, 1, min, 9999999, min);
        validInputTest(1, 1, min, 10000001, min);

        validInputTest(1, 1, min, 100000000, min);
        validInputTest(1, 1, min + 1, 100000000, min);
        validInputTest(1, 1, min, 100000000, min + 1);
        validInputTest(1, 1, min, 99999999, min);
        validInputTest(1, 1, min, 100000001, min);

        validInputTest(1, 1, min, 1000000000, min);
        validInputTest(1, 1, min + 1, 1000000000, min);
        validInputTest(1, 1, min, 1000000000, min + 1);
        validInputTest(1, 1, min, 999999999, min);
        validInputTest(1, 1, min, 1000000001, min);

        validInputTest(1, 1, min, max, min);
        validInputTest(1, 1, min + 1, max, min);
        validInputTest(1, 1, min, max - 1, min);

        validInputTest(1, 1, min, min, 10);
        validInputTest(2, 1, min + 1, min, 10);
        validInputTest(1, 1, min, min, 9);
        validInputTest(1, 1, min, min + 1, 10);
        validInputTest(1, 1, min, min, 11);

        validInputTest(1, 1, min, min, 100);
        validInputTest(2, 1, min + 1, min, 100);
        validInputTest(1, 1, min, min, 99);
        validInputTest(1, 1, min, min + 1, 100);
        validInputTest(1, 1, min, min, 101);

        validInputTest(1, 1, min, min, 1000);
        validInputTest(2, 1, min + 1, min, 1000);
        validInputTest(1, 1, min, min, 999);
        validInputTest(1, 1, min, min + 1, 1000);
        validInputTest(1, 1, min, min, 1001);

        validInputTest(1, 1, min, min, 10000);
        validInputTest(2, 1, min + 1, min, 10000);
        validInputTest(1, 1, min, min, 9999);
        validInputTest(1, 1, min, min + 1, 10000);
        validInputTest(1, 1, min, min, 10001);

        validInputTest(1, 1, min, min, 100000);
        validInputTest(2, 1, min + 1, min, 100000);
        validInputTest(1, 1, min, min, 99999);
        validInputTest(1, 1, min, min + 1, 100000);
        validInputTest(1, 1, min, min, 100001);

        validInputTest(1, 1, min, min, 1000000);
        validInputTest(2, 1, min + 1, min, 1000000);
        validInputTest(1, 1, min, min, 999999);
        validInputTest(1, 1, min, min + 1, 1000000);
        validInputTest(1, 1, min, min, 1000001);

        validInputTest(1, 1, min, min, 10000000);
        validInputTest(2, 1, min + 1, min, 10000000);
        validInputTest(1, 1, min, min, 9999999);
        validInputTest(1, 1, min, min + 1, 10000000);
        validInputTest(1, 1, min, min, 10000001);

        validInputTest(1, 1, min, min, 100000000);
        validInputTest(2, 1, min + 1, min, 100000000);
        validInputTest(1, 1, min, min, 9);
        validInputTest(1, 1, min, min + 1, 100000000);
        validInputTest(1, 1, min, min, 100000001);

        validInputTest(1, 1, min, min, 1000000000);
        validInputTest(2, 1, min + 1, min, 1000000000);
        validInputTest(1, 1, min, min, 999999999);
        validInputTest(1, 1, min, min + 1, 1000000000);
        validInputTest(1, 1, min, min, 1000000001);

        validInputTest(1, 1, min, min, max);
        validInputTest(2, 1, min + 1, min, max);
        validInputTest(1, 1, min, min, max - 1);

        validInputTest(1, 214748365, max, 10, min);
        validInputTest(1, 214748365, max - 1, 10, min);
        validInputTest(1, 238609295, max, 9, min);
        validInputTest(1, 195225787, max, 11, min);

        validInputTest(1, 21474837, max, 100, min);
        validInputTest(1, 21474837, max - 1, 100, min);
        validInputTest(1, 21691755, max, 99, min);
        validInputTest(1, 21262215, max, 101, min);

        validInputTest(1, 2147484, max, 1000, min);
        validInputTest(1, 2147484, max - 1, 1000, min);
        validInputTest(1, 2149634, max, 999, min);
        validInputTest(1, 2145339, max, 1001, min);

        validInputTest(1, 214749, max, 10000, min);
        validInputTest(1, 214749, max - 1, 10000, min);
        validInputTest(1, 214770, max, 9999, min);
        validInputTest(1, 214727, max, 10001, min);

        validInputTest(1, 21475, max, 100000, min);
        validInputTest(1, 21475, max - 1, 100000, min);
        validInputTest(1, 21476, max, 99999, min);
        validInputTest(1, 21475, max, 100001, min);

        validInputTest(1, 2148, max, 1000000, min);
        validInputTest(1, 2148, max - 1, 1000000, min);
        validInputTest(1, 2148, max, 999999, min);
        validInputTest(1, 2148, max, 1000001, min);

        validInputTest(1, 215, max, 10000000, min);
        validInputTest(1, 215, max - 1, 10000000, min);
        validInputTest(1, 215, max, 9999999, min);
        validInputTest(1, 215, max, 10000001, min);

        validInputTest(1, 22, max, 100000000, min);
        validInputTest(1, 22, max - 1, 100000000, min);
        validInputTest(1, 22, max, 99999999, min);
        validInputTest(1, 22, max, 100000001, min);

        validInputTest(1, 3, max, 1000000000, min);
        validInputTest(1, 3, max - 1, 1000000000, min);
        validInputTest(1, 3, max, 999999999, min);
        validInputTest(1, 3, max, 1000000001, min);

        validInputTest(1, 1, max, max, min);
        validInputTest(1, 1, max - 1, max, min);
        validInputTest(1, 2, max, max - 1, min);

        validInputTest(7, 214748365, max, min, 10);
        validInputTest(6, 214748365, max - 1, min, 10);
        validInputTest(1, 195225787, max, min, 11);
        validInputTest(4, 107374183, max, min + 1, 10);
        validInputTest(1, 238609295, max, min, 9);

        validInputTest(47, 21474837, max, min, 100);
        validInputTest(46, 21474837, max - 1, min, 100);
        validInputTest(33, 21262215, max, min, 101);
        validInputTest(24, 10737419, max, min + 1, 100);
        validInputTest(1, 21691755, max, min, 99);

        validInputTest(647, 2147484, max, min, 1000);
        validInputTest(646, 2147484, max - 1, min, 1000);
        validInputTest(309, 2145339, max, min, 1001);
        validInputTest(824, 1073742, max, min + 1, 1000);
        validInputTest(280, 2149634, max, min, 999);

        validInputTest(3647, 214749, max, min, 10000);
        validInputTest(3646, 214749, max - 1, min, 10000);
        validInputTest(8921, 214727, max, min, 10001);
        validInputTest(1824, 107375, max, min + 1, 10000);
        validInputTest(8416, 214770, max, min, 9999);

        validInputTest(83647, 21475, max, min, 100000);
        validInputTest(83646, 21475, max - 1, min, 100000);
        validInputTest(62173, 21475, max, min, 100001);
        validInputTest(41824, 10738, max, min + 1, 100000);
        validInputTest(5122, 21476, max, min, 99999);

        validInputTest(483647, 2148, max, min, 1000000);
        validInputTest(483646, 2148, max - 1, min, 1000000);
        validInputTest(481500, 2148, max, min, 1000001);
        validInputTest(741824, 1074, max, min + 1, 1000000);
        validInputTest(485794, 2148, max, min, 999999);

        validInputTest(7483647, 215, max, min, 10000000);
        validInputTest(7483646, 215, max - 1, min, 10000000);
        validInputTest(7483433, 215, max, min, 10000001);
        validInputTest(3741824, 108, max, min + 1, 10000000);
        validInputTest(7483861, 215, max, min, 9999999);

        validInputTest(47483647, 22, max, min, 100000000);
        validInputTest(47483646, 22, max - 1, min, 100000000);
        validInputTest(47483626, 22, max, min, 100000001);
        validInputTest(73741824, 11, max, min + 1, 100000000);
        validInputTest(47483668, 22, max, min, 99999999);

        validInputTest(147483647, 3, max, min, 1000000000);
        validInputTest(147483646, 3, max - 1, min, 1000000000);
        validInputTest(147483645, 3, max, min, 1000000001);
        validInputTest(73741824, 2, max, min + 1, 1000000000);
        validInputTest(147483649, 3, max, min, 999999999);

        validInputTest(max, 1, max, min, max);
        validInputTest(2147483646, 1, max - 1, min, max);
        validInputTest(1, 2, max, min, max - 1);

        validInputTest(1, 1, max / 2, max, min);
        validInputTest(1073741823, 1, max / 2, min, max);
        //////////////////////////////////////2 Классы эквивалентности
        //////////////////////////////////////2.1 Границы классов эквивалентности
        invalidInputTest(0, 5, 3);
        validInputTest(1, 1, 1, 5, 3);
        validInputTest(1, 1, 5, 5, 3);
        validInputTest(2, 1, 6, 5, 3);
        validInputTest(2, 1, 10, 5, 3);
        validInputTest(3, 1, 11, 5, 3);
        validInputTest(3, 1, 15, 5, 3);
        validInputTest(1, 2, 16, 5, 3);
        validInputTest(1, 2, 20, 5, 3);
        validInputTest(2, 2, 21, 5, 3);
        validInputTest(2, 2, 25, 5, 3);
        validInputTest(3, 2, 26, 5, 3);
        validInputTest(3, 2, 30, 5, 3);
        validInputTest(1, 71582788, 1073741806, 5, 3);
        validInputTest(1, 71582788, 1073741810, 5, 3);
        validInputTest(2, 71582788, 1073741811, 5, 3);
        validInputTest(2, 71582788, 1073741815, 5, 3);
        validInputTest(3, 71582788, 1073741816, 5, 3);
        validInputTest(3, 71582788, 1073741820, 5, 3);
        validInputTest(1, 71582789, 1073741821, 5, 3);
        validInputTest(1, 71582789, 1073741825, 5, 3);
        validInputTest(2, 71582789, 1073741826, 5, 3);
        validInputTest(2, 71582789, 1073741830, 5, 3);
        validInputTest(3, 71582789, 1073741831, 5, 3);
        validInputTest(3, 71582789, 1073741835, 5, 3);
        validInputTest(1, 71582790, 1073741836, 5, 3);
        validInputTest(1, 71582790, 1073741840, 5, 3);
        validInputTest(2, 71582790, 1073741841, 5, 3);
        validInputTest(2, 71582790, 1073741845, 5, 3);
        validInputTest(3, 71582790, 1073741846, 5, 3);
        validInputTest(3, 71582790, 1073741850, 5, 3);
        validInputTest(1, 143165575, 2147483611, 5, 3);
        validInputTest(1, 143165575, 2147483615, 5, 3);
        validInputTest(2, 143165575, 2147483616, 5, 3);
        validInputTest(2, 143165575, 2147483620, 5, 3);
        validInputTest(3, 143165575, 2147483621, 5, 3);
        validInputTest(3, 143165575, 2147483625, 5, 3);
        validInputTest(1, 143165576, 2147483626, 5, 3);
        validInputTest(1, 143165576, 2147483630, 5, 3);
        validInputTest(2, 143165576, 2147483631, 5, 3);
        validInputTest(2, 143165576, 2147483635, 5, 3);
        validInputTest(3, 143165576, 2147483636, 5, 3);
        validInputTest(3, 143165576, 2147483640, 5, 3);
        validInputTest(1, 101, 1501, 5, 3);
        validInputTest(1, 101, 1505, 5, 3);
        validInputTest(2, 101, 1506, 5, 3);
        validInputTest(2, 101, 1510, 5, 3);
        validInputTest(3, 101, 1511, 5, 3);
        validInputTest(3, 101, 1515, 5, 3);

        invalidInputTest(0, 0, min);
        invalidInputTest(1, 0, min);
        invalidInputTest(2, 0, min);
        invalidInputTest(1073741823, 0, min);
        invalidInputTest(756474633, 0, min);
        invalidInputTest(max - 1, 0, min);
        invalidInputTest(max, 0, min);

        invalidInputTest(0, min, 0);
        invalidInputTest(1, min, 0);
        invalidInputTest(2, min, 0);
        invalidInputTest(1948565877, 0, min);
        invalidInputTest(1073741823, min, 0);
        invalidInputTest(max - 1, min, 0);
        invalidInputTest(max, min, 0);

        invalidInputTest(0, min, min);
        validInputTest(1, 1, 1, min, min);
        validInputTest(1, 2, 2, min, min);
        validInputTest(1, 165584, 165584, min, min);
        validInputTest(1, 1073741822, (max / 2) - 1, min, min);
        validInputTest(1, 1073741823, max / 2, min, min);
        validInputTest(1, 1073741824, (max / 2) + 1, min, min);
        validInputTest(1, max - 1, max - 1, min, min);
        validInputTest(1, max, max, min, min);


        invalidInputTest(0, min + 1, min);
        validInputTest(1, 1, 1, min + 1, min);
        validInputTest(1, 1, 2, min + 1, min);
        validInputTest(1, 2, 3, min + 1, min);
        validInputTest(1, 2, 4, min + 1, min);
        validInputTest(1, 82792, 165584, min + 1, min);
        validInputTest(1, 536870911, (max / 2) - 1, min + 1, min);
        validInputTest(1, 536870912, max / 2, min + 1, min);
        validInputTest(1, 536870912, (max / 2) + 1, min + 1, min);
        validInputTest(1, 536870913, (max / 2) + 2, min + 1, min);
        validInputTest(1, 1073741822, 2147483644, min + 1, min);
        validInputTest(1, 1073741823, max-2, min + 1, min);
        validInputTest(1, 1073741823, max-1, min + 1, min);
        validInputTest(1, 1073741824, max, min + 1, min);


        invalidInputTest(0, min, min + 1);
        validInputTest(1, 1, 1, min, min + 1);
        validInputTest(2, 1, 2, min, min + 1);
        validInputTest(1, 2, 3, min, min + 1);
        validInputTest(2, 2, 4, min, min + 1);
        validInputTest(2, 5000, 10000, min, min + 1);
        validInputTest(1, 536870911, (max / 2) - 2, min, min + 1);
        validInputTest(2, 536870911, (max / 2) - 1, min, min + 1);
        validInputTest(1, 536870912, max / 2, min, min + 1);
        validInputTest(2, 536870912, (max / 2) + 1, min, min + 1);
        validInputTest(1, 536870913, (max / 2) + 2, min, min + 1);
        validInputTest(2, 1073741822, 2147483644, min, min + 1);
        validInputTest(1, 1073741823, max-2, min, min + 1);
        validInputTest(2, 1073741823, max - 1, min, min + 1);
        validInputTest(1, 1073741824, max, min, min + 1);


        invalidInputTest(0, 0, max);
        invalidInputTest(1, 0, max);
        invalidInputTest(2, 0, max);
        invalidInputTest(74636252, 0, max);
        invalidInputTest(max / 2, 0, max);
        invalidInputTest(max - 1, 0, max);
        invalidInputTest(max, 0, max);

        outOfIntRangeTest(0, min + 1, max);
        outOfIntRangeTest(1, min + 1, max);
        outOfIntRangeTest(2, min + 1, max);
        outOfIntRangeTest(6437843, min + 1, max);
        outOfIntRangeTest(max / 2, min + 1, max);
        outOfIntRangeTest(max - 1, min + 1, max);
        outOfIntRangeTest(max, min + 1, max);


        invalidInputTest(0, min, max);
        validInputTest(1, 1, 1, min, max);
        validInputTest(2, 1, 2, min, max);
        validInputTest(516161, 1, 516161, min, max);
        validInputTest(1073741822, 1, (max / 2) - 1, min, max);
        validInputTest(1073741823, 1, max / 2, min, max);
        validInputTest(1073741824, 1, (max / 2) + 1, min, max);
        validInputTest(max - 1, 1, max - 1, min, max);
        validInputTest(max, 1, max, min, max);


        invalidInputTest(0, min + 1, max / 2);
        validInputTest(1, 1, 1, min + 1, max / 2);
        validInputTest(1, 1, 2, min + 1, max / 2);
        validInputTest(2, 1, 3, min + 1, max / 2);
        validInputTest(2, 1, 4, min + 1, max / 2);
        validInputTest(258080, 1, 516160, min + 1, max / 2);
        validInputTest(536870911, 1, (max / 2) - 2, min + 1, max / 2);
        validInputTest(536870911, 1, (max / 2) - 1, min + 1, max / 2);
        validInputTest(536870912, 1, max / 2, min + 1, max / 2);
        validInputTest(536870912, 1, (max / 2) + 1, min + 1, max / 2);
        validInputTest(1073741822, 1, 2147483643, min + 1, max / 2);
        validInputTest(1073741822, 1, 2147483644, min + 1, max / 2);
        validInputTest(1073741823, 1, max-2, min + 1, max / 2);
        validInputTest(1073741823, 1, max - 1, min + 1, max / 2);
        validInputTest(1, 2, max, min + 1, max / 2);


        invalidInputTest(0, min + 1, (max / 2) - 1);
        validInputTest(1, 1, 1, min + 1, (max / 2) - 1);
        validInputTest(1, 1, 2, min + 1, (max / 2) - 1);
        validInputTest(2, 1, 3, min + 1, (max / 2) - 1);
        validInputTest(258080, 1, 516160, min + 1, (max / 2) - 1);
        validInputTest(536870910, 1, (max / 2) - 3, min + 1, (max / 2) - 1);
        validInputTest(536870911, 1, (max / 2) - 2, min + 1, (max / 2) - 1);
        validInputTest(536870911, 1, (max / 2) - 1, min + 1, (max / 2) - 1);
        validInputTest(536870912, 1, max / 2, min + 1, (max / 2) - 1);
        validInputTest(1073741822, 1, 2147483643, min + 1, (max / 2) - 1);
        validInputTest(1073741822, 1, 2147483644, min + 1, (max / 2) - 1);
        validInputTest(1, 2, max-2, min + 1, (max / 2) - 1);
        validInputTest(1, 2, max - 1, min + 1, (max / 2) - 1);
        validInputTest(2, 2, max, min + 1, (max / 2) - 1);


        outOfIntRangeTest(0, min + 1, (max / 2) + 1);
        outOfIntRangeTest(1, min + 1, (max / 2) + 1);
        outOfIntRangeTest(2, min + 1, (max / 2) + 1);
        outOfIntRangeTest(556874589, min + 1, (max / 2) + 1);
        outOfIntRangeTest(max / 2, min + 1, (max / 2) + 1);
        outOfIntRangeTest(max - 1, min + 1, (max / 2) + 1);
        outOfIntRangeTest(max, min + 1, (max / 2) + 1);


        outOfIntRangeTest(0, min + 2, max / 2);
        outOfIntRangeTest(1, min + 2, max / 2);
        outOfIntRangeTest(2, min + 2, max / 2);
        outOfIntRangeTest(536223412, min + 2, max / 2);
        outOfIntRangeTest(max / 2, min + 2, max / 2);
        outOfIntRangeTest(max - 1, min + 2, max / 2);
        outOfIntRangeTest(max, min + 2, max / 2);


        invalidInputTest(0, min, max - 1);
        validInputTest(1, 1, 1, min, max - 1);
        validInputTest(2, 1, 2, min, max - 1);
        validInputTest(516161, 1, 516161, min, max - 1);
        validInputTest(1073741822, 1, (max / 2) - 1, min, max - 1);
        validInputTest(1073741823, 1, max / 2, min, max - 1);
        validInputTest(1073741824, 1, (max / 2) + 1, min, max - 1);
        validInputTest(2147483645, 1, max-2, min, max - 1);
        validInputTest(2147483646, 1, max-1, min, max - 1);
        validInputTest(1, 2, max, min, max - 1);


        invalidInputTest(0, max, min);
        validInputTest(1, 1, 1, max, min);
        validInputTest(1, 1, 2, max, min);
        validInputTest(1, 1, 7563756, max, min);
        validInputTest(1, 1, (max / 2) - 1, max, min);
        validInputTest(1, 1, max / 2, max, min);
        validInputTest(1, 1, (max / 2) + 1, max, min);
        validInputTest(1, 1, max - 1, max, min);
        validInputTest(1, 1, max, max, min);


        invalidInputTest(0, max, 0);
        invalidInputTest(1, max, 0);
        invalidInputTest(2, max, 0);
        invalidInputTest(46453673, max, 0);
        invalidInputTest(max / 2, max, 0);
        invalidInputTest(max - 1, max, 0);
        invalidInputTest(max, max, 0);


        outOfIntRangeTest(0, max, min + 1);
        outOfIntRangeTest(1, max, min + 1);
        outOfIntRangeTest(2, max, min + 1);
        outOfIntRangeTest(857464321, max, min + 1);
        outOfIntRangeTest(max / 2, max, min + 1);
        outOfIntRangeTest(max - 1, max, min + 1);
        outOfIntRangeTest(max, max, min + 1);


        invalidInputTest(0, max / 2, min + 1);
        validInputTest(1, 1, 1, max / 2, min + 1);
        validInputTest(1, 1, 2, max / 2, min + 1);
        validInputTest(1, 1, 7563756, max / 2, min + 1);
        validInputTest(1, 1, 536870910, max / 2, min + 1);
        validInputTest(1, 1, 536870911, max / 2, min + 1);
        validInputTest(1, 1, 536870912, max / 2, min + 1);
        validInputTest(1, 1, (max / 2) - 1, max / 2, min + 1);
        validInputTest(1, 1, max / 2, max / 2, min + 1);
        validInputTest(2, 1, (max / 2) + 1, max / 2, min + 1);
        validInputTest(2, 1, 1354534432, max / 2, min + 1);
        validInputTest(2, 1, 1610612733, max / 2, min + 1);
        validInputTest(2, 1, 1610612734, max / 2, min + 1);
        validInputTest(2, 1, 1610612735, max / 2, min + 1);
        validInputTest(2, 1, max - 2, max / 2, min + 1);
        validInputTest(2, 1, max - 1, max / 2, min + 1);
        validInputTest(1, 2, max, max / 2, min + 1);


        invalidInputTest(0, (max / 2) - 1, min + 1);
        validInputTest(1, 1, 1, (max / 2) - 1, min + 1);
        validInputTest(1, 1, 2, (max / 2) - 1, min + 1);
        validInputTest(1, 1, 42345554, (max / 2) - 1, min + 1);
        validInputTest(1, 1, 53687099, (max / 2) - 1, min + 1);
        validInputTest(1, 1, 536870910, (max / 2) - 1, min + 1);
        validInputTest(1, 1, 536870911, (max / 2) - 1, min + 1);
        validInputTest(1, 1, (max / 2) - 2, (max / 2) - 1, min + 1);
        validInputTest(1, 1, (max / 2) - 1, (max / 2) - 1, min + 1);
        validInputTest(2, 1, max / 2, (max / 2) - 1, min + 1);
        validInputTest(2, 1, 1234451123, (max / 2) - 1, min + 1);
        validInputTest(2, 1, 1610612732, (max / 2) - 1, min + 1);
        validInputTest(2, 1, 1610612733, (max / 2) - 1, min + 1);
        validInputTest(2, 1, 1610612734, (max / 2) - 1, min + 1);
        validInputTest(2, 1, max - 3, (max / 2) - 1, min + 1);
        validInputTest(1, 2, max - 2, (max / 2) - 1, min + 1);
        validInputTest(1, 2, max - 1, (max / 2) - 1, min + 1);
        validInputTest(1, 2, max, (max / 2) - 1, min + 1);


        outOfIntRangeTest(0, (max / 2) + 1, min + 1);
        outOfIntRangeTest(1, (max / 2) + 1, min + 1);
        outOfIntRangeTest(2, (max / 2) + 1, min + 1);
        outOfIntRangeTest(7563756, (max / 2) + 1, min + 1);
        outOfIntRangeTest(max / 2, (max / 2) + 1, min + 1);
        outOfIntRangeTest(max - 1, (max / 2) + 1, min + 1);
        outOfIntRangeTest(max, (max / 2) + 1, min + 1);


        outOfIntRangeTest(0, max / 2, min + 2);
        outOfIntRangeTest(1, max / 2, min + 2);
        outOfIntRangeTest(2, max / 2, min + 2);
        outOfIntRangeTest(756473632, max / 2, min + 2);
        outOfIntRangeTest(max / 2, max / 2, min + 2);
        outOfIntRangeTest(max - 2, max / 2, min + 2);
        outOfIntRangeTest(max - 1, max / 2, min + 2);
        outOfIntRangeTest(max, max / 2, min + 2);


        invalidInputTest(0, max / 2, 0);
        invalidInputTest(1, max / 2, 0);
        invalidInputTest(2, max / 2, 0);
        invalidInputTest(746353647, max / 2, 0);
        invalidInputTest(max / 2, max / 2, 0);
        invalidInputTest(max - 2, max / 2, 0);
        invalidInputTest(max - 1, max / 2, 0);
        invalidInputTest(max, max / 2, 0);


        invalidInputTest(0, max - 1, min);
        validInputTest(1, 1, 1, max - 1, min);
        validInputTest(1, 1, 2, max - 1, min);
        validInputTest(1, 1, 5787524, max - 1, min);
        validInputTest(1, 1, (max / 2) - 1, max - 1, min);
        validInputTest(1, 1, max / 2, max - 1, min);
        validInputTest(1, 1, (max / 2) + 1, max - 1, min);
        validInputTest(1, 1, max - 2, max - 1, min);
        validInputTest(1, 1, max - 1, max - 1, min);
        validInputTest(1, 2, max, max - 1, min);


        outOfIntRangeTest(0, 46341, 46341);
        outOfIntRangeTest(1, 46341, 46341);
        outOfIntRangeTest(2, 46341, 46341);
        outOfIntRangeTest(237419923, 46341, 46341);
        outOfIntRangeTest(max / 2, 46341, 46341);
        outOfIntRangeTest(max - 1, 46341, 46341);
        outOfIntRangeTest(max, 46341, 46341);

        outOfIntRangeTest(0, 46340, 46342);
        outOfIntRangeTest(1, 46340, 46342);
        outOfIntRangeTest(2, 46340, 46342);
        outOfIntRangeTest(847382811, 46340, 46342);
        outOfIntRangeTest(max / 2, 46340, 46342);
        outOfIntRangeTest(max - 1, 46340, 46342);
        outOfIntRangeTest(max, 46340, 46342);


        invalidInputTest(0, 46340, 46341);
        validInputTest(1, 1, 1, 46340, 46341);
        validInputTest(1, 1, 2, 46340, 46341);
        validInputTest(1, 1, 4321, 46340, 46341);
        validInputTest(1, 1, 23170, 46340, 46341);
        validInputTest(1, 1, 46339, 46340, 46341);
        validInputTest(1, 1, 46340, 46340, 46341);
        validInputTest(2, 1, 46341, 46340, 46341);
        validInputTest(2, 1, 46342, 46340, 46341);
        validInputTest(2, 1, 69510, 46340, 46341);
        validInputTest(2, 1, 92679, 46340, 46341);
        validInputTest(2, 1, 92680, 46340, 46341);
        validInputTest(3, 1, 92681, 46340, 46341);
        validInputTest(23169, 1, 1073651460, 46340, 46341);
        validInputTest(23170, 1, 1073651461, 46340, 46341);
        validInputTest(23170, 1, 1073651462, 46340, 46341);
        validInputTest(23170, 1, 1073660000, 46340, 46341);
        validInputTest(23170, 1, 1073674631, 46340, 46341);
        validInputTest(23170, 1, 1073697799, 46340, 46341);
        validInputTest(23170, 1, 1073697800, 46340, 46341);
        validInputTest(23171, 1, 1073697801, 46340, 46341);
        validInputTest(46339, 1, 2147349260, 46340, 46341);
        validInputTest(46340, 1, 2147349261, 46340, 46341);
        validInputTest(46340, 1, 2147349262, 46340, 46341);
        validInputTest(46340, 1, 2147365987, 46340, 46341);
        validInputTest(46340, 1, 2147395600, 46340, 46341);
        validInputTest(46341, 1, 2147395602, 46340, 46341);
        validInputTest(46341, 1, 2147441939, 46340, 46341);
        validInputTest(46341, 1, 2147441940, 46340, 46341);
        validInputTest(1, 2, 2147441941, 46340, 46341);
        validInputTest(1, 2, 2147441942, 46340, 46341);
        validInputTest(1, 2, 2147450000, 46340, 46341);
        validInputTest(1, 2, 2147462793, 46340, 46341);
        validInputTest(1, 2, 2147462794, 46340, 46341);
        validInputTest(1, 2, 2147462795, 46340, 46341);
        validInputTest(1, 2, max - 1, 46340, 46341);
        validInputTest(1, 2, max, 46340, 46341);


        invalidInputTest(0, 46340, 46340);
        validInputTest(1, 1, 1, 46340, 46340);
        validInputTest(1, 1, 2, 46340, 46340);
        validInputTest(1, 1, 4321, 46340, 46340);
        validInputTest(1, 1, 23170, 46340, 46340);
        validInputTest(1, 1, 46339, 46340, 46340);
        validInputTest(1, 1, 46340, 46340, 46340);
        validInputTest(2, 1, 46341, 46340, 46340);
        validInputTest(2, 1, 46342, 46340, 46340);
        validInputTest(2, 1, 69510, 46340, 46340);
        validInputTest(2, 1, 92679, 46340, 46340);
        validInputTest(2, 1, 92680, 46340, 46340);
        validInputTest(3, 1, 92681, 46340, 46340);
        validInputTest(23169, 1, 1073651460, 46340, 46340);
        validInputTest(23170, 1, 1073651461, 46340, 46340);
        validInputTest(23170, 1, 1073651462, 46340, 46340);
        validInputTest(23170, 1, 1073660000, 46340, 46340);
        validInputTest(23170, 1, 1073674631, 46340, 46340);
        validInputTest(23170, 1, 1073697799, 46340, 46340);
        validInputTest(23170, 1, 1073697800, 46340, 46340);
        validInputTest(23171, 1, 1073697801, 46340, 46340);
        validInputTest(46339, 1, 2147349260, 46340, 46340);
        validInputTest(46340, 1, 2147349261, 46340, 46340);
        validInputTest(46340, 1, 2147349262, 46340, 46340);
        validInputTest(46340, 1, 2147395599, 46340, 46340);
        validInputTest(46340, 1, 2147395600, 46340, 46340);
        validInputTest(1, 2, 2147395601, 46340, 46340);
        validInputTest(1, 2, 2147395602, 46340, 46340);
        validInputTest(1, 2, 2147441939, 46340, 46340);
        validInputTest(1, 2, 2147441940, 46340, 46340);
        validInputTest(2, 2, 2147441941, 46340, 46340);
        validInputTest(2, 2, 2147441942, 46340, 46340);
        validInputTest(2, 2, max - 1, 46340, 46340);
        validInputTest(2, 2, max, 46340, 46340);


        invalidInputTest(0, 46339, 46341);
        validInputTest(1, 1, 1, 46339, 46341);
        validInputTest(1, 1, 2, 46339, 46341);
        validInputTest(1, 1, 22322, 46339, 46341);
        validInputTest(1, 1, 23169, 46339, 46341);
        validInputTest(1, 1, 46338, 46339, 46341);
        validInputTest(1, 1, 46339, 46339, 46341);
        validInputTest(2, 1, 46340, 46339, 46341);
        validInputTest(2, 1, 46341, 46339, 46341);
        validInputTest(2, 1, 69510, 46339, 46341);
        validInputTest(2, 1, 92677, 46339, 46341);
        validInputTest(2, 1, 92678, 46339, 46341);
        validInputTest(3, 1, 92679, 46339, 46341);
        validInputTest(23169, 1, 1073628291, 46339, 46341);
        validInputTest(23170, 1, 1073628292, 46339, 46341);
        validInputTest(23170, 1, 1073628293, 46339, 46341);
        validInputTest(23170, 1, 1073645698, 46339, 46341);
        validInputTest(23170, 1, 1073651461, 46339, 46341);
        validInputTest(23170, 1, 1073674629, 46339, 46341);
        validInputTest(23170, 1, 1073674630, 46339, 46341);
        validInputTest(23171, 1, 1073674631, 46339, 46341);
        validInputTest(46340, 1, 2147349260, 46339, 46341);
        validInputTest(46341, 1, 2147349261, 46339, 46341);
        validInputTest(46341, 1, 2147349262, 46339, 46341);
        validInputTest(46341, 1, 2147359897, 46339, 46341);
        validInputTest(46341, 1, 2147376589, 46339, 46341);
        validInputTest(46341, 1, 2147395598, 46339, 46341);
        validInputTest(46341, 1, 2147395599, 46339, 46341);
        validInputTest(1, 2, 2147395600, 46339, 46341);
        validInputTest(1, 2, 2147395601, 46339, 46341);
        validInputTest(1, 2, 2147405487, 46339, 46341);
        validInputTest(1, 2, 2147418769, 46339, 46341);
        validInputTest(1, 2, 2147441937, 46339, 46341);
        validInputTest(1, 2, 2147441938, 46339, 46341);
        validInputTest(2, 2, 2147441939, 46339, 46341);
        validInputTest(2, 2, 2147441940, 46339, 46341);
        validInputTest(2, 2, max - 1, 46339, 46341);
        validInputTest(2, 2, max, 46339, 46341);


        invalidInputTest(0, max / 2, min);
        validInputTest(1, 1, 1, max / 2, min);
        validInputTest(1, 1, 2, max / 2, min);
        validInputTest(1, 1, 321334352, max / 2, min);
        validInputTest(1, 1, 536870910, max / 2, min);
        validInputTest(1, 1, 536870911, max / 2, min);
        validInputTest(1, 1, 536870912, max / 2, min);
        validInputTest(1, 1, (max / 2) - 1, max / 2, min);
        validInputTest(1, 1, max / 2, max / 2, min);
        validInputTest(1, 2, (max / 2) + 1, max / 2, min);
        validInputTest(1, 2, (max / 2) + 2, max / 2, min);
        validInputTest(1, 2, 1256656555, max / 2, min);
        validInputTest(1, 2, 1610612734, max / 2, min);
        validInputTest(1, 2, 1610612735, max / 2, min);
        validInputTest(1, 2, 1610612736, max / 2, min);
        validInputTest(1, 2, max - 2, max / 2, min);
        validInputTest(1, 2, max - 1, max / 2, min);
        validInputTest(1, 3, max, max / 2, min);


        invalidInputTest(0, (max / 2) + 1, min);
        validInputTest(1, 1, 1, (max / 2) + 1, min);
        validInputTest(1, 1, 2, (max / 2) + 1, min);
        validInputTest(1, 1, 472637171, (max / 2) + 1, min);
        validInputTest(1, 1, 536870911, (max / 2) + 1, min);
        validInputTest(1, 1, 536870912, (max / 2) + 1, min);
        validInputTest(1, 1, 536870913, (max / 2) + 1, min);
        validInputTest(1, 1, max / 2, (max / 2) + 1, min);
        validInputTest(1, 1, (max / 2) + 1, (max / 2) + 1, min);
        validInputTest(1, 2, (max / 2) + 2, (max / 2) + 1, min);
        validInputTest(1, 2, (max / 2) + 3, (max / 2) + 1, min);
        validInputTest(1, 2, 1382738472, (max / 2) + 1, min);
        validInputTest(1, 2, 1610612733, (max / 2) + 1, min);
        validInputTest(1, 2, 1610612734, (max / 2) + 1, min);
        validInputTest(1, 2, 1610612735, (max / 2) + 1, min);
        validInputTest(1, 2, max - 2, (max / 2) + 1, min);
        validInputTest(1, 2, max - 1, (max / 2) + 1, min);
        validInputTest(1, 2, max, (max / 2) + 1, min);


        invalidInputTest(0, (max / 2) - 1, min);
        validInputTest(1, 1, 1, (max / 2) - 1, min);
        validInputTest(1, 1, 2, (max / 2) - 1, min);
        validInputTest(1, 1, 432323321, (max / 2) - 1, min);
        validInputTest(1, 1, 536870910, (max / 2) - 1, min);
        validInputTest(1, 1, 536870911, (max / 2) - 1, min);
        validInputTest(1, 1, 536870912, (max / 2) - 1, min);
        validInputTest(1, 1, (max / 2) - 2, (max / 2) - 1, min);
        validInputTest(1, 1, (max / 2) - 1, (max / 2) - 1, min);
        validInputTest(1, 2, max / 2, (max / 2) - 1, min);
        validInputTest(1, 2, (max / 2) + 1, (max / 2) - 1, min);
        validInputTest(1, 2, (max / 2) + 2, (max / 2) - 1, min);
        validInputTest(1, 2, 1324343254, (max / 2) - 1, min);
        validInputTest(1, 2, 1610612733, (max / 2) - 1, min);
        validInputTest(1, 2, 1610612734, (max / 2) - 1, min);
        validInputTest(1, 2, 1610612735, (max / 2) - 1, min);
        validInputTest(1, 2, max - 4, (max / 2) - 1, min);
        validInputTest(1, 2, max - 3, (max / 2) - 1, min);
        validInputTest(1, 3, max - 2, (max / 2) - 1, min);
        validInputTest(1, 3, max - 1, (max / 2) - 1, min);
        validInputTest(1, 3, max, (max / 2) - 1, min);


        invalidInputTest(0, 0, max / 2);
        invalidInputTest(1, 0, max / 2);
        invalidInputTest(2, 0, max / 2);
        invalidInputTest(64736343, 0, max / 2);
        invalidInputTest(max / 2, 0, max / 2);
        invalidInputTest(max - 1, 0, max / 2);
        invalidInputTest(max, 0, max / 2);


        invalidInputTest(0, min, max / 2);
        validInputTest(1, 1, 1, min, max / 2);
        validInputTest(2, 1, 2, min, max / 2);
        validInputTest(265090998, 1, 265090998, min, max / 2);
        validInputTest(536870910, 1, 536870910, min, max / 2);
        validInputTest(536870911, 1, 536870911, min, max / 2);
        validInputTest(536870912, 1, 536870912, min, max / 2);
        validInputTest(1073741821, 1, (max / 2) - 2, min, max / 2);
        validInputTest(1073741822, 1, (max / 2) - 1, min, max / 2);
        validInputTest(1073741823, 1, max / 2, min, max / 2);
        validInputTest(1, 2, (max / 2) + 1, min, max / 2);
        validInputTest(2, 2, (max / 2) + 2, min, max / 2);
        validInputTest(875642223, 2, 1949384046, min, max / 2);
        validInputTest(536870911, 2, 1610612734, min, max / 2);
        validInputTest(536870912, 2, 1610612735, min, max / 2);
        validInputTest(536870913, 2, 1610612736, min, max / 2);
        validInputTest(1073741822, 2, max - 2, min, max / 2);
        validInputTest(1073741823, 2, max - 1, min, max / 2);
        validInputTest(1, 3, max, min, max / 2);


        invalidInputTest(0, min, (max / 2) + 1);
        validInputTest(1, 1, 1, min, (max / 2) + 1);
        validInputTest(2, 1, 2, min, (max / 2) + 1);
        validInputTest(324412232, 1, 324412232, min, (max / 2) + 1);
        validInputTest(536870910, 1, 536870910, min, (max / 2) + 1);
        validInputTest(536870911, 1, 536870911, min, (max / 2) + 1);
        validInputTest(536870912, 1, 536870912, min, (max / 2) + 1);
        validInputTest(1073741822, 1, (max / 2) - 1, min, (max / 2) + 1);
        validInputTest(1073741823, 1, max / 2, min, (max / 2) + 1);
        validInputTest(1073741824, 1, (max / 2) + 1, min, (max / 2) + 1);
        validInputTest(1, 2, (max / 2) + 2, min, (max / 2) + 1);
        validInputTest(2, 2, (max / 2) + 3, min, (max / 2) + 1);
        validInputTest(884736723, 2, 1958478547, min, (max / 2) + 1);
        validInputTest(536870911, 2, 1610612735, min, (max / 2) + 1);
        validInputTest(536870912, 2, 1610612736, min, (max / 2) + 1);
        validInputTest(536870913, 2, 1610612737, min, (max / 2) + 1);
        validInputTest(1073741822, 2, max - 1, min, (max / 2) + 1);
        validInputTest(1073741823, 2, max, min, (max / 2) + 1);


        invalidInputTest(0, min, (max / 2) - 1);
        validInputTest(1, 1, 1, min, (max / 2) - 1);
        validInputTest(2, 1, 2, min, (max / 2) - 1);
        validInputTest(265090998, 1, 265090998, min, (max / 2) - 1);
        validInputTest(536870910, 1, 536870910, min, (max / 2) - 1);
        validInputTest(536870911, 1, 536870911, min, (max / 2) - 1);
        validInputTest(536870912, 1, 536870912, min, (max / 2) - 1);
        validInputTest(1073741821, 1, (max / 2) - 2, min, (max / 2) - 1);
        validInputTest(1073741822, 1, (max / 2) - 1, min, (max / 2) - 1);
        validInputTest(1, 2, max / 2, min, (max / 2) - 1);
        validInputTest(2, 2, (max / 2) + 1, min, (max / 2) - 1);
        validInputTest(410186766, 2, 1483928588, min, (max / 2) - 1);
        validInputTest(536870911, 2, 1610612733, min, (max / 2) - 1);
        validInputTest(536870912, 2, 1610612734, min, (max / 2) - 1);
        validInputTest(536870913, 2, 1610612735, min, (max / 2) - 1);
        validInputTest(1073741822, 2, max - 3, min, (max / 2) - 1);
        validInputTest(1, 3, max - 2, min, (max / 2) - 1);
        validInputTest(2, 3, max - 1, min, (max / 2) - 1);
        validInputTest(3, 3, max, min, (max / 2) - 1);
        ////////////////////////////////////////2.2 Впритык слева и справа от грацницы
        validInputTest(1, 1, 2, 5, 3);
        validInputTest(1, 1, 4, 5, 3);
        validInputTest(2, 1, 6, 5, 3);

        validInputTest(1, 1, 5, 5, 3);
        validInputTest(2, 1, 7, 5, 3);
        validInputTest(2, 1, 9, 5, 3);
        validInputTest(3, 1, 11, 5, 3);

        validInputTest(2, 1, 10, 5, 3);
        validInputTest(3, 1, 12, 5, 3);
        validInputTest(3, 1, 14, 5, 3);
        validInputTest(1, 2, 16, 5, 3);

        validInputTest(3, 1, 15, 5, 3);
        validInputTest(1, 2, 17, 5, 3);
        validInputTest(1, 2, 19, 5, 3);
        validInputTest(2, 2, 21, 5, 3);

        validInputTest(1, 2, 20, 5, 3);
        validInputTest(2, 2, 22, 5, 3);
        validInputTest(2, 2, 24, 5, 3);
        validInputTest(3, 2, 26, 5, 3);

        validInputTest(2, 2, 25, 5, 3);
        validInputTest(3, 2, 27, 5, 3);
        validInputTest(3, 2, 29, 5, 3);
        validInputTest(1, 3, 31, 5, 3);

        validInputTest(3, 71582787, 1073741805, 5, 3);
        validInputTest(1, 71582788, 1073741807, 5, 3);
        validInputTest(1, 71582788, 1073741809, 5, 3);
        validInputTest(2, 71582788, 1073741811, 5, 3);

        validInputTest(1, 71582788, 1073741810, 5, 3);
        validInputTest(2, 71582788, 1073741812, 5, 3);
        validInputTest(2, 71582788, 1073741814, 5, 3);
        validInputTest(3, 71582788, 1073741816, 5, 3);

        validInputTest(2, 71582788, 1073741815, 5, 3);
        validInputTest(3, 71582788, 1073741816, 5, 3);
        validInputTest(3, 71582788, 1073741819, 5, 3);
        validInputTest(1, 71582789, 1073741821, 5, 3);

        validInputTest(3, 71582788, 1073741820, 5, 3);
        validInputTest(1, 71582789, 1073741821, 5, 3);
        validInputTest(1, 71582789, 1073741824, 5, 3);
        validInputTest(2, 71582789, 1073741826, 5, 3);

        validInputTest(1, 71582789, 1073741825, 5, 3);
        validInputTest(2, 71582789, 1073741827, 5, 3);
        validInputTest(2, 71582789, 1073741829, 5, 3);
        validInputTest(3, 71582789, 1073741831, 5, 3);

        validInputTest(2, 71582789, 1073741830, 5, 3);
        validInputTest(3, 71582789, 1073741832, 5, 3);
        validInputTest(3, 71582789, 1073741834, 5, 3);
        validInputTest(1, 71582790, 1073741836, 5, 3);

        validInputTest(3, 71582789, 1073741835, 5, 3);
        validInputTest(1, 71582790, 1073741837, 5, 3);
        validInputTest(1, 71582790, 1073741839, 5, 3);
        validInputTest(2, 71582790, 1073741841, 5, 3);

        validInputTest(1, 71582790, 1073741840, 5, 3);
        validInputTest(2, 71582790, 1073741842, 5, 3);
        validInputTest(2, 71582790, 1073741844, 5, 3);
        validInputTest(3, 71582790, 1073741846, 5, 3);

        validInputTest(2, 71582790, 1073741845, 5, 3);
        validInputTest(3, 71582790, 1073741847, 5, 3);
        validInputTest(3, 71582790, 1073741849, 5, 3);
        validInputTest(1, 71582791, 1073741851, 5, 3);

        validInputTest(3, 143165574, 2147483610, 5, 3);
        validInputTest(1, 143165575, 2147483612, 5, 3);
        validInputTest(1, 143165575, 2147483614, 5, 3);
        validInputTest(2, 143165575, 2147483619, 5, 3);

        validInputTest(1, 143165575, 2147483615, 5, 3);
        validInputTest(2, 143165575, 2147483617, 5, 3);
        validInputTest(2, 143165575, 2147483619, 5, 3);
        validInputTest(3, 143165575, 2147483621, 5, 3);

        validInputTest(2, 143165575, 2147483620, 5, 3);
        validInputTest(3, 143165575, 2147483622, 5, 3);
        validInputTest(3, 143165575, 2147483624, 5, 3);
        validInputTest(1, 143165576, 2147483626, 5, 3);

        validInputTest(3, 143165575, 2147483625, 5, 3);
        validInputTest(1, 143165576, 2147483627, 5, 3);
        validInputTest(1, 143165576, 2147483629, 5, 3);
        validInputTest(2, 143165576, 2147483631, 5, 3);

        validInputTest(1, 143165576, 2147483630, 5, 3);
        validInputTest(2, 143165576, 2147483632, 5, 3);
        validInputTest(2, 143165576, 2147483634, 5, 3);
        validInputTest(3, 143165576, 2147483636, 5, 3);

        validInputTest(2, 143165576, 2147483635, 5, 3);
        validInputTest(3, 143165576, 2147483637, 5, 3);
        validInputTest(3, 143165576, 2147483639, 5, 3);
        validInputTest(1, 143165577, 2147483641, 5, 3);

        validInputTest(3, 100, 1500, 5, 3);
        validInputTest(1, 101, 1501, 5, 3);
        validInputTest(1, 101, 1504, 5, 3);
        validInputTest(2, 101, 1506, 5, 3);

        validInputTest(1, 101, 1505, 5, 3);
        validInputTest(2, 101, 1507, 5, 3);
        validInputTest(2, 101, 1509, 5, 3);
        validInputTest(3, 101, 1511, 5, 3);

        validInputTest(2, 101, 1510, 5, 3);
        validInputTest(3, 101, 1512, 5, 3);
        validInputTest(3, 101, 1514, 5, 3);
        validInputTest(1, 102, 1516, 5, 3);
        ////////////////////////////////////////2.3 Внутри класса эквивалентности
        validInputTest(1, 1, 3, 5, 3);
        validInputTest(2, 1, 8, 5, 3);
        validInputTest(3, 1, 13, 5, 3);

        validInputTest(1, 2, 18, 5, 3);
        validInputTest(2, 2, 25, 5, 3);
        validInputTest(3, 2, 28, 5, 3);

        validInputTest(1, 71582788, 1073741808, 5, 3);
        validInputTest(2, 71582788, 1073741813, 5, 3);
        validInputTest(3, 71582788, 1073741818, 5, 3);

        validInputTest(1, 71582789, 1073741823, 5, 3);
        validInputTest(2, 71582789, 1073741828, 5, 3);
        validInputTest(3, 71582789, 1073741833, 5, 3);

        validInputTest(1, 71582790, 1073741838, 5, 3);
        validInputTest(2, 71582790, 1073741843, 5, 3);
        validInputTest(3, 71582790, 1073741848, 5, 3);

        validInputTest(1, 143165575, 2147483613, 5, 3);
        validInputTest(2, 143165575, 2147483618, 5, 3);
        validInputTest(3, 143165575, 2147483623, 5, 3);

        validInputTest(1, 143165576, 2147483628, 5, 3);
        validInputTest(2, 143165576, 2147483633, 5, 3);
        validInputTest(3, 143165576, 2147483638, 5, 3);

        validInputTest(1, 101, 1503, 5, 3);
        validInputTest(2, 101, 1508, 5, 3);
        validInputTest(3, 101, 1513, 5, 3);

        validInputTest(1, 1, 4, 5, 3);
        validInputTest(2, 1, 10, 5, 3);
        validInputTest(1, 100, 1490, 5, 3);
        ////////////////////////////////////////3. Предметная область
        validInputTest(1, 1, 1, 6, 9);
        validInputTest(1, 1, 2, 6, 9);
        validInputTest(1, 1, 3, 6, 9);
        validInputTest(1, 1, 4, 6, 9);
        validInputTest(1, 1, 5, 6, 9);
        validInputTest(1, 1, 6, 6, 9);
        validInputTest(2, 1, 7, 6, 9);

        validInputTest(4, 1, 24, 6, 9);
        validInputTest(5, 1, 25, 6, 9);
        validInputTest(5, 1, 26, 6, 9);
        validInputTest(5, 1, 27, 6, 9);
        validInputTest(5, 1, 28, 6, 9);
        validInputTest(5, 1, 29, 6, 9);
        validInputTest(5, 1, 30, 6, 9);
        validInputTest(6, 1, 31, 6, 9);

        validInputTest(8, 1, 48, 6, 9);
        validInputTest(9, 1, 49, 6, 9);
        validInputTest(9, 1, 50, 6, 9);
        validInputTest(9, 1, 51, 6, 9);
        validInputTest(9, 1, 52, 6, 9);
        validInputTest(9, 1, 53, 6, 9);
        validInputTest(9, 1, 54, 6, 9);
        validInputTest(1, 2, 55, 6, 9);

        validInputTest(9, 19884107, 1073741778, 6, 9);
        validInputTest(1, 19884108, 1073741779, 6, 9);
        validInputTest(1, 19884108, 1073741780, 6, 9);
        validInputTest(1, 19884108, 1073741781, 6, 9);
        validInputTest(1, 19884108, 1073741782, 6, 9);
        validInputTest(1, 19884108, 1073741783, 6, 9);
        validInputTest(1, 19884108, 1073741784, 6, 9);
        validInputTest(2, 19884108, 1073741785, 6, 9);

        validInputTest(4, 19884108, 1073741802, 6, 9);
        validInputTest(5, 19884108, 1073741803, 6, 9);
        validInputTest(5, 19884108, 1073741804, 6, 9);
        validInputTest(5, 19884108, 1073741805, 6, 9);
        validInputTest(5, 19884108, 1073741806, 6, 9);
        validInputTest(5, 19884108, 1073741807, 6, 9);
        validInputTest(5, 19884108, 1073741808, 6, 9);
        validInputTest(6, 19884108, 1073741809, 6, 9);

        validInputTest(8, 19884108, 1073741826, 6, 9);
        validInputTest(9, 19884108, 1073741827, 6, 9);
        validInputTest(9, 19884108, 1073741828, 6, 9);
        validInputTest(9, 19884108, 1073741829, 6, 9);
        validInputTest(9, 19884108, 1073741830, 6, 9);
        validInputTest(9, 19884108, 1073741831, 6, 9);
        validInputTest(9, 19884108, 1073741832, 6, 9);
        validInputTest(1, 19884109, 1073741833, 6, 9);

        validInputTest(9, 19884107, 1073741778, 6, 9);
        validInputTest(1, 19884108, 1073741779, 6, 9);
        validInputTest(1, 19884108, 1073741780, 6, 9);
        validInputTest(1, 19884108, 1073741781, 6, 9);
        validInputTest(1, 19884108, 1073741782, 6, 9);
        validInputTest(1, 19884108, 1073741783, 6, 9);
        validInputTest(1, 19884108, 1073741784, 6, 9);
        validInputTest(2, 19884108, 1073741785, 6, 9);

        validInputTest(4, 19884108, 1073741802, 6, 9);
        validInputTest(5, 19884108, 1073741803, 6, 9);
        validInputTest(5, 19884108, 1073741804, 6, 9);
        validInputTest(5, 19884108, 1073741805, 6, 9);
        validInputTest(5, 19884108, 1073741806, 6, 9);
        validInputTest(5, 19884108, 1073741807, 6, 9);
        validInputTest(5, 19884108, 1073741808, 6, 9);
        validInputTest(6, 19884108, 1073741809, 6, 9);

        validInputTest(8, 19884108, 1073741826, 6, 9);
        validInputTest(9, 19884108, 1073741827, 6, 9);
        validInputTest(9, 19884108, 1073741828, 6, 9);
        validInputTest(9, 19884108, 1073741829, 6, 9);
        validInputTest(9, 19884108, 1073741830, 6, 9);
        validInputTest(9, 19884108, 1073741831, 6, 9);
        validInputTest(9, 39768215, 2147483610, 6, 9);

        validInputTest(1, 39768216, 2147483611, 6, 9);
        validInputTest(1, 39768216, 2147483612, 6, 9);
        validInputTest(1, 39768216, 2147483613, 6, 9);
        validInputTest(1, 39768216, 2147483614, 6, 9);
        validInputTest(1, 39768216, 2147483615, 6, 9);
        validInputTest(1, 39768216, 2147483616, 6, 9);
        validInputTest(2, 39768216, 2147483617, 6, 9);

        validInputTest(5, 39768216, 2147483640, 6, 9);
        validInputTest(6, 39768216, 2147483641, 6, 9);
        validInputTest(6, 39768216, 2147483642, 6, 9);
        validInputTest(6, 39768216, 2147483643, 6, 9);
        validInputTest(6, 39768216, 2147483644, 6, 9);
        validInputTest(6, 39768216, max-2, 6, 9);
        validInputTest(6, 39768216, max-1, 6, 9);
        validInputTest(7, 39768216, max, 6, 9);


        validInputTest(1, 1, 1, 4, 9);
        validInputTest(1, 1, 2, 4, 9);
        validInputTest(1, 1, 3, 4, 9);
        validInputTest(1, 1, 4, 4, 9);
        validInputTest(2, 1, 5, 4, 9);

        validInputTest(4, 1, 16, 4, 9);
        validInputTest(5, 1, 17, 4, 9);
        validInputTest(5, 1, 18, 4, 9);
        validInputTest(5, 1, 19, 4, 9);
        validInputTest(5, 1, 20, 4, 9);
        validInputTest(6, 1, 21, 4, 9);

        validInputTest(8, 1, 32, 4, 9);
        validInputTest(9, 1, 33, 4, 9);
        validInputTest(9, 1, 34, 4, 9);
        validInputTest(9, 1, 35, 4, 9);
        validInputTest(9, 1, 36, 4, 9);
        validInputTest(1, 2, 37, 4, 9);

        validInputTest(9, 29826161, 1073741796, 4, 9);
        validInputTest(1, 29826162, 1073741797, 4, 9);
        validInputTest(1, 29826162, 1073741798, 4, 9);
        validInputTest(1, 29826162, 1073741799, 4, 9);
        validInputTest(1, 29826162, 1073741800, 4, 9);
        validInputTest(2, 29826162, 1073741801, 4, 9);

        validInputTest(4, 29826162, 1073741812, 4, 9);
        validInputTest(5, 29826162, 1073741813, 4, 9);
        validInputTest(5, 29826162, 1073741814, 4, 9);
        validInputTest(5, 29826162, 1073741815, 4, 9);
        validInputTest(5, 29826162, 1073741816, 4, 9);
        validInputTest(6, 29826162, 1073741817, 4, 9);

        validInputTest(8, 29826162, 1073741828, 4, 9);
        validInputTest(9, 29826162, 1073741829, 4, 9);
        validInputTest(9, 29826162, 1073741830, 4, 9);
        validInputTest(9, 29826162, 1073741831, 4, 9);
        validInputTest(9, 29826162, 1073741832, 4, 9);
        validInputTest(1, 29826163, 1073741833, 4, 9);

        validInputTest(9, 59652322, 2147483592, 4, 9);
        validInputTest(1, 59652323, 2147483593, 4, 9);
        validInputTest(1, 59652323, 2147483594, 4, 9);
        validInputTest(1, 59652323, 2147483595, 4, 9);
        validInputTest(1, 59652323, 2147483596, 4, 9);
        validInputTest(2, 59652323, 2147483597, 4, 9);

        validInputTest(4, 59652323, 2147483608, 4, 9);
        validInputTest(5, 59652323, 2147483609, 4, 9);
        validInputTest(5, 59652323, 2147483610, 4, 9);
        validInputTest(5, 59652323, 2147483611, 4, 9);
        validInputTest(5, 59652323, 2147483612, 4, 9);
        validInputTest(6, 59652323, 2147483613, 4, 9);

        validInputTest(8, 59652323, 2147483624, 4, 9);
        validInputTest(9, 59652323, 2147483625, 4, 9);
        validInputTest(9, 59652323, 2147483626, 4, 9);
        validInputTest(9, 59652323, 2147483627, 4, 9);
        validInputTest(9, 59652323, 2147483628, 4, 9);

        validInputTest(1, 59652324, 2147483629, 4, 9);
        validInputTest(1, 59652324, 2147483630, 4, 9);
        validInputTest(1, 59652324, 2147483631, 4, 9);
        validInputTest(1, 59652324, 2147483632, 4, 9);
        validInputTest(2, 59652324, 2147483633, 4, 9);

        validInputTest(4, 59652324, 2147483641, 4, 9);
        validInputTest(4, 59652324, 2147483642, 4, 9);
        validInputTest(4, 59652324, 2147483643, 4, 9);
        validInputTest(4, 59652324, 2147483644, 4, 9);

        validInputTest(5, 59652324, max-2, 4, 9);
        validInputTest(5, 59652324, max-1, 4, 9);
        validInputTest(5, 59652324, max, 4, 9);


        validInputTest(1, 1, 1, 3, 5);
        validInputTest(1, 1, 2, 3, 5);
        validInputTest(1, 1, 3, 3, 5);
        validInputTest(2, 1, 4, 3, 5);

        validInputTest(2, 1, 6, 3, 5);
        validInputTest(3, 1, 7, 3, 5);
        validInputTest(3, 1, 8, 3, 5);
        validInputTest(3, 1, 9, 3, 5);
        validInputTest(4, 1, 10, 3, 5);

        validInputTest(4, 1, 12, 3, 5);
        validInputTest(5, 1, 13, 3, 5);
        validInputTest(5, 1, 14, 3, 5);
        validInputTest(5, 1, 15, 3, 5);
        validInputTest(1, 2, 16, 3, 5);

        validInputTest(5, 71582788, 1073741820, 3, 5);
        validInputTest(1, 71582789, 1073741821, 3, 5);
        validInputTest(1, 71582789, 1073741822, 3, 5);
        validInputTest(1, 71582789, 1073741823, 3, 5);
        validInputTest(2, 71582789, 1073741824, 3, 5);

        validInputTest(2, 71582789, 1073741826, 3, 5);
        validInputTest(3, 71582789, 1073741827, 3, 5);
        validInputTest(3, 71582789, 1073741828, 3, 5);
        validInputTest(3, 71582789, 1073741829, 3, 5);
        validInputTest(4, 71582789, 1073741830, 3, 5);

        validInputTest(4, 71582789, 1073741832, 3, 5);
        validInputTest(5, 71582789, 1073741833, 3, 5);
        validInputTest(5, 71582789, 1073741834, 3, 5);
        validInputTest(5, 71582789, 1073741835, 3, 5);
        validInputTest(1, 71582790, 1073741836, 3, 5);

        validInputTest(5, 143165575, 2147483625, 3, 5);
        validInputTest(1, 143165576, 2147483626, 3, 5);
        validInputTest(1, 143165576, 2147483627, 3, 5);
        validInputTest(1, 143165576, 2147483628, 3, 5);
        validInputTest(2, 143165576, 2147483629, 3, 5);

        validInputTest(2, 143165576, 2147483631, 3, 5);
        validInputTest(3, 143165576, 2147483632, 3, 5);
        validInputTest(3, 143165576, 2147483633, 3, 5);
        validInputTest(3, 143165576, 2147483634, 3, 5);
        validInputTest(4, 143165576, 2147483635, 3, 5);

        validInputTest(4, 143165576, 2147483637, 3, 5);
        validInputTest(5, 143165576, 2147483638, 3, 5);
        validInputTest(5, 143165576, 2147483639, 3, 5);
        validInputTest(5, 143165576, 2147483640, 3, 5);

        validInputTest(1, 143165577, 2147483641, 3, 5);
        validInputTest(1, 143165577, 2147483642, 3, 5);
        validInputTest(1, 143165577, 2147483643, 3, 5);
        validInputTest(2, 143165577, 2147483644, 3, 5);
        validInputTest(2, 143165577, max-2, 3, 5);
        validInputTest(2, 143165577, max-1, 3, 5);
        validInputTest(3, 143165577, max, 3, 5);


        validInputTest(1, 1, 1, 5, 10);
        validInputTest(1, 1, 2, 5, 10);
        validInputTest(1, 1, 3, 5, 10);
        validInputTest(1, 1, 4, 5, 10);
        validInputTest(1, 1, 5, 5, 10);
        validInputTest(2, 1, 6, 5, 10);

        validInputTest(4, 1, 20, 5, 10);
        validInputTest(5, 1, 21, 5, 10);
        validInputTest(5, 1, 22, 5, 10);
        validInputTest(5, 1, 23, 5, 10);
        validInputTest(5, 1, 24, 5, 10);
        validInputTest(5, 1, 25, 5, 10);
        validInputTest(6, 1, 26, 5, 10);

        validInputTest(9, 1, 45, 5, 10);
        validInputTest(10, 1, 46, 5, 10);
        validInputTest(10, 1, 47, 5, 10);
        validInputTest(10, 1, 48, 5, 10);
        validInputTest(10, 1, 49, 5, 10);
        validInputTest(10, 1, 50, 5, 10);
        validInputTest(1, 2, 51, 5, 10);

        validInputTest(10, 21474836, 1073741800, 5, 10);
        validInputTest(1, 21474837, 1073741801, 5, 10);
        validInputTest(1, 21474837, 1073741802, 5, 10);
        validInputTest(1, 21474837, 1073741803, 5, 10);
        validInputTest(1, 21474837, 1073741804, 5, 10);
        validInputTest(1, 21474837, 1073741805, 5, 10);
        validInputTest(2, 21474837, 1073741806, 5, 10);

        validInputTest(4, 21474837, 1073741820, 5, 10);
        validInputTest(5, 21474837, 1073741821, 5, 10);
        validInputTest(5, 21474837, 1073741822, 5, 10);
        validInputTest(5, 21474837, 1073741823, 5, 10);
        validInputTest(5, 21474837, 1073741824, 5, 10);
        validInputTest(5, 21474837, 1073741825, 5, 10);
        validInputTest(6, 21474837, 1073741826, 5, 10);

        validInputTest(9, 21474837, 1073741845, 5, 10);
        validInputTest(10, 21474837, 1073741846, 5, 10);
        validInputTest(10, 21474837, 1073741847, 5, 10);
        validInputTest(10, 21474837, 1073741848, 5, 10);
        validInputTest(10, 21474837, 1073741849, 5, 10);
        validInputTest(10, 21474837, 1073741850, 5, 10);
        validInputTest(1, 21474838, 1073741851, 5, 10);

        validInputTest(10, 42949672, 2147483600, 5, 10);
        validInputTest(1, 42949673, 2147483601, 5, 10);
        validInputTest(1, 42949673, 2147483602, 5, 10);
        validInputTest(1, 42949673, 2147483603, 5, 10);
        validInputTest(1, 42949673, 2147483604, 5, 10);
        validInputTest(1, 42949673, 2147483605, 5, 10);
        validInputTest(2, 42949673, 2147483606, 5, 10);

        validInputTest(4, 42949673, 2147483620, 5, 10);
        validInputTest(5, 42949673, 2147483621, 5, 10);
        validInputTest(5, 42949673, 2147483622, 5, 10);
        validInputTest(5, 42949673, 2147483623, 5, 10);
        validInputTest(5, 42949673, 2147483624, 5, 10);
        validInputTest(5, 42949673, 2147483625, 5, 10);
        validInputTest(6, 42949673, 2147483626, 5, 10);

        validInputTest(8, 42949673, 2147483640, 5, 10);
        validInputTest(9, 42949673, 2147483641, 5, 10);
        validInputTest(9, 42949673, 2147483642, 5, 10);
        validInputTest(9, 42949673, 2147483643, 5, 10);
        validInputTest(9, 42949673, 2147483644, 5, 10);
        validInputTest(9, 42949673, max-2, 5, 10);
        validInputTest(10, 42949673, max-1, 5, 10);
        validInputTest(10, 42949673, max, 5, 10);


        validInputTest(1, 1, 1, 2, 3);
        validInputTest(1, 1, 2, 2, 3);
        validInputTest(2, 1, 3, 2, 3);
        validInputTest(2, 1, 4, 2, 3);
        validInputTest(3, 1, 5, 2, 3);
        validInputTest(3, 1, 6, 2, 3);
        validInputTest(1, 2, 7, 2, 3);

        validInputTest(3, 178956970, 1073741820, 2, 3);
        validInputTest(1, 178956971, 1073741821, 2, 3);
        validInputTest(1, 178956971, 1073741822, 2, 3);
        validInputTest(2, 178956971, 1073741823, 2, 3);
        validInputTest(2, 178956971, 1073741824, 2, 3);
        validInputTest(3, 178956971, 1073741825, 2, 3);
        validInputTest(3, 178956971, 1073741826, 2, 3);
        validInputTest(1, 178956972, 1073741827, 2, 3);

        validInputTest(3, 357913940, 2147483640, 2, 3);
        validInputTest(1, 357913941, 2147483641, 2, 3);
        validInputTest(1, 357913941, 2147483642, 2, 3);
        validInputTest(2, 357913941, 2147483643, 2, 3);
        validInputTest(2, 357913941, 2147483644, 2, 3);
        validInputTest(3, 357913941, max-2, 2, 3);
        validInputTest(3, 357913941, max-1, 2, 3);
        validInputTest(1, 357913942, max, 2, 3);


        validInputTest(1, 1, 1, 8, 6);
        validInputTest(1, 1, 2, 8, 6);
        validInputTest(1, 1, 3, 8, 6);
        validInputTest(1, 1, 4, 8, 6);
        validInputTest(1, 1, 5, 8, 6);
        validInputTest(1, 1, 6, 8, 6);
        validInputTest(1, 1, 7, 8, 6);
        validInputTest(1, 1, 8, 8, 6);
        validInputTest(2, 1, 9, 8, 6);

        validInputTest(2, 1, 16, 8, 6);
        validInputTest(3, 1, 17, 8, 6);
        validInputTest(3, 1, 18, 8, 6);
        validInputTest(3, 1, 19, 8, 6);
        validInputTest(3, 1, 20, 8, 6);
        validInputTest(3, 1, 21, 8, 6);
        validInputTest(3, 1, 22, 8, 6);
        validInputTest(3, 1, 23, 8, 6);
        validInputTest(3, 1, 24, 8, 6);
        validInputTest(4, 1, 25, 8, 6);

        validInputTest(5, 1, 40, 8, 6);
        validInputTest(6, 1, 41, 8, 6);
        validInputTest(6, 1, 42, 8, 6);
        validInputTest(6, 1, 43, 8, 6);
        validInputTest(6, 1, 44, 8, 6);
        validInputTest(6, 1, 45, 8, 6);
        validInputTest(6, 1, 46, 8, 6);
        validInputTest(6, 1, 47, 8, 6);
        validInputTest(6, 1, 48, 8, 6);
        validInputTest(1, 2, 49, 8, 6);

        validInputTest(6, 22369621, 1073741808, 8, 6);
        validInputTest(1, 22369622, 1073741809, 8, 6);
        validInputTest(1, 22369622, 1073741810, 8, 6);
        validInputTest(1, 22369622, 1073741811, 8, 6);
        validInputTest(1, 22369622, 1073741812, 8, 6);
        validInputTest(1, 22369622, 1073741813, 8, 6);
        validInputTest(1, 22369622, 1073741814, 8, 6);
        validInputTest(1, 22369622, 1073741815, 8, 6);
        validInputTest(1, 22369622, 1073741816, 8, 6);
        validInputTest(2, 22369622, 1073741817, 8, 6);

        validInputTest(2, 22369622, 1073741824, 8, 6);
        validInputTest(3, 22369622, 1073741825, 8, 6);
        validInputTest(3, 22369622, 1073741826, 8, 6);
        validInputTest(3, 22369622, 1073741827, 8, 6);
        validInputTest(3, 22369622, 1073741828, 8, 6);
        validInputTest(3, 22369622, 1073741829, 8, 6);
        validInputTest(3, 22369622, 1073741830, 8, 6);
        validInputTest(3, 22369622, 1073741831, 8, 6);
        validInputTest(3, 22369622, 1073741832, 8, 6);
        validInputTest(4, 22369622, 1073741833, 8, 6);

        validInputTest(5, 22369622, 1073741848, 8, 6);
        validInputTest(6, 22369622, 1073741849, 8, 6);
        validInputTest(6, 22369622, 1073741850, 8, 6);
        validInputTest(6, 22369622, 1073741851, 8, 6);
        validInputTest(6, 22369622, 1073741852, 8, 6);
        validInputTest(6, 22369622, 1073741853, 8, 6);
        validInputTest(6, 22369622, 1073741854, 8, 6);
        validInputTest(6, 22369622, 1073741855, 8, 6);
        validInputTest(6, 22369622, 1073741856, 8, 6);
        validInputTest(1, 22369623, 1073741857, 8, 6);

        validInputTest(6, 44739242, 2147483616, 8, 6);
        validInputTest(1, 44739243, 2147483617, 8, 6);
        validInputTest(1, 44739243, 2147483618, 8, 6);
        validInputTest(1, 44739243, 2147483619, 8, 6);
        validInputTest(1, 44739243, 2147483620, 8, 6);
        validInputTest(1, 44739243, 2147483621, 8, 6);
        validInputTest(1, 44739243, 2147483622, 8, 6);
        validInputTest(1, 44739243, 2147483623, 8, 6);
        validInputTest(1, 44739243, 2147483624, 8, 6);
        validInputTest(2, 44739243, 2147483625, 8, 6);

        validInputTest(3, 44739243, 2147483640, 8, 6);
        validInputTest(4, 44739243, 2147483641, 8, 6);
        validInputTest(4, 44739243, 2147483642, 8, 6);
        validInputTest(4, 44739243, 2147483643, 8, 6);
        validInputTest(4, 44739243, 2147483644, 8, 6);
        validInputTest(4, 44739243, max-2, 8, 6);
        validInputTest(4, 44739243, max-1, 8, 6);
        validInputTest(4, 44739243, max, 8, 6);


        validInputTest(1, 1, 1, 2, 4);
        validInputTest(1, 1, 2, 2, 4);
        validInputTest(2, 1, 3, 2, 4);
        validInputTest(2, 1, 4, 2, 4);
        validInputTest(3, 1, 5, 2, 4);
        validInputTest(3, 1, 6, 2, 4);
        validInputTest(4, 1, 7, 2, 4);
        validInputTest(4, 1, 8, 2, 4);
        validInputTest(1, 2, 9, 2, 4);

        validInputTest(4, 134217727, 1073741816, 2, 4);
        validInputTest(1, 134217728, 1073741817, 2, 4);
        validInputTest(1, 134217728, 1073741818, 2, 4);
        validInputTest(2, 134217728, 1073741819, 2, 4);
        validInputTest(2, 134217728, 1073741820, 2, 4);
        validInputTest(3, 134217728, 1073741821, 2, 4);
        validInputTest(3, 134217728, 1073741822, 2, 4);
        validInputTest(4, 134217728, 1073741823, 2, 4);
        validInputTest(4, 134217728, 1073741824, 2, 4);
        validInputTest(1, 134217729, 1073741825, 2, 4);

        validInputTest(4, 268435455, 2147483640, 2, 4);
        validInputTest(1, 268435456, 2147483641, 2, 4);
        validInputTest(1, 268435456, 2147483642, 2, 4);
        validInputTest(2, 268435456, 2147483643, 2, 4);
        validInputTest(2, 268435456, 2147483644, 2, 4);
        validInputTest(3, 268435456, max-2, 2, 4);
        validInputTest(3, 268435456, max-1, 2, 4);
        validInputTest(4, 268435456, max, 2, 4);


        ////////////////////////////////////////4. Реализация
        invalidInputTest(-1, -1, -1);
        invalidInputTest(-1, min, max);
        invalidInputTest(max, max, -1);
        invalidInputTest(max, -1, max);

        outOfIntRangeTest(min, max, min + 1);
        outOfIntRangeTest(max, min + 1, max);

        outOfIntRangeTest(min, max, max);
        outOfIntRangeTest(max, max, max);

        invalidInputTest(min, min, 0);
        invalidInputTest(min, 0, min);
        invalidInputTest(0, min, min);

        invalidInputTest(max, max, 0);
        invalidInputTest(max, 0, max);
        outOfIntRangeTest(0, max, max);

        outOfIntRangeTest(min, 46341, 46341);
        outOfIntRangeTest(max, 46341, 46341);

        stringInputTest("1", "1", "fersef");
        stringInputTest("1", "gfdhjyr", "1");
        stringInputTest("1", "ytrffee", "defrhgfd");
        stringInputTest("rghdvvbm", "1", "1");
        stringInputTest("frgegv", "1", "werwer");
        stringInputTest("sdfgjuy", "dsdfhjk", "1");
        stringInputTest("rwfewf", "khjfiv", "gthteed");

        moreThenOneSpace(min, min, min);
        moreThenOneSpace(max, max, max);

        zeroParamsTest();
        oneParamTest(min);
        oneParamTest(max);
        twoParamsTest(min, min);
        twoParamsTest(max, max);
        twoParamsTest(min, max);
        twoParamsTest(max, min);
        fourParamsTest(min, min, min, min);
        fourParamsTest(min, min, min, max);
        fourParamsTest(min, min, max, min);
        fourParamsTest(min, min, max, max);
        fourParamsTest(min, max, min, min);
        fourParamsTest(min, max, min, max);
        fourParamsTest(min, max, max, min);
        fourParamsTest(min, max, max, max);
        fourParamsTest(max, min, min, min);
        fourParamsTest(max, min, min, max);
        fourParamsTest(max, min, max, min);
        fourParamsTest(max, min, max, max);
        fourParamsTest(max, max, min, min);
        fourParamsTest(max, max, min, max);
        fourParamsTest(max, max, max, min);
        fourParamsTest(max, max, max, max);

        ///////////////////////////////////////5. Случайные значения
        validInputTest(1, 10, 30, 3, 1);
        validInputTest(1, 6, 44, 4, 2);
        validInputTest(1, 3, 56, 8, 3);
        validInputTest(4, 1, 25, 7, 4);
        validInputTest(5, 1, 108, 22, 5);
        validInputTest(3, 1, 113, 45, 6);
        validInputTest(1, 1, 44, 52, 7);
        validInputTest(5, 1, 56, 12, 8);
        validInputTest(1, 2, 322, 33, 9);
        validInputTest(2, 1, 99, 85, 10);
        validInputTest(6, 1, 113, 21, 11);
        validInputTest(11, 1, 44, 4, 12);
        validInputTest(4, 1, 46, 12, 13);
        validInputTest(2, 2, 322, 70, 3);
        validInputTest(15, 1, 115, 8, 15);
        validInputTest(3, 1, 13, 6, 6);
        validInputTest(1, 3, 53, 20, 1);
        validInputTest(5, 1, 65, 15, 5);
        validInputTest(3, 1, 32, 11, 19);
        validInputTest(6, 1, 76, 13, 8);
        validInputTest(2, 1, 12, 6, 5);
        validInputTest(1, 2, 40, 4, 9);
        validInputTest(3, 1, 15, 5, 10);
        validInputTest(2, 4, 24, 3, 2);
        validInputTest(4, 1, 16, 4, 4);

        validInputTest(1, 1, 1, 7777, 20000);
        validInputTest(1, 1, 2, 7777, 20000);
        validInputTest(1, 1, 3889, 7777, 20000);
        validInputTest(1, 1, 5434, 7777, 20000);
        validInputTest(1, 1, 7776, 7777, 20000);
        validInputTest(1, 1, 7777, 7777, 20000);
        validInputTest(2, 1, 7778, 7777, 20000);

        validInputTest(9999, 1, 77762223, 7777, 20000);
        validInputTest(10000, 1, 77762224, 7777, 20000);
        validInputTest(10000, 1, 77762225, 7777, 20000);
        validInputTest(10000, 1, 77763998, 7777, 20000);
        validInputTest(10000, 1, 77766112, 7777, 20000);
        validInputTest(10000, 1, 77769999, 7777, 20000);
        validInputTest(10000, 1, 77770000, 7777, 20000);
        validInputTest(10001, 1, 77770001, 7777, 20000);

        validInputTest(19999, 1, 155532223, 7777, 20000);
        validInputTest(20000, 1, 155532224, 7777, 20000);
        validInputTest(20000, 1, 155532225, 7777, 20000);
        validInputTest(20000, 1, 155536112, 7777, 20000);
        validInputTest(20000, 1, 155535877, 7777, 20000);
        validInputTest(20000, 1, 155539999, 7777, 20000);
        validInputTest(20000, 1, 155540000, 7777, 20000);
        validInputTest(1, 2, 155540001, 7777, 20000);

        validInputTest(20000, 2, 311080000, 7777, 20000);
        validInputTest(1, 3, 311080001, 7777, 20000);
        validInputTest(1, 3, 311080002, 7777, 20000);
        validInputTest(1, 3, 311083548, 7777, 20000);
        validInputTest(1, 3, 311083889, 7777, 20000);
        validInputTest(1, 3, 311087776, 7777, 20000);
        validInputTest(1, 3, 311087777, 7777, 20000);
        validInputTest(2, 3, 311087778, 7777, 20000);

        validInputTest(9999, 3, 388842223, 7777, 20000);
        validInputTest(10000, 3, 388842224, 7777, 20000);
        validInputTest(10000, 3, 388842225, 7777, 20000);
        validInputTest(10000, 3, 388845412, 7777, 20000);
        validInputTest(10000, 3, 388846112, 7777, 20000);
        validInputTest(10000, 3, 388849999, 7777, 20000);
        validInputTest(10000, 3, 388850000, 7777, 20000);
        validInputTest(10001, 3, 388850001, 7777, 20000);

        validInputTest(19999, 3, 466612223, 7777, 20000);
        validInputTest(20000, 3, 466612224, 7777, 20000);
        validInputTest(20000, 3, 466612225, 7777, 20000);
        validInputTest(20000, 3, 466615987, 7777, 20000);
        validInputTest(20000, 3, 466616112, 7777, 20000);
        validInputTest(20000, 3, 466619999, 7777, 20000);
        validInputTest(20000, 3, 466620000, 7777, 20000);
        validInputTest(1, 4, 466620001, 7777, 20000);

        validInputTest(20000, 6, 933240000, 7777, 20000);
        validInputTest(1, 7, 933240001, 7777, 20000);
        validInputTest(1, 7, 933240002, 7777, 20000);
        validInputTest(1, 7, 933243889, 7777, 20000);
        validInputTest(1, 7, 933246984, 7777, 20000);
        validInputTest(1, 7, 933247776, 7777, 20000);
        validInputTest(1, 7, 933247777, 7777, 20000);
        validInputTest(2, 7, 933247778, 7777, 20000);

        validInputTest(9999, 7, 1011002223, 7777, 20000);
        validInputTest(10000, 7, 1011002224, 7777, 20000);
        validInputTest(10000, 7, 1011002225, 7777, 20000);
        validInputTest(10000, 7, 1011005847, 7777, 20000);
        validInputTest(10000, 7, 1011006112, 7777, 20000);
        validInputTest(10000, 7, 1011009999, 7777, 20000);
        validInputTest(10000, 7, 1011010000, 7777, 20000);
        validInputTest(10001, 7, 1011010001, 7777, 20000);

        validInputTest(19999, 7, 1088772223, 7777, 20000);
        validInputTest(20000, 7, 1088772224, 7777, 20000);
        validInputTest(20000, 7, 1088772225, 7777, 20000);
        validInputTest(20000, 7, 1088774589, 7777, 20000);
        validInputTest(20000, 7, 1088776112, 7777, 20000);
        validInputTest(20000, 7, 1088779999, 7777, 20000);
        validInputTest(20000, 7, 1088780000, 7777, 20000);
        validInputTest(1, 8, 1088780001, 7777, 20000);

        validInputTest(20000, 12, 1866480000, 7777, 20000);
        validInputTest(1, 13, 1866480001, 7777, 20000);
        validInputTest(1, 13, 1866480002, 7777, 20000);
        validInputTest(1, 13, 1866483889, 7777, 20000);
        validInputTest(1, 13, 1866486234, 7777, 20000);
        validInputTest(1, 13, 1866487776, 7777, 20000);
        validInputTest(1, 13, 1866487777, 7777, 20000);
        validInputTest(2, 13, 1866487778, 7777, 20000);

        validInputTest(9999, 13, 1944242223, 7777, 20000);
        validInputTest(10000, 13, 1944242224, 7777, 20000);
        validInputTest(10000, 13, 1944242225, 7777, 20000);
        validInputTest(10000, 13, 1944246112, 7777, 20000);
        validInputTest(10000, 13, 1944248546, 7777, 20000);
        validInputTest(10000, 13, 1944249999, 7777, 20000);
        validInputTest(10000, 13, 1944250000, 7777, 20000);
        validInputTest(10001, 13, 1944250001, 7777, 20000);

        validInputTest(19999, 13, 2022012223, 7777, 20000);
        validInputTest(20000, 13, 2022012224, 7777, 20000);
        validInputTest(20000, 13, 2022012225, 7777, 20000);
        validInputTest(20000, 13, 2022014589, 7777, 20000);
        validInputTest(20000, 13, 2022016112, 7777, 20000);
        validInputTest(20000, 13, 2022019999, 7777, 20000);
        validInputTest(20000, 13, 2022020000, 7777, 20000);
        validInputTest(1, 14, 2022020001, 7777, 20000);

        ///////////////////////////////////////6. Другие особые значения
        validInputTest(1, 14, 2022020001, 7777, 20000);
        validInputTest(1, 14, 2022020002, 7777, 20000);
        validInputTest(1, 14, 2022022658, 7777, 20000);
        validInputTest(1, 14, 2022023889, 7777, 20000);
        validInputTest(1, 14, 2022027777, 7777, 20000);
        validInputTest(2, 14, 2022027778, 7777, 20000);

        validInputTest(99, 14, 2022789923, 7777, 20000);
        validInputTest(100, 14, 2022789924, 7777, 20000);
        validInputTest(100, 14, 2022789925, 7777, 20000);
        validInputTest(100, 14, 2022791982, 7777, 20000);
        validInputTest(100, 14, 2022793812, 7777, 20000);
        validInputTest(100, 14, 2022797699, 7777, 20000);
        validInputTest(100, 14, 2022797700, 7777, 20000);
        validInputTest(101, 14, 2022797701, 7777, 20000);

        validInputTest(8066, 14, 2084749282, 7777, 20000);
        validInputTest(8067, 14, 2084749283, 7777, 20000);
        validInputTest(8067, 14, 2084749284, 7777, 20000);
        validInputTest(8067, 14, 2084752354, 7777, 20000);
        validInputTest(8067, 14, 2084753171, 7777, 20000);
        validInputTest(8067, 14, 2084757058, 7777, 20000);
        validInputTest(8067, 14, 2084757059, 7777, 20000);
        validInputTest(8068, 14, 2084757060, 7777, 20000);

        validInputTest(16131, 14, 2147470787, 7777, 20000);
        validInputTest(16132, 14, 2147470788, 7777, 20000);
        validInputTest(16132, 14, 2147470789, 7777, 20000);
        validInputTest(16132, 14, 2147477487, 7777, 20000);
        validInputTest(16132, 14, 2147474676, 7777, 20000);
        validInputTest(16132, 14, 2147478563, 7777, 20000);
        validInputTest(16132, 14, 2147478564, 7777, 20000);

        validInputTest(16133, 14, 2147478565, 7777, 20000);
        validInputTest(16133, 14, 2147479874, 7777, 20000);
        validInputTest(16133, 14, 2147481106, 7777, 20000);
        validInputTest(16133, 14, max - 1, 7777, 20000);
        validInputTest(16133, 14, max - 1, 7777, 20000);
        validInputTest(16133, 14, max, 7777, 20000);

        validInputTest(3, 143165576, 2147483640, 5, 3);
        validInputTest(1, 143165577, 2147483641, 5, 3);
        validInputTest(1, 143165577, 2147483642, 5, 3);
        validInputTest(1, 143165577, 2147483643, 5, 3);
        validInputTest(1, 143165577, 2147483644, 5, 3);
        validInputTest(1, 143165577, max - 2, 5, 3);
        validInputTest(2, 143165577, max - 1, 5, 3);
        validInputTest(2, 143165577, max, 5, 3);
    }

    /*private void s(int et, int pod, int n, int nA, int p) {
        assertEquals(et + " этаж, " + pod + " подъезд.", d(n, nA, p));
    }

    private void s(int n, int nA, int p) {
        assertEquals("Введены не корректные данные.", d(n, nA, p));
    }*/


    private void validInputTest(int et, int pod, int n, int nA, int p) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        System.setIn(new ByteArrayInputStream((n + " " + nA + " " + p).getBytes()));
        main(new String[]{});
        assertEquals("Введите номер квартиры, количество квартир на этаже и количество этажей через пробел: "
                + et + " этаж, " + pod + " подъезд.", output.toString());
    }

    private void invalidInputTest(int n, int nA, int p) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        System.setIn(new ByteArrayInputStream((n + " " + nA + " " + p).getBytes()));
        main(new String[]{});
        assertEquals(incorrectInput + " Номер квартиры  " + n + ", квартир на этаже "
                + nA + ", этажей в подъезде " + p, output.toString());
    }

    private void outOfIntRangeTest(int n, int nA, int p) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        System.setIn(new ByteArrayInputStream((n + " " + nA + " " + p).getBytes()));
        main(new String[]{});
        assertEquals(incorrectInput + " Квартир на этаже " + nA + ", этажей в подъезде " + p +
                ", квартир в подъезде " + (long) nA * p + " > " + Integer.MAX_VALUE, output.toString());
    }

    private void stringInputTest(String n, String nA, String p) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        System.setIn(new ByteArrayInputStream((n + " " + nA + " " + p).getBytes()));
        main(new String[]{});
        assertEquals(incorrectInput, output.toString());
    }

    private void fourParamsTest(int n, int nA, int p, int a) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        System.setIn(new ByteArrayInputStream((n + " " + nA + " " + p + " " + a).getBytes()));
        main(new String[]{});
        assertEquals(incorrectNumberOfParams + "4", output.toString());
    }

    private void twoParamsTest(int n, int nA) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        System.setIn(new ByteArrayInputStream((n + " " + nA).getBytes()));
        main(new String[]{});
        assertEquals(incorrectNumberOfParams + "2", output.toString());
    }

    private void oneParamTest(int n) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        System.setIn(new ByteArrayInputStream(String.valueOf(n).getBytes()));
        main(new String[]{});
        assertEquals(incorrectNumberOfParams + "1", output.toString());
    }

    private void zeroParamsTest() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        System.setIn(new ByteArrayInputStream("".getBytes()));
        main(new String[]{});
        assertEquals(incorrectInput, output.toString());
    }

    private void moreThenOneSpace(int n, int nA, int p) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        System.setIn(new ByteArrayInputStream((n + "  " + nA + "  " + p).getBytes()));
        main(new String[]{});
        assertEquals(incorrectNumberOfParams + "5", output.toString());
    }
    private final String incorrectNumberOfParams = "Введите номер квартиры, количество квартир на этаже и количество этажей через пробел: "
            +"Введено неверное число параметров: ";

    private final String incorrectInput = "Введите номер квартиры, количество квартир на этаже и количество этажей через пробел:" +
            " Введены не корректные данные.";
}