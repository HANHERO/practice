package task4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class NewFibTest {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    @Before public void setUpStreams() { System.setOut(new PrintStream(output)); }
    @After public void cleanUpStreams() { System.setOut(null); }
    /////////////////////////////////////////////////1. Максимальное/минимальное значения
   // @Test(expected = NegativeArraySizeException.class) public void minIntValueArgument() { NewFib.fib(-2147483648); }
    @Test(expected = Exception.class) public void lessThenMinIntValueArgument() { NewFib.fib(Integer.parseInt("-2147483649")); }
    //@Test(expected = NegativeArraySizeException.class) public void maxIntValueArgument() { NewFib.fib(2147483647); }
    @Test(expected = Exception.class) public void moreThenMaxIntValueArgument() { NewFib.fib(Integer.parseInt("2147483648")); }
    /////////////////////////////////////////////////2. Классы эквивалентности
    /////////////////////////////////////////////////2.1 Границы классов эквивалентности
    @Test public void leftBorder() { assertEquals(BigInteger.class, NewFib.fib(-189300).getClass()); }
    @Test public void rightBorder() { assertEquals(BigInteger.class, NewFib.fib(189300).getClass()); }
    /////////////////////////////////////////////////2.2 Впритык слева и справа от границы
    //@Test(expected = OutOfMemoryError.class) public void leftBorderLeftStep(){ Main.fib(-189500);}
    @Test public void leftBorderRightStep(){ assertEquals(BigInteger.class, NewFib.fib(-189100).getClass());}
    @Test public void rightBorderLeftStep(){ assertEquals(BigInteger.class, NewFib.fib(189100).getClass());}
    // @Test(expected = OutOfMemoryError.class) public void rightBorderRightStep(){ Main.fib(189500);}
    /////////////////////////////////////////////////2.3 Внутри класса эквивалентности
    @Test public void internal1(){ assertEquals(new BigInteger("0"), NewFib.fib(0));}
    @Test public void internal2(){ assertEquals(new BigInteger("89"), NewFib.fib(11));}
    @Test public void internal3(){ assertEquals(new BigInteger("89"), NewFib.fib(-11));assertEquals("Вы ввели отрицателый номер числа Фибоначчи, вот его значение: ", output.toString()); }
    @Test public void internal4(){ assertEquals(new BigInteger("514229"), NewFib.fib(29));}
    @Test public void internal5(){ assertEquals(new BigInteger("514229"), NewFib.fib(-29));assertEquals("Вы ввели отрицателый номер числа Фибоначчи, вот его значение: ", output.toString()); }
    @Test public void internal6(){ assertEquals(new BigInteger("498454011879264"), NewFib.fib(72));}
    @Test public void internal7(){ assertEquals(new BigInteger("-498454011879264"), NewFib.fib(-72));assertEquals("Вы ввели отрицателый номер числа Фибоначчи, вот его значение: ", output.toString()); }
    /////////////////////////////////////////////////3. Предметная область
    @Test public void subjectArea1() { assertEquals(new BigInteger("1"), NewFib.fib(1)); }
    @Test public void subjectArea2() { assertEquals(new BigInteger("1"), NewFib.fib(2)); }
    @Test public void subjectArea3() { assertEquals(new BigInteger("2"), NewFib.fib(3)); }
    @Test public void subjectArea4() { assertEquals(new BigInteger("3"), NewFib.fib(4)); }
    @Test public void subjectArea5() { assertEquals(new BigInteger("5"), NewFib.fib(5)); }
    @Test public void subjectArea6() { assertEquals(new BigInteger("8"), NewFib.fib(6)); }
    @Test public void subjectArea7() { assertEquals(new BigInteger("13"), NewFib.fib(7)); }
    @Test public void subjectArea8() { assertEquals(new BigInteger("21"), NewFib.fib(8)); }
    @Test public void subjectArea9() { assertEquals(new BigInteger("34"), NewFib.fib(9)); }
    @Test public void subjectArea10() { assertEquals(new BigInteger("55"), NewFib.fib(10)); }
    @Test public void subjectArea11() { assertEquals(new BigInteger("1"), NewFib.fib(-1));assertEquals("Вы ввели отрицателый номер числа Фибоначчи, вот его значение: ", output.toString()); }
    @Test public void subjectArea22() { assertEquals(new BigInteger("-1"), NewFib.fib(-2));assertEquals("Вы ввели отрицателый номер числа Фибоначчи, вот его значение: ", output.toString()); }
    @Test public void subjectArea33() { assertEquals(new BigInteger("2"), NewFib.fib(-3));assertEquals("Вы ввели отрицателый номер числа Фибоначчи, вот его значение: ", output.toString()); }
    @Test public void subjectArea44() { assertEquals(new BigInteger("-3"), NewFib.fib(-4));assertEquals("Вы ввели отрицателый номер числа Фибоначчи, вот его значение: ", output.toString()); }
    @Test public void subjectArea55() { assertEquals(new BigInteger("5"), NewFib.fib(-5));assertEquals("Вы ввели отрицателый номер числа Фибоначчи, вот его значение: ", output.toString()); }
    @Test public void subjectArea66() { assertEquals(new BigInteger("-8"), NewFib.fib(-6));assertEquals("Вы ввели отрицателый номер числа Фибоначчи, вот его значение: ", output.toString()); }
    @Test public void subjectArea77() { assertEquals(new BigInteger("13"), NewFib.fib(-7));assertEquals("Вы ввели отрицателый номер числа Фибоначчи, вот его значение: ", output.toString()); }
    @Test public void subjectArea88() { assertEquals(new BigInteger("-21"), NewFib.fib(-8));assertEquals("Вы ввели отрицателый номер числа Фибоначчи, вот его значение: ", output.toString()); }
    @Test public void subjectArea99() { assertEquals(new BigInteger("34"), NewFib.fib(-9));assertEquals("Вы ввели отрицателый номер числа Фибоначчи, вот его значение: ", output.toString()); }
    @Test public void subjectArea1010() { assertEquals(new BigInteger("-55"), NewFib.fib(-10));assertEquals("Вы ввели отрицателый номер числа Фибоначчи, вот его значение: ", output.toString()); }
    ///////////////////////////////////////////////////////4. Реализация
    @Test public void lowerLimitOfProgram(){ assertEquals(new BigInteger("-3364476487643178326662161200510754331030214846068006390656476997468008" +
            "1442166662368155595513633734025582065332680836159373734790483865268263040892463056431887354544369559827491606602099884183933864652731300" +
            "0888302692356736131351175792974378544137521305205043477016022647583189065278908551543661595829872796829875106312005754287834532155151038" +
            "7081829896979161312785626503319548714021428753269818796204693609787990035096230229102636813149319527563022783762844154036058440257211433" +
            "4961180023091208287046088923962328835461505776583271252546093591128203925285393434620904245248929403901706233888991085841065183173360437" +
            "4707379085526317643257339937128719375877468974799263058370657428301616374089691784263786242128352581128205163702980893320999057079200643" +
            "6742620238978311147005407499845925036063356093388383192338678305613643535189213327973290813373264265263398976392272340788292817795358057" +
            "0993691049175470808931841056146322338217465637321248226383092103297701648054726243842374862411453093812206564914032751086643394517512161" +
            "5265453613331113140424368548051067658434935238369596534280717687753283482343455573667197313927462736291082106792807847180353291311767789" +
            "2465908993863545932789452377767440619224033763867400402133034329749690202832814593341882681768389307200363479562311710310129195316979460" +
            "7632737589253530772552375943788434504067715555779056450443016640119462580972216729758615026968443146952034614932291105970676243268515992" +
            "8347098912847067408620085871350162603120719031720860940812983215810772820763531866246112782455372085323653057759564300725177443150515396" +
            "0090516860322034916322264088524885243315805153484962243484829938090507048348244932745373262456775587908918719080366205800959474315005240" +
            "2532709746995318770724376825907419939632265984147498193609285223945039707165443156421328157688908058783183404917434556270520223564846495" +
            "1961124602683139709750693826487066132645076650746115126775227486215986425307112984411826226610571635150692600298617049454250474913781151" +
            "54139941550671256271197133252763631939606902895650288268608362241082050562430701794976171121233066073310059947366875"), NewFib.fib(-10000));
        assertEquals("Вы ввели отрицателый номер числа Фибоначчи, вот его значение: ", output.toString()); }
    @Test public void upperLimitOfProgram(){ assertEquals(new BigInteger("33644764876431783266621612005107543310302148460680063906564769974680081" +
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
            "4139941550671256271197133252763631939606902895650288268608362241082050562430701794976171121233066073310059947366875"), Main.fib(10000)); }
    @Test(expected = Exception.class) public void incorrectInput(){ NewFib.fib(Integer.parseInt("hfuvn3737")); }
    /////////////////////////////////////////////////////5.Случайные значения
    @Test public void randomFib1() { assertEquals(new BigInteger("4052739537881"), NewFib.fib(62)); }
    @Test public void randomFib2() { assertEquals(new BigInteger("-1304969544928657"), NewFib.fib(-74)); }
    @Test public void randomFib3() { assertEquals(new BigInteger("679891637638612258"), NewFib.fib(87)); }
    @Test public void randomFib4() { assertEquals(new BigInteger("37889062373143906"), NewFib.fib(81)); }
    @Test public void randomFib5() { assertEquals(new BigInteger("1134903170"), NewFib.fib(45)); }
    @Test public void randomFib6() { assertEquals(new BigInteger("9227465"), NewFib.fib(35)); }
    @Test public void randomFib7() { assertEquals(new BigInteger("10946"), NewFib.fib(-21)); }
    @Test public void randomFib8() { assertEquals(new BigInteger("196418"), NewFib.fib(27)); }
}
