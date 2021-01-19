package task3;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static task3.Main.f;

public class MainTest {
    private final int min = -2147483647;
    private final int max = 2147483647;

    private void aE(int e, int a){
        assertEquals(e, a);
    }

    //////////////////////////////1. Граничные значения области определения
    @Test public void mM1() { aE(max, f(new int[]{min, min, min, min})); }
    @Test public void mM2() { aE(max, f(new int[]{min, min, min, max})); }
    @Test public void mM3() { aE(max, f(new int[]{min, min, max, min})); }
    @Test public void mM4() { aE(max, f(new int[]{min, min, max, max})); }
    @Test public void mM5() { aE(max, f(new int[]{min, max, min, min})); }
    @Test public void mM6() { aE(max, f(new int[]{min, max, min, max})); }
    @Test public void mM7() { aE(max, f(new int[]{min, max, max, min})); }
    @Test public void mM8() { aE(max, f(new int[]{min, max, max, max})); }
    @Test public void mM9() { aE(max, f(new int[]{max, min, min, min})); }
    @Test public void mM10() { aE(max, f(new int[]{max, min, min, max})); }
    @Test public void mM11() { aE(max, f(new int[]{max, min, max, min})); }
    @Test public void mM12() { aE(max, f(new int[]{max, min, max, max})); }
    @Test public void mM13() { aE(max, f(new int[]{max, max, min, min})); }
    @Test public void mM14() { aE(max, f(new int[]{max, max, min, max})); }
    @Test public void mM15() { aE(max, f(new int[]{max, max, max, min})); }
    @Test public void mM16() { aE(max, f(new int[]{max, max, max, max})); }

    //////////////////////////////2. Классы эквивалентности
    //////////////////////////////2.1 Границы классов эквивалентности

    //////////////////////////////2.2 Впритык слева и справа от границы

    //////////////////////////////2.3 Внутри класса эквивалентности

    //////////////////////////////3. Предметная область
    @Test public void e1() {aE(2, f(new int[]{4,6,8,24}));}
    @Test public void e2() {aE(3, f(new int[]{9,18,24,54}));}
    @Test public void e3() {aE(5, f(new int[]{25,15,100,30}));}
    @Test public void e4() {aE(7, f(new int[]{14,49,28,56}));}
    @Test public void e5() {aE(9, f(new int[]{81,90,144,162}));}
    //////////////////////////////4. Реализация
    @Test public void iZ1() {aE(8, f(new int[]{0,8,8,88}));}
    @Test public void iZ2() {aE(4, f(new int[]{4,0,8,12}));}
    @Test public void iZ3() {aE(10, f(new int[]{30,20,0,10}));}
    @Test public void iZ4() {aE(6, f(new int[]{24,6,12,0}));}
    @Test public void iZ5() {aE (Integer.MAX_VALUE, f(new int[]{0,0,0,0}));}
    //////////////////////////////5. Случайные значения
    @Test public void r1() { aE(10, f(new int[]{10, 20, 30, 40})); }
    @Test public void r2() { aE(2, f(new int[]{2, 4, 8, 16})); }
    @Test public void r3() { aE(10, f(new int[]{50, 400, 30, 170})); }
    @Test public void r4() { aE(1, f(new int[]{7, 100, 200, 400})); }
    @Test public void r5() { aE(7, f(new int[]{49, -70, 21, 35})); }
    @Test public void r6() { aE(11, f(new int[]{33, 22, 121, 99})); }
    @Test public void r7() { aE(3, f(new int[]{30, 30, 30, 3})); }
    @Test public void r8() { aE(2, f(new int[]{122, 24, 86, 16})); }
    @Test public void r9() { aE(100, f(new int[]{500, 4000, 300, 1700})); }
    @Test public void r10() { aE(10, f(new int[]{70, 1000, 2000, 4000})); }
    @Test public void r11() { aE(1, f(new int[]{15, 20, 30, 4})); }
    @Test public void r12() { aE(20, f(new int[]{20, 40, 80, 160})); }
    @Test public void r13() { aE(3, f(new int[]{0, 30, 3, 0})); }
    @Test public void r14() { aE(1, f(new int[]{7, 1, 200, 400})); }
    @Test public void r15() { aE(35, f(new int[]{490, -70, 210, 35})); }
    @Test public void r16() { aE(11, f(new int[]{33, 22, 121, 99})); }
    @Test public void r17() { aE(10, f(new int[]{10, 20, 30, 40})); }
    @Test public void r18() { aE(4, f(new int[]{8, 4, 8, 16})); }
    @Test public void r19() { aE(10, f(new int[]{50, 400, 30, 170})); }
    @Test public void r20() { aE(8, f(new int[]{8, 64, 72, 80})); }
    @Test public void r21() { aE(12, f(new int[]{12, 24, 36, 144})); }
    @Test public void r22() { aE(7, f(new int[]{21, 49, 70, 14})); }
    @Test public void r23() { aE(57, f(new int[]{57, 57, 114, 228})); }
    @Test public void r24() { aE(19, f(new int[]{38, 380, 19, 38})); }
    @Test public void r25() { aE(7, f(new int[]{49, 70, 21, 35})); }
    @Test public void r26() { aE(11, f(new int[]{33, 22, 121, 99})); }
    @Test public void r27() { aE(10, f(new int[]{10, 20, 30, 40})); }
    @Test public void r28() { aE(2, f(new int[]{2, 4, 8, 16})); }
    @Test public void r29() { aE(10, f(new int[]{50, 400, 30, 170})); }
    @Test public void r30() { aE(1, f(new int[]{7, 100, 200, 400})); }
}