package task2;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MainTest {
    ///////////////////////////////////////1. Минимальное/максимальное значение аргументов
    @Test public void minIntValue1() { assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(Integer.MIN_VALUE, 1, 1)); }
    @Test public void minIntValue2() { assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(1, Integer.MIN_VALUE, 1)); }
    @Test public void minIntValue3() { assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(1, 1, Integer.MIN_VALUE)); }
    @Test public void maxIntValue1() { assertEquals("1 этаж, 2147483647 подъезд.", Main.determinateEntranceAndFloor(Integer.MAX_VALUE, 1, 1)); }
    @Test public void maxIntValue2() { assertEquals("1 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(1, Integer.MAX_VALUE, 1)); }
    @Test public void maxIntValue3() { assertEquals("1 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(1, 1, Integer.MAX_VALUE)); }
    @Test public void twoMinIntValue1() { assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(Integer.MIN_VALUE, Integer.MIN_VALUE, 1)); }
    @Test public void twoMinIntValue2() { assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(1, Integer.MIN_VALUE, Integer.MIN_VALUE)); }
    @Test public void twoMinIntValue3() { assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(Integer.MIN_VALUE, 1, Integer.MIN_VALUE)); }
    @Test public void twoMaxIntValue1() { assertEquals("1 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(Integer.MAX_VALUE, Integer.MAX_VALUE, 1)); }
    @Test public void twoMaxIntValue2() { assertEquals("1 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(1, Integer.MAX_VALUE, Integer.MAX_VALUE)); }
    @Test public void twoMaxIntValue3() { assertEquals("2147483647 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(Integer.MAX_VALUE, 1, Integer.MAX_VALUE));}
    @Test public void treeMinIntValue1() { assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE)); }
    @Test public void treeMaxIntValue1() { assertEquals("1 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)); }
    ////////////////////////////////////////2.Классы эквивалентности
    ////////////////////////////////////////2.1 Границы классов эквивалентности
    @Test public void floorClassFirstApAtFloor() { assertEquals("2 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(11, 10, 10));}
    @Test public void floorClassLastAp() { assertEquals("2 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(20, 10, 10)); }

    @Test public void entranceClassFirstApAtEntrance() { assertEquals("1 этаж, 2 подъезд.", Main.determinateEntranceAndFloor(101, 10, 10)); }
    @Test public void entranceClassLastApAtEntrance() { assertEquals("10 этаж, 2 подъезд.", Main.determinateEntranceAndFloor(200, 10, 10)); }
    ////////////////////////////////////////2.2 Впритык слева и справа от грацницы
    @Test public void floorClassFirstApAtFloorLeftBorderStep() { assertEquals("1 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(10, 10, 10)); }
    @Test public void floorClassFirstApAtFloorRightBorderStep() { assertEquals("2 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(12, 10, 10)); }
    @Test public void floorClassLastApLeftBorderStep() { assertEquals("2 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(19, 10, 10)); }
    @Test public void floorClassLastApRightBorderStep() { assertEquals("3 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(21, 10, 10)); }

    @Test public void entranceClassFirstApAtEntranceLeftBorderStep() { assertEquals("10 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(100, 10, 10)); }
    @Test public void entranceClassFirstApAtEntranceRightBorderStep() { assertEquals("1 этаж, 2 подъезд.", Main.determinateEntranceAndFloor(102, 10, 10)); }
    @Test public void entranceClassLastApAtEntranceLeftBorderStep() { assertEquals("10 этаж, 2 подъезд.", Main.determinateEntranceAndFloor(199, 10, 10)); }
    @Test public void entranceClassLastApAtEntranceRightBorderStep() { assertEquals("1 этаж, 3 подъезд.", Main.determinateEntranceAndFloor(201, 10, 10)); }
    ////////////////////////////////////////2.3 Внутри класса эквивалентности
    @Test public void floorClassInternalTest1() { assertEquals("2 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(13, 10, 10)); }
    @Test public void floorClassInternalTest2() { assertEquals("2 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(14, 10, 10)); }
    @Test public void floorClassInternalTest3() { assertEquals("2 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(15, 10, 10)); }
    @Test public void floorClassInternalTest4() { assertEquals("2 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(16, 10, 10)); }
    @Test public void floorClassInternalTest5() { assertEquals("2 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(17, 10, 10)); }
    @Test public void floorClassInternalTest6() { assertEquals("2 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(18, 10, 10)); }

    @Test public void entranceClassInternalTest1() { assertEquals("2 этаж, 2 подъезд.", Main.determinateEntranceAndFloor(111, 10, 10)); }
    @Test public void entranceClassInternalTest2() { assertEquals("3 этаж, 2 подъезд.", Main.determinateEntranceAndFloor(125, 10, 10)); }
    @Test public void entranceClassInternalTest3() { assertEquals("4 этаж, 2 подъезд.", Main.determinateEntranceAndFloor(135, 10, 10)); }
    @Test public void entranceClassInternalTest4() { assertEquals("5 этаж, 2 подъезд.", Main.determinateEntranceAndFloor(146, 10, 10)); }
    @Test public void entranceClassInternalTest5() { assertEquals("6 этаж, 2 подъезд.", Main.determinateEntranceAndFloor(157, 10, 10)); }
    @Test public void entranceClassInternalTest6() { assertEquals("7 этаж, 2 подъезд.", Main.determinateEntranceAndFloor(168, 10, 10)); }
    @Test public void entranceClassInternalTest7() { assertEquals("8 этаж, 2 подъезд.", Main.determinateEntranceAndFloor(178, 10, 10)); }
    @Test public void entranceClassInternalTest8() { assertEquals("9 этаж, 2 подъезд.", Main.determinateEntranceAndFloor(188, 10, 10)); }
    ////////////////////////////////////////3. Предметная область
    @Test public void realExample1() { assertEquals("3 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(15, 6, 9)); }
    @Test public void realExample2() { assertEquals("2 этаж, 4 подъезд.", Main.determinateEntranceAndFloor(113, 4, 9)); }
    @Test public void realExample3() { assertEquals("1 этаж, 3 подъезд.", Main.determinateEntranceAndFloor(44, 4, 5)); }
    @Test public void realExample4() { assertEquals("5 этаж, 2 подъезд.", Main.determinateEntranceAndFloor(56, 4, 9)); }
    @Test public void realExample5() { assertEquals("9 этаж, 9 подъезд.", Main.determinateEntranceAndFloor(322, 4, 9)); }
    ////////////////////////////////////////4. Реализация
    @Test public void overstepping1() { assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(0, 1, 1)); }
    @Test public void overstepping2() { assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(1, 0, 1)); }
    @Test public void overstepping3() { assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(1, 1, 0)); }
    @Test public void overstepping11() { assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(-1, 1, 1)); }
    @Test public void overstepping22() { assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(1, -1, 1)); }
    @Test public void overstepping33() { assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(1, 1, -1)); }
    @Test(expected = Exception.class) public void incorrectInput1() { Main.determinateEntranceAndFloor(Integer.parseInt("hfgvy62%S@^"), 1,1); }
    @Test(expected = Exception.class) public void incorrectInput2() { Main.determinateEntranceAndFloor(1, Integer.parseInt("hfgvy62%S@^"),1); }
    @Test(expected = Exception.class) public void incorrectInput3() { Main.determinateEntranceAndFloor(1, 1,Integer.parseInt("hfgvy62%S@^")); }
    @Test(expected = Exception.class) public void incorrectInput4() { Main.determinateEntranceAndFloor(Integer.parseInt("99999999999999"), 1,1); }
    @Test(expected = Exception.class) public void incorrectInput5() { Main.determinateEntranceAndFloor(1, Integer.parseInt("99999999999999"),1); }
    @Test(expected = Exception.class) public void incorrectInput6() { Main.determinateEntranceAndFloor(1, 1,Integer.parseInt("99999999999999")); }
    ///////////////////////////////////////5. Случайные значения
    @Test public void random1() { assertEquals("2 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(12, 6, 5)); }
    @Test public void random2() { assertEquals("1 этаж, 2 подъезд.", Main.determinateEntranceAndFloor(40, 4, 9)); }
    @Test public void random3() { assertEquals("3 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(15, 5, 10)); }
    @Test public void random4() { assertEquals("2 этаж, 4 подъезд.", Main.determinateEntranceAndFloor(24, 3, 2)); }
    @Test public void random5() { assertEquals("4 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(16, 4, 4)); }
}