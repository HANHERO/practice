package task3;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static task3.Main.findNOD;

public class MainTest {
    private final int min = -2147483647;
    private final int max = 2147483647;

    //////////////////////////////1. Минимальные/максимальные значения аргументов
    @Test public void minAndMaxArgsNOD1() { assertEquals(max,findNOD(new int[]{min, min, min, min})); }
    @Test public void minAndMaxArgsNOD2() { assertEquals(max,findNOD(new int[]{min, min, min, max})); }
    @Test public void minAndMaxArgsNOD3() { assertEquals(max,findNOD(new int[]{min, min, max, min})); }
    @Test public void minAndMaxArgsNOD4() { assertEquals(max,findNOD(new int[]{min, min, max, max})); }
    @Test public void minAndMaxArgsNOD5() { assertEquals(max,findNOD(new int[]{min, max, min, min})); }
    @Test public void minAndMaxArgsNOD6() { assertEquals(max,findNOD(new int[]{min, max, min, max})); }
    @Test public void minAndMaxArgsNOD7() { assertEquals(max,findNOD(new int[]{min, max, max, min})); }
    @Test public void minAndMaxArgsNOD8() { assertEquals(max,findNOD(new int[]{min, max, max, max})); }
    @Test public void minAndMaxArgsNOD9() { assertEquals(max,findNOD(new int[]{max, min, min, min})); }
    @Test public void minAndMaxArgsNOD10() { assertEquals(max,findNOD(new int[]{max, min, min, max})); }
    @Test public void minAndMaxArgsNOD11() { assertEquals(max,findNOD(new int[]{max, min, max, min})); }
    @Test public void minAndMaxArgsNOD12() { assertEquals(max,findNOD(new int[]{max, min, max, max})); }
    @Test public void minAndMaxArgsNOD13() { assertEquals(max,findNOD(new int[]{max, max, min, min})); }
    @Test public void minAndMaxArgsNOD14() { assertEquals(max,findNOD(new int[]{max, max, min, max})); }
    @Test public void minAndMaxArgsNOD15() { assertEquals(max,findNOD(new int[]{max, max, max, min})); }
    @Test public void minAndMaxArgsNOD16() { assertEquals(max,findNOD(new int[]{max, max, max, max})); }

    //////////////////////////////2. Классы эквивалентности
    //////////////////////////////2.1 Границы классов эквивалентности
    @Test public void leftBorderNOD() { assertEquals(2147483647, findNOD(new int[]{-2147483647, -2147483647, -2147483647, -2147483647})); }
    @Test public void rightBorderNOD() { assertEquals(2147483647, findNOD(new int[]{2147483647, 2147483647, 2147483647, 2147483647})); }
    //////////////////////////////2.2 Впритык слева и справа от границы
    @Test public void leftBorderRightStepNOD() { assertEquals(2147483646, findNOD(new int[]{-2147483646, -2147483646, -2147483646, -2147483646})); }
    @Test(expected = NumberFormatException.class) public void rightBorderRightStepNOD() { findNOD(new int[]{Integer.parseInt("2147483648"), Integer.parseInt("2147483648"), Integer.parseInt("2147483648"), Integer.parseInt("2147483648")});}
    @Test public void rightBorderLeftStepNOD() { assertEquals(2147483646, findNOD(new int[]{2147483646, 2147483646, 2147483646, 2147483646}));}
    //////////////////////////////2.3 Внутри класса эквивалентности
    @Test public void internal1() { assertEquals(12, findNOD(new int[]{48, 24, 120, 12})); }
    @Test public void internal2() { assertEquals(17, findNOD(new int[]{-34, -68, 17, -170})); }
    @Test public void internal3() { assertEquals(42, findNOD(new int[]{84, 42, 168, 42})); }
    @Test public void internal4() { assertEquals(15, findNOD(new int[]{150, 30, -45, 6000})); }
    //////////////////////////////3. Предметная область
    @Test public void realExample1() {assertEquals(2, findNOD(new int[]{4,6,8,24}));}
    @Test public void realExample2() {assertEquals(3, findNOD(new int[]{9,18,24,54}));}
    @Test public void realExample3() {assertEquals(5, findNOD(new int[]{25,15,100,30}));}
    @Test public void realExample4() {assertEquals(7, findNOD(new int[]{14,49,28,56}));}
    @Test public void realExample5() {assertEquals(9, findNOD(new int[]{81,90,144,162}));}
    //////////////////////////////4. Реализация
    @Test public void ignoringZero1() {assertEquals(8, findNOD(new int[]{0,8,8,88}));}
    @Test public void ignoringZero2() {assertEquals(4, findNOD(new int[]{4,0,8,12}));}
    @Test public void ignoringZero3() {assertEquals(10, findNOD(new int[]{30,20,0,10}));}
    @Test public void ignoringZero4() {assertEquals(6, findNOD(new int[]{24,6,12,0}));}
    @Test public void ignoringZero5() {assertEquals (Integer.MAX_VALUE, findNOD(new int[]{0,0,0,0}));}
    @Test(expected = Exception.class) public void incorrectInput1() { findNOD(new int[]{Integer.parseInt("hfy7e72"),1,1,1});}
    @Test(expected = Exception.class) public void incorrectInput2() { findNOD(new int[]{1,Integer.parseInt("hfy7e72"),1,1});}
    @Test(expected = Exception.class) public void incorrectInput3() { findNOD(new int[]{1,1,Integer.parseInt("hfy7e72"),1});}
    @Test(expected = Exception.class) public void incorrectInput4() { findNOD(new int[]{1,1,1,Integer.parseInt("hfy7e72")});}
    @Test(expected = Exception.class) public void incorrectInput5() { findNOD(new int[]{Integer.parseInt("9999999999"),1,1,1});}
    @Test(expected = Exception.class) public void incorrectInput6() { findNOD(new int[]{1,Integer.parseInt("9999999999"),1,1});}
    @Test(expected = Exception.class) public void incorrectInput7() { findNOD(new int[]{1,1,Integer.parseInt("9999999999"),1});}
    @Test(expected = Exception.class) public void incorrectInput8() { findNOD(new int[]{1,1,1,Integer.parseInt("9999999999")});}
    //////////////////////////////5. Случайные значения
    @Test public void randomTest1() { assertEquals(10, findNOD(new int[]{10, 20, 30, 40})); }
    @Test public void randomTest2() { assertEquals(2, findNOD(new int[]{2, 4, 8, 16})); }
    @Test public void randomTest3() { assertEquals(10, findNOD(new int[]{50, 400, 30, 170})); }
    @Test public void randomTest4() { assertEquals(1, findNOD(new int[]{7, 100, 200, 400})); }
    @Test public void randomTest5() { assertEquals(7, findNOD(new int[]{49, -70, 21, 35})); }
    @Test public void randomTest6() { assertEquals(11, findNOD(new int[]{33, 22, 121, 99})); }
    @Test public void randomTest7() { assertEquals(3, findNOD(new int[]{30, 30, 30, 3})); }
    @Test public void randomTest8() { assertEquals(2, findNOD(new int[]{122, 24, 86, 16})); }
    @Test public void randomTest9() { assertEquals(100, findNOD(new int[]{500, 4000, 300, 1700})); }
    @Test public void randomTest10() { assertEquals(10, findNOD(new int[]{70, 1000, 2000, 4000})); }
    @Test public void randomTest11() { assertEquals(1, findNOD(new int[]{15, 20, 30, 4})); }
    @Test public void randomTest12() { assertEquals(20, findNOD(new int[]{20, 40, 80, 160})); }
    @Test public void randomTest13() { assertEquals(3, findNOD(new int[]{0, 30, 3, 0})); }
    @Test public void randomTest14() { assertEquals(1, findNOD(new int[]{7, 1, 200, 400})); }
    @Test public void randomTest15() { assertEquals(35, findNOD(new int[]{490, -70, 210, 35})); }
    @Test public void randomTest16() { assertEquals(11, findNOD(new int[]{33, 22, 121, 99})); }
    @Test public void randomTest17() { assertEquals(10, findNOD(new int[]{10, 20, 30, 40})); }
    @Test public void randomTest18() { assertEquals(4, findNOD(new int[]{8, 4, 8, 16})); }
    @Test public void randomTest19() { assertEquals(10, findNOD(new int[]{50, 400, 30, 170})); }
    @Test public void randomTest20() { assertEquals(8, findNOD(new int[]{8, 64, 72, 80})); }
    @Test public void randomTest21() { assertEquals(12, findNOD(new int[]{12, 24, 36, 144})); }
    @Test public void randomTest22() { assertEquals(7, findNOD(new int[]{21, 49, 70, 14})); }
    @Test public void randomTest23() { assertEquals(57, findNOD(new int[]{57, 57, 114, 228})); }
    @Test public void randomTest24() { assertEquals(19, findNOD(new int[]{38, 380, 19, 38})); }
    @Test public void randomTest25() { assertEquals(7, findNOD(new int[]{49, 70, 21, 35})); }
    @Test public void randomTest26() { assertEquals(11, findNOD(new int[]{33, 22, 121, 99})); }
    @Test public void randomTest27() { assertEquals(10, findNOD(new int[]{10, 20, 30, 40})); }
    @Test public void randomTest28() { assertEquals(2, findNOD(new int[]{2, 4, 8, 16})); }
    @Test public void randomTest29() { assertEquals(10, findNOD(new int[]{50, 400, 30, 170})); }
    @Test public void randomTest30() { assertEquals(1, findNOD(new int[]{7, 100, 200, 400})); }


}