package task2;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static task2.Main.determ;

public class MainTest {
    private final int min = 1;
    private final int max = Integer.MAX_VALUE;
    ///////////////////////////////////////1 Минимальное/максимальное значение аргументов
    @Test public void minAndMaxValue1() { assertEquals("1 этаж, 1 подъезд.", determ(min, min, min)); }
    @Test public void minAndMaxValue2() { assertEquals("1 этаж, 1 подъезд.", determ(min, min, max)); }
    @Test public void minAndMaxValue3() { assertEquals("1 этаж, 1 подъезд.", determ(min, max, min)); }
    @Test public void minAndMaxValue4() { assertEquals("1 этаж, 1 подъезд.", determ(min, max, max)); }
    @Test public void minAndMaxValue5() { assertEquals("1 этаж, 2147483647 подъезд.", determ(max, min, min)); }
    @Test public void minAndMaxValue6() { assertEquals("2147483647 этаж, 1 подъезд.", determ(max, min, max)); }
    @Test public void minAndMaxValue7() { assertEquals("1 этаж, 1 подъезд.", determ(max, max, min)); }
    @Test public void minAndMaxValue8() { assertEquals("1 этаж, 1 подъезд.", determ(max, max, max)); }
    ////////////////////////////////////////2 Классы эквивалентности
    ////////////////////////////////////////2.1 Границы классов эквивалентности
    @Test public void floorClassFirstApAtFloor() { assertEquals("2 этаж, 1 подъезд.", determ(11, 10, 10));}
    @Test public void floorClassLastAp() { assertEquals("2 этаж, 1 подъезд.", determ(20, 10, 10)); }

    @Test public void entranceClassFirstApAtEntrance() { assertEquals("1 этаж, 2 подъезд.", determ(101, 10, 10)); }
    @Test public void entranceClassLastApAtEntrance() { assertEquals("10 этаж, 2 подъезд.", determ(200, 10, 10)); }
    ////////////////////////////////////////2.2 Впритык слева и справа от грацницы
    @Test public void floorClassFirstApAtFloorLeftBorderStep() { assertEquals("1 этаж, 1 подъезд.", determ(10, 10, 10)); }
    @Test public void floorClassFirstApAtFloorRightBorderStep() { assertEquals("2 этаж, 1 подъезд.", determ(12, 10, 10)); }
    @Test public void floorClassLastApLeftBorderStep() { assertEquals("2 этаж, 1 подъезд.", determ(19, 10, 10)); }
    @Test public void floorClassLastApRightBorderStep() { assertEquals("3 этаж, 1 подъезд.", determ(21, 10, 10)); }

    @Test public void entranceClassFirstApAtEntranceLeftBorderStep() { assertEquals("10 этаж, 1 подъезд.", determ(100, 10, 10)); }
    @Test public void entranceClassFirstApAtEntranceRightBorderStep() { assertEquals("1 этаж, 2 подъезд.", determ(102, 10, 10)); }
    @Test public void entranceClassLastApAtEntranceLeftBorderStep() { assertEquals("10 этаж, 2 подъезд.", determ(199, 10, 10)); }
    @Test public void entranceClassLastApAtEntranceRightBorderStep() { assertEquals("1 этаж, 3 подъезд.", determ(201, 10, 10)); }
    ////////////////////////////////////////2.3 Внутри класса эквивалентности
    @Test public void floorInternalTest1() { assertEquals("2 этаж, 1 подъезд.", determ(13, 10, 10)); }
    @Test public void floorInternalTest2() { assertEquals("2 этаж, 1 подъезд.", determ(14, 10, 10)); }
    @Test public void floorInternalTest3() { assertEquals("2 этаж, 1 подъезд.", determ(15, 10, 10)); }
    @Test public void floorInternalTest4() { assertEquals("2 этаж, 1 подъезд.", determ(16, 10, 10)); }
    @Test public void floorInternalTest5() { assertEquals("2 этаж, 1 подъезд.", determ(17, 10, 10)); }
    @Test public void floorInternalTest6() { assertEquals("2 этаж, 1 подъезд.", determ(18, 10, 10)); }

    @Test public void entranceInternalTest1() { assertEquals("2 этаж, 2 подъезд.", determ(111, 10, 10)); }
    @Test public void entranceInternalTest2() { assertEquals("3 этаж, 2 подъезд.", determ(125, 10, 10)); }
    @Test public void entranceInternalTest3() { assertEquals("4 этаж, 2 подъезд.", determ(135, 10, 10)); }
    @Test public void entranceInternalTest4() { assertEquals("5 этаж, 2 подъезд.", determ(146, 10, 10)); }
    @Test public void entranceInternalTest5() { assertEquals("6 этаж, 2 подъезд.", determ(157, 10, 10)); }
    @Test public void entranceInternalTest6() { assertEquals("7 этаж, 2 подъезд.", determ(168, 10, 10)); }
    @Test public void entranceInternalTest7() { assertEquals("8 этаж, 2 подъезд.", determ(178, 10, 10)); }
    @Test public void entranceInternalTest8() { assertEquals("9 этаж, 2 подъезд.", determ(188, 10, 10)); }
    ////////////////////////////////////////3. Предметная область
    @Test public void realExample1() { assertEquals("3 этаж, 1 подъезд.", determ(15, 6, 9)); }
    @Test public void realExample2() { assertEquals("2 этаж, 4 подъезд.", determ(113, 4, 9)); }
    @Test public void realExample3() { assertEquals("1 этаж, 3 подъезд.", determ(44, 4, 5)); }
    @Test public void realExample4() { assertEquals("5 этаж, 2 подъезд.", determ(56, 4, 9)); }
    @Test public void realExample5() { assertEquals("9 этаж, 9 подъезд.", determ(322, 4, 9)); }
    ////////////////////////////////////////4. Реализация
    @Test public void overstepping1() { assertEquals("Введены не корректные данные.", determ(0, 1, 1)); }
    @Test public void overstepping2() { assertEquals("Введены не корректные данные.", determ(1, 0, 1)); }
    @Test public void overstepping3() { assertEquals("Введены не корректные данные.", determ(1, 1, 0)); }
    @Test public void overstepping11() { assertEquals("Введены не корректные данные.", determ(-1, 1, 1)); }
    @Test public void overstepping22() { assertEquals("Введены не корректные данные.", determ(1, -1, 1)); }
    @Test public void overstepping33() { assertEquals("Введены не корректные данные.", determ(1, 1, -1)); }
    @Test(expected = Exception.class) public void incorrectInput1() { determ(Integer.parseInt("hfgvy62%S@^"), 1,1); }
    @Test(expected = Exception.class) public void incorrectInput2() { determ(1, Integer.parseInt("hfgvy62%S@^"),1); }
    @Test(expected = Exception.class) public void incorrectInput3() { determ(1, 1,Integer.parseInt("hfgvy62%S@^")); }
    @Test(expected = Exception.class) public void incorrectInput4() { determ(Integer.parseInt("99999999999999"), 1,1); }
    @Test(expected = Exception.class) public void incorrectInput5() { determ(1, Integer.parseInt("99999999999999"),1); }
    @Test(expected = Exception.class) public void incorrectInput6() { determ(1, 1,Integer.parseInt("99999999999999")); }
    ///////////////////////////////////////5. Случайные значения
    @Test public void random1() { assertEquals("2 этаж, 1 подъезд.", determ(12, 6, 5)); }
    @Test public void random2() { assertEquals("1 этаж, 2 подъезд.", determ(40, 4, 9)); }
    @Test public void random3() { assertEquals("3 этаж, 1 подъезд.", determ(15, 5, 10)); }
    @Test public void random4() { assertEquals("2 этаж, 4 подъезд.", determ(24, 3, 2)); }
    @Test public void random5() { assertEquals("4 этаж, 1 подъезд.", determ(16, 4, 4)); }
}