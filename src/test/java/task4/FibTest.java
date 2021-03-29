package task4;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static task4.Fib.findFib;

public class FibTest {

    @Test
    public void runScenarios() {
        /////////////////////////////////////////////////1. Граничные значения области определения.
        positiveMoreTenKTest(2000000);
        negativeMoreTenKTest(-2000000);
        /////////////////////////////////////////////////2. Классы эквивалентности
        /////////////////////////////////////////////////2.1 Границы классов эквивалентности
        lessTenKTest("-1", -2);
        lessTenKTest("1", 2);
        /////////////////////////////////////////////////2.2 Впритык слева и справа от границы
        lessTenKTest("2", -3);
        lessTenKTest("1", -1);
        lessTenKTest("2", 3);
        lessTenKTest("1", 1);
        /////////////////////////////////////////////////2.3 Внутри класса эквивалентности
        lessTenKTest("354224848179261915075", 100);
        lessTenKTest("-354224848179261915075", -100);
        lessTenKTest("514229", 29);
        lessTenKTest("514229", -29);
        lessTenKTest("498454011879264", 72);
        lessTenKTest("-498454011879264", -72);
        lessTenKTest("6851462981265369536304298877223231154064355390623195419885661484162849735541256952762360871448156142552" +
                "1484607934415856910681316823708551350198968258080863174306483609412033918328687427156400362460532591" +
                "36014253626356840914521594989", 1111);
        lessTenKTest("6851462981265369536304298877223231154064355390623195419885661484162849735541256952762360871448156142552" +
                "1484607934415856910681316823708551350198968258080863174306483609412033918328687427156400362460532591" +
                "36014253626356840914521594989", -1111);
        lessTenKTest("1109867270852690860076488958079459118576674019446044145564503745799076095574057393332591268200228276490" +
                "6185274340684734874403234129028461253", 667);
        lessTenKTest("1109867270852690860076488958079459118576674019446044145564503745799076095574057393332591268200228276490" +
                "6185274340684734874403234129028461253", -667);
        lessTenKTest("280571172992510140037611932413038677189525", 200);
        lessTenKTest("-280571172992510140037611932413038677189525", -200);
        positiveMoreTenKTest(56643);
        positiveMoreTenKTest(121223);
        negativeMoreTenKTest(-32123);
        negativeMoreTenKTest(-32312);
        positiveMoreTenKTest(32123);
        negativeMoreTenKTest(-234251);
        positiveMoreTenKTest(122123);
        negativeMoreTenKTest(-923422);
        positiveMoreTenKTest(53324);
        negativeMoreTenKTest(-10001);
        negativeMoreTenKTest(-10002);
        /////////////////////////////////////////////////3. Предметная область
        lessTenKTest("1", 1);
        lessTenKTest("1", 2);
        lessTenKTest("2", 3);
        lessTenKTest("3", 4);
        lessTenKTest("5", 5);
        lessTenKTest("8", 6);
        lessTenKTest("13", 7);
        lessTenKTest("21", 8);
        lessTenKTest("34", 9);
        lessTenKTest("55", 10);
        lessTenKTest("89", 11);
        lessTenKTest("144", 12);
        lessTenKTest("233", 13);
        lessTenKTest("377", 14);
        lessTenKTest("610", 15);
        lessTenKTest("987", 16);
        lessTenKTest("1597", 17);
        lessTenKTest("2584", 18);
        lessTenKTest("4181", 19);
        lessTenKTest("6765", 20);
        lessTenKTest("1", -1);
        lessTenKTest("-1", -2);
        lessTenKTest("2", -3);
        lessTenKTest("-3", -4);
        lessTenKTest("5", -5);
        lessTenKTest("-8", -6);
        lessTenKTest("13", -7);
        lessTenKTest("-21", -8);
        lessTenKTest("34", -9);
        lessTenKTest("-55", -10);
        lessTenKTest("89", -11);
        lessTenKTest("-144", -12);
        lessTenKTest("233", -13);
        lessTenKTest("-377", -14);
        lessTenKTest("610", -15);
        lessTenKTest("-987", -16);
        lessTenKTest("1597", -17);
        lessTenKTest("-2584", -18);
        lessTenKTest("4181", -19);
        lessTenKTest("-6765", -20);
        /////////////////////////////////////////////////////4. Реализация
        lessTenKTest("1", 1);
        lessTenKTest("0", 0);
        lessTenKTest("1", -1);
        /////////////////////////////////////////////////////5. Случайные значения
        lessTenKTest("4052739537881", 62);
        lessTenKTest("-1304969544928657", -74);
        lessTenKTest("679891637638612258", 87);
        lessTenKTest("37889062373143906", 81);
        lessTenKTest("1134903170", 45);
        lessTenKTest("9227465", 35);
        lessTenKTest("10946", -21);
        lessTenKTest("196418", 27);
        lessTenKTest("-712855466318309181443382098268018842889613342352274572872074853930378980911629426128321940756052135322" +
                "598298992015898128726460694921699457771691515984320016261284047708539269193472721006305258904819077" +
                "521348181926845206674735815971232387638249536923816749213251056890403454686174986395760862161884091" +
                "798970881437670385286614459788315473361126535303345001470206507953492241235332173110519211217429803" +
                "763367497709528116461287139510833577030775288800250183781138908493680222126117339830913550044567933" +
                "141338294582642687418044454756151758321953745440031543610889303727320449152701276454851601928970551" +
                "276833087236466249731315348667943360171392135242746425718386937140586023699165514218313570547142471" +
                "195244250910797778566373979647545861434886508521791770235771333938242778001178590514900515553779927" +
                "879123173220216962404212060506773912850790627804909647464065776368389716980590012646163158298929140" +
                "130329072621945501128695079275252341077222715409225986581641304821366916287036388894353015068552643" +
                "143720713565247550255097451320702063876032819298409345049895661455425000265932109006258500209729817" +
                "640331668751002553617861959880749253762978643851241957264688601418867799692085268794623267547164876" +
                "552793573213716273",-5786);
        lessTenKTest("712855466318309181443382098268018842889613342352274572872074853930378980911629426128321940756052135322" +
                "598298992015898128726460694921699457771691515984320016261284047708539269193472721006305258904819077" +
                "521348181926845206674735815971232387638249536923816749213251056890403454686174986395760862161884091" +
                "798970881437670385286614459788315473361126535303345001470206507953492241235332173110519211217429803" +
                "763367497709528116461287139510833577030775288800250183781138908493680222126117339830913550044567933" +
                "141338294582642687418044454756151758321953745440031543610889303727320449152701276454851601928970551" +
                "276833087236466249731315348667943360171392135242746425718386937140586023699165514218313570547142471" +
                "195244250910797778566373979647545861434886508521791770235771333938242778001178590514900515553779927" +
                "879123173220216962404212060506773912850790627804909647464065776368389716980590012646163158298929140" +
                "130329072621945501128695079275252341077222715409225986581641304821366916287036388894353015068552643" +
                "143720713565247550255097451320702063876032819298409345049895661455425000265932109006258500209729817" +
                "640331668751002553617861959880749253762978643851241957264688601418867799692085268794623267547164876" +
                "552793573213716273",5786);
        lessTenKTest("1110305743234740370307946408479469587191065765054791996071646368707425718183598708601437941426290016048" +
                "2588666841112163277353173884891831619011551234089087896173177341522591344191320625303285536720539310" +
                "2187430699277802091224887613077645490877629118722262585436910441770074038754395211539431860304955509" +
                "5968443200049142162026786442532920379446726515204634885706164205681145256603655105720131107650831412" +
                "8768459375836750947669770735108670470808442189249827445844279870426125617655210279736900243974859043" +
                "07720194812221212329752", 2514);
        lessTenKTest("-1110305743234740370307946408479469587191065765054791996071646368707425718183598708601437941426290016048" +
                "2588666841112163277353173884891831619011551234089087896173177341522591344191320625303285536720539310" +
                "2187430699277802091224887613077645490877629118722262585436910441770074038754395211539431860304955509" +
                "5968443200049142162026786442532920379446726515204634885706164205681145256603655105720131107650831412" +
                "8768459375836750947669770735108670470808442189249827445844279870426125617655210279736900243974859043" +
                "07720194812221212329752", -2514);
        lessTenKTest("66668955990143927535739787037825200568705642472004620850078423063984223925447303213964094201854901177412" +
                "86328238160845982538224710784106896065758826169066090567289636924573734500394122103253417088277608366" +
                "24973245833026011429821107570414160825111785788501815656562015849899442186146801139478738529469015442" +
                "071575682484261163550270040419807056855463", 1666);
        lessTenKTest("-66668955990143927535739787037825200568705642472004620850078423063984223925447303213964094201854901177412" +
                "86328238160845982538224710784106896065758826169066090567289636924573734500394122103253417088277608366" +
                "24973245833026011429821107570414160825111785788501815656562015849899442186146801139478738529469015442" +
                "071575682484261163550270040419807056855463", -1666);
        positiveMoreTenKTest(50000);
        negativeMoreTenKTest(-50000);
        positiveMoreTenKTest(654323);
        negativeMoreTenKTest(-345322);
        positiveMoreTenKTest(1234441);
        negativeMoreTenKTest(-97654);
        positiveMoreTenKTest(785357);
        negativeMoreTenKTest(-744324);
        positiveMoreTenKTest(98877);
        negativeMoreTenKTest(-676656);
        positiveMoreTenKTest(98876);
        negativeMoreTenKTest(-12111);
        positiveMoreTenKTest(64432);
        negativeMoreTenKTest(-54351);
        positiveMoreTenKTest(632222);
        negativeMoreTenKTest(-52334);
        positiveMoreTenKTest(542222);
        negativeMoreTenKTest(-87665);
        positiveMoreTenKTest(75646);
        negativeMoreTenKTest(-46187);
        positiveMoreTenKTest(82205);
        negativeMoreTenKTest(-141252);
        positiveMoreTenKTest(716094);
        negativeMoreTenKTest(-903929);
        positiveMoreTenKTest(977153);
        negativeMoreTenKTest(-830959);
        positiveMoreTenKTest(904960);
        negativeMoreTenKTest(-521058);
        positiveMoreTenKTest(522871);
        negativeMoreTenKTest(-522871);
        positiveMoreTenKTest(828543);
        negativeMoreTenKTest(-602447);
        positiveMoreTenKTest(482359);
        negativeMoreTenKTest(-882127);
        positiveMoreTenKTest(259639);
        negativeMoreTenKTest(-11423);
        positiveMoreTenKTest(31142);
        /////////////////////////////////////////////////////6. Другие особые значения
        lessTenKTest("-3364476487643178326662161200510754331030214846068006390656476997468008144216666236815559551363373402558206" +
                "5332680836159373734790483865268263040892463056431887354544369559827491606602099884183933864652731300088" +
                "8302692356736131351175792974378544137521305205043477016022647583189065278908551543661595829872796829875" +
                "1063120057542878345321551510387081829896979161312785626503319548714021428753269818796204693609787990035" +
                "0962302291026368131493195275630227837628441540360584402572114334961180023091208287046088923962328835461" +
                "5057765832712525460935911282039252853934346209042452489294039017062338889910858410651831733604374707379" +
                "0855263176432573399371287193758774689747992630583706574283016163740896917842637862421283525811282051637" +
                "0298089332099905707920064367426202389783111470054074998459250360633560933883831923386783056136435351892" +
                "1332797329081337326426526339897639227234078829281779535805709936910491754708089318410561463223382174656" +
                "3732124822638309210329770164805472624384237486241145309381220656491403275108664339451751216152654536133" +
                "3111314042436854805106765843493523836959653428071768775328348234345557366719731392746273629108210679280" +
                "7847180353291311767789246590899386354593278945237776744061922403376386740040213303432974969020283281459" +
                "3341882681768389307200363479562311710310129195316979460763273758925353077255237594378843450406771555577" +
                "9056450443016640119462580972216729758615026968443146952034614932291105970676243268515992834709891284706" +
                "7408620085871350162603120719031720860940812983215810772820763531866246112782455372085323653057759564300" +
                "7251774431505153960090516860322034916322264088524885243315805153484962243484829938090507048348244932745" +
                "3732624567755879089187190803662058009594743150052402532709746995318770724376825907419939632265984147498" +
                "1936092852239450397071654431564213281576889080587831834049174345562705202235648464951961124602683139709" +
                "7506938264870661326450766507461151267752274862159864253071129844118262266105716351506926002986170494542" +
                "5047491378115154139941550671256271197133252763631939606902895650288268608362241082050562430701794976171" +
                "121233066073310059947366875", -10000);
        lessTenKTest("3364476487643178326662161200510754331030214846068006390656476997468008144216666236815559551363373402558206" +
                "5332680836159373734790483865268263040892463056431887354544369559827491606602099884183933864652731300088" +
                "8302692356736131351175792974378544137521305205043477016022647583189065278908551543661595829872796829875" +
                "1063120057542878345321551510387081829896979161312785626503319548714021428753269818796204693609787990035" +
                "0962302291026368131493195275630227837628441540360584402572114334961180023091208287046088923962328835461" +
                "5057765832712525460935911282039252853934346209042452489294039017062338889910858410651831733604374707379" +
                "0855263176432573399371287193758774689747992630583706574283016163740896917842637862421283525811282051637" +
                "0298089332099905707920064367426202389783111470054074998459250360633560933883831923386783056136435351892" +
                "1332797329081337326426526339897639227234078829281779535805709936910491754708089318410561463223382174656" +
                "3732124822638309210329770164805472624384237486241145309381220656491403275108664339451751216152654536133" +
                "3111314042436854805106765843493523836959653428071768775328348234345557366719731392746273629108210679280" +
                "7847180353291311767789246590899386354593278945237776744061922403376386740040213303432974969020283281459" +
                "3341882681768389307200363479562311710310129195316979460763273758925353077255237594378843450406771555577" +
                "9056450443016640119462580972216729758615026968443146952034614932291105970676243268515992834709891284706" +
                "7408620085871350162603120719031720860940812983215810772820763531866246112782455372085323653057759564300" +
                "7251774431505153960090516860322034916322264088524885243315805153484962243484829938090507048348244932745" +
                "3732624567755879089187190803662058009594743150052402532709746995318770724376825907419939632265984147498" +
                "1936092852239450397071654431564213281576889080587831834049174345562705202235648464951961124602683139709" +
                "7506938264870661326450766507461151267752274862159864253071129844118262266105716351506926002986170494542" +
                "5047491378115154139941550671256271197133252763631939606902895650288268608362241082050562430701794976171" +
                "121233066073310059947366875", 10000);

    }
    private void lessTenKTest(String f, int i) {
        assertEquals(f, findFib(i).toString());
    }
    private void positiveMoreTenKTest(int i) {
        BigInteger fib = findFib(i);
        BigInteger fib1 = findFib(i-1);
        BigInteger fib2 = findFib(i-2);
        assertTrue(fib1.compareTo(fib2) > 0);
        assertEquals(fib2.add(fib1), fib);
    }
    private void negativeMoreTenKTest(int i) {
        BigInteger fib = findFib(i);
        BigInteger fib1 = findFib(i - 1);
        BigInteger fib2 = findFib(i - 2);
        assertTrue(fib1.abs().compareTo(fib2.abs()) < 0);
        assertEquals(fib2.add(fib1), fib);
    }
}