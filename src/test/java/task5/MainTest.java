package task5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static task5.Main.findDay;

public class MainTest {
    private final String pn = "Понедельник";
    private final String vt = "Вторник";
    private final String sr = "Среда";
    private final String ch = "Четверг";
    private final String pt = "Пятница";
    private final String sb = "Суббота";
    private final String vs = "Воскресенье";
    //////////////////////////////////1. Минмальные/максимальные аргументы
    @Test public void minMax1() { assertEquals(pn, findDay(1, 1, 1)); }
    @Test public void minMax2() { assertEquals(sb, findDay(1, 1, 12)); }
    @Test public void minMax3() { assertEquals(sr, findDay(1, 31, 1)); }
    @Test public void minMax4() { assertEquals(pn, findDay(1, 31, 12)); }
    @Test public void minMax5() { assertEquals(vs, findDay(7, 1, 1)); }
    @Test public void minMax6() { assertEquals(pt, findDay(7, 1, 12)); }
    @Test public void minMax7() { assertEquals(vt, findDay(7, 31, 1)); }
    @Test public void minMax8() { assertEquals(vs, findDay(7, 31, 12)); }
    //////////////////////////////////2. Классы эквивалентности
    //////////////////////////////////2.1 Границы классов эквивалентности
    @Test public void weekClassFirstDay(){ assertEquals(pn, findDay(1,8,1)); }
    @Test public void weekClassLastDay(){ assertEquals(vs, findDay(1,14,1)); }

    @Test public void monthClassFirstDay(){ assertEquals(ch, findDay(1,1,2)); }
    @Test public void monthClassLastDay(){ assertEquals(sr, findDay(1,28,2)); }
    //////////////////////////////////2.2 Впритык слева и справа от границы
    @Test public void weekClassBeforeFirstDay(){ assertEquals(vs, findDay(1,7,1)); }
    @Test public void weekClassAfterFirstDay(){ assertEquals(vt, findDay(1,9,1)); }
    @Test public void weekClassBeforeLastDay(){ assertEquals(sb, findDay(1,13,1)); }
    @Test public void weekClassAfterLastDay(){ assertEquals(pn, findDay(1,15,1)); }

    @Test public void monthClassBeforeFirstDay(){ assertEquals(sr, findDay(1,31,1)); }
    @Test public void monthClassAfterFirstDay(){ assertEquals(pt, findDay(1,2,2)); }
    @Test public void monthClassBeforeLastDay(){ assertEquals(vt, findDay(1,27,2)); }
    @Test public void monthClassAfterLastDay(){ assertEquals(ch, findDay(1,1,3)); }
    //////////////////////////////////2.3 Внутри класса эквивалентности
    @Test public void weekClassRandomDayOfWeek1(){ assertEquals(sr, findDay(1,10,1)); }
    @Test public void weekClassRandomDayOfWeek2(){ assertEquals(ch, findDay(1,11,1)); }
    @Test public void weekClassRandomDayOfWeek3(){ assertEquals(pt, findDay(1,12,1)); }

    @Test public void monthClassRandomDayOfWeek1(){ assertEquals(pn, findDay(1,5,2)); }
    @Test public void monthClassRandomDayOfWeek2(){ assertEquals(ch, findDay(1,15,2)); }
    @Test public void monthClassRandomDayOfWeek3(){ assertEquals(vs, findDay(1,25,2)); }
    //////////////////////////////////3. Предметная область
    @Test public void findDayOfBirthday() { assertEquals(pn, findDay(5, 15, 3)); }
    @Test public void findFirstDaySummer() { assertEquals(vt, findDay(5, 1, 6)); }
    @Test public void findLastDayOfYear() { assertEquals(pt, findDay(5, 31, 12)); }
    //////////////////////////////////4. Реализация

    //////////////////////////////////5. Случайные тесты
    @Test public void findDayOfWeekTest1() { assertEquals(ch, findDay(3, 17, 7)); }
    @Test public void findDayOfWeekTest2() { assertEquals(sb, findDay(5, 17, 7)); }
    @Test public void findDayOfWeekTest3() { assertEquals(sb, findDay(2, 21, 12)); }
    @Test public void findDayOfWeekTest4() { assertEquals(ch, findDay(1, 15, 3)); }
    @Test public void findDayOfWeekTest5() { assertEquals(pn, findDay(4, 17, 8)); }
    @Test public void findDayOfWeekTest6() { assertEquals(vt, findDay(6, 4, 1)); }
    @Test public void findDayOfWeekTest10() { assertEquals(vs, findDay(7, 31, 12)); }
    @Test public void findDayOfWeekTest11() { assertEquals(sr, findDay(4, 11, 2)); }
    @Test public void findDayOfWeekTest12() { assertEquals(pn, findDay(1, 12, 2)); }
    @Test public void findDayOfWeekTest13() { assertEquals(sb, findDay(2, 23, 3)); }
    @Test public void findDayOfWeekTest14() { assertEquals(pn, findDay(6, 11, 4)); }
    @Test public void findDayOfWeekTest15() { assertEquals(sr, findDay(4, 17, 6)); }
    @Test public void findDayOfWeekTest16() { assertEquals(pt, findDay(6, 4, 3)); }
    @Test public void findDayOfWeekTest17() { assertEquals(vs, findDay(7, 31, 12)); }
    @Test public void findDayOfWeekTest18() { assertEquals(pt, findDay(3, 21, 2)); }
    @Test public void findDayOfWeekTest19() { assertEquals(sb, findDay(5, 17, 4)); }
    @Test public void findDayOfWeekTest20() { assertEquals(ch, findDay(2, 24, 1)); }
    @Test public void findDayOfWeekTest21() { assertEquals(sr, findDay(1, 15, 8)); }
    @Test public void findDayOfWeekTest22() { assertEquals(ch, findDay(4, 17, 9)); }
    @Test public void findDayOfWeekTest23() { assertEquals(vt, findDay(6, 4, 10)); }
    @Test public void findDayOfWeekTest24() { assertEquals(ch, findDay(7, 30, 11)); }
    @Test public void findDayOfWeekTest25() { assertEquals(ch, findDay(3, 17, 4)); }
    @Test public void findDayOfWeekTest26() { assertEquals(ch, findDay(5, 11, 2)); }
    @Test public void findDayOfWeekTest27() { assertEquals(sr, findDay(2, 21, 8)); }
    @Test public void findDayOfWeekTest28() { assertEquals(pt, findDay(1, 14, 9)); }
    @Test public void findDayOfWeekTest29() { assertEquals(sb, findDay(4, 17, 10)); }
    @Test public void findDayOfWeekTest30() { assertEquals(sr, findDay(6, 2, 11)); }
    //////////////////////////////////6. Особые значения
    @Test public void lastDayOfYear1(){assertEquals(pn, findDay(1,31,12)); }
    @Test public void lastDayOfYear2(){ assertEquals(vt, findDay(2,31,12)); }
    @Test public void lastDayOfYear3(){ assertEquals(sr, findDay(3,31,12)); }
    @Test public void lastDayOfYear4(){ assertEquals(ch, findDay(4,31,12)); }
    @Test public void lastDayOfYear5(){ assertEquals(pt, findDay(5,31,12)); }
    @Test public void lastDayOfYear6(){ assertEquals(sb, findDay(6,31,12)); }
    @Test public void lastDayOfYear7(){ assertEquals(vs, findDay(7,31,12)); }
    @Test public void firstDayOfYear1(){ assertEquals(pn, findDay(1,1,1)); }
    @Test public void fromFirstDayToLastDayOfYear2(){ assertEquals(vt, findDay(2,1,1)); }
    @Test public void fromFirstDayToLastDayOfYear3(){ assertEquals(sr, findDay(3,1,1)); }
    @Test public void fromFirstDayToLastDayOfYear4(){ assertEquals(ch, findDay(4,1,1)); }
    @Test public void fromFirstDayToLastDayOfYear5(){ assertEquals(pt, findDay(5,1,1)); }
    @Test public void fromFirstDayToLastDayOfYear6(){ assertEquals(sb, findDay(6,1,1)); }
    @Test public void fromFirstDayToLastDayOfYear7(){ assertEquals(vs, findDay(7,1,1)); }
}