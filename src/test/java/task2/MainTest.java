package task2;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MainTest {

    @Test
    public void overstepping1(){
        assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(0,1,1));
    }
    @Test
    public void overstepping2(){
        assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(1,0,1));
    }
    @Test
    public void overstepping3(){
        assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(1,1,0));
    }
    @Test
    public void overstepping11(){
        assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(-234,1,1));
    }
    @Test
    public void overstepping22(){
        assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(1,-234,1));
    }
    @Test
    public void overstepping33(){
        assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(1,1,-234));
    }

    /*@Test
    public void overshoot1(){
        assertEquals("Введены не корректные данные.", Main.determinateEntranceAndFloor(2147483648,2147483647,2147483647));
    }*/

    @Test
    public void firstApOnFirstFloor() {
        assertEquals("1 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(1, 4, 9));
    }

    @Test
    public void lastApOnFirstFloor() {
        assertEquals("1 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(4, 4, 9));
    }

    @Test
    public void firstApOnLastFloor() {
        assertEquals("9 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(33, 4, 9));
    }

    @Test
    public void lastApOnLastFloor() {
        assertEquals("9 этаж, 1 подъезд.", Main.determinateEntranceAndFloor(36, 4, 9));
    }

    @Test
    public void firstApOnFirstFloorInSecondEntrance() {
        assertEquals("1 этаж, 2 подъезд.", Main.determinateEntranceAndFloor(37, 4, 9));
    }
}