package task3;


import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class MainTest {

    //////////////////////////////Мин/макс значения аргументов
    @Test(expected = IOException.class)
    public void allMinArgsNOD() throws IOException { Main.findNOD(new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE}); }
    @Test
    public void allMaxArgsNOD() throws IOException { assertEquals(Integer.MAX_VALUE, Main.findNOD(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE})); }
    @Test
    public void findMinElementWithMinIntTest() { assertEquals(-1, Main.findMinABSNotZeroElement(new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE})); }
    @Test
    public void findMinElementWithMaxIntTest() { assertEquals(Integer.MAX_VALUE, Main.findMinABSNotZeroElement(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE})); }
    ////////////////////////////// Особые значения
    @Test
    public void findNodWithZero() throws IOException { assertEquals(4, Main.findNOD(new int[]{4, 8, 16, 0})); }
    @Test
    public void findMinWithZero() { assertEquals(4, Main.findMinABSNotZeroElement(new int[]{4, 8, 16, 0})); }
    @Test
    public void findNodWithAllZero() throws IOException { assertEquals(2147483647, Main.findNOD(new int[]{0, 0, 0, 0})); }
    @Test
    public void findMinWithAllZero() throws IOException { assertEquals(2147483647, Main.findNOD(new int[]{0, 0, 0, 0})); }
    //////////////////////////////////////Случайные значения
    @Test
    public void findNODTest1() throws IOException { assertEquals(10, Main.findNOD(new int[]{10, 20, 30, 40})); }
    @Test
    public void findNODTest2() throws IOException { assertEquals(2, Main.findNOD(new int[]{2, 4, 8, 16})); }
    @Test
    public void findNODTest3() throws IOException { assertEquals(10, Main.findNOD(new int[]{50, 400, 30, 170})); }
    @Test
    public void findNODTest4() throws IOException { assertEquals(12, Main.findNOD(new int[]{48, 24, 120, 12})); }
    @Test
    public void findNODTest5() throws IOException { assertEquals(17, Main.findNOD(new int[]{-34, -68, 17, -170})); }
    @Test
    public void findNODTest6() throws IOException { assertEquals(42, Main.findNOD(new int[]{84, 42, 168, 42})); }
    @Test
    public void findNODTest7() throws IOException { assertEquals(15, Main.findNOD(new int[]{150, 30, -45, 6000})); }
    @Test
    public void findNODTest8() throws IOException { assertEquals(1, Main.findNOD(new int[]{7, 100, 200, 400})); }
    @Test
    public void findNODTest9() throws IOException { assertEquals(7, Main.findNOD(new int[]{49, -70, 21, 35})); }
    @Test
    public void findNODTest10() throws IOException { assertEquals(11, Main.findNOD(new int[]{33, 22, 121, 99})); }
    @Test
    public void findMinElementTest1() { assertEquals(22, Main.findMinABSNotZeroElement(new int[]{33, 22, 121, 99})); }
    @Test
    public void findMinElementTest2() { assertEquals(10, Main.findMinABSNotZeroElement(new int[]{10, 20, -30, 40})); }
    @Test
    public void findMinElementTest3() { assertEquals(2, Main.findMinABSNotZeroElement(new int[]{2, 4, 8, 16})); }
    @Test
    public void findMinElementTest4() { assertEquals(30, Main.findMinABSNotZeroElement(new int[]{50, -400, 30, 170})); }
    @Test
    public void findMinElementTest5() { assertEquals(12, Main.findMinABSNotZeroElement(new int[]{48, 24, 120, 12})); }
    @Test
    public void findMinElementTest6() { assertEquals(17, Main.findMinABSNotZeroElement(new int[]{34, 68, 17, 170})); }
    @Test
    public void findMinElementTest7() { assertEquals(42, Main.findMinABSNotZeroElement(new int[]{84, -42, 168, 42})); }
    @Test
    public void findMinElementTest8() { assertEquals(30, Main.findMinABSNotZeroElement(new int[]{150, 30, 45, -6000})); }
    @Test
    public void findMinElementTest9() { assertEquals(7, Main.findMinABSNotZeroElement(new int[]{7, -100, 200, 400})); }
    @Test
    public void findMinElementTest10() { assertEquals(21, Main.findMinABSNotZeroElement(new int[]{49, 70, -21, 35})); }
}