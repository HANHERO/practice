package task5;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static task5.Year.f;

public class YearTest {
    private final ArrayList<TestScenario> testScenarios = new ArrayList<>();

    private void setUpScenarios() {
        String pn = "Понедельник";
        String vt = "Вторник";
        String sr = "Среда";
        String ch = "Четверг";
        String pt = "Пятница";
        String sb = "Суббота";
        String vs = "Воскресенье";
        ////////////////////////////////1. Граничные значения области определения
        s(pn, 1, 1, 1);
        s(sr, 1, 31, 1);
        s(ch, 1, 1, 2);
        s(sr, 1, 28, 2);
        s(ch, 1, 1, 3);
        s(sb, 1, 31, 3);
        s(vs, 1, 1, 4);
        s(pn, 1, 30, 4);
        s(vt, 1, 1, 5);
        s(ch, 1, 31, 5);
        s(pt, 1, 1, 6);
        s(sb, 1, 30, 6);
        s(vs, 1, 1, 7);
        s(vt, 1, 31, 7);
        s(sr, 1, 1, 8);
        s(pt, 1, 31, 8);
        s(sb, 1, 1, 9);
        s(vs, 1, 30, 9);
        s(pn, 1, 1, 10);
        s(sr, 1, 31, 10);
        s(ch, 1, 1, 11);
        s(pt, 1, 30, 11);
        s(sb, 1, 1, 12);
        s(pn, 1, 31, 12);

        s(vs, 7, 1, 1);
        s(vt, 7, 31, 1);
        s(sr, 7, 1, 2);
        s(vt, 7, 28, 2);
        s(sr, 7, 1, 3);
        s(pt, 7, 31, 3);
        s(sb, 7, 1, 4);
        s(vs, 7, 30, 4);
        s(pn, 7, 1, 5);
        s(sr, 7, 31, 5);
        s(ch, 7, 1, 6);
        s(pt, 7, 30, 6);
        s(sb, 7, 1, 7);
        s(pn, 7, 31, 7);
        s(vt, 7, 1, 8);
        s(ch, 7, 31, 8);
        s(pt, 7, 1, 9);
        s(sb, 7, 30, 9);
        s(vs, 7, 1, 10);
        s(vt, 7, 31, 10);
        s(sr, 7, 1, 11);
        s(ch, 7, 30, 11);
        s(pt, 7, 1, 12);
        s(vs, 7, 31, 12);

        s(pn, 1, 1, 1);
        s(sr, 1, 31, 1);
        s(vt, 2, 1, 1);
        s(ch, 2, 31, 1);
        s(sr, 3, 1, 1);
        s(pt, 3, 31, 1);
        s(ch, 4, 1, 1);
        s(sb, 4, 31, 1);
        s(pt, 5, 1, 1);
        s(vs, 5, 31, 1);
        s(sb, 6, 1, 1);
        s(pn, 6, 31, 1);
        s(vs, 7, 1, 1);
        s(vt, 7, 31, 1);

        s(sb, 1, 1, 12);
        s(pn, 1, 31, 12);
        s(vs, 2, 1, 12);
        s(vt, 2, 31, 12);
        s(pn, 3, 1, 12);
        s(sr, 3, 31, 12);
        s(vt, 4, 1, 12);
        s(ch, 4, 31, 12);
        s(sr, 5, 1, 12);
        s(pt, 5, 31, 12);
        s(ch, 6, 1, 12);
        s(sb, 6, 31, 12);
        s(pt, 7, 1, 12);
        s(vs, 7, 31, 12);
        //////////////////////////////////2. Классы эквивалентности
        //////////////////////////////////2.1 Границы классов эквивалентности
        s(pn, 1, 1, 1);
        s(sr, 1, 31, 1);
        s(ch, 1, 1, 2);
        s(sr, 1, 28, 2);
        s(ch, 1, 1, 3);
        s(sb, 1, 31, 3);
        s(vs, 1, 1, 4);
        s(pn, 1, 30, 4);
        s(vt, 1, 1, 5);
        s(ch, 1, 31, 5);
        s(pt, 1, 1, 6);
        s(sb, 1, 30, 6);
        s(vs, 1, 1, 7);
        s(vt, 1, 31, 7);
        s(sr, 1, 1, 8);
        s(pt, 1, 31, 8);
        s(sb, 1, 1, 9);
        s(vs, 1, 30, 9);
        s(pn, 1, 1, 10);
        s(sr, 1, 31, 10);
        s(ch, 1, 1, 11);
        s(pt, 1, 30, 11);
        s(sb, 1, 1, 12);
        s(pn, 1, 31, 12);

        s(vt, 2, 1, 1);
        s(ch, 2, 31, 1);
        s(pt, 2, 1, 2);
        s(ch, 2, 28, 2);
        s(pt, 2, 1, 3);
        s(vs, 2, 31, 3);
        s(pn, 2, 1, 4);
        s(vt, 2, 30, 4);
        s(sr, 2, 1, 5);
        s(pt, 2, 31, 5);
        s(sb, 2, 1, 6);
        s(vs, 2, 30, 6);
        s(pn, 2, 1, 7);
        s(sr, 2, 31, 7);
        s(ch, 2, 1, 8);
        s(sb, 2, 31, 8);
        s(vs, 2, 1, 9);
        s(pn, 2, 30, 9);
        s(vt, 2, 1, 10);
        s(ch, 2, 31, 10);
        s(pt, 2, 1, 11);
        s(sb, 2, 30, 11);
        s(vs, 2, 1, 12);
        s(vt, 2, 31, 12);

        s(sr, 3, 1, 1);
        s(pt, 3, 31, 1);
        s(sb, 3, 1, 2);
        s(pt, 3, 28, 2);
        s(sb, 3, 1, 3);
        s(pn, 3, 31, 3);
        s(vt, 3, 1, 4);
        s(sr, 3, 30, 4);
        s(ch, 3, 1, 5);
        s(sb, 3, 31, 5);
        s(vs, 3, 1, 6);
        s(pn, 3, 30, 6);
        s(vt, 3, 1, 7);
        s(ch, 3, 31, 7);
        s(pt, 3, 1, 8);
        s(vs, 3, 31, 8);
        s(pn, 3, 1, 9);
        s(vt, 3, 30, 9);
        s(sr, 3, 1, 10);
        s(pt, 3, 31, 10);
        s(sb, 3, 1, 11);
        s(vs, 3, 30, 11);
        s(pn, 3, 1, 12);
        s(sr, 3, 31, 12);

        s(ch, 4, 1, 1);
        s(sb, 4, 31, 1);
        s(vs, 4, 1, 2);
        s(sb, 4, 28, 2);
        s(vs, 4, 1, 3);
        s(vt, 4, 31, 3);
        s(sr, 4, 1, 4);
        s(ch, 4, 30, 4);
        s(pt, 4, 1, 5);
        s(vs, 4, 31, 5);
        s(pn, 4, 1, 6);
        s(vt, 4, 30, 6);
        s(sr, 4, 1, 7);
        s(pt, 4, 31, 7);
        s(sb, 4, 1, 8);
        s(pn, 4, 31, 8);
        s(vt, 4, 1, 9);
        s(sr, 4, 30, 9);
        s(ch, 4, 1, 10);
        s(sb, 4, 31, 10);
        s(vs, 4, 1, 11);
        s(pn, 4, 30, 11);
        s(vt, 4, 1, 12);
        s(ch, 4, 31, 12);

        s(pt, 5, 1, 1);
        s(vs, 5, 31, 1);
        s(pn, 5, 1, 2);
        s(vs, 5, 28, 2);
        s(pn, 5, 1, 3);
        s(sr, 5, 31, 3);
        s(ch, 5, 1, 4);
        s(pt, 5, 30, 4);
        s(sb, 5, 1, 5);
        s(pn, 5, 31, 5);
        s(vt, 5, 1, 6);
        s(sr, 5, 30, 6);
        s(ch, 5, 1, 7);
        s(sb, 5, 31, 7);
        s(vs, 5, 1, 8);
        s(vt, 5, 31, 8);
        s(sr, 5, 1, 9);
        s(ch, 5, 30, 9);
        s(pt, 5, 1, 10);
        s(vs, 5, 31, 10);
        s(pn, 5, 1, 11);
        s(vt, 5, 30, 11);
        s(sr, 5, 1, 12);
        s(pt, 5, 31, 12);

        s(sb, 6, 1, 1);
        s(pn, 6, 31, 1);
        s(vt, 6, 1, 2);
        s(pn, 6, 28, 2);
        s(vt, 6, 1, 3);
        s(ch, 6, 31, 3);
        s(pt, 6, 1, 4);
        s(sb, 6, 30, 4);
        s(vs, 6, 1, 5);
        s(vt, 6, 31, 5);
        s(sr, 6, 1, 6);
        s(ch, 6, 30, 6);
        s(pt, 6, 1, 7);
        s(vs, 6, 31, 7);
        s(pn, 6, 1, 8);
        s(sr, 6, 31, 8);
        s(ch, 6, 1, 9);
        s(pt, 6, 30, 9);
        s(sb, 6, 1, 10);
        s(pn, 6, 31, 10);
        s(vt, 6, 1, 11);
        s(sr, 6, 30, 11);
        s(ch, 6, 1, 12);
        s(sb, 6, 31, 12);

        s(vs, 7, 1, 1);
        s(vt, 7, 31, 1);
        s(sr, 7, 1, 2);
        s(vt, 7, 28, 2);
        s(sr, 7, 1, 3);
        s(pt, 7, 31, 3);
        s(sb, 7, 1, 4);
        s(vs, 7, 30, 4);
        s(pn, 7, 1, 5);
        s(sr, 7, 31, 5);
        s(ch, 7, 1, 6);
        s(pt, 7, 30, 6);
        s(sb, 7, 1, 7);
        s(pn, 7, 31, 7);
        s(vt, 7, 1, 8);
        s(ch, 7, 31, 8);
        s(pt, 7, 1, 9);
        s(sb, 7, 30, 9);
        s(vs, 7, 1, 10);
        s(vt, 7, 31, 10);
        s(sr, 7, 1, 11);
        s(ch, 7, 30, 11);
        s(pt, 7, 1, 12);
        s(vs, 7, 31, 12);
        ////////////////////////////////////2.2 Впритык слева и справа от границы
        s(pn, 1, 1, 1);
        s(ch, 1, 1, 2);
        s(ch, 1, 1, 3);
        s(vs, 1, 1, 4);
        s(vt, 1, 1, 5);
        s(pt, 1, 1, 6);
        s(vs, 1, 1, 7);
        s(sr, 1, 1, 8);
        s(sb, 1, 1, 9);
        s(pn, 1, 1, 10);
        s(ch, 1, 1, 11);
        s(sb, 1, 1, 12);

        s(vt, 2, 1, 1);
        s(pt, 2, 1, 2);
        s(pt, 2, 1, 3);
        s(pn, 2, 1, 4);
        s(sr, 2, 1, 5);
        s(sb, 2, 1, 6);
        s(pn, 2, 1, 7);
        s(ch, 2, 1, 8);
        s(vs, 2, 1, 9);
        s(vt, 2, 1, 10);
        s(pt, 2, 1, 11);
        s(vs, 2, 1, 12);

        s(sr, 3, 1, 1);
        s(sb, 3, 1, 2);
        s(sb, 3, 1, 3);
        s(vt, 3, 1, 4);
        s(ch, 3, 1, 5);
        s(vs, 3, 1, 6);
        s(vt, 3, 1, 7);
        s(pt, 3, 1, 8);
        s(pn, 3, 1, 9);
        s(sr, 3, 1, 10);
        s(sb, 3, 1, 11);
        s(pn, 3, 1, 12);

        s(ch, 4, 1, 1);
        s(vs, 4, 1, 2);
        s(vs, 4, 1, 3);
        s(sr, 4, 1, 4);
        s(pt, 4, 1, 5);
        s(pn, 4, 1, 6);
        s(sr, 4, 1, 7);
        s(sb, 4, 1, 8);
        s(vt, 4, 1, 9);
        s(ch, 4, 1, 10);
        s(vs, 4, 1, 11);
        s(vt, 4, 1, 12);

        s(pt, 5, 1, 1);
        s(pn, 5, 1, 2);
        s(pn, 5, 1, 3);
        s(ch, 5, 1, 4);
        s(sb, 5, 1, 5);
        s(vt, 5, 1, 6);
        s(ch, 5, 1, 7);
        s(vs, 5, 1, 8);
        s(sr, 5, 1, 9);
        s(pt, 5, 1, 10);
        s(pn, 5, 1, 11);
        s(sr, 5, 1, 12);

        s(sb, 6, 1, 1);
        s(vt, 6, 1, 2);
        s(vt, 6, 1, 3);
        s(pt, 6, 1, 4);
        s(vs, 6, 1, 5);
        s(sr, 6, 1, 6);
        s(pt, 6, 1, 7);
        s(pn, 6, 1, 8);
        s(ch, 6, 1, 9);
        s(sb, 6, 1, 10);
        s(vt, 6, 1, 11);
        s(ch, 6, 1, 12);

        s(vs, 7, 1, 1);
        s(sr, 7, 1, 2);
        s(sr, 7, 1, 3);
        s(sb, 7, 1, 4);
        s(pn, 7, 1, 5);
        s(ch, 7, 1, 6);
        s(sb, 7, 1, 7);
        s(vt, 7, 1, 8);
        s(pt, 7, 1, 9);
        s(vs, 7, 1, 10);
        s(sr, 7, 1, 11);
        s(pt, 7, 1, 12);

        s(vt, 1, 2, 1);
        s(pt, 1, 2, 2);
        s(pt, 1, 2, 3);
        s(pn, 1, 2, 4);
        s(sr, 1, 2, 5);
        s(sb, 1, 2, 6);
        s(pn, 1, 2, 7);
        s(ch, 1, 2, 8);
        s(vs, 1, 2, 9);
        s(vt, 1, 2, 10);
        s(pt, 1, 2, 11);
        s(vs, 1, 2, 12);

        s(sr, 2, 2, 1);
        s(sb, 2, 2, 2);
        s(sb, 2, 2, 3);
        s(vt, 2, 2, 4);
        s(ch, 2, 2, 5);
        s(vs, 2, 2, 6);
        s(vt, 2, 2, 7);
        s(pt, 2, 2, 8);
        s(pn, 2, 2, 9);
        s(sr, 2, 2, 10);
        s(sb, 2, 2, 11);
        s(pn, 2, 2, 12);

        s(ch, 3, 2, 1);
        s(vs, 3, 2, 2);
        s(vs, 3, 2, 3);
        s(sr, 3, 2, 4);
        s(pt, 3, 2, 5);
        s(pn, 3, 2, 6);
        s(sr, 3, 2, 7);
        s(sb, 3, 2, 8);
        s(vt, 3, 2, 9);
        s(ch, 3, 2, 10);
        s(vs, 3, 2, 11);
        s(vt, 3, 2, 12);

        s(pt, 4, 2, 1);
        s(pn, 4, 2, 2);
        s(pn, 4, 2, 3);
        s(ch, 4, 2, 4);
        s(sb, 4, 2, 5);
        s(vt, 4, 2, 6);
        s(ch, 4, 2, 7);
        s(vs, 4, 2, 8);
        s(sr, 4, 2, 9);
        s(pt, 4, 2, 10);
        s(pn, 4, 2, 11);
        s(sr, 4, 2, 12);

        s(sb, 5, 2, 1);
        s(vt, 5, 2, 2);
        s(vt, 5, 2, 3);
        s(pt, 5, 2, 4);
        s(vs, 5, 2, 5);
        s(sr, 5, 2, 6);
        s(pt, 5, 2, 7);
        s(pn, 5, 2, 8);
        s(ch, 5, 2, 9);
        s(sb, 5, 2, 10);
        s(vt, 5, 2, 11);
        s(ch, 5, 2, 12);

        s(vs, 6, 2, 1);
        s(sr, 6, 2, 2);
        s(sr, 6, 2, 3);
        s(sb, 6, 2, 4);
        s(pn, 6, 2, 5);
        s(ch, 6, 2, 6);
        s(sb, 6, 2, 7);
        s(vt, 6, 2, 8);
        s(pt, 6, 2, 9);
        s(vs, 6, 2, 10);
        s(sr, 6, 2, 11);
        s(pt, 6, 2, 12);

        s(pn, 7, 2, 1);
        s(ch, 7, 2, 2);
        s(ch, 7, 2, 3);
        s(vs, 7, 2, 4);
        s(vt, 7, 2, 5);
        s(pt, 7, 2, 6);
        s(vs, 7, 2, 7);
        s(sr, 7, 2, 8);
        s(sb, 7, 2, 9);
        s(pn, 7, 2, 10);
        s(ch, 7, 2, 11);
        s(sb, 7, 2, 12);

        s(sr, 1, 31, 1);
        s(sr, 1, 28, 2);
        s(sb, 1, 31, 3);
        s(pn, 1, 30, 4);
        s(ch, 1, 31, 5);
        s(sb, 1, 30, 6);
        s(vt, 1, 31, 7);
        s(pt, 1, 31, 8);
        s(vs, 1, 30, 9);
        s(sr, 1, 31, 10);
        s(pt, 1, 30, 11);
        s(pn, 1, 31, 12);

        s(ch, 2, 31, 1);
        s(ch, 2, 28, 2);
        s(vs, 2, 31, 3);
        s(vt, 2, 30, 4);
        s(pt, 2, 31, 5);
        s(vs, 2, 30, 6);
        s(sr, 2, 31, 7);
        s(sb, 2, 31, 8);
        s(pn, 2, 30, 9);
        s(ch, 2, 31, 10);
        s(sb, 2, 30, 11);
        s(vt, 2, 31, 12);

        s(pt, 3, 31, 1);
        s(pt, 3, 28, 2);
        s(pn, 3, 31, 3);
        s(sr, 3, 30, 4);
        s(sb, 3, 31, 5);
        s(pn, 3, 30, 6);
        s(ch, 3, 31, 7);
        s(vs, 3, 31, 8);
        s(vt, 3, 30, 9);
        s(pt, 3, 31, 10);
        s(vs, 3, 30, 11);
        s(sr, 3, 31, 12);

        s(sb, 4, 31, 1);
        s(sb, 4, 28, 2);
        s(vt, 4, 31, 3);
        s(ch, 4, 30, 4);
        s(vs, 4, 31, 5);
        s(vt, 4, 30, 6);
        s(pt, 4, 31, 7);
        s(pn, 4, 31, 8);
        s(sr, 4, 30, 9);
        s(sb, 4, 31, 10);
        s(pn, 4, 30, 11);
        s(ch, 4, 31, 12);

        s(vs, 5, 31, 1);
        s(vs, 5, 28, 2);
        s(sr, 5, 31, 3);
        s(pt, 5, 30, 4);
        s(pn, 5, 31, 5);
        s(sr, 5, 30, 6);
        s(sb, 5, 31, 7);
        s(vt, 5, 31, 8);
        s(ch, 5, 30, 9);
        s(vs, 5, 31, 10);
        s(vt, 5, 30, 11);
        s(pt, 5, 31, 12);

        s(pn, 6, 31, 1);
        s(pn, 6, 28, 2);
        s(ch, 6, 31, 3);
        s(sb, 6, 30, 4);
        s(vt, 6, 31, 5);
        s(ch, 6, 30, 6);
        s(vs, 6, 31, 7);
        s(sr, 6, 31, 8);
        s(pt, 6, 30, 9);
        s(pn, 6, 31, 10);
        s(sr, 6, 30, 11);
        s(sb, 6, 31, 12);

        s(vt, 7, 31, 1);
        s(vt, 7, 28, 2);
        s(pt, 7, 31, 3);
        s(vs, 7, 30, 4);
        s(sr, 7, 31, 5);
        s(pt, 7, 30, 6);
        s(pn, 7, 31, 7);
        s(ch, 7, 31, 8);
        s(sb, 7, 30, 9);
        s(vt, 7, 31, 10);
        s(ch, 7, 30, 11);
        s(vs, 7, 31, 12);

        s(vt, 1, 30, 1);
        s(vt, 1, 27, 2);
        s(pt, 1, 30, 3);
        s(vs, 1, 29, 4);
        s(sr, 1, 30, 5);
        s(pt, 1, 29, 6);
        s(pn, 1, 30, 7);
        s(ch, 1, 30, 8);
        s(sb, 1, 29, 9);
        s(vt, 1, 30, 10);
        s(ch, 1, 29, 11);
        s(vs, 1, 30, 12);

        s(sr, 2, 30, 1);
        s(sr, 2, 27, 2);
        s(sb, 2, 30, 3);
        s(pn, 2, 29, 4);
        s(ch, 2, 30, 5);
        s(sb, 2, 29, 6);
        s(vt, 2, 30, 7);
        s(pt, 2, 30, 8);
        s(vs, 2, 29, 9);
        s(sr, 2, 30, 10);
        s(pt, 2, 29, 11);
        s(pn, 2, 30, 12);

        s(ch, 3, 30, 1);
        s(ch, 3, 27, 2);
        s(vs, 3, 30, 3);
        s(vt, 3, 29, 4);
        s(pt, 3, 30, 5);
        s(vs, 3, 29, 6);
        s(sr, 3, 30, 7);
        s(sb, 3, 30, 8);
        s(pn, 3, 29, 9);
        s(ch, 3, 30, 10);
        s(sb, 3, 29, 11);
        s(vt, 3, 30, 12);

        s(pt, 4, 30, 1);
        s(pt, 4, 27, 2);
        s(pn, 4, 30, 3);
        s(sr, 4, 29, 4);
        s(sb, 4, 30, 5);
        s(pn, 4, 29, 6);
        s(ch, 4, 30, 7);
        s(vs, 4, 30, 8);
        s(vt, 4, 29, 9);
        s(pt, 4, 30, 10);
        s(vs, 4, 29, 11);
        s(sr, 4, 30, 12);

        s(sb, 5, 30, 1);
        s(sb, 5, 27, 2);
        s(vt, 5, 30, 3);
        s(ch, 5, 29, 4);
        s(vs, 5, 30, 5);
        s(vt, 5, 29, 6);
        s(pt, 5, 30, 7);
        s(pn, 5, 30, 8);
        s(sr, 5, 29, 9);
        s(sb, 5, 30, 10);
        s(pn, 5, 29, 11);
        s(ch, 5, 30, 12);

        s(vs, 6, 30, 1);
        s(vs, 6, 27, 2);
        s(sr, 6, 30, 3);
        s(pt, 6, 29, 4);
        s(pn, 6, 30, 5);
        s(sr, 6, 29, 6);
        s(sb, 6, 30, 7);
        s(vt, 6, 30, 8);
        s(ch, 6, 29, 9);
        s(vs, 6, 30, 10);
        s(vt, 6, 29, 11);
        s(pt, 6, 30, 12);

        s(pn, 7, 30, 1);
        s(pn, 7, 27, 2);
        s(ch, 7, 30, 3);
        s(sb, 7, 29, 4);
        s(vt, 7, 30, 5);
        s(ch, 7, 29, 6);
        s(vs, 7, 30, 7);
        s(sr, 7, 30, 8);
        s(pt, 7, 29, 9);
        s(pn, 7, 30, 10);
        s(sr, 7, 29, 11);
        s(sb, 7, 30, 12);
        ////////////////////////////////////2.3 Внутри класса эквивалентности
        s(vs, 1, 11, 3);
        s(ch, 1, 12, 4);
        s(vs, 1, 13, 5);
        s(ch, 1, 14, 6);
        s(vs, 1, 15, 7);

        s(pn, 2, 11, 3);
        s(pt, 2, 12, 4);
        s(pn, 2, 13, 5);
        s(pt, 2, 14, 6);
        s(pn, 2, 15, 7);

        s(vt, 3, 11, 3);
        s(sb, 3, 12, 4);
        s(vt, 3, 13, 5);
        s(sb, 3, 14, 6);
        s(vt, 3, 15, 7);

        s(sr, 4, 11, 3);
        s(vs, 4, 12, 4);
        s(sr, 4, 13, 5);
        s(vs, 4, 14, 6);
        s(sr, 4, 15, 7);

        s(ch, 5, 11, 3);
        s(pn, 5, 12, 4);
        s(ch, 5, 13, 5);
        s(pn, 5, 14, 6);
        s(ch, 5, 15, 7);

        s(pt, 6, 11, 3);
        s(vt, 6, 12, 4);
        s(pt, 6, 13, 5);
        s(vt, 6, 14, 6);
        s(pt, 6, 15, 7);

        s(sb, 7, 11, 3);
        s(sr, 7, 12, 4);
        s(sb, 7, 13, 5);
        s(sr, 7, 14, 6);
        s(sb, 7, 15, 7);
        //////////////////////////////////3. Предметная область
        s(pn, 5, 15, 3);
        s(vt, 5, 1, 6);
        s(pt, 5, 31, 12);
        //////////////////////////////////4. Реализация

        //////////////////////////////////5. Случайные тесты
        s(ch, 3, 17, 7);
        s(sb, 5, 17, 7);
        s(sb, 2, 21, 12);
        s(ch, 1, 15, 3);
        s(pn, 4, 17, 8);
        s(vt, 6, 4, 1);
        s(vs, 7, 31, 12);
        s(sr, 4, 11, 2);
        s(pn, 1, 12, 2);
        s(sb, 2, 23, 3);
        s(pn, 6, 11, 4);
        s(sr, 4, 17, 6);
        s(pt, 6, 4, 3);
        s(vs, 7, 31, 12);
        s(pt, 3, 21, 2);
        s(sb, 5, 17, 4);
        s(ch, 2, 24, 1);
        s(sr, 1, 15, 8);
        s(ch, 4, 17, 9);
        s(vt, 6, 4, 10);
        s(ch, 7, 30, 11);
        s(ch, 3, 17, 4);
        s(ch, 5, 11, 2);
        s(sr, 2, 21, 8);
        s(pt, 1, 14, 9);
        s(sb, 4, 17, 10);
        s(sr, 6, 2, 11);
        //////////////////////////////////6. Другие особые значения
        s(sb, 1, 1, 12);
        s(vs, 1, 2, 12);
        s(pn, 1, 3, 12);
        s(vt, 1, 4, 12);
        s(sr, 1, 5, 12);
        s(ch, 1, 6, 12);
        s(pt, 1, 7, 12);
        s(sb, 1, 8, 12);
        s(vs, 1, 9, 12);
        s(pn, 1, 10, 12);
        s(vt, 1, 11, 12);
        s(sr, 1, 12, 12);
        s(ch, 1, 13, 12);
        s(pt, 1, 14, 12);
        s(sb, 1, 15, 12);
        s(vs, 1, 16, 12);
        s(pn, 1, 17, 12);
        s(vt, 1, 18, 12);
        s(sr, 1, 19, 12);
        s(ch, 1, 20, 12);
        s(pt, 1, 21, 12);
        s(sb, 1, 22, 12);
        s(vs, 1, 23, 12);
        s(pn, 1, 24, 12);
        s(vt, 1, 25, 12);
        s(sr, 1, 26, 12);
        s(ch, 1, 27, 12);
        s(pt, 1, 28, 12);
        s(sb, 1, 29, 12);
        s(vs, 1, 30, 12);
        s(pn, 1, 31, 12);
    }

    private void s(String s, int a, int b, int c) {
        testScenarios.add(new task5.TestScenario(s, a, b, c));
    }

    @Test
    public void start() {
        setUpScenarios();
        for (TestScenario tS : testScenarios) {
            assertEquals(tS.s, f(tS.a, tS.b, tS.c));
        }
        System.out.println(testScenarios.size());
    }
}
