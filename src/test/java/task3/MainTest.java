package task3;


import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class MainTest {

    //////////////////////////////1. Минимальные/максимальные значения аргументов
    @Test(expected = IOException.class) public void allMinArgsNOD1() throws IOException { Main.findNOD(new int[]{Integer.MIN_VALUE, 0, 0, 0}); }
    @Test(expected = IOException.class) public void allMinArgsNOD2() throws IOException { Main.findNOD(new int[]{0, Integer.MIN_VALUE, 0, 0}); }
    @Test(expected = IOException.class) public void allMinArgsNOD3() throws IOException { Main.findNOD(new int[]{0, 0, Integer.MIN_VALUE, 0}); }
    @Test(expected = IOException.class) public void allMinArgsNOD4() throws IOException { Main.findNOD(new int[]{0, 0, 0, Integer.MIN_VALUE}); }
    @Test public void allMaxArgsNOD1() throws IOException { assertEquals(Integer.MAX_VALUE, Main.findNOD(new int[]{Integer.MAX_VALUE, 0, 0, 0})); }
    @Test public void allMaxArgsNOD2() throws IOException { assertEquals(Integer.MAX_VALUE, Main.findNOD(new int[]{0, Integer.MAX_VALUE, 0, 0})); }
    @Test public void allMaxArgsNOD3() throws IOException { assertEquals(Integer.MAX_VALUE, Main.findNOD(new int[]{0, 0, Integer.MAX_VALUE, 0})); }
    @Test public void allMaxArgsNOD4() throws IOException { assertEquals(Integer.MAX_VALUE, Main.findNOD(new int[]{0, 0, 0, Integer.MAX_VALUE})); }
    //////////////////////////////2. Классы эквивалентности
    //////////////////////////////2.1 Границы классов эквивалентности
    @Test public void leftBorderNOD() throws IOException{ assertEquals(2147483647, Main.findNOD(new int[]{-2147483647, -2147483647, -2147483647, -2147483647})); }
    @Test public void rightBorderNOD() throws IOException{ assertEquals(2147483647, Main.findNOD(new int[]{2147483647, 2147483647, 2147483647, 2147483647})); }
    //////////////////////////////2.2 Впритык слева и справа от границы
    @Test(expected = IOException.class) public void leftBorderLeftStepNOD() throws IOException { Main.findNOD(new int[]{-2147483648, -2147483648, -2147483648, -2147483648}); }
    @Test public void leftBorderRightStepNOD() throws IOException{ assertEquals(2147483646, Main.findNOD(new int[]{-2147483646, -2147483646, -2147483646, -2147483646})); }
    @Test(expected = NumberFormatException.class) public void rightBorderRightStepNOD() throws IOException{ Main.findNOD(new int[]{Integer.parseInt("2147483648"), Integer.parseInt("2147483648"), Integer.parseInt("2147483648"), Integer.parseInt("2147483648")});}
    @Test public void rightBorderLeftStepNOD() throws IOException{ assertEquals(2147483646, Main.findNOD(new int[]{2147483646, 2147483646, 2147483646, 2147483646}));}
    //////////////////////////////2.3 Внутри класса эквивалентности
    @Test public void internal1() throws IOException { assertEquals(12, Main.findNOD(new int[]{48, 24, 120, 12})); }
    @Test public void internal2() throws IOException { assertEquals(17, Main.findNOD(new int[]{-34, -68, 17, -170})); }
    @Test public void internal3() throws IOException { assertEquals(42, Main.findNOD(new int[]{84, 42, 168, 42})); }
    @Test public void internal4() throws IOException { assertEquals(15, Main.findNOD(new int[]{150, 30, -45, 6000})); }
    //////////////////////////////3. Предметная область
    @Test public void realExample1() throws IOException {assertEquals(2, Main.findNOD(new int[]{4,6,8,24}));}
    @Test public void realExample2() throws IOException {assertEquals(3, Main.findNOD(new int[]{9,18,24,54}));}
    @Test public void realExample3() throws IOException {assertEquals(5, Main.findNOD(new int[]{25,15,100,30}));}
    @Test public void realExample4() throws IOException {assertEquals(7, Main.findNOD(new int[]{14,49,28,56}));}
    @Test public void realExample5() throws IOException {assertEquals(9, Main.findNOD(new int[]{81,90,144,162}));}
    //////////////////////////////4. Реализация
    @Test public void ignoringZero1() throws IOException {assertEquals(8, Main.findNOD(new int[]{0,8,8,88}));}
    @Test public void ignoringZero2() throws IOException {assertEquals(4, Main.findNOD(new int[]{4,0,8,12}));}
    @Test public void ignoringZero3() throws IOException {assertEquals(10, Main.findNOD(new int[]{30,20,0,10}));}
    @Test public void ignoringZero4() throws IOException {assertEquals(6, Main.findNOD(new int[]{24,6,12,0}));}
    @Test public void ignoringZero5() throws IOException {assertEquals (Integer.MAX_VALUE, Main.findNOD(new int[]{0,0,0,0}));}
    @Test(expected = Exception.class) public void incorrectInput1() throws IOException{ Main.findNOD(new int[]{Integer.parseInt("hfy7e72"),1,1,1});}
    @Test(expected = Exception.class) public void incorrectInput2() throws IOException{ Main.findNOD(new int[]{1,Integer.parseInt("hfy7e72"),1,1});}
    @Test(expected = Exception.class) public void incorrectInput3() throws IOException{ Main.findNOD(new int[]{1,1,Integer.parseInt("hfy7e72"),1});}
    @Test(expected = Exception.class) public void incorrectInput4() throws IOException{ Main.findNOD(new int[]{1,1,1,Integer.parseInt("hfy7e72")});}
    @Test(expected = Exception.class) public void incorrectInput5() throws IOException{ Main.findNOD(new int[]{Integer.parseInt("9999999999"),1,1,1});}
    @Test(expected = Exception.class) public void incorrectInput6() throws IOException{ Main.findNOD(new int[]{1,Integer.parseInt("9999999999"),1,1});}
    @Test(expected = Exception.class) public void incorrectInput7() throws IOException{ Main.findNOD(new int[]{1,1,Integer.parseInt("9999999999"),1});}
    @Test(expected = Exception.class) public void incorrectInput8() throws IOException{ Main.findNOD(new int[]{1,1,1,Integer.parseInt("9999999999")});}
    //////////////////////////////5. Случайные значения
    @Test public void randomTest1() throws IOException { assertEquals(10, Main.findNOD(new int[]{10, 20, 30, 40})); }
    @Test public void randomTest2() throws IOException { assertEquals(2, Main.findNOD(new int[]{2, 4, 8, 16})); }
    @Test public void randomTest3() throws IOException { assertEquals(10, Main.findNOD(new int[]{50, 400, 30, 170})); }
    @Test public void randomTest8() throws IOException { assertEquals(1, Main.findNOD(new int[]{7, 100, 200, 400})); }
    @Test public void randomTest9() throws IOException { assertEquals(7, Main.findNOD(new int[]{49, -70, 21, 35})); }
    @Test public void randomTest10() throws IOException { assertEquals(11, Main.findNOD(new int[]{33, 22, 121, 99})); }

}