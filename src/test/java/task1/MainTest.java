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
    private int iP(String s){
        return Integer.parseInt(s);
    }
    ////////////////////////////////1. Максимальное/минимальное значение аргумента
    @Test public void mM1() { aE("A = -2147483648, B = -2147483648", s(min, min)); }
    @Test public void mM2() { aE("A = 2147483647, B = 2147483647", s(max, max)); }
    @Test public void mM3() { aE("A = -2147483648, B = 2147483647", s(max, min)); }
    @Test public void mM4() { aE("A = 2147483647, B = -2147483648", s(min, max)); }
    @Test public void mM5() { aE("A = -2147483648, B = -2147483648", s(min, 0)); }
    @Test public void mM6() { aE("A = 2147483647, B = 2147483647", s(0, max)); }
    @Test public void mM7() { aE("A = -2147483648, B = 2147483647", s(max, 0)); }
    @Test public void mM8() { aE("A = 2147483647, B = -2147483648", s(0, min)); }
    ////////////////////////////////2. Классы эквивалентности
    ////////////////////////////////2.1 Границы классов эквивалентности

    ////////////////////////////////2.2 Впритык справа и слева от границы
    @Test(expected = Exception.class) public void rSFRB1() { s(0, iP("2147483648")); }
    @Test public void lSFRB1(){ aE("A = 2147483646, B = 0", s(0, 2147483646)); }
    @Test(expected = Exception.class) public void lSFLB1(){ s(iP("-2147483649"), 0); }
    @Test public void rSFLB1(){ aE("A = 0, B = -2147483647", s(-2147483647, 0)); }
    @Test public void rSFRB2() { aE("A = -2147483647, B = 0", s(0, iP("-2147483647"))); }
    @Test(expected = Exception.class) public void lSFRB2(){ s(0, iP("-2147483649")); }
    @Test public void lSFLB2(){ aE("A = 0, B = 2147483646", s(2147483646, 0)); }
    @Test(expected = Exception.class) public void rSFLB2(){ s(iP("2147483648"), 0); }
    ////////////////////////////////2.3 Внутри класса эквивалентности
    @Test public void i1() { aE("A = 5, B = 3", s(3, 5)); }
    @Test public void i2() { aE("A = 3, B = 5", s(5, 3)); }
    @Test public void i3() { aE("A = 5, B = -1000", s(-1000, 5)); }
    @Test public void i4() { aE("A = -1000, B = 3", s(3, -1000)); }
    ////////////////////////////////3. Предметная область
    @Test public void e1() { aE("A = 20, B = 0", s(0, 20)); }
    @Test public void e2() { aE("A = 0, B = 100", s(100, 0)); }
    @Test public void e3() { aE("A = -40, B = -30", s(-30, -40)); }
    ////////////////////////////////4. Реализация
    @Test(expected = Exception.class) public void iI1(){ s(iP("ab$@#%c"), 0); }
    @Test(expected = Exception.class) public void iI2(){ s(iP("-99999999999"), 0); }
    @Test(expected = Exception.class) public void iI3(){ s(0, iP("99999999999")); }
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