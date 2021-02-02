package task5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static task5.Year.f;

public class MainTest {
    private final String pn = "Понедельник";
    private final String vt = "Вторник";
    private final String sr = "Среда";
    private final String ch = "Четверг";
    private final String pt = "Пятница";
    private final String sb = "Суббота";
    private final String vs = "Воскресенье";

    private void a(String e, String a){ assertEquals(e, a); }
    //////////////////////////////////1. Граничные значения области определения
    @Test public void minMax() {
        a(pn, f(1, 1, 1));
        a(sb, f(1, 1, 12));
        a(sr, f(1, 31, 1));
        a(pn, f(1, 31, 12));
        a(vs, f(7, 1, 1));
        a(pt, f(7, 1, 12));
        a(vt, f(7, 31, 1));
        a(vs, f(7, 31, 12));
    }
    //////////////////////////////////2. Классы эквивалентности
    //////////////////////////////////2.1 Границы классов эквивалентности
    @Test public void borders(){
        a(pt, f(1,2,3));
        a(pt, f(1,30,3));
    }
    //////////////////////////////////2.2 Впритык слева и справа от границы
    @Test public void leftRightSteps(){
        a(ch, f(1,1,3));
        a(pt, f(1,9,3));
        a(pt, f(1,23,3));
        a(sb, f(1,31,3));
    }
    //////////////////////////////////2.3 Внутри класса эквивалентности
    @Test public void internal(){
        a(sr, f(1,10,1));
        a(ch, f(1,11,1));
        a(pt, f(1,12,1));

        a(pn, f(1,5,2));
        a(ch, f(1,15,2));
        a(vs, f(1,25,2));
    }
    //////////////////////////////////3. Предметная область
    @Test public void subjectArea() {
        a(pn, f(5, 15, 3));
        a(vt, f(5, 1, 6));
        a(pt, f(5, 31, 12));
    }
    //////////////////////////////////4. Реализация

    //////////////////////////////////5. Случайные тесты
    @Test public void random() {
        a(ch, f(3, 17, 7));
        a(sb, f(5, 17, 7));
        a(sb, f(2, 21, 12));
        a(ch, f(1, 15, 3));
        a(pn, f(4, 17, 8));
        a(vt, f(6, 4, 1));
        a(vs, f(7, 31, 12));
        a(sr, f(4, 11, 2));
        a(pn, f(1, 12, 2));
        a(sb, f(2, 23, 3));
        a(pn, f(6, 11, 4));
        a(sr, f(4, 17, 6));
        a(pt, f(6, 4, 3));
        a(vs, f(7, 31, 12));
        a(pt, f(3, 21, 2));
        a(sb, f(5, 17, 4));
        a(ch, f(2, 24, 1));
        a(sr, f(1, 15, 8));
        a(ch, f(4, 17, 9));
        a(vt, f(6, 4, 10));
        a(ch, f(7, 30, 11));
        a(ch, f(3, 17, 4));
        a(ch, f(5, 11, 2));
        a(sr, f(2, 21, 8));
        a(pt, f(1, 14, 9));
        a(sb, f(4, 17, 10));
        a(sr, f(6, 2, 11)); }
    //////////////////////////////////6. Другие особые значения
    @Test public void l(){
        a(pn, f(1,31,12));
        a(vt, f(2,31,12));
        a(sr, f(3,31,12));
        a(ch, f(4,31,12));
        a(pt, f(5,31,12));
        a(sb, f(6,31,12));
        a(vs, f(7,31,12));
        a(pn, f(1,1,1));
        a(vt, f(2,1,1));
        a(sr, f(3,1,1));
        a(ch, f(4,1,1));
        a(pt, f(5,1,1));
        a(sb, f(6,1,1));
        a(vs, f(7,1,1));
        a(vt, f(2,1,1));
        a(sr, f(3,1,1));
        a(ch, f(4,1,1));
        a(pt, f(5,1,1));
        a(sb, f(6,1,1));
        a(vs, f(7,1,1));
    }
}