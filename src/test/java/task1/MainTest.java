package task1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static task1.Main.swap;

public class MainTest {
    private final int min = Integer.MIN_VALUE;
    private final int max = Integer.MAX_VALUE;
    ////////////////////////////////1. Максимальное/минимальное значение аргумента
    @Test public void minAndMinSwap() { assertEquals("A = -2147483648, B = -2147483648", swap(min, min)); }
    @Test public void maxAndMaxSwap() { assertEquals("A = 2147483647, B = 2147483647", swap(max, max)); }
    @Test public void maxAndMinSwap() { assertEquals("A = -2147483648, B = 2147483647", swap(max, min)); }
    @Test public void minAndMaxSwap() { assertEquals("A = 2147483647, B = -2147483648", swap(min, max)); }
    ////////////////////////////////2. Классы эквивалентности
    ////////////////////////////////2.1 Границы классов эквивалентности

    ////////////////////////////////2.2 Впритык справа и слева от границы
    @Test(expected = Exception.class) public void rightStepForRightBorder1() { swap(0, Integer.parseInt("2147483648")); }
    @Test public void leftStepForRightBorder1(){ assertEquals("A = 2147483646, B = 0", swap(0, 2147483646)); }
    @Test(expected = Exception.class) public void leftStepForLeftBorder1(){ swap(Integer.parseInt("-2147483649"), 0); }
    @Test public void rightStepForLeftBorder1(){ assertEquals("A = 0, B = -2147483647", swap(-2147483647, 0)); }
    @Test public void rightStepForRightBorder2() { assertEquals("A = -2147483647, B = 0", swap(0, Integer.parseInt("-2147483647"))); }
    @Test(expected = Exception.class) public void leftStepForRightBorder2(){ swap(0, Integer.parseInt("-2147483649")); }
    @Test public void leftStepForLeftBorder2(){ assertEquals("A = 0, B = 2147483646", swap(2147483646, 0)); }
    @Test(expected = Exception.class) public void rightStepForLeftBorder2(){ swap(Integer.parseInt("2147483648"), 0); }
    ////////////////////////////////2.3 Внутри класса эквивалентности
    @Test public void internal1() { assertEquals("A = 5, B = 3", swap(3, 5)); }
    @Test public void internal2() { assertEquals("A = 3, B = 5", swap(5, 3)); }
    @Test public void internal3() { assertEquals("A = 5, B = -1000", swap(-1000, 5)); }
    @Test public void internal4() { assertEquals("A = -1000, B = 3", swap(3, -1000)); }
    ////////////////////////////////3. Предметная область
    @Test public void example1() { assertEquals("A = 20, B = 0", swap(0, 20)); }
    @Test public void example2() { assertEquals("A = 0, B = 100", swap(100, 0)); }
    @Test public void example3() { assertEquals("A = -40, B = -30", swap(-30, -40)); }
    ////////////////////////////////4. Реализация
    @Test(expected = Exception.class) public void incorrectInput1(){ swap(Integer.parseInt("ab$@#%c"), 0); }
    @Test(expected = Exception.class) public void incorrectInput2(){ swap(Integer.parseInt("-99999999999"), 0); }
    @Test(expected = Exception.class) public void incorrectInput3(){ swap(0, Integer.parseInt("99999999999")); }
    ////////////////////////////////5. Случайные значения
    @Test public void random1() { assertEquals("A = 37, B = 55", swap(55, 37)); }
    @Test public void random2() { assertEquals("A = 0, B = 1540", swap(1540, 0)); }
    @Test public void random3() { assertEquals("A = -4002, B = -26530000", swap(-26530000, -4002)); }
    @Test public void random4() { assertEquals("A = 380000000, B = 25", swap(25, 380000000)); }
    @Test public void random5() { assertEquals("A = 1000000000, B = 12545556", swap(12545556, 1000000000)); }
    @Test public void random6() { assertEquals("A = -99999, B = -265300000", swap(-265300000, -99999)); }
    @Test public void random7() { assertEquals("A = 300000007, B = 500000005", swap(500000005, 300000007)); }
    @Test public void random8() { assertEquals("A = 0, B = 10000540", swap(10000540, 0)); }
    @Test public void random9() { assertEquals("A = -505200, B = -20006530", swap(-20006530, -505200)); }
    @Test public void random10() { assertEquals("A = 99999999, B = 265300000", swap(265300000, 99999999)); }
    @Test public void random11() { assertEquals("A = 332145687, B = 55456789", swap(55456789, 332145687)); }
    @Test public void random12() { assertEquals("A = 21548445, B = 1540", swap(1540, 21548445)); }
    @Test public void random13() { assertEquals("A = -15155576, B = -26530000", swap(-26530000, -15155576)); }
    @Test public void random14() { assertEquals("A = 380000000, B = 22255115", swap(22255115, 380000000)); }
    @Test public void random15() { assertEquals("A = 999999845, B = 12545556", swap(12545556, 999999845)); }
    @Test public void random16() { assertEquals("A = -15668845, B = -265300000", swap(-265300000, -15668845)); }
    @Test public void random17() { assertEquals("A = 300000007, B = 2046336252", swap(2046336252, 300000007)); }
    @Test public void random18() { assertEquals("A = -254569885, B = 10000540", swap(10000540, -254569885)); }
    @Test public void random19() { assertEquals("A = -5052200, B = -20006530", swap(-20006530, -5052200)); }
    @Test public void random20() { assertEquals("A = -999999999, B = 265300000", swap(265300000, -999999999)); }
}