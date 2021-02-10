package task2;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class AppTest {
    private final ArrayList<TestScenario> testScenarios = new ArrayList<>();

    private void setUpScenarios() {
        int min = 1;
        int max = Integer.MAX_VALUE;
        ///////////////////////////////////////1 Граничные значения области определения.
        s(1, 1, min, max, min);
        s(1, 1, min + 1, max, min);
        s(1, 1, min, max - 1, min);

        s(1, 1, min, 214748364, 10);
        s(1, 1, min + 1, 214748364, 10);
        s(1, 1, min, 214748363, 10);
        s(1, 1, min, 214748364, 9);
        s(1, 1, min, 214748363, 9);

        s(1, 1, min, 42949672, 50);
        s(1, 1, min + 1, 42949672, 50);
        s(1, 1, min, 42949671, 50);
        s(1, 1, min, 42949672, 49);
        s(1, 1, min, 42949671, 49);

        s(1, 1, min, 21474836, 100);
        s(1, 1, min + 1, 21474836, 100);
        s(1, 1, min, 21474835, 100);
        s(1, 1, min, 21474836, 99);
        s(1, 1, min, 21474835, 99);

        s(1, 1, min, 4294967, 500);
        s(1, 1, min + 1, 4294967, 500);
        s(1, 1, min, 4294966, 500);
        s(1, 1, min, 4294967, 499);
        s(1, 1, min, 4294966, 499);

        s(1, 1, min, 2147483, 1000);
        s(1, 1, min + 1, 2147483, 1000);
        s(1, 1, min, 2147482, 1000);
        s(1, 1, min, 2147483, 999);
        s(1, 1, min, 2147482, 999);

        s(1, 1, min, 429496, 5000);
        s(1, 1, min + 1, 429496, 5000);
        s(1, 1, min, 429495, 5000);
        s(1, 1, min, 429496, 4999);
        s(1, 1, min, 429495, 4999);

        s(1, 1, min, 214748, 10000);
        s(1, 1, min + 1, 214748, 10000);
        s(1, 1, min, 214747, 10000);
        s(1, 1, min, 214748, 9999);
        s(1, 1, min, 214747, 9999);

        s(1, 1, min, 46341, 46340);
        s(1, 1, min + 1, 46341, 46340);
        s(1, 1, min, 46340, 46340);
        s(1, 1, min, 46341, 46339);
        s(1, 1, min, 46340, 46339);

        s(1, 1, min, 46340, 46341);
        s(1, 1, min + 1, 46340, 46341);
        s(1, 1, min, 46339, 46341);
        s(1, 1, min, 46340, 46340);
        s(1, 1, min, 46339, 46340);

        s(1, 1, min, 10000, 214748);
        s(1, 1, min + 1, 10000, 214748);
        s(1, 1, min, 9999, 214748);
        s(1, 1, min, 10000, 214747);
        s(1, 1, min, 9999, 214747);

        s(1, 1, min, 5000, 429496);
        s(1, 1, min + 1, 5000, 429496);
        s(1, 1, min, 4999, 429496);
        s(1, 1, min, 5000, 429495);
        s(1, 1, min, 4999, 429495);

        s(1, 1, min, 1000, 2147483);
        s(1, 1, min + 1, 1000, 2147483);
        s(1, 1, min, 999, 2147483);
        s(1, 1, min, 1000, 2147482);
        s(1, 1, min, 999, 2147482);

        s(1, 1, min, 500, 4294967);
        s(1, 1, min + 1, 500, 4294967);
        s(1, 1, min, 499, 4294967);
        s(1, 1, min, 500, 4294966);
        s(1, 1, min, 499, 4294966);

        s(1, 1, min, 100, 21474836);
        s(1, 1, min + 1, 100, 21474836);
        s(1, 1, min, 99, 21474836);
        s(1, 1, min, 100, 21474835);
        s(1, 1, min, 99, 21474835);

        s(1, 1, min, 50, 42949672);
        s(1, 1, min + 1, 50, 42949672);
        s(1, 1, min, 49, 42949672);
        s(1, 1, min, 50, 42949671);
        s(1, 1, min, 49, 42949671);

        s(1, 1, min, 10, 214748364);
        s(1, 1, min + 1, 10, 214748364);
        s(1, 1, min, 9, 214748364);
        s(1, 1, min, 10, 214748363);
        s(1, 1, min, 9, 214748363);

        s(1, 1, min, min, max);
        s(2, 1, min + 1, min, max);
        s(1, 1, min, min, max - 1);

        s(1, 1, max, max, min);
        s(1, 1, max - 1, max, min);
        s(1, 2, max, max - 1, min);

        s(1, 2, max, 214748364, 10);
        s(1, 2, max - 1, 214748364, 10);
        s(2, 2, max, 214748364, 9);
        s(1, 2, max, 214748363, 10);
        s(2, 2, max, 214748363, 9);

        s(1, 2, max, 42949672, 50);
        s(1, 2, max - 1, 42949672, 50);
        s(2, 2, max, 42949672, 49);
        s(1, 2, max, 42949671, 50);
        s(2, 2, max, 42949671, 49);

        s(1, 2, max, 21474836, 100);
        s(1, 2, max - 1, 21474836, 100);
        s(2, 2, max, 21474836, 99);
        s(1, 2, max, 21474835, 100);
        s(2, 2, max, 21474835, 99);

        s(1, 2, max, 4294967, 500);
        s(1, 2, max - 1, 4294967, 500);
        s(2, 2, max, 4294967, 499);
        s(1, 2, max, 4294966, 500);
        s(2, 2, max, 4294966, 499);

        s(1, 2, max, 2147483, 1000);
        s(1, 2, max - 1, 2147483, 1000);
        s(2, 2, max, 2147483, 999);
        s(1, 2, max, 2147482, 1000);
        s(2, 2, max, 2147482, 999);

        s(1, 2, max, 429496, 5000);
        s(1, 2, max - 1, 429496, 5000);
        s(2, 2, max, 429496, 4999);
        s(1, 2, max, 429495, 5000);
        s(2, 2, max, 429495, 4999);

        s(1, 2, max, 214748, 10000);
        s(1, 2, max - 1, 214748, 10000);
        s(2, 2, max, 214748, 9999);
        s(1, 2, max, 214747, 10000);
        s(2, 2, max, 214747, 9999);

        s(1, 2, max, 46341, 46340);
        s(1, 2, max - 1, 46341, 46340);
        s(2, 2, max, 46341, 46339);
        s(2, 2, max, 46340, 46340);
        s(3, 2, max, 46340, 46339);

        s(1, 2, max, 46340, 46341);
        s(1, 2, max - 1, 46340, 46341);
        s(2, 2, max, 46340, 46340);
        s(2, 2, max, 46339, 46341);
        s(3, 2, max, 46339, 46340);

        s(1, 2, max, 10000, 214748);
        s(1, 2, max - 1, 10000, 214748);
        s(2, 2, max, 10000, 214747);
        s(22, 2, max, 9999, 214748);
        s(23, 2, max, 9999, 214747);

        s(1, 2, max, 5000, 429496);
        s(1, 2, max - 1, 5000, 429496);
        s(2, 2, max, 5000, 429495);
        s(87, 2, max, 4999, 429496);
        s(88, 2, max, 4999, 429495);

        s(1, 2, max, 1000, 2147483);
        s(1, 2, max - 1, 1000, 2147483);
        s(2, 2, max, 1000, 2147482);
        s(2151, 2, max, 999, 2147483);
        s(2152, 2, max, 999, 2147482);

        s(1, 2, max, 500, 4294967);
        s(1, 2, max - 1, 500, 4294967);
        s(2, 2, max, 500, 4294966);
        s(8608, 2, max, 499, 4294967);
        s(8609, 2, max, 499, 4294966);

        s(1, 2, max, 100, 21474836);
        s(1, 2, max - 1, 100, 21474836);
        s(2, 2, max, 100, 21474835);
        s(216919, 2, max, 99, 21474836);
        s(216920, 2, max, 99, 21474835);

        s(1, 2, max, 50, 42949672);
        s(1, 2, max - 1, 50, 42949672);
        s(2, 2, max, 50, 42949671);
        s(876525, 2, max, 49, 42949672);
        s(876526, 2, max, 49, 42949671);

        s(1, 2, max, 10, 214748364);
        s(1, 2, max - 1, 10, 214748364);
        s(2, 2, max, 10, 214748363);
        s(23860931, 2, max, 9, 214748364);
        s(23860932, 2, max, 9, 214748363);

        s(2147483647, 1, max, min, max);
        s(2147483646, 1, max - 1, min, max);
        s(1, 2, max, min, max - 1);

        s(1, 1, min, 10, min);
        s(1, 1, min + 1, 10, min);
        s(1, 1, min, 10, min + 1);
        s(1, 1, min, 9, min);
        s(1, 1, min, 11, min);

        s(1, 1, min, 100, min);
        s(1, 1, min + 1, 100, min);
        s(1, 1, min, 100, min + 1);
        s(1, 1, min, 99, min);
        s(1, 1, min, 101, min);

        s(1, 1, min, 1000, min);
        s(1, 1, min + 1, 1000, min);
        s(1, 1, min, 1000, min + 1);
        s(1, 1, min, 999, min);
        s(1, 1, min, 1001, min);

        s(1, 1, min, 10000, min);
        s(1, 1, min + 1, 10000, min);
        s(1, 1, min, 10000, min + 1);
        s(1, 1, min, 9999, min);
        s(1, 1, min, 10001, min);

        s(1, 1, min, 100000, min);
        s(1, 1, min + 1, 100000, min);
        s(1, 1, min, 100000, min + 1);
        s(1, 1, min, 99999, min);
        s(1, 1, min, 100001, min);

        s(1, 1, min, 1000000, min);
        s(1, 1, min + 1, 1000000, min);
        s(1, 1, min, 1000000, min + 1);
        s(1, 1, min, 999999, min);
        s(1, 1, min, 1000001, min);

        s(1, 1, min, 10000000, min);
        s(1, 1, min + 1, 10000000, min);
        s(1, 1, min, 10000000, min + 1);
        s(1, 1, min, 9999999, min);
        s(1, 1, min, 10000001, min);

        s(1, 1, min, 100000000, min);
        s(1, 1, min + 1, 100000000, min);
        s(1, 1, min, 100000000, min + 1);
        s(1, 1, min, 99999999, min);
        s(1, 1, min, 100000001, min);

        s(1, 1, min, 1000000000, min);
        s(1, 1, min + 1, 1000000000, min);
        s(1, 1, min, 1000000000, min + 1);
        s(1, 1, min, 999999999, min);
        s(1, 1, min, 1000000001, min);

        s(1, 1, min, max, min);
        s(1, 1, min + 1, max, min);
        s(1, 1, min, max - 1, min);

        s(1, 1, min, min, 10);
        s(2, 1, min + 1, min, 10);
        s(1, 1, min, min, 9);
        s(1, 1, min, min + 1, 10);
        s(1, 1, min, min, 11);

        s(1, 1, min, min, 100);
        s(2, 1, min + 1, min, 100);
        s(1, 1, min, min, 99);
        s(1, 1, min, min + 1, 100);
        s(1, 1, min, min, 101);

        s(1, 1, min, min, 1000);
        s(2, 1, min + 1, min, 1000);
        s(1, 1, min, min, 999);
        s(1, 1, min, min + 1, 1000);
        s(1, 1, min, min, 1001);

        s(1, 1, min, min, 10000);
        s(2, 1, min + 1, min, 10000);
        s(1, 1, min, min, 9999);
        s(1, 1, min, min + 1, 10000);
        s(1, 1, min, min, 10001);

        s(1, 1, min, min, 100000);
        s(2, 1, min + 1, min, 100000);
        s(1, 1, min, min, 99999);
        s(1, 1, min, min + 1, 100000);
        s(1, 1, min, min, 100001);

        s(1, 1, min, min, 1000000);
        s(2, 1, min + 1, min, 1000000);
        s(1, 1, min, min, 999999);
        s(1, 1, min, min + 1, 1000000);
        s(1, 1, min, min, 1000001);

        s(1, 1, min, min, 10000000);
        s(2, 1, min + 1, min, 10000000);
        s(1, 1, min, min, 9999999);
        s(1, 1, min, min + 1, 10000000);
        s(1, 1, min, min, 10000001);

        s(1, 1, min, min, 100000000);
        s(2, 1, min + 1, min, 100000000);
        s(1, 1, min, min, 9);
        s(1, 1, min, min + 1, 100000000);
        s(1, 1, min, min, 100000001);

        s(1, 1, min, min, 1000000000);
        s(2, 1, min + 1, min, 1000000000);
        s(1, 1, min, min, 999999999);
        s(1, 1, min, min + 1, 1000000000);
        s(1, 1, min, min, 1000000001);

        s(1, 1, min, min, max);
        s(2, 1, min + 1, min, max);
        s(1, 1, min, min, max - 1);

        s(1, 214748365, max, 10, min);
        s(1, 214748365, max - 1, 10, min);
        s(1, 238609295, max, 9, min);
        s(1, 195225787, max, 11, min);

        s(1, 21474837, max, 100, min);
        s(1, 21474837, max - 1, 100, min);
        s(1, 21691755, max, 99, min);
        s(1, 21262215, max, 101, min);

        s(1, 2147484, max, 1000, min);
        s(1, 2147484, max - 1, 1000, min);
        s(1, 2149634, max, 999, min);
        s(1, 2145339, max, 1001, min);

        s(1, 214749, max, 10000, min);
        s(1, 214749, max - 1, 10000, min);
        s(1, 214770, max, 9999, min);
        s(1, 214727, max, 10001, min);

        s(1, 21475, max, 100000, min);
        s(1, 21475, max - 1, 100000, min);
        s(1, 21476, max, 99999, min);
        s(1, 21475, max, 100001, min);

        s(1, 2148, max, 1000000, min);
        s(1, 2148, max - 1, 1000000, min);
        s(1, 2148, max, 999999, min);
        s(1, 2148, max, 1000001, min);

        s(1, 215, max, 10000000, min);
        s(1, 215, max - 1, 10000000, min);
        s(1, 215, max, 9999999, min);
        s(1, 215, max, 10000001, min);

        s(1, 22, max, 100000000, min);
        s(1, 22, max - 1, 100000000, min);
        s(1, 22, max, 99999999, min);
        s(1, 22, max, 100000001, min);

        s(1, 3, max, 1000000000, min);
        s(1, 3, max - 1, 1000000000, min);
        s(1, 3, max, 999999999, min);
        s(1, 3, max, 1000000001, min);

        s(1, 1, max, max, min);
        s(1, 1, max - 1, max, min);
        s(1, 2, max, max - 1, min);

        s(7, 214748365, max, min, 10);
        s(6, 214748365, max - 1, min, 10);
        s(1, 195225787, max, min, 11);
        s(4, 107374183, max, min + 1, 10);
        s(1, 238609295, max, min, 9);

        s(47, 21474837, max, min, 100);
        s(46, 21474837, max - 1, min, 100);
        s(33, 21262215, max, min, 101);
        s(24, 10737419, max, min + 1, 100);
        s(1, 21691755, max, min, 99);

        s(647, 2147484, max, min, 1000);
        s(646, 2147484, max - 1, min, 1000);
        s(309, 2145339, max, min, 1001);
        s(824, 1073742, max, min + 1, 1000);
        s(280, 2149634, max, min, 999);

        s(3647, 214749, max, min, 10000);
        s(3646, 214749, max - 1, min, 10000);
        s(8921, 214727, max, min, 10001);
        s(1824, 107375, max, min + 1, 10000);
        s(8416, 214770, max, min, 9999);

        s(83647, 21475, max, min, 100000);
        s(83646, 21475, max - 1, min, 100000);
        s(62173, 21475, max, min, 100001);
        s(41824, 10738, max, min + 1, 100000);
        s(5122, 21476, max, min, 99999);

        s(483647, 2148, max, min, 1000000);
        s(483646, 2148, max - 1, min, 1000000);
        s(481500, 2148, max, min, 1000001);
        s(741824, 1074, max, min + 1, 1000000);
        s(485794, 2148, max, min, 999999);

        s(7483647, 215, max, min, 10000000);
        s(7483646, 215, max - 1, min, 10000000);
        s(7483433, 215, max, min, 10000001);
        s(3741824, 108, max, min + 1, 10000000);
        s(7483861, 215, max, min, 9999999);

        s(47483647, 22, max, min, 100000000);
        s(47483646, 22, max - 1, min, 100000000);
        s(47483626, 22, max, min, 100000001);
        s(73741824, 11, max, min + 1, 100000000);
        s(47483668, 22, max, min, 99999999);

        s(147483647, 3, max, min, 1000000000);
        s(147483646, 3, max - 1, min, 1000000000);
        s(147483645, 3, max, min, 1000000001);
        s(73741824, 2, max, min + 1, 1000000000);
        s(147483649, 3, max, min, 999999999);

        s(2147483647, 1, max, min, max);
        s(2147483646, 1, max - 1, min, max);
        s(1, 2, max, min, max - 1);
        ////////////////////////////////////////2 Классы эквивалентности
        ////////////////////////////////////////2.1 Границы классов эквивалентности
        s(1, 1, 1, 46340, 46341);
        s(1, 1, 46340, 46340, 46341);

        s(1, 1, 1, 46340, 46341);
        s(46341, 1, 2147441940, 46340, 46341);

        s(1, 1, 1, min, max);
        s(max, 1, max, min, max);

        s(1, 1, 1, max, min);
        s(1, 1, max, max, min);

        s(1, 1, 1, min, min);

        s(1, 1, 1, 1000000, min);
        s(1, 1, 1000000, 1000000, min);

        s(1, 1, 1, min, 1000000);
        s(1000000, 1, 1000000, min, 1000000);

        s(1, 1, 1, 2147, 1000225);
        s(1, 1, 2147, 2147, 1000225);
        s(1000225, 1, 2147483075, 2147, 1000225);

        s(1, 1, 1, 1000225, 2147);
        s(1, 1, 1000225, 1000225, 2147);
        s(2147, 1, 2147483075, 1000225, 2147);

        s(3, 2, 36, 5, 5);
        s(3, 2, 40, 5, 5);
        s(1, 2, 26, 5, 5);
        s(5, 2, 50, 5, 5);

        ////////////////////////////////////////2.2 Впритык слева и справа от грацницы
        s(1, 1, 2, 46340, 46341);
        s(1, 1, 46340, 46340, 46341);
        s(2, 1, 46341, 46340, 46341);

        s(46341, 1, 2147441939, 46340, 46341);
        s(1, 2, 2147441941, 46340, 46341);

        s(2, 1, min + 1, min, max);
        s(max - 1, 1, max - 1, min, max);

        s(1, 1, min + 1, max, min);
        s(1, 1, max - 1, max, min);

        s(1, 2, 2, min, min);

        s(1, 1, 2, 1000000, min);
        s(1, 1, 999999, 1000000, min);
        s(1, 2, 1000001, 1000000, min);

        s(2, 1, 2, min, 1000000);
        s(1, 2, 1000001, min, 1000000);

        s(1, 1, 2, 2147, 1000225);
        s(1, 1, 2146, 2147, 1000225);
        s(2, 1, 2148, 2147, 1000225);
        s(1000225, 1, 2147483074, 2147, 1000225);
        s(1, 2, 2147483076, 2147, 1000225);

        s(1, 1, 2, 1000225, 2147);
        s(1, 1, 1000224, 1000225, 2147);
        s(2, 1, 1000226, 1000225, 2147);
        s(2147, 1, 2147483074, 1000225, 2147);
        s(1, 2, 2147483076, 1000225, 2147);

        s(2, 2, 35, 5, 5);
        s(3, 2, 37, 5, 5);
        s(3, 2, 39, 5, 5);
        s(4, 2, 41, 5, 5);

        s(5, 1, 25, 5, 5);
        s(1, 2, 27, 5, 5);
        s(5, 2, 50, 5, 5);
        s(1, 3, 51, 5, 5);

        ////////////////////////////////////////2.3 Внутри класса эквивалентности
        s(1, 1, 20000, 46340, 46341);
        s(1, 1, 40000, 46340, 46341);

        s(1, 1, 43532, 46340, 46341);
        s(46340, 1, 2147395600, 46340, 46341);

        s(5436304, 1, 5436304, min, max);

        s(1, 1, 65464564, max, min);

        s(1, 1, 500000, 1000000, min);

        s(1, 1, 543, 2147, 1000225);
        s(2, 1, 4294, 2147, 1000225);

        s(5, 2, 47, 5, 5);
        s(3, 2, 39, 5, 5);

        ////////////////////////////////////////3. Предметная область
        s(2, 4, 113, 4, 9);
        s(2, 3, 46, 4, 5);
        s(5, 2, 56, 4, 9);
        s(9, 9, 322, 4, 9);
        ////////////////////////////////////////4. Реализация
        s(1, 1, min, min, min);
        s(1, max, max, min, min);
        s(1, 1, min, max, min);
        s(1, 1, max, max, min);
        s(1, 1, min, min, max);
        s(max, 1, max, min, max);
        s(min, max, min + 1);
        s(max, min + 1, max);
        s(min, max, max);
        s(max, max, max);
        s(min, min, 0);
        s(min, 0, min);
        s(0, min, min);
        s(min, 46341, 46341);
        ///////////////////////////////////////5. Случайные значения
        s(1, 10, 30, 3, 1);
        s(1, 6, 44, 4, 2);
        s(1, 3, 56, 8, 3);
        s(4, 1, 25, 7, 4);
        s(5, 1, 108, 22, 5);
        s(3, 1, 113, 45, 6);
        s(1, 1, 44, 52, 7);
        s(5, 1, 56, 12, 8);
        s(1, 2, 322, 33, 9);
        s(2, 1, 99, 85, 10);
        s(6, 1, 113, 21, 11);
        s(11, 1, 44, 4, 12);
        s(4, 1, 46, 12, 13);
        s(2, 2, 322, 70, 3);
        s(15, 1, 115, 8, 15);
        s(3, 1, 13, 6, 6);
        s(1, 3, 53, 20, 1);
        s(5, 1, 65, 15, 5);
        s(3, 1, 32, 11, 19);
        s(6, 1, 76, 13, 8);
        s(2, 1, 12, 6, 5);
        s(1, 2, 40, 4, 9);
        s(3, 1, 15, 5, 10);
        s(2, 4, 24, 3, 2);
        s(4, 1, 16, 4, 4);
        ///////////////////////////////////////6. Другие особые значения
        s(1, 1, 1, 6, 9);
        s(1, 1, 2, 6, 9);
        s(1, 1, 3, 6, 9);
        s(1, 1, 4, 6, 9);
        s(1, 1, 5, 6, 9);
        s(1, 1, 6, 6, 9);
        s(2, 1, 7, 6, 9);
        s(2, 1, 8, 6, 9);
        s(2, 1, 9, 6, 9);
        s(2, 1, 10, 6, 9);
        s(2, 1, 11, 6, 9);
        s(2, 1, 12, 6, 9);
        s(3, 1, 13, 6, 9);
        s(3, 1, 14, 6, 9);
        s(3, 1, 15, 6, 9);
        s(3, 1, 16, 6, 9);
        s(3, 1, 17, 6, 9);
        s(3, 1, 18, 6, 9);
        s(4, 1, 19, 6, 9);
        s(4, 1, 20, 6, 9);
        s(4, 1, 21, 6, 9);
        s(4, 1, 22, 6, 9);
        s(4, 1, 23, 6, 9);
        s(4, 1, 24, 6, 9);
        s(5, 1, 25, 6, 9);
        s(5, 1, 26, 6, 9);
        s(5, 1, 27, 6, 9);
        s(5, 1, 28, 6, 9);
        s(5, 1, 29, 6, 9);
        s(5, 1, 30, 6, 9);
        s(6, 1, 31, 6, 9);
        s(6, 1, 32, 6, 9);
        s(6, 1, 33, 6, 9);
        s(6, 1, 34, 6, 9);
        s(6, 1, 35, 6, 9);
        s(6, 1, 36, 6, 9);
        s(7, 1, 37, 6, 9);
        s(7, 1, 38, 6, 9);
        s(7, 1, 39, 6, 9);
        s(7, 1, 40, 6, 9);
        s(7, 1, 41, 6, 9);
        s(7, 1, 42, 6, 9);
        s(8, 1, 43, 6, 9);
        s(8, 1, 44, 6, 9);
        s(8, 1, 45, 6, 9);
        s(8, 1, 46, 6, 9);
        s(8, 1, 47, 6, 9);
        s(8, 1, 48, 6, 9);
        s(9, 1, 49, 6, 9);
        s(9, 1, 50, 6, 9);
        s(9, 1, 51, 6, 9);
        s(9, 1, 52, 6, 9);
        s(9, 1, 53, 6, 9);
        s(9, 1, 54, 6, 9);
        s(1, 2, 55, 6, 9);
        s(1, 2, 56, 6, 9);
        s(1, 2, 57, 6, 9);
        s(1, 2, 58, 6, 9);
        s(1, 2, 59, 6, 9);
        s(1, 2, 60, 6, 9);
        s(2, 2, 61, 6, 9);
        s(2, 2, 62, 6, 9);
        s(2, 2, 63, 6, 9);
        s(2, 2, 64, 6, 9);
        s(2, 2, 65, 6, 9);
        s(2, 2, 66, 6, 9);
        s(3, 2, 67, 6, 9);
        s(3, 2, 68, 6, 9);
        s(3, 2, 69, 6, 9);
        s(3, 2, 70, 6, 9);
        s(3, 2, 71, 6, 9);
        s(3, 2, 72, 6, 9);
        s(4, 2, 73, 6, 9);
        s(4, 2, 74, 6, 9);
        s(4, 2, 75, 6, 9);
        s(4, 2, 76, 6, 9);
        s(4, 2, 77, 6, 9);
        s(4, 2, 78, 6, 9);
        s(5, 2, 79, 6, 9);
        s(5, 2, 80, 6, 9);
        s(5, 2, 81, 6, 9);
        s(5, 2, 82, 6, 9);
        s(5, 2, 83, 6, 9);
        s(5, 2, 84, 6, 9);
        s(6, 2, 85, 6, 9);
        s(6, 2, 86, 6, 9);
        s(6, 2, 87, 6, 9);
        s(6, 2, 88, 6, 9);
        s(6, 2, 89, 6, 9);
        s(6, 2, 90, 6, 9);
        s(7, 2, 91, 6, 9);
        s(7, 2, 92, 6, 9);
        s(7, 2, 93, 6, 9);
        s(7, 2, 94, 6, 9);
        s(7, 2, 95, 6, 9);
        s(7, 2, 96, 6, 9);
        s(8, 2, 97, 6, 9);
        s(8, 2, 98, 6, 9);
        s(8, 2, 99, 6, 9);
        s(8, 2, 100, 6, 9);
        s(8, 2, 101, 6, 9);
        s(8, 2, 102, 6, 9);
        s(9, 2, 103, 6, 9);
        s(9, 2, 104, 6, 9);
        s(9, 2, 105, 6, 9);
        s(9, 2, 106, 6, 9);
        s(9, 2, 107, 6, 9);
        s(9, 2, 108, 6, 9);
    }

    private void s(int et, int pod, int n, int nA, int p) {
        testScenarios.add(new TestScenario(et + " этаж, " + pod + " подъезд.", n, nA, p));
    }

    private void s(int n, int nA, int p) {
        testScenarios.add(new TestScenario("Введены не корректные данные.", n, nA, p));
    }

    @Test
    public void start() {
        setUpScenarios();
        for (TestScenario tS : testScenarios) {
            assertEquals(tS.e, App.d(tS.apNum, tS.apps, tS.floors));
        }
        System.out.println(testScenarios.size());
    }
}