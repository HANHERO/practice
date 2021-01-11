package task5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    //////////////////////////////////Мин/макс аргументы
    @Test
    public void minArg1() {
        assertEquals("День недели должен быть в пределе 1-7",
                Main.findDayOfWeek(Integer.MIN_VALUE, 1, 1));
    }

    @Test
    public void minArg2() {
        assertEquals("Искомый день должен быть не меньше 1 и не больше числа дней в заданном месяце",
                Main.findDayOfWeek(1, Integer.MIN_VALUE, 1));
    }

    @Test
    public void minArg3() {
        assertEquals("Месяц должен быть в пределе 1-12",
                Main.findDayOfWeek(1, 1, Integer.MIN_VALUE));
    }

    @Test
    public void maxArg1() {
        assertEquals("День недели должен быть в пределе 1-7",
                Main.findDayOfWeek(Integer.MAX_VALUE, 1, 1));
    }

    @Test
    public void maxArg2() {
        assertEquals("Искомый день должен быть не меньше 1 и не больше числа дней в заданном месяце",
                Main.findDayOfWeek(1, Integer.MAX_VALUE, 1));
    }
    @Test
    public void maxArg3() {
        assertEquals("Месяц должен быть в пределе 1-12",
                Main.findDayOfWeek(1, 1, Integer.MAX_VALUE));
    }

    //////////////////////////////////Классы эквивалентности
    //////////////////////////////////Класс неделя
    @Test
    public void weekClassBeforeFirstDay(){
        assertEquals("Воскресенье", Main.findDayOfWeek(1,7,1));
    }
    @Test
    public void weekClassFirstDay(){
        assertEquals("Понедельник", Main.findDayOfWeek(1,8,1));
    }
    @Test
    public void weekClassAfterFirstDay(){
        assertEquals("Вторник", Main.findDayOfWeek(1,9,1));
    }
    @Test
    public void weekClassRandomDayOfWeek1(){
        assertEquals("Среда", Main.findDayOfWeek(1,10,1));
    }
    @Test
    public void weekClassRandomDayOfWeek2(){
        assertEquals("Четверг", Main.findDayOfWeek(1,11,1));
    }
    @Test
    public void weekClassRandomDayOfWeek3(){
        assertEquals("Пятница", Main.findDayOfWeek(1,12,1));
    }
    @Test
    public void weekClassBeforeLastDay(){
        assertEquals("Суббота", Main.findDayOfWeek(1,13,1));
    }
    @Test
    public void weekClassLastDay(){
        assertEquals("Воскресенье", Main.findDayOfWeek(1,14,1));
    }
    @Test
    public void weekClassAfterLastDay(){
        assertEquals("Понедельник", Main.findDayOfWeek(1,15,1));
    }


    //////////////////////////////////Класс месяц
    @Test
    public void monthClassBeforeFirstDay(){
        assertEquals("Среда", Main.findDayOfWeek(1,31,1));
    }
    @Test
    public void monthClassFirstDay(){
        assertEquals("Четверг", Main.findDayOfWeek(1,1,2));
    }
    @Test
    public void monthClassAfterFirstDay(){
        assertEquals("Пятница", Main.findDayOfWeek(1,2,2));
    }
    @Test
    public void monthClassRandomDayOfWeek1(){
        assertEquals("Понедельник", Main.findDayOfWeek(1,5,2));
    }
    @Test
    public void monthClassRandomDayOfWeek2(){
        assertEquals("Четверг", Main.findDayOfWeek(1,15,2));
    }
    @Test
    public void monthClassRandomDayOfWeek3(){
        assertEquals("Воскресенье", Main.findDayOfWeek(1,25,2));
    }
    @Test
    public void monthClassBeforeLastDay(){
        assertEquals("Вторник", Main.findDayOfWeek(1,27,2));
    }
    @Test
    public void monthClassLastDay(){
        assertEquals("Среда", Main.findDayOfWeek(1,28,2));
    }
    @Test
    public void monthClassAfterLastDay(){
        assertEquals("Четверг", Main.findDayOfWeek(1,1,3));
    }

    //////////////////////////////////Уникальные значения
    @Test
    public void lastDayOfYear1(){
        assertEquals("Понедельник", Main.findDayOfWeek(1,31,12));
    }
    @Test
    public void lastDayOfYear2(){
        assertEquals("Вторник", Main.findDayOfWeek(2,31,12));
    }
    @Test
    public void lastDayOfYear3(){
        assertEquals("Среда", Main.findDayOfWeek(3,31,12));
    }
    @Test
    public void lastDayOfYear4(){
        assertEquals("Четверг", Main.findDayOfWeek(4,31,12));
    }
    @Test
    public void lastDayOfYear5(){
        assertEquals("Пятница", Main.findDayOfWeek(5,31,12));
    }
    @Test
    public void lastDayOfYear6(){
        assertEquals("Суббота", Main.findDayOfWeek(6,31,12));
    }
    @Test
    public void lastDayOfYear7(){
        assertEquals("Воскресенье", Main.findDayOfWeek(7,31,12));
    }

    @Test
    public void firstDayOfYear1(){
        assertEquals("Понедельник", Main.findDayOfWeek(1,1,1));
    }
    @Test
    public void fromFirstDayToLastDayOfYear2(){
        assertEquals("Вторник", Main.findDayOfWeek(2,1,1));
    }
    @Test
    public void fromFirstDayToLastDayOfYear3(){
        assertEquals("Среда", Main.findDayOfWeek(3,1,1));
    }
    @Test
    public void fromFirstDayToLastDayOfYear4(){
        assertEquals("Четверг", Main.findDayOfWeek(4,1,1));
    }
    @Test
    public void fromFirstDayToLastDayOfYear5(){
        assertEquals("Пятница", Main.findDayOfWeek(5,1,1));
    }
    @Test
    public void fromFirstDayToLastDayOfYear6(){
        assertEquals("Суббота", Main.findDayOfWeek(6,1,1));
    }
    @Test
    public void fromFirstDayToLastDayOfYear7(){
        assertEquals("Воскресенье", Main.findDayOfWeek(7,1,1));
    }


    //////////////////////////////////Случайные тесты
    @Test
    public void findDayOfWeekTest1() {
        assertEquals("Четверг", Main.findDayOfWeek(3, 17, 7));
    }

    @Test
    public void findDayOfWeekTest2() {
        assertEquals("Суббота", Main.findDayOfWeek(5, 17, 7));
    }

    @Test
    public void findDayOfWeekTest3() {
        assertEquals("Суббота", Main.findDayOfWeek(2, 21, 12));
    }

    @Test
    public void findDayOfWeekTest4() {
        assertEquals("Четверг", Main.findDayOfWeek(1, 15, 3));
    }

    @Test
    public void findDayOfWeekTest5() {
        assertEquals("Понедельник", Main.findDayOfWeek(4, 17, 8));
    }

    @Test
    public void findDayOfWeekTest6() {
        assertEquals("Вторник", Main.findDayOfWeek(6, 4, 1));
    }

    @Test
    public void findDayOfWeekTest7() {
        assertEquals("Воскресенье", Main.findDayOfWeek(7, 19, 2));
    }

    @Test
    public void findDayOfWeekTest8() {
        assertEquals("Понедельник", Main.findDayOfWeek(6, 6, 6));
    }

    @Test
    public void findDayOfWeekTest9() {
        assertEquals("Понедельник", Main.findDayOfWeek(1, 31, 12));
    }

    @Test
    public void findDayOfWeekTest10() {
        assertEquals("Воскресенье", Main.findDayOfWeek(7, 31, 12));
    }
}