package task2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static task2.App.d;

public class AppTest {
    @Test
    public void startScenarios() {
        int min = 1;
        int max = Integer.MAX_VALUE;
        /////////////////////////////////////1 Граничные значения области определения.
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

        s(1, 1, max / 2, max, min);
        s(1073741823, 1, max / 2, min, max);
        //////////////////////////////////////2 Классы эквивалентности
        //////////////////////////////////////2.1 Границы классов эквивалентности
        s(1, 1, 1, 5, 3);
        s(1, 1, 5, 5, 3);

        s(2, 1, 6, 5, 3);
        s(2, 1, 10, 5, 3);

        s(3, 1, 11, 5, 3);
        s(3, 1, 15, 5, 3);

        s(1, 2, 16, 5, 3);
        s(1, 2, 20, 5, 3);

        s(2, 2, 21, 5, 3);
        s(2, 2, 25, 5, 3);

        s(3, 2, 26, 5, 3);
        s(3, 2, 30, 5, 3);

        s(1, 71582788, 1073741806, 5, 3);
        s(1, 71582788, 1073741810, 5, 3);

        s(2, 71582788, 1073741811, 5, 3);
        s(2, 71582788, 1073741815, 5, 3);

        s(3, 71582788, 1073741816, 5, 3);
        s(3, 71582788, 1073741820, 5, 3);

        s(1, 71582789, 1073741821, 5, 3);
        s(1, 71582789, 1073741825, 5, 3);

        s(2, 71582789, 1073741826, 5, 3);
        s(2, 71582789, 1073741830, 5, 3);

        s(3, 71582789, 1073741831, 5, 3);
        s(3, 71582789, 1073741835, 5, 3);

        s(1, 71582790, 1073741836, 5, 3);
        s(1, 71582790, 1073741840, 5, 3);

        s(2, 71582790, 1073741841, 5, 3);
        s(2, 71582790, 1073741845, 5, 3);

        s(3, 71582790, 1073741846, 5, 3);
        s(3, 71582790, 1073741850, 5, 3);

        s(1, 143165575, 2147483611, 5, 3);
        s(1, 143165575, 2147483615, 5, 3);

        s(2, 143165575, 2147483616, 5, 3);
        s(2, 143165575, 2147483620, 5, 3);

        s(3, 143165575, 2147483621, 5, 3);
        s(3, 143165575, 2147483625, 5, 3);

        s(1, 143165576, 2147483626, 5, 3);
        s(1, 143165576, 2147483630, 5, 3);

        s(2, 143165576, 2147483631, 5, 3);
        s(2, 143165576, 2147483635, 5, 3);

        s(3, 143165576, 2147483636, 5, 3);
        s(3, 143165576, 2147483640, 5, 3);

        s(1, 101, 1501, 5, 3);
        s(1, 101, 1505, 5, 3);

        s(2, 101, 1506, 5, 3);
        s(2, 101, 1510, 5, 3);

        s(3, 101, 1511, 5, 3);
        s(3, 101, 1515, 5, 3);


        s(1, 1, 1, min, min);
        s(1, 2, 2, min, min);

        s(1, 165584, 165584, min, min);

        s(1, 1073741822, 1073741822, min, min);
        s(1, 1073741823, 1073741823, min, min);
        s(1, 1073741824, 1073741824, min, min);

        s(1, 2147483646, 2147483646, min, min);
        s(1, 2147483647, 2147483647, min, min);


        s(1, 1, 1, min+1, min);
        s(1, 1, 2, min+1, min);
        s(1, 2, 3, min+1, min);
        s(1, 2, 4, min+1, min);

        s(1, 82792, 165584, min+1, min);

        s(1, 536870911, 1073741821, min+1, min);
        s(1, 536870911, 1073741822, min+1, min);
        s(1, 536870912, 1073741823, min+1, min);
        s(1, 536870912, 1073741824, min+1, min);

        s(1, 1073741822, 2147483644, min+1, min);
        s(1, 1073741823, 2147483645, min+1, min);
        s(1, 1073741823, 2147483646, min+1, min);
        s(1, 1073741824, 2147483647, min+1, min);


        s(1, 1, 1, min, min + 1);
        s(2, 1, 2, min, min + 1);
        s(1, 2, 3, min, min + 1);
        s(2, 2, 4, min, min + 1);

        s(2, 5000, 10000, min, min + 1);

        s(1, 536870911, 1073741821, min, min + 1);
        s(2, 536870911, 1073741822, min, min + 1);
        s(1, 536870912, 1073741823, min, min + 1);
        s(2, 536870912, 1073741824, min, min + 1);
        s(1, 536870913, 1073741825, min, min + 1);
        s(2, 536870913, 1073741826, min, min + 1);

        s(2, 1073741822, 2147483644, min, min + 1);
        s(1, 1073741823, 2147483645, min, min + 1);
        s(2, 1073741823, 2147483646, min, min + 1);
        s(1, 1073741824, 2147483647, min, min + 1);


        s(1, 1, 1, min, max);
        s(2, 1, 2, min, max);

        s(516161, 1, 516161, min, max);

        s(1073741822, 1, 1073741822, min, max);
        s(1073741823, 1, 1073741823, min, max);
        s(1073741824, 1, 1073741824, min, max);

        s(2147483646, 1, 2147483646, min, max);
        s(2147483647, 1, 2147483647, min, max);


        s(1, 1, 1, min + 1, max / 2);
        s(1, 1, 2, min + 1, max / 2);
        s(2, 1, 3, min + 1, max / 2);
        s(2, 1, 4, min + 1, max / 2);

        s(258080, 1, 516160, min + 1, max / 2);

        s(536870911, 1, 1073741821, min + 1, max / 2);
        s(536870911, 1, 1073741822, min + 1, max / 2);
        s(536870912, 1, 1073741823, min + 1, max / 2);
        s(536870912, 1, 1073741824, min + 1, max / 2);

        s(1073741822, 1, 2147483643, min + 1, max / 2);
        s(1073741822, 1, 2147483644, min + 1, max / 2);
        s(1073741823, 1, 2147483645, min + 1, max / 2);
        s(1073741823, 1, 2147483646, min + 1, max / 2);
        s(1, 2, 2147483647, min + 1, max / 2);


        s(1, 1, 1, min, max - 1);
        s(2, 1, 2, min, max - 1);

        s(516161, 1, 516161, min, max - 1);

        s(1073741822, 1, 1073741822, min, max - 1);
        s(1073741823, 1, 1073741823, min, max - 1);
        s(1073741824, 1, 1073741824, min, max - 1);

        s(2147483645, 1, 2147483645, min, max - 1);
        s(2147483646, 1, 2147483646, min, max - 1);
        s(1, 2, 2147483647, min, max - 1);


        s(1, 1, 1, max, min);
        s(1, 1, 2, max, min);

        s(1, 1, 7563756, max, min);

        s(1, 1, 1073741822, max, min);
        s(1, 1, 1073741823, max, min);
        s(1, 1, 1073741824, max, min);

        s(1, 1, 2147483646, max, min);
        s(1, 1, 2147483647, max, min);


        s(1, 1, 1, max / 2, min + 1);
        s(1, 1, 2, max / 2, min + 1);

        s(1, 1, 7563756, max / 2, min + 1);

        s(1, 1, 536870910, max / 2, min + 1);
        s(1, 1, 536870911, max / 2, min + 1);
        s(1, 1, 536870912, max / 2, min + 1);

        s(1, 1, 1073741822, max / 2, min + 1);
        s(1, 1, 1073741823, max / 2, min + 1);
        s(2, 1, 1073741824, max / 2, min + 1);

        s(2, 1, 1354534432, max / 2, min + 1);

        s(2, 1, 1610612733, max / 2, min + 1);
        s(2, 1, 1610612734, max / 2, min + 1);
        s(2, 1, 1610612735, max / 2, min + 1);

        s(2, 1, 2147483645, max / 2, min + 1);
        s(2, 1, 2147483646, max / 2, min + 1);
        s(1, 2, 2147483647, max / 2, min + 1);


        s(1, 1, 1, max - 1, min);
        s(1, 1, 2, max - 1, min);

        s(1, 1, 5787524, max - 1, min);

        s(1, 1, 1073741821, max - 1, min);
        s(1, 1, 1073741822, max - 1, min);
        s(1, 1, 1073741823, max - 1, min);

        s(1, 1, 2147483645, max - 1, min);
        s(1, 1, 2147483646, max - 1, min);
        s(1, 2, 2147483647, max - 1, min);


        s(1, 1, 1, 46340, 46341);
        s(1, 1, 2, 46340, 46341);
        s(1, 1, 4321, 46340, 46341);
        s(1, 1, 23170, 46340, 46341);
        s(1, 1, 46339, 46340, 46341);
        s(1, 1, 46340, 46340, 46341);

        s(2, 1, 46341, 46340, 46341);
        s(2, 1, 46342, 46340, 46341);
        s(2, 1, 69510, 46340, 46341);
        s(2, 1, 92679, 46340, 46341);
        s(2, 1, 92680, 46340, 46341);
        s(3, 1, 92681, 46340, 46341);


        s(23169, 1, 1073651460, 46340, 46341);
        s(23170, 1, 1073651461, 46340, 46341);
        s(23170, 1, 1073651462, 46340, 46341);

        s(23170, 1, 1073660000, 46340, 46341);

        s(23170, 1, 1073674630, 46340, 46341);
        s(23170, 1, 1073674631, 46340, 46341);
        s(23170, 1, 1073674632, 46340, 46341);

        s(23170, 1, 1073697799, 46340, 46341);
        s(23170, 1, 1073697800, 46340, 46341);
        s(23171, 1, 1073697801, 46340, 46341);

        s(46339, 1, 2147349260, 46340, 46341);
        s(46340, 1, 2147349261, 46340, 46341);
        s(46340, 1, 2147349262, 46340, 46341);

        s(46340, 1, 2147395599, 46340, 46341);
        s(46340, 1, 2147395600, 46340, 46341);
        s(46341, 1, 2147395601, 46340, 46341);
        s(46341, 1, 2147395602, 46340, 46341);

        s(46341, 1, 2147441939, 46340, 46341);
        s(46341, 1, 2147441940, 46340, 46341);
        s(1, 2, 2147441941, 46340, 46341);
        s(1, 2, 2147441942, 46340, 46341);
        s(1, 2, 2147450000, 46340, 46341);

        s(1, 2, 2147462793, 46340, 46341);
        s(1, 2, 2147462794, 46340, 46341);
        s(1, 2, 2147462795, 46340, 46341);

        s(1, 2, 2147483646, 46340, 46341);
        s(1, 2, 2147483647, 46340, 46341);


        s(1, 1, 1, 46341, 46340);
        s(1, 1, 2, 46341, 46340);
        s(1, 1, 4321, 46341, 46340);
        s(1, 1, 23170, 46341, 46340);
        s(1, 1, 46339, 46341, 46340);
        s(1, 1, 46341, 46341, 46340);

        s(2, 1, 46342, 46341, 46340);
        s(2, 1, 46343, 46341, 46340);
        s(2, 1, 69512, 46341, 46340);
        s(2, 1, 92681, 46341, 46340);
        s(2, 1, 92682, 46341, 46340);
        s(3, 1, 92683, 46341, 46340);


        s(23169, 1, 1073651460, 46341, 46340);
        s(23169, 1, 1073651461, 46341, 46340);
        s(23169, 1, 1073651462, 46341, 46340);

        s(23169, 1, 1073660000, 46341, 46340);

        s(23170, 1, 1073674630, 46341, 46340);
        s(23170, 1, 1073674631, 46341, 46340);
        s(23170, 1, 1073674632, 46341, 46340);

        s(23170, 1, 1073697799, 46341, 46340);
        s(23170, 1, 1073697800, 46341, 46340);
        s(23170, 1, 1073697801, 46341, 46340);

        s(46339, 1, 2147349260, 46341, 46340);
        s(46339, 1, 2147349261, 46341, 46340);
        s(46339, 1, 2147349262, 46341, 46340);

        s(46339, 1, 2147395599, 46341, 46340);
        s(46340, 1, 2147395600, 46341, 46340);
        s(46340, 1, 2147395601, 46341, 46340);
        s(46340, 1, 2147395602, 46341, 46340);

        s(46340, 1, 2147441939, 46341, 46340);
        s(46340, 1, 2147441940, 46341, 46340);
        s(1, 2, 2147441941, 46341, 46340);
        s(1, 2, 2147441942, 46341, 46340);
        s(1, 2, 2147450000, 46341, 46340);

        s(1, 2, 2147462793, 46341, 46340);
        s(1, 2, 2147462794, 46341, 46340);
        s(1, 2, 2147462795, 46341, 46340);

        s(1, 2, 2147483646, 46341, 46340);
        s(1, 2, 2147483647, 46341, 46340);


        ////////////////////////////////////////2.2 Впритык слева и справа от грацницы
        s(1, 1, 2, 5, 3);
        s(1, 1, 4, 5, 3);
        s(2, 1, 6, 5, 3);

        s(1, 1, 5, 5, 3);
        s(2, 1, 7, 5, 3);
        s(2, 1, 9, 5, 3);
        s(3, 1, 11, 5, 3);

        s(2, 1, 10, 5, 3);
        s(3, 1, 12, 5, 3);
        s(3, 1, 14, 5, 3);
        s(1, 2, 16, 5, 3);

        s(3, 1, 15, 5, 3);
        s(1, 2, 17, 5, 3);
        s(1, 2, 19, 5, 3);
        s(2, 2, 21, 5, 3);

        s(1, 2, 20, 5, 3);
        s(2, 2, 22, 5, 3);
        s(2, 2, 24, 5, 3);
        s(3, 2, 26, 5, 3);

        s(2, 2, 25, 5, 3);
        s(3, 2, 27, 5, 3);
        s(3, 2, 29, 5, 3);
        s(1, 3, 31, 5, 3);

        s(3, 71582787, 1073741805, 5, 3);
        s(1, 71582788, 1073741807, 5, 3);
        s(1, 71582788, 1073741809, 5, 3);
        s(2, 71582788, 1073741811, 5, 3);

        s(1, 71582788, 1073741810, 5, 3);
        s(2, 71582788, 1073741812, 5, 3);
        s(2, 71582788, 1073741814, 5, 3);
        s(3, 71582788, 1073741816, 5, 3);

        s(2, 71582788, 1073741815, 5, 3);
        s(3, 71582788, 1073741816, 5, 3);
        s(3, 71582788, 1073741819, 5, 3);
        s(1, 71582789, 1073741821, 5, 3);

        s(3, 71582788, 1073741820, 5, 3);
        s(1, 71582789, 1073741821, 5, 3);
        s(1, 71582789, 1073741824, 5, 3);
        s(2, 71582789, 1073741826, 5, 3);

        s(1, 71582789, 1073741825, 5, 3);
        s(2, 71582789, 1073741827, 5, 3);
        s(2, 71582789, 1073741829, 5, 3);
        s(3, 71582789, 1073741831, 5, 3);

        s(2, 71582789, 1073741830, 5, 3);
        s(3, 71582789, 1073741832, 5, 3);
        s(3, 71582789, 1073741834, 5, 3);
        s(1, 71582790, 1073741836, 5, 3);

        s(3, 71582789, 1073741835, 5, 3);
        s(1, 71582790, 1073741837, 5, 3);
        s(1, 71582790, 1073741839, 5, 3);
        s(2, 71582790, 1073741841, 5, 3);

        s(1, 71582790, 1073741840, 5, 3);
        s(2, 71582790, 1073741842, 5, 3);
        s(2, 71582790, 1073741844, 5, 3);
        s(3, 71582790, 1073741846, 5, 3);

        s(2, 71582790, 1073741845, 5, 3);
        s(3, 71582790, 1073741847, 5, 3);
        s(3, 71582790, 1073741849, 5, 3);
        s(1, 71582791, 1073741851, 5, 3);

        s(3, 143165574, 2147483610, 5, 3);
        s(1, 143165575, 2147483612, 5, 3);
        s(1, 143165575, 2147483614, 5, 3);
        s(2, 143165575, 2147483619, 5, 3);

        s(1, 143165575, 2147483615, 5, 3);
        s(2, 143165575, 2147483617, 5, 3);
        s(2, 143165575, 2147483619, 5, 3);
        s(3, 143165575, 2147483621, 5, 3);

        s(2, 143165575, 2147483620, 5, 3);
        s(3, 143165575, 2147483622, 5, 3);
        s(3, 143165575, 2147483624, 5, 3);
        s(1, 143165576, 2147483626, 5, 3);

        s(3, 143165575, 2147483625, 5, 3);
        s(1, 143165576, 2147483627, 5, 3);
        s(1, 143165576, 2147483629, 5, 3);
        s(2, 143165576, 2147483631, 5, 3);

        s(1, 143165576, 2147483630, 5, 3);
        s(2, 143165576, 2147483632, 5, 3);
        s(2, 143165576, 2147483634, 5, 3);
        s(3, 143165576, 2147483636, 5, 3);

        s(2, 143165576, 2147483635, 5, 3);
        s(3, 143165576, 2147483637, 5, 3);
        s(3, 143165576, 2147483639, 5, 3);
        s(1, 143165577, 2147483641, 5, 3);

        s(3, 100, 1500, 5, 3);
        s(1, 101, 1501, 5, 3);
        s(1, 101, 1504, 5, 3);
        s(2, 101, 1506, 5, 3);

        s(1, 101, 1505, 5, 3);
        s(2, 101, 1507, 5, 3);
        s(2, 101, 1509, 5, 3);
        s(3, 101, 1511, 5, 3);

        s(2, 101, 1510, 5, 3);
        s(3, 101, 1512, 5, 3);
        s(3, 101, 1514, 5, 3);
        s(1, 102, 1516, 5, 3);


        ////////////////////////////////////////2.3 Внутри класса эквивалентности
        s(1, 1, 3, 5, 3);
        s(2, 1, 8, 5, 3);
        s(3, 1, 13, 5, 3);

        s(1, 2, 18, 5, 3);
        s(2, 2, 25, 5, 3);
        s(3, 2, 28, 5, 3);

        s(1, 71582788, 1073741808, 5, 3);
        s(2, 71582788, 1073741813, 5, 3);
        s(3, 71582788, 1073741818, 5, 3);

        s(1, 71582789, 1073741823, 5, 3);
        s(2, 71582789, 1073741828, 5, 3);
        s(3, 71582789, 1073741833, 5, 3);

        s(1, 71582790, 1073741838, 5, 3);
        s(2, 71582790, 1073741843, 5, 3);
        s(3, 71582790, 1073741848, 5, 3);

        s(1, 143165575, 2147483613, 5, 3);
        s(2, 143165575, 2147483618, 5, 3);
        s(3, 143165575, 2147483623, 5, 3);

        s(1, 143165576, 2147483628, 5, 3);
        s(2, 143165576, 2147483633, 5, 3);
        s(3, 143165576, 2147483638, 5, 3);

        s(1, 101, 1503, 5, 3);
        s(2, 101, 1508, 5, 3);
        s(3, 101, 1513, 5, 3);

        s(1, 1, 4, 5, 3);
        s(2, 1, 10, 5, 3);
        s(1, 100, 1490, 5, 3);


        ////////////////////////////////////////3. Предметная область
        s(1, 1, 1, 4, 9);
        s(1, 1, 2, 4, 9);
        s(1, 1, 3, 4, 9);
        s(1, 1, 4, 4, 9);
        s(2, 1, 5, 4, 9);

        s(4, 1, 16, 4, 9);
        s(5, 1, 17, 4, 9);
        s(5, 1, 18, 4, 9);
        s(5, 1, 19, 4, 9);
        s(5, 1, 20, 4, 9);
        s(6, 1, 21, 4, 9);

        s(8, 1, 32, 4, 9);
        s(9, 1, 33, 4, 9);
        s(9, 1, 34, 4, 9);
        s(9, 1, 35, 4, 9);
        s(9, 1, 36, 4, 9);
        s(1, 2, 37, 4, 9);

        s(9, 4, 144, 4, 9);
        s(1, 5, 145, 4, 9);
        s(1, 5, 146, 4, 9);
        s(1, 5, 147, 4, 9);
        s(1, 5, 148, 4, 9);
        s(2, 5, 149, 4, 9);

        s(4, 5, 160, 4, 9);
        s(5, 5, 161, 4, 9);
        s(5, 5, 162, 4, 9);
        s(5, 5, 163, 4, 9);
        s(5, 5, 164, 4, 9);
        s(6, 5, 165, 4, 9);

        s(8, 5, 176, 4, 9);
        s(9, 5, 177, 4, 9);
        s(9, 5, 178, 4, 9);
        s(9, 5, 179, 4, 9);
        s(9, 5, 180, 4, 9);
        s(1, 6, 181, 4, 9);

        s(9, 9, 324, 4, 9);
        s(1, 10, 325, 4, 9);
        s(1, 10, 326, 4, 9);
        s(1, 10, 327, 4, 9);
        s(1, 10, 328, 4, 9);
        s(2, 10, 329, 4, 9);

        s(4, 10, 340, 4, 9);
        s(5, 10, 341, 4, 9);
        s(5, 10, 342, 4, 9);
        s(5, 10, 343, 4, 9);
        s(5, 10, 344, 4, 9);
        s(6, 10, 345, 4, 9);

        s(8, 10, 356, 4, 9);
        s(9, 10, 357, 4, 9);
        s(9, 10, 358, 4, 9);
        s(9, 10, 359, 4, 9);
        s(9, 10, 360, 4, 9);
        s(1, 11, 361, 4, 9);


        s(1, 1, 1, 3, 5);
        s(1, 1, 2, 3, 5);
        s(1, 1, 3, 3, 5);
        s(2, 1, 4, 3, 5);

        s(2, 1, 6, 3, 5);
        s(3, 1, 7, 3, 5);
        s(3, 1, 8, 3, 5);
        s(3, 1, 9, 3, 5);
        s(4, 1, 10, 3, 5);

        s(4, 1, 12, 3, 5);
        s(5, 1, 13, 3, 5);
        s(5, 1, 14, 3, 5);
        s(5, 1, 15, 3, 5);
        s(1, 2, 16, 3, 5);

        s(5, 2, 30, 3, 5);
        s(1, 3, 31, 3, 5);
        s(1, 3, 32, 3, 5);
        s(1, 3, 33, 3, 5);
        s(2, 3, 34, 3, 5);

        s(2, 3, 36, 3, 5);
        s(3, 3, 37, 3, 5);
        s(3, 3, 38, 3, 5);
        s(3, 3, 39, 3, 5);
        s(4, 3, 40, 3, 5);

        s(4, 3, 42, 3, 5);
        s(5, 3, 43, 3, 5);
        s(5, 3, 44, 3, 5);
        s(5, 3, 45, 3, 5);
        s(1, 4, 46, 3, 5);

        s(5, 4, 60, 3, 5);
        s(1, 5, 61, 3, 5);
        s(1, 5, 62, 3, 5);
        s(1, 5, 63, 3, 5);
        s(2, 5, 64, 3, 5);

        s(5, 4, 60, 3, 5);
        s(1, 5, 61, 3, 5);
        s(1, 5, 62, 3, 5);
        s(1, 5, 63, 3, 5);
        s(2, 5, 64, 3, 5);

        s(2, 5, 66, 3, 5);
        s(3, 5, 67, 3, 5);
        s(3, 5, 68, 3, 5);
        s(3, 5, 69, 3, 5);
        s(4, 5, 70, 3, 5);

        s(4, 5, 72, 3, 5);
        s(5, 5, 73, 3, 5);
        s(5, 5, 74, 3, 5);
        s(5, 5, 75, 3, 5);
        s(1, 6, 76, 3, 5);

        ////////////////////////////////////////4. Реализация
        s(min, max, min + 1);
        s(max, min + 1, max);

        s(min, max, max);
        s(max, max, max);

        s(min, min, 0);
        s(min, 0, min);
        s(0, min, min);

        s(max, max, 0);
        s(max, 0, max);
        s(0, max, max);

        s(min, 46341, 46341);
        s(max, 46341, 46341);

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

        s(1, 143165577, 2147483642, 5, 3);
        s(1, 143165577, 2147483643, 5, 3);
        s(1, 143165577, 2147483644, 5, 3);
        s(1, 143165577, 2147483645, 5, 3);
        s(2, 143165577, 2147483646, 5, 3);
        s(2, 143165577, 2147483647, 5, 3);
    }

    private void s(int et, int pod, int n, int nA, int p) {
        assertEquals(et + " этаж, " + pod + " подъезд.", d(n, nA, p));
    }

    private void s(int n, int nA, int p) {
        assertEquals("Введены не корректные данные.", d(n, nA, p));
    }
}