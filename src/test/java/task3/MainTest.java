package task3;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void findNODTest1() {
        assertEquals(10, Main.findNOD(new int[]{10, 20, 30, 40}));
    }
    @Test
    public void findNODTest2() {
        assertEquals(2, Main.findNOD(new int[]{2, 4, 8, 16}));
    }
    @Test
    public void findNODTest3() {
        assertEquals(10, Main.findNOD(new int[]{50, 400, 30, 170}));
    }
    @Test
    public void findNODTest4() {
        assertEquals(12, Main.findNOD(new int[]{48, 24, 120, 12}));
    }
    @Test
    public void findNODTest5() {
        assertEquals(17, Main.findNOD(new int[]{34, 68, 17, 170}));
    }
    @Test
    public void findNODTest6() {
        assertEquals(42, Main.findNOD(new int[]{84, 42, 168, 42}));
    }
    @Test
    public void findNODTest7() {
        assertEquals(15, Main.findNOD(new int[]{150, 30, 45, 6000}));
    }
    @Test
    public void findNODTest8() {
        assertEquals(1, Main.findNOD(new int[]{7, 100, 200, 400}));
    }
    @Test
    public void findNODTest9() {
        assertEquals(7, Main.findNOD(new int[]{49, 70, 21, 35}));
    }
    @Test
    public void findNODTest10() {
        assertEquals(11, Main.findNOD(new int[]{33, 22, 121, 99}));
    }

    @Test
    public void findMinElementTest1() {
        assertEquals(22, Main.findMinABSNotZeroElement(new int[]{33, 22, 121, 99}));
    }
    @Test
    public void findMinElementTest2() {
        assertEquals(10, Main.findMinABSNotZeroElement(new int[]{10, 20, 30, 40}));
    }
    @Test
    public void findMinElementTest3() {
        assertEquals(2, Main.findMinABSNotZeroElement(new int[]{2, 4, 8, 16}));
    }
    @Test
    public void findMinElementTest4() {
        assertEquals(30, Main.findMinABSNotZeroElement(new int[]{50, 400, 30, 170}));
    }
    @Test
    public void findMinElementTest5() {
        assertEquals(12, Main.findMinABSNotZeroElement(new int[]{48, 24, 120, 12}));
    }
    @Test
    public void findMinElementTest6() {
        assertEquals(17, Main.findMinABSNotZeroElement(new int[]{34, 68, 17, 170}));
    }
    @Test
    public void findMinElementTest7() {
        assertEquals(42, Main.findMinABSNotZeroElement(new int[]{84, 42, 168, 42}));
    }
    @Test
    public void findMinElementTest8() {
        assertEquals(30, Main.findMinABSNotZeroElement(new int[]{150, 30, 45, 6000}));
    }
    @Test
    public void findMinElementTest9() {
        assertEquals(7, Main.findMinABSNotZeroElement(new int[]{7, 100, 200, 400}));
    }
    @Test
    public void findMinElementTest10() {
        assertEquals(21, Main.findMinABSNotZeroElement(new int[]{49, 70, 21, 35}));
    }


}