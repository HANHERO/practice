package task1;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void minAndMaxSwap() {
        assertEquals(Main.swap(-2147483648, 2147483647), "A = 2147483647, B = -2147483648");
    }

    @Test
    public void maxAndMinSwap() {
        assertEquals(Main.swap(2147483647, -2147483648), "A = -2147483648, B = 2147483647");
    }

    @Test
    public void minAndZeroSwap() {
        assertEquals(Main.swap(-2147483648, 0), "A = 0, B = -2147483648");
    }

    @Test
    public void maxAndZeroSwap() {
        assertEquals(Main.swap(2147483647, 0), "A = 0, B = 2147483647");
    }

    @Test
    public void zeroAndMinSwap() {
        assertEquals(Main.swap(0, -2147483648), "A = -2147483648, B = 0");
    }

    @Test
    public void zeroAndMaxSwap() {
        assertEquals(Main.swap(0, 2147483647), "A = 2147483647, B = 0");
    }

    @Test
    public void randomTest1() {
        assertEquals(Main.swap(3, 5), "A = 5, B = 3");
    }

    @Test
    public void randomTest2() {
        assertEquals(Main.swap(5, 3), "A = 3, B = 5");
    }

    @Test
    public void randomTest3() {
        assertEquals(Main.swap(-1000, 5), "A = 5, B = -1000");
    }

    @Test
    public void randomTest4() {
        assertEquals(Main.swap(3, -1000), "A = -1000, B = 3");
    }

    @Test
    public void randomTest5() {
        assertEquals(Main.swap(0, 20), "A = 20, B = 0");
    }

    @Test
    public void randomTest6() {
        assertEquals(Main.swap(100, 0), "A = 0, B = 100");
    }

    @Test
    public void randomTest7() {
        assertEquals(Main.swap(-30, -40), "A = -40, B = -30");
    }

    @Test
    public void randomTest8() {
        assertEquals(Main.swap(-30, -40), "A = -40, B = -30");
    }

    @Test
    public void randomTest9() {
        assertEquals(Main.swap(-30, -40), "A = -40, B = -30");
    }

    @Test
    public void randomTest10() {
        assertEquals(Main.swap(-30, -40), "A = -40, B = -30");
    }


}