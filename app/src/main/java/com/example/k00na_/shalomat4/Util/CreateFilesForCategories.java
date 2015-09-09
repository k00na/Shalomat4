package com.example.k00na_.shalomat4.Util;

/**
 * Created by k00na_ on 8.9.2015.
 */

import android.content.Context;

import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;



import android.content.Context;

import com.example.k00na_.shalomat4.Model.Joke;

import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by k00na_ on 1.9.2015.
 */
public class CreateFilesForCategories {

    private static Context mContext;
    public static final String POLICAJI_FILENAME = "policaji.json";
    public static final String BLONDINKE_FILENAME = "blondinke.json";
    public static final String GOSTILNSIKE_FILENAME = "gostilniske.json";
    public static final String PRILJUBLJENI_FILENAME = "priljubljeni.json";
        public static final String JANEZEK_FILENAME = "janezek.json";


    static String[] policaji = {"Prvi vic policaji policaji, Prvi vic policaji policaji, Prvi  policaji policaji, Prvi vic, Prvi vic, Prvi vic, Prvi vic, Prvi vic, Prvi vic, Prvi vic, Prvi vic, ",
            "Drugi vic, policaji policaji, Drugi vic, Drugi vic, Drugi vic policaji policaji policaji policaji, Drugi vic policaji policaji, ",
            "Tretji policaji policaji, policaji policaji, Tretji policaji policajipolicaji policajipolicaji policaji, policaji policaji, Tretji vic, Tretji vic, Tretji vic, Tretji vic, Tretji vic, Tretji vic, Tretji vic, Tretji vic, Tretji vic, Tretji vic, Tretji vic, "};

    static String[] blodninke = {"Blondinka prijateljici razlaga o neprijetni izkušnji iz službe: “Včeraj sem zgrešila ženski WC in vstopila v moškega.” “Te je kdo videl?” je radovedna prijateljica. “Ja, tam je malo potrebo opravljal moj šef. Videla sem njegov penis!” “In kakšnega ima?” “Pa, za moj okus je preveč slan!”",
            "Blondinka vstopi v pekarno in vpraša prodajalko: “Ali imate burek?” “Imamo, samo trenutek.” pravi prodajalka. “Dobro, dajte mi ta samo trenutek in jogurt.”",
            "Zakaj so blondinke resne, ko pijejo sok iz tetrapaka ? Ker na njem piše \"concentrate\".",
            "Kdo že vrsto let uspešno zmaguje na tekmovanjih za najbolj pametno blondinko? Zlata prinašalka!",
            "Dve blondinki se pogovarjata o svojih spolnih izkušnjah. “Jaz sem prvič seksala pri štirinajstih.” se pohvali prva. “Vauu, kako ti je pa to uspelo. Jaz sem prvič samo s tremi.”",
            "V pisarni se srečata rjavolasa Manja in plavolasa Tina. “Danes izgledaš slabo. Te kaj boli?” zaskrbljeno vpraša Manja. “Ja, boli me grlo. Upam da bo jutri bolje.” ji razloži Tina. Manja blondinko Tino pokliče bližje in ji malo tišje svetuje: “Veš, poznam odlično zdravilo za tvojo težavo. Vsakič, ko me boli grlo, ga potegnem svojemu možu in naslednji dan je bolje.” “Prav, bom preizkusila.” pravi Tina. DAN POZNEJE: “Živjo. Kako si? Izgledaš precej bolje.” pozdravi Manja. “Super, tvoje zdravilo je odlično delovalo.” pravi Tina in nadaljuje: “No, tvoj mož je komaj verjel, da je to tvoja ideja.”",
            "Vpraša blondinka drugo blondinko: “A si bila na IQ testu?” “Sem!” “In, kakšni so rezultati?” “Negativen je, hvala bogu!”",
            "Pride blondinka na nabito poln avtobus in nagovori moškega, ki je sedel: \"Oprostite gospod, ali mi lahko odstopite sedež - sem namreč noseča.\" Moški ji odvrne: \"Ja koliko časa pa, saj še nimate trebuha ?\" Blondinka: \"Približno 20 minut, vendar me še vedno bolijo noge.\" ",
            "Sedijo tri blondinke v lokalu, ko ena vpraša natakarja: “Kakšno je geslo za WiFi?” Natakar ji odgovori: “Jebalvasnatakar” Blondinka zmedeno nadaljuje: “A vsako posebej?” Natakar: “Ne, vse skupaj!”",
            "Zakaj blondinka odpre mleko že v trgovini ? Zato, ker na njem piše: \"Odprite tukaj.",
            "Blondinki se sprehajata po mestu, ko ena zavpije: “Pazi, na drek boš stopila!” “To ni drek!” odgovori druga. “To je čokolada!” Prva blondinka ne verjame, se skloni, prst pomoči v rjavo maso in poskusi. “Ja, prav si imela, res je drek.” Poskusi še druga in reče: “Ja, vidiš, da sem imela prav. Še dobro, da nisva stopili vanj.”",
            "Mož se vrne domov in svoji ženi blondinki naroči: “Napravi mi kozarec gin tonica z ledom.” Blondinka se mu opraviči: “Oprosti, malo prej so mi kocke ledu padle v vrelo vodo, zdaj pa jih ne najdem več.”",
            "Čakata blondinki na avtobus. Prva vpraša drugo: \"Na kateri avtobus čakaš ?\" \"Na 1.,\" pravi druga, \"na katerega pa ti ?\" \"Na 3.,\" odvrne prva. Nato se pripelje avtobus št.13. \"SUPER,\" vzklikneta blondinki, \"zdaj pa lahko greva skupaj !\"",
            "Blondinka se oglasi v prodajalni semen: “Dober dan. Rada bi nekaj semen za ptice.” “Koliko ptic imate?” jo vpraša prodajalec. “Še nobene, prav zato bi jih rada nekaj posadila.”",
            "Kako blondinka pride do marmelade? \"Kupi krof in ga olupi.\"",
            "A blonde lady comes into a hardware store and asks for a hinge. The shop assistant brings the hinge and says: \"You wanna screw for that hinge ?\" \"No,\" the lady replies, \"but i'll blow ya' for that toaster over there !\"",
            "Kaksna je razlika med blondinko in likalno mizo? Pri likalni mizi je potrebno dati noge narazen. ",
            "Lastnika športnih avtomobilov se pogovarjata in eden reče: \"Dodatna oprema športnih avtomobilov je vedno dražja. Še posebno blondinke!\"",
            "Blondinka se je prijatelju pohvalila, da je med počitnicami potovala po Evropi. Kolega jo je vprašal: “Si med potjo iz Italije prevozila tudi Brenner?” “Ja, enega sem prevozila, toda ne vem, če mu je bilo ime Brenner.”",
            "Blondinka je na svoji divji vožnji zbila štiri pešce, ki so hodili ob cesti. Vse to je spremljal policist na motorju, ter jo z loparčkom prisilil, da ustavi. Policist stopi z motorja, ter razburjeno priteče do blondinke in pravi: “Ali ste normalni!? Zbili ste štiri ljudi!” “A koliko je dovoljeno? ga povsem mirno vpraša blondinka.",
            "Zakaj se stena podre, ko se na njo nasloni blondinka?  Pametnejši odneha.",
            "Zakaj blondinka tako hitro pokadi cigareto? “Ker ima vakum v glavi.”",
            "Kaksna je razlika med bjondo in torto?? V torto gredo tudi jajca!",
            "Zakaj blondinka polaga obkladek na rob mize ? Ker ji je zdravnik rekel, da naj da obkladek tja, kamor se je udarila. ",
            "Blondinka je na cesti srečala žensko in ji rekla:\"Mateja, ali si to ti? Joj, kako si se spremenila od osnovne šole!\"\"Oprostite, toda meni sploh ni ime Mateja!\" ji je ženska začudeno odgovorila.\"Saj je to je super!\" je odgovorila blondinka. \"Torej si spremenila tudi ime!?\"",
            "Se peljeta blondinka in črnolaska v dvigalu.\"Črnolaska:\"Zakaj v tem dvigalu smrdi po spermi?\"\"Blondinka:\"Kaj? A človek še rigniti ne sme več?\"",
            "V Sloveniji bomo čez petnajst let doživeli velik upor! \"Kdo se bo pa uprl?\" \"Blondinke, ki bodo začenjale razumeti šale, ki krožijo o njih.\"",
            "Kako zaposliš blondinko za več ur? \"Na obe strani papirja napišeš: \"Obrni!\"",
            "Dve blondinki sta na bazenu našli dve bombi.Prva blondinka reče:\"\"Nesiva bombi na policijo.\"\"Druga reče:\"Strinjam se, ampak pomisli: kaj če nama ena bomba med potjo eksplodira??\"\"Prva reče:\"Bova pa rekli, da sva našli samo eno.\"",
            "Ali veš kaj je razlika med mobitelom in blondinko? Blondinka še v kleti vleče!!!",
            "Zakaj se blondinka veseli, če puzzle zloži v štirih mesecih? \"Ker na škatli piše: od 2-5 let.\"",
            "\"Zakaj so blondinke podobne tračnicam?\"\"Ker jih polagajo po celi državi.\"",
            "Zakaj blondinka ne more šteti do 70? \"Ker ima pri 69 polna usta.\"",
            "Blondinka je povedala drugi blondinki, da je opravila test nosečnosti, ta pa jo je vprašala: \"So bila težka vprašanja?\"",
            "Zakaj blondinkam umirajo akvarijske ribice ? Ker na škatli od hrane piše \"HRANITI NA SUHEM\" ",
            "Blondinka se je začela praskati po glavi, nato pa je rekla prijateljici črnolaski, s katero je bila v družbi: \"Trska se mi je zapičila v prst!\" \"To je pa zato, ker si se praskala po glavi!\"",
            "Kaj storiš, če blondinka proti tebi vrže ročno bombo? \"Ujameš jo, odstraniš varovalko in jo vržeš nazaj.\"",
            "Kaj reče blondinka, ko ji ginekolog pove da je noseča? \"Ste sigurni da je moj?\"",
            "Zakaj je blondinka prehlajena, kadar dela z osebnim računalnikom? \"Ker ne zna zapreti Oken.\"",
            "Zakaj so vse blondinke po obisku Londona žalostne? \"Ker ugotovijo, da je Big Ben samo ura.\"",
            "Blodinka je vstopila v semenarno in rekla prodajalki:\"dajte mi seme za ptice!\"\"\"Koliko ptic pa imate?\"jo je vprašala prodajalka.\"\"Za zdaj še nič, toda nekaj bi jih želela zasaditi!\"",
            "Kaj blondinka reče po seksu? \"Hvala, fantje!\"",
            "Blondinka sedi na nabito polnem avtobusu. Na postaji pri domu upokojencev nanj vstopi starejša ženica. Pogleda po avtobusu in prvo vpraša blondinko: “Kaj če bi se zamenjali?” Blondinka: “Kaj, da jaz postanem stara baba?”",
            "Blondinki se posreči priti na Jonasov kviz. Pri tretjem vprašanju se ji zatakne in želi izkoristiti klic v sili. Pokliče domov moža jožeta in ga vpraša:  \"Joža, povej mi kaj naj izberem, polovičko ali glas ljudstva?.....",
            "\"Moram vam povedati, da bom kmalu postala mama!\" je direktorju hotela povedala sobarica - blondinka. \"Čestitam! In kdo je srečni oče?\" \"Združenje trgovskih potnikov.\"",
            "Blondinka se je zvečer vrnila iz zabave domov in mama jo je vprašala:\"Kako se kaj počutiš?\"\"Kot sončnica!\"\"Zakaj pa kot sončnica?\" se je začudila mama.\"Ker sem polna semen!\"",
            "Zakaj je blondinka vrgla drobtinice v stranišče?  Zato, da je nahranila WC račko.",
            "V slaščičarni je prodajalka vpraša blondinko, ki je kupovala celo torto:\"Naj vam torto narežem na osem kosov?\"\"Ne, samo na štiri kose! Veste, sem na shujševalni dieti!\"",
            "Kaj reče blondinka po seksu? \"Naslednji.\"",
            "Kakšna je razlika med blondinko in Bermudskim trikotnikom? \"Oba sta pogoltnila mnogo ljudi.\"",
            "Kaj imajo skupnega Beatlesi in blondinine noge? \"Že več kot četrtletje niso več skupaj.\"",
            "Zakaj blondinka pušča odprta vrata, ko se tušira? \"Da je ne bi kdo opazoval skozi ključavnico!\"",
            "Zakaj se blondinka v ponedeljek zjutraj tako sladko smeje? \"Ker je v petek zvečer slišala šalo.\"",
            "Kaj dela blondinka v puščavi? \"Sesa prah!\"",
            "Kaj se zgodi, če blondinka pomotoma poje muho? \"V želodcu ima več pameti kot v glavi.\"",
            "Kaj je skupnega blondinki in vrečki instant goveje juhe? \"Obe sta za štiri osebe.\"",
            " Blondinka je vstopila v slaščičarno in vprašala:\"Kakšen sladoled imate?\"\"Imamo razno razne sladolede!\"\"Potem mi pa dajte enega razno raznega!\"",
            "Zakaj blondinke jemljejo kontracepcijske tablete? \"Da vedo kateri dan je.\"",
            "Katere so tiste čarobne besede s katerimi lahko blondinko zvlečeš v posteljo? \"Živijo!\"",
            "Zakaj moški tako radi blondinkam šepetajo v uho? \"Ker se sliši tako lep odmev.\"",
            " Blondinka je sedela v letalu in si mazala vagino s črno kremo za čevlje. \"Kaj pa delate?\" se je zgrozila stevardesa, ko jo je zagledala kaj počne. \"Slišala sem,\" je pojasnila blondinka, \" da v primeru letalske nesreče najprej poiščejo črno skrinjico.\"",
            "Ja kaj pa delaš? \"Perem si lase.\" \"Toda lase se vendar pere z vodo!\" \"Ne, kupila sem poseben šampon za lase, na katerem piše, da je za suhe lase.\"",
            "Kako je blondinka umrla na nogometni tekmi? Potopila se je med mehiškim valom.",
            "Tri prijateljice - blondinka, rdečelaska in rjavolaska, so se izgubile v puščavi. Našle so lampo in ko so jo podrgnile se je iz nje pojavil duh, ki je rekel, da bo vsaki od njih izpolnil eno željo. Rdečelaska si je zaželela, da bi se vrnila domov in - CUP! - je že bila doma. Rjavolaska si je zaželela, da bi bila doma s svojo družino in tudi njej se je želja izpolnila. Ko je prišla na vrsto blondinka je rekla \"Aaaawww, želim si, da bi moje prijateljice bile tukaj. \" ",
            "Na samotnem otoku so se znašle blondinka, rdečelaska in rjavolaska. Kopno je bilo oddaljeno 50 kilometrov. Rdečelaska je probala preplavati razdaljo in utinila pri 15tem kilometru, rjavolaska pa pri 20tem kilometru. Blondinka je preplavala 25km, se utrudila, obrnila in odplavala nazaj.",
            "Žešči frajer in blondinka sta se vozila v frajerjevem Porsche-ju. Med vožnjo ji je rekel naj pomoli glavo skozi okno in preveri, če žmigavci delajo. Tako je tudi storila, njen odgovor pa je bil \"JA - NE - JA - NE - JA - NE ... \" ",
            "Ste že slišali tisto o blondinki, ki se je izjemno razveselila, ko ji je po šestih mesecih uspelo sestaviti sestavljanko? Na škatli je pisalo \" Od 3 do 5 let \"",
            "Rjavolaska vstopi v zdravnikovo pisarno in pove, da jo boli celo telo, kjerkoli se ga dotakne. \"Nemogoče, \" reče doktor \" pokažite mi. \" Blondinka se s svojim prstom dotakne komolca in zavpije v agoniji. Dotakne se kolena in prav tako zavpije, dotakne se gležnja - ista zgodba in tako naprej po celem telesu. Doktor je nato rekel \"Vi niste naravna rjavolaska, kajneda? \" Nato ona reče: \"Ne, pobavrvala sem se na rjavo, sicer sem blond. \" Doktor: \"Se mi je zdelo. Vaš prst je zlomljen \"",





    };
    static String[] gostilniske = {
            "\"Imate žabje krake?\" vpraša gost natakarja.\n" +
                    "\"Ne, tako hodim zaradi revme.\"",
            "Natakar teče za gostom.\n" +
            "\"Tako pa ne bo šlo, gospod! Najprej pijete, potem pa pozabite plačati!\"\n" +
            "\"Jaz vedno pijem zato, da pozabim!\"",
            "\"Natakar, pred eno uro sem naročil kozarec vina!\"\n" +
                    "\"Pomirite se.Starejše je vino, boljše je.\"",
            "Gost naroči:\n" +
                    "\"Na krožnik, ogret na pravo temperaturo, mi dajte dve jajci. Beljak ne sme biti preveč zapečen, rumenjak naj bo cel, dodajte pa malo peteršiljčka, pa ne preveč, ščep soli, ampak ne prevelik in naj bo brez popra.\n" +
                    "\"Imate še kakšno željo?\" vpraša natakar.\n" +
                    "\"Ne, to bo vse.\"\n" +
                    "\"Lahko jaz nekaj vprašam?\"\n" +
                    "\"Seveda.\"\n" +
                    "\"Kokoši, ki je znesla jajce je ime Barbara. Bo to v redu?\"",
            "\n" +
                    "\"Specialiteta te hiše so polži,\" reče natakar gostu.\n" +
                    "\"Vem, zadnjič me je eden od njih stregel,\" mu odgovori gost.",
            "V lokal pride Janez in vpraša natakarja: \"Kaj imate hladnega, da pogasim žejo?\" \"Oranžado, kokto, coca-colo, multi solo, ledeni čaj...\" \"Kar ice tea mi dajte!\" je naročil. \"Žal, tega pa nimamo!\" ",
            "\"Natakar, po mojem zrezku se sprehaja muha!\" \"Kar brez skrbi bodite, saj si je prej umila noge v vaši juhi!\" ",
            "\"Tisti ribji file, ki sem ga jedel pri vas pred mesecem dni je bil boljši, kot ta, ki ste mi ga postregli danes,\" je gost rekel natakarju. \"Nemogoče, saj je pripravljen iz iste ribe!\" se je začudil natakar.",
            "Kakšno se vam zdi kaj naše domače vino?\n" +
                    "\"No, ja, z malo olja in solate ne bi bilo slabo.\"",
            "\"Ves preznojen moški sredi poletne vročine vstopi v lokal in reče natakarju:\n" +
                    "\"Žejen sem!\"\n" +
                    "Natakar mu je ponudil kozarec vode, gost pa je vzrojil:\n" +
                    "\"Rekel sem da sem žejen, ne pa umazan!\"",
            "\"Natakar, ali je tale tekočina čaj ali kava?\"\n" +
                    "\"Po čem pa ima okus?\"\n" +
                    "\"Po terpentinu!\"\n" +
                    "\"Potem je pa kava. Čaj ima okus po milu!\"",
            "\n" +
                    "Natakar, ali vaš ansambel zaigra tudi kaj po želji gostov?\n" +
                    "\"Seveda!\"\n" +
                    "\"Potem pa članom ansambla povejte, naj zaigrajo biljard, da bom lahko v miru pojedel večerjo.\"",
            "\"Se je tu rodilo mnogo velikih mož?\" vpraša turist vodičko.\n" +
                    "\"Ne. Kot vem se tudi tu rojevajo le majhni dojenčki.\"",
            "Moški na počitnicah je bil zjutraj v hotelu ves iz sebe in za mizo pri zajtrku je vprašal moškega, ki je sedel za isto mizo:\n" +
                    "\"Ste včeraj zvečer videli, kako se je sonce potopilo v morje, kako je nebo zažarelo in so se po njem z veliko hitrostjo premikali oblaki?\"\n" +
                    "\"Ne, jaz včeraj nisem ničesar popil.\"",
            "\"Natakar, bom dočakal svojo pizzo?\"\n" +
                    "\"Glede na to, da še kar dobro izgledate, mislim da boste!\"",
            "\"Natakar, v juhi so trije lasje!\"\n" +
                    "\"Verjetno želite plešasto juho?\"",
            "\"Natakar, prinesite mi dunajski zrezek.\"\n" +
                    "\"Z veseljem!\"\n" +
                    "\"Ne, s solato in krompirjem!\"",
            "\"Ali imate školjke?\" vpraša gost natakarja.\n" +
                    "\"Na žalost jih danes ne strežemo.\"\n" +
                    "\"Zakaj pa danes ne?\"\n" +
                    "\"Ker je nedelja in so zaprte.\"",
            "\"Natakar, na krožniku sem našel polža, črva in muho!\"\n" +
                    "\"Saj ste vendar hoteli mešano meso.\"",
            "Trije prijatelji, ki so pogosto jecljali, so se odpravili v gostilno in se dogovorili, da bo zapitek plačal tisti, ki bo ob naročilu jecljal. Ko jih je natakar vprašal, kaj želijo, so naročili:\n" +
                    "\"Sok!\" je rekel prvi.\n" +
                    "\"Vodo!\" je naročil drugi.\n" +
                    "\"Kavo!\" je rekel tretji, natakar pa ga je vprašal:\n" +
                    "\"Capuccino ali ekspresso?\"",
            "\"Natakar, v moji juhi je muha!\"\n" +
                    "\"Ne razburjajte se, saj je ne bo veliko popila!\"",
            "\n" +
                    "\"Natakar, prst držite v moji juhi!\"\n" +
                    "\"Nič hudega, saj ni vroča!\"",
            "Za točilnim pultom je slonel moški in se nalival s pijačo. Svojemu kolegu je dejal:\n" +
                    "\"Pijem zato, da bi pozabil!\"\n" +
                    "\"Potem pa kar takoj plačajte račun!\" se je oglasil natakar.",
            "\"Natakar, ta piščanec mi niti malo ni všeč!\"\n" +
                    "\"Veste kaj, to je menza, ne pa razstava ptic!\"",
            "\"Kje si bil za praznike?\"\n" +
                    "\"V Portorožu, v hotelu Palace.\"\n" +
                    "\"Oho, in kje boš poleti?\"\n" +
                    "\"V hotelu Palace.\"\n" +
                    "\"No, no, kje pa delaš, da si lahko to privoščiš?\"\n" +
                    "\"Natakar sem v hotelu Palace.\"",
            "\n" +
                    "Natakar, hitro mi dajte kaj za pod zob, ker moram takoj izginiti!\n" +
                    "\"Potem vam priporočam naše obložene kruhke, ki morajo tudi čimprej izginiti.\"",
            "\n" +
                    "Turist je potoval po Balkanu in se znašel v Srbiji. Ustavil se je pred zanemarjenim hotelom, vstopil in vprašal receptorja:\n" +
                    "\"Lahko dobim sobo s tekočo vodo?\"\n" +
                    "\"Zakaj pa? Ali boste lovili ribe?\"",
            "\"Natakar, katera hrana je pri vas najboljša?\"\n" +
                    "\"Mrzla pečenka.\"\n" +
                    "\"Potem mi jo pa prinesite.\"\n" +
                    "\"Pridite jutri, danes je še topla.\"",
            "Natakar piše račun in komentira:\n" +
                    "\"Kremenateljca vam ne bom računal, ker ste ga pustili nedotaknjenega. Plačati pa boste morali skrhan nož in skrivljene vilice!\"",
            "Natakar, imate sladkor?\n" +
                    "\"Ne, revmo imam.\"",
            "Zaljubljen par sedi v restavraciji, se stiska in si šepeta nežne besede. Natakar potrpežljivo čaka na naročilo.\n" +
                    "\"Ljubica, ti si tako sladka, da bi kar tebe pojedel!\" reče mladenič svojemu dekletu.\n" +
                    "\"In s čim jo boste poplaknili?\" je vprašal natakar.",
            "Natakar, plačam!\n" +
                    "\"Kaj pa imate?\"\n" +
                    "\"Rojstni dan!\"",
            "\"Imel sem pivo, zrezek, krompir in solato,\" našteva gost natakarju, ki piše račun.\n" +
                    "\"Solate vam ne bom računal. Tisto so bile rože.\"",
            "\n" +
                    "Moški pride v bar in naroči martini. Ko mu ga natakar prinese, vzame iz kozarca olivo in jo da v poseben kozarček. Pijačo izpije, naroči nov martini in postopek ponovi. Čez eno uro je moški poln martinijev, kozarček pa oliv. Moški se dvigne, vse plača, vzame kozarček z olivami in se malo opotekajoče odpravi proti vratom. Natakar ga začudeno gleda, moški pa pojasni:\n" +
                    "\"Veste, žena me je poslala po olive.\"\n",
            "\"Natakar, v moji juhi je čebela!\"\n" +
                    "\"Verjetno se je kuhar zmotil. V jedilnem listu piše čebulna juha.\"",
            "Natakar, zakaj pa temu nabodalu pravite Roparsko nabodalo?\n" +
                    "\"Boste že izvedeli, ko vam bom prinesel račun.\"",
            "\n" +
                    "Meščan je prvič v gorah. Sreča pastirja, ki sedi na štoru in pase krave.\n" +
                    "\"Oprosti, mi lahko poveš koliko je ura?\" vpraša meščan pastirja.\n" +
                    "Pastir z rokami zagrabi za kravje vime, se skloni in pove:\n" +
                    "\"Petnajst minut do treh.\"\n" +
                    "\"Neverjetno! Kar po kravjih vimenih ste točno ugotovili koliko je ura?!\"\n" +
                    "\"Ne, kravje vime sem le nekoliko premaknil, da sem videl na zvonik v dolini.\""

    };

    public CreateFilesForCategories(Context c){

        mContext = c;
    }




    public void createCategory(String[] jokes, String fileName) throws IOException, JSONException {

        ArrayList<Joke> array = new ArrayList<Joke>();

        for(int i = 0; i<jokes.length; i++){
            Joke joke = new Joke();

            joke.setJokeContent(jokes[i]);
            joke.setJokeCategoryTitle(fileName);
            array.add(joke);
        }

        JSONSerializer serializer = new JSONSerializer(mContext);

        serializer.saveCategory(array, fileName);

    }



    public void createAllJokes() throws IOException, JSONException {

        createCategory(blodninke, BLONDINKE_FILENAME);
      //  createJokes(policaji, POLICAJI_FILENAME);
        createCategory(gostilniske, GOSTILNSIKE_FILENAME);
            createCategory(janezek, JANEZEK_FILENAME);

    }


    public static String[] getPolicaji() {
        return policaji;
    }

    public static String[] getBlodninke() {
        return blodninke;
    }

    public static String[] getGostilniske() {
        return gostilniske;
    }


        static String[] janezek = {
        "Uciteljica rece v soli: \"Ucenci, jutri naj vsak prinese v solo nekaj, kar se da v usta.\" \n" +
                "In vsak nekaj prinese: \"Eni bonbone, drugi cokolado, tretju dudo, itd...\"\n" +
                "Pa pride uciteljica do Janezka: \"Janezek, kaj pa ti skrivas pod mizo ?\"\n" +
                "Janezek pokaze luster.\n" +
                "\"Ja, Janezek, od kdaj pa se daje luster v usta ?!\" se zacudi uciteljica.\n" +
                "\"Kaj, da ne. Vceraj je moj oce rekel mami zvecer v splanici: `Daj, ugasni ze ta luster, da ti ga dam v usta!'\" ",
        "V soli so se ucili sklanjanje in Janezka poklicejo k tabli. \n" +
                "\"Janezek, kako se sklanja dedek?\" \n" +
                "\"Brez kozmodiska zelo tezko!\" ",
        "Janezek sedi ob cesti in meša drek. Mimo pride župan in pravi:\n" +
                "\"Kaj pa delaš Janezek?\"\n" +
                "Janezek se odreže:\n" +
                "\"Župana\".\n" +
                "Seveda ga župan premlati.\n" +
                "Ista zgodba se ponovi z župnikom. Omenjena gospoda se nato posvetujeta s policajem, ki gre osebno v akcijo in zaloti Janezka, ko ob cesti še vedno meša drek.Pa ga policaj vpraša:\n" +
                "\"Kaj je Janezek? A polcaja delaš?\"\n" +
                "Janezek:\"Ne, premau dreka!\"",
        "",
                "Profesor reče Janezku pri ustnem izpitu:\n" +
                        "\"Poglejte skozi okno tista drevesa! Jih vidite?\"\n" +
                        "\"Ja, vidim jih!\" reče Janezek.\n" +
                        "\"Ko bodo zopet listi na njih lahko ponovno pridete na izpit!\" ",
                "\"Zakaj ima naš Janezek pri matematiki cvek?\" vpraša mama učiteljico.\n" +
                        "\"Zato,\" odgovori učiteljica \"ker nižjih ocen nimamo.\"",
                "Oče in Janezek sta bila na morju na nudistični plaži. Očetu je nekaj bingljalo med nogami in Janezek ga vpraša kaj je to. Oče mu razloži, da je to tiček, jajčka in okoli gnezdece. Nato oče zaspi, ko pa se zbudi je v bolnici. Vpraša Janezka, kaj se je zgodilo. Pa mu reče Janezek:\n" +
                        "\"Veš, ko si zaspal sem se igral s tičkom, pa me je pljunil, zato sem mu zavil vrat, razbil jajčka in zažgal gnezdo:\"",
                "Učiteljica vpraša Janezka:\n" +
                        "\"Janezek, katerega spola je veter?\"\n" +
                        "Janezek odgovori:\n" +
                        "\"Moškega.\"\n" +
                        "Tovarišica ga pohvali, nato pa vpraša:\n" +
                        "\"In kako to vemo?\"\n" +
                        "\"Ker ženskam dviguje krila.\"",
                "Učiteljica: \"Janezek, povej mi kako bolezen.\"\n" +
                        "Janezek: \"Driska.\"\n" +
                        "Učiteljica: \"V redu. Ali poznaš koga, ki jo ima?\"\n" +
                        "Janezek: \"Poznam. Moj oče.\"\n" +
                        "Učiteljica: \"Kako pa veš, da jo ima?\"\n" +
                        "Janezek: \"Ker sem oni dan slišal mamo, ko mu je rekla: Pa kdaj bo ta tvoj drek končno otrdel?\" ",
                "V šoli se učijo o naših prednikih. Učitelj vneto razlaga, da smo nastali iz Adama in Eve.\n" +
                        "Janezek pa dvigne roko in pojasni: \"Moj oče je rekel, da smo nastali iz opic.\"\n" +
                        "Učitelj pa: \"Vaša družinska zgodovina me ne zanima...\" ",
                "Učiteljica vpraša Janezka: \"Janezek kje teče reka Sava?\" \n" +
                        "Janezek ji odgovori: \"Kaj te vi veste ki imate joške do pasa.\"\n" +
                        "Učiteljica: \"Kaj si rekel?\"\n" +
                        "Janezek: \"Da imate joške do pasa.\"\n" +
                        "Učiteljica: \"Če še mi enkrat rečeš to greva do ravnatla.\"\n" +
                        "Janezek: \"Prav, joške do pasa.\"\n" +
                        "Učiteljici je prekipelo in sta šla do ravnatla. \n" +
                        "Ravnatel vpreša Janezeka: \"Kaj si rekel učiteljici?\"\n" +
                        "Janezek: \"Da ima joške do pasa, koliko imate številko noge?\"\n" +
                        "Ravnatel: \"43.\"\n" +
                        "Janezek: \"Smrdijo pa vam za 48.\"\n" +
                        "Pa gre ravnatel ven k učiteljici. Učiteljica ga vpraša: \"No gospod ravnatelj kaj ste se zmenili?\"\n" +
                        "Ravnatelj odgovori: \"Nič.\"\n" +
                        "Učiteljica: \"Kaj bova storila?\"\n" +
                        "Ravnatel: \"Ja jaz si bom umil noge, kaj boš pa ti naredla s svojimi joškami do pasa pa ne vem.\"",
                "Mama Janezku razlaga o spolnosti.\n" +
                        "Mama Janezku reče: Veš Janezek očka svojo banano porine mami v njeno češpljo in tako nastane otrok.\n" +
                        "Janezek odgovori: Ja zakaj pa sem videl enkrat ko sem šel mimo vajine sobe da si imela očkovo banano v ustih??",
                "Janezek hodi po nudi stični plazi, kjer zagleda nekega moškega. Brž ga povpraša: \"Stric, kaj pa imate med nogami?\" \n" +
                        "Možakar se brž pohvali: \"Bombo.\"\n" +
                        "Janezek zbeži stran, moški pa za njim zakliče: \"Zakaj pa bežiš?\"\n" +
                        "\"Bomba s tako kratko zažigalno vrvico zna hitro eksplodirati!\"",
                "Poredni Janezek vpraša mamico:\n" +
                        "\n" +
                        "- Mami, kaj si pa najbolj želis za rostni dan?\n" +
                        "- Rada bi pridnega otroka!\n" +
                        "- Ojoj, potem boš morala čakati, da se vrne očka iz Nemčije. ",
                "Gre Janezek k mesarju pa reče: A mate svinjske noge?\n" +
                        "Pa mu mesar odgovori:\n" +
                        "Ja mamo,imamo.\n" +
                        "Pa spet Janezek:Ja pol si jih pa umite. ",
                "Učiteljica vpraša učenca koliko je visoka šola? On ji odgovori dva metra. Učiteljica vpraša zakaj ravno toliko? Učenec reče, ker jo imam čez glavo. ",
                "Učiteljica v osnovni šoli razlaga učencem in učenkam, kaj je basen.\n" +
                        "Naslednjo uro je spraševanje. “Janezek, kaj je basen?”\n" +
                        "“Basen je zgodba, v kateri se volk in prašički pogovarjajo, kot se pogovarjamo vi in mi.” ",
                "V šoli se pogovarjajo o spominčkih z dopustov. Pa učiteljica vpraša, če kdo ve kaj o spominčkih. Prvi se oglasi Janezek: \"Jaz sem spominek z dopusta.\"\n" +
                        "\"Tega pa nisem pričakovala.\"\n" +
                        "\"Moja mama takrat tudi ne. \" ",
                "Janezek je bil na počitnicah na deželi. Prvo noč mu je babica pela uspavanko. Po pol ure ji reče vnuček: \"Babica, te lahko nekaj prosim?\"\n" +
                        "\"Seveda, miško moj.\"\n" +
                        "\"Utihni prosim, ker bi rad spal!\" ",
                "Janezek s kolesom drvi po klancu navzdol.\n" +
                        "Spodaj se policaj zadere: \"Ustavi se ! Luči nimaš !\"\n" +
                        "Janezek: \"Bejž, bremz tut ne !\"",
                "Profesor reče Janezku pri ustnem izpitu:\n" +
                        "\"Poglejte skozi okno tista drevesa! Jih vidite?\"\n" +
                        "\"Ja, vidim jih!\" reče Janezek.\n" +
                        "\"Ko bodo zopet listi na njih lahko ponovno pridete na izpit!\" ",
                "\"Očka, ali veš kateri vlak ima največjo zamudo?\"\n" +
                        "\"Kateri?\"\n" +
                        "\"Tisti, ki si mi ga lani obljubil za novo leto.\" ",
                "Učitelj razlaga čase.\n" +
                        "Jaz sem bolan. Kateri čas je to?\n" +
                        "Najlepši čas, odvrne Janezek.",
                "V šoli pri pouku matematike učiteljica vpraša Janezka:\n" +
                        "Janezek, na veji sedijo tri vrane, lovec eno ustreli, koliko jih še sedi na veji?\n" +
                        "Nobena, učiteljica. Ustreljena pade, ostali dve pa odletita.\n" +
                        "Janezek, narobe. Dve še sedita na veji. Ampak mi je pa všeč tvoj način razmišljanja.\n" +
                        "Janezek je nekaj časa tiho, nato pa dvigne roko:\n" +
                        "Učiteljica, sedaj bi pa jaz vas nekaj vprašal!\n" +
                        "Učiteljica malo premišljuje, kaj neki bo Janezek spet ušpičil, pa ji radovednost ne da miru in se odloči:\n" +
                        "No, Janezek, pa vprašaj!\n" +
                        "Takole, po cesti hodijo tri ženske in v roki držijo sladoled. Prva ga grizlja, druga ga sesa, tretja ga pa liže. Kaj mislite, katera od teh treh je poročena?\n" +
                        "Učiteljica zardi in je malo v zadregi, nato pa le odgovori:\n" +
                        "Janezek, mislim da tista ki ga sesa!\n" +
                        "Učiteljica, narobe, tista, ki ima na roki poročni prstan. Ampak mi je pa všeč vaš način razmišljanja! ",
                "Janezek je imel izpit v šoli.\n" +
                        "Učitelj ga vpraša: \"Janezek povej mi koliko žarnic je v tem razredu?\"\n" +
                        "Janezek vidi eno luč zato reče: \"Ena.\"\n" +
                        "Učitelj pa: \"Žal mi je, padel si ker sem imel jaz še eno žarnico v žepu.\"\n" +
                        "Čez en mesec se Janezek vrne na izpit in učitelj ga ponovno vpraša: \"No Janezek povej mi sedaj koliko žarnic je v tem razredu?\"\n" +
                        "Janezek: \"Dve žarnici.\"\n" +
                        "Učitelj mu odvrne: \"Ne sedaj je pravilen odgovor ena, ker jaz nimam nobene v žepu!\"\n" +
                        "Janezek pa odgovori: \"Jo imam pa jaz!\" ",
                "Pri pouku matematike v osnovni šoli..\n" +
                        "\n" +
                        "\"Janezek, povej nam koliko je tri krat tri !\"\n" +
                        "\"Deset.\"\n" +
                        "\"Koliko je tri krat tri ?\"\n" +
                        "\"Deset !\"\n" +
                        "\"Janezek! Koliko je tri krat tri ?!\"\n" +
                        "\"Deset!! Kaj ste gluha ?!\" ",
                "Janezek prihiti v hišo in se takoj začne basati s torto, ki je na mizi. \n" +
                        "Mama mu reče:\"Počasi, Janezek, pomisli še malo na brata.\"\n" +
                        "Janezek:\"Cel čas mislim nanj, mama, zato tako hitim!\" ",
                "V šoli pozvoni telefon. \n" +
                        "Glas: \"Danes pa našega Janezeka ne bo v šolo.\" \n" +
                        "Učiteljica: \"Kdo pa kliče?\" \n" +
                        "\"Moj oče,\" se oglasi Janezek iz telefona. ",
                "Janezek prihiti v hišo in se takoj začne basati s torto, ki je na mizi. \n" +
                        "Mama mu reče:\"Počasi, Janezek, pomisli še malo na brata.\"\n" +
                        "Janezek:\"Cel čas mislim nanj, mama, zato tako hitim!\" ",
                "V šoli pozvoni telefon. \n" +
                        "Glas: \"Danes pa našega Janezeka ne bo v šolo.\" \n" +
                        "Učiteljica: \"Kdo pa kliče?\" \n" +
                        "\"Moj oče,\" se oglasi Janezek iz telefona.",
                "Janezek se je ves navdušen vrnil iz živalskega vrta.\n" +
                        "\n" +
                        "Pomisli očka, videl sem tako veliko opico, kot si ti!\n" +
                        "Ne govori neumnosti, tako velikih opic sploh ni! ",
                "Gre janezek prvi dan v šolo in za sabo vleče polno torbo, ki je bila večja kot on.\n" +
                        "\n" +
                        "Ga vidi soseda in se pošali: \"Ej torbica, kam vlečeš Janezka?\"\n" +
                        "\n" +
                        "Janezek se obrne in pogleda sosedo in pravi: \"Ej gobec kam vlečeš ta staro?\" ",
                "Janezek je strmel v cvek, ki se je svetil na njegovi nalogi. \n" +
                        "Kako to, da si pisal tako slabo, ga je vprašal prijatelj. \n" +
                        "Zaradi odsotnosti. \n" +
                        "Kaj si manjkal, ko smo obravnavali to snov? \n" +
                        "Ne, ampak moj sosed je manjkal, ko smo pisali nalogo. ",
                "Janezek, kje imaš spričevalo? vpraša oče. \n" +
                        "Janezek: \"Posodil sem ga Petru, da bo z njim prestrašil očeta.\" ",
                "Učiteljica pri pouku vpraša Janezka. \n" +
                        "Janezek povej nam, zakaj mora biti med poukom v razredu tišina? \n" +
                        "Janezek odgovori: \"Zato, ker takrat ljudje spijo!\" ",
                "Desetletni Janezek pride v gostilno in naroči viski.\n" +
                        "\"Viski pa ni za otroke!\" mu reče natakar. \"Tebi lahko dam le mleko ali pa sadni sok!\"\n" +
                        "Poldek je pričel jokati, natakar pa ga vpraša:\n" +
                        "\"In zakaj zdaj tak jok?\"\n" +
                        "\"Doma so mi rekli, da bom dobil mačka, če bom pil viski.\" ",
                "Gre Janezek v pekarno pa vpraša če majo 100kg kruha.\n" +
                        "\n" +
                        "Pa reče pek da ne.Pa pride nasledn dan pa spet upraša če majo 100kg kruha.\n" +
                        "\n" +
                        "Pa spet pek reče da nima.Pa gre pek do šefa pa mu pove da bi rad en naročil 100 kg kruha, pa mu reče šef da mu ga nj speče.\n" +
                        "\n" +
                        "Pa pride Janezek tretji dan u pekarno pa upraša če majo 100 kg kruha pa reče pek da ma.Pa reče Janezek.Ja sam to sm hoto reč da ga boste težko prodal. ",
                "Janezek leži bolan doma. \n" +
                        "\n" +
                        "Obišče ga sošolec in Janezek mu potoži, kako zanič grenka zdravila in kapljice mora jemati trikrat dnevno in nadaljuje: \"Najraje vidim, da mi jih da babica, saj jih več kot polovico zlije poleg žlice!\" ",
                "Profesorica slovenščine se jezi:\n" +
                        "\"Janez, upam, da sem te danes zadnjič zalotila pri prepisovanju!\"\n" +
                        "Janez pogumno: \"To upam tudi jaz!\" ",
                "Ob koncu šolskega leta Janezek pride domov. Prvi ga zagleda oče. \"Janezek, kje imaš spričevalo?\" vpraša oče. Janezek: \"Posodil sem ga Mihatu, da bo z njim prestrašil očeta!\"",
                "Zakaj se moram učiti angleščino, vpraša Janezek očeta. Oče: \"Janezek, zato, ker angleščino govori že skoraj ves svet!\" Janezek: \"Ja pa kaj ni že to dovolj ?\" ",
                "Nedeljsko kosilo in Janezek vpraša očeta: \"Oči, oči, zakaj si se ti poročil z mamo?\" Oče jezno vstane in reče: \"Vidiš žena, še njemu ni jasno zakaj.\" ",
                "Nekje na deželi sredi alp ... Janezek ugrizne v kranjsko klobaso in mast špricne Mihu na srajco. “Pacek!” mu zabrusi Miha. Janezek nazaj : “A jaz? Sebe poglej!” ",
                "Gre mali Janezek k očetu in se mu začne tarnati kako se nobena deklica na plaži noče pogovarjati z njim. Oče mu odgovori: Delaj to kar smo delali včasih mi, vstavi si krompir v hlače in boš videl kako se bodo prileple na tebe. Janezek to naredi in drugi dan gre spet ves besen do očeta: Pa sedaj še bolj bežijo od mene? Nato mu oče odgovori : Kompir je od spredaj! ",
                "Janezek mora za domačo nalogo napisati nekaj o svoji družini. \"Mami, kako sem jaz prišel na svet?\" : Janezek sprašuje \"Štorklja te je prinesla.\" : odgovori mama \"Pa ti?\" : vpraša Janezek mamico. \"Tudi mene je prinesla štorklja.\" \"Pa staro mamo?\" \"Tudi!\" Janezek začne nalogo s stavkom: \"Pri nas v družini že tri generacije niso imeli spolnih odnosov.\" ",
                "Janezek drvi s kolesom po klancu navzdol. Spodaj stoji policaj, ki zakriči: \"Ustavi se, nimaš luči!\" Janezek, ko drvi mimo: \"A res, sej bremz tudi nimam.\" ",
                "\"Očka, ali veš kateri vlak ima največjo zamudo?\"\n" +
                        "\"Kateri?\"\n" +
                        "\"Tisti, ki si mi ga lani obljubil za novo leto.\" ",
                "Učitelj razlaga čase.\n" +
                        "Jaz sem bolan. Kateri čas je to?\n" +
                        "Najlepši čas, odvrne Janezek. ",
                "Đanezek je imel izpit v šoli.\n" +
                        "Učitelj ga vpraša: \"Janezek povej mi koliko žarnic je v tem razredu?\"\n" +
                        "Janezek vidi eno luč zato reče: \"Ena.\"\n" +
                        "Učitelj pa: \"Žal mi je, padel si ker sem imel jaz še eno žarnico v žepu.\"\n" +
                        "Čez en mesec se Janezek vrne na izpit in učitelj ga ponovno vpraša: \"No Janezek povej mi sedaj koliko žarnic je v tem razredu?\"\n" +
                        "Janezek: \"Dve žarnici.\"\n" +
                        "Učitelj mu odvrne: \"Ne sedaj je pravilen odgovor ena, ker jaz nimam nobene v žepu!\"\n" +
                        "Janezek pa odgovori: \"Jo imam pa jaz!\" ",
                "Janezek prihiti v hišo in se takoj začne basati s torto, ki je na mizi. \n" +
                        "Mama mu reče:\"Počasi, Janezek, pomisli še malo na brata.\"\n" +
                        "Janezek:\"Cel čas mislim nanj, mama, zato tako hitim!\" ",
                "V šoli pozvoni telefon. \n" +
                        "Glas: \"Danes pa našega Janezeka ne bo v šolo.\" \n" +
                        "Učiteljica: \"Kdo pa kliče?\" \n" +
                        "\"Moj oče,\" se oglasi Janezek iz telefona. ",
                "Janezek se je ves navdušen vrnil iz živalskega vrta.\n" +
                        "\n" +
                        "Pomisli očka, videl sem tako veliko opico, kot si ti!\n" +
                        "Ne govori neumnosti, tako velikih opic sploh ni! ",
                "Gre janezek prvi dan v šolo in za sabo vleče polno torbo, ki je bila večja kot on.\n" +
                        "\n" +
                        "Ga vidi soseda in se pošali: \"Ej torbica, kam vlečeš Janezka?\"\n" +
                        "\n" +
                        "Janezek se obrne in pogleda sosedo in pravi: \"Ej gobec kam vlečeš ta staro?\" ",
                "Janezek leži bolan doma. \n" +
                        "\n" +
                        "Obišče ga sošolec in Janezek mu potoži, kako zanič grenka zdravila in kapljice mora jemati trikrat dnevno in nadaljuje: \"Najraje vidim, da mi jih da babica, saj jih več kot polovico zlije poleg žlice!\" ",
                "Janezek mora za domačo nalogo napisati nekaj o svoji družini. \"Mami, kako sem jaz prišel na svet?\" : Janezek sprašuje \"Štorklja te je prinesla.\" : odgovori mama \"Pa ti?\" : vpraša Janezek mamico. \"Tudi mene je prinesla štorklja.\" \"Pa staro mamo?\" \"Tudi!\" Janezek začne nalogo s stavkom: \"Pri nas v družini že tri generacije niso imeli spolnih odnosov.\" ",
                "Janezek je vprašal dedka: \"Dedek, ali je tista reč med nogami z leti daljša ali krajša?\" \"Oboje. Dalj časa je krajša.\" ",
                "Janezek sprašuje : \"Očka, kaj je to inflacija?\" Oče odgovori na primeru : \"To je, če mami odide v mesto, da bi si kupila nogavice, pa pride domov s krznenim plaščem!\" ",
                "\"Včeraj smo tekli kros v šoli in postal sem rekorder. Kilometer sem pretekel v eni minuti!\" se hvali Janezek. \"Nemogoče!\" mu ne verjame sošolec. \"V minuti pa nisi mogel preteči kilometra!\" Janezek odločno odvrne: \"Seveda sem! Poznam namreč bližnjico!\" ",
                "Janezek žalosten sedi za mizo, ko domov pride mama in ga vpraša: Ja sinček moj, kaj se je zgodilo? Oči me je kaznoval zaradi nečesa, kar sploh nisem naredil! Mamica začudeno : \"Česa pa nisi naredil?\" Janezek odvrne: \"Domače naloge!\" ",
                "No Janezek povej mi rešitev naslednje naloge: Tvoj oče gre peš iz Ljubljane proti Mariboru s hitrostjo 3 km/h. Tvoj stric gre eno uro pozneje iz Maribora proti Ljubljani s hitrostjo 5 km/h. Kje se srečata?\" Janezek modro odgovori : \"V prvi gostilni!\" ",
                "Vpraša tovarišica Janezka: “Janezek povej koliko sklonov ima Slovenščina?” Janezek odločnoi: “Sedem!” Učiteljica: “Janezek, si res prepričan?” Janezek: “Seveda, sedmi je novi. Imenuje se podkupovalnik, vprašamo pa se, komu in koliko.”",
                "Janezek v šoli vidi, da učiteljica nima spodnjih hlačk in jo vpraša, kaj ima med nogami. Učiteljica mu odgovori: \"Pralni stroj.\" Ko Janezek pride domov in vse pove očetu. ta po premisleku naroči Janezku, naj vpraša učiteljico, če lahko pride k nje oprati kaj perila. Janezek vpraša učiteljico ... in ta mu odgovori: \"Lahko, če ga ima veliko, če pa malo, naj ga pa kar na roke opere. \" ",
                "Janezek dobi novo kolo. Pelje se prvi krog okoli hiše in pri drugem krogu vpije: \"Glej, mama, peljem se brez rok !\"In tretji krog in zavpije: \"Glej mama, zdaj se peljem brez nog !\"In sledi četrti krog in zavpije: \"Glej mama, brez zob!\" ",
                "Janezek piše domačo nalogo, poleg njega pa dedek bere časopis. Nenadoma ga Janezek vpraša: \"Dedi, kakšen stavek pa je to: V hiši ni nobenega vina več.\" \"Strela, Janezek, to sploh ni stavek, to je katastrofa!\" ",
                "Janezek pride iz šole domov in vpraša očeta: - Ati, kaj so to diskretna vprašanja? - Veš sine, to so vprašanja, na katera ne moreš vedno odgovoriti. - No, danes mi je učiteljica spraševala sama diskretna vprašanja. ",
                "\n" +
                        "Janezek gre z ocetom mimo striptiz kluba.JANEZEK: Oci, kaj je to?\n" +
                        "OCE:Hisa sladkosti.\n" +
                        "JANEZEK:Pojdiva noter\n" +
                        "OCE:To se ni zate.\n" +
                        "Ko prideta domov Janezek vzame 10 € in gre v hiso sladkosti, kjer\n" +
                        "naroci palacinke. Ko pride domov ga oce vprasa: Kje si bil?\n" +
                        "JANEZEK:V hisi sladkosti.\n" +
                        "OCE:Kako je bilo?\n" +
                        "JANEZEK:Dobro, prvidve sem lahko,drugidve malo tezje, zadnjidve sem pa samo polizal",
                "Pride Janezek do očeta:\n" +
                        "\"Ati, kaka je razlika med prakso in teorijo?\"\n" +
                        "\"Pojdi do mame in sestre ter ju vprašaj če bi obe dale tujcu za 5000 €.\"\n" +
                        "Seveda sta obe takoj za.\n" +
                        "\"No vidiš sine, teoretično imamo mi 10000 €, praktično pa dve kurbi.\"",
                "Na izletu so prespali otroci v šotorih.Janezek ni hotel spati sam, zato je tršica rekla naj bo pri njej.Toda Janezek se premetava.\n" +
                        "Tršica ga vpraša kaj je.\n" +
                        "Navajen sem spat pri mami in imam prstek na popeku.\n" +
                        "Te pa ga daj meni tudi, pa zaspi.\n" +
                        "Čez čas se tršica oglasi:Janezek to pa ni več popek.\n" +
                        "Janezek pa: tudi moj prst ni več!",
                "Pride Janezek v drogerijo in že na vratih na ves glas vpije: \"Dajte mi škatlo kondomov, dajte mi škatlo kondomov!\"Ko je bil na vrsti, mu prodajalka pravi: \"Poslušaj, Janezek. Prvič, ne vpij na glas. Drugič, to ni za otroke in tretjič, naj pride ponje očka sam !\"Janezek pa nazaj: \"Poslušajte, vi. Prvič: v šoli so nas učili, da govorimo jasno in glasno. Drugič, to ni ZA otroke, ampak je PROTI otrokom. In tretjič, to ni za očka, ampak za mamico, ki gre za dva tedna sama na morje !\"",
                "- Janezek, kateri mesec ima osemindvajset dni?\n" +
                        "- Vsak, gospod učitelj, nekateri pa jih imajo tudi več!",
                "- Janezek, zakaj si zamudil v šolo ?- Zaspal sem, sanjal sem, da sem na nogometni tekmi.- Že, ampak to ni noben razlog !- Ja, igrali so dva podaljška.",
                "V šolo so učenci morali prinesti električne aparate. Eni so prinesli fene, drugi kavne mlinčke, tretji mešalce... Janezek pa je prinesel veliko škatlo na kateri so utripale lučke.Učiteljica: \"Janezek, ja kaj pa je to ?\"Janezek: \"Ja učiteljica, to so pa umetna pljuča.\"Učiteljica: \"Kje si jih pa dobil ?\"Janezek: \"Babici sem jih vzel.\"Učiteljica: \"Kaj pa je babica rekla ?\"Janezek: \"Nič, samo HHHHHHH je naredila.\"",
                "“Janezek, zakaj skačeš po učilnici!?” jezno kriči učiteljica.\n" +
                        "“Učitelca, pa saj ste rekli včeraj …”\n" +
                        "“Kaj sem rekla?”\n" +
                        "“Da, če se dovolj potrudim, lahko preskočim razred!”",
                "Dan po izletu na podeželje, učiteljica v pogovoru z malimi šolarji:\n" +
                        "“Učenci, kako ste se imeli na kmetiji?”\n" +
                        "“Faaaajn!” zakričijo vsi v en glas.\n" +
                        "“Povejte mi, kakšne glasove ste slišali tam.”\n" +
                        "“Muuu, beee, howhow, kikiriki …” otroci navdušeno oponašajo živali na kmetiji.\n" +
                        "“Kaj pa ti Janezek? Kaj si slišal včeraj?”\n" +
                        "“Dobro sem jih slišal.”\n" +
                        "“Kaj si pa slišal? Prosim, oponašaj to žival.”\n" +
                        "“Bilo je staro, grdo, osivelo, strašno bitje. V rokah je držalo zarjavele vile ter se glasno drlo: Izgini s tega pofukanega traktorja, mulec jebeni!”",
                "Učiteljica v pogovoru z učenci:\n" +
                        "“Janezek, mama mi je povedala, da zelo rad bereš.”\n" +
                        "“Tako je.” potrdi Janezek.\n" +
                        "“Si že bral Na klancu?”\n" +
                        "“Ne, jaz berem kjer se mi zahoče!”",
                "Mali Janezek sedi v šolski klopi in prebira športne novice. Opazi ga učiteljica:\n" +
                        "“Janezek, takoj odloži novice in se prikaži pred tablo.”\n" +
                        "Janezek vstane ter počasi pristopi do učiteljice. Ta na tablo na napiše 3:3 ter povpraša po rezultatu.\n" +
                        "“Neodločeno!” ji v športnem duhu odgovori Janezek.",
                "Pri uri naravoslovja učiteljica na tablo nariše penis.\n" +
                        "“Učenci, povejte mi kaj je to, kar sem vam narisala.”\n" +
                        "Mali Janezek hitro dvigne roko:\n" +
                        "“Jst vem, jst vem.”\n" +
                        "“Dobro Janezek, povej nam.”\n" +
                        "“To je lulček, moj oči ima dva.”\n" +
                        "Učiteljica v zadregi pogoltne slino in radovedno vpraša:\n" +
                        "“Preprosto. Malega, s katerim lula in velikega, s katerim mami pere usta.”",
                "Ravnatelj med šolsko uro vstopi v razred in naznani:\n" +
                        "“Od danes naprej v jedilnici točimo samo še nesladkan čaj.”\n" +
                        "Medtem, ko razred žalostno izdihne, se iz ozadja oglasi Janezek:\n" +
                        "“Bosta torej tudi vidva z učiteljico, za zgled nam učencem,\n" +
                        "prenehala uporabljati kondome s sladkim okusom?”",
                "Janezek pri verouku:\n" +
                        "“Gospod župnik, mi lahko zaupate geslo vašega wifija?”\n" +
                        "“Sin moj, v cerkvi ni interneta, le vsemogočni bog.”\n" +
                        "“Zakaj ni wifija? Ne želite tekmovati z nevidno silo, ki dejansko deluje?”",
                "Janezek v domači gostilni prijatelju razlaga vtise z izleta po Avstriji:\n" +
                        "“Čez teden so avstrijske gostilne prazne, pri nas pa že od zgodaj zjutraj\n" +
                        "gužva pred šankom! A je gor res tako hudo, da si ubogi jodlarji niti kave\n" +
                        "ali špricarja ne morejo privoščiti? Nekako moramo pomagati tem ljudem.”",
                "Janezek na spletu pregleduje prometne informacije, kjer opazi, da so Trojanski predori zopet zaprti. Čez nekaj trenutkov dvigne telefon in pokliče v DARS informacijski center:\n" +
                        "“Pozdravljeni, Janezek pri telefonu. Glede Trojanskih predorov imam en nasvet.”\n" +
                        "“Prosim, povejte.” je prijazen telefonist na drugi strani.\n" +
                        "“Raje obveščajte, ko so predori Trojane odprti in ne ko so zaprti. Boste imeli manj dela.”",
                "“Kako ne veš, kaj je to internet!?”\n" +
                        "Janezek sprašuje svojega dedka.\n" +
                        "“Ne skrbi. Ko boš v mojih letih, ne boš vedel, kaj je to penzija.”\n" +
                        "mu odgovori dedek.",
                "Janezek se v šoli pogovarja s svojim prijateljem srbskih korenin:\n" +
                        "“Veš Milan, druženje s tabo je podobno skoku v preteklost.”\n" +
                        "“Zakaj tako misliš?”\n" +
                        "“Danes recimo, lahko ponovno pričakam novo leto.”",
                "Učiteljica jezno vpraša Janezka:\n" +
                        "“Ti, kdo je razbil okno!?”\n" +
                        "Janezek ji odgovori:\n" +
                        "“Če mislite, da bom izdal svojega brata, se močno motite.”",
                "Učiteljica prvi dan šole nagovori učence. Nekaj besed nameni tudi Janezku, s katerim se v preteklosti nista najbolje razumela:\n" +
                        "“Janezek, resnično si želim, da letos ne bova imela težav.”\n" +
                        "“Težav morda ne bo, zna pa biti neprijetno.”\n" +
                        "“Kako to?”\n" +
                        "“Med počitnicami sem vas videl na morju.”\n" +
                        "“Ja, to pa res ni nič takega. Zakaj pa me nisi prišel pozdravit?”\n" +
                        "“Si res želite, da bi vas pozdravil, medtem ko se vi popolnoma goli sončite sredi nudistične plaže?”",
                "Janezek na mejni prehod pririne kolo z vrečo peska na njem. Do njega pristopi carinik, ter ga vpraša o vsebini vreče.\n" +
                        "“Nič takega gospod carinik, samo pesek.” odgovori Janezek.\n" +
                        "“Odpri, da preverim.” pravi carinik, ter pogleda v vrečo v katerem je res pesek: “Dobro, pelji se naprej.”\n" +
                        "Naslednji dan Janezek znova rine kolo z vrečko peska na njem. Do njega stopi carinik, in ga vpraša:\n" +
                        "“Kaj spet tovoriš v tej vrečki?”\n" +
                        "“Pesek gospod carinik, samo pesek.”\n" +
                        "Carinik vsebino preveri, ter ga spusti naprej.\n" +
                        "Tudi tretji dan se na carini odvije isti prizor, le da ga tokrat carinik vpraša:\n" +
                        "“Pa dobro, kaj ti švercaš iz dneva v dan!?”\n" +
                        "Janezek odgovori:\n" +
                        "“Kolesa!”",
                "Mati se jezi na Janezka, saj ta domov nosi slabe šolske ocene:\n" +
                        "“Sin moj, zabit si kot tele! Sploh veš kaj je to?”\n" +
                        "Janezek pomisli in odgovori:\n" +
                        "“Otrok od krave?”",
                "Učiteljica vpraša Janezka:\n" +
                        "“Janezek, naštej dele srca.”\n" +
                        "“Srce ima noge.” odgovori Janezek.\n" +
                        "“Kako to misliš?”\n" +
                        "“Skoraj vsak večer, ko gremo spat, iz spalnice zaslišim očeta, ki pravi: srce, razširi noge.”",
                "Janezek pride iz šole in joče. Oče ga vpraša:\n" +
                        "“Zakaj jočeš?”\n" +
                        "“Dobil sem enico.”\n" +
                        "“Zakaj si dobil enico?”\n" +
                        "“Nisem vedel kaj so to oblast, država in narod.”\n" +
                        "“Ne joči sine, oče ti bo vse pojasnil. Naj ti dam primer: naša hiša je država. Jaz in mama sva oblast, a narod sta vidva s sestro.”\n" +
                        "Janezek zadovoljen z odgovorom in odide v sobo. Pozneje v času večerje Janezek s sestro čaka za kuhinjsko mizo, medtem ko oče in mati seksata. To vidi Janezek in pojasni sestri:\n" +
                        "“Poglej si zdaj to! Medtem ko se oblast jebe po državi, narod strada.”",
                "Janezek pravi prijatelju:\n" +
                        "“Veš, jaz sem velik evroskeptik.”\n" +
                        "“Aja, kako pa to?”\n" +
                        "“Še nikoli nisem videl bankovca za 500 €!”",
                "Janezek se na petkov večer odpravlja na zabavo, zato vpraša očeta:\n" +
                        "“Ati, imaš kaj denarja?”\n" +
                        "Oče pogleda v denarnico in sinu odvrne:\n" +
                        "“Imam, imam … ne skrbi ti za mene!”",
                "Sošolec je Janezku povedal, da imajo vsi odrasli svoje skrivnosti. Najboljši način, da se od njih iztrži denar pa je, da se reče:\n" +
                        "“Poznam resnico.” pa če tudi je v resnici ne pozna. Seveda se Janezek odloči, da bo ta recept preizkusil doma. Prvo stopi do mamice:\n" +
                        "“Poznam pravo resnico.”\n" +
                        "Mati se šokirano obrne in pravi:\n" +
                        "“Ničesar ne povej očetu!”, v roke vzame denarnico: “evo, tukaj imaš 20 €!”\n" +
                        "Janezek zadovoljen z izkupičkom pred vrati pričaka očeta in mu takoj izstreli:\n" +
                        "“Poznam resnico!”\n" +
                        "Presenečeni oče hitro odpre denarnico:\n" +
                        "“Izvoli 50 €, pa ničesar ne povej mamici!”\n" +
                        "Do hiše ravnokar pripelje poštar, in Janezek seveda srečo preizkusi še pri njem:\n" +
                        "“Poznam pravo resnico!”\n" +
                        "Poštar takrat pade na kolena, razširi roke in reče:\n" +
                        "“Objemi me, sin moj!”",
                "Janezek se vrne iz šole domov in se pohvali pred starši:\n" +
                        "“Mami, ati, danes me je učitelj prvič pohvalil.”\n" +
                        "“Super, kaj ti je pa rekel?” je zanimalo očeta.\n" +
                        "“Rekel je, danes ste vsi neumni osli, a ti Janezek, ti si pa največji osel!”",
                "Učiteljica vpraša učence, kaj so po poklicu njihovi očetje. Otroci odgovarjajo: nekdo je poštar, drugi inženir, tretji predavatelj na univerzi. Tako vsi predstavijo svoje očete, le Janezek je neobičajno tiho. Takrat ga učiteljica vpraša:\n" +
                        "“Janezek, kaj je pa tvoj oče po poklicu?”\n" +
                        "Janezek ji odgovori:\n" +
                        "“Moj oče je striptizer v gej klubu, in za denar pleše pred ostalimi moškimi. Včasih, ko mu dobro plačajo najame sobo v hotelu in tudi s spi z njimi.”\n" +
                        "Učiteljica v šoku odpelje Janezka iz učilnice in ga vpraša:\n" +
                        "“Janezek, je to kar si povedal resnica?”\n" +
                        "Janezek ji odgovori:\n" +
                        "“Seveda ne. Moj oče je poslanec v državnem zboru Republike Slovenije, ampak me je bilo sram priznati pred vsemi sošolci.”",
                "Mati prinese Janezku sir, a ta ji potoži:\n" +
                        "“Mami, ta sir ima luknje.”\n" +
                        "Mami ga pomiri in mu svetuje:\n" +
                        "“Janezek, sir pojej, luknje pa pusti.”",
                "“Kaj mislite, bi bil France Prešeren slaven, če bi živel še danes?”\n" +
                        "je učence vprašala profesorica slovenščine.\n" +
                        "“Seveda, saj bi bil najstarejši Slovenec!”\n" +
                        "ji je zvito odgovoril Janezek.",
                "Janezek je pri urah športne vzgoje svoje sošolke pogosto poslušal, kako so se pri profesorju izgovarjale, da imajo tisti dan menstruacijo in posledično ne morejo telovaditi.\n" +
                        "Ker ni vedel kaj to sploh pomeni, se je nekega dne, ko se mu ni dalo telovaditi izgovoril:\n" +
                        "“Profesor, danes pa ne bi telovadil.”\n" +
                        "“Kaj je pa narobe?” je zanimalo športnega učitelja.\n" +
                        "“Menstruacija me muči.”\n" +
                        "“Aha. Potem pa pojdi kar do ravnateljice. Tudi ona ima te dni menstruacijo, pa se bosta odlično ujela!”",
                "Janezka nekaj dni ni bilo v šoli. Ko se je vrnil, ga je učiteljica vprašala:\n" +
                        "“Janezek, zakaj te ni bilo v šolo?”\n" +
                        "“Umrla mi je babica. Jutri Vam prinesem opravičilo.”\n" +
                        "“Moje sožalje. Zakaj je pa umrla?” je radovedna učiteljica.\n" +
                        "“Od seksa.” pravi Janezek.\n" +
                        "“Kako od seksa?” je začudena učiteljica.\n" +
                        "“Stopnice so jo zjebale.”",
                "Učiteljica vpraša “najpametnejšega” učenca: “Janezek, kaj nam daje ovca?”\n" +
                        "“Volno!” kot iz topa izstreli Janezek.\n" +
                        "“Pa kokoš?”\n" +
                        "“Jajca!”\n" +
                        "“Kaj pa krava?”\n" +
                        "“Domače naloge!”",
                "Učiteljica pred počitnicami vpraša učence:\n" +
                        "“Povejte mi, zakaj med državnimi prazniki na hišah in drogovih vihrajo zastave?”\n" +
                        "Marsikdo se zatopi v misli, ko Janezek prvi dvigne roko in odgovori:\n" +
                        "“Zato, ker piha veter!?”",
                "Učiteljica po končani kontrolni nalogi vpraša Janezka:\n" +
                        "“Janezek, zakaj si prepisoval kontrolno nalogo?”\n" +
                        "“Kako veste?” jo radovedno vpraša on.\n" +
                        "“Preprosto. Sara, ob kateri sediš je pri 5. vprašanju napisala “ne znam“,\n" +
                        "ti pa si tam napisal “niti jaz”“”.",
                "Učiteljica stresa jezo nad Janezkom:\n" +
                        "“Janezek, zakaj si prinesel svojo mačko v šolo?!”\n" +
                        "Janezek:\n" +
                        "“Se opravičujem, ampak sem jo moral rešiti pred lačnim očetom.”\n" +
                        "“Kako to misliš?” postane radovedna učiteljica.\n" +
                        "“Danes zjutraj sem slišal očeta, ko je mami rekel:\n" +
                        "pojedel ti bom muco, ko gre mali v šolo!”",
                "Janezek pride z verouku domov in vpraša mati:\n" +
                        "“Danes mi nekaj ni bilo jasno. Ali je bog moški ali ženska?”\n" +
                        "“Bog je oboje, moški in ženska.”\n" +
                        "“Kaj pa to? Ali je belec ali črnec?”\n" +
                        "“Prvo in drugo.” mu pojasnjuje mati.\n" +
                        "“Dobro mami. Ali je potem bog Michael Jackson?”",
                "Janezek v disku kakšno leto starejše dekle vpraša:\n" +
                        "“Ste za ples?”\n" +
                        "Dekle mu hladnokrvno odgovori:\n" +
                        "“Ne bom plesala z otrokom.”\n" +
                        "Janezek se opraviči:\n" +
                        "“Oprostite mi, nisem vedel, da ste noseči.”",
                "Učiteljica vpraša učence:\n" +
                        "“Otroci, naštejte mi nekaj svetovnih valut.”\n" +
                        "Prvi se zadere Marko:\n" +
                        "“Dolar!”\n" +
                        "“Bravo Marko. Dolar je valuta Združenih držav Amerike. Pozna še kdo kakšno?”\n" +
                        "Nato se javi Alenka:\n" +
                        "“Funt.”\n" +
                        "“Pravilno. S funtom plačujejo Britanci.” navdušeno učiteljica.\n" +
                        "Tretji se oglasi Janezek:\n" +
                        "“Krat.”\n" +
                        "Učiteljica začudeno:\n" +
                        "“Valute katere države pa je to? Prvič slišim.”\n" +
                        "Janezek razloži:\n" +
                        "“Obstaja, v Srbiji namreč. Moja sestra se je prejšnji teden vrnila iz Beograda in prinesla seboj novo bundo. Babica jo je vprašala, koliko je dala zanjo in sestra ji je odgovorila: 3 krat”",
                "Janezek je nepremično zrl v globok dekolte profesorice zgodovine. Ko je profesorica zaznala Janezkove poglede, mu je jezno dejala:\n" +
                        "“Za tole bi si pa eno zaslužil!”\n" +
                        "“Komu boste dali pa drugo?” se je namuznil Janezek.",
                "Učiteljica je vprašala šolarčka Janezka:\n" +
                        "“Koliko je dva plus dva?”\n" +
                        "“Štiri!”\n" +
                        "“Janezek, sedi! Pet!”\n" +
                        "Janezek: “Aja! Ja, ja, pet je!”",
                "Mali Janezek vpraša očeta:\n" +
                        "“Ati, kako je biti pijan?”\n" +
                        "“Veš sine, ni lahko, vsak pijan človek vidi dvojno. Poglej tisti dve drevesi tam. Pijan človek bi tam videl štiri drevesa!”\n" +
                        "Janezek odgovori:\n" +
                        "“Ampak ati, tam je samo eno drevo!”",
                "Janezek s šolo odpotuje v Francijo, kjer si s sošolci med drugim ogledajo tudi znameniti muzej Louvre.\n" +
                        "Ker je Janezek od hoje že precej utrujen se zlekne v velik prestižen stol.\n" +
                        "Takrat do njega jezno stopi vodič, ter pravi:\n" +
                        "“Vstani, tu vendar ne smeš sedeti! To je stol Ludvika XVI!”\n" +
                        "Janezek brezskrbno reče nazaj:\n" +
                        "“Ne skrbite. Bom vstal ko pride nazaj.”",
                "Učiteljica okara Janezka:\n" +
                        "“Zakaj si včeraj pretepel Marka?”\n" +
                        "“Ker mi je pred tremi leti rekel, da sem kot nilski konj.”\n" +
                        "“A zakaj si ga pretepel danes?!”\n" +
                        "“Ker sem včeraj videl, kakšen je nilski konj!”",
                "Janezek na uri verouka.\n" +
                        "Nuna vpraša:\n" +
                        "“Kdo bi šel rad v nebesa?”\n" +
                        "Vsi učenci razen Janezka dvignejo roke.\n" +
                        "Nuna ga vpraša:\n" +
                        "“Janezek, zakaj pa ti ne bi odšel v nebesa?”\n" +
                        "Janezek:\n" +
                        "“Mami je rekla, da moram takoj po verouku domov!”",
                "Mali Janezek je očeta zalotil med samozadovoljevanjem. Vprašal ga je:\n" +
                        "“Oče, kaj to počneš?”\n" +
                        "“Igram se igro medo ima glavo, medo nima glave.”\n" +
                        "Nato je Janezek odšel v sobo in čez nekaj časa glasno kriknil.\n" +
                        "V sobo je prihitela mati, ter vprašala kaj se je zgodilo.\n" +
                        "“Nekaj časa sem se igral medo ima glavo, medo nima glave. Potem pa me je medo pljunil, jaz sem mu pa hrbet zlomil.”",
                "Janezek: “Mami, mami! Danes sem v edini v razredu znal odgovoriti na vprašanje.”\n" +
                        "Mama: “Bravo sine. In kaj je bilo vprašanje?”\n" +
                        "Janezek: “Kdo je razbil okno.”",
                "Janezek pride na obisk k prijatelju, ter mu prinese čokolado.\n" +
                        "Prijatelj se zahvali:\n" +
                        "“Saj ne bi bilo treba.”\n" +
                        "Janezek:\n" +
                        "“Eh, saj ji je že prejšnji mesec potekel rok uporabe.”",
                "V lokal pridejo Janezek, policist, blondinka, Mujo in Haso ter Gorenjec, ter se skupaj usedejo za veliko mizo.\n" +
                        "Do njih pride natakar in presenečeno vpraša:\n" +
                        "“Kaj je to nek vic mogoče?”",
                "Mali Janezek pride v spalnico, kjer starša zaloti pri seksu.\n" +
                        "“Ati, kaj delaš?” vpraša Janezek.\n" +
                        "“Jebem ti mater, bejž ven!” se zadere fotr.\n" +
                        "Janezek odide v sobo babice in seksa z njo.\n" +
                        "V sobo pride fotr in presenečeno vpraša:\n" +
                        "“Janezek, pa kaj to delaš!?!”\n" +
                        "Janezek: “Nič. Evo, zdaj vidiš kako je, če ti nekdo jebe mater!”",
                "Janezek se igra z vžigalicami, a mu ne gre pri vžigu le te. Potegne prvo, ta se ne vžge, zato jo odvrže. Potegne drugo, ta se zlomi in jo vrže stran. Potegne tretjo, ta se vžge, Janezek jo upihne in pravi:\n" +
                        "“Ta je dobra, moram jo spraviti za drugič.”",
                "Na obisk v neko slovensko šolo je prišel Japonec.\n" +
                        "Učiteljica ga pozdravi in predstavi učencem:\n" +
                        "“To je Čeng Čung Čang iz Japonske. Vsi ga lahko vprašate, kar Vas zanima, samo Janezek, ti pa bodi raje tiho!”\n" +
                        "In tako otroci sprašujejo o Japonski, šoli in tako dalje, dokler nekdo ne vpraša, kaj pomeni njegovo ime. In Japonec odgovori, da dobesedni prevod pomeni “Sin sedem očetov”.\n" +
                        "Takrat se iz zadnje klopi oglasi Janezek:\n" +
                        "“Sem vedel, da ne more biti tako rumen samo od dveh jajc.”",
                "Učiteljica angleščine Janezku naroči, naj prevede naslednji stavek:\n" +
                        "“Mačka je padla v vodo in se utopila”\n" +
                        "Janezek:\n" +
                        "“The cat bum in the water glugluglu nor more meow meow!”",
                "Pride Janezek domov iz šole ter potoži mami:\n" +
                        "“Mami vsi me zafrkavajo, da imam veliko glavo!”\n" +
                        "Mama ga tolaži ter reče:\n" +
                        "“Janezek saj nimaš velike glave.”\n" +
                        "Medtem pa domov pride oče ter se zadere:\n" +
                        "“Kdo je parkiral kolo na hodniku?”\n" +
                        "Pa mu mama šepetajoče odgovori:\n" +
                        "“To so Janezkova očala ti bumbar”",
                "Učiteljica vpraša Janezka, če pozna kakšno afriško žival. Ker je Janezek predolgo mečkal z odgovorom mu je pomagala: “Jaguar, …”\n" +
                        "“Že vem!” so mu nenadoma zažarele oči: “februar, marec, april, …”",
                "Janezkova mamica je bila noseča in sinko jo je vprašal:\n" +
                        "“Mamica, zakaj imaš tako velik trebuh?”\n" +
                        "“To je zato, ker imam v trebuhu dojenčka,” mu je pojasnila, Janezek pa je stekel k očetu in mu rekel:\n" +
                        "“Očka, ali veš zakaj ima mamica tako velik trebuh?”\n" +
                        "“Seveda! Dojenčka bomo dobili.”\n" +
                        "“Ne, ne bomo ga! Mamica ga je pojedla.”",
                "Učiteljica zgodovine se pred učenci pohvali, da je kupila nov avtomobil Škoda Yeti 4X4\n" +
                        "Takrat se oglasi Janezek: “Se niste učili računanja? 4X4 je 16, tako smo se učili pri matematiki!”\n" +
                        "Učiteljica: “To je nekaj drugega.”\n" +
                        "Pri uri matematike učiteljica vpraša Janezka: “Janezek, koliko si star?”\n" +
                        "Janezek: “4X3!”",
                "“Ali je pošteno, da je nekdo kaznovan za nekaj, česar ni storil?” vpraša Janezek učiteljico.\n" +
                        "“Ne, to pa ne! To ne bi bilo pošteno!”\n" +
                        "“Dobro, nisem prebral domačega branja,” olajšano prizna Janezek.",
                "Mama: “Janezek, a se ti drogiraš?\n" +
                        "Janezek: “Od kje ti pa to?”\n" +
                        "Mama: “Ptička na veji mi je povedala.”\n" +
                        "Janezek: “Pogovarjaš se s pticam, nato pa me sprašuješ, če se drogiram?”",
                "Učiteljica: “Janezek, mi lahko razložiš kaj je bolj pomembno zunanjost ali notranjost?”\n" +
                        "Janezek: “Vsekakor notranjost. Kar poglejte hladilnik!”",
                "Nova učiteljica je hotela spoznati svoje učence, zato je vsakega vprašala po imenu in o tem, kaj delajo njegovi starši. Tako je na vrsto prišel tudi Janezek.\n" +
                        "“Kako ti je ime?” ga je vprašala.\n" +
                        "“Janezek.”\n" +
                        "“In kaj dela tvoj očka?”\n" +
                        "“Vsak dan se na smrt napije!”\n" +
                        "“O, to je pa hudo, če je alkoholik v družini. Kaj dela pa tvoja mamica?”\n" +
                        "“Umrla je, ker je pojedla preveč tablet!”\n" +
                        "“O, revež ubogi! Imaš še kakšnega sorodnika?”\n" +
                        "“Ja, brata imam!”\n" +
                        "“Kaj pa brat dela?”\n" +
                        "“Brat je pa na zdravstveni fakulteti.”\n" +
                        "“A, tako! Verjetno je profesor, kajne?”\n" +
                        "“Ne, njegovo truplo je študijski primer za študente!”",
                "Janezek pridno posluša pri pouku, nakar mu na tla pade radirka. Išče jo in išče, pa je nikakor ne najde. V tem času učiteljica vpraša učence:\n" +
                        "“Otroci, kaj bi mi vi napisali na nagrobnik, če bi zdaj umrla?”\n" +
                        "Vsi premišljujejo in noben ne ve, ali ne upa odgovoriti. Točno v tistem trenutku pa Janezek najde radirko in se naglas zadere:\n" +
                        "“A tu ležiš pr***** grda!”",
                "Učiteljica je vprašala Janezka:\n" +
                        "“Če so na drevesu štirje ptiči in lovec enega ustreli, koliko jih še ostane?”\n" +
                        "“Nobeden, ker bodo ostali trije odleteli.”\n" +
                        "“Ni res! Ostali bodo trije, toda tvoj način razmišljanja mi je všeč,” je rekla učiteljica.\n" +
                        "“Učiteljica, ali lahko zdaj jaz nekaj vprašam?” se je oglasil Janezek in vtaknil roke v žep.\n" +
                        "“Seveda lahko” potrdi učiteljica.\n" +
                        "“Nekaj imam v roki. Dolgo je deset centimetrov in ima rdečo kapico. Kaj je to?”\n" +
                        "Mlada učiteljica je zardela in komaj prišla do zraka od razburjenja:\n" +
                        "“Ampak…..Janezek….!”\n" +
                        "“Janezek odkima, potegne roko iz žepa in pokaže rdeč flomaster.\n" +
                        "“Ne, ni to, kar ste mislili. Vendar mi je všeč, kako ste razmišljali.”",
                "“Kako to, da na govorilnih urah še nisem videla tvoje mamice?” vpraša učiteljica Janezka.\n" +
                        "Janezek hudomušno odgovori: “Prinesel vam bom sliko!”",
                "Oče vpraša Janezka: “Kaj bi rad bil, ko odrasteš?”\n" +
                        "Janezek: “Čistilec bazenov.”\n" +
                        "“Kako pa to? Res ne bil kaj drugega?”\n" +
                        "Janezek: “Bil bi tudi vodovodar, dostavljalec pic, vrtnar ali pa Božiček.”\n" +
                        "Oče se zamisli, nato pa gre k ženi: “Poslušaj, izgleda da je Janezek našel najine porniče.”",
                "Učiteljica: “Ste si vsi vse zapomnili?”\n" +
                        "(Janezek dvigne roko)\n" +
                        "Učiteljica: “Kaj je Janezek?”\n" +
                        "Janezek: “Jaz si nisem nič zapomnil.”\n" +
                        "Učiteljica: “Kaj pa nič ne poslušaš?”\n" +
                        "Janezek: “Jebem ti mater!”\n" +
                        "Učiteljica: “JANEZEK, KAJ SI REKEL?!?”\n" +
                        "Janezek: “No vidite, tudi vi ne poslušate!”",
                "Janezka varuje njegova skrbna babica.\n" +
                        "Ker mu je dolgčas, babico vpraša:\n" +
                        "“Babi, a se lahko igram s tvojimi joškami?”\n" +
                        "“Seveda, samo ne it čez cesto.”",
                "Oče gleda finalni prenos nogometne tekme.\n" +
                        "V sobo pridrvi Janezek: “Oči, oči, pridi hitro, mamo je na cesti zbil tovornjak!”\n" +
                        "Oče: “Janezek, pojdi ven in na ves glas jokaj, pridem po končanih podlajških!”",
                "Janezek se zvečer pozno vrne domov in vpraša očeta: “Oče, ti danes povem, kako sem se vozil s skuterjem, ali boš raje počakal do jutri in vse prebral v časopisu?",
                "Janezek: “Ati, ati a si slišal, da so se podražile cigarete?”\n" +
                        "Oče: “Sem ja, pa kaj potem!”\n" +
                        "Janezek: “To pomeni, da boš zdaj malo manj kadil kajne?”\n" +
                        "Oče: “Ne sine, to pomeni, da boš ti malo manj jedel!”",
                "Lekarnar naroči Janezku: “Tukaj imaš zdravilo za očeta. Pred uporabo ga je treba dobro pretresti.”\n" +
                        "Janezek: “Ne bo šlo.”\n" +
                        "Lekarnar: “Zakaj ne?”\n" +
                        "Janezek: “Oče ima več kot 100 kilogramov.",
                "Učitelj v šoli razlaga:\n" +
                        "“Mravlje delajo brez premora dvanajst ur na dan. Kaj nam to pove?”\n" +
                        "Roko dvigne Janezek in odgovori:\n" +
                        "“To pomeni, da imajo nesposoben sindikat.”",
                "Profesor: “Midva se pa že poznava, kajne?” Janezek: “Da, lani sem bil na izpitu. Takrat mi je spodletelo.” Profesor: “No, ja, bo šlo pa danes bolj gladko. Se spomnite, kakšno je bilo lani moje prvo vprašanje?” Janezek: ” Midva se pa že poznava, kajne?”",
                "Oče krega Janezka doma in mu reče: “Ti si tako zabit kot tale miza”, ter potrka po njej.\n" +
                        "Janezek: “Oči, nekdo trka..”\n" +
                        "Oče: “Tukaj počakaj, grem pogledat kdo je…”",
                "Janezek gre mimo trgovine in pljune v izložbeno okno. Ven prihiti šef trgovine in ga ozmerja: “Smrkavec nesramni! Kaj bi pa tvoj oče rekel, če bi jaz pljunil v vaše okno.”\n" +
                        "Janezek: “Bil bi zelo navdušen.”\n" +
                        "Šef: “Kaj misliš s tem, da bi bil navdušen?”\n" +
                        "Janezek: “Stanujemo v 15. nadstropju…”",
                "Nekega dne je učiteljica v razredu govorila o poroki. Učiteljica: “Kakšno ženo bi ti imel rad, Janezek?” Janezek: “Rad bi imel tako kot je luna…” Učiteljica: “O, kakšen izbor … ali bi rad, da je tako lepa in hladna kot luna?” Janezek: “NE! Želim, da bi prišla zvečer in izginila zjutraj.”",
                "Janezek: “Oči, zakaj babi cele dneve prebira Biblijo?\n" +
                        "Oče: “Pripravlja se na sprejemnega.”",
                "Policist ustavi Janeza zaradi vožnje v nasprotno stran enosmerne ulice in ga vpraša:\n" +
                        "“Gospod, kaj niste videli puščice?” \u000B\n" +
                        "“Kakšne puščice? Saj še Indijancev nisem videl!”",
                "V šoli: “Otroci, ali je kdo med vami morda že kdaj rešil komu življenje?”\n" +
                        "Janezek: “Jaz. In to mojemu nečaku.”\n" +
                        "Učiteljica: “Kako pa si to naredil?”\n" +
                        "Janezek: “Ta starejši sestri sem skril tabletke.”",
                "Dedek: “Janezek, ali veš zakaj je pred vrati tvoj učitelj?”\n" +
                        "Janezek: “Dedi, skrij se! Danes sm rekel, da si včeraj umrl!”",
                "Janezek pride iz šole z obvestilom o ocenah prve konference in se hudo razjoče.\n" +
                        "“Zakaj pa jokaš?” ga vpraša dedek.\n" +
                        "“Dobil sem dve enici!”\n" +
                        "“No, saj jih boš lahko popravil v drugi konferenci.”\n" +
                        "“Sem probal, pa ne gre, ker sta napisani s črnilom!”",
                "Učiteljica: “Tišina! Nočem več slišati nobenga komentarja!”\n" +
                        "Janezek: “A lahko lajkamo?”",
                "Janezek se je s starši peljal z ladjo. Med potjo je ostalim potnikom ves čas postavljal neumna vprašanja. Staršema so popustili živci in mu naročita, naj bo vsaj pet minut tiho. Starejši gospe, se je Janezek zasmilil zato mu je rekla: “Kar mene vprašaj, če te kaj zanima.” Janezek jo je gledal in premišljeval kaj bi jo vprašal: “Gospa, zakaj pa imate brke?”",
                "Učitelji v 6. razredu osemletke vpraša: \n" +
                        "\"Kateri človeški organ se 10-krat poveča, ko je stimuliran?\" \n" +
                        "Mojca mu odgovori: \n" +
                        "\"Učitelj, tega nas pa ne bi smeli učiti!?\"  \n" +
                        "Učitelj ignorira Mojčino izjavo in pokima Janezku, ki drži roko gor. \n" +
                        "Janezek:\" To je zenica, učitelj.\" \n" +
                        "Učitelj: \"Pravilno, Janezek. Mojca zate imam pa samo dve opombi: \n" +
                        "1. Imaš zelo grde misli. \n" +
                        "2. Enkrat v življenju boš ZELO, ZELO razočarana!!!\"",
                "Učenci razjezijo učitelja zato jim ta reče:”Kdor misli, da je neumen, naj vstane. Nekaj časa nihče ne vstane potem pa se Janezek le upogumi in vstane. Učitelj ga vpraša: “Janezek, a ti misliš, da si neumen?” \n" +
                        "Janezek odgovori: “Ne gospod profesor, toda nerodno mi je, ker samo vi stojite!”",
                "Janezek pride v trgovino in reče prodajalcu:\n" +
                        "\n" +
                        "- Daj mi liter vina.\n" +
                        "\n" +
                        "Prodajalec vpraša:\n" +
                        "\n" +
                        "- Hočete rdeče ali belo vino?\n" +
                        "\n" +
                        "Janezek odgovori:\n" +
                        "\n" +
                        "- Je čisto vseeno. To je za mojega dedka, ki je slep.",
                "Janezek pove očetu, ko se ta vrne:\n" +
                        "\n" +
                        "- Veš oči potem, ko si ti odšel na službeno potovanje je mamo obiskal ekolog!\n" +
                        "\n" +
                        "- Kako pa veš, da je bil ekolog?\n" +
                        "\n" +
                        "- Ko je prišel je mamo vprašal če je zrak čist…",
                "V šoli so učenci dobili nalogo naj napišejo spis z naslovom: “Kaj bi naredili če bi bili direktor?” Vsi učenci pridno pišejo, le Janezek sedi in čaka križemrok. Učiteljica ga jezno vpraša:\n" +
                        "\n" +
                        "- Janezek, zakaj pa ti ne pišeš?\n" +
                        "\n" +
                        "- Čakam tajnico, da mi natipka!",
                "Učiteljica sprašuje:\n" +
                        "\n" +
                        "- Janezek, kdo je odkril Ameriko?\n" +
                        "\n" +
                        "Janezek:\n" +
                        "\n" +
                        "- Nisem bil jaz, prisežem!\n" +
                        "\n" +
                        "Učiteljica:\n" +
                        "\n" +
                        "- Vem, da je nisi ti, ampak povej kdo jo je?\n" +
                        "\n" +
                        "Janezek:\n" +
                        "\n" +
                        "- Res nisem bil jaz prisežem.\n" +
                        "\n" +
                        "Učiteljica:\n" +
                        "\n" +
                        "- Pa ti ne veš niti najbolj osnovnih stvari!!\n" +
                        "\n" +
                        "V tistem trenutku gre mimo razreda ravnatelj in ker sliši vpitje vstopi v razred in vpraša:\n" +
                        "\n" +
                        "- Zakaj se pa derete gospa?\n" +
                        "\n" +
                        "Učiteljica:\n" +
                        "\n" +
                        "- Janezka sprašujem kdo je odkril Ameriko, on pa vztrajno trdi, da ni bil on.\n" +
                        "\n" +
                        "Ravnatelj:\n" +
                        "\n" +
                        "- Pustite otroka pri miru, mogoče pa res ni bil on.",
                "Janezek zakaj je na roditeljski sestanek prišel tvoj dedek? Ali so doma vsi drugi tako zaposleni?\n" +
                        "\n" +
                        "- Niso. Ampak dedek edini slabo sliši.",
                "Po maši Janezek vpraša mamo:\n" +
                        "\n" +
                        "- Mami ali je res, da se ljudje spremenimo v prah, ko umrejo?\n" +
                        "\n" +
                        "- Ja res je.\n" +
                        "\n" +
                        "- Potem je pa kar nekaj ljudi umrlo pod mojo posteljo.",
                "Janezek pride iz šole domov in vpraša očeta kaj je to tranvestit. Oče mu odgovori:\n" +
                        "\n" +
                        "- Pojdi k mami, ti bo on povedal!",
                "Učiteljica:\n" +
                        "\n" +
                        "- Janezek naštej tri afriške živali:\n" +
                        "\n" +
                        "Janezek:\n" +
                        "\n" +
                        "- Žirafa in dve zebri.",
                "Janezek piše domačo nalogo in vpraša očeta:\n" +
                        "\n" +
                        "- Ati, kje je Afrika?\n" +
                        "\n" +
                        "- Ne vem točno, ampak mislim, da ni daleč. V mojem podjetju dela en črnec, ki vsako jutro v službo pride s kolesom."

        };

}
