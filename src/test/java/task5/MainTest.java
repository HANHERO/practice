package task5;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void findDayOfWeekTest1(){
        assertEquals("Четверг", Main.findDayOfWeek(3, 17,7));
    }
    @Test
    public void findDayOfWeekTest2(){
        assertEquals("Среда", Main.findDayOfWeek(2, 17,7));
    }
    @Test
    public void findDayOfWeekTest3(){
        assertEquals("Вторник", Main.findDayOfWeek(1, 17,7));
    }
    @Test
    public void findDayOfWeekTest4(){
        assertEquals("Пятница", Main.findDayOfWeek(4, 17,7));
    }
    @Test
    public void findDayOfWeekTest5(){
        assertEquals("Суббота", Main.findDayOfWeek(5, 17,7));
    }
    @Test
    public void findDayOfWeekTest6(){
        assertEquals("Воскресенье", Main.findDayOfWeek(6, 17,7));
    }
    @Test
    public void findDayOfWeekTest7(){
        assertEquals("Понедельник", Main.findDayOfWeek(7, 17,7));
    }
    @Test
    public void findDayOfWeekTest8(){
        assertEquals("Вторник", Main.findDayOfWeek(8, 17,7));
    }
    @Test
    public void findDayOfWeekTest9(){
        assertEquals("Понедельник", Main.findDayOfWeek(1, 31,12));
    }
    @Test
    public void findDayOfWeekTest10(){
        assertEquals("Вторник", Main.findDayOfWeek(2, 31,12));
    }
    @Test
    public void findDayOfWeekTest11(){
        assertEquals("Среда", Main.findDayOfWeek(3, 31,12));
    }
    @Test
    public void findDayOfWeekTest12(){
        assertEquals("Четверг", Main.findDayOfWeek(4, 31,12));
    }
    @Test
    public void findDayOfWeekTest13(){
        assertEquals("Пятница", Main.findDayOfWeek(5, 31,12));
    }
    @Test
    public void findDayOfWeekTest14(){
        assertEquals("Суббота", Main.findDayOfWeek(6, 31,12));
    }
    @Test
    public void findDayOfWeekTest15(){
        assertEquals("Воскресенье", Main.findDayOfWeek(7, 31,12));
    }
    @Test
    public void findDayOfWeekTest16(){
        assertEquals("Понедельник", Main.findDayOfWeek(8, 31,12));
    }
}