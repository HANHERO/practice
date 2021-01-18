package task5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static task5.Main.f;

public class MainTest {
    private final String pn = "Понедельник";
    private final String vt = "Вторник";
    private final String sr = "Среда";
    private final String ch = "Четверг";
    private final String pt = "Пятница";
    private final String sb = "Суббота";
    private final String vs = "Воскресенье";

    private void aE(String e, String a){ assertEquals(e, a); }
    //////////////////////////////////1. Граничные значения области определения
    @Test public void mM1() { aE(pn, f(1, 1, 1)); }
    @Test public void mM2() { aE(sb, f(1, 1, 12)); }
    @Test public void mM3() { aE(sr, f(1, 31, 1)); }
    @Test public void mM4() { aE(pn, f(1, 31, 12)); }
    @Test public void mM5() { aE(vs, f(7, 1, 1)); }
    @Test public void mM6() { aE(pt, f(7, 1, 12)); }
    @Test public void mM7() { aE(vt, f(7, 31, 1)); }
    @Test public void mM8() { aE(vs, f(7, 31, 12)); }
    //////////////////////////////////2. Классы эквивалентности
    //////////////////////////////////2.1 Границы классов эквивалентности
    @Test public void wFD(){ aE(pn, f(1,8,1)); }
    @Test public void wLD(){ aE(vs, f(1,14,1)); }

    @Test public void mFD(){ aE(ch, f(1,1,2)); }
    @Test public void mLD(){ aE(sr, f(1,28,2)); }
    //////////////////////////////////2.2 Впритык слева и справа от границы
    @Test public void wBFD(){ aE(vs, f(1,7,1)); }
    @Test public void wAFD(){ aE(vt, f(1,9,1)); }
    @Test public void wBLD(){ aE(sb, f(1,13,1)); }
    @Test public void wALD(){ aE(pn, f(1,15,1)); }

    @Test public void mBFD(){ aE(sr, f(1,31,1)); }
    @Test public void mAFD(){ aE(pt, f(1,2,2)); }
    @Test public void mBLD(){ aE(vt, f(1,27,2)); }
    @Test public void mALD(){ aE(ch, f(1,1,3)); }
    //////////////////////////////////2.3 Внутри класса эквивалентности
    @Test public void wRDOW1(){ aE(sr, f(1,10,1)); }
    @Test public void wRDOW2(){ aE(ch, f(1,11,1)); }
    @Test public void wRDOW3(){ aE(pt, f(1,12,1)); }

    @Test public void mRDOW1(){ aE(pn, f(1,5,2)); }
    @Test public void mRDOW2(){ aE(ch, f(1,15,2)); }
    @Test public void mRDOW3(){ aE(vs, f(1,25,2)); }
    //////////////////////////////////3. Предметная область
    @Test public void s1() { aE(pn, f(5, 15, 3)); }
    @Test public void s2() { aE(vt, f(5, 1, 6)); }
    @Test public void s3() { aE(pt, f(5, 31, 12)); }
    //////////////////////////////////4. Реализация

    //////////////////////////////////5. Случайные тесты
    @Test public void r1() { aE(ch, f(3, 17, 7)); }
    @Test public void r2() { aE(sb, f(5, 17, 7)); }
    @Test public void r3() { aE(sb, f(2, 21, 12)); }
    @Test public void r4() { aE(ch, f(1, 15, 3)); }
    @Test public void r5() { aE(pn, f(4, 17, 8)); }
    @Test public void r6() { aE(vt, f(6, 4, 1)); }
    @Test public void r10() { aE(vs, f(7, 31, 12)); }
    @Test public void r11() { aE(sr, f(4, 11, 2)); }
    @Test public void r12() { aE(pn, f(1, 12, 2)); }
    @Test public void r13() { aE(sb, f(2, 23, 3)); }
    @Test public void r14() { aE(pn, f(6, 11, 4)); }
    @Test public void r15() { aE(sr, f(4, 17, 6)); }
    @Test public void r16() { aE(pt, f(6, 4, 3)); }
    @Test public void r17() { aE(vs, f(7, 31, 12)); }
    @Test public void r18() { aE(pt, f(3, 21, 2)); }
    @Test public void r19() { aE(sb, f(5, 17, 4)); }
    @Test public void r20() { aE(ch, f(2, 24, 1)); }
    @Test public void r21() { aE(sr, f(1, 15, 8)); }
    @Test public void r22() { aE(ch, f(4, 17, 9)); }
    @Test public void r23() { aE(vt, f(6, 4, 10)); }
    @Test public void r24() { aE(ch, f(7, 30, 11)); }
    @Test public void r25() { aE(ch, f(3, 17, 4)); }
    @Test public void r26() { aE(ch, f(5, 11, 2)); }
    @Test public void r27() { aE(sr, f(2, 21, 8)); }
    @Test public void r28() { aE(pt, f(1, 14, 9)); }
    @Test public void r29() { aE(sb, f(4, 17, 10)); }
    @Test public void r30() { aE(sr, f(6, 2, 11)); }
    //////////////////////////////////6. Особые значения
    @Test public void lD1(){aE(pn, f(1,31,12)); }
    @Test public void lD2(){ aE(vt, f(2,31,12)); }
    @Test public void lD3(){ aE(sr, f(3,31,12)); }
    @Test public void lD4(){ aE(ch, f(4,31,12)); }
    @Test public void lD5(){ aE(pt, f(5,31,12)); }
    @Test public void lD6(){ aE(sb, f(6,31,12)); }
    @Test public void lD7(){ aE(vs, f(7,31,12)); }
    @Test public void fD1(){ aE(pn, f(1,1,1)); }
    @Test public void fD2(){ aE(vt, f(2,1,1)); }
    @Test public void fD3(){ aE(sr, f(3,1,1)); }
    @Test public void fD4(){ aE(ch, f(4,1,1)); }
    @Test public void fD5(){ aE(pt, f(5,1,1)); }
    @Test public void fD6(){ aE(sb, f(6,1,1)); }
    @Test public void fD7(){ aE(vs, f(7,1,1)); }
    @Test public void fL2(){ aE(vt, f(2,1,1)); }
    @Test public void fL3(){ aE(sr, f(3,1,1)); }
    @Test public void fL4(){ aE(ch, f(4,1,1)); }
    @Test public void fL5(){ aE(pt, f(5,1,1)); }
    @Test public void fL6(){ aE(sb, f(6,1,1)); }
    @Test public void fL7(){ aE(vs, f(7,1,1)); }
}