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
    static String[] gostilniske = {"Natakar teče za gostom.\n" +
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
}
