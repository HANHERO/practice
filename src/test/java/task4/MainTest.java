package task4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;

import static org.junit.Assert.assertEquals;
import static task4.NewFib.f;

public class MainTest {
    private final BigInteger foundedInNet10K = new BigInteger("33644764876431783266621612005107543310302148460680063906564769974680081" +
            "4421666623681555955136337340255820653326808361593737347904838652682630408924630564318873545443695598274916066020998841839338646527313000" +
            "8883026923567361313511757929743785441375213052050434770160226475831890652789085515436615958298727968298751063120057542878345321551510387" +
            "0818298969791613127856265033195487140214287532698187962046936097879900350962302291026368131493195275630227837628441540360584402572114334" +
            "9611800230912082870460889239623288354615057765832712525460935911282039252853934346209042452489294039017062338889910858410651831733604374" +
            "7073790855263176432573399371287193758774689747992630583706574283016163740896917842637862421283525811282051637029808933209990570792006436" +
            "7426202389783111470054074998459250360633560933883831923386783056136435351892133279732908133732642652633989763922723407882928177953580570" +
            "9936910491754708089318410561463223382174656373212482263830921032977016480547262438423748624114530938122065649140327510866433945175121615" +
            "2654536133311131404243685480510676584349352383695965342807176877532834823434555736671973139274627362910821067928078471803532913117677892" +
            "4659089938635459327894523777674406192240337638674004021330343297496902028328145933418826817683893072003634795623117103101291953169794607" +
            "6327375892535307725523759437884345040677155557790564504430166401194625809722167297586150269684431469520346149322911059706762432685159928" +
            "3470989128470674086200858713501626031207190317208609408129832158107728207635318662461127824553720853236530577595643007251774431505153960" +
            "0905168603220349163222640885248852433158051534849622434848299380905070483482449327453732624567755879089187190803662058009594743150052402" +
            "5327097469953187707243768259074199396322659841474981936092852239450397071654431564213281576889080587831834049174345562705202235648464951" +
            "9611246026831397097506938264870661326450766507461151267752274862159864253071129844118262266105716351506926002986170494542504749137811515" +
            "4139941550671256271197133252763631939606902895650288268608362241082050562430701794976171121233066073310059947366875");
    private final BigInteger foundedInNetMinus10K = new BigInteger("-33644764876431783266621612005107543310302148460680063906564769974680081" +
            "4421666623681555955136337340255820653326808361593737347904838652682630408924630564318873545443695598274916066020998841839338646527313000" +
            "8883026923567361313511757929743785441375213052050434770160226475831890652789085515436615958298727968298751063120057542878345321551510387" +
            "0818298969791613127856265033195487140214287532698187962046936097879900350962302291026368131493195275630227837628441540360584402572114334" +
            "9611800230912082870460889239623288354615057765832712525460935911282039252853934346209042452489294039017062338889910858410651831733604374" +
            "7073790855263176432573399371287193758774689747992630583706574283016163740896917842637862421283525811282051637029808933209990570792006436" +
            "7426202389783111470054074998459250360633560933883831923386783056136435351892133279732908133732642652633989763922723407882928177953580570" +
            "9936910491754708089318410561463223382174656373212482263830921032977016480547262438423748624114530938122065649140327510866433945175121615" +
            "2654536133311131404243685480510676584349352383695965342807176877532834823434555736671973139274627362910821067928078471803532913117677892" +
            "4659089938635459327894523777674406192240337638674004021330343297496902028328145933418826817683893072003634795623117103101291953169794607" +
            "6327375892535307725523759437884345040677155557790564504430166401194625809722167297586150269684431469520346149322911059706762432685159928" +
            "3470989128470674086200858713501626031207190317208609408129832158107728207635318662461127824553720853236530577595643007251774431505153960" +
            "0905168603220349163222640885248852433158051534849622434848299380905070483482449327453732624567755879089187190803662058009594743150052402" +
            "5327097469953187707243768259074199396322659841474981936092852239450397071654431564213281576889080587831834049174345562705202235648464951" +
            "9611246026831397097506938264870661326450766507461151267752274862159864253071129844118262266105716351506926002986170494542504749137811515" +
            "4139941550671256271197133252763631939606902895650288268608362241082050562430701794976171121233066073310059947366875");
    private final ByteArrayOutputStream o = new ByteArrayOutputStream();
    @Before public void setUpStreams() { System.setOut(new PrintStream(o)); }
    @After public void cleanUpStreams() { System.setOut(null); }

    private void aE(BigInteger e, BigInteger a){
        assertEquals(e, a);
    }
    private void aE(String a){
        assertEquals("Вы ввели отрицателый номер числа Фибоначчи, вот его значение: ", a);
    }
    /////////////////////////////////////////////////1. Максимальное/минимальное значения
    @Test public void min() { assertEquals(BigInteger.class, f(-2000000).getClass()); }
    @Test public void max() { assertEquals(BigInteger.class, f(2000000).getClass()); }
    /////////////////////////////////////////////////2. Классы эквивалентности
    /////////////////////////////////////////////////2.1 Границы классов эквивалентности

    /////////////////////////////////////////////////2.2 Впритык слева и справа от границы

    /////////////////////////////////////////////////2.3 Внутри класса эквивалентности
    @Test public void i1(){ aE(new BigInteger("0"), f(0));}
    @Test public void i2(){ aE(new BigInteger("89"), f(11));}
    @Test public void i3(){ aE(new BigInteger("89"), f(-11));aE(o.toString()); }
    @Test public void i4(){ aE(new BigInteger("514229"), f(29));}
    @Test public void i5(){ aE(new BigInteger("514229"), f(-29));aE(o.toString()); }
    @Test public void i6(){ aE(new BigInteger("498454011879264"), f(72));}
    @Test public void i7(){ aE(new BigInteger("-498454011879264"), f(-72));aE(o.toString()); }
    @Test public void lL(){ aE(foundedInNetMinus10K, f(-10000)); aE(o.toString()); }
    @Test public void uL(){ aE(foundedInNet10K, f(10000)); }
    /////////////////////////////////////////////////3. Предметная область
    @Test public void s1() { aE(new BigInteger("1"), f(1)); }
    @Test public void s2() { aE(new BigInteger("1"), f(2)); }
    @Test public void s3() { aE(new BigInteger("2"), f(3)); }
    @Test public void s4() { aE(new BigInteger("3"), f(4)); }
    @Test public void s5() { aE(new BigInteger("5"), f(5)); }
    @Test public void s6() { aE(new BigInteger("8"), f(6)); }
    @Test public void s7() { aE(new BigInteger("13"), f(7)); }
    @Test public void s8() { aE(new BigInteger("21"), f(8)); }
    @Test public void s9() { aE(new BigInteger("34"), f(9)); }
    @Test public void s11() { aE(new BigInteger("55"), f(10)); }
    @Test public void s12() { aE(new BigInteger("89"), f(11)); }
    @Test public void s13() { aE(new BigInteger("144"), f(12)); }
    @Test public void s14() { aE(new BigInteger("233"), f(13)); }
    @Test public void s15() { aE(new BigInteger("377"), f(14)); }
    @Test public void s16() { aE(new BigInteger("610"), f(15)); }
    @Test public void s17() { aE(new BigInteger("987"), f(16)); }
    @Test public void s18() { aE(new BigInteger("1597"), f(17)); }
    @Test public void s19() { aE(new BigInteger("2584"), f(18)); }
    @Test public void s20() { aE(new BigInteger("4181"), f(19)); }
    @Test public void s21() { aE(new BigInteger("6765"), f(20)); }
    @Test public void s22() { aE(new BigInteger("1"), f(-1));aE(o.toString()); }
    @Test public void s23() { aE(new BigInteger("-1"), f(-2));aE(o.toString()); }
    @Test public void s24() { aE(new BigInteger("2"), f(-3));aE(o.toString()); }
    @Test public void s25() { aE(new BigInteger("-3"), f(-4));aE(o.toString()); }
    @Test public void s26() { aE(new BigInteger("5"), f(-5));aE(o.toString()); }
    @Test public void s27() { aE(new BigInteger("-8"), f(-6));aE(o.toString()); }
    @Test public void s28() { aE(new BigInteger("13"), f(-7));aE(o.toString()); }
    @Test public void s29() { aE(new BigInteger("-21"), f(-8));aE(o.toString()); }
    @Test public void s30() { aE(new BigInteger("34"), f(-9));aE(o.toString()); }
    @Test public void s31() { aE(new BigInteger("-55"), f(-10));aE(o.toString()); }
    @Test public void s32() { aE(new BigInteger("89"), f(-11));aE(o.toString()); }
    @Test public void s33() { aE(new BigInteger("-144"), f(-12));aE(o.toString()); }
    @Test public void s34() { aE(new BigInteger("233"), f(-13));aE(o.toString()); }
    @Test public void s35() { aE(new BigInteger("-377"), f(-14));aE(o.toString()); }
    @Test public void s36() { aE(new BigInteger("610"), f(-15));aE(o.toString()); }
    @Test public void s37() { aE(new BigInteger("-987"), f(-16));aE(o.toString()); }
    @Test public void s38() { aE(new BigInteger("1597"), f(-17));aE(o.toString()); }
    @Test public void s39() { aE(new BigInteger("-2584"), f(-18));aE(o.toString()); }
    @Test public void s40() { aE(new BigInteger("4181"), f(-19));aE(o.toString()); }
    @Test public void s41() { aE(new BigInteger("-6765"), f(-20));aE(o.toString()); }
    ///////////////////////////////////////////////////////4. Реализация

    @Test(expected = Exception.class) public void incorrectInput(){ f(Integer.parseInt("hfuvn3737")); }
    /////////////////////////////////////////////////////5.Случайные значения
    @Test public void r1() { aE(new BigInteger("4052739537881"), f(62)); }
    @Test public void r2() { aE(new BigInteger("-1304969544928657"), f(-74)); aE(o.toString()); }
    @Test public void r3() { aE(new BigInteger("679891637638612258"), f(87)); }
    @Test public void r4() { aE(new BigInteger("37889062373143906"), f(81)); }
    @Test public void r5() { aE(new BigInteger("1134903170"), f(45)); }
    @Test public void r6() { aE(new BigInteger("9227465"), f(35)); }
    @Test public void r7() { aE(new BigInteger("10946"), f(-21)); aE(o.toString()); }
    @Test public void r8() { aE(new BigInteger("196418"), f(27)); }
}