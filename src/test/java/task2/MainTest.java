package task2;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MainTest {
    //////////////////////////////////// Мин/маск значения аргументов
    @Test
    public void minIntValue1() { assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(Integer.MIN_VALUE, 1, 1)); }
    @Test
    public void minIntValue2() { assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(1, Integer.MIN_VALUE, 1)); }
    @Test
    public void minIntValue3() { assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(1, 1, Integer.MIN_VALUE)); }
    @Test
    public void maxIntValue1() { assertEquals("1 этаж, 2147483647 подъезд.", Main.determinateEntranceAndFloor(Integer.MAX_VALUE, 1, 1)); }
    @Test
    public void maxIntValue2() { assertEquals("1 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(1, Integer.MAX_VALUE, 1)); }
    @Test
    public void maxIntValue3() { assertEquals("1 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(1, 1, Integer.MAX_VALUE)); }
    @Test
    public void twoMinIntValue1() { assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(Integer.MIN_VALUE, Integer.MIN_VALUE, 1)); }
    @Test
    public void twoMinIntValue2() { assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(1, Integer.MIN_VALUE, Integer.MIN_VALUE)); }
    @Test
    public void twoMinIntValue3() { assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(Integer.MIN_VALUE, 1, Integer.MIN_VALUE)); }
    @Test
    public void twoMaxIntValue1() { assertEquals("1 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(Integer.MAX_VALUE, Integer.MAX_VALUE, 1)); }
    @Test
    public void twoMaxIntValue2() { assertEquals("1 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(1, Integer.MAX_VALUE, Integer.MAX_VALUE)); }
    @Test
    public void twoMaxIntValue3() { assertEquals("2147483647 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(Integer.MAX_VALUE, 1, Integer.MAX_VALUE));}
    @Test
    public void treeMinIntValue1() { assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE)); }
    @Test
    public void treeMaxIntValue1() { assertEquals("1 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)); }
    ////////////////////////////////////////Классы эквивалентности
    ///////////////////////////////////////////////// Класс этаж
    @Test
    public void floorClassFirstApAtFloorLeftBorderStep() { assertEquals("1 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(10, 10, 10)); }
    @Test
    public void floorClassFirstApAtFloor() { assertEquals("2 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(11, 10, 10)); }
    @Test
    public void floorClassFirstApAtFloorRightBorderStep() { assertEquals("2 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(12, 10, 10)); }
    @Test
    public void floorClassInternalTests1() { assertEquals("2 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(13, 10, 10)); }
    @Test
    public void floorClassInternalTests2() { assertEquals("2 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(14, 10, 10)); }
    @Test
    public void floorClassInternalTests3() { assertEquals("2 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(15, 10, 10)); }
    @Test
    public void floorClassInternalTests4() { assertEquals("2 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(16, 10, 10)); }
    @Test
    public void floorClassInternalTests5() { assertEquals("2 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(17, 10, 10)); }
    @Test
    public void floorClassInternalTests6() { assertEquals("2 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(18, 10, 10)); }
    @Test
    public void floorClassLastApLeftBorderStep() { assertEquals("2 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(19, 10, 10)); }
    @Test
    public void floorClassLastAp() {
        assertEquals("2 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(20, 10, 10));
    }
    @Test
    public void floorClassLastApRightBorderStep() { assertEquals("3 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(21, 10, 10)); }
    ///////////////////////////////////////////////// Класс подъезд
    @Test
    public void entranceClassFirstApAtEntranceLeftBorderStep() { assertEquals("10 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(100, 10, 10)); }
    @Test
    public void entranceClassFirstApAtEntrance() { assertEquals("1 этаж, 2 подъезд.", Main.determinateEntranceAndFloor(101, 10, 10)); }
    @Test
    public void entranceClassFirstApAtEntranceRightBorderStep() { assertEquals("1 этаж, 2 подъезд.", Main.determinateEntranceAndFloor(102, 10, 10)); }
    @Test
    public void entranceClassInternalTests1() { assertEquals("2 этаж, 2 подъезд.", Main.determinateEntranceAndFloor(111, 10, 10)); }
    @Test
    public void entranceClassInternalTests2() { assertEquals("3 этаж, 2 подъезд.", Main.determinateEntranceAndFloor(125, 10, 10)); }
    @Test
    public void entranceClassInternalTests3() { assertEquals("4 этаж, 2 подъезд.", Main.determinateEntranceAndFloor(135, 10, 10)); }
    @Test
    public void entranceClassInternalTests4() { assertEquals("5 этаж, 2 подъезд.", Main.determinateEntranceAndFloor(146, 10, 10)); }
    @Test
    public void entranceClassInternalTests5() { assertEquals("6 этаж, 2 подъезд.", Main.determinateEntranceAndFloor(157, 10, 10)); }
    @Test
    public void entranceClassInternalTests6() { assertEquals("7 этаж, 2 подъезд.", Main.determinateEntranceAndFloor(168, 10, 10)); }
    @Test
    public void entranceClassInternalTests7() { assertEquals("8 этаж, 2 подъезд.", Main.determinateEntranceAndFloor(178, 10, 10)); }
    @Test
    public void entranceClassInternalTests8() { assertEquals("9 этаж, 2 подъезд.", Main.determinateEntranceAndFloor(188, 10, 10)); }
    @Test
    public void entranceClassLastApAtEntranceLeftBorderStep() { assertEquals("10 этаж, 2 подъезд.", Main.determinateEntranceAndFloor(199, 10, 10)); }
    @Test
    public void entranceClassLastApAtEntrance() { assertEquals("10 этаж, 2 подъезд.", Main.determinateEntranceAndFloor(200, 10, 10)); }
    @Test
    public void entranceClassLastApAtEntranceRightBorderStep() { assertEquals("1 этаж, 3 подъезд.", Main.determinateEntranceAndFloor(201, 10, 10)); }
    ////////////////////////////////////////Реализация
    @Test
    public void overstepping1() { assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(0, 1, 1)); }
    @Test
    public void overstepping2() { assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(1, 0, 1)); }
    @Test
    public void overstepping3() { assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(1, 1, 0)); }
    @Test
    public void overstepping11() { assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(-1, 1, 1)); }
    @Test
    public void overstepping22() { assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(1, -1, 1)); }
    @Test
    public void overstepping33() { assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(1, 1, -1)); }
    ///////////////////////////////////////Случайные значения
    @Test
    public void randomTest1() {
        assertEquals("3 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(15, 6, 9));
    }
    @Test
    public void randomTest2() {
        assertEquals("2 этаж, 4 подъезд.", Main.determinateEntranceAndFloor(113, 4, 9));
    }
    @Test
    public void randomTest3() {
        assertEquals("1 этаж, 3 подъезд.", Main.determinateEntranceAndFloor(44, 4, 5));
    }
    @Test
    public void randomTest4() {
        assertEquals("5 этаж, 2 подъезд.", Main.determinateEntranceAndFloor(56, 4, 9));
    }
    @Test
    public void randomTest5() {
        assertEquals("9 этаж, 9 подъезд.", Main.determinateEntranceAndFloor(322, 4, 9));
    }
}