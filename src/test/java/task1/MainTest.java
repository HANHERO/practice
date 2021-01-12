package task1;


import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class MainTest {
    ////////////////////////////////1. Максимальное/минимальное значение аргумента
    @Test public void minAndMinSwap() { assertEquals("A = -2147483648, B = -2147483648", Main.swap(-2147483648, -2147483648)); }
    @Test public void maxAndMaxSwap() { assertEquals("A = 2147483647, B = 2147483647", Main.swap(2147483647, 2147483647)); }
    @Test public void maxAndMinSwap() { assertEquals("A = -2147483648, B = 2147483647", Main.swap(2147483647, -2147483648)); }
    @Test public void minAndMaxSwap() { assertEquals("A = 2147483647, B = -2147483648", Main.swap(-2147483648, 2147483647)); }
    ////////////////////////////////2. Классы эквивалентности
    ////////////////////////////////2.1 Границы классов эквивалентности
    @Test public void equivalenceClassBorder1() { assertEquals("A = -2147483648, B = 0", Main.swap(0, -2147483648)); }
    @Test public void equivalenceClassBorder2() { assertEquals("A = 2147483647, B = 0", Main.swap(0, 2147483647)); }
    @Test public void equivalenceClassBorder3() { assertEquals("A = 0, B = -2147483648", Main.swap(-2147483648, 0)); }
    @Test public void equivalenceClassBorder4() { assertEquals("A = 0, B = 2147483647", Main.swap(2147483647, 0)); }
    ////////////////////////////////2.2 Впритык справа и слева от границы
    @Test(expected = Exception.class) public void rightStepForRightBorder1() { Main.swap(0, Integer.parseInt("2147483648")); }
    @Test public void leftStepForRightBorder1(){ assertEquals("A = 2147483646, B = 0", Main.swap(0, 2147483646)); }
    @Test(expected = Exception.class) public void leftStepForLeftBorder1(){ Main.swap(Integer.parseInt("-2147483649"), 0); }
    @Test public void rightStepForLeftBorder1(){ assertEquals("A = 0, B = -2147483647", Main.swap(-2147483647, 0)); }
    @Test public void rightStepForRightBorder2() { assertEquals("A = -2147483647, B = 0", Main.swap(0, Integer.parseInt("-2147483647"))); }
    @Test(expected = Exception.class) public void leftStepForRightBorder2(){ Main.swap(0, Integer.parseInt("-2147483649")); }
    @Test public void leftStepForLeftBorder2(){ assertEquals("A = 0, B = 2147483646", Main.swap(2147483646, 0)); }
    @Test(expected = Exception.class) public void rightStepForLeftBorder2(){ Main.swap(Integer.parseInt("2147483648"), 0); }
    ////////////////////////////////2.3 Внутри класса эквивалентности
    @Test public void internal1() { assertEquals("A = 5, B = 3", Main.swap(3, 5)); }
    @Test public void internal2() { assertEquals("A = 3, B = 5", Main.swap(5, 3)); }
    @Test public void internal3() { assertEquals("A = 5, B = -1000", Main.swap(-1000, 5)); }
    @Test public void internal4() { assertEquals("A = -1000, B = 3", Main.swap(3, -1000)); }
    ////////////////////////////////3. Предметная область
    @Test public void example1() { assertEquals("A = 20, B = 0", Main.swap(0, 20)); }
    @Test public void example2() { assertEquals("A = 0, B = 100", Main.swap(100, 0)); }
    @Test public void example3() { assertEquals("A = -40, B = -30", Main.swap(-30, -40)); }
    ////////////////////////////////4. Реализация
    @Test(expected = Exception.class) public void incorrectInput1(){ Main.swap(Integer.parseInt("ab$@#%c"), 0); }
    @Test(expected = Exception.class) public void incorrectInput2(){ Main.swap(Integer.parseInt("-99999999999"), 0); }
    @Test(expected = Exception.class) public void incorrectInput3(){ Main.swap(0, Integer.parseInt("99999999999")); }
    ////////////////////////////////5. Случайные значения
    @Test public void random1() { assertEquals("A = 37, B = 55", Main.swap(55, 37)); }
    @Test public void random2() { assertEquals("A = 0, B = 1540", Main.swap(1540, 0)); }
    @Test public void random3() { assertEquals("A = -4002, B = -26530", Main.swap(-26530, -4002)); }
}