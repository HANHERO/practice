package task2;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static task2.Main.d;

public class MainTest {
    private final int min = 1;
    private final int max = Integer.MAX_VALUE;
    private void aE(String e, String a){
        assertEquals(e, a);
    }
    ///////////////////////////////////////1 Минимальное/максимальное значение аргументов
    @Test public void mM1() { aE("1 этаж, 1 подъезд.", d(min, min, min)); }
    @Test public void mM2() { aE("1 этаж, 1 подъезд.", d(min, min, max)); }
    @Test public void mM3() { aE("1 этаж, 1 подъезд.", d(min, max, min)); }
    @Test public void mM4() { aE("1 этаж, 1 подъезд.", d(min, max, max)); }
    @Test public void mM5() { aE("1 этаж, 2147483647 подъезд.", d(max, min, min)); }
    @Test public void mM6() { aE("2147483647 этаж, 1 подъезд.", d(max, min, max)); }
    @Test public void mM7() { aE("1 этаж, 1 подъезд.", d(max, max, min)); }
    @Test public void mM8() { aE("1 этаж, 1 подъезд.", d(max, max, max)); }
    ////////////////////////////////////////2 Классы эквивалентности
    ////////////////////////////////////////2.1 Границы классов эквивалентности
    @Test public void fCFAAF() { aE("2 этаж, 1 подъезд.", d(11, 10, 10));}
    @Test public void fCLA() { aE("2 этаж, 1 подъезд.", d(20, 10, 10)); }

    @Test public void eCFAAE() { aE("1 этаж, 2 подъезд.", d(101, 10, 10)); }
    @Test public void eCLAAE() { aE("10 этаж, 2 подъезд.", d(200, 10, 10)); }
    ////////////////////////////////////////2.2 Впритык слева и справа от грацницы
    @Test public void fFAAFBLS() { aE("1 этаж, 1 подъезд.", d(10, 10, 10)); }
    @Test public void fFAAFRBS() { aE("2 этаж, 1 подъезд.", d(12, 10, 10)); }
    @Test public void fLALBS() { aE("2 этаж, 1 подъезд.", d(19, 10, 10)); }
    @Test public void fLARBS() { aE("3 этаж, 1 подъезд.", d(21, 10, 10)); }

    @Test public void eFAAELS() { aE("10 этаж, 1 подъезд.", d(100, 10, 10)); }
    @Test public void eFAAERS() { aE("1 этаж, 2 подъезд.", d(102, 10, 10)); }
    @Test public void eLAAELS() { aE("10 этаж, 2 подъезд.", d(199, 10, 10)); }
    @Test public void eLAAERS() { aE("1 этаж, 3 подъезд.", d(201, 10, 10)); }
    ////////////////////////////////////////2.3 Внутри класса эквивалентности
    @Test public void fI1() { aE("2 этаж, 1 подъезд.", d(13, 10, 10)); }
    @Test public void fI2() { aE("2 этаж, 1 подъезд.", d(14, 10, 10)); }
    @Test public void fI3() { aE("2 этаж, 1 подъезд.", d(15, 10, 10)); }
    @Test public void fI4() { aE("2 этаж, 1 подъезд.", d(16, 10, 10)); }
    @Test public void fI5() { aE("2 этаж, 1 подъезд.", d(17, 10, 10)); }
    @Test public void fI6() { aE("2 этаж, 1 подъезд.", d(18, 10, 10)); }

    @Test public void eI1() { aE("2 этаж, 2 подъезд.", d(111, 10, 10)); }
    @Test public void eI2() { aE("3 этаж, 2 подъезд.", d(125, 10, 10)); }
    @Test public void eI3() { aE("4 этаж, 2 подъезд.", d(135, 10, 10)); }
    @Test public void eI4() { aE("5 этаж, 2 подъезд.", d(146, 10, 10)); }
    @Test public void eI5() { aE("6 этаж, 2 подъезд.", d(157, 10, 10)); }
    @Test public void eI6() { aE("7 этаж, 2 подъезд.", d(168, 10, 10)); }
    @Test public void eI7() { aE("8 этаж, 2 подъезд.", d(178, 10, 10)); }
    @Test public void eI8() { aE("9 этаж, 2 подъезд.", d(188, 10, 10)); }
    ////////////////////////////////////////3. Предметная область
    @Test public void e1() { aE("3 этаж, 1 подъезд.", d(15, 6, 9)); }
    @Test public void e2() { aE("2 этаж, 4 подъезд.", d(113, 4, 9)); }
    @Test public void e3() { aE("1 этаж, 3 подъезд.", d(44, 4, 5)); }
    @Test public void e4() { aE("5 этаж, 2 подъезд.", d(56, 4, 9)); }
    @Test public void e5() { aE("9 этаж, 9 подъезд.", d(322, 4, 9)); }
    ////////////////////////////////////////4. Реализация
    @Test public void o1() { aE("Введены не корректные данные.", d(0, 1, 1)); }
    @Test public void o2() { aE("Введены не корректные данные.", d(1, 0, 1)); }
    @Test public void o3() { aE("Введены не корректные данные.", d(1, 1, 0)); }
    @Test public void o4() { aE("Введены не корректные данные.", d(-1, 1, 1)); }
    @Test public void o5() { aE("Введены не корректные данные.", d(1, -1, 1)); }
    @Test public void o6() { aE("Введены не корректные данные.", d(1, 1, -1)); }
    @Test(expected = Exception.class) public void iI1() { d(Integer.parseInt("hfgvy62%S@^"), 1,1); }
    @Test(expected = Exception.class) public void iI2() { d(1, Integer.parseInt("hfgvy62%S@^"),1); }
    @Test(expected = Exception.class) public void iI3() { d(1, 1,Integer.parseInt("hfgvy62%S@^")); }
    @Test(expected = Exception.class) public void iI4() { d(Integer.parseInt("99999999999999"), 1,1); }
    @Test(expected = Exception.class) public void iI5() { d(1, Integer.parseInt("99999999999999"),1); }
    @Test(expected = Exception.class) public void iI6() { d(1, 1,Integer.parseInt("99999999999999")); }
    ///////////////////////////////////////5. Случайные значения
    @Test public void r1() { aE("2 этаж, 1 подъезд.", d(12, 6, 5)); }
    @Test public void r2() { aE("1 этаж, 2 подъезд.", d(40, 4, 9)); }
    @Test public void r3() { aE("3 этаж, 1 подъезд.", d(15, 5, 10)); }
    @Test public void r4() { aE("2 этаж, 4 подъезд.", d(24, 3, 2)); }
    @Test public void r5() { aE("4 этаж, 1 подъезд.", d(16, 4, 4)); }
}