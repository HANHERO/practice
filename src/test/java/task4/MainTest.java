package task4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;

import static org.junit.Assert.assertEquals;
import static task4.NewFib.fib;

public class MainTest {
    private final String negative = "Вы ввели отрицателый номер числа Фибоначчи, вот его значение: ";
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
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    @Before public void setUpStreams() { System.setOut(new PrintStream(out)); }
    @After public void cleanUpStreams() { System.setOut(null); }
    /////////////////////////////////////////////////1. Максимальное/минимальное значения
    @Test public void minIntValueArgument() { assertEquals(BigInteger.class, fib(-2000000).getClass()); }
    @Test public void maxIntValueArgument() { assertEquals(BigInteger.class, fib(2000000).getClass()); }
    /////////////////////////////////////////////////2. Классы эквивалентности
    /////////////////////////////////////////////////2.1 Границы классов эквивалентности

    /////////////////////////////////////////////////2.2 Впритык слева и справа от границы

    /////////////////////////////////////////////////2.3 Внутри класса эквивалентности
    @Test public void internal1(){ assertEquals(new BigInteger("0"), fib(0));}
    @Test public void internal2(){ assertEquals(new BigInteger("89"), fib(11));}
    @Test public void internal3(){ assertEquals(new BigInteger("89"), fib(-11));assertEquals(negative, out.toString()); }
    @Test public void internal4(){ assertEquals(new BigInteger("514229"), fib(29));}
    @Test public void internal5(){ assertEquals(new BigInteger("514229"), fib(-29));assertEquals(negative, out.toString()); }
    @Test public void internal6(){ assertEquals(new BigInteger("498454011879264"), fib(72));}
    @Test public void internal7(){ assertEquals(new BigInteger("-498454011879264"), fib(-72));assertEquals(negative, out.toString()); }
    @Test public void lowerLimitOfProgram(){ assertEquals(foundedInNetMinus10K, fib(-10000)); assertEquals(negative, out.toString()); }
    @Test public void upperLimitOfProgram(){ assertEquals(foundedInNet10K, fib(10000)); }
    /////////////////////////////////////////////////3. Предметная область
    @Test public void subjectArea1() { assertEquals(new BigInteger("1"), fib(1)); }
    @Test public void subjectArea2() { assertEquals(new BigInteger("1"), fib(2)); }
    @Test public void subjectArea3() { assertEquals(new BigInteger("2"), fib(3)); }
    @Test public void subjectArea4() { assertEquals(new BigInteger("3"), fib(4)); }
    @Test public void subjectArea5() { assertEquals(new BigInteger("5"), fib(5)); }
    @Test public void subjectArea6() { assertEquals(new BigInteger("8"), fib(6)); }
    @Test public void subjectArea7() { assertEquals(new BigInteger("13"), fib(7)); }
    @Test public void subjectArea8() { assertEquals(new BigInteger("21"), fib(8)); }
    @Test public void subjectArea9() { assertEquals(new BigInteger("34"), fib(9)); }
    @Test public void subjectArea11() { assertEquals(new BigInteger("55"), fib(10)); }
    @Test public void subjectArea12() { assertEquals(new BigInteger("89"), fib(11)); }
    @Test public void subjectArea13() { assertEquals(new BigInteger("144"), fib(12)); }
    @Test public void subjectArea14() { assertEquals(new BigInteger("233"), fib(13)); }
    @Test public void subjectArea15() { assertEquals(new BigInteger("377"), fib(14)); }
    @Test public void subjectArea16() { assertEquals(new BigInteger("610"), fib(15)); }
    @Test public void subjectArea17() { assertEquals(new BigInteger("987"), fib(16)); }
    @Test public void subjectArea18() { assertEquals(new BigInteger("1597"), fib(17)); }
    @Test public void subjectArea19() { assertEquals(new BigInteger("2584"), fib(18)); }
    @Test public void subjectArea20() { assertEquals(new BigInteger("4181"), fib(19)); }
    @Test public void subjectArea21() { assertEquals(new BigInteger("6765"), fib(20)); }
    @Test public void subjectArea22() { assertEquals(new BigInteger("1"), fib(-1));assertEquals(negative, out.toString()); }
    @Test public void subjectArea23() { assertEquals(new BigInteger("-1"), fib(-2));assertEquals(negative, out.toString()); }
    @Test public void subjectArea24() { assertEquals(new BigInteger("2"), fib(-3));assertEquals(negative, out.toString()); }
    @Test public void subjectArea25() { assertEquals(new BigInteger("-3"), fib(-4));assertEquals(negative, out.toString()); }
    @Test public void subjectArea26() { assertEquals(new BigInteger("5"), fib(-5));assertEquals(negative, out.toString()); }
    @Test public void subjectArea27() { assertEquals(new BigInteger("-8"), fib(-6));assertEquals(negative, out.toString()); }
    @Test public void subjectArea28() { assertEquals(new BigInteger("13"), fib(-7));assertEquals(negative, out.toString()); }
    @Test public void subjectArea29() { assertEquals(new BigInteger("-21"), fib(-8));assertEquals(negative, out.toString()); }
    @Test public void subjectArea30() { assertEquals(new BigInteger("34"), fib(-9));assertEquals(negative, out.toString()); }
    @Test public void subjectArea31() { assertEquals(new BigInteger("-55"), fib(-10));assertEquals(negative, out.toString()); }
    @Test public void subjectArea32() { assertEquals(new BigInteger("89"), fib(-11));assertEquals(negative, out.toString()); }
    @Test public void subjectArea33() { assertEquals(new BigInteger("-144"), fib(-12));assertEquals(negative, out.toString()); }
    @Test public void subjectArea34() { assertEquals(new BigInteger("233"), fib(-13));assertEquals(negative, out.toString()); }
    @Test public void subjectArea35() { assertEquals(new BigInteger("-377"), fib(-14));assertEquals(negative, out.toString()); }
    @Test public void subjectArea36() { assertEquals(new BigInteger("610"), fib(-15));assertEquals(negative, out.toString()); }
    @Test public void subjectArea37() { assertEquals(new BigInteger("-987"), fib(-16));assertEquals(negative, out.toString()); }
    @Test public void subjectArea38() { assertEquals(new BigInteger("1597"), fib(-17));assertEquals(negative, out.toString()); }
    @Test public void subjectArea39() { assertEquals(new BigInteger("-2584"), fib(-18));assertEquals(negative, out.toString()); }
    @Test public void subjectArea40() { assertEquals(new BigInteger("4181"), fib(-19));assertEquals(negative, out.toString()); }
    @Test public void subjectArea41() { assertEquals(new BigInteger("-6765"), fib(-20));assertEquals(negative, out.toString()); }
    ///////////////////////////////////////////////////////4. Реализация

    @Test(expected = Exception.class) public void incorrectInput(){ fib(Integer.parseInt("hfuvn3737")); }
    /////////////////////////////////////////////////////5.Случайные значения
    @Test public void randomFib1() { assertEquals(new BigInteger("4052739537881"), fib(62)); }
    @Test public void randomFib2() { assertEquals(new BigInteger("-1304969544928657"), fib(-74)); assertEquals(negative, out.toString()); }
    @Test public void randomFib3() { assertEquals(new BigInteger("679891637638612258"), fib(87)); }
    @Test public void randomFib4() { assertEquals(new BigInteger("37889062373143906"), fib(81)); }
    @Test public void randomFib5() { assertEquals(new BigInteger("1134903170"), fib(45)); }
    @Test public void randomFib6() { assertEquals(new BigInteger("9227465"), fib(35)); }
    @Test public void randomFib7() { assertEquals(new BigInteger("10946"), fib(-21)); assertEquals(negative, out.toString()); }
    @Test public void randomFib8() { assertEquals(new BigInteger("196418"), fib(27)); }
}