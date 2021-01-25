package task4;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;
import static task4.NewFib.f;

public class MainTest {
    private final BigInteger founded10K = new BigInteger("336447648764317832666216120051075433103021484606800639065647699746800814421666623681555" +
            "9551363373402558206533268083615937373479048386526826304089246305643188735454436955982749160660209988418393386465273130008883026923567361" +
            "3135117579297437854413752130520504347701602264758318906527890855154366159582987279682987510631200575428783453215515103870818298969791613" +
            "1278562650331954871402142875326981879620469360978799003509623022910263681314931952756302278376284415403605844025721143349611800230912082" +
            "8704608892396232883546150577658327125254609359112820392528539343462090424524892940390170623388899108584106518317336043747073790855263176" +
            "4325733993712871937587746897479926305837065742830161637408969178426378624212835258112820516370298089332099905707920064367426202389783111" +
            "4700540749984592503606335609338838319233867830561364353518921332797329081337326426526339897639227234078829281779535805709936910491754708" +
            "0893184105614632233821746563732124822638309210329770164805472624384237486241145309381220656491403275108664339451751216152654536133311131" +
            "4042436854805106765843493523836959653428071768775328348234345557366719731392746273629108210679280784718035329131176778924659089938635459" +
            "3278945237776744061922403376386740040213303432974969020283281459334188268176838930720036347956231171031012919531697946076327375892535307" +
            "7255237594378843450406771555577905645044301664011946258097221672975861502696844314695203461493229110597067624326851599283470989128470674" +
            "0862008587135016260312071903172086094081298321581077282076353186624611278245537208532365305775956430072517744315051539600905168603220349" +
            "1632226408852488524331580515348496224348482993809050704834824493274537326245677558790891871908036620580095947431500524025327097469953187" +
            "7072437682590741993963226598414749819360928522394503970716544315642132815768890805878318340491743455627052022356484649519611246026831397" +
            "0975069382648706613264507665074611512677522748621598642530711298441182622661057163515069260029861704945425047491378115154139941550671256" +
            "271197133252763631939606902895650288268608362241082050562430701794976171121233066073310059947366875");
    /*private final BigInteger founded9999 = new BigInteger("20793608237133498072112648988642836825087036094015903119682945866528501423455686648927" +
            "4560343052265155917573432971901580106247942672509731761338101799027380382317897483462355564831914315919245323944200280678103204087244146" +
            "9346284906266838708330804825092065449334087873322637758084744632487379760373479464825811385863155040408101726038120291994389237094285260" +
            "1647398213554479081823593715429566945149312993664846779090437799284773675379284270660175134664833266377698642012106891355791141872776934" +
            "0808035049567940946482928805660563647181876626689707585373833526774208355741559456585420036347653245410061210124467856891714948032624086" +
            "0269309121160197393822944663604990153196328615969907788042772028923553932967187718291564341907918652511867885682160089752017107049943765" +
            "7067342400871083908811800976259727431820539554256869460815355918458253398234382360435762759823179896116748424269545924633204614137992850" +
            "8143520187384809235815539889908971514694061316956144977837207434613737562186851068568260906963398154909212537145372418669116042505973537" +
            "4782373326817818219850924022695582641601669008474981607284358248861318482990538315018004784435375155420157383310552198099812383325326122" +
            "8689824051777846588461079790807828367132384798451794011076569057522158680378961532160858387223882974380483931929541222100800313580688585" +
            "0025988795664632214278204484925650731065958088374016489964235633861097820456341224678729218456064091743606356182168838125623216644428229" +
            "5253757749271536532113420453068674243545450510326976814437011849490639025493494235890403150987736972243705338316536038859511698024592793" +
            "5225901537634925654872380877183008301074569444002426436414756905094535072804764684492105680024739914490555904391369218696387092918189246" +
            "1571034503870502293006032416114107074539600801709282779518347632167052424858208014238665266338160829214428830954632590804718193292017101" +
            "4782802522138565634020748979631766327887220760779103443170011275355881347888872750382538906682309868335569571813786788298211171079642270" +
            "6778536913192342733364556727928018953989153106047379741280794091639429908796650294603536651238230626");*/
    private final BigInteger foundedMinus10K = new BigInteger("-336447648764317832666216120051075433103021484606800639065647699746800814421666623" +
            "6815559551363373402558206533268083615937373479048386526826304089246305643188735454436955982749160660209988418393386465273130008883026923" +
            "5673613135117579297437854413752130520504347701602264758318906527890855154366159582987279682987510631200575428783453215515103870818298969" +
            "7916131278562650331954871402142875326981879620469360978799003509623022910263681314931952756302278376284415403605844025721143349611800230" +
            "9120828704608892396232883546150577658327125254609359112820392528539343462090424524892940390170623388899108584106518317336043747073790855" +
            "2631764325733993712871937587746897479926305837065742830161637408969178426378624212835258112820516370298089332099905707920064367426202389" +
            "7831114700540749984592503606335609338838319233867830561364353518921332797329081337326426526339897639227234078829281779535805709936910491" +
            "7547080893184105614632233821746563732124822638309210329770164805472624384237486241145309381220656491403275108664339451751216152654536133" +
            "3111314042436854805106765843493523836959653428071768775328348234345557366719731392746273629108210679280784718035329131176778924659089938" +
            "6354593278945237776744061922403376386740040213303432974969020283281459334188268176838930720036347956231171031012919531697946076327375892" +
            "5353077255237594378843450406771555577905645044301664011946258097221672975861502696844314695203461493229110597067624326851599283470989128" +
            "4706740862008587135016260312071903172086094081298321581077282076353186624611278245537208532365305775956430072517744315051539600905168603" +
            "2203491632226408852488524331580515348496224348482993809050704834824493274537326245677558790891871908036620580095947431500524025327097469" +
            "9531877072437682590741993963226598414749819360928522394503970716544315642132815768890805878318340491743455627052022356484649519611246026" +
            "8313970975069382648706613264507665074611512677522748621598642530711298441182622661057163515069260029861704945425047491378115154139941550" +
            "671256271197133252763631939606902895650288268608362241082050562430701794976171121233066073310059947366875");
    /*private final BigInteger foundedMinus9999 = new BigInteger("207936082371334980721126489886428368250870360940159031196829458665285014234556866" +
            "4892745603430522651559175734329719015801062479426725097317613381017990273803823178974834623555648319143159192453239442002806781032040872" +
            "4414693462849062668387083308048250920654493340878733226377580847446324873797603734794648258113858631550404081017260381202919943892370942" +
            "8526016473982135544790818235937154295669451493129936648467790904377992847736753792842706601751346648332663776986420121068913557911418727" +
            "7693408080350495679409464829288056605636471818766266897075853738335267742083557415594565854200363476532454100612101244678568917149480326" +
            "2408602693091211601973938229446636049901531963286159699077880427720289235539329671877182915643419079186525118678856821600897520171070499" +
            "4376570673424008710839088118009762597274318205395542568694608153559184582533982343823604357627598231798961167484242695459246332046141379" +
            "9285081435201873848092358155398899089715146940613169561449778372074346137375621868510685682609069633981549092125371453724186691160425059" +
            "7353747823733268178182198509240226955826416016690084749816072843582488613184829905383150180047844353751554201573833105521980998123833253" +
            "2612286898240517778465884610797908078283671323847984517940110765690575221586803789615321608583872238829743804839319295412221008003135806" +
            "8858500259887956646322142782044849256507310659580883740164899642356338610978204563412246787292184560640917436063561821688381256232166444" +
            "2822952537577492715365321134204530686742435454505103269768144370118494906390254934942358904031509877369722437053383165360388595116980245" +
            "9279352259015376349256548723808771830083010745694440024264364147569050945350728047646844921056800247399144905559043913692186963870929181" +
            "8924615710345038705022930060324161141070745396008017092827795183476321670524248582080142386652663381608292144288309546325908047181932920" +
            "1710147828025221385656340207489796317663278872207607791034431700112753558813478888727503825389066823098683355695718137867882982111710796" +
            "422706778536913192342733364556727928018953989153106047379741280794091639429908796650294603536651238230626");*/

    private void a(String e, BigInteger a){ assertEquals(new BigInteger(e), a); }
    private void a(BigInteger e, BigInteger a){ assertEquals(e, a); }
    /////////////////////////////////////////////////1. Граничные значения области определения.
    @Test public void minMax() {
        a(f(-1999998).add((f(-1999999)).multiply(new BigInteger("-1"))), f(-2000000));
        a(f(1999998).add(f(1999999)), f(2000000));
    }
    /////////////////////////////////////////////////2. Классы эквивалентности
    /////////////////////////////////////////////////2.1 Границы классов эквивалентности
    @Test public void classes(){

        a("-1", f(-2));
        a((f(0).add((f(-1)).multiply(new BigInteger("-1")))), f(-2));

        a("1", f(2));
        a((f(0).add(f(1))), f(2));
    }
    /////////////////////////////////////////////////2.2 Впритык слева и справа от границы
    @Test public void rightLeftSteps(){
        a("2", f(-3));
        a("1", f(-1));

        a("2", f(3));
        a("1", f(1));
    }
    /////////////////////////////////////////////////2.3 Внутри класса эквивалентности
    @Test public void internal(){
        a("354224848179261915075", f(100));
        a("-354224848179261915075", f(-100));
        a("514229", f(29));
        a("514229", f(-29));
        a("498454011879264", f(72));
        a("-498454011879264", f(-72));
        a("685146298126536953630429887722323115406435539062319541988566" +
                "1484162849735541256952762360871448156142552148460793441585691068131682370" +
                "8551350198968258080863174306483609412033918328687427156400362460532591360" +
                "14253626356840914521594989", f(1111));
        a("685146298126536953630429887722323115406435539062319541988566" +
                "1484162849735541256952762360871448156142552148460793441585691068131682370" +
                "8551350198968258080863174306483609412033918328687427156400362460532591360" +
                "14253626356840914521594989", f(-1111));
    }
    /////////////////////////////////////////////////3. Предметная область
    @Test public void subjectArea() {
        a("1", f(1));
        a("1", f(2));
        a("2", f(3));
        a("3", f(4));
        a("5", f(5));
        a("8", f(6));
        a("13", f(7));
        a("21", f(8));
        a("34", f(9));
        a("55", f(10));
        a("89", f(11));
        a("144", f(12));
        a("233", f(13));
        a("377", f(14));
        a("610", f(15));
        a("987", f(16));
        a("1597", f(17));
        a("2584", f(18));
        a("4181", f(19));
        a("6765", f(20));
        a("1", f(-1));
        a("-1", f(-2));
        a("2", f(-3));
        a("-3", f(-4));
        a("5", f(-5));
        a("-8", f(-6));
        a("13", f(-7));
        a("-21", f(-8));
        a("34", f(-9));
        a("-55", f(-10));
        a("89", f(-11));
        a("-144", f(-12));
        a("233", f(-13));
        a("-377", f(-14));
        a("610", f(-15));
        a("-987", f(-16));
        a("1597", f(-17));
        a("-2584", f(-18));
        a("4181", f(-19));
        a("-6765", f(-20));
    }
    /////////////////////////////////////////////////////4. Реализация
    @Test public void real() {
        a("1", f(1));
        a("0", f(0));
        a("1", f(-1));
    }
    /////////////////////////////////////////////////////5. Случайные значения
    @Test public void random() {
        a("4052739537881", f(62));
        a("-1304969544928657", f(-74));
        a("679891637638612258", f(87));
        a("37889062373143906", f(81));
        a("1134903170", f(45));
        a("9227465", f(35));
        a("10946", f(-21));
        a("196418", f(27));
    }
    /////////////////////////////////////////////////////6. Другие особые значения
    @Test public void special(){
        a(foundedMinus10K, f(-10000));
        a((f(-9998).add((f(-9999)).multiply(new BigInteger("-1")))), f(-10000));

        a(founded10K, f(10000));
        a((f(9998).add(f(9999))), f(10000));
    }
}