package task1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static task1.Main.s;

public class MainTest {
    private final int min = Integer.MIN_VALUE;
    private final int max = Integer.MAX_VALUE;
    private void aE(String e, String a){
        assertEquals(e, a);
    }
    ////////////////////////////////1. Граничные значения области определения
    @Test public void mM1() { aE("A = -2147483648, B = -2147483648", s(min, min)); }
    @Test public void mM2() { aE("A = 2147483647, B = 2147483647", s(max, max)); }
    @Test public void mM3() { aE("A = -2147483648, B = 2147483647", s(max, min)); }
    @Test public void mM4() { aE("A = 2147483647, B = -2147483648", s(min, max)); }
    @Test public void mM5() { aE("A = -2147483648, B = 0", s(0, min)); }
    @Test public void mM6() { aE("A = 2147483647, B = 0", s(0, max)); }
    @Test public void mM7() { aE("A = 0, B = 2147483647", s(max, 0)); }
    @Test public void mM8() { aE("A = 0, B = -2147483648", s(min, 0)); }
    @Test public void mM9() { aE("A = -1073741824, B = -2147483648", s(min, min/2)); }
    @Test public void mM10() { aE("A = 1073741823, B = 2147483647", s(max, max/2)); }
    @Test public void mM11() { aE("A = -1073741824, B = 2147483647", s(max, min/2)); }
    @Test public void mM12() { aE("A = 1073741823, B = -2147483648", s(min, max/2)); }
    @Test public void mM13() { aE("A = -2147483648, B = -1073741824", s(min/2, min)); }
    @Test public void mM14() { aE("A = 2147483647, B = 1073741823", s(max/2, max)); }
    @Test public void mM15() { aE("A = 2147483647, B = -1073741824", s(min/2, max)); }
    @Test public void mM16() { aE("A = -2147483648, B = 1073741823", s(max/2, min)); }
    ////////////////////////////////2. Классы эквивалентности
    ////////////////////////////////2.1 Границы классов эквивалентности

    ////////////////////////////////2.2 Впритык справа и слева от границы

    ////////////////////////////////2.3 Внутри класса эквивалентности

    ////////////////////////////////3. Предметная область
    @Test public void e1() { aE("A = 20, B = 0", s(0, 20)); }
    @Test public void e2() { aE("A = 0, B = 100", s(100, 0)); }
    @Test public void e3() { aE("A = -40, B = -30", s(-30, -40)); }
    ////////////////////////////////4. Реализация

    ////////////////////////////////5. Случайные значения
    @Test public void r1() { aE("A = 37, B = 55", s(55, 37)); }
    @Test public void r2() { aE("A = 0, B = 1540", s(1540, 0)); }
    @Test public void r3() { aE("A = -4002, B = -26530000", s(-26530000, -4002)); }
    @Test public void r4() { aE("A = 380000000, B = 25", s(25, 380000000)); }
    @Test public void r5() { aE("A = 1000000000, B = 12545556", s(12545556, 1000000000)); }
    @Test public void r6() { aE("A = -99999, B = -265300000", s(-265300000, -99999)); }
    @Test public void r7() { aE("A = 300000007, B = 500000005", s(500000005, 300000007)); }
    @Test public void r8() { aE("A = 0, B = 10000540", s(10000540, 0)); }
    @Test public void r9() { aE("A = -505200, B = -20006530", s(-20006530, -505200)); }
    @Test public void r10() { aE("A = 99999999, B = 265300000", s(265300000, 99999999)); }
    @Test public void r11() { aE("A = 332145687, B = 55456789", s(55456789, 332145687)); }
    @Test public void r12() { aE("A = 21548445, B = 1540", s(1540, 21548445)); }
    @Test public void r13() { aE("A = -15155576, B = -26530000", s(-26530000, -15155576)); }
    @Test public void r14() { aE("A = 380000000, B = 22255115", s(22255115, 380000000)); }
    @Test public void r15() { aE("A = 999999845, B = 12545556", s(12545556, 999999845)); }
    @Test public void r16() { aE("A = -15668845, B = -265300000", s(-265300000, -15668845)); }
    @Test public void r17() { aE("A = 300000007, B = 2046336252", s(2046336252, 300000007)); }
    @Test public void r18() { aE("A = -254569885, B = 10000540", s(10000540, -254569885)); }
    @Test public void r19() { aE("A = -5052200, B = -20006530", s(-20006530, -5052200)); }
    @Test public void r20() { aE("A = -999999999, B = 265300000", s(265300000, -999999999)); }
}