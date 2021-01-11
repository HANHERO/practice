package task1;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void maxAndMinSwap() {
        assertEquals("A = -2147483648, B = 2147483647", Main.swap(2147483647, -2147483648));
    }

    @Test
    public void minAndMaxSwap() {
        assertEquals("A = 2147483647, B = -2147483648", Main.swap(-2147483648, 2147483647));
    }

    @Test
    public void minAndZeroSwap() {
        assertEquals("A = 0, B = -2147483648", Main.swap(-2147483648, 0));
    }

    @Test
    public void maxAndZeroSwap() {
        assertEquals("A = 0, B = 2147483647", Main.swap(2147483647, 0));
    }

    @Test
    public void zeroAndMinSwap() {
        assertEquals("A = -2147483648, B = 0", Main.swap(0, -2147483648));
    }

    @Test
    public void zeroAndMaxSwap() {
        assertEquals("A = 2147483647, B = 0", Main.swap(0, 2147483647));
    }

    @Test
    public void randomTest1() {
        assertEquals("A = 5, B = 3", Main.swap(3, 5));
    }

    @Test
    public void randomTest2() {
        assertEquals("A = 3, B = 5", Main.swap(5, 3));
    }

    @Test
    public void randomTest3() {
        assertEquals("A = 5, B = -1000", Main.swap(-1000, 5));
    }

    @Test
    public void randomTest4() {
        assertEquals("A = -1000, B = 3", Main.swap(3, -1000));
    }

    @Test
    public void randomTest5() {
        assertEquals("A = 20, B = 0", Main.swap(0, 20));
    }

    @Test
    public void randomTest6() {
        assertEquals("A = 0, B = 100", Main.swap(100, 0));
    }

    @Test
    public void randomTest7() {
        assertEquals("A = -40, B = -30", Main.swap(-30, -40));
    }

    @Test
    public void randomTest8() {
        assertEquals("A = -40, B = -30", Main.swap(-30, -40));
    }

    @Test
    public void randomTest9() {
        assertEquals("A = -40, B = -30", Main.swap(-30, -40));
    }

    @Test
    public void randomTest10() {
        assertEquals("A = -40, B = -30", Main.swap(-30, -40));
    }


}