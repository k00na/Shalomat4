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
        public static final String TVOJAMAMA_FILENAME = "tvojamama.json";
        public static final String JANEZEK_FILENAME = "janezek.json";
        public static final String MUJOHASO_FILENAME = "mujohaso.json";
        public static final String CRNIHUMOR_FILENAME = "crnihumor.json";
        public static final String TASCE_FILENAME = "tasce.json";
        public static final String POLITICNI_FILENAME = "politicni.json";
        public static final String YUGO_FILENAME = "yugo.json";
        public static final String VSIVICI_FILENAME = "vsivici.json";
        public static final String OPOLZKE_FILENAME = "opolzke.json";


    static String[] policaji = {"Policist Božo povabi kolega Petra domov, da mu pokaže novo pridobitev. In res. Ko prideta v Božovo stanovanje Božo pravi:  \"Poglej, kaj sva si kupila z ženo!\" in pokaže Petru hladilnik.  \"Kaj pa je to?\" je začudeno vprašal Peter.  \"Hladilnik. Karkoli postaviš noter, vse ostane hladno!\"  \"Zakaj pa je to?\" je vprašal Peter, ko je videl predal za odlaganje jajc.  \"To je pa za jajca. Toda, previdno če imaš prevelika. Jaz sem jih dal notri, pa me je strašno bolelo, ko sem zaprl vrata.\"",

    "Policist Janko se ne more odločiti, kateri avto bi kupil.  \"Ta avto je res super,\" reče prodajalec. \"Motor teče mirno in dobro ter potegne 200 km.\"  \"No, ne vem, \" reče policist, \"jaz bi se peljal kam dalj.\"",
            "\"Kakšen je policist, ki že teden dni ni opravil velike potrebe?\"  \"Poln sam sebe!\"",
            "Policista sta patruljirala v Marxovem parku. Na tleh sta zagledala moško truplo z nožem v srcu. Policist, ki je znal pisati je iz žepa vzel notes in rekel kolegu:  \"Narekuj mi!\"  In drugi policist je začel: \"Dne 15.7. ob 22.45 uri sva pri kontroli terena v Marxovem....\"  \"Čakaj! Čakaj!\" ga je prekinil pismeni policist. \"Kako pa se napiše Marxov park?\"  \"Tega pa ne vem, saj znaš ti pisati ne pa jaz!\"  Pismeni policist nekaj časa premišljuje, nato pa reče:  \"Nič! Primiva ga in ga odnesiva na Dalmatinovo ulico!\"",
            "Direktor živalskega vrta se je oglasil na policiji in povedal, da je iz živalskega vrta ušel slon.  \"Ima kakšna posebna vidna znamenja, po čemer bi se ga dalo prepoznati?\" ga je vprašal policist.",
            "Scena doma. Policist hoče storiti samomor. Prisloni si cev pištole na sence, žena pa se krohota. On ji jezno zavpije:  \"Kaj se smeješ? Ti boš naslednja!\"",
            "Policista sta se skregala v prostorih policijske postaje.  \"Ti si največji norec, kar sem jih kdaj videl!\" je zavpil prvi.  \"Ti si pa idiot, da ni večjega na svetu!\" je rekel drugi.  Takrat je mimo prišel komandir in rekel:  \"Očitno sta pozabila, da sem jaz še v službi!\"",
            "\"Kakšna je razlika med policistom in penisom?  \"Ni razlike. Oba sta organa za notranje zadeve.\"",
            "\"Kaj mora piti policist, če želi imeti 0,5 promile alkohola v krvi?\"  \"Tri dni nič!\"",
            "\"Kaj?\" se je začudil Milan, ko je srečal znanca, policista Egona. \"Ali nisi ti umrl? Kdo je pa potem umrl v vaši družini? Tvoj brat?\"  \"Ne, verjetno jaz! Pri bratu sem bil pred pol ure, pa je bil še živ!\"",
            "Policist si je ogledal kiparsko razstavo. Znani kipar je razstavljal čudovite figure in policist ga je vprašal:  \"Kako pa ste uspeli narediti nekaj tako lepega?\"  \"Vzel sem kose marmorja in ga izklesal.\"  \"Kako ste pa vedeli, da so notri tako lepe figure?\"",
            "Janez sreča Simona, ki je bil ves v modricah.  \"Kaj se ti je pa zgodilo?\" ga je vprašal.  \"Policisti so me pretepli!\"  \"To pa ne more biti res. Policisti danes ne pretepajo več ljudi!\"  \"Danes mogoče res ne, toda, mene so pretepli včeraj!\"",
            "Policist je svoj dopust preživel v Indiji. Ko se je vrnil na delo je imel na čelu tetovirano veliko piko.  \"Kaj pa pomeni ta znak na tvojem čelu?\" ga je vprašal komandir.  \"To je indijski okrasek. Rekli so mi, da mi tukaj nekaj manjka.\"",
            "\"Veš, moj sin bo šel pa v pomožno šolo!\" je rekel policist kolegu.  \"Kar pusti ga, kar naj gre če ga to veseli.\"",
            "Policist je zaustavil mlado simpatično voznico, ki je storila prometni prekršek, in jo vprašal:  \"Ali veste, zakaj sem vas zaustavil?\"  \"Moment, naj ugibam,\" je rekla. \"Ste osamljeni?\"",
            "Mali Jure je na cesti opazoval policista pri delu. Policist ga je zagledal, pristopil k njemu in ga vprašal:  \"Boš ti tudi policist, ko boš velik?\"  \"Jaz ne, bo pa moj brat, ki mu učenje ne gre najbolje od rok.\"",
            "Policaj hodi po ulici in pomembno vrti gumijevko v roki. Nenadoma mu ta uide iz rok., pa tako nesrečno, da ga zadene v oko. Oko mu izteče. Vstavijo mu stekleno oko in izplačajo visoko odškodnino. Zanjo si kupi črno- bel televizor. Prižge ga in gleda, tedaj pa se udari po glavi in potarna: \"Joj, se pa res ne znajdem! Če bi se udaril še po drugem očesu, bi lahko zdaj imel barvni televizor!\"",
            "Policist je prišel na zdravniški pregled in doktor mu je po pregledu rekel:  \"Za kratek čas bom odšel iz ordinacije, vi pa tisti kozarček na polici napolnite z urinom.\" in odšel iz ordinacije. Ko se je čez nekaj minut vrnil je videl, da je steklenička prazna, ordinacija pa mokra.  \"Kaj pa je zdaj to?\" je jezno vprašal.  \"Ne nese mi tako visoko!\" je z žalostnim glasom povedal policist.",
            "Policista ugotavljata da tako peklenske vročine še ni bilo.   \"Kaj ne bi bilo krasno, ko bi zapadlo pol metra snega?\" reče prvi.  \"Ja, kdo bi ga pa kidal v taki vročini?\" se vpraša drugi.",
            "Janez, stalni dežurni na policijski postaji, ki je praviloma delal ponoči, je zamudil prihod na delo. Pri tem ga je zalotil pomočnik komandirja.  \"Oprostite, ker sem zamudil. Zaspal sem,\" se opraviči Janez.  \"Kaj? Tudi doma spite?\" je začuden njegov nadrejeni.",
            "Policist je pri nočnem patruljiranju srečal lepo dekle. Povabil jo je na sprehod skozi park, kmalu pa se je opogumil, jo objel okoli ramen in jo začel poljubljati.  \"Ne, ne smeš!\" mu je reklo dekle. \"Menstruacijo imam!\"  \"To me pa res nič ne moti. Jaz imam pa kadetsko šolo!\"",
            "Policist Janez pride v bolnišnico. Medicinska sestra mu pokaže posteljo in ga vpraša:  \"Imate pižamo?\"  \"Ne, doktor je rekel, da imam tumor.\"",
            "Kanibal vstopi v mesnico s človeškim mesom in povpraša mesarja za ceno možganov. Mesar mu pokaže cenik, na katerem piše:  1 kg moških možganov..........cena 1.000 tolarjev  1 kg ženskih možganov...... .cena 2.000 tolarjev  1 kg policijskih možganov.......cena 10.000 tolarjev.  Kanibal je začuden nad visoko ceno policijskih možganov, mesar pa mu pojasni:  \"Veste, zelo veliko policistov je potrebno,da dobiš ven 1 kg možganov.\"",
            "Kako policist odpravi zastoje v križišču?  \"Odstrani se in odide na malico.\"",
            "Policisti se z avtobusom peljejo na sindikalni izlet. Pred tunelom voznik avtobusa ugotovi, da je tunel prenizek ali pa avtobus previsok. \"Znižajte streho za pet centimetrov!\" vpije komandir na policiste. \"Saj ni treba,\" reče voznik avtobusa. \"Spustil bom zrak iz gum pa bo šlo.\" \"Butec! Saj je na vrhu previsok, ne pa spodaj!\" zakriči komandir.",
            "Policist je bil prvič pri spovedi in župnik mu je naložil pokoro: tri Zdrave Marije.  Ko je policist prišel iz cerkve je zaklical: \"Marija! Zdravo, zdravo, zdravo!\"",
            "Reka Sava naplavi truplo utopljenega policista v uniformi, ki v rokah drži listek z napisom:  \"Pojdi v Savo po gume.\"",
            "\"Kako bi lahko imenovali otroka nune in policista?\"  \"Bog in batina!\"",
            "\"Zakaj policisti hodijo s policijskim psom po mestu?\"  \"Da ima vsaj eden izobrazbo.\"",
            "Policist Vojko je imel vsakodnevne glavobole. Končno je odšel k zdravniku, ta pa ga je poslal k nevrologu. Da bi ugotovili, kaj mu je, so ga poslali na slikanje glave. Po prihodu iz nevrološke klinike se je pohvalil prijateljem:  \"Slikali so mi glavo, pa niso nič našli.\"  \"Ali si pričakoval kaj drugega?\" so ga vprašali presenečeno.",
            "\"Kaj pomeni, če ima policist na ramenu eno črtico?\"  \"Da zna brati.\"  \"Kaj pa če ima dve črtici?\"  \"Da zna brati in pisati.\"  \"Kaj pa če ima na ramenih tri črtice?\"  \"Potem pa pozna nekoga, ki zna brati in pisati.\"",
            "Na konjih po mestu paradirajo tisti policisti, ki so pogrnili na vozniškem izpitu.",
            "Dva policaja sta merila lestev. Eden jo drži, drugi pa zleze nanjo in meri. Mimoidoči pripomni: “Sta pa res trapasta. Lestev bi položila na tla in izmerila koliko je dolga.” “Butec neumni”, se zadere policaj na lestvi, “Saj naju ne zanima koliko je dolga, ampak kako visoka je.”",
            "Policaj potiska na hodniku pred seboj bencinski sod.   \"Kam pa?\" ga vpraša znanec.   \"K zdravniku.\"   \"In kaj imaš v sodu?\"   \"Urin. Pri zdravniku sem bil že pred tremi meseci in takrat mi je naročil naj danes prinesem urin na pregled.\"",
            "Policist je kupil novo uro in zaprosil komandirja za inštrukcije, kako se ura uporablja.  \"To je pa zelo lahko!\" mu je razložil komandir. \"Ko je veliki kazalec na 12, mali pa na 3 je ura tri. Ko je velik kazalec na 12, mali pa na 4 je ura štiri...\"  Policist je šel na teren, na cesti pa ga mimoidoči občan vpraša, koliko je ura.  Policist je pogledal na uro in rekel:  \"Ne ve se še! Veliki kazalec še ni na 12.\"",
            "Zakaj ni več Mercator najboljši sosed ampak policija? Zato, ker imajo zmeraj akcije, če plačaš takoj imaš 50% popusta in še točke lahko zbiraš.",
            "\"Katerega smo danes?\" vpraša policist svojega kolega. \"Ne vem.\" \"Ali ne piše v časopisu?\" \"Ta je včerajšnji.\"",
            "Dva pijančka gresta domov iz gostilne in se izgubita. Srečata policaja in ga prvi vpraša: \"Ej ti, a nama poveš, kje smo.\" Policaj odgovori: \"Kako si dovolita, a vesta kdo sem jaz?\" Pa pravi drugi pijanček:\" Nič ne bo, midva ne veva kje sva, ma ta tip ne ve niti, kdo je!\"",
            "Policaji so se za konec tedna odpravili na taborjenje. Da bi jim čas hitreje minil so se dogovorili, da vsak s seboj prinese kakšno družabno igro. Ko so prispeli v kamp je vsak povedal, katero družabno igro je prinesel s sabo. Prvi je prinesel pikado, drugi šah, tretji monopoli in četrti Always vložke. \"Always vložke?!\" so se začudili ostali, nakar je četrti razložil: \"Always vložke sem vzel, ker so zares enkratni! Na televiziji sem namreč videl reklamo, da z Always vložki lahko delaš kar hočeš: plavaš,jahaš,tečeš,igraš tenis.....\"",
            "Policist vozniku, ki ga je zaustavil na cesti:  \"Dajte mi vozniško dovoljenje.\"  \"Kaj vi nimate svojega?\" se je začudil voznik.",
            "Sredi turistične sezone na policijski oddelek Bled prihiti policist h komandirju in mu poroča:  \"Komandir, kopalec je utonil!\"  Komandir pošlje dva policista k jezeru, da rešita utopljenca. Policista se vržeta v vodo in iščeta. Iščeta in iščeta, končno pa odkrijeta utopljenca, ga potegneta na breg in eden od policistov prične z umetnim dihanjem usta na usta. Drug policist to nekaj časa opazuje, potem pa reče:  \"To ni današnji utopljenec. Ta ima drsalke na nogah!\"",
            "Komandir je odhajal v zasluženi pokoj (in ne predčasno, kot je sedaj to v navadi). Na slovesnosti, na katero so bili povabljeni vsi policisti so mu sodelavci poklonili zelo dragoceno knjigo. Ko jo je prejel je dejal:  \"Najlepše se vam zahvaljujem, toda knjige mi res ni bilo treba kupiti. Veste, eno imam že doma.\"",
            "Na robu plocnika sedi policaj in hlipa.Zakaj pa jocete, gospod, kaj se vam je zgodilo?, ga vprasa mimoidoci.Dresiranega psa sem izgubil!No, ja, ze je bil dresiran, bo gotovo nasel domov.On ze, kaj pa jaz?",
            "Policist sedi na klopi v parku in mimo pride njegov znanec ter ga vpraša:  \"Kaj pa delaš? Sediš in razmišljaš?\"  \"Ne, samo sedim!\"",
            "\"Kako policisti lovijo miši?\"  \"Lovijo jih, dokler se miši ne skrijejo pod omaro, nato pa požagajo noge od omare!\"",
            "Kako veš, da je v podmornici med posadko tudi policist?  \"V roki drži dežnik.\"",
            "Dva policista (kako klasično, kajne?) patruljirata po cesti, ko eden zagleda na tleh ležeče ogledalo. Pogleda se vanj in reče:  \"O, poglej, moja slika!\"  V ogledalo pogleda še drugi in reče:  \"Ojoj, kako si grd!\"",
            "Policija svetuje: \"Zmanjšajmo število prometnih nesreč na naših cestah! Vozimo po pločnikih!\"",
            "\"Včeraj mi je puščala streha na hiši, zato me ni bilo v službo!\" je rekel policist komandirju, ko je prišel v službo.  \"Ste jo popravili?\"  \"Ne, ker je preveč deževalo.\"  \"Potem bi pa lahko še danes ostali doma, ko je tako lepo vreme!\"  \"Zakaj le, saj danes ne pušča!\"",
            "Policist je patruljiral po ljubljanskem parku Tivoli, ko je v grmovju zaslišal šume.  \"Kdo je tam?\" je vprašal.  \"Wolfgang Amadeus Mozart!\" se je glasil odgovor iz grmovja.  \"Pridite vsi trije ven!\"",
            "Policist Peter je prijokal v službo in komandir ga je vprašal, kaj se mu je zgodilo.  \"Mama mi je umrla!\" je zastokal Peter.  \"Zakaj si pa sploh prišel v službo? No, vstopi v mojo pisarno. Prinesli ti bomo kavico, da se boš malo umiril!\"   Ko so mu prinesli kavo, je Peter ravnokar odložil telefonsko slušalko in še bolj glasno zajokal.  \"Kaj pa je zdaj?\" ga začudeno vpraša komandir.  \"Pravkar mi je telefoniral brat, da je tudi njemu umrla mama,\" je izjecljal Peter.",
            "Policist je izstopil iz pekarne in srečal svojega kolega ter mu rekel:  \"Če uganeš, koliko kifeljcev sem kupil ti dam oba!\"",
            "Pred gostilno Ganci je en nabasan scal kar po plocniku.Pride mimo policaj in pravi:  \"Gospod, a boste hitro skril to rec?\"  Tip pa se le zarezi: \"A-gh, gh, gh!\"  Policaj se enkrat: \"Takoj skrijte, drugace vas aretiram!\"  Tip se zresni za moment, skrije rec, pa se spet zarezi: \"A-gh, gh, gh!\"  Policaj ga vprasa: \"Kaj se pa tako neumno smejite?\"  Tip odgovori: \"A-gh, gh, gh! Zato ker mislis, da sem NEHAL scat!\"",
            "Policist je prišel do gledališke blagajne in rekel:  \"Dve vstopnici, prosim.\"  \"Za Romea in Julijo?\"  \"Ne, zame in za mojo ženo.\"",
            "Zakaj pusti policaj vodo dolgo odprto, preden gre pod tuš ?  Zato, ker čaka, da se na bojlerju prižge zelena luč.",
            "\"Zakaj se policisti ne praskajo z vžigalicami po ušesih?\"  \"Zaradi previdnosti, da se jim ne vžge slama!\"",
            "Policist je kupil novo stanovanje, ki je bilo brez ogrevanja. Kolega, ki je prišel k njemu na obisk in si ogledal stanovanje, se je čudil:  \"Kako pa to, da si kupil stanovanje brez ogrevanja? Saj boš pozimi zmrznil!\"  \"Kje pa! Poleti je toplo, pozimi se bom pa stisnil v kot. Tam je tako ali tako vedno 90 stopinj.\"",
            "Možakar sedi za mizo v restavraciji in reče:  \"Če bi imel to kar jem, ne bi bil to, kar sem.\"  Kdo je ta človek?  \"Policist, ki je naročil porcijo možganov.\"",
            "Končno je napočil čas, ko je Miha lahko začel samostojno delati kot policist. Dobil je bloke za mandatno kaznovanje in vsak dan kaznoval ljudi za vsak najmanjši prekršek. Konec meseca mu je komandir rekel, naj gre k tajnici po plačilno kuverto, ker je še ni prevzel.  \"Kaj? Še plačo dobim?\" se je začudil.",
            "\"Kaj pravi policist, ko na pločniku zagleda bananin olupek?\"  \"Fak, spet bom padel.\"",
            "Policaj vpraša policaja: \"Koliko je ura?\"   Vprašani pogleda in odgovori: \"Deset in deset.\"   \"Zakaj me zafrkavaš? Reci dvajset!\"",
            "\"Komandir, kaj naj storim? Pred policijsko postajo na zelenici sem našel tegale krta!\"  \"Takoj mi ga odnesi izpred oči in ga ubij, da ga ne vidim več!\"  \"Kako pa naj ga ubijem?\"  \"Kakor hočeš!\"  No, čez pol ure se policist pohvali:  \"Gospod komandir, krta sem že ubil!\"  \"In kako si to storil?\"  \"Živega sem zakopal.\"",
            "Omejitev hitrosti je 40, ženska vozi 6 km/h prehitro in ujame jo radar. Policaj pride počasi do avtomobila in pravi:\n" +
                    "\"Kam pa vi tako hitite?\"\n" +
                    "\"Zamujam v službo.\"\n" +
                    "\"Dajte no, kaj pa delate tako pomembnega?\"\n" +
                    "\"Riti raztegujem.\"\n" +
                    "\"Kaj? Kako pa raztegujete riti?\"\n" +
                    "\"Najprej porinem noter en prst, potem dva, pa tri, in potem celo roko. Nato obe roki in po malem raztegujem, dokler ni rit velika kaka dva metra.\"\n" +
                    "\"Kaj za božjo voljo pa potem naredite z dvometersko ritjo?\"\n" +
                    "\"Damo ji radar in jo postavimo tja, kjer je omejitev 40 km/h.\"",
            "Psihiater vpraša policaja: »Imate vi mogoče kakšno fobijo?«\n" +
                    "Policaj: »Ne, imamo same Oktavije.«",
            "Policist ustavi voznika, ki je očitno prehitro vozil.\n" +
                    "Reče mu:Čakal sem vas ves dan.\n" +
                    "Voznik odvrne:Vem, gospod policist, prišel sem, kakor hitro sem mogel.",
            "Fantič pristopi do policista, ki je v križišču usmerjal promet. Vpraša ga, če ima popoldne kaj časa. Policist: \"Imam, zakaj pa?\" \n" +
                    "Fantič: \"Da bi prišel ob 16.00 k nam domov, da mi bi mi nategnil nemško ovčarko, ker hočem imeti čistokrvne policijske pse.\" \n" +
                    "Ko policaj to sliši, se razjezi in skoči proti fantu, fantič pa v dir, policist pa za njim. Ko tako pretečeta nekaj ulic, naletita na druga policaja, ki prvemu reče: \"Hej, kam se ti tako mudi?\" Prvi policaj pa ogorčeno odvrne: \"Presnet mulc vragov, rekel mi je, naj pridem ob 16.00 k njim, da mu nategnem nemško ovčarko, ker hoče imeti čistokrvne policijske pse!\" \n" +
                    "Drugi policaj pa: \"Ja pa kaj potem tako drviš, saj je ura šele 12.00!!!\"",
            "Blontna policistka je sredi dela dobila menstruacijo. Bolel jo je\n" +
                    "trebuh, vendar ni smela zapustiti patruljnega mesta. Zato je poklicala\n" +
                    "postajo, povedala kaj je in zahtevala zamenjavo.\n" +
                    "Kolega pride šele po treh urah, za povrh pa še mrtvo pijan. \n" +
                    "\"Človek božji, kaj pa ti je? Zakaj si pijan?\"\n" +
                    "Policaj: \"Veš kako je, ko si povedala, da si dobila menstruacijo, je\n" +
                    "komandir plačal rundo za vse, potem pa še pomočnik, pa vodja izmene, in\n" +
                    "nazadnje še trije policisti.\"",
            "Se pelje Micika po cesti pa ji pred avto skoči rumeni palček. \n" +
                    "Micika: \"Ja kaj je palček, spizdi mi z poti!\" \n" +
                    "Palček: \"če sem pa tak žejen.\" \n" +
                    "Micika: \"Ajd tu mas Fanto.\" \n" +
                    "Se pelje dalje, pa ji pred avto skoči rdeči palček. \n" +
                    "Micika: \"Daj spokaj mi shorty!\" \n" +
                    "Palček: \"če sem pa tak lačen.\" \n" +
                    "Micika: \"Tu maš sendvič, samo hitro spokaj s poti!\" \n" +
                    "Pa se pelje dalje, nakar ji pred avto spet skoči rdeči palček. \n" +
                    "Micika: \"Kaj je zdaj, idi nekam!\" \n" +
                    "Palček: \"če me pa tak glava boli.\" \n" +
                    "Micika: \"Tu maš Aspirin, ajd.\" \n" +
                    "Pa se pelje dalje, zdaj pa ji pred avto skoči modri palček. \n" +
                    "Micika: \"Kaj je pa s tabo, si žejen, lačen ali te glava boli?\" \n" +
                    "Palček: \"Ne, ne, nič takega, prometno pa vozniško prosim.\" ",
            "KO TE USTAVI POLICAJ \n" +
                    "Poskusite vsaj pet od naštetih dejanj, ko vas policija spet ustavi: \n" +
                    "\n" +
                    "1. Če policaj govori s tabo, se pretvarjaj, da si gluh. \n" +
                    "2. Vprašaj ga, če lahko malo vidiš njegovo pištolo. \n" +
                    "3. Če noče oziroma te vpraša zakaj, reči, da bi rad videl če je tvoja večja. \n" +
                    "4. Daj mu roko in se ga veliko dotikaj. \n" +
                    "5. Vprašaj ga, kje je dobil to noro preobleko. \n" +
                    "6. Vprašaj ga, če ti posodi svoj kostim. \n" +
                    "7. Vprašaj ga za ime in priimek in ga nato ogovarjaj samo z imenom. \n" +
                    "8. Pretvarjaj se, da si p*der in ga vprašaj, če bi šel na zmenek s tabo. \n" +
                    "9. Če bo rekel ne, začni jokati. \n" +
                    "10. Če bo rekel ja, ga prijavi nadrejenim. \n" +
                    "11. Če te hoče pregledati in ti bo rekel, da moras razširiti noge, mu povej, da ga ne zanimaš. \n" +
                    "12. Povej mu, da so ti vseč moški v uniformi. ",
            "Policaj je odšel na safari v Afriko. Ko se je vrnil so ga sodelavci spraševali kakšne živali je lovil. Odgovoril je, da slone, leve, tigre in plisnote.\n" +
                    "\n" +
                    "Ko so ga vprašali kaj je to plisnot jim pove, da so čudne črne živali, ki skačejo po zadnjih nogah s sprednjimi krilijo in kričijo: \"plisnot!\"",
            "13 policajev piše test in vprašanje je, kateri avto je najhitrejši.\n" +
                    "\n" +
                    "Prvi napiše JAGUAR.Drugi pogleda pa ne vidi dobro in napiše JANUAR. Tretji pa pogleda in napiše, da ne bo imel isto FEBRUAR. In tako do 12 policaja,ki napiše DECEMBER. Trinajsti pa ni imel druge možnosti in je napisal SREČNO NOVO LETO.",
            "Koliko je ura? \n" +
                    "Policaj vpraša kolega..\n" +
                    "-Koliko je ura? \n" +
                    "-Deset in deset.\n" +
                    "-Ne me zajebavat? Reci dvajset!",
            "Policaj pošlje svojo familijo na morje, na dopust. Po enem tednu se jim še sam pridruži. \n" +
                    "Zvečer navali na ženo, ker je pač bil potreben seksa, kot sahara dežja. \n" +
                    "V sobi gužva, otroci so poleg, zato se z ženo preselita v park. \n" +
                    "Najdeta samotno klopco in ........ pri tem pa ju zaloti policaj, ki je bil na obhodu.\n" +
                    "\n" +
                    "»Sram vaju bodi! Tole počneta na javnem kraju!!!«\n" +
                    "\n" +
                    "»Oprostite«, pravi dopustnik. »Cel teden se nisva videla, nisva mogla več zdržat ..... \n" +
                    "Veste, tudi jaz sem policaj, pa bi mi bilo neprijetno, če bi moral plačati kazen.«\n" +
                    "\n" +
                    "»V redu, kolega. Naj ti bo. Ampak, kurbetini pa bom vseeno dal položnico.\n" +
                    "Tretjič sem jo že ujagal tule, v tem tednu!« ",
            "Na avtobusni postaji stojijo mamica s sinkom in policaj. Mali ves čas tečnari, kdaj bo prišel avtobus.\n" +
                    "\n" +
                    "Mama ga potolaži : \"Šofer je imel gumi defekt, samo menja gumo in pride.\". Čez minuto mali spet tečnari, mama pravi: \"Avtobus je bil umazan, šofer ga še opere in pride.\". Mali spet tečnari, mama pravi : \"Sedaj ga šofer samo še prebarva, da bo lepši, in pride...\".\n" +
                    "\n" +
                    "Policaj, ki vse to posluša, pa jezno zabriše kapo v tla in pravi: \"..., a zdaj se ga je pa spravil še barvat ....!!\".",
            "Došao policajac na posao,a jedna mu cipela crna jedna bela.\n" +
                    "Šef na njega počne galamiti:\" Kvariš ugled policije, i onako uvek kazu da smo glupi, idi kući i zameni cipele\".\n" +
                    "Ode policajac kući i vraća se nakon nekog vremena i podnosi raport šefu:\n" +
                    "Šefe imam problem, i kod kuće su mi nepar, jedna crna jedna bela !!! ",
            "Zakaj ima policaj na nočni omarici dva kamna?\n" +
                    "Odg:Zato da z enim vgasne luč z drugim pa preveri če je okno zaprto! ",
            "Koliko je vicev o policajih?\n" +
                    "Nobeden, ker so vsi resnični. ",
            "Kaj se zgodi, če namesto 113 pokličeš 311? \nPolicaji se pripeljejo v rikverc :D ",
            "Policaj pride v cigansko naselje, da vidi koliko so nakradli v prostem času.\n" +
                    "Za eno barako opazi skladovnico železniških pragov.\n" +
                    "Pokliče glavarja tabora in ga vpraša:\n" +
                    "\"Ja, kje ste pa to pobrali, kaj če bi kakšen vlak iztiril, to je pa že preveč!\"\n" +
                    "Combe: \"Neznam ja ništa o tome. Morala su to deca da donesu.\"\n" +
                    "Policaj: \"DECA DA DONESU?!? A se blesav! Vsak tak prag ima vsaj sto kil!\"\n" +
                    "Combe: \"Pa šta ti deca zna šta je sto kila.\"",
            "Ženska je rodila otroka, ki je bil zelo inteligenten, odkar je prijokal na ta svet. Ko ga je mama iz porodnišnice prinesla domov in ga odnesla v otroško sobo, kjer je že imel pripravljene igrače: lutke in gumijaste živali, se je takoj oglasil:\n" +
                    "\"Hočem računalnik in logaritme, ne pa to navlako!\"\n" +
                    "Mama ga je odnesla v bolnico, povedala za težave - da je pač prepameten za svoja leta, no ja, ne leta ampak dni, in v bolnici so se odločili, da ga operirajo in mu vzamejo pol možganov. Ko ga je mama po operaciji prinesla domov je otrok zagledal gumijaste igrače in lutke in spet rekel:\n" +
                    "\"Hočem računalnik in logaritme!\"\n" +
                    "Mama ga je vrnila v bolnico, kjer so se odločili, da mu iz glave poberejo vse možgane. Po operaciji ga je mama prinesla domov in si potihem zamomljala:\n" +
                    "\"Upam, da ne bo spet hotel imeti računalnika in logaritme!\"\n" +
                    "Sin je v otroški sobi takoj zagledal gumijaste igračke in lutkice in se oglasil:\n" +
                    "\"Vozniško in prometno dovoljenje mi pokažite!\"",
            "Policist je pristopil k prodajalcu pečk in ga vprašal:\n" +
                    "\"Kaj prodajaš?\"\n" +
                    "\"Pečke od jabolk.\"\n" +
                    "\"Po koliko pa so?\"\n" +
                    "\"Dva tisoč tolarjev za eno pečko.\"\n" +
                    "\"Zakaj so pa tako drage?\"\n" +
                    "\"Ker ti po njih začnejo delovati možgani.\"\n" +
                    "\"No, bom pa kupil eno!\" se je odločil policist.\n" +
                    "Policist je pojedel pečko, odšel, nato pa se je kmalu vrnil.\n" +
                    "\"Prevaral si me!\" je rekel prodajalcu. \"Za dva tisočaka bi si lahko kupil deset kilogramov jabolk in tako dobil več sto pečk!\"\n" +
                    "\"No, vidiš, da deluje! Možgani so ti začeli delovati!\" je rekel prodajalec.\n" +
                    "\"Če je pa tako, mi daj še eno!\" je rekel policist.",
            "Policaj se sprehaja po ulica in sreča roma, pa mu rom reče: \"Pozdravlja te Justa.\"\n" +
                    "Policaj vpraša: \"Ketera Justa?\"\n" +
                    "\"Ki kurce hrusta.\"\n" +
                    "In enako na naslednji dan.\n" +
                    "In še enkrat. \n" +
                    "Naslednji dan pred pohodom policaj povpraša komandirja: \"Gospod\n" +
                    "komandir, vedno ko grem po ulici srečam roma ki mi reče: \"Pozdravlja te\n" +
                    "Justa.\" Pa ga jaz vprašam, katera Justa? On pa veselo z smehom\n" +
                    "odgovori: \"Tisti ki kurce hrusta.\"\n" +
                    "Pa mu komandir reče: \"Potem pa mu vi recite, da ga pozdravlja Febo. In ko on odgovori, mu rečte tisti Febo, ki te je zajebo.\"\n" +
                    "Pa se srečata. Pa ga policaj ogovori: \"Pozdravlja te Febo.\" Rom pa\n" +
                    "reče: \"Vem.\" Policaj pa vpraša: \"Kako?\" Rom odgovori: \"Rekla mi je\n" +
                    "Justa.\" Policaj vpraša: \"Katera?\" Rom odgovori: \"Tista ki kurce hrusta.",
            "\n" +
                    "Policist je z alkotestom preizkusil moškega in ugotovil, da je popil preko dovoljene mere, zato mu je dejal:\n" +
                    "\"Avto boste morali pustiti tukaj.\"\n" +
                    "\"Kako pa naj grem domov?\"\n" +
                    "\"Z avtobusom.\"\n" +
                    "\"Saj nimam izpita za avtobus!\" je protestiral pijani šofer.",
            "Policist Vojko je imel vsakodnevne glavobole. Končno je odšel k zdravniku, ta pa ga je poslal k nevrologu. Da bi ugotovili, kaj mu je, so ga poslali na slikanje glave. Po prihodu iz nevrološke klinike se je pohvalil prijateljem:\n" +
                    "\"Slikali so mi glavo, pa niso nič našli.\"\n" +
                    "\"Ali si pričakoval kaj drugega?\" so ga vprašali presenečeno.",
            "Policista sta na kraju prometne nesreče, v kateri je življenje izgubil pešec, izdelovala zapisnik. Policist, ki ni znal pisati in je imel težave pri izgovarjanju črke \"p\" je narekoval svojemu kolegu. Izdelava zapisnika je zato izgledala takole:\n" +
                    "\"Moški je mrtev!\" reče prvi policist, drugi pa to zapiše.\n" +
                    "\"Noge ima na cesti!\" Drugi policist zapiše.\n" +
                    "\"Trup ima na cesti!\" reče prvi, drugi zapiše.\n" +
                    "\"Roke so tudi na cesti!\". Drugi zapiše.\n" +
                    "\"Glava na pppp....glava na pppp\" in nato nesrečnika brcne v glavo.\n" +
                    "\"Glava na cesti!\"",
            "Policista sta na kraju prometne nesreče, v kateri je življenje izgubil pešec, izdelovala zapisnik. Policist, ki ni znal pisati in je imel težave pri izgovarjanju črke \"p\" je narekoval svojemu kolegu. Izdelava zapisnika je zato izgledala takole:\n" +
                    "\"Moški je mrtev!\" reče prvi policist, drugi pa to zapiše.\n" +
                    "\"Noge ima na cesti!\" Drugi policist zapiše.\n" +
                    "\"Trup ima na cesti!\" reče prvi, drugi zapiše.\n" +
                    "\"Roke so tudi na cesti!\". Drugi zapiše.\n" +
                    "\"Glava na pppp....glava na pppp\" in nato nesrečnika brcne v glavo.\n" +
                    "\"Glava na cesti!\"\n",
            "Policista sedita v kinu. Glavni igralec z veliko hitrostjo z avtom drvi po cesti.\n" +
                    "\"Zaletel se bo!\" je rekel prvi policist.\n" +
                    "\"Stavim, da se ne bo!\" se je oglasil drugi.\n" +
                    "\"V redu! Staviva za pet tisočakov!\"\n" +
                    "Glavni igralec se je zaletel, prvi policist pa je rekel:\n" +
                    "\"Ne bo ti treba plačati stave, saj sem ta film že videl. Samo za pijačo boš dal.\"\n" +
                    "\"Saj sem ga jaz tudi že videl!\"\n" +
                    "\"Zakaj pa si potem sploh stavil z menoj?\"\n" +
                    "\"Nisem si mislil , da je tako nor, da se bo dvakrat zaletel na istem mestu!\"",
            "Policaj potiska na hodniku pred seboj bencinski sod. \n" +
                    "\"Kam pa?\" ga vpraša znanec. \n" +
                    "\"K zdravniku.\" \n" +
                    "\"In kaj imaš v sodu?\" \n" +
                    "\"Urin. Pri zdravniku sem bil že pred tremi meseci in takrat mi je naročil naj danes prinesem urin na pregled.\"",
            "Janez sreča Simona, ki je bil ves v modricah.\n" +
                    "\"Kaj se ti je pa zgodilo?\" ga je vprašal.\n" +
                    "\"Policisti so me pretepli!\"\n" +
                    "\"To pa ne more biti res. Policisti danes ne pretepajo več ljudi!\"\n" +
                    "\"Danes mogoče res ne, toda, mene so pretepli včeraj!\"",
            "\"Policist pride v bolnišnico. Sestra ga odpelje v sobo, mu pripravi posteljo in ga vpraša:\n" +
                    "\"Imate pižamo?\"\n" +
                    "\"Mislim da ne. Doktor mi je rekel, da imam slepič.\"",
            "V gostinskem lokalu je izbruhnil množični pretep. Ljudje so na pločnik leteli skozi okna, znotraj lokala se je slišalo lomljenje miz in stolov in krike bolečin. Policista, prestrašena pred možnimi posledicami posredovanja se zagledata v ogledalu pred vhodom in eden reče:\n" +
                    "\"Kar obrniva se. Dva ste že tukaj!\"",
            "Policist je z ženo in sinom preživel dopust v Egiptu. Med drugim so obiskali tudi muzej, kjer so si ogledali mumije. Pod eno izmed mumij je bil napis: RAXV-1900.\n" +
                    "\"Očka, kaj je to?\"\n" +
                    "\"Saj vidiš! Mrlič!\"\n" +
                    "\"Kaj pa pomeni ta napis spodaj?\"\n" +
                    "\"To je registrska številka avta, ki ga je povozil.\"",
            "Druščina v gostilni začne pogovor o policistih.\n" +
                    "\"Ali je res, da se policisti zabavajo, ko poslušajo šale na svoj račun?\" vpraša eden. Dobil je tri različne odgovore svojih prijateljev:\n" +
                    "\"Da, če jih razumejo\" je rekel prvi.\n" +
                    "\"Da, saj vsak policist misli, da se šale nanašajo na druge\" je menil drugi, tretji pa je dejal:\n" +
                    "\"Jaz pa sem poskusil sam, a sem se prepričal o nasprotnem.\"",
            "Policist pelje kolega, ki je končal službo, domov. Pred njegovo hišo ga slednji povabi na kavico. \"Le vstopi, ti bom razkazal hišo!\" ga je povabil naprej.\n" +
                    "\"Takole, vidiš, tukaj je dnevna soba, tukaj kuhinja, pa balkon in kopalnica, tukaj je pa spalnica, v postelji je moja žena, poleg..... poleg sem pa jaz.\"",
            "\"Že pred mesecem dni sem ženi za rojstni dan kupil hladilnik, žena pa še vedno pere perilo na roke!\" je policist Jure povedal svojemu prijatelju.",
            "Janez, stalni dežurni na policijski postaji, ki je praviloma delal ponoči, je zamudil prihod na delo. Pri tem ga je zalotil pomočnik komandirja.\n" +
                    "\"Oprostite, ker sem zamudil. Zaspal sem,\" se opraviči Janez.\n" +
                    "\"Kaj? Tudi doma spite?\" je začuden njegov nadrejeni.",
            "Policist je pri nočnem patruljiranju srečal lepo dekle. Povabil jo je na sprehod skozi park, kmalu pa se je opogumil, jo objel okoli ramen in jo poljubljati.\n" +
                    "\"Ne, ne smeš!\" mu je reklo dekle. \"Menstruacijo imam!\"\n" +
                    "\"To me pa res nič ne moti. Jaz imam pa kadetsko šolo!\"",
            "\"Zakaj se štirje policisti kregajo, preden vstopijo v službeni avto?\"\n" +
                    "\"Ker bi vsak od njih rad sedel pri oknu.\"",
            "Komandir se jezi na policista:\n" +
                    "\"Kako, da nisi nikomur vzel prostost? Plačamo ti obleko, gorivo za avto, dobro plačo dobivaš, ti pa še nikogar nisi aretiral!\"\n" +
                    "Policist se brani: \"Ampak šef, tam so sami reveži. Oni sploh nimajo denarja za mamila. Prava beda. Tam se zberejo in jih potem šest deli eno samo cigareto!\"",
            "Na policijski postaji:\n" +
                    "\"Kako je to mogoče, gospa? Prišli ste iz mesta domov, videli, da je stanovanje razmetano, pa niste ugotovili, da je nekdo vlomil v stanovanje!?\"\n" +
                    "\"Mislila sem, da je mož spet iskal nogavice.\"",
            "Zakaj vozi policaj v prtljažniku jogi ?\n" +
                    "Zato, da se avto na ovinku bolj uleže.",
            "Kako policist odpravi zastoje v križišču?\n" +
                    "\"Odstrani se in odide na malico.\"",
            "\"Kako policist opravlja veliko potrebo?\"\n" +
                    "\"Reče: pridi ven, saj ti ne bom ničesar naredil!\"",
            "\"Kaj je to, le policijski kombi s šestimi policisti pade v prepad?\"\n" +
                    "\"Razsipavanje. Saj gre vendar osem policistov v kombi!\"",
            "Kmalu po porodu se je otrok zbudil in rekel:\n" +
                    "\"E=MC2.\"\n" +
                    "Doktor se je prestrašil in rekel staršema:\n" +
                    "\"Žal ima vaš otrok prevelike možgane za svojo velikost, zato ga bo potrebno operirati in mu odstraniti 50 procentov možganov, drugače bo čez nekaj časa v življenjski nevarnosti!\"\n" +
                    "\"Prav!\" sta se strinjala starša in otroka so operirali. Ko se je otrok po operaciji prebudil, je dejal:\n" +
                    "\"E=MC2.\"\n" +
                    "\"Žal so možgani še vedno preveliki in ga bomo morali operirati ponovno ter mu odstraniti še drugo polovico!\" je povedal doktor. Otroka so operirali, ko pa se je ta po operaciji prebudil, je rekel:\n" +
                    "\"Vozniško in prometno, prosim!\"",
            "Trije mladeniči so se sprehajali po temni ulici v mestu, ko je mimo njih prišla starejša ženska, jih ustavila in jih prosila za tisočaka, da bi si lahko kupila steklenico alkohola. Ker fantje niso imeli denarja, jih je brutalno napadla. Mladeniči so se branili in starka je dobila hude telesne poškodbe. Po oskrbi ran, povzročenih v pretepu, sem starko odpeljal v prostor za pridržanje. Da je bilo res tako, kot izjavljam, potrjujejo izjave mladeničev, ki so v prilogi poročila.",
            "Policista, ki bi se morala s patruljiranja vrniti ob dveh popoldan ste se vrnila šele ob osmih zvečer.\n" +
                    "\"Kje pa sta hodila tako dolgo?\" ju okara pomočnik komandirja, ki je že sprožil preplah pri vodstvu Policijske uprave.\n" +
                    "\"Ključe sem pozabil v avtu\" je rekel voznik patrulje, nato pa sem se mučil da sem z žico skozi priprto okno odprl vrata. Za to sem potreboval celo popoldne.\"\n" +
                    "\"In kaj si ti delal?\" šef vpraša vodjo patrulje.\n" +
                    "\"Mene je kolega zaklenil v avto. Pomagal sem mu z nasveti kam naj premakne žico.\"",
            "\n" +
                    "\"Dve karti, prosim,\" reče policist, ki se je prvič z ženo udeležil kulturnega dogodka v mestu.\n" +
                    "\"Za Kralja Leara?\"\n" +
                    "\"Ne, zame in za mojo ženo.\"",
            "\n" +
                    "Silva je prihitela k dežurnemu policijske postaje in prijavila, da ji je torbičar na kolesu ukradel torbico v kateri je imela deset bankovcev po pet tisočakov. Policist ji izroči list papirja in reče:\n" +
                    "\"Izpolnite! Najprej vaše podatke, nato pa opišite bankovce!\"",
            "\"Kupil sem Kenwood nalepko za moj avto!\" se je pohvalil policist kolegu.\n" +
                    "\"In kaj piše na njej?\"",
            "\"Zakaj so pri nesrečah vedno policisti poleg?\"\n" +
                    "\"Ker nesreča nikoli ne pride sama.\"",
            "\n" +
                    "Policist pri kmetu na vasi kupi semena, sadike in deset piščancev. Po tednu dni se vrne in kupi še deset piščancev. Po tednu dni ponovno - deset piščancev. Ko se je že tretjič vrnil po piščance, ga je kmet vprašal:\n" +
                    "\"Vam ugaja kmetovanje? Kako vam kaj uspeva?\"\n" +
                    "\"Vse mi odlično uspeva, sadike in semena že poganjajo, le s piščanci imam težave. Nočejo in nočejo pognati! Morda sem jih posadil preblizu ali pa jih preveč zalivam.\"",
            "Dekle se potoži policistu:\n" +
                    "\"Ta dva moška me že tri ure zalezujeta. Prosim, ali bi hoteli odstraniti tistega debelega?\"",
            "\n" +
                    "Mlajši in starejši policaj se sprehajata po mestu in mlajši vpraša starejšega:\n" +
                    "\"Ti, kaj je bela barva prava barva?\"\n" +
                    "\"Seveda, tako kot ostale barve,\" odvrne starejši.\n" +
                    "Nekaj časa molče nadaljujeta pot, potem pa spet mlajši prične:\n" +
                    "\"Kaj pa črna, je tudi to prava barva?\"\n" +
                    "\"Jasno, tako kot ostale barve,\" ponovi starejši.\n" +
                    "Mlajši se nasmeji in reče:\n" +
                    "\"Vidiš, da sem imel prav včeraj, ko sem komandirju rekel, da sem kupil barvni televizor!\"",
            "Policist voznika, ki ni uspel pihniti v alkotest odpelje na sodno medicino, kjer mu vzamejo kri. Po objavi rezultatov policist reče vozniku:\n" +
                    "\"Gospod, vi ste pa krvoliziran! V alkoholu imate 1,3 krvi!\"",
            "Policist je izstopil iz pekarne in srečal svojega kolega ter mu rekel:\n" +
                    "\"Če uganeš, koliko kifeljcev sem kupil ti dam oba!\"",
            "Policist je zaustavil voznika osebnega avta, ta pa ga je zabodeno pogledal in se oglasil:\n" +
                    "\"Hov, hov!\"\n" +
                    "Policist je deloval nekoliko zmedeno, voznik pa ga je pomiril:\n" +
                    "\"Ne bojte se, saj vidite, da sem privezan.\"",
            "\n" +
                    "Ste že slišali za tistega policista, ki je v rokovniku svojega dekleta zagledal napisano besedo in od nje hotel izvedeti, kdo je Avgust?",
            "Policist pijanemu vozniku: \"Glede na vaše stanje lahko samo rečem: \"Roke stran od volana!\"\n" +
                    "\"Ja, kako naj pa potem vozim?\" se je začudil voznik.\n",
            "Kako policaji nabirajo gobe?\n" +
                    "Ko najdejo prvo jo mučijo toliko časa, da pove kje so ostale.",
            "Policista med seboj:\n" +
                    "\"Katerega smo danes? Vpraša prvi.\n" +
                    "\"Še nobenega!\" odgovori drugi.\n",
            "Policista v patrulji. Patruljirata po nenaseljenem delu mesta, v nevarnem okolju. Nenadoma eden reče:\n" +
                    "\"Poglej! Na cesti je noga!\"\n" +
                    "In res. Na cesti je ležala noga. Nekaj metrov naprej sta zagledala še nekaj:\n" +
                    "\"Poglej, tamle je pa roka!\" je zavpil drugi.\n" +
                    "Pa se je nekaj sekund zatem oglasil zopet prvi policist:\n" +
                    "\"Poglej, tamle je pa glava! Ravno taka je kot od našega policista Franceljna. O Bog, da se mu ni kaj zgodilo!\"",
            "\n" +
                    "Goste v restavraciji zabava manjši orkester. Vodja orkestra pristopi k policistu v civilu, ki je z ženo sedel za mizo v prvi vrsti, in vpraša:\n" +
                    "\"Ste vi naročili Vivaldija?\"\n" +
                    "\"Ne, jaz sem naročil dunajski zrezek.\"",
            "\n" +
                    "Pred gostilno Slamic je en nabasan scal kar po plocniku.Pride mimo policaj in pravi:\n" +
                    "\"Gospod, a boste hitro skril to rec?\"\n" +
                    "Tip pa se le zarezi: \"A-gh, gh, gh!\"\n" +
                    "Policaj se enkrat: \"Takoj skrijte, drugace vas aretiram!\"\n" +
                    "Tip se zresni za moment, skrije rec, pa se spet zarezi: \"A-gh, gh, gh!\"\n" +
                    "Policaj ga vprasa: \"Kaj se pa tako neumno smejite?\"\n" +
                    "Tip odgovori: \"A-gh, gh, gh! Zato ker mislis, da sem NEHAL scat!\"",
            "Policaj se podi za cigansko družino. Oni zavijejo s ceste, pa čez polje, pa v hosto. Policaj prisopiha do polja in vpraša tam brkljajočega kmeta, če je videl kakšne cigane.\n" +
                    "Kmet odgovori: \"Ja, tjale so šli.\" in s prstom pokaže v gozd \"Drugič se pa skupaj držite!\"",
            "\"Ali policisti lahko plavajo?\"\n" +
                    "\"Težko vprašanje. Po eni strani lahko, saj so tako votli, po drugi strani pa težko, saj ne tesnijo.\"",
            "Policist je prišel do gledališke blagajne in rekel:\n" +
                    "\"Dve vstopnici, prosim.\"\n" +
                    "\"Za Tristana in Izoldo?\"\n" +
                    "\"Ne, zame in za mojo ženo.\"",
            "olicista sta vstopila v gostinski lokal, ki je imel na steni veliko ogledalo. Usedla sta se in pogledala v ogledalo.\n" +
                    "\"Poglej, tamle pa sedita najina kolega, policista. Naj ju povabiva na pijačo?\"\n" +
                    "Ko je vstal, ga je drugi policist zadržal:\n" +
                    "\"Počakaj, saj že onadva prihajata sem.\"",
            "Policist je vprašal prijatelja:\n" +
                    "\"Ali si bil že kdaj v Žetalah pri Ptuju?\"\n" +
                    "\"Še nikoli.\"\n" +
                    "\"Potem pa verjetno poznaš mojo sestro. Tudi ona še nikoli ni bila v Žetalah.\"",
            "Policist v postopku z občanom le-tega vpraša:\n" +
                    "\"Vidim, da imate zelo nežno kožo na obrazu. Le kako vam to uspe?\"\n" +
                    "\"Po vsakem britju se namažem s toaletno vodo!\"\n" +
                    "Naslednji dan je policist prišel z buško na glavi. Sodelavec ga je vprašal, kaj se je zgodilo.\n" +
                    "\"Ko sem včeraj zvečer hotel vzeti toaletno vodo mi je pokrov padel na glavo!\"",
            "Policist zaustavi prehitrega voznika.\n" +
                    "\"Vozili ste 180 km/h, čeprav je hitrost omejena na 70 km/h!\"\n" +
                    "\"Prosim, napišite mi potrdilo, ker v kratkem nameravam prodati avto!\"",
            "\"Joj, kako smešen pes!\"\n" +
                    "\"Nič ni smešen, to je policijski pes!\"\n" +
                    "\"Kaj? Policijski pes? Saj je nedoločljive pasme!\"\n" +
                    "\"Seveda, ko je pa od tajne policije.\"",
            "Prometni policist ustavi voznika, ki je prevozil rdečo luč.\n" +
                    "\"Gospod, za tale prekršek vas bom predlagal v postopek sodniku za prekrške!\"\n" +
                    "\"Lepo prosim, oprostite mi! Prvič sem v mestu in še nikoli prej nisem peljal skozi križišče, ki je urejeno s semaforjem.\"\n" +
                    "\"Kaj pa če bi s svojo nespametno vožnjo podrli kakšno žensko?\"\n" +
                    "\"To pa ne bi bilo prvič.\"",
            "\"Tako ste pijani, da komaj sedite, vi pa ste vozili kolo! Pihali boste!\" reče policist.\n" +
                    "\"Gospod policist, jaz bom raje kar bruhal!\"",
            "\n" +
                    "Mujo se je peljal po cesti s kolesom, ko je nenadoma zagledal, da mu je zabreknila zračnica. Ustavil se je ob cesti in se vsedel na robnik. Mimo se pripelje policist in vpraša, kaj se je zgodilo.\n" +
                    "\"Moje kolo je noseče in bo zdaj zdaj rodilo!\" pove Mujo. \n" +
                    "Policist ga nekaj časa opazuje nato pa ugotovi:\n" +
                    "\"Saj to je vendar moško kolo! Nič ne bo s porodom.\"",
            "Zakaj pusti policaj vodo dolgo odprto, preden gre pod tuš ?\n" +
                    "Zato, ker čaka, da se na bojlerju prižge zelena luč.",
            "\"Zakaj policisti, ki stanujejo v visokih stolpnicah, praviloma zamujajo s prihodom na delo?\"\n" +
                    "\"Ker so dvigala za več oseb in čakajo, da se napolnijo.\"",
            "Policist je kupil novo stanovanje, ki je bilo brez ogrevanja. Kolega, ki je prišel k njemu na obisk in si ogledal stanovanje, se je čudil:\n" +
                    "\"Kako pa to, da si kupil stanovanje brez ogrevanja? Saj boš pozimi zmrznil!\"\n" +
                    "\"Kje pa! Poleti je toplo, pozimi se bom pa stisnil v kot. Tam je tako ali tako vedno 90 stopinj.\"",
            "Črnec hoče v malem mestu Južne Afrike (še v dobi apatheida) vstopiti v cerkev. Ustavi ga policaj.\n" +
                    "\"Stoj! Ta cerkev je le za belce!\"\n" +
                    "\"Grem jo le čistiti!\"\n" +
                    "\"Dobro, a gorje, če te zalotim, da boš molil!\"",
            "\n" +
                    "Mlada prijatelja se sprehajata po cesti in ko zagledata policista, ki se jima približuje, eden glasno vpraša drugega:\n" +
                    "\"Ali veš kakšna je razlika med policistom in oslom?\"\n" +
                    "V tem trenutku pride do njiju policist in reče:\n" +
                    "\"No, da slišim, kakšna je razlika!\"\n" +
                    "Mladenič se prestraši in zajeclja:\n" +
                    "\"Saj ni nobene razlike!\"\n" +
                    "\"Toliko bolje zate!\" mu odgovori policist.",
            "Vlomljeno je bilo v stanovanjsko hišo in na klic lastnika hiše so policisti prišli na ogled dejanja. Eden od policistov je vprašal oškodovanca:\n" +
                    "\"Kaj vam je zmanjkalo?\"\n" +
                    "\"Pogrešam dve uri, ki sta bili stari preko 200 let!\" je rekel oškodovanec.\n" +
                    "\"Opišite jih malo! Sta bili na baterije?\"",
            "Policist sedi ob obali jezera in vanj meče opeke ter se čudi:\n" +
                    "\"Kako čudno! Nenavadno!\"\n" +
                    "\"Kaj pa je tako čudno?\" ga vpraša mimoidoči.\n" +
                    "\"V jezero mečem štirioglate opeke, v vodi se pa delajo krogi!\"",
            "Pijančka stojita na mostu in se prepirata.\n" +
                    "Prvi pravi: \"poglej, poglej, rrrdeča llluna!\"\n" +
                    "Drugi: \"Ti si čisto nor, kaj ne vidiš, da je rumena!\"\n" +
                    "Spet prvi: \"Nehaj, noooo, saj si že listo nalit! Rrrdeča jeee!\"\n" +
                    "Medtem jima pride naproti policist in pijančka se odločita, da ga bosta vprašala, kakšne barve je luna.\n" +
                    "Drugi vpraša: \"Čujte, gospooood pooolicaj. Kaaaake barvee je tooota luuuna?\"\n" +
                    "Policist se ozre v nebo in vpraša: \"Katera? Leva ali desna?\"",
            "\"Ali slučajno veš, katerega smo danes?\" vpraša komandir policista.\n" +
                    "\"Katerega bi pa morali biti?\"",
            "Policista patruljirata po cesti in eden najde ogledalo. Prvi se pogleda vanj in reče kolegu:\n" +
                    "\"Poglej, moja slika!\"\n" +
                    "Drugi pogleda in reče:\n" +
                    "\"Uh, kako si grd!\"",
            "\n" +
                    "Občan sreča dva policista in ju vpraša:\n" +
                    "\"Vidva, ki sta brihtne glave, povejta mi, kaj je to: Štiri noge ima in zelo neumno je.\"\n" +
                    "\"Osel!\"\n" +
                    "\"Ne, to sta vidva.\"\n" +
                    "Policista odideta jezna naprej, srečata prijatelja in se določita, da ga potegneta. In mu pravita:\n" +
                    "\"Povej, kaj je to. Štiri noge ima in neumno je.\"\n" +
                    "\"Osel.\"\n" +
                    "\"Ne, to sva midva.\"",
            "\"Kako vam je lahko baraba ušla iz zgradbe?\" se čudi komandir. \"Ali niste zasedli vseh izhodov?\"\n" +
                    "\"Smo!\" odvrne policist Ivo. \"Morda je ušel skozi vhod!\"",
            "Uslužbenca ministrstva za notranje zadeve se pogovarjata. Eden pravi:\n" +
                    "\"Moje delo je tako tajno, da niti sam ne vem kaj delam.\"",
            "Nočna patrulja patruljira ob železniški progi, ko Srečko, eden od obeh policistov v patrulji, zagleda človeško roko ob progi.\n" +
                    "\"Kaj ni to Milanova noga?\"\n" +
                    "\"Ne, Milan je imel dnevno izmeno.\"\n" +
                    "Nekoliko naprej Srečko zagleda roko.\n" +
                    "\"Kaj ni to Milanova roka?\" vpraša.\n" +
                    "\"Ne, saj sem ti povedal, da Milan ne dela ponoči.\n" +
                    "Nekoliko naprej Srečko zagleda nekaj, kar ga je pretreslo:\n" +
                    "\"Glej, Milanova glava!\"\n" +
                    "\"Ja, zdaj pa utemeljeno sumim, da se je Milanu nekaj hudega zgodilo\" reče drugi.",
            "Na železniški postaji pristopi klatež k policistu in ga vpraša:\n" +
                    "\"Ali veste, kakšna je razlika med vami in tistim vagonom na prvem peronu?\"\n" +
                    "\"Kakšna?\"\n" +
                    "\"Tisti vagon ima dva razreda, vi imate pa samo enega,\" se zasmeji klatež in hoče oditi.\n" +
                    "\"Počakajte malo!\" ukaže policist. \"Sedaj pa vi meni povejte, kakšna je razlika med vami in tistim vagonom!\"\n" +
                    "\"Kakšna?\"\n" +
                    "\"Tisti vagon bo ostal na prvem peronu, vi greste pa z menoj na policijsko postajo.\"",
            "Kako veš, da je v podmornici med posadko tudi policist?\n" +
                    "\"V roki drži dežnik.\"",
            "\"Včeraj mi je puščala streha na hiši, zato me ni bilo v službo!\" je rekel policist komandirju, ko je prišel v službo.\n" +
                    "\"Ste jo popravili?\"\n" +
                    "\"Ne, ker je preveč deževalo.\"\n" +
                    "\"Potem bi pa lahko še danes ostali doma, ko je tako lepo vreme!\"\n" +
                    "\"Zakaj le, saj danes ne pušča!\"",
            "Potniško letalo se je zrušilo na pokopališče. Policisti so našteli 2587 trupel.",
            "\"Zakaj policaj pred spanjem teče tri kroge okoli postelje?\"\n" +
                    "\"Da bi imel tri kroge prednosti, če bi ga ponoči kdo napadel.\"",
            "\"Zakaj policist seksa z dekletom na terasi?\"\n" +
                    "\"Ker mu je rekla da mu mora priti zunaj.\"",
            "\"Zakaj včasih hodijo trije policisti skupaj?\"\n" +
                    "\"Ker zna eden brati in pisati, druga dva pa ga varujeta.\"",
            "\"Zakaj vedno hodita dva policista skupaj?\"\n" +
                    "\"Da imata skupaj končano osnovno šolo.\"",
            "Policist je v mestu zalotil fantiča, ki je vlamljal v trafiko. Zagrabil ga je in mu rekel:\n" +
                    "\"Zdaj boš šel pa z menoj na policijsko postajo!\"\n" +
                    "\"Ne, policist, prosim, spustite me!\" je moledoval fantič, toda policist se ni dal.\n" +
                    "Ko sta šla mimo restavracije s hitro prehrano, je fantič potožil, da je strašno lačen in prosil policista, da ga spusti v restavracijo, da si kupi hamburger.\n" +
                    "Policist mu je dovolil, hkrati pa zagrozil:\n" +
                    "\"Pohiti!\"\n" +
                    "Fantič je vstopil v restavracijo in izginil skozi stranski izhod.\n" +
                    "Čez nekaj dni je policist v mestu spet srečal fantiča, ga zagrabil in rekel:\n" +
                    "\"Tokrat greš pa z menoj!\"\n" +
                    "Prijel je fantiča za roko in ga vlekel s seboj. Zopet sta šla mimo restavracije s hitro prehrano in fantič je ponovno potožil, da je lačen in policista prosil, če si gre lahko kupiti hamburger.\n" +
                    "\"Tokrat me pa ne boš prevaral!\" je rekel policist. \"Tokrat ti ga bom šel kupiti jaz, ti pa počakaj pred vrati!\"",
            "\n" +
                    "Mladi policist je prvič samostojno patruljiral po mestnih ulicah, ko je zagledal možakarja, ki je uriniral kar na ulici. Ker ni vedel, kako postopati z njim, je po GSM telefonu poklical dežurnega na policijski postaji in rekel:\n" +
                    "\"Na ulici sem zalotil nekoga, ki urinira. Ne vem, ali je to prekršek ali ne!\"\n" +
                    "\"Kako pa je kaj z organom?\" je vprašal dežurni.\n" +
                    "\"Organ je tukaj, na telefonu!\"",
            "Policist je na ulici spoznal prikupno dekle. Predstavila se mu je:\n" +
                    "\"Jaz sem Izabela.\"\n" +
                    "\"Izza česa?\" je vprašal policist.",
            "Kadeti čakajo pred učilnico, kjer sedi strokovna maturitetna izpitna komisija.\n" +
                    "\"Prav lahko je!\" se pohvali prvi, ki je uspešno opravil izpit. \"Vprašali so me, kaj je usnjeno in ima vezalke, jaz pa sem odgovoril, da je to čevelj!\"\n" +
                    "Drugega kandidata vprašajo: \"Na steni visi in tiktaka. Kaj je to?\"\n" +
                    "\"Ima vezalke?\" je radoveden kadet. \"Ne, nima jih\" mu odgovorijo.\n" +
                    "\"Potem je pa mokasin!\"",
            "Mujo in Haso sta kupila stanovanje, ki je imelo vse stene v ogledalih. Ko sta prvič vstopila v stanovanje, je Mujo rekel prijatelju:\n" +
                    "\"Poglej, nekdo je v najinem stanovanju!\"\n" +
                    "\"Hitro, pokliči policijo!\" je rekel Haso.\n" +
                    "Nekaj minut po tem, ko je Mujo poklical policijo, sta se pripeljala dva policista. Eden od njiju je pogledal v stanovanje in rekel:\n" +
                    "\"Zakaj ste naju poklicali, ko pa sta že najina kolega tukaj?\""

    };

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
            "Na plazi leži neki Nemec. Na obalo prinesejo valovi steklenico in Nemec jo odpre. Iz nje pride\n" +
                    "\n" +
                    " duh, ki izpolni eno željo.\n" +
                    "\n" +
                    " Nemec pomisli in rece: \"Poglej, toliko vojn je na svetu...\"\n" +
                    "\n" +
                    " Pa vzame atlas v roke in kaže s prstom: \"Tu na Balkanu, v Iranu,...kaj ce bi ti (duhec) to malo\n" +
                    "\n" +
                    " preprecil in koncal te vojne ?\"\n" +
                    "\n" +
                    " Pa mu duhec odvrne: \"Ah, zaželi si kaj drugega, to je pretežko.\"\n" +
                    "\n" +
                    " Pa si Nemec spet zaželi: \"Veš, jaz imam eno punco...Je lepa, BLOND, postavna; nic ji ne\n" +
                    "\n" +
                    " manjka, le neumna je prevec, kaj ce bi jo ti naredil pametno ?\"\n" +
                    "\n" +
                    " Duhec: \"Daj, mi atlas...\"",
            " Kdo ima IQ 50 ? \n" +
                    "\n" +
                    " Parada blondink.",
            " Zakaj imajo blondinke kvadratne joške?\n" +
                    "\n" +
                    " Ker pozabijo vzeti modrc iz škatle.",
            "V avtu se peljeta dve blondinki.\n" +
                    "\n" +
                    " Na travniku vidita še eno blondinko, ki sedi v colnu in vesla.\n" +
                    "\n" +
                    " Prva blondinka pravi: \"Zaradi tega pravijo, da smo blondinke butaste !\"\n" +
                    "\n" +
                    " \"Ja, ce bi zdaj znala plavati, bi odplavala k njej in jo pretepla.\"",
            " Kakšna je razlika med blondinko in Titanikom ?\n" +
                    "\n" +
                    " Koliko ljudi je bilo na Titaniku se ve, koliko jih je pa bilo na blondinki pa ne.",
            " Zakaj blondinke nikoli ne pišejo številke 11 ?\n" +
                    "\n" +
                    " Zato, ker ne vedo katera enka je prva.",
            "Zakaj blondinka ne vodi seznama vseh svojih dotedanjih ljubimcev ?\n" +
                    "\n" +
                    " Ker za to v nekaj knjigah vsako leto ustrežljivo poskrbi Telekom...",
            " Zakaj si blondinke vlivajo vodo v racunalnik ?\n" +
                    " Zato, ker hocejo surfati po Internetu.",
            " Zakaj kopljejo blondinkam grobove v obliki crke \"Y\" ?\n" +
                    " Ker je navajena v vodoravnem položaju držati noge narazen.",
            " - Zakaj v klubu Blondes Only ne strežejo vec juica z ledom ?\n" +
                    "\n" +
                    " - Zato ker je blondinka, ki pozna recept, odšla v penzijo.",
            " Kaj pomeni, ce vlece blondinka za sabo balo sena ?\n" +
                    " Extended memory.\n" +
                    " Kaj pa pomeni, ce sanja o seniku ?\n" +
                    " Virtual memory",
            " Zakaj blondinke nikoli pravocasno ne poklicejo telefonske številke 112 ?\n" +
                    " Ker na telefonski številcnici ne najdejo številke 11.",
            "Zakaj ima blondinka možgane velike kot grah ?\n" +
                    " Ker ima otecene.",
            " Se pelje blond eno dekle z avtom, pa jo ustavi policaj.\n" +
                    "\n" +
                    " \"Ja gospa, zakaj pa niste privezani ?\"\n" +
                    "\n" +
                    " Ona odlocno: \"Saj ni treba, sem pribita!!!\"",
            "Kaj rece blondinka, ko rodi dvojcka ?\n" +
                    " Zanima jo, kdo je drugi oce.",
            "Zakaj blondinke ne jejo banan ?\n" +
                    " Ker ne najdejo zadrge.",
            "Kako prižge blondinka luc po seksu ?\n" +
                    "\n" +
                    " Odpre avtomobilska vrata.",
            " Kaj rece mati blondinki, ko le-ta odhaja v \"life\" ?\n" +
                    "\n" +
                    " Ce ne boš do 1h v postelji pridi pa domov spat.",
            "Zakaj blondinka daje spodnji del trenirke na glavo ?\n" +
                    "\n" +
                    " Ker na trenirki piše 'Kappa'.",
            " Zakaj je pametno s sabo v avtu imeti blondinko ?\n" +
                    "\n" +
                    " Ker lahko parkiraš na parkirnem mestu za invalide.",
            "Z neboticnika hoceta skociti ena blondinka in ena rjavolaska. Katera bo prej priletela na tla ?\n" +
                    "\n" +
                    " Rjavolaska, ker mora blondinka najprej vprašati za pot.",
            " Zakaj blondinke ne skacejo cez plot ?\n" +
                    "\n" +
                    " Ker že pred plotom dajo.",
            "Kakšna je razlika med jetijem in pametno blondinko ?\n" +
                    "\n" +
                    " Obstajajo ljudje, ki trdijo da so jetija že videli.",
            "Blondinka pride v banko v New Yorku in prosi za posojilo $5000 za poslovno \n" +
                    "potovanje v Evropo. Manager zahteva nekakšno garancijo in blondinka mu \n" +
                    "preda kljuce cisto novega Rolls Royca, ki je bil parkiran pred banko. \n" +
                    "Manager se strinja in odpelje avto v podzemno garažo. \n" +
                    "Cez 2 tedna se blondinka vrne, placa $5000 posojila in $15 obresti. \n" +
                    "Manager pa pravi: \"Veseli smo, da ste poslovali z nami, toda ko vas ni bilo smo malo raziskali in ugotovili, da ste milijonarka. Zakaj ste si potem sposodili $5000?\" \n" +
                    "In blondinka je odgovorila: \"Kje drugje v New Yorku pa se lahko parkiram avto za dva tedna za $15?\"",
            "Kaj si da blondinka za uho, da bi izgledala bolj privlacno? \n" +
                    "Svoje noge. ",
            "Kakšna je razlika med blondinko in zdravilom za virus AIDS? Zdravilo za AIDS bodo enkrat odkrili...",
            "Rjavolaska, rdecelaska in blondinka pridejo mimo kupcka sperme. \n" +
                    "Rjavolaska vtakne vanj prst in rece: \"ni od mojega\". \n" +
                    "Rdecelaska tudi vtakne vanj svoj prst in presrecna ugotovi: \"ne, tudi od mojega ne\". \n" +
                    "Koncno strokovno mnenje blondinke: \"Ne, nihce iz mesta ni.\" \n",
            "Policaj ujame blondinko ki se je vozila po hitri cesti po napacnem voznem pasu. \n" +
                    "\"Ali niste vedeli kje se vozite?\" \n" +
                    "\"Ne, ampak kamorkoli že, grozno mora biti, saj so se vsi vracali!\"",
            "Blondinka in njen prijatelj sedita v bazenu. \n" +
                    "Vpraša ona: \"Ali bom res utonila ce bos dal prst ven?\"Mož blondinki: \"ce bi se naucila kako se lika in kuha, bi si lahko prihranili gospodinjsko pomocnico.\" \n" +
                    "Blondinka: \"In ce bi se ti naucil kako se stvarem pravilno streže, bi lahko prihranili vrtnarja!\" ",
            "Tri blondinke stojijo pred deroco reko in si želijo na drugo stran. Nenadoma prileti dobra vila in obljubi vsaki eno zeljo. Prva blondinka si zaželi plavutke. &Zelja se ji izpolne in priplava na drugo stran. Druga blondinka si zeli obroc za plavanje. Tudi njej se zelja izpolne in priplava na drugo stran. Tretja blondinka si zaželi, da bi bila rjavolaska. Dobra vila tudi njej izpolni zeljo, nakar stopi bivša blondinka tri korake dalje in precka most. ",
            "Blondinka pride k frizerju. Ta ji pove, da si more sneti walkman. Po kratkem premisleku to stori. Nenadoma ugotovi frizer da je umrla. \n" +
                    "Nadene si slušalke in sliši: \"vdihni, izdihni....\" ",
            "A veste zakaj se blondinka smeji, ko udari strela?\n" +
                    "Zato ker misli, da jo fotografirajo...",
            "Blondinka se šeta po cesti in kar naenkrat jo posesajo marsovčki v vesoljsko ladjo. No in, ko jo že imajo tam, jo uspavajo in prerežejo glavo. V glavi najdejo eno samo žicko. Vsi učeno gledajo v tisto glavo in vsi učenjaki niso vedeli, kaj naj bi to bilo. Končno se eden spomni in vzame klešče ter preščipne tisto žičko.\n" +
                    "No in kaj mislite, da se je zgodilo ?\n" +
                    "Ušesa so odpadla ! ",
            "Se v avtomobilu peljeta blondinka in rjavolaska. Nato pa avto obstane, obe izstopita. Rjavolaska reče: \"Uh, zmanjkalo nama je bencina...\"\n" +
                    "Blondinka pa: \"Madona si ti pametna, jaz bi se še kar naprej peljala !\" ",
            "Pride blondinka v trgovino:\n" +
                    "- Kilo kruha prosim !\n" +
                    "- Črnega ali belega ?\n" +
                    "- Ni važno, saj sem s kolesom ! ",
            "Kaj rece blondinka, kadar se zbudi pod kravo? \n" +
                    "\"Eden od vas stirih me bo peljal domov, fantje.\" ",
            "Kaj ima pobarvana blondinka? \n" +
                    "Umetno inteligenco. ",
            "Zakaj blondinke ne znajo plavati? \n" +
                    "Ker nog ne spravijo skupaj cim je vlazno. ",
            "Zakaj imajo blondinke modrice v okolici popka? \n" +
                    "Ker obstajajo tudi blond moski! ",
            "Zakaj je ljubi bog ustvaril blondinke? \n" +
                    "Ker ovce ne znajo prinesti piva iz hladilnika. ",
            "Zakaj blondinka ne sme skakati s padalom kadar ima menstruacijo? \n" +
                    "Lahko bi potegnila napacno vrvico... ",
            "Zakaj delajo blondinke tudi cez vikend? \n" +
                    "Zato, da jih ni potrebno na novo izobrazevati v ponedeljek.",
            "Blondinka je obiskala ginekologa, ta pa ji je po preiskavah povedal:\n" +
                    "\"Noseča ste.\"\n" +
                    "\"Kako, noseča?\"\n" +
                    "\"Dobili boste otroka.\"\n" +
                    "\"Kje pa otrok pride ven?\"\n" +
                    "\"Tam, kjer je prišel noter.\"\n" +
                    "\"Torej, na zadnjem sedežu avtomobila?\"",
            "Kakšna je razlika med moškim in blondinko?\n" +
                    "- Blondinka ima več sperme v sebi.",

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
                    "\"Ne, kravje vime sem le nekoliko premaknil, da sem videl na zvonik v dolini.\"",
            "Novi kuhar v gostinskem lokalu vpraša gosta:\n" +
                    "\"Kakšna se vam kaj zdi juha?\"\n" +
                    "\"Sol je dobra, voda je pa čisto zanič.\"",
            "\"Kako to, da v juho ne pade nobena muha?\" se je začudila mlada kuharica, ki je pravkar nastopila delo v kuhinji večje restavracije.\n" +
                    "\"Muhe se v naši kuhinji izogibajo hrane!\" ji je pojasnila šefinja kuhinje.",
            "\"Pečenka se mi je prismodila!\" je zastokal kuhar.\n" +
                    "\"Nič hudega\" je dejal šef strežbe. \"Na jedilni list bomo napisali, da gre za gasilsko pečenko, pa še ceno bomo zvišali!\"",
            "Kuhar pristopi k gostu, ki ga je malo pred tem natakar postregel s segedin golažem.\n" +
                    "\"Lepo prosim, če hitro pojeste golaž.\"\n" +
                    "\"Zakaj pa to?\" se začudi gost.\n" +
                    "\"Ravnokar je prišel v inšpekcijo sanitarni inšpektor.\"",
            "Kuhar ugledne restavracije se pritožuje:\n" +
                    "\"Kadar skuham slabo sploh ne morem pojesti.\"\n" +
                    "\"Kaj pa kadar skuhaš dobro?\"\n" +
                    "\"Takrat pa vse drugi pojedo.\"",
            "V tovarniški kantini se je mlad uslužbenec pritoževal nad preveč zapečenim zrezkom.\n" +
                    "\"Dragi gospodič,\" je rekel kuhar,\" jaz sem zrezke pekel že, ko so vas še dojili.\"\n" +
                    "\"In zakaj jih servirate šele sedaj?\"",
            "Ali veš, da je naš šef novega kuharja odpustil že drugi dan?\n" +
                    "\"Zakaj pa?\"\n" +
                    "\"Ni bil normalen. Ko je rezal čebulo, se je smejal.\"",
            "\"Natakar!\" je zavpil gost. \"Prinesite mi še dve kocki sladkorja!\"\n" +
                    "\"Saj sem vam prinesel že osem kock sladkorja. Kaj vam še ni dovolj?\"\n" +
                    "\"Tiste, ki ste mi jih prinesli so se že vse stopile!\"",
            "Starejši par si je nedeljsko kosilo privoščili v restavraciji. Ko pa je bilo potrebno plačati račun, je mož ugotovil, da je denarnico pozabil doma, zato je rekel natakarju:\n" +
                    "\"Doma sem pozabil denarnico. Jaz bom skočil domov po denar, ženo vam bom pa pustil tu za garancijo!\"\n" +
                    "\"Pa res nimate kaj bolj vrednega za garancijo?\" ga je vprašal natakar.",
            "Mož in žena sta v gostilni naročila rižoto. Ko jima je natakar postregel je mož takoj začel jesti, žena pa je nekaj časa gledala v krožnik, potem pa rekla:\n" +
                    "\"Tako majhne porcije so nama prinesli, da se bom pritožila!\"\n" +
                    "\"Bodi tiho in jej!\" ji je rekel mož. \"še vesela boš, da si dobila tako malo!\"",
            "\"Natakar, že pol ure čakam na kosilo! Ste pozabili name?\"\n" +
                    "\"Ne nisem! Vi ste tisti s svinjsko glavo in tenstanim krompirjem, kajne?\"",
            "V Ljubljani so odprli francosko restavracijo. Uroš je peljal svoje dekle na večerjo in natakar je paru priporočil:\n" +
                    "\"Želite morda našo specialiteto: \"Poulet a la peugeot\"?\"\n" +
                    "\"Kaj pa je to?\"\n" +
                    "\"Kokoš, ki jo je povozil avto.\" ",
            "Natakar, kaj pa dela gosenica v moji solati?\n" +
                    "\"Žal nam je zmanjkalo polžev.\" ",
            "Natakar v večji restavraciji vstopi v kuhinjo in išče enega od kuharjev. Končno ga najde v manjšem prostoru poleg kuhinje, ob sebi pa je imel ogromen kup na koščke narezanih žemelj.\n" +
                    "\"Ja kaj pa počneš?\" ga je presenečeno vprašal.\n" +
                    "\"Želim speči pecivo, pa v receptu piše: \"Nareži tri dni stare žemlje\". No, jaz jih režem šele dva dni!\" ",
            "Miro je vsak dan vstopil v gostilno in naročil pet kozarčkov vodke naenkrat. Med vojno so se namreč prijatelji dogovorili, da bodo preživeli pili tudi za umrle. In tako je vsak dan izpraznil pet kozarčkov vodke. Nekega dne pa je vstopil v gostilno in naročil:\n" +
                    "\"Štiri kozarčke vodke!\"\n" +
                    "\"Zakaj pa danes samo štiri?\" se je začudil natakar.\n" +
                    "\"Vodka je za moje umrle prijatelje, jaz pa sem postal abstinent!\" ",
            "Gost želi plačati.\n" +
                    "\"Kaj ste imeli?\" ga vpraša natakar.\n" +
                    "\"To ve le kuhar. Jaz sem naročil postrv!\" ",
            "\"Natakar, kaj mrgoli po moji solati?\"\n" +
                    "\"Ali še nikoli niste videli uši? ",
            "\"Natakar, moja juha je mrzla!\"\n" +
                    "\"Saj ni čudno, če ste jo pa naročili pred eno uro!\" ",
            "\"Natakar, imate kaj za hitro potešitev lakote? Mudi se mi na vlak!\"\n" +
                    "\"Ja, izvolite tale sendvič, ki mora tudi hitro v promet!\" ",
            "Napis na veliki tabli nad točilnim pultom vaške gostilne:\n" +
                    "\"Nikoli ne pijte s prazno denarnico!\" ",
            "\"Natakar, v moji juhi plava muha!\"\n" +
                    "\"Ne bo več dolgo, saj jo na robu krožnika čaka pajek!\" ",
            "\"Gospod, vi ste pa polili kavo po prtu!\" je natakar vzkliknil proti gostu.\n" +
                    "\"Ne, ne, nisem je jaz polil. Tako slaba je bila, da je kar sama padla skupaj!\" ",
            "Gost se jezi, saj čaka na hrano že debelo uro:\n" +
                    "\"Kdaj bom vendar dobil polovico piščanca?\"\n" +
                    "\"Takoj, ko bo še kdo naročil polovico! Kje ste pa že videli, da bi zaklali le polovico piščanca?\" ",
            "Natakar je gostu prinesel juho. Ko je čez nekaj minut prišel zopet mimo gostove mize je opazil, da ta mirno sedi in se juhe še dotaknil ni.\n" +
                    "\"Ali kaj morda ni v redu?\" je vprašal natakar.\n" +
                    "\"Poskusite juho!\" je rekel gost.\n" +
                    "\"Je prevroča ali prehladna?\"\n" +
                    "\"Poskusite juho!\" je spet vztrajal gost.\n" +
                    "\"Je preslana!\"\n" +
                    "\"Poskusite juho!\" je zakričal gost.\n" +
                    "\"Aja, žlice nimate!\" je ugotovil natakar. ",
            "\"Sedaj je čas, da izpraznimo lokal!\" je rekel natakar stari, debeli in pijani snažilki. \"Stopi na točilni pult in zapleši striptiz!\" ",
            "Gost se je pritožil natakarju:\n" +
                    "\"Naročil sem porcijo ocvrtih kalamarov, na krožniku sta pa samo dva!\"\n" +
                    "\"Oh, oprostite, takoj vam bom prinesel še enega!\" ",
            "Skupina prijateljev je po dolgotrajnem vzponu prispela do lovske koče. Oskrbnica jim je prinesla vročo pijačo. Prvi je naredil požirek in rekel:\n" +
                    "\"Fuj! Smrdi in okus ima po umazani vodi!\"\n" +
                    "\"Si tvoj okus pustil v dolini?\" je rekel drugi. \"To je ja vendar čaj!\"\n" +
                    "V tem trenutku je pristopila oskrbnica in rekla:\n" +
                    "\"Bo še kdo skodelico kakava?\" ",
            "\"Kako lahko dokažeš, da je resnica smrtno nevarna?\"\n" +
                    "\"Greš v gostilno, naročiš Laško pivo, potem pa glasno oznaniš: \"Ta scalnica sploh ni pivo!\".\" ",
            "\"Natakar, zakaj vsakemu gostu ponujate telečjo pečenko?\"\n" +
                    "\"Če jo bo kaj ostalo jo bomo morali pojesti mi, ki smo tu zaposleni!\" ",
            "Natakar v nočnem klubu je pristopil k šefu strežbe in mu rekel:\n" +
                    "\"Šef, dve novici imam za vas! Dobro in Slabo!\"\n" +
                    "\"Povej najprej dobro!\"\n" +
                    "\"Tistega razgrajača od včeraj danes ni v lokalu!\"\n" +
                    "\"Pa slaba?\"\n" +
                    "\"Njegovi prijatelji pravijo, da bo prišel kasneje!\" ",
            "\"Super! Odlično! Tako velikega in slastnega zrezka pa v vaši gostilni še nikoli nisem jedel!\" je vzkliknil gost.\n" +
                    "\"Žal sem se zmotil!\" je nesrečno rekel natakar. \"Ta zrezek je šefov!\" ",
            "\"Natakar, kaj mi pa danes priporočate?\"\n" +
                    "\"Zelo, zelo močne zobe ter mišičaste prste!\" ",
            "Lepotica je v restavraciji pristopila k bradatemu natakarju in mu rekla, da mu želi nekaj šepniti v uho. Natakar je privolil, lepotica pa mu je s prstom začela ovijati brado in se igrati z njo ter rekla:\n" +
                    "\"Ste vi tukaj šef?\" in še naprej z prsti šarila po bradi.\n" +
                    "\"Ne, jaz nisem šef!\" je rekel natakar.\n" +
                    "\"Ali ga lahko pokličete?\" je vprašala lepotica in mu prste, enega za drugim vtikala v usta.\n" +
                    "\"Ne, ne morem ga poklicati, ker ga danes sploh ni tu!\"\n" +
                    "\"Toda, jaz ga potrebujem, ker mu moram nekaj sporočiti!\" je rekla lepotica in spet s prsti ovijala natakarjevo brado.\n" +
                    "\"Saj lahko meni pustite sporočilo!\" je rekel natakar.\n" +
                    "\"No, prav, pa mu povejte, da v stranišču ni WC papirja, voda pa tudi ne teče!\"",
            "Natakar gostu:\n" +
                    "\"Žal smo morali specialiteto naše kuhinje črtati iz jedilnega lista, ker je kuhar polomil ključ za odpiranje konzerv.\" ",
            "Delavec, ki je delal s pnevmatskim vrtalnim strojem na gradbišču pred gostilno si je vzel odmor. Vstopil je v gostilno in si naročil pivo. Natakar mu je prinesel vrček piva in videl, kako se delavcu tresejo roke. Ko je v roke vzel vrček, so se mu roke tako tresle, da je pivo polival po mizi in po tleh.\n" +
                    "\"Mora biti pa res težko piti pivo, ko se vam roke tako zelo tresejo!\" je rekel natakar.\n" +
                    "\"Pivo niti ni problem!\" mu je odgovoril delavec. \"Huje je, ko grem lulat. Preden se polulam, prej dvakrat doživim izliv semenske tekočine!\" ",
            "Gost, ki je cel večer popival v gostilni je poklical natakarja in mu rekel:\n" +
                    "\"Pijan sem! Prinesite mi nekaj, da sem bom streznil, preden odidem domov!\"\n" +
                    "\"Ja, takoj vam bom prinesel račun!\" ",
            "\"Nakar, ali je vaš kuhar sploh očistil ribo, preden jo je spekel?\"\n" +
                    "\"Zakaj le, saj je celo življenje preživela v vodi!\" ",
            "\"Zakaj pa ješ podstavek za kozarce?\" je Štef vprašal kolega, s katerim je malical v gostilni.\n" +
                    "\"To je podstavek za kozarce? Čudno! Pa najboljši okus ima od vsega, kar sem pojedel!\" ",
            "\"Kaj imate za malico?\"\n" +
                    "\"Polento!\"\n" +
                    "\"Ali nimate nobene izbire?\"\n" +
                    "\"Dve možnosti imate: ali jo naročite ali pa ne!\" ",
            "\"Natakar, prst držite v moji juhi!\"\n" +
                    "\"Nič hudega, saj ni vroča!\" ",
            "Gost je v gostilni naročil svinjsko pečenko. Ko jo je natakar postregel je gost začutil, da pečenka ogabno smrdi. Pritožil se je natakarju, ta pa mu je na mizo prinesel ventilator, ga prižgal in rekel:\n" +
                    "\"Da vam ne bo smrdelo!\" ",
            "Gost je poklical natakarja k mizi in mu rekel:\n" +
                    "\"Res je škoda, da že prej nisem obiskal vaše restavracije!\"\n" +
                    "\"Vam je bil zrezek tako všeč?\"\n" +
                    "\"Ne, toda, če bi vašo restavracijo obiskal prej, bi bil mogoče še svež!\" ",
            "\"Natakar, po teh školjkah, ki sem jih pojedel, me blazno boli želodec!\"\n" +
                    "\"Ste kaj nenavadnega opazili v njih, ko ste jih odprli?\"\n" +
                    "\"HaaAa? Jih je bilo potrebno odpreti??!?\" ",
            "V gostilno je vstopil mladoletnik in naročil natakarici:\n" +
                    "\"Dvojni whiskey!\"\n" +
                    "Natakarica ga je debelo pogledala, nato pa rekla:\n" +
                    "\"Ali bi me rad spravil v težave?\"\n" +
                    "\"Morda kasneje, najprej pa mi dajte pijačo!\" ",
            "Moški je vstopil v gostinski lokal in naročil natakarju:\n" +
                    "\"Tinjak, prosim!\"\n" +
                    "\"Verjetno mislite na vinjak?\" ga je popravil natakar.\n" +
                    "\"Ne, prav ste slišali. Tinjak hočem! Midva se že dolgo poznava in se tikava!\" ",
            "\"Natakar, v moji juhi je vijak!\"\n" +
                    "\"Naj vam prinesem še izvijač?\" \n",
            "\"Natakar, ali imate pri vas vedno tako zanič hrano?\"\n" +
                    "\"Ne, vedno pa ne! V soboto in nedeljo imamo zaprto!\" ",
            "\"Natakar, je to marelični ali jabolčni zavitek?\"\n" +
                    "\"Po čem pa ima okus?\"\n" +
                    "\"Nimam pojma!\"\n" +
                    "\"Ali ni potem vseeno kakšen zavitek je to?\" ",
            "\"Natakar! Kaj je to v juhi?\"\n" +
                    "\"Oprostite, toda na žuželke se pa prav nič ne spoznam!\" ",
            "\"Natakar! V moji juhi je mrtva muha!\"\n" +
                    "\"Moje sožalje.\" ",
            "\"Natakar, včeraj sem v juhi našel en las, danes pa kar dva!\"\n" +
                    "\"Kar poglejte si jedilni list, pa boste videli, da je juha danes za 20 centov dražja!\" ",
            "\"Če že trdite, da je hrana neužitna, vsaj ne brskajte po njej! Kdo pa bo potem hotel jesti za vami?\" ",
            "\"Natakar, oprostite, koliko je ura?\"\n" +
                    "\"Niste v mojem rajonu!\" ",
            "\"Natakar, pri računanju ste se zmotili v mojo škodo!\" Namesto trinajst ste napisali štirinajst!\"\n" +
                    "\"Pomislil sem na to, da bi vam številka trinajst lahko prinesla nesrečo!\" ",
            "\"Natakar, tale skodelica za kavo je počena!\"\n" +
                    "\"To je dokaz, kako močna je naša kava!\" ",
            "\"Natakar, v sadni solati so muhe!\"\n" +
                    "\"Čudno! Ponavadi jih preženejo ose!\" ",
            "\"Natakar! V juhi sem našel majhno muho!\"\n" +
                    "\"Želite večjo?\" ",
            "\"Natakar, kaj pa tole plava v juhi?\"\n" +
                    "\"Kdo je dal pa vam diplomo? Profesor biologije ste pa še muhe ne poznate!\"",
            "\"Natakar, kaj pomeni ta muha v juhi?\"\n" +
                    "\"Ne vem, jaz sem natakar in ne vedeževalka.\" ",
            "\"Natakar, temu golažu pa nekaj manjka!\"\n" +
                    "\"Nemogoče, saj smo vanj zmetali vse, kar je včeraj ostalo v kuhinji!\" ",
            "\"Natakar, v sladoledu je muha!\"\n" +
                    "\"Kar pustite jo, da zmrzne! To jo bo izučilo za drugič\" ",
            "\"Natakar, zakaj na mizi ni zobotrebcev?\"\n" +
                    "\"Kaj pa vem. Veste ljudje so prav čudni. Vsak ga vzame, vrne pa nihče.\" ",
            "\"Natakar, ali je ta pečenka res svinjska?\"\n" +
                    "\"Seveda je, saj je kuharju dvakrat padla na tla.\" ",
            "\"Natakar, ali lahko prinesete zobotrebec?\"\n" +
                    "\"Žal ne, ker je trenutno zaseden!\" ",
            "\"Natakar, bom dočakal svojo pizzo?\"\n" +
                    "\"Glede na to, da še kar dobro izgledate, mislim da boste!\" ",
            "\"Natakar, prinesite mi nov krožnik! Tale je še moker od pomivanja.\"\n" +
                    "\"Oprostite, toda to je juha.\" ",
            "\"Natakar, v moji juhi je muha!\"\n" +
                    "\"Ne razburjajte se, saj je ne bo veliko popila!\" ",
            "\"V denarnici imam tri evre. Kaj mi priporočate?\"\n" +
                    "\"Lokal na drugi strani ceste!\" ",
            "Gost naroči:\n" +
                    "\"Na krožnik, ogret na pravo temperaturo, mi dajte dve jajci. Beljak ne sme biti preveč zapečen, rumenjak naj bo cel, dodajte pa malo peteršiljčka, pa ne preveč, ščep soli, ampak ne prevelik in naj bo brez popra.\n" +
                    "\"Imate še kakšno željo?\" vpraša natakar.\n" +
                    "\"Ne, to bo vse.\"\n" +
                    "\"Lahko jaz nekaj vprašam?\"\n" +
                    "\"Seveda.\"\n" +
                    "\"Kokoši, ki je znesla jajce je ime Barbara. Bo to v redu?\" ",
            "\"Želite menu za 5 ali 10 evrov?\"\n" +
                    "\"In v čem je razlika?\"\n" +
                    "\"V ceni!\" ",
            "Prijatelja vstopita v gostilno in prvi naroči:\n" +
                    "\"Prinesite nama pivo!\" reče prvi.\n" +
                    "\"In čisti vrček!\" za natakarjem zavpije drugi.\n" +
                    "Natakar se vrne s pivom, postreže prvega, pred drugega pa postavi čisti vrček. ",
            "K zasebnemu gostilničarju pride na razgovor kandidat za delovno mesto natakarja. \n" +
                    "\"Kako vam je ime?\" ga vpraša gostilničar.\n" +
                    "\"To-to-to-tomislav!\" mu je odgovoril jecljajoče.\n" +
                    "\"To je pa dolgo ime. Veste kaj, klicali vas bomo kar Tomislav!\" ",
            "\"Kavo, prosim.\"\n" +
                    "\"Želite turško ali italijanski ekspresso?\"\n" +
                    "\"Ne, premislil sem si! Dajte mi čaj!\"\n" +
                    "\"Ruskega ali kitajskega?\"\n" +
                    "\"Veste kaj, zdaj imam pa dovolj vaše politike! Šnops mi dajte!\" ",
            "\"Natakar, zakaj so tri jajca na oko dražja kot tri stepena jajca?\"\n" +
                    "\"Ker jih lahko preštejete!\" ",
            "Natakar postreže gosta z zrezkom.\n" +
                    "\"Gospod natakar, ta zrezek smrdi po žganju!\"\n" +
                    "Natakar stopi nekoliko vstran in vpraša:\n" +
                    "\"Ali še smrdi?\" ",
            "\"Natakar, kaj lahko dobim za 2 evra?\"\n" +
                    "\"Dva kovanca po en evro!\" ",
            "V gostilni pravi starejši gospod mladeniču, ki pije:\n" +
                    "\"Ali veste, da zaradi alkohola umre deset tisoč Francozov letno?\"\n" +
                    "\"Kaj se to mene tiče, jaz sem Slovenec!\" ",
            "\"Ali je bil zrezek dober?\" vpraša natakar.\n" +
                    "\"Glede na moj poklic še kar.\"\n" +
                    "\"Kaj ste pa po poklicu?\"\n" +
                    "\"Čevljar.\" ",
            "V novo odprti restavraciji je gost naročil govejo juho. Ko jo je dobil, z njo ni bil zadovoljen in je poklical natakarja ter mu rekel:\n" +
                    "\"Ta juha pa ni kaj prida, še najmanj pa je to goveja juha! Po mojem mnenju se v njej sploh ni kuhala govedina!\"\n" +
                    "Natakar mu odvrne: \"Gospod, vi imate pa res čudne zahteve! Ali ste že slišali, da bi se v srbskem pasulju kuhal Srb?\" ",
            "Gost se je jezil na natakarja, ki mu je prinesel juho, v juhi pa je namakal svoj prst.\n" +
                    "\"Ja, kaj pa delate! Prst držite v moji juhi!\"\n" +
                    "\"Veste, revma me trga, pa mi je doktor rekel da moram imeti prst stalno na toplem.\"\n" +
                    "\"Vtaknite si ga v rit, pa bo na toplem!\" je zakričal gost.\n" +
                    "\"Saj sem ga imel, dokler niste naročili juhe.\" ",
            "Natakar Miro v družbi delovnih kolegov pripoveduje svoj doživljaj:\n" +
                    "\"Nekega dne sem v restavraciji naročil kosilo. Dolgo sem moral čakati, in ko se je natakar vrnil, sem opazil, da zelo težko hodi. Vprašal sem ga, če ima išias. In kaj mi je odgovoril?\"\n" +
                    "\"Trenutek, prosim,\" je rekel, \"grem vprašat v kuhinjo.\"\n" +
                    "Družba se je pričela krohotati, eden med njimi pa je rekel:\n" +
                    "\"Miro, meni se kaj takega že ne bi zgodilo.\"\n" +
                    "\"Zakaj pa ne?\"\n" +
                    "\"Že prej bi pogledal na jedilni list, ali ga imamo, in me vprašanje ne bi zalotilo nepripravljenega.\" ",
            "\"Natakar, prinesite mi govejo juho z rezanci, govedino s špinačo in pire krompir, za desert pa češnjevo torto in kavo.\"\n" +
                    "\"Kako pa veste, da vse to imamo? Saj še jedilnega lista niste videli!\"\n" +
                    "\"Jedilnega lista ne, vidim pa prt na mizi.\" ",
            "Glavni natakar se je jezil nad vajencem:\n" +
                    "\"Nemogoča neroda si! Danes si razbil tri steklenice, pet kozarcev in dva krožnika! Le kaj boš razbil jutri?\"\n" +
                    "\"Nič. Jutri sem prost.\" ",
            "\"Natakar, tale zrezek ima okus po s čebulo nadevanemu podplatu!\"\n" +
                    "\"Joj, gospod, kaj ste vi že vse jedli!\" ",
            "Napis v ugledni restavraciji:\n" +
                    "\"Nič nimamo proti kajenju, toda prosimo, da ne izdihujete dima.\" ",
            "\"Koliko stane kapljica piva?\"\n" +
                    "\"Nič!\"\n" +
                    "\"V redu, potem mi ga pa nakapljajte pet litrov v tole kanglico!\" ",
            "Gost poskusi kengurujevo juho in takoj pokliče natakarja.\n" +
                    "\"Povejte mi, zakaj se ta juha imenuje kengurujeva, če v njej ni niti koščka kenguruja?\"\n" +
                    "\"Veste, gospod, pri nas vam lahko kot sladico ponudimo tudi pijano nevesto, pa v njej ni neveste.\" "

    };
// http://www.najdi.si/drobtine/index.jsp?dc=1&category1=Gostilni%C5%A1ki&entriesStartIndex=197&pageContent=content.browse.entries
        static String[] janezek2 = {
                "Profesor reče Janezku pri ustnem izpitu:\n" +
                        "\"Poglejte skozi okno tista drevesa! Jih vidite?\"\n" +
                        "\"Ja, vidim jih!\" reče Janezek.\n" +
                        "\"Ko bodo zopet listi na njih lahko ponovno pridete na izpit!\" ",
                "\"Zakaj ima naš Janezek pri matematiki cvek?\" vpraša mama učiteljico.\n" +
                        "\"Zato,\" odgovori učiteljica \"ker nižjih ocen nimamo.\""
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

                createCategory(janezek, JANEZEK_FILENAME);
                createCategory(blodninke, BLONDINKE_FILENAME);
                createCategory(policaji, POLICAJI_FILENAME);
                createCategory(gostilniske, GOSTILNSIKE_FILENAME);
                createCategory(tvojamama, TVOJAMAMA_FILENAME);
                createCategory(opolzke, OPOLZKE_FILENAME);
            createCategory(crniHumor, CRNIHUMOR_FILENAME);
            createCategory(mujohaso, MUJOHASO_FILENAME);
            createCategory(yugovici, YUGO_FILENAME);


    }


        public static String[] getTvojamama() {
                return tvojamama;
        }

        public static String[] getJanezek2() {
                return janezek2;
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





        static String[] crniHumor = {
"Scena doma. Policist hoče storiti samomor. Prisloni si cev pištole na sence, žena pa se krohota. On ji jezno zavpije:  \"Kaj se smeješ? Ti boš naslednja!\"",
                "Neka ženska se odloči, da bi bilo lepo, če bi v časopisu objavila osmrtnico za njenega nedavno preminulega moža.\n" +
                        "Odpravi se v uredništvo časopisa, kjer ji urednik prijazno razloži, da osrtnica stane 1 € na besedo.\n" +
                        "Ženica pomisli in reče: \"Potem naj bo pa kar: UMRL JANEZ NOVAK.\"\n" +
                        "Urednik se nasmehne in razloži, da je minimum besed za osmrtnice 5 besed.\n" +
                        "Ženska še enkrat pomisli in reče: \"UMRL JANEZ NOVAK: Clio NAPRODAJ.\"",
                "V Bosni še zdaj karaljuje samo ena Italijanska pevka. \n" +
                        "Katera?\n" +
                        "Mina.",
                "Umrl je dr. Franjo Tudjman. Da ne bi vznemirjali ljudi, se odločijo, da novico povedo pri vremenskih poročilih. Vremenar ob osmih zvečer: \"Rijeka +28, Split +30, Osijek +25, Banski dvori -1, Mirogoj (zagrebško pokopališče) +1.\"",
                "Kaže Mujo: \"Čuo sam, da na Kosovu ima menstruacije.\"\n" +
                        "Haso: \"Ne kaže se menstruacije, budalo, nego demonstracije!\"\n" +
                        "Mujo: \"Nije važno, ipak neko krvo proliče.\"",
                "Kdo ima 2 jajci in 100 zob?\n" +
                        "- Krokodil.\n" +
                        "Kdo ima 100 jajc in 2 zoba?\n" +
                        "- Partizanski pevski zbor.",
                "Pridejo partizani k stari ženi. Pa ji rečejo: \"Hitro mamka, skrijte nas, nemci prihajajo!\"\n" +
                        "Pa jih mamka skrije. Pridejo nemci. Vprašajo po partizanih a mamka se dela, da nič ne ve. Odrežejo ji eno nogo, a mamka še zmeraj noče povedati. Odrežejo ji drugo nogo. Še zmeraj je tiho. Nemci odidejo. Pa pridejo partizani iz skrivališča smeje: \"Ha mamka, laž ima kratke noge!\" ",
                "Albanski veleposlanik pride k slovenskemu pa reče:\n" +
                        "- Prijatelj, daj nekaj ukreni, da nas ne bodo Srbi v Kosovu čisto potolkli.\n" +
                        "- Čuj, nimam zdaj časa. Imam druge skrbi.\n" +
                        "- Če ne boš nič ukrenil, bom vse naše strokovnjake potegnil iz Slovenije nazaj v Albanijo!\n" +
                        "- Pa boli mene kita, jaz takaltak ne jem sladoleda! ",
                "Mimoidoči zagleda moškega, kako pije iz pipe na vodnjaku, na katerem je napis 'Voda ni za pitje!'.\n" +
                        "Reče mu: \"Ej'ga a s' na glavo padu, pa to ja ni za pit!\"\n" +
                        "Odgovor: \"Šta kažeš?\"\n" +
                        "\"Nič, nič, samo ti pij!\"",
                "Pride v nekem taborišču Hans do Hitlerja in pravi: \"Ti, zakaj pa danes tako po karameli diši?\"\n" +
                        "Hitler odvrne: \"A ne veš? Danes Žide s sladkorno žgemo.\" ",
                "Na ameriškem jugu gre črnec zvečer peš domov. Mimo se pripelje belec v Mercedesu in se zaleti v črnca. Udarec avta je tako močan, da črnca vrže 20 metrov s ceste.\n" +
                        "Naslednji dan v lokalnem časopisu piše: \"Nesreča na cesti 25, črnec ušel s kraja nesreče.\" ",
                "Pokliče na Radio Srbija poslušalec in si zaželi pesem 'Diži glavo Srbine'. Voditelj ga vpraša, za koga je to. Pa poslušalec odgovori: \"Za snajperista iz Osijeka!\" \n",
                "Zakaj se sedaj Sarajevo imenuje LOTTOGRAD ?\n" +
                        "Zato, ker je imela vsaka hiša priložnost za zadetek. ",
                "Kako veš, da je Kenijec zadel na loteriji?\n" +
                        "Ker ima uro Rolex okoli pasu! ",
                "Sedita Momir i Mičo nekde pored mora u Boki Kotorskoj.\n" +
                        "Mičo kaze Momiru: \"Vidi, Momiru prijatelj, tamo netko tone u moru!\"\n" +
                        "Momire njemu: \"Pa šta.\"\n" +
                        "Mičo: \"Pa mi sedimo.\"\n" +
                        "Momir: \"Pa šta, očeš da legnemo?\" ",
                "Pride Hitler v celico in pravi židom: \"Nocoj bomo pa jedli svinjino.\"\n" +
                        "Zaporniki (vsepovprek): \"HURA, HURA!!\"\n" +
                        "Hitler: \"Tiho svinje!!\" ",
                "Vlečeta četnika za sabo mrtvega bosanca. Ko se jima približa SFOR-ovec, začneta paničariti, kaj naj naredita z bosancem.\n" +
                        "Pa vestni vojak vpraša v polomljeni srboangleščini: \"Što do you imate ovde ?\"\n" +
                        "Četnika se pogledata, pa reče prvi: \"To ti je medo!\"\n" +
                        "\"Medo?\"\n" +
                        "Pogleda v slovar, ter vpraša: \"Grizli ?\"\n" +
                        "\"Ne, parali!!\" mu strokovno odgovori drugi četnik. ",
                "Kirurg se pripravlja, da bo operiral pacienta. Potem pa pacient reče:\n" +
                        "\"Veste, kako se bojim, to je moja prva operacija.\"\n" +
                        "\"Potolažite se, moja tudi!\" ",
                "So bili Nemec, Italijan ter Slovenec.\n" +
                        "Nemec vrže v prepad marcedesa.\n" +
                        "Pravi: \"Mi imamo še dosti mercedesev v nemčiji.\"\n" +
                        "Italijan vrže špaget.\n" +
                        "Pravi: \"Mi imamo dosti špegetov!\"\n" +
                        "Slovenec pa vrže Hasota v prepad.\n" +
                        "Pravi: \"Mi pa imamo dosti bosancev.\" ",
                "Srečata se znanki. Prva prijazno povpraša drugo: \"Kako pa kaj mož?\" V tistem trenutku pa se spomni, da je predlani umrl in hitro doda: \"...še vedno na istem pokopališču ?\" ",
                "Pride hčerkica k materi in reče, da ji raste tretja joška.\n" +
                        "Mati ji odvrne: \"Boli me ku*ac !\" ",
                "Kako rečemo židu, ki nosi na hrbtu jeklenko plina ?\n" +
                        "Zasvojenec!\n" +
                        "Kako rečemo Židu, ki nosi na hrbtu dve jeklenki plina ?\n" +
                        "Diler! ",
                "Hitler židu: \"Žid, koliko skočiš v višino ?\"\n" +
                        "Žid: \"En meter.\"\n" +
                        "In žid dobi kos kruha.\n" +
                        "Hitler drugemu židu: \"Koliko skočiš v višino ?\"\n" +
                        "Žid: \"Dva metra.\"\n" +
                        "In žid dobi dva kosa kruha.\n" +
                        "Hitler tretjemu židu: \"Koliko skočiš v višino ?\"\n" +
                        "Ta žid pa si misli: več bom rekel, več bom dobil kruha, in reče: \"Sedem metrov.\"\n" +
                        "Hitler: \"Tega ustrelte, lahko ograjo preskoči!\" ",
                "Prijatelja se pogovarjata.\n" +
                        "Prvi: \"Ko sem šel včeraj po mestu sem opazil, kako trije moški pretepajo enega.\"\n" +
                        "Drugi: \"Pa nisi šel pomagat ?\"\n" +
                        "Prvi: \"Seveda. To smo ga...!\"",
                "Mož se nekaj mesecev zbuja iz kome, žena mu nenehno stoji ob strani. Ko se\n" +
                        "končno zbudi, ji pomigne, naj se mu približa.\n" +
                        "Ko se žena vsede zraven njega, ji reče: \"Veš kaj, z menoj si bila skozi vse\n" +
                        "slabe čase. Ko sem bil odpuščen, si me podpirala, ko mi je propadel posel,\n" +
                        "prav tako, ko sva izgubila hišo, si še vedno stala ob meni, ko mi je začelo\n" +
                        "pešati zdravje, prav tako. Veš kaj, draga?\"\n" +
                        "\"Kaj, srce?\", ga vpraša nežno.\n" +
                        "\"Mislim, da mi prinašaš smolo.\"",
                "- Kaj je nesramnost?\n" +
                        "Da pošlješ v Afriko eno tono cedevite :-D",
                "- Kako žura epileptičarka?\n" +
                        "\n" +
                        "- Pena party",
                "Janezek je pri babici v varstvu.\n" +
                        "-Babi a se lahko igram s tvojimi joški?\n" +
                        "-Seveda, samo ne it čez cesto.",
                "What do you call a Mexican that lost his car?\n" +
                        "- Carlos",
                "Kakšne pice ne naročijo v sirotišnici?\n" +
                        "- Družinske",
                "Kako se reče ciganu na invalidskem vozičku?\n" +
                        "H-rom",
                "Se srečajo trije pedri v pogrebnem zavodu, ker so jim umrli partnerji.\n" +
                        "Vsi so naročili upepelitev, ampak,\n" +
                        "- Prvi pravi, da ne rabi žare, ker bo pepel svojega partnerja raztresel nad morjem, ker je tako rad lovil ribe.\n" +
                        "- Drugi pravi, da bo svojega raztresel po travniku, kjer sta se vedno sprehajala,\n" +
                        "- Tretji pa pravi: \"Jaz bom pa pepel vkuhal v pikanten golaž, da mi še zadnjič razturi rit.\"",
                "Pošlje vojak babici iz vojske paket v katerem je ročna bomba in pismo.\n" +
                        "Na pismu piše: Babi če potegneš za vrvico bom dobil 3 dni dopusta.",
                "Ej, a veš, da je bil Toše zadnjič po radiju?\n" +
                        "-A res?\n" +
                        "-Ja, pa po armaturki in po šipi tudi",
                "\n" +
                        "-> O strani\n" +
                        "Črni humor\n" +
                        "Pogrebni zavod\n" +
                        "Se srečajo trije pedri v pogrebnem zavodu, ker so jim umrli partnerji.\n" +
                        "Vsi so naročili upepelitev, ampak,\n" +
                        "- Prvi pravi, da ne rabi žare, ker bo pepel svojega partnerja raztresel nad morjem, ker je tako rad lovil ribe.\n" +
                        "- Drugi pravi, da bo svojega raztresel po travniku, kjer sta se vedno sprehajala,\n" +
                        "- Tretji pa pravi: \"Jaz bom pa pepel vkuhal v pikanten golaž, da mi še zadnjič razturi rit.\"Laughing\n" +
                        " \n" +
                        "1 komentar\n" +
                        "Zbirka črnih vicev\n" +
                        "Pošlje vojak babici iz vojske paket v katerem je ročna bomba in pismo.\n" +
                        "Na pismu piše: Babi če potegneš za vrvico bom dobil 3 dni dopusta.\n" +
                        "---------------\n" +
                        "Ej, a veš, da je bla Diana zanč po radiju?\n" +
                        "-A res?\n" +
                        "-Ja, pa po armaturi in šipi tudi\n" +
                        "---------------\n" +
                        "Kolje otac sina ispred kuće.\n" +
                        "Kad izadje mama iz kuće i reče: Majstore, jesmi li za rakijicu?.",
                "Klin s klinom, Žid s plinom",
                "Tvoja mama je tako debela, da je zlomila vejo na družinskem drevesu..."



        };

        private String[] tasce = {

                "Pride novi jetnik v zapor in ga drugi jetniki vprašajo,koliko let si pa ti dobil?\n" +
                        "15 let!\n" +
                        "Zakaj pa?\n" +
                        "Za zdravniško pomoč.\n" +
                        "Kako to,za zdravniško pomoč?\n" +
                        "Tašči je tekla kri iz nosa, pa sem ji naredil prevezavo okoli vratu,da ne bi izkrvavela.",
                "Na kmetiji se je stari oče obesil na podstrešju svoje hiše. Mati je poslala malega Mihca k župniku v vas z namenom, da mu pove za smrt dedka.\n" +
                        "\"Toda nikakor ne smeš povedati, da se je obesil!\" mu je zabičala mama. \n" +
                        "Ko je Mihec prišel v župnišče je rekel:\n" +
                        "\"Gospod župnik, mama me je poslala, da pridete k nam, ker je umrl dedek!\"\n" +
                        "\"Kaj?\" se je začudil župnik. \"Ali ga je gospod poklical k sebi?\"\n" +
                        "\"Ne, s štrikom ga je povlekel!",
                "Kaj je edina pozitivna stvar v Keniji? \n" +
                        "HIV.",
                "Janez: A veš kateri avto gre najhitreje po makadamu?\n" +
                        "\n" +
                        "Miha: Hm...ne vem?\n" +
                        "\n" +
                        "Janez: Službeni!",
                "Serbus Štef, kwo delaš? \"\n" +
                        "\" stou za ženo. \"\n" +
                        "\" ajaaa? kk gre? \"\n" +
                        "\" pa gre, sam štrom me še mal jebe",
                "Pride ženska srednjih let k zdravniku, vsa otekla in plava po obrazu. \n" +
                        "\n" +
                        "Pa pravi zdravniku: \"Gospod doktor, mož me vsakič, ko pride iz gostilne \n" +
                        "pretepe. \n" +
                        "\n" +
                        "Kaj naj naredim???\" Zdravnik ji svetuje: \"Gospa skuhajte kamilični \n" +
                        "čaj in ga grgrajte vsakič ko pride mož iz gostilne. \n" +
                        "\n" +
                        "To počnite, dokler NE gre spat. Čez en mesec pa pridite na kontrolo.\" \n" +
                        "\n" +
                        "Gospa pride čez en mesec na kontrolo vsa lepa in pravi zdravniku: \n" +
                        "\n" +
                        "\"Gospod doktor, vi delate čudeže. Res pomaga, mož nič več NE znori\" \n" +
                        "\n" +
                        "Pa ji doktor odvrne: \"Saj sem vedel, DA NI kriv alkohol, ampak GOBEC!!!!\" ",
                "\"Kaj naj storim, da mi bodo zrasle prsi?\" je nesrečno zavzdihnila \n" +
                        "žena. \n" +
                        "\"Čisto enostavno!\" ji je rekel mož. \"Vzemi toaletni papir in se \n" +
                        "briši med dojkama!\" \n" +
                        "\"In ti misliš, da bo to pomagalo?\" \n" +
                        "\"Seveda bo! Če na riti deluje, bo tudi na joškah!\"",
                "V ordinacijo prižvižga pacient in reče psihiatru:\n" +
                        " \"Doktor, jaz mislim, da sem ptič!\"\n" +
                        " \"Kar odletite nazaj v čakalnico, jaz pa bom poklical v bolnico, da vam\n" +
                        " pripravijo gnezdo...",
                "Nevrotik je tisti, ki gradi gradove v oblakih.\n" +
                        " Psihotik je tisti, ki tam živi.\n" +
                        " Psihoterapevt je tisti, ki pobira najemnino.",
                " Zdravnika kliče pacientka:\n" +
                        " \"Oprostite, gospod doktor, ali sem morda pri vas pozabila spodnje\n" +
                        " hlačke?\"\n" +
                        " \"Ne, nisem jih videl v ordinaciji.\"\n" +
                        " \"Hvala lepa, potem so verjetno ostale pri zobozdravniku.\"",
                " \"O, mlada gospodična. Vedno kadar vas vidim kako se smejite, vas želim\n" +
                        " povabiti k sebi.\"\n" +
                        " \"Ste samski?\"\n" +
                        " \"Ne, zobozdravnik sem.\"",
                "Kaj bi Jörg Haider najbolj obžaloval, če bi preživel?\n" +
                        "\n" +
                        "Da je uničil tri avstrijske table pa NOBENE slovenske!",
                "Jacksonu je uspelo prestaviti še en mejnik v glasbeni industriji. Je prvi solist, ki je razpadel.",
                "Lovec Jaka pride domov nažgan ko mina in se uleže v posteljo k ženi, \n" +
                        "se spravi na njo in ga sploh ni motilo, da ima menstruacijo.......\n" +
                        "Žena zjutraj vstane in gre v službo, ko on še spi. \n" +
                        "Ko se Jaka zbudi najde posteljo vso krvavo, in si misli: \"Ustrelil sem jo!\" \n" +
                        "Gre in takoj prešteje vse naboje za puško. Vsi so bili tam.\n" +
                        "Potem pa: \"Zaklal sem jo!\" Gre v kuhinjo, pregleda vse nože,\n" +
                        "vsi so bili lepo čisti odloženi. Nič mu ni bilo jasno,\n" +
                        "nakar gre v kopalnico, se pogleda v ogledalo in ..... \"sranje,\n" +
                        "požrl sem jo!!!!!!!!!!!!!!\"",
                "Michael Jackson noče biti kremiran, ker je 89% njegovega telesa iz plastike. NAmesto tega bi raje" +
                        " bil recikliran v tovarni LEGO, ker se bo tako lahko še vedno igral z otroci.",
                "Gresta serijski morilec in punčka v gozd. \n" +
                        "Punčka pravi: \n" +
                        "\"Joj kako je mene strah, tako mračno in prav grozljivo je.\" \n" +
                        "Serijski morilec pa nadaljuje: \n" +
                        "\"Ja,kako bo šele mene strah, ko bom šel sam nazaj!\"",
                "Model in njegova punca sta bila skupaj v postelji, ko se punca nenadoma obrnek njemu in ga vpraša: \"A si ti pedofil?\"\"Preklet hudič!\" reče on karajoče. \"To je grda grda beseda od osemletne punčke!\"",
                "kaj podnevi laja,ponoči pa plava?\n" +
                        "taščina proteza!",
                "Kakšna je razlika med kupom peska in kupom dojenčkov? Dojenčke lahko premečeš z vilami...",
                "Koliko dojenčkov rabiš, da z njimi pokriješ eno nogometno igrišče?\"Odvisno kako na tanko jih narežeš!",
                "- \"Vama je sada opet dobro?\" \n" +
                        "- \"Dobro nije, ali je bolje.\" \n" +
                        "- \"Ipak je dobro kada vam je bolje.\" \n" +
                        "- \"Bilo bi bolje da je dobro!\"",
                "Zakaj cigani prebarvajo kante za smeti rdeče in rumeno?Da bi njihovi otroci mislili,da jejo v Mc Donaldsu!",
                "Pride črnec iz morja in vrze tica cez ramo!\n" +
                        "Vsi ga gledajo, on pa rece.\n" +
                        "Kaj gledate a vam ko greste v morje , a se vam ne skrči!",
                "\n" +
                        "Pride vaški peb v gostilno in vpraša kelnerco, kaj imajo za jest. Ona mu odgovori; \"prvi meni, drugi, tretji meni...\" Pjeb ji reče:\"pa kaj mene briga ker te je ker te pa ni. Dej mi vampe in pir.\" Ko pjeb poje vpraša kelnerco kolk je njegov dolg. Klenerca mu zabrusi: \"pa kaj mene briga kolk je tvoj dolg. Plači vampe pa pir in se zgub domu.\"",
                "\"Kmetom pomagam, da se postavijo na noge,\" je dejal plemič in jim zasegel konje.",
                "Pride hčerkica k materi in reče, da ji raste tretja joška.Mati ji odvrne: \"Boli me ku*ac !\"",
                "Izgorjeloj baki u pozaru zelimo vjecni mir uz pjesmu: \n" +
                        "- \"Sve jos mirise na nju!\"\n",
                "Otac poslao sina Sabana u vojsku. Posle devet meseci salje Saban pismo ocu u komemu kazuje da je ziv i zdrav i da se otac nista ne brine o njemu. Istovremeno trazi od oca da mu napise sta ima novo kod kuce. Otac odgovara: \n" +
                        "- \"Dragi sine Sabane, svi smo zivi i zdravi. Jedina novost je da ti je zena rodila brata.\"",
                "Kroz maglovito proskrozorje se teturaju dvije kurve.\n" +
                        "Nato će jedna: danas će biti dobar dan, osjećam miris sperme u vazduhu.\n" +
                        "Nato će druga: ma jok sestra, to sam samo i ja podrignula..",
                "\"Halo, policija? Moja tašča se je obesila!\"\n" +
                        "\"Pa ste prerezali vrv?\"\n" +
                        "\"Ne... Še diha...\"",
                "Kaj je optimizen:\n" +
                        "To, da vidiš klošarja kako sedi na klopci in bere Naš Dom.",
                "\n" +
                        "Uletila jedna časna sestra nadstojnici samostana u kancelariju:\n" +
                        "- \"Majko, silovana sam u šumi. Šta da radim?\"\n" +
                        "- \"Sestro, izgovori sto puta Oče naš... a onda pojedi 3 limuna.\"\n" +
                        "- \"Majko razumijem to za molitvu, ali zašto limunovi?\"\n" +
                        "- \"Da ti skinu blaženi osmjeh s lica...\"",
                "- Kako zovu djevicu u Srbiji\n" +
                        "- !?\n" +
                        "- Cura koja trci brze od svog brata.",
                "Kapitan Titanika pove ostalim:Zadeli smo ob ledeno goro.Zaradi tega vam moram povedati dve novici.Dobro in slabo.Katero naj povem prvo ?Najprej slabo!Potopili se bomo.In dobra? Za to bomo dobili 11 oskarjev.",
                "U finalu svetskog prvenstva za invalide pobedila reprezentacija Bosne, i oni su poceli da se zahvaljuju svima koji su im pomogli da dodju na ovo prvenstvo, sponzorima, prijateljima, itd... \n" +
                        "Kad ono iz tribina se cuje Hrvat: \n" +
                        "- \"A za nas nema hvala, je li, a tko vas je takve napravio?!?\"",
                "Pita Zdravko šefa za bolovanje. \n" +
                        "- \"Šta ti je?\", pita ga šef. \n" +
                        "- \"Pa bolestan sam.\" \n" +
                        "- \"Šta ti je?\" \n" +
                        "- \"Jebem svoju sestru!!! Jel ti to dovoljno bolesno?\"",
                "Gre star par v gostilno!\n" +
                        "Žena reče :Joj meni je tako toplo pri srcu!\n" +
                        "Moz pa: Ja kaj ne vidis, da mas josk v župi!",
                "Bracanin na samrti pita sina: \n" +
                        "- \"Sine je li ono mati pece moje omiljene kolace? Donesi mi jednog!\" \n" +
                        "Sin ode i vrati se bez kolaca te kaze: \n" +
                        "- \"Neda mater, kaze da je to sutra za sprovod!\"",
                "Rece sine fotru črncu: Ati a se lahko igram s tvojim lulkom?\n" +
                        "Ja,ja sine sam ne it prevec dalec!",
                "kaj reče lev ko sreča viteza?\"sveže meso v konzervi!",
                " Prideta mož in žena k mesarju. Pa vprašata, ce bi lahko stehtal dojencka na natancni tehtnici.\n" +
                        "\n" +
                        " Mesar odvrne, seveda, lahko, in odnese otroka zadaj v klavnico, kjer ga stehta.\n" +
                        "\n" +
                        " Potem se vrne ves krvav in rece: \"Kilo dvajset brez kosti.\"",
                "Zakaj imajo pedofili radi otroke do višine 1 m ?\n" +
                        "\n" +
                        " Zato, ker ne morejo prijeti za kljuko in pobegniti...",
                "Oce in sin porivata avto v prepad.\n" +
                        "\n" +
                        " Sinko: \"Oce, zakaj porivava avto v prepad ?\"\n" +
                        "\n" +
                        " Oce: \"Tiho bodi, da se mama ne zbudi !\"",
                "Pride Dedek Mraz v zavod za prizadete otroke. Po predstavitvi vzame mikrofon v roke in pravi:\n" +
                        " \"Kdor mi zapoje pesmico bo dobil darilo.\"\n" +

                        " Fantek iz prve vrste vzame mikrofon in pricne: \"AAAAooooo, eeeeoooooouuuuuuu,\n" +

                        " aaaaauuuuu....!!\"\n" +

                        " Ko konca, Dedek Mraz pristavi: \"In kdor me bo zajebavou ne bo dobil NIC !\"",
                "Kakšna je razlika med pedofilom in pedagogom ?\n" +
                        "\n" +
                        " Pedofil ima otroke resnicno rad.",
                "Dva pedofila se pogovarjata o svoji stroki...\n" +
                        "\n" +
                        " Pa rece prvi: \"Cuj, vceraj sem eno štiriletno ruknu...\"\n" +
                        "\n" +
                        " Drugi pa: \"Kaj?!!! Štiriletno??? Pa to ja že hodi!\"",
                "Hitler v taborišcu vpraša Žideka:\n" +

                        " - Koliko si star, mali?\n" +

                        " Židek odgovori:\n" +

                        " - Jutri bom pet let.\n" +

                        " - A-a, ne boš!",
                " Pride Hitler kot ponavadi vsako popoldne v taborišce.\n" +

                        " Pa gre do Žida in mu prijazno rece: \"Ti debelušcek moj, za metlo si se skril !\"",
                "V porodnišnici bodoci ocka caka da bo žena rodila. Po kakšnih dveh urah nervoznosti pride\n" +
                        "\n" +
                        " porodnicar ven in v desni roki drži dojencka za noge tako da binglja z glavo navzdol. Nato pa ga\n" +
                        "\n" +
                        " zalima ob desno steno pa ob levo, vrže ob tla in nekaj casa skace po njem. Nato ga prime in\n" +
                        "\n" +
                        " vrže skozi okno. Ocka zaprepaden ogleduje njegovo ravnanje in ne ve kaj bi rekel ali naredil.\n" +
                        "\n" +
                        " Nato se porodnicar zasmeje in pojasni: \"Samo malo šale gospod, veste, dojencek se je že rodil\n" +
                        "\n" +
                        " mrtev.\"",
                " Se grejo Anglež, American in Bosanc kdo zadane z lokom v jabolko na ženini glavi. Ustreli\n" +
                        "\n" +
                        " Anglež....center..in rece: \"I'm Robin Hood.\"\n" +
                        "\n" +
                        " Ustreli American...center...: \"I'm Rambo.\"\n" +
                        "\n" +
                        " Ustreli Bosanec direktno na sredo glave in pripomni: \"I'm sorry.\"",
                " Sin: \"Mama, ali ja ne želim iči u Ameriku !!\"\n" +
                        "\n" +
                        " Mama: \"Šuti i plivaj dalje !\"",
                " Mlada mamica po stopnicah nese dojencka in ga drži za noge. To opazuje soseda in prijazno\n" +
                        "\n" +
                        " pove: \"Soseda, da ne bo malemu kapica dol padla!\"\n" +
                        " Mamica odgovori: \"Saj ni sile, saj sem jo mu pribila.\"",
                " Pride Hitler pozimi malo pogledat v Dachau. Takrat je bilo 10 stopinj pod niclo. Pa rece svojemu\n" +
                        " podrejenemu:\n" +
                        " \"Uff, je mraz, daj še kakšnega Žida na ogenj vrzi !\"",
                " Kakšna je razlika med dojenckom in slonom ?\n" +
                        "\n" +
                        " Slona ne moremo metati v steno.",
                " Kakšna je razlika med dvo-kilskim in tro-kilskim dojenckom ?\n" +
                        "\n" +
                        " Tro-kilski gori dlje casa.",
                " Ata in Janezek v kleti popravljata elektricno napeljavo. Cez nekaj casa Janezek zaklice mami v\n" +
                        "\n" +
                        " zgornje nadstropje:\n" +
                        "\n" +
                        " \"Mama, ata že pol ure trese elektrika !\"\n" +
                        "\n" +
                        " Mama iz zgornjega nadstropja:\n" +
                        "\n" +
                        " \"Joj, koliko bomo pa elektrike placali !\"",
                "Pride Janezek do fotra\n" +
                        " - Ati, kaka je razlika med prakso in teorijo?\n" +
                        " - Pojdi do mame in sestre ter ju vprašaj ce bi obe dale tujcu za 20.000 DM\n" +
                        " Seveda sta obe takoj za.\n" +
                        " - No vidiš sine, teoreticno imamo mi 40.000 DM, prakticno pa dve kurbi.",
                "Kaj je grozno ?\n" +
                        " Sedem dojenckov v eni kanti za smeti.\n" +
                        " Kaj je pa še bolj grozno ?\n" +
                        " Eden dojencek v sedmih kantah za smeti.",
                "Sinek pritece k mami:\n" +
                        " \"Mami, mami, oci se je pa obesil na podstrešju !\"\n" +
                        " Hitro steceta na podstrešje in ... tam ni nic.\n" +
                        " Mama si že oddahne, sinko pa pravi: \"Hahaha, 1. april !! ... Oci se je pa obesil v kleti !\"",
                "Janezek vpraša mamo: \"Mama, mama, se lahko grem igrat z babico ?\"\n" +
                        " Mama: \"Lahko, samo potem jo nazaj zakoplji !\"",
                " Kakšna je razlika med dojenckom in frnikolami ?\n" +
                        " Frnikol ne moreš nalagati z vilami.",
                " Kakšna je razlika med dojenckom in odojkom?\n" +
                        " Odojek se v pecici lepše zapece.",
                " Srecata se slepi in invalid na vozicku.\n" +
                        " Slepi: \"Kako gre ?\"\n" +
                        " Invalid: \"Saj vidiš.\"",
                " Spreta se brezroki in slepi.\n" +
                        "\n" +
                        " Brezroki: \"Te bom tak vžgal... !\"\n" +
                        "\n" +
                        " Slepi: \"To bi pa res rad videl !\"",
                "Vprašanje: Kako spijo dojencki v Sarajevu?\n" +
                        "\n" +
                        " Odgovor: Kot zaklani.",
                "V avtobusni garaži nek obcan po vrsti poljublja avtobuse. Vratar ga nekaj casa gleda in vpraša:\n" +
                        "\n" +
                        " \"Kaj pa je z vami ? A se vam je zmešalo !?\"\n" +
                        "\n" +
                        " \"Ne, avtobus mi je povozil tašco, pa ne vem kateri !\"",
                "\"Zakaj te vceraj ni bilo na tenis,\" vpraša Miha Janeza.\n" +
                        "\n" +
                        " \"Ah, tašca je umrla, pa sem moral na pogreb,\" je rekel Janez.\n" +
                        "\n" +
                        " Miha: \"Kaj je pa imela ?\"\n" +
                        "\n" +
                        " Janez: \"Ne vec kot dva tisoc mark.\"\n" +
                        "\n" +
                        " Miha: \"Ne mislim kaj je zapustila, ampak kaj se ji zgodilo, da je umrla ?\"\n" +
                        "\n" +
                        " Janez: \"Kosilo je kuhala, potem pa je šla v klet po krompir, padla po stopnicah in se ubila.\"\n" +
                        "\n" +
                        " Miha: \"Ja, kaj je bilo pa potem ?\"\n" +
                        "\n" +
                        " Janez: \"Ja nic, potem smo pa makarone skuhali.\"",
                "- Ja Tone, kaj pa pocneš tukaj ?\n" +
                        "\n" +
                        " - Žena mi je umrla. Kaj pa ti ?\n" +
                        "\n" +
                        " - Meni pa tašca.\n" +
                        "\n" +
                        " - Aaa... Tudi ni slabo, tudi ni slabo...",
                " - Zakaj pa nimaš strašila na vrtu ?\n" +
                        "\n" +
                        " - Ni potrebno, ker je tašca stalno na vrtu.",
                " Zakaj tašce ne pridejo v nebesa ?\n" +
                        "\n" +
                        " Ker zmaji ne letijo tako visoko.",
                "Kaj imata skupnega tašca in sonce?\n" +
                        "\n" +
                        " V oba ne moreš dolgo gledati."
        };


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
                "Janezek na uri verouka." +
                        "Nuna vpraša:" +
                        "“Kdo bi šel rad v nebesa?”\n" +
                        "Vsi učenci razen Janezka dvignejo roke.\n" +
                        "Nuna ga vpraša:" +
                        "“Janezek, zakaj pa ti ne bi odšel v nebesa?”\n" +
                        "Janezek:" +
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
                "Janezek pride v trgovino in reče prodajalcu:" +

                        "- Daj mi liter vina. - " +

                        "Prodajalec vpraša:" +

                        "- Hočete rdeče ali belo vino? " +

                        "Janezek odgovori:\n" +
                        "" +
                        "- Je čisto vseeno. To je za mojega dedka, ki je slep. -",
                "Janezek pove očetu, ko se ta vrne:" +
                        "- Veš oči potem, ko si ti odšel na službeno potovanje je mamo obiskal ekolog!\n" +

                        "- Kako pa veš, da je bil ekolog?" +

                        "- Ko je prišel je mamo vprašal če je zrak čist…",
                "V šoli so učenci dobili nalogo naj napišejo spis z naslovom: “Kaj bi naredili če bi bili direktor?” Vsi učenci pridno pišejo, le Janezek sedi in čaka križemrok. Učiteljica ga jezno vpraša:\n" +
                        "\n" +
                        "- Janezek, zakaj pa ti ne pišeš?\n" +
                        "\n" +
                        "- Čakam tajnico, da mi natipka!",
                "Učiteljica sprašuje:" +

                        "- Janezek, kdo je odkril Ameriko? - " +

                        "Janezek:"  +
                        "- Nisem bil jaz, prisežem! - " +

                        "Učiteljica:" +

                        "- Vem, da je nisi ti, ampak povej kdo jo je?\n" +

                        "Janezek:" +

                        "- Res nisem bil jaz prisežem. - " +

                        "Učiteljica: - Pa ti ne veš niti najbolj osnovnih stvari!! - "
                        +

                        "V tistem trenutku gre mimo razreda ravnatelj in ker sliši vpitje vstopi v razred in vpraša:" +

                        "- Zakaj se pa derete gospa? - \n" +

                        "Učiteljica:" +

                        "- Janezka sprašujem kdo je odkril Ameriko, on pa vztrajno trdi, da ni bil on." +
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

                        "- Janezek naštej tri afriške živali:\n" +

                        "Janezek:" +

                        "- Žirafa in dve zebri.",
                "Janezek piše domačo nalogo in vpraša očeta:\n" +

                        "- Ati, kje je Afrika?\n" +

                        "- Ne vem točno, ampak mislim, da ni daleč. V mojem podjetju dela en črnec, ki vsako jutro v službo pride s kolesom."

        };

        private static String[] tvojamama = {

                "Tvoja mama je tok debela,da ko plava usi misljo da se mali lošinj premika...",
                "Tvoja mama je tok debela,da k svoj mobi prestav iz enga hlačnga žepa v druzga,telefon zamenja signal...",
                "Tvoja mama je tok debela,da ko zaplava v morje,vsi kiti pojejo: We are familly!",
                "Tvoja mama je tako debela da ko stopi s postelje majo na Japonskem cunami.",
                "tvoja mama je tako debela, da ima lastno orbito",
                "Tvoja mama je tako debela, da ko stopi na tehnico, se pojavi napis \"Eden po \n" +
                        "eden, prosim\"",
                "Tvoja mama je tako debela, da sedi poleg vseh, ko gre v kino... :Đ ",
                "Tvoja mama je tako debela, da zamudiš pol filma, ko gre mimo televizije... :Đ ",
                "Tvoja mama je tako debela, da jo že 1 leto poznam pa je še vseeno nisem cele videl...",
                "Tvoja mama je tako debela, da si pas zapre z bumerangom. ",
                "Tvoja mama tako škili, da ji solze tečejo po hrbtu, ko se joče ...",
                "Tvoja mam je tako debela, da, če zaplava, postane Himalaja otočje",
                "Tvoja mama je tako debela, da ne rabi nosit hlač, ker ji špeh vse prekriva!",
                "Tvoja mam je tako debela, da ko obleče rumeno vetrovko, ljudje za njo kličejo: \"Taxi! Alo, taxi!\"",
                "Tvoja mama je tak debela, da okoli nje tecejo maraton. ",
                "Tvoja mama je tako debela, da se pri fuzbalu ne rabi vraćat v obrambo .\n",
                "Tvoja mama je tako stara, da je sedela zraven Jezusa v tretjem razredu osnovne šole... ",
                "tvoja mama je tako stara da stregla na zadnji večerji.",
                "tvoja mama je tako grda da je doktor ob njenem rojstvu skloftal njene starše",
                "tvoja mama je tako neumna da je padla na anketi ",
                "Tvoja mama je tako grda, da ko pride v strip bar, ji plačajo, da se ne sleče... ",
                "Tvoja mama je tako grda, da ko pride v banko, ugasnejo vse kamere ",
                "Tvoja mama je tako debela, da si da majonezo na aspirin ...",
                "Tvoja mama je tako debela, da že samo njena senca tehta 100kg! ",
                "Tvoja mama je tako debela, da ko se gre poleti kopat na morje, jo Španija proglasi za nov kontinent. ",
                "Tvoja mama je tako debela, da ima še njena leva ritnica svojo poštno številko.. ",
                "Tvoja mama je tako debela, da vsakič, ko nosi visoke pete, najde nafto... ",
                "Tvoja mama je tako debela, da jo je zadel parkiran avto... :Đ ",
                "Tvoja mama je tako debela, da mi je zmanjkalo bencina, ko sem se poskušal iti okoli nje. ",
                "Tvoja mama je tako grda, da ko se je prijavila na tekmovanje grdih bab, so ji rekli \"oprostite, nobenih profesionalcev..\" ",
                "Tvoja mama je tako stara, da je Jezusu dolžna za joint... ",
                "tvoja mama je tako umazana da ko sva se šla sex prek telefona sem dobil unetje ušes ",
                "Tvoja mama je tako stara,da še vedno vidi črnobelo.",
                "Tvoja mama je tak debela, da lika hlače na avtocesti",
                "Tvoja mama je tak debela, da je v knjigi rekordov na strani 39, 40, 41, 42, 43 in 44.",
                "Tvoja mama je tak debela, da ima slovensko, italijansko, hrvaško, madžarsko in avstrijsko državljanstvo.",
                "Tvoja mama je tako debela, da ko je bog rekel naj bo tam svetloba, jo je prosil naj se umakne.",
                "Tvoja mama je tako debela, da je slon na njeni majici resničen.",
                "Tvoja mama je tako debela, da ima krvno skupino golaž",
                "Tvoja mama je tak debela, da ima Avstralijo za vzglavnik"


        };

        private static String[] mujohaso = {

                "- Zdravo Mujo, čuo san, da si kupia novi auto.\n" +
                        "- Jesan, bre.\n" +
                        "- A koji?\n" +
                        "- Nisan, bre.\n" +
                        "- Pa šta, jes' il' nis'?\n" +
                        "- Pa jesan !\n" +
                        "- A koji, pitam te drugi put!\n" +
                        "- Nisan, bre!\n" +
                        "- Ajd, bež u p***u mater!\n" +
                        "...\n" +
                        "- A koje je boje taj tvoj Nisan?\n" +
                        "- Bež.\n" +
                        "- Nemoj ti meni bež', pitah ja, koje boje je avto.\n" +
                        "- Rekoh bež.\n" +
                        "- Dobro, dobro, idem.",
                "Fata in Mujo se sprehajata po živalskem vrtu. Pred kletko gorile samca, Mujo Fati ukaže: \"Kaži mu sise!\"\n" +
                        "Fata začudena gorili, ki začne globoko dihati pokaže naročeno. Mujo spet ukaže: \"Kaži mu guzo.\"\n" +
                        "Spet uboga in gorila se zečne tolči po plečih. Mujo: \"Kaži mu rupo.\"\n" +
                        "Ko Fata to naredi, gorila polomi kletko in se zapodi za Fato.\n" +
                        "Mujo začne vpiti za Fato: \"A sada ti njemu kaži, da ne možeš, što te boli glava!\"",
                "Došao je Mujo u Sloveniu nakon 20 godina kod svoga starog poslodavača Janeza...\n" +
                        "I upita ga: \"Eeeh Janeze, kako su ti tvoja žena i moja djeca...?\"",
                "Mujo v Ameriki zagleda avtomat za Coca-Colo. Vrže prvi kovanec in dobi Coca-Colo, vrže drugega, spet dobi Coca-Colo, vrže tretjega....in za njim se nabere vrsta. Eden iz vrste pride do njega: \"A nimate že dosti!? Mi smo tudi žejni!\"\n" +
                        "Mujo mu odgovori: \"Dok Muju dobiva, Mujo igra.\"",
                "\"Kako ti je ime?\"\n" +
                        "\"Mujo.\"\n" +
                        "\"Pa prezime?\"\n" +
                        "\"Pa pre zime i posle zime!\"",
                "Mujo si v restavraciji zazeli za kosilo divje svinje. Natakar mu odvrne: \"Žal mi je, zmanjkalo. Imamo pa eno navadno svinjo, ampak bom naročil kuharju, naj jo pošteno znervira!\"",
                "Išao Mujo polagati vozački ispit po peti put. Vrača se on kuči nakon ispita i pita ga Fata: \"Kako je bilo?\"\n" +
                        "Mujo: \"Ma pusti me bona, opet sam pao!! Je*o me u krivini, je*o me u pravcu, je*o me na semaforu !!!\"\n" +
                        "Veli Fata: \"Mene samo je*o u garaži, i ja položila iz prve!\"",
                "Mujo in Haso sta šla v hotel. Mujo je takoj zaspal, Haso pa ni mogel. Ko se mu je končno začelo dremati, pa je Mujo začel strašansko prdeti. Pa je šel Haso malo okoli in našel dolgo gumijasto vrtno cev. Vzel jo je in jo en konec zataknil Mujotu v zadnjico, drugega pa vrgel skozi okno. Ko se je drugi dan zbudil, je šel malo naokoli in srečal Mujota. Ta je bil ves zelen, komaj se je še vlekel...\n" +
                        "Haso: \"Kaj je s tabo?\"\n" +
                        "Mujo: \"Včeraj sem med spanjem toliko prdel, da so mi čreva ven pogledala. Komaj sem jih dobil nazaj noter!\"",
                "Haso je imel prometno nesrečo, v kateri je bil hudo poškodovan. Tako ga obišče Mujo v bolnici, kjer najde najboljšega prijatelja privezanega na posteljo, od katere visijo razne cevčice.\n" +
                        "Mujo: \"Ajde Haso bolan! Kaži mi kako si?\"\n" +
                        "Haso: \"Mmmmmmmm...\"\n" +
                        "Mujo: \"Ma ajde bolan - kaži nešto!\"\n" +
                        "Haso: \"Mmmmmmmmmmmmmmmmmmmmmm...!!\"\n" +
                        "Mujo: \"U redu čovječe. Ako ne želiš, da pričaš - evo ti papir i olovka pa mi napiši, što želiš, da mi kažeš.\"\n" +
                        "Haso začne pisati in v tem trenutku pride v sobo med. setra,ki nažene Mujota, ker vzemirja bolnike. Tako Mujo hitro vzame listek, ki mu ga je napisal Haso in ga porine v žep.\n" +
                        "Naslednje jutro dobi Mujo obvestilo iz bolnice, da je umrl Haso...\n" +
                        "Na pogrebu se začne Mujo jokati, saj se spomni, kaj vse sta doživela s Hasotom in seže v žep po robec...\n" +
                        "Tako najde v žepu tisti listek, ki mu ga je napisal Haso in prične brati: \"Mujo - budalo! Stojiš mi na cevki od kisika!!\"",
                "Američan, nemec in bosanec se srečajo v nebesih in se pogovarjajo kako so umrli.\n" +
                        "Pa reče američan: \"Kupil sem lotusa, pa sem se zaletel v drevo in ubil.\"\n" +
                        "Pa reče nemec: \"Kupil sem poršeja, pa sem se zaletel in ubil.\"\n" +
                        "Pa reče Haso: \"Kupio sam fičota a umro od gladi.\"",
                "Mujo se vrati sa fronte i vidi, da je u kuči majmun.\n" +
                        "Mujo: \"Fatoooo! Šta je to ?\"\n" +
                        "Fata: \"E to su ostavili oni Unproforovci...\"\n" +
                        "Mujo: \"Pa što za vraga nisi abortirala !?\"",
                "Mujo je moral nujno odpotovati, pa je prosil Hasota, da mu tačas vodi lekarno. Ko se vrne, ga vpraša kako je bilo.\n" +
                        "Haso: \"Bio je Meho, i rekao je da ga boli glava.\"\n" +
                        "Mujo: \"I što si mu dao?\"\n" +
                        "Haso: \"Aspirin.\"\n" +
                        "Mujo: \"Odlično, i tko je još bio?\"\n" +
                        "Haso: \"Bila je Fata, i rekla je da nije tri mjeseca ku*ca vidila.\"\n" +
                        "Mujo: \"I što si joj dao?\"\n" +
                        "Haso: \"Kapi za oči.\"",
                "Mujo sreča Hasota in ga vpraša: \"Kako si, bolan, Haso?\"\n" +
                        "\"Pa, danas prilično luksuzno,\" mu odvrne Haso.\n" +
                        "\"A kako to misliš - luksuzno?\"\n" +
                        "\"Pa, upravo sam uzeo luk in nasjeckao ga i odma´ mi navrle suze na oči!\"",
                "Fata gre v Bosni v bolnico, pa vidi unproforovca, kako tuli od bolečin.\n" +
                        "\"Plava kacigo, što ti je, sto tako urlaš ?\"\n" +
                        "\"Yao, yao, boli, metak u noga...!!\"\n" +
                        "\"Šuti plava kacigo! Dobio jučer Mujo metak ravno u glavu, ma nije ni pisnuo!!\"",
                "Mujo in Haso ukradeta helikopter. Po 10 minutah strmoglavita v jezero. Reševalci najdejo črno skrinjico in prisluhnejo:\n" +
                        "Mujo: \"Haso!!\"\n" +
                        "Haso: \"Šta je Mujo?\"\n" +
                        "Mujo: \"Ma gasi ovaj ventilator, več je hladno!\"",
                "Mujo in Haso gresta skakat s padalom.\n" +
                        "Sta na 1000 metrih pa Haso reče: \"A še ne bova odprla padala?\"\n" +
                        "Mujo odvrne: \"Samo še 500 metrov!\"\n" +
                        "Čez čas spet Haso: \"Na 500 metrih sva! Odpriva padala!\"\n" +
                        "Mujo pa: \"Daj strpi se, ne še!\"\n" +
                        "\"Na 100 metrih sva!\"\n" +
                        "\"Počakaj še malo.\"\n" +
                        "\"Ubila se bova, 50 metrov !\"\n" +
                        "Pa Mujo na enem metru reče: \"Z enega metra se pa še ja nobeden ni ubil!\"",
                "V zgodnjem pomladanskem dnevu gresta Mujo in Haso na bazen. Haso se takoj zlekne na ležalnik, Mujo pa se povzpne na 3-metersko odskočno desko. Tam gori se začne napihovati in body-buildersko napenjati dele telesa.\n" +
                        "\"Jel' Haso, kako ti to ja izgledam, \" v pozi vpraša Mujo.\n" +
                        "\"Kao orao !!\"\n" +
                        "\"Jel' po stašu, a ?\"\n" +
                        "\"Ne, po tvojim noktima !\"",
                "Mujo dobi stanovanje v bloku. Gospod iz stanovanjske mu preda ključ in mu razkaže prostore:\n" +
                        "\"Tu imate kuhinjo.\"\n" +
                        "\"Tu je spalnica.\"\n" +
                        "\"Tu je straniče.\"\n" +
                        "Mujo pri tem vzklikne: \"A baš u mom stanu !!\"",
                "Mujo sedi na pomladanskem soncu in kadi. Pride prijatelj Haso, prisede ter ga vpraša: \"Sjediš I razmišljaš, jel ?\"\n" +
                        "Mujo nekaj časa molči, nato pa odgovori: \"Jok! Samo sjedim.\"",
                "Mujo in Haso se vračata iz JNA. Ko Haso kupuje vozovnico na železniški postaji, ga uslužbenka vpraša, če želi meti karto za eno smer ali pa povratno. \"Povratna je 50% jeftinja,\" ga še pouči uslužbenka. Haso prebrisano odvrne: \"Pa jasno, da povratnu,\" in urno odbeži k Mujotu, ki ga čaka v bifeju in mu pove: \"Uh, što sam zajebo! Kupio sam povratnu, a uopče se nečemo vračati!\"",
                "Pride Mujo do mesarja pa reče: \"Pa bolan mesaru, dodaj mi jednu tikvu od prasenca.\"\n" +
                        "Pa mesar ni bil od včeraj, pa odseka Mujotu glavo, in ga vpraša: \"A vam jo zavijem ?\"\n" +
                        "Nauk: Nikoli ne omenjati glave pri mesarju, je preveč glup.",
                "V stari Jugi sta Mujo in Haso živela v istem bloku: Mujo v prvem nadstropju, Haso pa v desetem.\n" +
                        "Vsak dan sta že navsezgodaj klicala drug drugega kar z balkona: \"Hejjjjj Mujoooooooo!\" \"D'jutrooo Hasoooo!\" \"Ajd, dođiiiiii na kafuuu!\" itd. preko celega dneva. \n" +
                        "Sostanovalcem je prekipelo, zato so se dogovorili, da jima kupijo telefone. Prvi telefonski poziv Mujota Hasi: \"Halooooooo, jesi'l ti Hasoooooo!\"\n" +
                        "Haso: \"Pa etooo jesam jesam!\"\n" +
                        "Mujo: \"Pa što onda čekaš, aj'd dodji na balkon, da ti nešto kažem!\"",
                "Prideta v Bosno dva bogata Nemca brez otrok. Na nekem dvorišču vidita polno otrok, ki se podijo za žogo.\n" +
                        "Vpraša Nemec Mujota: \"Jel to sve vaše?\"\n" +
                        "Mujo: \"Da, dali vam uhvatim jednog?\"",
                "Mujo i Haso rade zajedno i Mujo pozove Hasu prvi put u kuču. \n" +
                        "\"Fato, skuvaj nam bolan jednu kavu.\"\n" +
                        "\"Jes, boli me dupe, kuvaj sam, tvoj je gost.\"\n" +
                        "Mujo ne zna šta če, pita taštu.\n" +
                        "\"Ne pada mi na pamet,\" kaže ona.\n" +
                        "I tako svi ukučani redom, niko ne je*e Muju dva posto. Posedi Haso malo i ode kuči.\n" +
                        "Sledeče nedelje pozove on Muju kod njega. Čim su ušli, žena im skida cipele, kafa je več gotova i pičence čeka. Svi samo lete oko njih. Mujo čudi i čudi se, i na kraju če:\n" +
                        "\"Kako si to uspeo, da te svi ovako slušaju ?\"\n" +
                        "\"Lako, bolan. Kad sam se oženio, dodjem ja prvi dan kuči s posla, kad mačak sedi u mojoj fotelji. Kažem mu: 'Mačak, bjež odatle, ili češ dobiti žuti karton!'\n" +
                        "Mačak ništa, samo spava. I dade ja njemu žuti karton. Drugi dan opet, mačak u mojoj fotelji. Opet mu kažem: 'Mačak, nema šale, ako se smesta ne pomeriš, dobičeš još jedan žuti karton!'\n" +
                        "I ništa, mačak ne reaguje, i dade mu ja drugi žuti karton. Dodjem ti ja treči dan kuči, mačak opet u fotelji. Tu se ja naljutim i kažem mu: 'E pa mačak, pazi šta radiš, dobičeš crveni karton !'\n" +
                        "Mačak ništa, ja skinem pušku i ubijem ga.\"\n" +
                        "\"Dobro, a kakve to veze ima s ovim tvojima ?\"\n" +
                        "\"Pa svi imaju po dva žuta kartona !\"",
                "Došao Haso da obidje Muju u bolnici i pita ga, kako je nastradao.\n" +
                        "\"Zbog pecanja.\"\n" +
                        "\"Pa šta si pecao, crni čovječe?\"\n" +
                        "\"Prvo sam pecao na gliste ali me mrzelo da skupljam gliste pa su mi pokazali štos sa baterijom - vežeš zice za jedan i drugi kraj baterije, gurneš ih u zemlju i gliste same izlaze. Onda ja uzmem akumulator od kola, vežem žice i gurnem ih u zemlju kad ono izlaze rovci. Uzmem dve žice, vežem ih za šteker u zidu, izlaze krtice. Gledam ja onda onaj dalekovod pored moje kuče, gledam ga i ne dade mi sejtan mira - bacim dvje kuke do žica i zabodem ih u zemlju...\"\n" +
                        "\"I šta bi?\"\n" +
                        "\"Izadje treča smjena Kreke, ubi Boga u meni!\"",
                "Vpraša Haso Mujota: \"Ma Mujo, šta bi ti bio radije: homoseksualac ili intelektualac ?\"\n" +
                        "Mujo nekaj časa premišljuje in odgovori: \"Znaš šta, Haso, radije bi bio homoseksualac.\"\n" +
                        "\"Zašto ?!\"\n" +
                        "\"Zato, jer mi ide lakše u dupe nego u glavu.\"",
                "Krenuli Mujo i Haso kolima za Vakuf. Negde usput zaustavi ih jedna štoperka.\n" +
                        "\"Dokle češ ti, bona ?\"\n" +
                        "\"Do Vakufa.\"\n" +
                        "\"A što češ nam dati, ako te povezemo?\"\n" +
                        "\"Imam lepih jabuka.\"\n" +
                        "Mujo: \"Bil' ti Haso jabuka?\"\n" +
                        "\"Ne bi'.\"\n" +
                        "\"Neb' ni ja, onda ništa, nemožemo te povesti.\"\n" +
                        "Posle nekoliko kilometera zaustavi ih druga.\n" +
                        "\"A dokle češ ti, bona?\"\n" +
                        "\"Do Vakufa.\"\n" +
                        "\"A što češ nam dati, ako te povezemo?\"\n" +
                        "\"Imam lepih krušaka.\"\n" +
                        "\"Bil' ti Haso krušaka?\"\n" +
                        "\"Ne bi'.\"\n" +
                        "\"Neb' ni ja, e... onda ništa, nemožemo te povesti.\"\n" +
                        "Posle par kilometera zaustavi ih treča.\n" +
                        "\"Dokle češ sad ti, bona?\"\n" +
                        "\"Do Vakufa.\"\n" +
                        "\"A što češ nam dati, ako te povezemo?\"\n" +
                        "\"Može redaljka?\"\n" +
                        "\"Bil' ti Haso redaljke?\"\n" +
                        "\"Ne bi'.\"\n" +
                        "\"Neb' ni ja, e... pa onda ništa, nemožemo te povesti.\"\n" +
                        "Posle izvešnog vremena reče Mujo: \"A znaš li ti Haso, šta je to redaljka ?\"\n" +
                        "\"Ne znam.\"\n" +
                        "\"Neznam ni ja, 'ajde da se vratimo pa da pitamo.\"\n" +
                        "\"'Ajde.\"\n" +
                        "Vratiše se do one treče. Mujo stade i otvori prozor: \"A reči ti nama bona, šta ti je to redaljka?\"\n" +
                        "\"To ja skinem gače, pa dam jednom, pa dam drugom.\"\n" +
                        "\"A Bil' ti Haso ženskih gača?\"",
                "Kviz na radiu Sarajevo: \"Pitanje za 100 maraka: šta je to? Ima 4 kotača i vozi se...?\"\n" +
                        "Kliče Mujo: \"Jel' to auto ?\"\n" +
                        "Spiker: \"Vrlo blizu ste, al nije, nego auto s vozačem...\"\n" +
                        "Sada pitanje za 1000 maraka: \"Šta je to? Ima 6 kotača i vozi se...?\"\n" +
                        "Kliče spet Mujo: \"Jel' to kamion ?\"\n" +
                        "Spiker: \"Vrlo blizu ste, al nije, nego kamion s vozačem...\"\n" +
                        "Mujo se razkuri: \"Imam ja za vas jedno pitanje za 100 hiljada maraka: šta to žena ima među nogama !?!?\"\n" +
                        "Spiker: \"Jel' to pi*da?\"\n" +
                        "Mujo: \"Nije, nego pi*da ti materina !!!!\"",
                "Fata in Mujo gresta v kino. Gledata vojaški film, sedita v zadnji vrsti. Sredi filma pravi Fata: \"Mujo, meni se opasno prdi!\"\n" +
                        "Mujo: \"Nemoj sada, kasnije češ...\"\n" +
                        "Malo kasneje: \"Mujo, meni se opasno prdi!\"\n" +
                        "Mujo (že bolj jezen): \"Nemoj sada, kasnije češ!\"\n" +
                        "Še malo kasneje: \"Mujo, meni se OPASNO prdi!\"\n" +
                        "Mujo: \"Ajde, dobro. Puštaj ga, al tada, kad netko na filmu baci bombu.\"\n" +
                        "In res, Fata prdne, ko poči bomba. Nekaj časa je vse tiho, ko se oglasi nekdo v prvi vrsti: \"Je*em mater onome ko baca bombe, a baš KANALIZACIJU pogađa !!!\"",
                "Pitaju Muju: \"Jel' ba, Mujo, jel ti žena bila nevina kad se udala za tebe ?\"\n" +
                        "Mujo: \"Jebiga, šta ja znam... Jedni kažu da jest, a jedni da nije...\"",
                "Bosanci so slišali, da se da v Nemčiji lepo zaslužiti. Ker je bila pri njih revščina in ker tudi nikoli niso videli velikega mesta, so se odpravili na potovanje. Odšli so z vlakom in med vožnjo zaspali. Čez nekaj časa se vlak ustavi na ljubljanski postaji. Mujo se zbudi, pogleda skozi okno, se obrne nazaj v kupe in zavpije:\n" +
                        "- Ljudi, Minhen!",
                "Mujo pravi Hasotu: \"Haso, ima tri razloga, zašto ja j***m Fatu, a ona ima na sebi gas masku!\"\n" +
                        "Haso: \"Pa koji su to razlozi ?\"\n" +
                        "Mujo: \"Prvi: ljepše izgleda. Drugi: ljepše miriše. I treći: da vidiš samo kako ona mješa, kad joj stavim poklopac u filter !\"",
                "Mujo in Haso se vozita z avtomobilom. Zavijeta na avtocesto. Prižgeta radio in uživata v glasbi. Nenadoma se oglasi napovedovalec: \"Pažnja, pažnja! Neki ludak na avtoputu A1 vozi u suprotnom smjeru !!\"\n" +
                        "A Haso: \"Ma kaki jedan, bolan, ima jih na stotine !!\"",
                "Mujo sreča Hasota in mu pravi: \"E bre Haso, ja sam se zaštitio od AIDSA sto posto. Stalno nosim kurton. Skidam ga samo kad pišam, il' kad je*em !\"",
                "Kliče Haso Mujota: \"Adje Mujo, dođi k meni, pa čemo cepati drva!\"\n" +
                        "Pa pravi Mujo: \"Pa nemožem, imam spolnu bolest!\"\n" +
                        "Pa kliče Haso še enkrat Mujota pa pravi: \"Ajde Mujo, dođi k meni, pa čemo cepati drva!\"\n" +
                        "Pa Mujo zopet pravi: \"Ma nemožem, imam spolnu bolest.\"\n" +
                        "A Haso se razhudi: \"Pi*ka ti materina, kakvu spolnu bolest onda imaš to ti ?\"\n" +
                        "Pa pravi Mujo: \"Boli me k*rac za tvoje drva!\"",
                "Kaj pomeni GSM telefon ?\n" +
                        "\"Gdje Si Mujo?\"",
                "Vraćaju se Mujo i Haso s posla. Mujo:\n" +
                        "- Jedva čekam da dođem doma i da strgnem ženine gaćice.\n" +
                        "- A tako si jako napaljen?\n" +
                        "- Ma ne, stišću me.",
                "Prolazio Nemac sa devojkom kroz Bosnu u kolima sa kamp prikolicom. Stane Nemac ispred semafora i vidi Muju kako mu prilazi sa cigarom u ustima. Kaže Nemac devojci:\n" +
                        "- Sad ću da ti pokažem koliko su Bosanci glupi.\n" +
                        "Tu mu prilazi Mujo sa cigarom, tražeći vatre.\n" +
                        "Nemac mu pokaže na far i Mujo se sagne i pokuša da upali cigaru na far.\n" +
                        "Tek posle 5 minuta Mujo odustaje, Nemac se cepa u autu sa devojkom, da gas i ode.\n" +
                        "A Mujo kaže Hasi, koji je sve vreme stajao iza automobila:\n" +
                        "- Jooj bolan, kol'ko ti je trebalo da otkačiš tu prikolicu!",
                "Pita Haso Muju: \n" +
                        "- Šta ti se više dopada ajfon ili ajped? \n" +
                        "Mujo odgovara: \n" +
                        "- Meni se najviše dopada ajvar!",
                "Vozi Mujo kamion kroz Sloveniju.\n" +
                        "- Piči on tako kad odjednom ga zaustavi policajac. \n" +
                        "-Kaže policajac:\n" +
                        "- \"Drug, migalec vam ne dela!\"\n" +
                        "Izađe Mujo van i gleda okolo i čudi se. \n" +
                        "-Policajac ga spopao:\n" +
                        "- \"Drug, pogledajte, migalec vam ne dela!\"\n" +
                        "Mujo gleda okolo sav u čudu. \n" +
                        "-Opet će policajac:\n" +
                        "- \"Migalec vam ne dela!\"\n" +
                        "Kad Mujo odjednom:\n" +
                        "- \"Ma jebo te migalec, gledam gdje mi je prikolica!!!\"",
                "Leži Mujo na samrtnoj postelji, Fata plače kraj uzglavlja i drži ga za ruku. Mujo je upita:\n" +
                        "- Fato, hoćeš li mi ispuniti posljednju želju?\n" +
                        "Fata zajeca i reče:\n" +
                        "- Hoću, moj Mujo, samo reci!\n" +
                        "Mujo, onako slab, jedva prošapće:\n" +
                        "- Fato, hoću da se za šest mjeseci udaš za Hasu...\n" +
                        "Fata ga zbunjeno pogleda i upita:\n" +
                        "- Mujo, pa kud za Hasu, ti ga nikad nisi podnosio, rekao si da ga mrziš više od svega!?\n" +
                        "Mujo zadnjim snagama reče:\n" +
                        "- Upravo zato, Fato, upravo zato ...",
                "Unajmio Nijemac Muju da vuče bijelu liniju sredinom ceste.\n" +
                        "- Prvi dan Mujo obojio 4km. \n" +
                        "-Gazda zadovoljan. \n" +
                        "-Drugi dan Mujo oboji kilometar. \n" +
                        "-Gazda malo zbunjen, misli da su mu ostali rekli da im ne premašuje normu. \n" +
                        "-Trećeg dana je obojio samo 150m. \n" +
                        "-Odvuče ga gazda u ured na raport:\n" +
                        "- \"Mislio sam ti dati povišicu zbog onih 4km, a ti spao na 150m.\"\n" +
                        "- \"Eeeee, gazda. Računaj ti koliko mi je daleko bila kanta trećeg dana!\"",
                "Vraca se Mujina cerka sa mamom iz vrtica i pita Muju:\n" +
                        "- Tata, tata, sta znaci picka materina? \n" +
                        "- To ti je, cerko, nas frizerski salon! \n" +
                        "Sutradan isto tako, pa ga upita:\n" +
                        "- Tata, tata, sta znaci kurac? \n" +
                        "- To je gde kacimo jakne.\n" +
                        "Sutradan ga upita:\n" +
                        "- Tata, tata, sta znaci jebanje?\n" +
                        "- To ti je kad ja sisam kosu!\n" +
                        "Mujo je otisao do kafica i rekao cerci da pazi na frizerski salon. Ulazi musterija, pa mu Mujina cerka kaze:\n" +
                        "Dobrodosli u Picku materinu! Okacite jakne na kurac, sad ce moj tata da dodje da Vas jebe.",
                "Sedi Mujo na WC solji, sere i napreze se:\n" +
                        "- UUUUUUUU, MMMMMMMM, UFFFFF!\n" +
                        "Kad odjednom nestane struje i Mujo pocne da se dere:\n" +
                        "- AAAAAAAA! Upomoc! AAAAAAA!!!\n" +
                        "Fata se uplasi pa dodje u WC sa svecom i pita:\n" +
                        "- Mujo, sreco, sta ti je, sto se deres?\n" +
                        "Na to ce Mujo:\n" +
                        "- Uff dobro je, a ja mislio ispale mi oci.",
                "Fata se navečer pred televizorom počne umiljavati Muji i šapne mu na uho:\n" +
                        "– Mujo moj … moram t’ reć’ nešto … uskoro nas više neće biti samo dvoje u kući … bit će nas troje!\n" +
                        "Mujo oduševljeno pogleda u Fatin trbuh i reče:\n" +
                        "– Jao, Fato, mašala … de da te poljubim! Kako znaš?\n" +
                        "Fata još tiše reče:\n" +
                        "– Nazvala me mater jutros i rekla da nam dolazi u goste.",
                "Ulazi Fata u prodavnicu kućnih ljubimaca i vidi baš jeftinog papagaja. Prodavac objasni da je\n" +
                        "taj papagaj živeo u javnoj kući, ko zna šta je tamo naučio, zato je cena niska. Fati to nije\n" +
                        "smetalo i odnese papagaja kući. Čim je ušao u kuću, papagaj će:\n" +
                        "• Nova kuća, nova madam!\n" +
                        "Fata se nasmeja i pozove ćerku. Pagagaj će:\n" +
                        "• Nova kuća, nova madam, nova devojka!\n" +
                        "Nasmejaše se obe, kad ulazi i Mujo. Papagaj:\n" +
                        "• Nova kuća, nova madam, nova devojka, zdravo Mujo!",
                "Mujo:\n" +
                        "• Ono što sam iz španskih serija naučio, to je da poštujem kućnu pomoćnicu. Možda mi je\n" +
                        "majka...",
                "Prisao konobar Muji koji je sijedio za stolom, Mujo se primaknu njemu i pomirisa mu krpu koju je nosio preko ruke i rece:\n" +
                        "- \"Donesi mi sarmu danas je ovdje dobra sarma!\"\n" +
                        "Slijedeci dan ista stvar pomirisa on opet krpu i rece\n" +
                        "- \"Danas mi donesi Begovu corbu danas je ona dobra!\"\n" +
                        "svi u cudu gledaju Muju i pomislise, sigurno po mirisu krpe zna sta se kuha u kuhinji i sta je svijeze. \n" +
                        "-I tako se osoblje restorana dogovori da zeznu Muju i daju onu krpu sto je konobar nosio oko ruke kuharici da trlja po svojoj p.... pa nek to mirise da vide sta ce biti i sta ce naruciti da jede.\n" +
                        "Dolazi mujo sjeda u restoran, prilazi mu opet konobar i on naravno odmah pomirisa onu krpu oko ruke i rece:\n" +
                        "- \"Pa zar kuharica Zumra radi kod vas?\"",
                "Mujo i Haso gledaju porniće i Mujo pita Hasu:\n" +
                        "- Jel ti se diže?\n" +
                        "- Diže mi se.\n" +
                        "- Aj se digni po jednu pivu",
                "Mujo i Haso na turističkoj turi po Španjolskoj odluče da jednom vide i poznatu atrakciju, koridu. Dođu oni, sjednu, pa nezadovoljan Mujo reče:\n" +
                        "– Vidi onog klauna sto maše onom crvenom krpom, već mi je dosadio, pa kada će već jednom početi prava predstava?\n" +
                        "Čuju ih Španjolci pa se naljute i poslaše Muju u arenu jer ako toreador ništa ne valja, sigurno Mujo zna bolje. Gurnuše Muju u arenu. Bik se naroguši, pojuri na Muju, a Mujo jadan skamenjen od straha potrči koliko ga noge nose. Ali odjednom bik padne, Mujo mu pritrči, zamahne mačem i ubije ga. Na to oduševljena publika počne da viče – Mujo, Mujo, ….. Vraća se Mujo sav razdragan, i pita ga Haso:\n" +
                        "– Bolan Mujo, kako li ti je samo bilo u areni, da sam ja bio tamo ja bih se usro’ od straha?\n" +
                        "Na to će Mujo:\n" +
                        "– E budalo, pa šta misliš na šta se bik oklizn’o?",
                "Učiteljica: Mujo, gdje je Amerika na karti?\n" +
                        "Mujo: Evo je!\n" +
                        "Učiteljica: Haso, ko je pronašao Ameriku?\n" +
                        "Haso: Mujo!",
                "Pita Haso Muju:\n" +
                        "- Vjeruješ li u ljubav na prvi pogled\n" +
                        "Kaže Mujo:\n" +
                        "- Pa naravno da vjerujem, gde bi se ja oženio da sam Fatu dvaput pogledo.",
                "Pita Mujo Fatu: \n" +
                        "- Fato da nisam covjek sta bi htjela da budem?\n" +
                        "- kalendar\n" +
                        "- Zasto?\n" +
                        "- Da te mjenjam svake godine.",
                "Javlja se Mujo Radio Sarajevu i kaže: \"Da vam kažem, hodam ja Čaršijom, kad odjednom ugledam na podu novčanik.\"\n" +
                        "Spiker: \"Jesil' ga podignuo?\"\n" +
                        "Mujo: \"Da.\"\n" +
                        "Spiker: \"Jesil' ga otvorio?\"\n" +
                        "Mujo: \"Da.\"\n" +
                        "Spiker: \"Pa šta si vidio?\"\n" +
                        "Mujo kaže: \"1.000 maraka, 500 eura i lična karta.\n" +
                        "Spiker: \"Pa šta piše na ličnoj?\"\n" +
                        "Mujo: \"Muharem.\"\n" +
                        "Spiker: \"I šta sad?\"\n" +
                        "Mujo: \"Pa, ako može jedna pjesma za Muharema!",
                "Spava Mujo I probudi ga Fata:\n" +
                        "- Mujo, budi se, nisi popio tabletu za spavanje!",
                "Bila Fata kod doktora,nakon pregleda dođe kući,a Mujo je pita:\n" +
                        "-Fato bona,kako pica\n" +
                        "-dobro Mujo\n" +
                        "-kako sise\n" +
                        "-dobro Mujo\n" +
                        "-a Fato kako šupčina\n" +
                        "-e Mujo za tebe doktor nije pitao......",
                "Žali se Fata:\n" +
                        "- Jedva čekam taj 1. april da i meni neko kaže:\n" +
                        "\"Volim te!\"",
                "Doso Mujo s puskom u kafanu.\n" +
                        "-Ko mi je jebo fatu!\n" +
                        "Odgovara neki starac:\n" +
                        "-Nemas ti jarane toliko metaka!",
                "Pita Mujo Hasu:\n" +
                        "- bolan Haso ja sam čuo da si birao ženu, pa da te upitam kako si izabrao?\n" +
                        "- vidi vako, prvu sam pito koliko je 2+2 i ona kaže\n" +
                        "3, dođe druga, pitam nju kolko je 2+2 i ona kaže 5,\n" +
                        "dože treća i ja je pitam kolko je 2+2 i ona kaže 4.\n" +
                        "- i koju si izabro? \n" +
                        "- pa onu sa najvećim sisama!",
                "Pita Fata Muju:\n" +
                        "-Mujo gdje su alpe?\n" +
                        "Mujo će:\n" +
                        "-Ne znam Fato, ti si zadnja spremala sobu.",
                "Posla Fata sa Mujom kod ginekologa.\n" +
                        "Ulazi Fata, prošlo dva sata, kad doktor izlazi: \n" +
                        "\" Gospodine Mujo, Vaša zena je impotentna, ali to sam rešio dao sam joj Hofmanove kapi.\"\n" +
                        "Na to će Mujo: \"Doktore, viri Vam Hofman.\"",
                "Mujo bolan, od cega ti je umro komsija, pita Haso.\n" +
                        "Mujo rece: \n" +
                        "- boga mi ne znam ni od cega je zivio.",
                "Dosli Mujo i Haso u kafanu.\n" +
                        "Konobar: \n" +
                        "- '' Izvolite?''\n" +
                        "Mujo: \n" +
                        "- Meni dajte pivo LAV jer sam ja lavcina, a Hasi moze konjak.",
                "Rodio se Muji sin s tri glave pita ga Haso:\n" +
                        "- kako ti je sin bolan? \n" +
                        "Mujo odgovara:\n" +
                        "- koo zmaj!",
                "Dosla Muji u posetu tasta. Pita je Mujo:\n" +
                        "- koliko ostajete?\n" +
                        "Tasta:\n" +
                        "-Dok vam ne dosadim.\n" +
                        "Mujo: \n" +
                        "- što tako kratko?!",
                "Haso se žali Muji:\n" +
                        "• Meni moja žena stalno prigovara da više nema džentlmena među nama, muškarcima.\n" +
                        "Mujo odmahuje glavom:\n" +
                        "• Jok, bolan, nije istina, evo ja neki dan držao Fati kišobran, da ne pokisne.\n" +
                        "Haso zadivljeno upita:\n" +
                        "• Stvarno? A kad?\n" +
                        "• Kad je menjala gumu kod Doboja...",
                "Vozio Mujo mercedes 200 na sat i zaustavi ga policajac. Da li si ti normalan kad vozis 200? zgazices nekoga. Moraću da te kaznim.\n" +
                        "\n" +
                        "Gospodine - rece Mujo:\n" +
                        "- Zurim jer sam izbo tastu nozem pa da je bacim u reku ,eno je u gepeku.\n" +
                        "- Stoj, ne mrdaj - rece policajac i pozva policijsku stanicu za pojacanje.\n" +
                        "Ubrzo dodjose inspektori otvorise gepek i ne nadjose nista ,a na to ce Mujo: \n" +
                        "- Eto, jos ce da izmisli i da sam vozio 200 na sat!",
                "Došao Mujo u Nemačku i otišao u mesaru da se zaposli. Šef mu pokazuje mašinu u koju stavi bika, a sa druge strane izađe kobasica. \n" +
                        "Mujo će na to: \n" +
                        "- Ima l' šta da se ubaci kobasica, a izađe bik? \n" +
                        "Mesar mu odgovori: \n" +
                        "- To je samo tvoj tata mogao...",
                "Dođe Haso u ambulantu i zalijepljen papir na vratima i piše:\n" +
                        "- prvi pregled 100 eura, drugi pregled 50 eura. \n" +
                        "I kad Haso udje kod doktora, reče:\n" +
                        "- Dobar dan doktore evo ja došao opet.",
                "Idu Mujo i Haso u pustinju.Mujo ponese sve neophode stvari,a Haso ponese vrata od auta. Pita Mujo Hasa:\n" +
                        "-Sto si ti bolan ponio vrata od auta?\n" +
                        "A Haso će mu na to:\n" +
                        "-Pa kad bude bilo vruće da otvorim prozor.",
                "Pitali Muju koji mu je najdraži film koji je gledao.\n" +
                        "Kaže Mujo: \"Moja svadba, ali unatrag.\"\n" +
                        "zašto unatrag, pitaše ga!\n" +
                        "Mujo: \"Muzika mi vraća pare, Fata ide materi !!!",
                "Zvrsili Mujo i Haso u zatvoru.\n" +
                        "Haso poče švrljati po zidovima.\n" +
                        "A Mujo kaze:\n" +
                        "- Aj nemoj bolan, izbacice nas napolje.",
                "Zvrsili Mujo i Haso u zatvoru.\n" +
                        "Haso poče švrljati po zidovima.\n" +
                        "A Mujo kaze:\n" +
                        "- Aj nemoj bolan, izbacice nas napolje.",
                "Mujo kaže Hasi:\n" +
                        "-vidim ja da ti mali ulazi u pubertet!\n" +
                        "-Ubicu ga! A ja ga poslao u apoteku!",
                "- Prvu bračnu noć Mujo i Fata legli da spavaju, i Mujo skinuo Fatu, raširi joj noge, i kaže:\n" +
                        "- Auuu Fato što je velika! Auuu Fato što je velika! \n" +
                        "- Što reče to dva puta? pita ga Fata.\n" +
                        "- Nisam rekao dva puta, to je eho, nisam rekao dva puta to je eho!",
                "Sjede Mujo i Haso u kafiću.Mujo najednom kaže Hasi:\n" +
                        "-Bolan Haso,jes' ti znao da je 7 moj sretan broj?\n" +
                        "-Stvarno?Od kada to?\n" +
                        "-Od uvijek.Rođen sam 7.7.1977. i zbog broja 7 sam pogodio cijelu kombinaciju na Lotu.Sve sam to potrošio na utrku konja,a moj je bio broj 7.\n" +
                        "-I šta, bio si prvi?\n" +
                        "-Ma jok, sedmi!",
                "Kupio Mujo kiflu s viršlom i dok ju je jeo, video je dlaku pa se vrati u pekaru. Pita Mujo pekara:\n" +
                        "- Jel, bolan, od čega su ove kifle napravljene?\n" +
                        "Pekar počne da nabraja:\n" +
                        "- Brašno, voda, jaja...\n" +
                        "Na to će Mujo:\n" +
                        "- Sledeći put obrijte jaja!",
                "Šeta Mujo sa drugarom crncem kroz čaršiju, kad sve žene pozdravljaju crnca. Pita ga Mujo:\n" +
                        "- Bolan što ti se ovolike žene javljaju, šta im radiš?\n" +
                        "- E Mujo brate, sa ženama treba znati, malo miluješ, malo maziš, malo ljubiš...\n" +
                        "Reši Mujo da to proba i sa Fatom, legne on uveče sa njom i počne sve po redu. Mazi, miluje, kad će Fata:\n" +
                        "- Bolan Mujo, zajebi te crnačke fore!",
                "Jelena Karleuša dala oglas u novine da se udaje i prima sve ponude. Javi se Mujo na oglas i dođe kod nje na razgovor. Pita ga ona:\n" +
                        "• Dobro Mujo, koliko ti zarađuješ?\n" +
                        "• Pa oko 300 eura!\n" +
                        "• Molim? Pa ja toliko samo dam na WC papir!\n" +
                        "A Mujo će:\n" +
                        "• Auuu, da sam ja znao da si toliko usrana, ne bih ni dolazio!",
                "Nosili Mujo i Haso klavir na 30 sprat, kad su stigli kaze Haso Muji:\n" +
                        "- Imam 1 srecnu vijest i jednu tuznu .\n" +
                        "Mujo kaze :\n" +
                        "- Ajd reci tu srecnu pa tuznu.\n" +
                        "Haso kaze:\n" +
                        "- Stigli smo na 30 sprat ali smo Pogrijesili zgradu.",
                "Šetaju Mujo i Haso po selu i naidu na govno. Mujo ce Hasi:\n" +
                        "- Haso, bil ti pojeo ovo govno za 1000 eura?\n" +
                        "Misli Haso:\n" +
                        "- Jeste gadno, ali malo se potrpim i poslije mi ostane 1000 eura u džepu. Pristajem!\n" +
                        "Pojede Haso govno, uzme 1000 eura od Muje i nastave hodati. Opet Haso misli:\n" +
                        "- Za 1000 eura i nije bilo tako gadno, samo je problem da ce Mujo razglasiti po cijelom selu da sam pojeo govno i svi ce me zezati do kraja života.\n" +
                        "Misli i Mujo:\n" +
                        "- E jesam glup! Ovaj se malo potrpio dok je pojeo govno i sada ima mojih 1000 eura. Hodajuci tako naidu na drugo govno i Haso ce:\n" +
                        "- Mujo, a bil ti pojeo ovo govno za 1000 euro?\n" +
                        "- Bih!\n" +
                        "I tako Mujo pojede govno i Haso mu dadne 1000 eura. Nastave hodati, kad ce Haso:\n" +
                        "- E moj Mujo što smo blesavi: obojca smo pojeli po govno, a niko ništa nije zaradio.\n" +
                        "- Nema veze Haso, važno je da se pare okrecu !",
                "Pita Mujo Hasu:\n" +
                        "-Zašto bolan uvijek sjediš na prozoru dok tvoja žena pjeva?\n" +
                        "-Da ne pomisle ljudi da je tučem.",
                "Vanzemaljci kidnapovali Rusa, Amerikanca i Muju da bi ih proucavali. Otvore glavu Rusu, kad tamo neka super masina, radi pa rastura. Onda su vanzemaljci odlucili da nece napasti Ruse jer su mnogo napredni. \n" +
                        "Otvore glavu Amerikancu, kad tamo neka super masina, radi punom parom, nista se ne cuje, sve neke brojke i slova...Vanzemaljci su odlucili da ni Amera ne diraju. \n" +
                        "A Mujo? To je tek zadalo probleme vanzemaljcima. Oni mu otvore glavu kad tamo samo jedna ZICA! Svi gledaju, opipavaju, ali se nista ne desava i niko nista ne shvata. Jedan se ohrabri i presjece zicu. I sta se desilo? \n" +
                        "MUJI OTPADNU USI!",
                "Pise Mujo pismo Ginisu:\n" +
                        "- Dragi Ginise! Ja ti pisem jer mislim da me trebas upisati u onu tvoju knjigu rekorda. Kupio sam puzzle od 1 do 3 godine, a rijesio ih za 6 mjeseci!",
                "Kaže Mujo Fati:\n" +
                        "-Hajde da sebi priuštimo jedan lijep vikend.\n" +
                        "Fata:\n" +
                        "-Hajde, može, super ti je ta ideja.\n" +
                        "Mujo:\n" +
                        "-Ništa onda, vidimo se u ponedjeljak.",
                "Mujo utrči u apoteku, a unutra ogroman red:\n" +
                        "- Molim vas, pustite me preko reda, hitno mi je, devojka mi tamo leži!\n" +
                        "Svi se razmaknu kad su to čuli i puste Muju do apotekara koji ga upita:\n" +
                        "- Recite, šta Vam treba?\n" +
                        "- Brzo jedno kutiju kondoma, požurite!",
                "Kaze Mujo Fati:\n" +
                        "-'Kako me izjebo ovaj Bayern Minhen na kladionici.\n" +
                        "Kaze Fata:\n" +
                        "- I mene je Milan.Pita Mujo:\n" +
                        "-'a gdje ti je listic.\n" +
                        "-'Nije mi ga ostavio uzvraca Fata.",
                "Pita Mujica svog oca Muju:\n" +
                        "- Tata, kako se Zemlja okreće?\n" +
                        "Posle dužeg razmišljanja Mujo kaže:\n" +
                        "- Kako to, bolan, misliš da se Zemlja okreće? Slušaj mali, da ti to nisi našao moju rakiju?",
                "Vozili se Mujo i Haso na biciklu, kad odjednom kaže Haso Muji:\n" +
                        "-Mujo tandrče ti Blatobran!\n" +
                        "-Šta?\n" +
                        "-rekoh tandrče ti blatobran!\n" +
                        "-Ama ne čujem te ništa tandrče mi Blatobran!!!",
                "Dosao Mujo u firmu u kojoj se nedavno zaposlio te mu sef rece:\n" +
                        "- Prvo pravilo kod nas je da obrisete noge na otiracu pred ulazom. Da li ste to uradili?\n" +
                        "A Mujo ce:\n" +
                        "- Da, uradio sam.\n" +
                        "A sef ce na to:\n" +
                        "- Drugo pravilo kod nas je da govorite istinu. Pred ulazom nema otiraca za noge!",
                "Prica Mujo Hasi: \n" +
                        "- Jarane, znas meni je zivotni san da radim u seks šopu? - Sto bolan ? \n" +
                        "- Pa kada uđe mušterija, mogu sasvim 'ladno da je pitam: \" Koji vam kurac treba \" ?",
                "Pita Haso Muju:\n" +
                        "-Mujo,sto ti zmuris kad pijes pivo?\n" +
                        "Mujo odgovara:\n" +
                        "-Pa doktor mi je rekao da pice ne smijem ni da pogledam.",
                "Mujo i Suljo bili u kafani, Suljo pita konobara:\n" +
                        "- Imaš li pivo?\n" +
                        "- Imam.\n" +
                        "- Koje?\n" +
                        "- Svijetlo, tamno.\n" +
                        "- Pa je li ti hladno?\n" +
                        "- Jeste.\n" +
                        "A Mujo će na to:\n" +
                        "- Hajde obuci se i donesi nama dvije votke!",
                "Rodila Fata jedanaesto muško dete:\n" +
                        "- Kako mu je ime?\n" +
                        "- Mujo!\n" +
                        "- A ostalima?\n" +
                        "- Mujo!\n" +
                        "- Pa baš svi Mujo?\n" +
                        "- Svi!\n" +
                        "- A kako ih razlikuješ?\n" +
                        "- Po prezimenu!",
                "Pita Mujo Hasu:\n" +
                        "- Što bi Haso napravio kada bi tvoju ženu u šumi napao medvjed?\n" +
                        "Kaže Haso:\n" +
                        "- Ja se nebi miješao, baš me briga, sam je napao, sam neka se i brani!",
                "Pita Mujo Fatu:\n" +
                        "• Kako se ti ne iznerviraš kad se izderem na tebe?\n" +
                        "Fata će smireno:\n" +
                        "• Pa lepo, odem da očistim WC.\n" +
                        "• A kako ti to pomaže?\n" +
                        "• Koristim tvoju četkicu za zube!",
                "Sedili Mujo i Haso u kafiću 10.3 u 22_30h.\n" +
                        "Pita Haso Muju:\n" +
                        "-Jel' bolan Mujo,šta s' ti uz'o Fati za 8.mart?\n" +
                        "-pare!\n" +
                        "-Pare?!?Uuuuu,prava je srećnica.\n" +
                        "-Ma jeste srećnica,znala je da ću joj uzeti pare pa je u novčanik stavila 100 dinara,ali ja sam i to uzeo!",
                "KONOBAR: Bitte ?\n" +
                        "MUJO: Šniclenzi, cvaj pivenzi, majne jednu\n" +
                        "salatenzi...\n" +
                        "-Ode konobar i donese sve što je Mujo tražio...\n" +
                        "- Jesil vidio Suljo što ti je reći kad čovjek zna pričat Njemački?\n" +
                        "Na to će konobar: \n" +
                        "- Pojeo bi ti govnenzi, da ja nisam iz Bosne.",
                "Sjede Mujo i Haso na klupici.\n" +
                        "-Vidi Mujo,50 eura na cesti!\n" +
                        "Ustane se Haso i podere 50 eura.\n" +
                        "-Bolan Haso,jes' ti normalan?!?Poderao si 50 eura!!!Zašto?\n" +
                        "-Ma bona,đes' ti video 50 eura sa 2 nule!?!",
                "Rad sajta je omogućila\n" +
                        "prodavnica smešnih poklona Hoću To\n" +
                        "Bosanci (166)\n" +
                        "Ciganski vicevi (276)\n" +
                        "Crni humor (256)\n" +
                        "Crnogorci (138)\n" +
                        "Gej vicevi (60)\n" +
                        "Kompjuterski vicevi (36)\n" +
                        "Lekarski vicevi (62)\n" +
                        "Mali Perica (395)\n" +
                        "Mujo i Haso (552)\n" +
                        "Narodi vicevi (114)\n" +
                        "Pandurski vicevi (119)\n" +
                        "Piroćanci (96)\n" +
                        "Politički vicevi (71)\n" +
                        "Razno (1127)\n" +
                        "Seksi vicevi (289)\n" +
                        "Sportski vicevi (40)\n" +
                        "Šumski vicevi (109)\n" +
                        "Verski vicevi (63)\n" +
                        "Vicevi o plavušama (329)\n" +
                        "Zlatna ribica (32)\n" +
                        "Mujo i Haso\n" +
                        "\n" +
                        "Dolazi mujo u apoteku i trazi kondom apotekat mu kaze:\n" +
                        "- imamo žute,crne,miki maus,...\n" +
                        "- dajte mi crni..\n" +
                        "Tokom seksa kondom pukne. Kad se rodilo dete bilo je crno i sa 5 god. pita oca:\n" +
                        "- tata zašto sam ja crn?\n" +
                        "- bolje da si crn nego da si miki maus!\n" +
                        "Vic posla(o/la): Bojan, 01. 07. 2013\n" +
                        "Mujo i Haso  31  \n" +
                        "Dobili mujo i fata mačku pa je se tijeli rješit odvede nju mujo u šumu i vrti se kući kad mačka kod kuće odvede mujo nju još više u šumu te se vrati kad ono oped mačka ,sjedne mujo u auto i odveze se50km i ode u neku vellllliku šumu i nakon nekog vremena zove on fatu i pita:\n" +
                        "- jel se mačka vratila? \n" +
                        "- jest, \n" +
                        "- de dajmi je na telefon da mi kaže put\n" +
                        "Vic posla(o/la): Bazuka, 21. 06. 2013\n" +
                        "Mujo i Haso  52  \n" +
                        "Idu Mujo i Haso u pustinju.\n" +
                        "Haso ponio svega : hranu, piće, odjeću, tene ma svega a Mujo ponio vrata od auta.\n" +
                        "Pita Haso - Mujo sto si ti ponio vrata od auta.\n" +
                        "Kaže Mujo - Kad nam bude vruće da otvorimo prozor.\n" +
                        "Vic posla(o/la): Suka, 14. 06. 2013\n" +
                        "Mujo i Haso  35  \n" +
                        "Ide Haso ulicom i nosi makaze.Sretne ga Mujo i pita:\n" +
                        "-ŠTA ĆE TI MAKAZE?\n" +
                        "-JAVILI MI IZ HITNE DA MI TAŠTI VISI ŽIVOT O KONCU!\n" +
                        "Vic posla(o/la): Sale bp, 12. 06. 2013\n" +
                        "Mujo i Haso  26  \n" +
                        "Bili Mujo i Haso u nekom hotelu i preko noći ih izujedaju komarci.Žale se oni na recepciji, a oni ih pitaju jesu li ostavili svetlo.\n" +
                        "-Jesmo, bolan.\n" +
                        "-Ma morate ugasiti svetlo.\n" +
                        "Zato drugu noć oni ugase svetlo,kad u sobu ulete svici\n" +
                        "Poviče Mujo:\n" +
                        "-BEŽ'MO,EVO IH SA BATERIJAMA!\n" +
                        "Vic posla(o/la): Sale bp, 12. 06. 2013\n" +
                        "Mujo i Haso  50  \n" +
                        "Sjede Mujo i Haso na klupici.\n" +
                        "-Vidi Mujo,50 eura na cesti!\n" +
                        "Ustane se Haso i podere 50 eura.\n" +
                        "-Bolan Haso,jes' ti normalan?!?Poderao si 50 eura!!!Zašto?\n" +
                        "-Ma bona,đes' ti video 50 eura sa 2 nule!?!\n" +
                        "Vic posla(o/la): Đana, 11. 06. 2013\n" +
                        "Mujo i Haso  25  \n" +
                        "Dosli Mujo i Haso na pijacu.\n" +
                        "Mujo kaze prodavcu:\n" +
                        "-Dacete mi 7 para gaca!\n" +
                        "A Haso pita Muju:\n" +
                        "-Sta ce ti 7 pari gaca?\n" +
                        "A Mujo ce:\n" +
                        "-Pa za ponedeljak, utorak, sredu, crtvrtak, petak, subotu i nedelju!\n" +
                        "A Haho posle kaze prodavcu:\n" +
                        "-Dacete mi 12 para gaca!\n" +
                        "A Mujo pita:\n" +
                        "-Sta ceti 12 gaca?\n" +
                        "-Pa za januar, februar, mart...",
                "Haso: \" Mujo, si bil kdaj mornar?\"\n" +
                        "\"Seveda sem bil!\" ponosno odvrne Mujo.\n" +
                        "\"Ali si bil kdaj v Avstraliji?\"\n" +
                        "\"Seveda!\"\n" +
                        "\"Pa si videl kenguruja?\"\n" +
                        "\"Seveda sem ga videl!\"\n" +
                        "\"Kako pa izgleda?\"\n" +
                        "\"Ja, riba kot riba pač!\"",
                "Mujo prečka progo. Ker ni bil pazljiv, ga je zbil vlak.\n" +
                        "Ko čez dobro leto pride iz bolnišnice, gre po sina v vrtec in vidi majhen vlakec na baterije.\n" +
                        "Skoči do vlakca in začne panično skakati po njem. Vzgojiteljica ga komaj pomiri in ga vpraša, zakaj je to naredil?\n" +
                        "\"Te barabe je treba pokončat', dokler so še majhni!\"",
                "Fata se z opico sprehaja po Sarajevu.\n" +
                        "Sreča jo prijateljica in jo vpraša: \"Kaj pa imaš to?\"\n" +
                        "\"To je vse, kar je ostalo od modrih čelad!\"\n" +
                        "\"Madona, ženska, zakaj pa nisi naredila splava?\"",
                "Fata se s prijateljico pogovarja o kontracepciji. \n" +
                        "\"Jaz ne uporabljam nikakršne zaščite,\" reče prijateljica.\n" +
                        "\"Jaz pa,\" odvrne Fata. \"Moj Mujo je za dobro glavo nižji od mene. Takrat, ko se ljubiva, stopi na pručko in preden mu začne prihajati, jaz enostavno brcnem pručko stran!\"",
                "Mujo pride na obisk z obema obvezanima uhljema.\n" +
                        "\"Kaj pa je s teboj?\" ga vpraša Haso.\n" +
                        "\"Ma, likal sem svojo srajco, pa je zazvonil telefon!\"\n" +
                        "\"No, ja, se dogaja. Kaj se je pa zgodilo z drugim?\"\n" +
                        "\"Takoj sem poklical urgenco!\"",
                "Mujo piše svoji materi pismo iz Nemčije: \"Mama, v Nemčiji je krasno. Delam in uživam. V službi delamo s polavtomatskimi aparati. Ko ga dvigneš, sam pade. Reče se mu kramp.\"",
                "Fata se s prijateljico pogovarja o kontracepciji. \n" +
                        "\"Jaz ne uporabljam nikakršne zaščite,\" reče prijateljica.\n" +
                        "\"Jaz pa,\" odvrne Fata. \"Moj Mujo je za dobro glavo nižji od mene. Takrat, ko se ljubiva, stopi na pručko in preden mu začne prihajati, jaz enostavno brcnem pručko stran!\"",
                "Mujo rešuje križanko in vpraša Hasa: \"Haso, povej mi besedo, ki se začne na R in konča na na R.\"\n" +
                        "Haso malo pomisli, naposled pa izstreli: \"Krava!\"\n" +
                        "\"Kakšna krava? Od kod krava?\" \n" +
                        "\"Lepo. Krava se začne z R-ogovi in konča z R-epom.\"",
                "Tarzan se je začasno naselil v Bosni in srečal Muja in Hasa.\n" +
                        "\"Kdo si pa ti?\" ga vprašata.\n" +
                        "\"Tarzan. \"\n" +
                        "\"Kaj pa počneš tu?\"\n" +
                        "\"Na obisku sem.\"\n" +
                        "\"Kaj pa sicer počneš?\"\n" +
                        "\"Nič.\"\n" +
                        "\"A ničesar ne znaš?\"\n" +
                        "\"No, ja, znam se pogovarjat z živalmi.\"\n" +
                        "\"A res?\"\n" +
                        "\"Potem mi pa povej, kaj je ravnokar zahrzal tisti konj?\" reče Mujo in pokaže na konja.\n" +
                        "\"Rekel je, da sta ga zjutraj pozabila nahraniti.\"\n" +
                        "\"Zanimivo, vendar to lahko ugotovi vsak,\"\n" +
                        "rečeta Mujo in Haso. \"Kaj pa pravi tisti pes?\"\n" +
                        "\"Pravi, da sta mu zjutraj nasula piva v vodo.\"\n" +
                        "\"Pa se znaš res pogovarjat z živalmi!\" ugotovi Mujo.\n" +
                        "\"Seveda, lahko ti tudi povem, kaj je ravnokar rekla tista ovca!\"\n" +
                        "Mujo pa steče do ovce, ji zapre gobec in reče: \"Laže! Laže! Nisem bil jaz!\"",
                "Mujo pokliče v Sarajevo in vpraša Hasa: \"Kako je v Sarajevu?\"\n" +
                        "\"Bomba, stari. Ti pravim, bomba!\"",
                "Kako so med vojno preimenovali Sarajevo?\n" +
                        "V Lotograd. Vsaka hiša ima možnost zadetka.",
                "Kupuje mujo burek\n" +
                        "\"hocete li u papir?\"\n" +
                        "\"Jok,prebaci mi ga na USB.\"",
                "Zaglavili se Švabo i Mujo u liftu. Švabu uhvatila panika pa lupa nogama i rukama po vratima. Veli Mujo : \"De malo u stranu\",.. i bum glavom u vrata,i vrata se otvorila!\"\n" +
                        "Kaže Mujo Svabi: \"Nix snaga, mozak !!!\"",
                "Mujo in Haso kupita psa ptičarja in se odpravita na lov. Ves dan lovita ptice, vendar brez uspeha. Zvečer, ko se vrneta domov, Haso na smrt utrujen reče: \"Mujo, nategnili so naju. Ali tale pes ni ptičar, ali pa ga ne mečeva dovolj visoko!\"",
                "Došao Bosanac na odmor u Egipat. I pliva on Nilom kad odjednom pred njega skoči krokodil. Kaže Bosanac : \"Nemoj Lacosta, majke ti.\"",
                "Kupi Mujo viagro in gre takoj k svoji ženi Fati.\n" +
                        "Popije viagro, takoj se mu dvigne in ta čas, ko se je Fata slačila mu zopet pade.\n" +
                        "Fata ga vprašljivo pogleda: \"A šta je sad to ?\"\n" +
                        "Mujo : \"Bez veze Fato, jebiga, prepoznao te !!!\"",
                "Došao Mujo na stanicu i traži: \"Daj mi povratnu kartu.\"\n" +
                        "\"Dokle?\"\n" +
                        "\"Pa dovde, šta ti misliš!\"",
                "Mujo veli Hasi: \"ima u Frankfurtu jedan restoran, jedeš i piješ besplatno, a za seks još dobiješ 100 maraka.\"\n" +
                        "\"Ma, ko ti je to rekao?\"\n" +
                        "\"Moja Fata.\"",
                "Nagovara Mujo Fatu da se obrije \"dole\". \n" +
                        "\"Ih, budale! Pa da mi se cijelo selo smije!\"\n" +
                        "\n",
                "Po vojni na Kosovu je rekel Haso Muji:\n" +
                        "\"Zdaj, ko so pregnali Srbe iz Kosova je verjetno na Kosovu veliko praznih stanovanj. Pojdi in poišči kakšnega še za naju!\"\n" +
                        "Mujo je odpotoval na Kosovo, toda kmalu se je vrnil.\n" +
                        "\"Si našel kakšno stanovanje?\" je vprašal Haso.\n" +
                        "\"Našel sem samo eno garsonjero, toda ta se vedno premika gor in dol!",
                "Odluci Mujo, da ide radit u Sloveniju u Maribor, pa se vrati za dva dana. \n" +
                        "Pa ga pita Fata: \"Zasto si vec dosao kuci ? Nisi ni poceo raditi ?\"\n" +
                        "Pa gdje da ti radim, kada mi več na avtobusu napisu: \"MARIBOR RUŠE !!\"",
                "Vprasa Haso Mujota: \"Jesi li ti bolan, vec citao Anu Kareninu?\" \n" +
                        "Mujo pa pravi: \"Ma sto cito, jebo!\" ",
                "V stari Jugi sta Mujo in Haso zivela v istem bloku: Mujo v prvem nadstropju, Haso pa v desetem. \n" +
                        "Vsak dan sta ze navsezgodaj klicala drug drugega kar z balkona: \"Hejjjjj Mujoooooooo!\" \"D'jutrooo Hasoooo!\" \"Ajd, dodiiiiii na kafuuu!\" itd. preko celega dneva. \n" +
                        "Sostanovalcem je prekipelo, zato so se dogovorili, da jima kupijo telefone. Prvi telefonski poziv Mujota Hasi: \"Halooooooo, jesi'l ti Hasoooooo!\" \n" +
                        "Haso: \"Pa etooo jesam jesam!\" \n" +
                        "Mujo: \"Pa sto onda cekas, aj'd dodji na balkon, da ti nesto kazem!\" ",
                "Mujo sedi na pomladanskem soncu in kadi. Pride prijatelj Haso, prisede ter ga vprasa: \"Sjedip I razmisljas, jel ?\" \n" +
                        "Mujo nekaj casa molci, nato pa odgovori: \"Jok! Samo sjedim.\" ",
                "Mujo sreca Hasota in ga vprasa: \"Kako si, bolan, Haso?\" \n" +
                        "\"Pa, danas prilicno luksuzno,\" mu odvrne Haso. \n" +
                        "\"A kako to mislis - luksuzno?\" \n" +
                        "\"Pa, upravo sam uzeo luk in nasjeckao ga i odmah mi navrle suze na oci!\" ",
                "Mujo je bil pastir, ki je cuval ovce... \n" +
                        "Tako gre enkrat s svojo credo preko ceste, ko mu povozi Haso (ki je delal v Nemciji) dve ovci. \n" +
                        "Mujo: \"Jaooooooooo...Vidi sta mi uradice!!\" \n" +
                        "Haso: \"Ma ne brini Mujo. Platit cu ti ja! Evo ti marke.\" \n" +
                        "Mujo: \"Sta? Marke?! Sta ti je to? Nemoj ti meni tako...Necu ja nikom da picem! Ne trebam ja markice!\" \n" +
                        "Haso: \"Ma ne Mujo! To ti je novac - iz Njemacke!\" \n" +
                        "Mujo: \"Ma necu marke - kome cu ja da picem?!\" \n" +
                        "Haso: \" E Mujo - ti si stvarno zaostao...\" \n" +
                        "Mujo: \"Jesam, jesam - inace bi i mene zgazio!\" ",
                "Pride Haso k Mujotu na obisk in trka na vrata. \n" +
                        "\"Nema nas,\" se slisi izza vrat. \n" +
                        "\"Kako nema, ima puno cipela ovdje vani,\" se cudi Haso. \n" +
                        "\"Mi otisli bosi!\" ",
                "Haso povabi Mujota na vecerjo. Mujo pride do Hasota in zagleda na vratih listek: \n" +
                        "\"Ha, ha, ha, Mujo, sploh me ni doma!\" \n" +
                        "Mujo se odloci, da mu bo to vrnil, zato pripise na listek: \n" +
                        "\"Ha, ha, ha, Haso, sploh nisem bil tukaj!!\" ",
                "Mujo in Haso sta sla v hotel. Mujo je takoj zaspal, Haso pa ni mogel. Ko se mu je koncno zacelo dremati, pa je Mujo zacel strasansko prdeti. Pa je sel Haso malo okoli in nasel dolgo gumijasto vrtno cev. Vzel jo je in jo en konec zataknil Mujotu v zadnjico, drugega pa vrgel skozi okno. Ko se je drugi dan zbudil, je sel malo naokoli in srecal Mujota. Ta je bil ves zelen, komaj se je se vlekel... \n" +
                        "Haso: \"Kaj je s tabo?\" \n" +
                        "Mujo: \"Vceraj sem med spanjem toliko prdel, da so mi creva ven pogledala. Komaj sem jih dobil nazaj noter!\" ",
                "Isao Mujo polagati vozacki ispit po peti put. Vraca se on kuci nakon ispita i pita ga Fata: \"Kako je bilo?\" \n" +
                        "Mujo: \"Ma pusti me bona, opet sam pao!! Je*o me u krivini, je*o me u pravcu, je*o me na semaforu !!!\" \n" +
                        "Veli Fata: \"Mene samo je*o u garazi, i ja polozila iz prve!\" \n",
                "Mujo v Ameriki zagleda avtomat za Coca-Colo. Vrze prvi kovanec in dobi Coca-Colo, vrze drugega, spet dobi Coca-Colo, vrze tretjega....in za njim se nabere vrsta. Eden iz vrste pride do njega: \"A nimate ze dosti!? Mi smo tudi zejni!\" \n" +
                        "Mujo mu odgovori: \"Dok Mujo dobiva, Mujo igra.\" ",
                "Dosao je Mujo u Sloveniu nakon 20 godina kod svoga starog poslodavaca Janeza... \n" +
                        "I upita ga: \"Eeeh Janeze, kako su ti tvoja zena i moja djeca...?\" "


        };

        private static String[] besedneIgre = {

                "Mujo sreca Hasota in ga vprasa: \"Kako si, bolan, Haso?\" \n" +
                        "\"Pa, danas prilicno luksuzno,\" mu odvrne Haso. \n" +
                        "\"A kako to mislis - luksuzno?\" \n" +
                        "\"Pa, upravo sam uzeo luk in nasjeckao ga i odmah mi navrle suze na oci!\" "

        };

        private static String[] yugovici = {

                "Vegetarijanac stara indijanska riječ za \"\"Loš lovac\"\".",
                "Svecenik u seoskoj crkvi drži propovijed: \"Što se to dogada s vama, ljudi moji!? Idem neki dan cestom, kad u grmlju spazim nju i njega, malo dalje opazim nju i nju, a još malo dalje njega i njega! Pa što je to, ljudi moji!?\"\n" +
                        "Štef šapne susjedu: \"Da je išel još malo dalje, srel bi - MENE I MENE!\"",
                "Sta je najbolje u tome kada ti daje oralni seks?\n" +
                        "Onih 10 min cutanja!!!!\n" +
                        "\n",
                "Zašto Škoti nose suknje?\n" +
                        "Zato što ovce čuju rajferšlus na kilometar",
                "Stara židovska poslovica, Bolje da nam RUSI zatvore PLIN, nego da nam ga Nijemci puste.",
                "Izlazi žena iz salona za uljepšavanje i čeka je muž.\n" +
                        "Kad ju je vidio kaže \"Jebiga barem si probala\"\n" +
                        "\n",
                "Bosanac, Hercegovac i Crnogorac došli na kolodvor malo ranije, pa skoknuli \"na po jednu\".\n" +
                        "Međutim, malo se zarakijali, pa skoro zakasnili.\n" +
                        "Kad su istrčali na peron vlak već krenuo.\n" +
                        "Njih trojica potrče za vlakom . . . i kao u svakom vicu - Crnogorac odustane prvi.\n" +
                        "Hercegovac trči još malo, pa i on stane.\n" +
                        "Ali Bosanac se zainatio, trči sve jače i brže, pruži ruku, dohvati štangu, stisne, poskoči, prekobaci se i uleti u vlak . . .\n" +
                        "Ova prva dvojica zadihani i u čudu gledaju prizor, pa Crnogorac reče: \"Viđe budale, a samo je doš\"o da nas isprati!\"",
                "Razgovaraju dva prijatelja u kafani u kasne sate. \n" +
                        "\"E mogu ti reci da od moje žene nema ružnijeg stvorenja na svetu!\"\n" +
                        "\"Ne verujem, jer kada bi se uporedila sa mojom, ko zna kakav bi rezultat ispao?\"\n" +
                        "\"E, ajmo kod mene pa da se sam uveriš na licu mesta!\"\n" +
                        "I odu oni kod tog prijatelja koji, dok još nisu ni prešli prag, doziva svoju ženu: \"Mila… možeš li da dođes na trenutak?\"\n" +
                        "\"Jel da stavim kesu na glavu?\"\n" +
                        "\"Ma jok, neću da te jebem, nego samo da te pokažem!\"",
                "Zašto je Bog stvorio tsunami?\n" +
                        "\"Pa da i siromašni vide more.\"",
                "Kako razlikuješ Japanca od Kineza ?\n" +
                        "\"Gajgerovim brojacem.\"",
                "Dođe baba u trgovinu i traži maslinovo ulje i pita koliko košta.\n" +
                        "Prodavačica: \"80 kuna litra.\"\n" +
                        "Baba: \"A to vam je stvarno preskupo.\"\n" +
                        "Prodavačica: \"Ali gospođo, to vam je djevičansko maslinovo ulje.\"\n" +
                        "Baba:\" A da nemate možda neko izjebano za 40 kuna ?\"",
                "Šta kažu vozači Yuga suvozačima koji uđu u auto?\n" +
                        "\"Moraš malo jače!\"",
                "Šetaju se moždani i srčani udar ulicom i razgovaraju. Kaže moždani udar: \"Gledaj sad onog starog!\". Moždani udar pucne prstima i starac padne mrtav.\n" +
                        "Tada kaže srčani udar: \"A gledaj onu ženu!\", pucne prstima i žena padne dolje mrtva. \n" +
                        "Tako se oni prepucavali sve dok jedanput nije došao na red moždani udar: \"Gledaj sad ti ovu plavušu!\", pucne prstima, a ono ništa. Pucne drugi put, a ono ništa, pucne treći put, a ono ništa... Pucne sto trideset treći put, a ono ništa.",
                "Ja sam sve svoje probleme sa ženama riješio!\n" +
                        "Sir Elton John",
                "Sta je to menstruacija?\n" +
                        "To je kad zena legne na bijelu posteljinu, a probudi se na zastavi Japana",
                "Postoji život i van interneta.”\n" +
                        "”Stvarno? Daj mi link!?",
                "Tinejdžeri prave žurku i vrše potrebne nabavke. \n" +
                        "\"Dobar dan. Daćete mi gajbu piva, tri litre pelinkovca.\"\n" +
                        "\"Dečko, je l ti imaš 18?\"\n" +
                        "\"A je l imate vi lenjir da izmjerite?\"",
                "Razgovaraju dve bakterije: \"Šta je bilo, što si tako tužna?\"\n" +
                        "\"Ma pusti... Izgleda da sam zakačila neki atibiotik\"",
                "Ulazi momak u apoteku i pita radnicu: \"Imate li mozda kondome s ukusom maline?\"\n" +
                        "\"Nemamo.\"\n" +
                        "\"a sa ukusom jagode?\"\n" +
                        "\"Nemamo.\"\n" +
                        "\"A sa ukusom jabuke?\"\n" +
                        "\"Nemamo ni to.\" gleda ga djedo sa strane i dobaci mu: \"Ho'š se ti jebati il' praviti kompot.\"",
                "KAKO JE BILO PRIJE RATA ???\n" +
                        "Židovi su trgovali\n" +
                        "Cigani su krali\n" +
                        "Komunisti se borili\n" +
                        "KAKO JE POSLIJE RATA ?\n" +
                        "Židovi se bore\n" +
                        "Cigani trguju\n" +
                        "Komunisti kradu !!",
                "Došao Beograđanin kod babe u selo u posjetu i baba ga upita: \"Jel' može jedna kafa?\"\n" +
                        "Beograđanin: \"Ma nema frke, skuvaćeš kasnije.\"\n" +
                        "Poslije nekoliko minuta, ona ga opet upita: \"Da pristavim kafu?\"\n" +
                        "\"Ma nema frke, skuvaćeš kasnije.\"\n" +
                        "Baba poslije nekoliko minuta ga opet upita: \"Može li sad kafa?\"\n" +
                        "\"Ma nema frke, skuvaćeš kasnije.\"\n" +
                        "A ona mu reče: \"Ma ja će skuvam za nas dvoje a Frke kad dođe.\"",
                "Ulazeci u zeludac, Vinjak se izvinjava sarmi: \"Izvini Sarmo, moram da legnem preko tebe, bas smo nazdravili Savi\"\n" +
                        "\"Nista, nista. - odgovara Sarma.\"\n" +
                        "Posle par minuta, dolazi novi Vinjak te poce i on da se izvinjava jer su opet nazdravili Savi. Posle pet šest ovakvih zdravica, i Sarma postade radoznala, te reče: \"Ma, moram da odem gore da vidim tog Savu. \"",
                "Tek oženjeni muškarac unosi u mobilni naziv broja svoje žene kao \"moj život\".\n" +
                        "Poslije jedne godine mjenja ga u \"moja žena\".\n" +
                        "Poslije dvije godine naziv je \"Kućni\".\n" +
                        "Poslije 5 godina \"vještica\".\n" +
                        "Poslije 10 godina \"pogrešan broj\".",
                "Mlada Amerikanka u turističkom obilasku Pariza, vidi pred jednom javnom kućom veliki red žena. Priđe željna uzbuđenja i doživljaja, te upita jednu mladu ženu što se tu čeka.\n" +
                        "\"Vrhunski seks sa Jean-Pierom.\"\n" +
                        "\"Pa što to Jean-Pier radi posebno, da toliko žena čeka u redu.\"\n" +
                        "\"Oh, on je fenomenalan, liže pupak.\"\n" +
                        "\"I zbog lizanja pupka tolike žene stoje u red? Pa u čemu je atrakcija, to se može sa svakim doživjeti i bez da se plati.\"\n" +
                        "\"Da, da, ali on liže pupak sa unutarnje strane\"",
                "Biznismen, koji baš nije mnogo brinuo o svojim radnicima, odluči da pred Novu godinu malo proslavi praznike. Pozvao je svog finansijskog stručnjaka i rekao mu: \"Hoću da to bude lijepo, na nivou, da ne košta mnogo, da bude upadljivo i da se svi radnici provesele.\"\n" +
                        "\"Gazda, onda je najbolje da se objesite - savjetuje ga finansijski. To neće mnogo koštati, biće na visini i upadljivo, a radnici će se sigurno proveseliti.\"",
                "Nova srpska konjugacija: JA ćutim TI ćutiš ON ćuti MI ćutimo VI ćutite ONI nas jebu",
                "Jabuke donose vitamine, vitamini donose snagu, snaga donosi slavu, slava donosi novac, novac donosi žene, žene donose seks, seks donosi polne bolesti, polne bolesti donose smrt... pa ti jedi jabuke!!!",
                "Došao Crnogorac u Beograd i otvorio firmu.Firma tek renovirana.Ulazi sekretarica i kaže Crnogorcu:\n" +
                        "-Traži vas jedan čovjek\n" +
                        "-Dobro,uvedi ga.\n" +
                        "Uđe on.Uze Crnogorac telefon i poče da se pravi da priča.\n" +
                        "-Eee, Milo kume. Kako su ti đeca? Kako ti ide posao? A moraću doći jedan dan na kafu.Ajde vidimo se junačino.\n" +
                        "Čovjek krenu da mu objasni zašto je došao kad ovaj ''zovnu'' Lukšića.\n" +
                        "-Ma kako si mi? Pa moram doći jednom.Baš sam sada pričao sa Milom.Ajde vidimo se junačino.\n" +
                        "-A zašto ste vi došli?\n" +
                        "A njemu čovjek odgovori:\n" +
                        "-Došao sam da vam priključim telefon.",
                "Crnogorka i crnogorac strastveno vode ljubav iza plasta sena na 38 stepeni. Crnogorac se trudi, lije znoj sa njega, a crnogorka će:\n" +
                        "- Au jado al si se umorio, da nema nekog da te malo odmeni?!",
                "Koji saobracajni znak ne postoji u Crnoj gori?\n" +
                        "-Znak za radove na putu.",
                "Koja je slicnost izmedju crnogorca i magle:\n" +
                        "- Oboje se dizu negde oko podneva",
                "U takmicenju bacanja cekica udalj pobjedi Crnogorac.Sta mislite zasto?Pa alat sto dalje od njega.",
                "Doša Crnogorac u Englesku i kaže konobaru:\n" +
                        "- Ej ti ! \n" +
                        "- On mu donese osam čajeva.",
                "Sjedi Crnogorac sa svojim drugom na stadion i gleda trku na 100 metara gdje učestvuje njegov unuk. Veli Crnogorac:\n" +
                        "- Viđe onu budalu što se vuče iza ostalih!\n" +
                        "Drug:\n" +
                        "- To je tvoj unuk!\n" +
                        "Crnogorac:\n" +
                        "- A, viđe sokola što ih poćera sve ispred sebe!",
                "Izmislili Amerikanci neki prepametan kompjuter, zna odgovore na sva pitanja. Da bi proverili da li je to istina dodju Rus, Kinez i Bosanac. \n" +
                        "Prvi ulazi Rus. Nakon 2 minuta izlazi on sa hrpom papira. Pitaju Kinez i Bosanac \n" +
                        "- ,,Sta si ga pit'o\" a ovaj odgovara \n" +
                        "- ,,Pit'o ga 60 pitanja i na sve zna odgovor\". \n" +
                        "Sledeci je Kinez. On se vrati nakon 3 minuta, pros'o isto k'o Rus. Red je na Bosanca. \n" +
                        "Udje on, nema ga 3-4 sata. Nakon tih 3-4 sata izlazi on,a kompjuter se oce raspadne i soba je puna papira. Kinez i Rus gledaju u cudu i pitaju ga \n" +
                        "-,,Sta si ga ti pit'o\"? A Bosanac kaze \n" +
                        "-,, Ja us'o i rek'o djes jarane, sta ima, i otad izbacuje papire.",
                "Vojnik pritrči časnoj sestri. Zadihan zamoli: \n" +
                        "- \"Molim Vas mogu li se sakriti pod Vašu haljinu? Poslije ću objasniti...\" \n" +
                        "Časna pristane. Na to nalete dva vojna policajca i upitaju je da li je vidjela nekog vojnika kako bježi? \n" +
                        "- \"Otišao je u onom smjeru.\" i pokaže u drugom smjeru. \n" +
                        "Kad su policajci otišli, vojnik se izvuče ispod suknje, zahvali joj se i objasni da neće u Irak, na front. \n" +
                        "Časna mu odgovori da ga razumije. Vojnik doda: \n" +
                        "- \"Nadam se, da neću biti previše drzak, ako kažem da sam opazio da imate prelijepe noge\". \n" +
                        "Časna odgovori: \n" +
                        "- \"Da si pogledao malo više, opazio bi i krasan par jaja, ni ja ne želim ići u Irak !\"",
                "Bili Mujo i Haso u vojsci. Ratuju ti oni i Hasu rane u nogu. Plače Haso i derajući se zove bolničare, a Muji dopizdi i kaže mu: \n" +
                        "- \"De što si p*zda šta plačeš, eno Ekrema pogodio snajper u glavu i opet čovjek šuti\".",
                "Bili Mujo i Haso na ratistu. Prisere se njima pa odu do rijeke da seru. U tom trenutku pocnu padat granate, pita Mujo Hasu: \n" +
                        "- Haso jel te strah \n" +
                        "Haso: - Nije \n" +
                        "Mujo: - Pa sto onda peres moju guzicu, peri svoju.",
                "Pripremali partizani zasjedu svabama i sad cekaju partizani i cekaji oni a svaba nema pa nema. \n" +
                        "I tako blizi se zora, dolazi komadant i pita svoje drugare partizane: \n" +
                        "- \"Pa gdje su ti svabe? Da im se nije sta desilo?\"",
                "II svjetski rat, kapetan govori cigi: \n" +
                        "- Cigo, brani ovu čuku životom ako treba, sve što imamo su 3 bombe i šljem. \n" +
                        "- Auuu gos'n kapetan, bolje ti meni ostavi 3 šljema i jednu bombu. \n" +
                        "- Dobro cigo kako ti kažeš. \n" +
                        "Poslije par dana dolazi kapetan da obiđe cigu, kad nailazi na gomilu njemačkih uniformi, čizama, čarapa, šmajsera, a gomila švapskih vojnika cvokoće bosa i u gaćama. U sredini, sjedi Cigo, pred njim tri šljema: \n" +
                        "- \"Ajmo, braćo Njemci, posljednji pokušaj: pod kojim šljemom je bomba?\"",
                "Sreo bataljon četnika Muju na Trebeviću i pitaju ga: \n" +
                        "- \"Znaš li ti ko smo mi?\". \n" +
                        "A Mujo im odgovara: \n" +
                        "- \"Ako Bog da insallah skrivena kamera\".",
                "Došao novi general na dužnost u tvrđavu Legije stranaca u pustinji. Krenuo već prvi dan u obilazak utvrde. Dok je obilazio ugleda mazgu svezanu za stup. Upita on najbližeg stražara čemu služi ta mazga. \n" +
                        "– Gospodine generale, mazga je za zabavu vojnika! Znate kako je, dugo smo tu bez žena, pa... \n" +
                        "– Pa onda joj sredite malo to mjesto, napravite joj nadstrešnicu i slično!, naredi general i ode dalje. \n" +
                        "Nakon mjesec dana u pustinji ni generalu nije bilo lako, pa što će, kuda će, odluči se i on malo zabaviti s mazgom. Naredi stražaru da je drži, a on obavi posao. Dok se oblačio, olakšan i zadovoljan, upita stražara: \n" +
                        "– Reci mi junače, rade li obični vojnici to ovako kao mi generali? \n" +
                        "– Pa ima razlike, gospodine generale. \n" +
                        "Obični vojnici uglavnom zajašu mazgu i odjašu do obližnjeg sela u kojem ima javna kuća.",
                "U Avganistanu Srbi dobrovoljci uhvate Bin Ladena, pa se premišljaju šta sa njim da urade. \n" +
                        "- Da ga zakoljemo? - predloži jedan. \n" +
                        "- Jok bre, 'ajde da ga streljamo. - predlaže drugi. \n" +
                        "Pošto nisu mogli da se dogovore reše prvo da ga obriju. Kad su ga izbrijali, jedan Srbin dreknu: \n" +
                        "- Pa 'de si Arkane jeb'o te Bog!",
                "U Sarajevu se unproforcu pokvari auto. Kako tuda prolazio Mujo ovaj mu vikne: \n" +
                        "- \"Hej, push maj kar!\" \n" +
                        "A Mujo: \n" +
                        "- \"Ma popusi ti moj.\"",
                "Otisao Mujo u Njemacku. Posalje ti on Fati telegram: \n" +
                        "- \"Fato, iskopaj onaj mitraljez iz vrta, podmazi ga i vrati na isto mjesto.\" \n" +
                        "Vidi to postar i odnese u policiju. Policija dodje i prekopa vrt, ali nigdje mitraljeza. Mujo pošalje Fati drugi telegram u kome pise: \n" +
                        "- \"Fato, ako su policajci prekopali vrt, ti posadi krompir!\"",
                "Otisao Haso u vojsku i vratio se nakon 2 mjeseca u invalidskim kolicima... Pitali ga jarani sta je bilo: \n" +
                        "- \"Jebi ga, vjezbali bacanje bombe i rekli mi da izvadim osigurac, sacekam do deset i bacim. Joj brate kad je oko petnest do deset nesto slozilo...\"",
                "Prica deda unucima kako je bilo u partizanima: \n" +
                        "- \"...i tako stojim ja na strazi i naidju 4 Njemca. Deco ja sam se usro!\" \n" +
                        "- \"A zasto si se deda usro, pa to su bili samo Njemci?\" \n" +
                        "- \"Ma sad sam se usro, a tada sam pobegao!\"",
                "Uhvatili srbi grupu Bosanaca i grupu Crnogoraca i tako vodili su oni njih nekom livadom, kad pita Crnogorac Bosanca: \n" +
                        "- \"Jel jado gdje nas ovo vode?\" \n" +
                        "Bosanac: \n" +
                        "- \"Sta ja znam, valjda da nas strijeljaju.\" \n" +
                        "Crnogorac: \n" +
                        "- \"Dobro je dobro, ja pomislio da radimo nesto.\"",
                "- Zašto mornarica prima više neplivača nego plivača? \n" +
                        "\n" +
                        "- Duže će braniti brod!",
                "Pita učiteljica Pericu šta je to katastrofa. \n" +
                        "Kaže Perica: \n" +
                        "- To je kad lisica pokolje kokoši. \n" +
                        "Učiteljica: \n" +
                        "- Pa, to nije katastrofa, to je šteta. \n" +
                        "Sutra učiteljica pita isto pitanje. \n" +
                        "Perica odgovara: \n" +
                        "- To je kad avion u kojem se nalazi puno političara eksplodira i padne u ocean! \n" +
                        "Učiteljica: \n" +
                        "- Bravo Perice, to je katastrofa. \n" +
                        "Perica: \n" +
                        "- Ali nije šteta.",
                "-Što znači PDV? \n" +
                        "-Pola Daješ Vladi!",
                "Prodaje Tomislav Nikolic traktor i javlja se covek na oglas: \n" +
                        "Dobar dan jel vi prodajete Fergusona? \n" +
                        "T.Nikolic:Da ja prodajem! \n" +
                        "Covek:U kakvom je stanju? \n" +
                        "T.Nikolic:U perfetnom malo radio redovno servisiran kao nov! \n" +
                        "Covek:Pa sto ga onda prodajete? \n" +
                        "T.Nikolic:Prodao sam zemlju!",
                "Došao čovjek u biblioteku i pita bibiotekara: \n" +
                        "-\"Gdje je ovdje knjiga Velika Srbija\"!? \n" +
                        "A njemu bibliotekar odgovara: \n" +
                        "-\"Bajke sa druge strane\"",
                "Pita Obama Putina: \n" +
                        "- \"Šta planirate sad kad je Krim vaš?\" \n" +
                        "Putin odgovara: \n" +
                        "- \"Pa čuj, i Aljaska je pripadala Rusiji...\"",
                "Pricaju politicar i prostitutka i kaze politicar: \n" +
                        "- Zdravo, zovem se Milorad imam 40 godina, politicar sam. Politikom se bavim 15 godina i posten sam covjek. \n" +
                        "- Zdravo, zovem se Ana prostitutka sam i imam 35 godina, bavim se prostitucijom 10 godina i jos uvijek sam nevina.",
                "Dođe Mujo u Mercedesu i parkira ga pred Hrvatski Sabor. \n" +
                        "Dođe k njemu portir i veli: \n" +
                        "- \"Gospodine, ne možete tu parkirati, tu su vam Sanader, Polančec, Kalmeta...\". \n" +
                        "Mujo veli: \n" +
                        "- \"Nema veze imam ja alarm\"",
                "U Sarajevu gužva. Svi automobili stoje. Jednom tipu neko kuca na prozor. Ovaj otvara prozor: \n" +
                        "- \"Druže, šta je ovo bilo? \n" +
                        "- \"Ma, ne pitaj, teroristi oteli cijelo predsjedništvo Bosne i Hercegovine. Traze 10.000.000 EURa, ili će da ih poliju benzinom i zapale, pa skupljamo priloge.\" \n" +
                        "- \"OK, daću, nije problem. A koliko se daje... otprilike?\" \n" +
                        "- \"Pa, tako ... koliko ko moze , litar-dva...\"",
                "Lete dva vampira, otac i sin. Kaže otac sinu: \n" +
                        "- Sine, sada ćemo da uđemo u jednu kuću i da popijemo malo krvi, sutra ćemo u drugu, prekosutra u treću, i tako dalje. \n" +
                        "Sin upita: \n" +
                        "- Pa dobro, ali što ne uletimo samo u jednu kuću i popijemo svu krv odjednom? \n" +
                        "Otac će: \n" +
                        "- Je*ote sine, nemoj da budeš okrutan, mi smo vampri a ne političari...",
                "Uhvate divljaci Bosanca u džungli i ubace ga u kazan da ga skuhaju. Pitaju ga ima li posljednju želju. \n" +
                        "- Nemam ja nikakvih želja, samo me nešto zanima. \n" +
                        "- Šta? \n" +
                        "- Imate li vi SDP i SDA ovdje? \n" +
                        "- Nemamo! \n" +
                        "- Imate li HDZ? \n" +
                        "- Nemamo! \n" +
                        "- Imate li SNSD i SDS? \n" +
                        "- Nemamo! \n" +
                        "- Imate li Radom za boljitak, HSP, SBIH, PDP, SBB? \n" +
                        "- Nemamo! \n" +
                        "- Pa od čega ste podivljali, mamu vam vašu???\n" +
                        "\n",
                "Kosorica pita Milanovića: \n" +
                        "-Znaš ti na šta je na engleskom I don't know? \n" +
                        "-Ne znam. \n" +
                        "-Kvragu, nitko ne zna!",
                "Odu predsjednik i zamjeenik predsjednika u obdaniste i predsjednik kaze: \n" +
                        "- \"Ee u ovaj dio obdanista cemo donirati 5.000 KM\", oni napisu cek i krenuse dalje. \n" +
                        "Dosli oni do zatvora i predsjednik kaze: \n" +
                        "- \"E u ovaj dio cemo donirati 50.000KM.\" \n" +
                        "Haj oni krenuli dalje, kaze njemu kolega pa bolan jesi li ti normalan. U obdaniste si donirao 5.000 a ovdje 50.000? \n" +
                        "A na to ce on njemu: \n" +
                        "- \"Pa budalo sta ti mislis kada se mandat zavrsi, hocemo li mi ici u obdaniste ili u zatvor??\"",
                "- Što je predizborna šutnja? \n" +
                        "- Onaj dan kada političari ne lažu!",
                "Šta je vrhunac krize? \n" +
                        "Kada uđeš u kinesku trgovinu i kažeš: \"Ništa, samo gledam\".",
                "Političari i pelene imaju nešto zajedničko. \n" +
                        "Oboje treba mjenjati što češće iz istog razloga :",
                "Allooo, ovdje Milan, je l’ to Pantovčak? \n" +
                        "- Je, gospodine, što želite? \n" +
                        "- Oću da postanem predsjednik RH, šta mi za to treba? \n" +
                        "- Jesi ti čovječe lud??? \n" +
                        "- Jesam, je l’ treba još nešto?",
                "Parkira čovek auto pored skupštine. Prilazi policajac i opominje ga: \n" +
                        "- Ne možete ovde da parkirate! Znate, to je skupština. \n" +
                        "- Znam, hvala vam. Ali ne brinite, imam ja dobar alarm.",
                "Otišao naš političar kod poslovnog partnera Grka, a ovaj živi u super luksuzu. \n" +
                        "NAŠ POLITIČAR: \n" +
                        "- \"Kako si uspio sve ovo steći?\" \n" +
                        "Grk: \n" +
                        "- \"Vidiš onaj most tamo?\" \n" +
                        "NAŠ POLITIČAR: \n" +
                        "- \"Vidim.\" \n" +
                        "Grk: \n" +
                        "- \"Taj most je trebao biti širok 55m, a napravio sam ga širokog 50m i od para za tih 5m je sve ovo.\" \n" +
                        "Grk sljedeće godine dođe kod našeg političara, a ovaj u triput većem luksuzu od njega. \n" +
                        "Grk: \n" +
                        "- \"Kako si uspio za samo godinu dana steći sve ovo?\" \n" +
                        "NAŠ POLITIČAR: \n" +
                        "- \"Vidiš onaj most tamo?\" \n" +
                        "Grk: \n" +
                        "- \"Ne vidim.\" \n" +
                        "NAŠ POLITIČAR: \n" +
                        "- \"Eeeeee.\"",
                "Presretne čovjek gospodina u odijelu, izvadi pištolj i zaprijeti: \n" +
                        "- Daj mi SVOJE pare! \n" +
                        "- Ali, ... Ja sam ... Političar. \n" +
                        "- Dobro onda, daj mi MOJE pare!",
                "- Kakva je razlika izmedju Srbije i filma? \n" +
                        "\n" +
                        "- Film se razvija.",
                "Ljudi u čitavom svijetu su odgovarali na jedno pitanje: \n" +
                        "- \"Kakvo je vaše osobno mišljenje o nestašici hrane u ostalim dijelovima svijeta?\" \n" +
                        "\n" +
                        "Anketa je završila katastrofalno. \n" +
                        "- U Africi nisu znali što je to hrana. \n" +
                        "- U Zapadnoj Europi nisu znali što je to nestašica. \n" +
                        "- U Istočnoj Europi nisu znali što je to osobno mišljenje. \n" +
                        "- U Americi nisu znali što je to ostatak svijeta.",
                "Sladoled se lize radi slasti, zena radi strasti a dupe radi vlasti.",
                "Imamo vaznu obavijest: \n" +
                        "- \"Jucer je oko podne izgorjela citava Bushova biblioteka... Obje knjige su izgorjele a Bush je jako tuzan jer drugu nije stigao obojiti!\"",
                "Došao fudbaler u crkvu da se ispovedi: \n" +
                        "- Oče zgrešio sam, opsovao sam boga na utakmici. \n" +
                        "Pop: - Dobro sine, dešava se, a kako se to desilo? \n" +
                        "- Pa igrali smo utakmicu, ja sam napadač, i dobijem loptu sam pred golmanom, šutnem i on mi odbrani, odbije loptu u korner. \n" +
                        "- I tada si naravno opsovao? \n" +
                        "- Ma nisam, nego smo izveli korner i ja udarim loptu glavom, ona pogodi prečku i golmana i opet ode u korner. : - Tada si sigurno opsovao? \n" +
                        "- Nisam, opet smo izveli korner, i odbije se lopta do mene, ja prediblam dva igrača, obiđem i golmana, šutnem, kad protivnički igrač rukom odbrani gol... \n" +
                        "- To je to, tad si opsovao? \n" +
                        "- Ne, uzeo sa da šutIram penal. Pop će iznervirano : \n" +
                        "- Nisi valjda i penal promašio jebo te bog!",
                "Dodje lik u teretanu i pita instruktora: - Na koju spravu da idem da bih privukao sto vise zena? - Na bankomat,on je tu ispred...",
                "Igraju BiH i Brazil utakmicu i Ronaldinjo sutira slobodan udarac, a Bosanci u zivom zidu se okrenuli prema golu. \n" +
                        "Golman vice: \n" +
                        "- \"Šta to radite, okrenite se prema lopti\", a Mujo će: \n" +
                        "- \"Ma šuti bolan, hoćemo i mi da vidimo gol\".",
                "Koja je razlika izmedju coca cole i Arsenala \n" +
                        "-Coca cola se puni na u Americi, a Arsenal na Old Traffordu!",
                "Zašto se nikad ne završe utakmice između jamajke i kolumbije? \n" +
                        "Zato što jamajčani popuše svu travu,a kolumbijci pošmrću sve bijele crte.",
                "FIFA 16 je toliko realna, da kada pritisneš tipku za dodavanje, Arjen Robben ne doda loptu!",
                "Pričaju mobilnim telefonima dva Cigana, pa jedan kaže: \n" +
                        "- “Nemoj da pričaš ciganjski, ‘će nam naplate ROMING?!!”",
                "Setaju Amerikanac, Francuz i Albanac sumom i uhvate ih kanibali. \n" +
                        "I daju im da biraju: smrt ili zivot bez ku*ca. \n" +
                        "Uhvate prvo Amerikanca i kazu mu smrt ili zivot bez ku*ca, i Amerikanac odabere zivot bez ku*ca. Nakon pet minuta izlazi Amerikanac drzeci se za krvavo medjunozje. \n" +
                        "Francuz je isao drugi i on je odabrao zivot bez ku*ca, i nakon pola sata urlanja izlazi Francuz drzeci se za krvavo medjunozje. \n" +
                        "Slijedeci na redu Albanac i pita ih: \n" +
                        "- Sto ste Amerikanca zavrsili onako brzo, a Francuza onako dugo. \n" +
                        "- Pa svakome smo odrezali po njegovom zanimanju. Amerikanac je kuvar i njemu smo to brzo isjekli nozem, a Francuz je drvosjeca i njemu dok smo otpilili motornom pilom trebalo je vremena. \n" +
                        "Kaze Albanac: \n" +
                        "- Aha, mog dok izljizes dok se on istopi...ja sam sladoljedzija."

        };

        private static String[] opolzke = {"Mara ne želi seks prije braka, a Štef je nagovara: \n" +
                "\"Daj Mara, nebum do kraja, samo do pola.\" \n" +
                "\"Nemoj Štef, kaj bu selo reklo?\" \n" +
                "\"Daj Mara, samo do pola, dopalo bu ti se, svidelo!\" \n" +
                "\"Dobro, ali samo do pola,\" pristane Bara \n" +
                "Krene Štef i zaboravi, što je obećao, pa ga metne do kraja. \n" +
                "Svidi se Bari pa kaže: \n" +
                "\"Stavi i drugu polovicu!\" \n" +
                "\"A ne, dogovor je dogovor!\"",
                "V cerkvi je maša. Vernikov je ogromno, vsi zbrano poslušajo župnika, ki pridiga o morali: \"Kako so dandanašnji ljudje pokvarjeni, koliko da je nasilja po svetu, vsi da mislijo samo na seks, in kako so se razpasle javne hiše..\"\n" +
                        "Ravno ko je na tem mestu, opazi, da se v ozadju cerkve mežnar tolče po glavi in si misli: \"Kasneje ga bom vprašal, zakaj se je tolkel po glavi.\"\n" +
                        "In res, maše je konec, župnik stopi do mežnarja in ga vpraša: \"Ti, zakaj si se pa prejle tolkel po glavi?\"\n" +
                        "Mežnar odgovori: \"Zdaj sem se spomnil, kje sva midva marele pozabila!\"",
                "Dve ničli gresta po puščavi in vidita v daljavi osmico. \n" +
                        "Nato ena vpraša: \"Kako se jima v tej vročini le ljubi?\"",
                "Živel je kmet na visoki planini in imel je svinjo. Poznal je prijatelja kmeta, ki je živel nižje v dolini in je imel prasca. In ker je kmet višje hotel imeti male svinje, se je odločil, da bo svinjo dal na samokolnico in jo zapeljal k prijatelju.\n" +
                        "Napoči naslednji dan in kmet s težavo pripelje svinjo k prijatelju. Svinjo zapreta k partnerju in gresta na pijačo... Čez uro se vrneta in naložita svinjo na samokolnico. Prijatelj reče kmetu s svinjo: \"Naslednji dan navsezgodaj pojdi in poglej, kje bo svinja. Če bo na travniku in smukala deteljo, potem ni vredu in moraš še enkrat priti. Če pa se bo valjala po blatu, pa je v redu in imela bo 6-7 mladičev!\"\n" +
                        "Kmet z muko spet odpelje svinjo do doma. \n" +
                        "Naslednji dan zjutraj gre gledat svinjo. Zlomka, smukala je deteljo! Nič, kmet pljune še enkrat v roke in stokajoč odpelje svinjo še enkrat v dolino.\n" +
                        "Naslednji dan spet gre gledat, kako je s svinjo. Svinja pa je še vedno smukala deteljo! Besno je vrgel svinjo na samokolnico in jo še enkrat spravil v dolino.\n" +
                        "To se je ponovilo kar nekajkrat...\n" +
                        "Šesto jutro se možu ni dalo vstajati in je naročil ženi, naj pogleda, kaj dela svinja. Žene nekaj časa ni nazaj, nato pa se vrne in samo miga z glavo.\n" +
                        "Kmet jezno: \"Kaj je narobe, a je že spet v detelji !?\"\n" +
                        "\"Čudno je, čudno... Danes te že v samokolnici čaka!\"",
                "Gre pijanček mimo javne hiše in vidi lepo prostitutko, ki sloni na oknu. Spodaj pri vratih pa pes \"obdeluje\" psico na železnih rešetkah. Naenkrat pa rešetke popustijo in parček zleti v klet. Takrat se pijanček obrne k prostitutki in pravi: \"Glej, zdaj vam je pa reklama dol padla!\"",
                "Se srečajo trije 16-letni sošolci. Beseda je nanesla na seks. Pa pravi prvi, da seksa skoraj vsak mesec. Drugi se pohvali, da seksa skoraj vsak teden. Tretji pa pravi: \"Jaz pa seksam skoraj vsak dan!\"\n" +
                        "Druga dva ga začudeno pogledata: \"Kako to?\"\n" +
                        "Tretji odgovori: \"V ponedeljek skoraj, v torek skoraj, v sredo skoraj...\"\n" +
                        "\n",
                "Pride prostitutka k tattoo mojstru. Ker pa je imela izjemno rada praznike mu veli, da ji na levo stegno vtetovira \"Srečno Novo leto\", na desno pa \"Vesele božične praznike.\"\n" +
                        "Ko mojster konča mu reče: \"Najlepša hvala, gospod mojster, pa obiščite me kaj med prazniki!\"",
                "Vpraša Jože Franca, kje je bil na dopustu.\n" +
                        "Pa pravi: \"V Moravcih.\"\n" +
                        "\"In kako je bilo?\"\n" +
                        "\"Ženo so posilili, mene pa pretepli.\"\n" +
                        "\"In kje ste bili lani?\"\n" +
                        "\"Tudi v Moravcih.\"\n" +
                        "\"In kako je bilo?\"\n" +
                        "\"Ženo so posilili, mene pa pretepli.\"\n" +
                        "\"In kam greste drugo leto?\"\n" +
                        "\"Žena bi spet šla v Moravce.\"",
                "Mož in žena seksata ... in ko je mož v pozi na vrhu, ga prične žena božati po glavi. Mož jo vpraša, kaj počne.\n" +
                        "\"Roge iščem,\" odvrne žena.\n" +
                        "\"Zakaj?\" vpraša mož.\n" +
                        "\"Zato, ker seksaš ko hudič!\"\n" +
                        "Mine nekaj dni, spet seksata, in tokrat je žena na vrhu. Mož jo začne božati po glavi.\n" +
                        "Ga vpraša žena:\n" +
                        "\"Kaj pa delaš?\"\n" +
                        "\"Roge iščem,\" odvrne mož.\n" +
                        "\"A zato, ker sem živa kot hudič?\"\n" +
                        "\"Ne, ker si težka kot krava?\"",
                "Tip pelje blondinko v hotelsko sobo. Blondinka vidi na tleh rabljen kondom in kar odskoči od groze.\n" +
                        "Tip jo vpraša: \"A ga še nisi videla ali kaj ?\"\n" +
                        "\"Sem, ampak zakaj ga je bilo treba odreti !?\"",
                "Zakaj imajo ženske menstruacijo ?\n" +
                        "Kot veste že iz zgodovine, je Adama Eva prisilila, da je prvi okusil jabolko. No, prav zato jo je hotel Bog kaznovati:\n" +
                        "- Za to dejanje boš krvavo plačala !\n" +
                        "- Kaj pa, če bi se zmenila na obroke ?",
                "Gost v restavraciji pokliče natakarja: \"V moji pleskavici sem našel dlako!\"\n" +
                        "\"Jooj, oprostite,\" se opravičuje natakar, \"veste, naš kuhar je invalid in ima le desno roko. Ko dela pleskavice, si jih potolče po prsih...\"\n" +
                        "Gost plane v smeh. \"Čemu pa se smejite?\", vpraša natakar. \"Tistile gospe tamle čez, ki je naročila filane paprike.",
                "Stoji na ograji Savskega mosta en zelo obupan moški, ki hoče ravno skočiti in narediti vsemu konec. Kar naenkrat pa zasliši za seboj žameten moški glas: \"Ne delaj tega, jaz ti bom pomagal - sem namreč dobri Vilenjak! Kaj se ti je zgodilo, prijatelj?\"\n" +
                        "Moški se začudeno obrne in zagleda nizkega moškega z dooolgo brado in odvrne: \"Ah, vsega imam dovolj. Žena se mi je skurbala, hčer se drogira, mene so pa danes še iz službe vrgli.\"\n" +
                        "Vilenjak dvigne roke, zamrmra neke čudežne besede, nato pa z donečim glasom odvrne: \"Oooo prijatelj, vseh tvojih težav je zdaj konec! Pojdi domov in našel boš ženo v svoji postelji, zvesto in prijazno kot še nikoli! Videl boš svojo hčerkico, pridno kot še nikoli poprej! Pojdi v službo, kjer te čaka še boljše delo!\"\n" +
                        "Moški, ves srečen, vpraša Vilenjaka, če mu lahko uslugo kako poplača. Vilenjak odvrne: \"No, khe, khe, vsi imamo majhne slabosti - no, obrni se, nagni se čez ograjo in daj hlače dol.\"\n" +
                        "Hvaležen moški stori, kakor mu je naročil Vilenjak - ta pride od zadaj in ga pošteno \"požgečka\".\n" +
                        "Ko opravita, Vilenjak vpraša: \"Koliko pa si pravzaprav star ?\"\n" +
                        "\"34,\" odvrne moški. \"Žalostno, žalostno ... 34 let, pa še verjameš v Vilenjake,\" odvrne majhen moški in odide.",
                "Strokovna žirija se je odločila, da je vozilo leta 1997: ženska\n" +
                        "K odločitvi so strokovno žirijo privedle predvsem naslednje kakovostne lastnosti:\n" +
                        "1. Ima lastno polnjenje.\n" +
                        "2. V normalnem položaju zmore 60 obratov na minuto.\n" +
                        "3. Če je dobro ogreta, zmore tudi do 120 obratov na minuto.\n" +
                        "4. Prilagojena je vsem tipom in dimenzij batov.\n" +
                        "5. V času pogona uporablja samo eno svečko.\n" +
                        "6. Za vožnjo ne potrebuje vozniškega in prometnega dovoljenja.\n" +
                        "7. Mazanje v času obratovanja je avtomatsko in je odvisno od obremenitve.\n" +
                        "8. Olje menja samodejno na vsakih 24 do 30 dni.\n" +
                        "9. V primeru dobrega polnjenja lahko zdrži brez menjave olja tudi do 9 mesecev.\n" +
                        "10. Ima serijsko vgrajene dve airbag blazini različnih dimenzij.\n" +
                        "11. Nekateri modeli so zelo glasni.\n" +
                        "Opozorilo: Za nemoteno delovanje je priporočljivo redno pranje bata in cilindra.\n" +
                        "Poleg vseh naštetih dobrih lastnosti ima tudi vidnejše napake:\n" +
                        "1. Zelo hitro izčrpa voznika.\n" +
                        "2. Vzdrževanje je drago.\n" +
                        "3. Starih modelov se je težko znebiti.",
                "Se pogovarjata dva kolega in reče en drugemu:\n" +
                        "\"Ti, a te zdaj bioritem kaj heca, ko smo za eno uro prestavili uro ?\"\n" +
                        "\"Ti, a veš, da me res. Prej mi je ob šestih stal v postelji, zdaj mi pa na avtobusu.\"",
                "Nekega dne je Francl hodil ob potoku, v katerem je zagledal zlato ribico. Zagnal se je v potok in jo po nekaj urnem boju zvlekel na obalo. \n" +
                        "Zlata ribica mu je dejala: \"Ker si me ujel, ti izpolnem tri želje.\" \"Rad bi bil lep, pameten in bogat.\"\n" +
                        "Nenadoma se je znašel v prelepi vili, kjer mu je streglo sto služabnikov, okoli njega so se gnetla najlepša dekleta, sam pri sebi pa je računal vrednost Ludolfovega števila (PI) na 200 decimalnih mest. Ker je bil zlati ribici neizmerno hvaležen, se ji je hotel zahvaliti. \"Zlata ribica, povej, ali se ti lahko kako oddolžim?\"\n" +
                        "\"Rada bi bila 10-letna deklica.\" \n" +
                        "Francl jo je najprej poljubil (bljah), potem jo je polizal (2x bljah), nazadnje pa ji je še dal tiča v usta. ...\n" +
                        "\"In takrat se je spremenila v 10-letno deklico, nenadoma se je pojavila njena mama in to je sveta resnica, gospod sodnik !\"",
                "V resnih, trajnih zvezah obstajajo tri vrste seksa:\n" +
                        "\n" +
                        "- stanovanjski,\n" +
                        "- sobni\n" +
                        "- nekontaktni\n" +
                        "\n" +
                        "1. faza - stanovanjski seks traja nekako 1 do 2 leti zveze\n" +
                        "Seksaš povsod in vedno ... v postelji, na kavču, na stolu, na mizi, pod mizo, na tleh, na pralnem stroju - če se le da ob centrifugiranju - ob vseh mogočih urah, v vseh pozah, po celem stanovanju, pa tudi na vrtu, v bazenu (če ga imaš), v kleti, na podstrešju, strehi, balkonu, v drvarnici, delavnici, pasji uti ....\n" +
                        "\n" +
                        "2. faza - sobni seks traja nekako od 3. do 7. leta zveze\n" +
                        "Seks je omejen na en prostor - vedno v postelji, vedno v spalnici, vedno na en in ist način, vedno zvečer ... skratka ... stvar postane rahlo enolična.\n" +
                        "\n" +
                        "3. faza - nekontaktni seks se odvija od 7. leta zveze dalje, v določenih primerih pa do te faze lahko pride tudi že prej. Zadnja stopnja v razvoju spolnega življenja med partnerjema pa izgleda približno takole:\n" +
                        "Slučajno gresta eden mimo drugega, ko se srečata na sredini določene lokacije, in ko se pogledata v oči, si mirno rečeta: \"JEBI SE!\"",
                "Naslonila sem glavo in vedela kaj on želi, jaz pa... Jaz pa sem si močno želela, da mi to stori. Tako je prišlo do, da...bilo je prvič. Zadrževala sem dih in čakala. Njegova roka se je približala tistemu mestu in vprašal je: \"Se ne da bolj narazen ?\"\n" +
                        "Pričelo je boleti, bolelo je, pritekla je kri, on pa pravi: \"Končal sem !\"\n" +
                        "Blaženost in neizmerna sreča sta me prevzeli, ko ga je izvlekel.\n" +
                        "To je bilo prvič, ko sem bila pri ZOBOZDRAVNIKU.",
                "Mujo, direktor, pride v pisarno in vpraša: \"Pa, djevojke, koja je opet pušila u liftu ?\"\n" +
                        "Mlada Fata vstane in reče: \"Pa, ja sam gospon Mujo...\"\n" +
                        "\"Ma,\" pravi direktor, \"nemojte više, tako je neugodno, ima puno dima i...\"\n" +
                        "\"A, ne, ne,\" ga prekine Fata, \"...to onda nisam bila ja...\"",
                "Kdo je najvecja kur*a na svetu ?\n" +
                        "Smrketa.\n" +
                        "Zakaj?\n" +
                        "Ker poje: \"Ti-dam, ti dam, ti-dam, ti-dam,...\"\n" +
                        "In kdo je najvecji kur*ir na svetu ?\n" +
                        "Napoleon.\n" +
                        "Zakaj? \n" +
                        "Ker je umrl na Sv.Heleni.",
                "Dva Slovenca se pogovarjata pri opravljanje male potrebe o predvolilnem boju.\n" +
                        "\"Franc, kaj misliš, v čigavih rokah je usoda Slovencev ?\"\n" +
                        "\"V najinih,\" mu odgovori drugi.",
                "Tri ženske se pogovarjajo na tržnici in kar naenkrat se začnejo pogovarjati o svojih možeh.\n" +
                        "Pa reče Micka: \"Moj ma čisto mrzlega !\"\n" +
                        "Pa pravi Jasna: \"Moj tudi !\"\n" +
                        "Pa Lojzka pravi: \"Za svojega pa še ne vem...\"\n" +
                        "Pa se dobijo spet naslednji teden. Lojzka ima plavo oko. Lojzka pojasni: \"Preizkusila sem, pa sem ugotovila, da ima tudi mrzlega, pa sem mu še povedala, da imata vajina moža tudi mrzlega... Pa me je nabil kot medveda...\"",
                "Pa gre en starejši moški na službeno potovanje. Pa mu ostane nekaj denarja od dnevnice in se odloči, da bo pogledal kako je v javni hiši v večjih mestih. Pa pride v javno hišo in vprasa koliko stane.\n" +
                        "\"Na postelji 100 $, na preprogi pa 25 $.\"\n" +
                        "\"Izvolite 100 $...\"\n" +
                        "\"No dedek, je pa že boljše na postelji, hihi...\"\n" +
                        "\"Kaj na postelji ! ŠTIRIKRAT na preprogi !\"",
                "Janezek: \"Mami zakaj ima naš oči tako majhnega, tisti stric pa tako velikega ?\"\n" +
                        "Mami: \"Veš, naš oči je bolj inteligenten, no stric pa je butast.\"\n" +
                        "Čez nekaj časa, ko se je mamica malo obrnila na soncu.\n" +
                        "Janezek: \"Mami, mami, poglej stric postaja čedalje bolj butast !\"",
                "Mujo je bil že dolga leta impotenten, potem pa je šel na pregled k zdravniku, ki mu je napisal recept za Dabistal tablete. Mujo je takoj tekel v lekarno, pojedel pol škatle in prišel domov silno spolno vzburjen. Ko pride domov, vidi Fato kako sklonjena pomiva posode, in ker je sila velika, takoj opravi zadevo z njo. V naglici pa je zgrešil... Fata: \"Šta je sad to ?\"\n" +
                        "Mujo ji pokaže tablete in Fata bere: \"Krka Novo mesto. Mujo ovo nisu prave tablete, trebao bi da doneseš Krka Staro mesto !!\"",
                "Pride sin domov in reče:\n" +
                        "- Ata jaz pa sem zgubil nedolžnost !\n" +
                        "- Bravo sine, pridi sem, bova kakšno moško rekla !\n" +
                        "- Ne danes, raje juri, me prevec rit peče.",
                "V lekarno vstopi moški z roko z razkrečenimi prsti v zraku. Lekarnar ga vpraša:\n" +
                        "\"Ali to pomeni, da želite kremo za roke?\"\n" +
                        "\"Ne,\" odgovori moški, \"pomeni pet tablet Viagre, sem namreč portir v hotelu in danes pride avtobus z dvajsetimi mladimi Francozinjami k nam.\"\n" +
                        "Naslednje jutro se spet pojavi v lekarni, tokrat z obema rokama z vsemi desetimi razkrečenimi prsti v zraku. Lekarnarju je takoj jasno:\n" +
                        "\"Razumem, danes pa deset tablet Viagre!\"\n" +
                        "\"Ne,\" reče moški, \"kremo za roke, avtobusa včeraj ni bilo!\"",
                "Janezek in Metka se igrata zdravnike. Oba se sleceta in Metka vidi Janezovega lulka ter ga vpraša: \"A ga lahko primem ?\"\n" +
                        "Janezek: \"Ne, svojega si že odtrgala.\"",
                "Pride Fata iz Francije, pa jo Mujo že takoj naskoči. \n" +
                        "Fata: \"Mujo, pa ne me tako, daj me po francosko !\"\n" +
                        "Ker Mujo ni vedel, kako gre po francosko, je drugega dne povprašal prijatelja. Ta mu je odvrnil: \"Liži jo tam, kjer lula.\"\n" +
                        "Mujo: \"A ploščice tudi ?\"",
                "Na vratih restavracije se pojavi malo čuden možakar, s papigo na rami in v družbi dveh čudovitih mladih dam. Vsedejo se za mizo.\n" +
                        "Prihiti natakar: \"Kaj boste?\"\n" +
                        "Mož: \"Stotri porcije rižote!\"\n" +
                        "Natakar: \"Gospod se šali, saj ste samo trije.\"\n" +
                        "Mož vztraja: \"Stotri porcije rižote!\"\n" +
                        "Natakar je tudi vztrajen: \"Gospod, ne zamerite, to bo stalo okrog 50.000 tolarjev.\"\n" +
                        "Mož se zareži: \"Denar te skrbi, ha! Pomiri se,\" in mu pokaže, da ima denarja več ko dovolj.\n" +
                        "Natakar skomigne z rameni, si misli, kak čudak mu je prišel v lokal in gre v kuhinjo naročit zahtevano.\n" +
                        "\n" +
                        "Čez čas začno prihajati iz kuhinje vozički, vsi obloženi s krožniki z rižoto.\n" +
                        "Natakar: \"Gospod, vaši gostje še niso tu? Kam naj damo vso to jed?\"\n" +
                        "Mož: \"Tri porcije dajte kar sem na mizo, ostalo pustite na vozičkih!\"\n" +
                        "Narede zaukazano in mož in obe dami se spravijo vsak nad svojo porcijo rižote. Med tem pa papiga zapusti ramo moža in se spravi na ostalih 100 porcij in jih tudi pospravi prav tako hitro, kot sta mož in dami pospravili svoje porcije.\n" +
                        "Vse to seveda ne ostane nezapaženo. Ljudje začnejo vzklikati in se glasno čuditi in potem seveda riniti v moža z vprašanji, kako, da imam njegova papiga tak apetit.\n" +
                        "Mož se nejevoljen brani: \"Pustite me na miru, postanem slabe volje, kadarkoli se spomnim, kako sem prišel do te papige!\"\n" +
                        "Ljudje vztrajajo in mož, da bi imel mir, začne pripovedovati:\n" +
                        "\n" +
                        "\"Lovil sem ribe in ujel zlato ribico. Ribica me je prosila, naj jo izpustim, v povračilo mi bo uresničila tri želje. Seveda sem jo izpustil. Potem pa so prišle na vrsto želje. Prva moja želja je bila, da bi imel vedno dovolj denarja. In res od takrat imam vse žepe polne denarja, ne glede, koliko ga vzamem ven. Druga želja je bila, da bi bil med čednimi ženskami. In res, od takrat me spremljata povsod ti dve lepotici. Tretja želja, oh, tretja želja, pa je bila, da bi imel nenasitnega tiča, pa je očitno prišlo do nesporazuma...\"",
                "Zakaj lulek ni naredil osnovne šole?\n" +
                        "Ker je imel luknjo v glavi!\n" +
                        "Zakaj lulek ni naredil srednje šole?\n" +
                        "Ker je preveč šprical!\n" +
                        "Zakaj lulek ni dobil službe?\n" +
                        "Ker ni mogel stati celih 8 ur!",
                "Ribič ulovi zlato ribico in na njeno moledovanje, da mu izpolni željo, če jo izpusti, si le-ta zaželi, da bi lahko lulal šampanjec. Hopla! Želja se mu uresniči, ribica odplava, on pa k ženi in ji pove.\n" +
                        "\"Čudovito,\" pravi žena, \"skočim po dva kozarca, da nazdraviva !\"\n" +
                        "\"Ne, ne,\" pravi mož, \"samo enega prinesi; ti boš pila iz steklenice !\"",
                "Mama in Janezek gresta po cesti, pa gresta mimo kurbnhausa, pa vpraša Janezek mamo: \"Mami, kaj pa je to za ene stavbe ?\"\n" +
                        "Mama: \"Janezek, tukaj se pa ljubezen prodaja.\"\n" +
                        "Ko prideta domov, prosi mamo Janezek, naj mu da denar za kino. Janezek gre seveda v kurbnhaus. Pride tja in reče vratarju, da bi rad kupil eno ljubezen. Vratar ga pelje v kuhinjo in mu namaže tri palačinke. Ko Janezek pride domov, vpraša mama, kje je bil. Pa reče, da je prvo raztegnil in polizal, drugo povohal in pol ure lizal, tretjo pa položil.",
                "Mujo in Fata sta mož in žena! \n" +
                        "Mujo: Fata, ali ti veš, kaj je to situacija?\n" +
                        "Fata:Ja. Situacija je situacija.\n" +
                        "Mujo: Situacija je, ko ti prideš domov in vidiš mene v postelji s sosedo!\n" +
                        "Fata: Dobro. Potem je isto situacija, če ti prideš domov in vidiš mene v postelji s sosedom!\n" +
                        "Mujo: E Fata, ne mešati batine in situacijo!!!!",
                "\"Bio je jedanput čovjek zvan Mile.\"\n" +
                        "Nekega dne se je odpravil na kmečko veselico z zelo malo denarja v žepu. Tam je spoznal znano radodarno žensko. Ta bi mu dala le, če bi imel 100 dinarjev, a revež Mile jih je imel le 50. Tako se sporazumeta, da bo delal le do polovice v bližnjem WC-ju. Ko Mile začne že do polovice, nekdo odpre vrata in Mileta potisne. A sad Mile: \"Tko to mene gura u dugove !?\"",
                "Novinar: Gospa Helena, a vam rastejo dlake po prsih ?\n" +
                        "Helena: Seveda ne, kaj si pa dovolite ?!\n" +
                        "Novinar: Ja, pol pa mate dekolte preglobok !",
                "Janez je odšel na službeno potovanje na Japonsko. Prvi dan je bil naporen, tako da so ga partnerji po sestankih povabili na sproščujočo večerjo, nato masažo in še pač ostalo, kar spada zraven. Vzhodnjaško lepotico je seveda takoj zatem odpeljal v svojo sobo in sta se igrala očite in mamice. Ko pa je začel, je začela sopsti: \"Sukiaaaa, sukiaaa...\" Mislil si je \"mat'r sem dober\" in nadaljeval še močneje, da je že vpila: \"SUKIAAA, SUUKIIAA !!!\" Ko je končal, se je počutil kot najboljši ljubimec na svetu.\n" +
                        "Naslednji dan so ga partnerji povabili na igro golfa. Ko je udaril po žogici in je žogica poletela, je zaslišal ženski glas s tribune: \"Sukiaaa !\" Pogledal je proti najbližjemu partnerju in rekel: \"Pravi, da sem dober ko hudič, a ne ?\" Odgovoril mu je: \"Ne, to pomeni NAPAČNA LUKNJA...\"",
                "Starejši gospod zaupno potoži svojemu dobremu prijatelju, češ, da ima težave z erekcijo. \n" +
                        "\"To pa ni problem,\" ga nalaže prijatelj, \"veliko kruha jej, pa bodo težave minile!\" \n" +
                        "\"A, res?!\"\n" +
                        "\"Stoprocentno! To se ve!\"\n" +
                        "Možakar gre malo zbegan v pekarno, kjer so ga poznali in vedeli, da kupuje kruh na deke. \"En kilogram kruha!\" zahteva mož.\n" +
                        "\"Ja, gospod,\" se čudi prodajalka, \"to je precej, saj vam bo postal trd !\"\n" +
                        "\"E, če je tako, pa mi ga dajte kar tri kilkograme !\"",
                "Zakaj so moški po prsih kosmati ?\n" +
                        "Ker so po srcu pi*de.",
                "Janezek in mama sta se sprehajala v živalskem vrtu mimo predela, kjer so imeli slone. Janezek je zagledal starega velikega slona, ki je lulal. Potegnil je mamo za rokav: \"Mami, mami, kaj ima slon tamle ?\" in pokaže proti slonovem podaljšku.\n" +
                        "Mama je zagledala precej ogromno zadevo, živo rdeče zafarbala in rekla: \"Oh, to ni nič. Pridi, greva...\"\n" +
                        "Čez nekaj tednov je šel Janezek v živalski vrt z očetom. Potegnil ga je za roko, ga odvlekel do slonov in ga vprašal: \"Oči, kaj je to ?\"\n" +
                        "Oče: \"Ja, a ti ni že mama povedala ?\"\n" +
                        "Janezek: \"Ona je rekla, da to ni nič...\"\n" +
                        "Oče: \"Hja, veš sine, tvoja mama je razvajena...\"",
                "Mož in žena sta se naveličala seksa v postelji, pa reče mož ženi: \"Kaj ko bi šla to počet kar v park med sprehajalce, pa bo malce bolj zanimivo in napeto ?\"\n" +
                        "In gresta. Med njunim opravilom jih zmoti policaj in reče: \"Tole bo pa kazen, tega vendar ne smeta početi na javnem mestu. Gospa bo plačala kazen 15000 SIT, gospod pa 5000 SIT !\"\n" +
                        "Mož zvedavo vpraša policaja: \"Že, že, saj razumem kazen, ampak zakaj mora gospa plačati več kot jaz !?\"\n" +
                        "Policaj odvrne: \"Vse je OK, imam zapisano. Vas sem zalotil pri tem dejanju prvič, vašo gospo pa že tretjič !\"",
                "I'm always frank with my sexual partners.\n" +
                        "Don't want them knowing my real name, do I?\n" +
                        "\n" +
                        "Courtesy of Sickipedia.org: http://www.sickipedia.org/sex-and-shit/adultery#ixzz3lLasceuV",
                "Skrivnosti uspešnega zakona: \n 1. Pomembno je, da ženska kuha, čisti in pere. \n 2. Pomembno je, da ženska dobro služi" +
                        "\n 3. Pomembno je, da ženska rada seksa \n 4. Najpomembnejše je, da se te tri ženske nikoli ne srečajo",
                "Moja ženska dela kot asistentka cirkuškega čarovnika. Danes sem s šihta prišel zgodaj in ona je bila v spalnici. Rekla je \"Abrakadabra!\" in kar naenkrat je iz omare padel moj prijatelj Štef, popolnoma nag. Ubogemu Štefu zagotovo ni bilo jasno popolnoma nič",
                "Mož reče ženi: \"Povej mi nekaj, kar me bo hkrati razveselilo in razžalostilo\". Žena: \"Imaš večjega kot tvoj brat...\"",
                "Ko je moja žena danes prišla od zdravnika je bila videti zelo razburjena. \"Kaj ti je rekel?\", sem jo vprašal. \nNato je odgovorila \"Rekel mi je, da " +
                        "ne moreva seksati naslednja dva tedna\" \n \"Zakaj ne?\" \n\"Zato, ker gre na dopust za dva tedna\"",
                "Danes sem zalotil svojo punco - fukala se je z nekom drugim! Zato sem poklical njenega moža in mu pojasnil \n\"Najini prasici se je popolnoma zmešalo\"",
                "Ti prokleti imigranti se lahko skrijejo kamorkoli! Včeraj sem se vrnil s šihta in našel nagega črnca v ženini omari!!!",
                "Moja punca me je zalotila ob seksu z drugo žensko. \"Ni tako kot zgleda!\", sem ji hotel pojasniti. \n\"Vseeno mi je kako vse skupaj izgleda! Kdo za vraga je ona?\"\n\"Moja žena\"",
                "Slišala sem, da rabi povprečen moški 5 minut za seks in 8 minut za tem že zaspi. To se sliši zelo nevarno, ker večina moških se takrat že pelje domov...",
                "Fant vpraša punco: \"Si kdaj probala analni seks?\" Punca:\"Da, jebeno sranje\"",
                "Ravno sem nažigaval tajnico v rit, ko je v pisarno vstopila žena in zakričala: " +
                        "\"NE MOREŠ MI TEGA NAREDITI!!!\"\n\"Vem, zato pa to delam njej!\"",
                "Analni seks: \nNi za pizde...",
                "I'm always frank with my sexual partners.\n" +
                        "Don't want them knowing my real name, do I?\n" +
                        "\n",
                "Ravnokar sem najel devetnajst letno švedinjo z ogrooomnimi joškami, da popazi na otroke. Sedaj se sprašujem, kje za vraga naj dobim še otroke???",
                "Moj najljubši spomin iz otroštva je, ko sem nategnil svojo varuško. Nekje sredi vsega skupaj je rekla: \"Morala bi nehati, počutim se kot kurba\"" +
                        "\nNakar sem ji rekel: \"Zakaj? Saj te ne plačujem jaz pač pa moji starši...\"",
                "Včeraj sem seksal z varuško, ki sva jo najela z ženo. Najbolje zapravljenih 5€ na uro v mojem življenju.",
                "Moja žena vedno vztraja, da malo pospravima predno pride čistilka. To je tako neumno kot da bi si ga šel drkati predno pride varuška.",
                "Danes sem potolažil prijatelja, ki ni seksal že več kot leto dni. \n\"Še dobro, da nisi biseksualec. Ne vem kako bi prenesel zavrnitve obeh spolov...\" ",
                "\"Jaz sem velik biseksualec.\" sem kot strela z jasnega izjavil zadnjič, ko smo se ob pivu zafrkavali s kolegi. \n \"Kako to\", so me vprašali. " +
                        "\n\" Vedno bi seksal.\" ",
                "Vsi me sovražijo, ker sem biseksualec! \n Jebeš njih vse!",
                "\"Moja žena je biseksualka!\", sem potožil kolegu... \n \"Kako to?\", me je začuden vprašal... \n\"Seksava dvakrat letno...\"",
                "Znastveniki so opravljali anketo, ki je raziskovala razloge zakaj je prijemanje oralnega seksa tako zelo všeč. 5% jih je odgovoril, da " +
                "jim je všeč, kako zgleda, 15% je odgovoril, da jim je všeč občutek, 80% pa jih je reklo, da jim paše malo tišine.",
                "Z ženo sva se pred kratkim dogovorila, da tisti, ki se prvi zbudi na jutro najine prve obletnice, zbudi drugega z oralnim seksom. Danes je bila prva obletnica in prvi sem se zbudil jaz ... in nato sem ji potisnil tiča v usta ... ",
                "17 letna Špela je vprašala očeta, če si lahko sposodi avto. \nOče: \"Edino, če mi ga pofafaš, Špela. Saj poznaš pravila...\nŠpela je vzdihnila in se dala na kolena. "
                + "Oče je izvlekel tiča in ona se je spravila na delo. Takoj, ko je pričela, se je zgrozila in rekla: \"Fuuuuj - okus ima po dreku!!!\" \nOče je rekel: \"Jah, tvoj brat si je hotel sposoditi 20 €...\"",
                "Fant in dekle se peljeta z vlakom, ki zapelje v zelo dolg predor.\n" +
                        "Ko so prišli spet na svetlo je fant zašepetal dekletu:\n" +
                        "“Ko bi prej vedel, da bo tako dolg tunel, bi seksal s teboj!”\n" +
                        "Dekle se zdrzne, pogleda potnike okoli sebe in prepadeno reče:\n" +
                        "“Kaj nisi bil ti?”",
                "Po seksu je dekle reklo fantu, ki ga je spoznala neposredno pred\n" +
                        "posteljnimi užitki:\n" +
                        "“Upam da nimaš AIDSA!”\n" +
                        "“Ne. Zakaj me to sprašuješ?”\n" +
                        "“Ker ga ne bi želela ponovno dobiti!”",
                "Janez je radoveden, nekaj mu ne da miru, zato se obrne k fotru: \n" +
                        "\n" +
                        "Alo foter, daj mi povej kaj je to impotenca? \n" +
                        "\n" +
                        "Tastar nekaj časa poglobljeno razmišlja in izusti: \n" +
                        "\n" +
                        "Veš sine, to je približno tako, kot če bi igral pikado s kuhanimi špageti. :)",
                "Mož in žena se oblačita za v opero, ona mu pravi: \"Šlic imaš odprt.\" \n" +
                        "\n" +
                        "On: \"Veš, kaj to pomeni?\" \n" +
                        "\n" +
                        "\"Ne.\" \n" +
                        "\n" +
                        "\"To je uvertura v Čarobno piščal.\"",
                "Oče vozi avto, na zadnjih sedežih sedita sin in njegova punca.\n" +
                        "Dan je vroč, klima je crknila, oče odpre okno in veter potegne po avtu.\n" +
                        "Vpraša sina: »Mirč, ti vleče?«\n" +
                        "Mirko: »Ne, samo objemava se.«",
                "kakšna je razlika med pralnim strojem in devico??\n" +
                        "da pralni stroj ne laufa še 14 dni za tabo potem ko ga nafilaš.",
                "Se srečata sedanji in bivši mož žene in bivši vpraša sedanjega:\n" +
                        "\"kako je kaj rabljena roba?\"\n" +
                        "pa mu reče sedanji:\"do 7cm tako tako, naprej je pa kot nova ",
                "V hribovski vasici, bogu za hrbtom, je živela mlada punca Francka.\n" +
                        "Nekega jutra se zbudi in med nogami začuti močno ščemenje, ki ni in ni\n" +
                        "nehalo.\n" +
                        "Po parih dnevih se odpravi vprašat župnika za nasvet, kako naj se reši\n" +
                        "tega ščemenja.\n" +
                        "\"Veš, to ti je muha noter zlezla in zdaj ne more ven, zato te tako srbi.\n" +
                        "Vem kakšna je rešitev, a ti žal ne smem pomagat, ker sem župnik?\"\n" +
                        "Francka žalostna zapusti cerkev.\n" +
                        "Na polju vidi soseda Poldeta, kako v potu svojega znoja, okopava krompir.\n" +
                        "Pove mu vse glede muhe in ga zaprosi za pomoč,\n" +
                        "Polde pa: \"Jaz bi ti že rade volje pomagal, a sem žal prestar za kaj\n" +
                        "takega..\"\n" +
                        "Nato pride do pašnika, kjer je pasel krave mlad postaven pastir.\n" +
                        "Ko mu zaupa svoj problem in ga zaprosi za pomoč, se pastir veselo nasmehne\n" +
                        "in ji reče, naj sleče obleko.\n" +
                        "Francka jo sleče.\n" +
                        "Modrček je kar pokal od napetih prsi, gate pa so bolj odkrivale kot\n" +
                        "skrivale, njeno mednožje.\n" +
                        "Potem ji pastir reče naj sleče še to dvoje, se uleže predenj in da noge\n" +
                        "narazen.\n" +
                        "Francka ga brez obotavljanja uboga.\n" +
                        "Nato tudi pastir sleče svoje hlače pa gate, počepne pred Francko in se\n" +
                        "poserje:\n" +
                        "\"Če to ne bo zvabilo muhe ven, potem pa res ne vem kako še pomagat?.",
                "Moški v lekarni: \"Kondome, prosim!\"\n" +
                        "Lekarnarica: \"A dam vrečko zraven?\"\n" +
                        "Moški: \"Ne, ni treba, ni tolk grda.\"",
                "Zvečer se mož in žena odpravita v posteljo.\n" +
                        "Mož začne božat ženino nogo in nežno vpraša:\n" +
                        "- Draga, a bova malo ....\n" +
                        "- Ma dragi moj, oprosti, ampak jutri imam pregled pri ginekologu, pa bi rada ostala sveža in čista!\n" +
                        "Mož se, vidno razočaran, obrne na drugo stran in molči.\n" +
                        "A ne mine dolgo časa, ko se ponovno obrne k njej in vpraša:\n" +
                        "- A imaš pri zobozdravniku tudi pregled?",
                "Prijateljici se pogovarjata po telefonu: \"Si lahko predstavljaš kaj takega, ko sem\n" +
                        "prišla domov, je moj dragi sedel na kavču v dnevni sobi in masturbiral!\"\n" +
                        "\"Vau, neverjetno! In kaj si storila?\" \"Ja kaj, vzela sem mu ga v usta in opravila do konca!\" \"Vau, in zakaj to...?\"\n" +
                        "\"Lažje izperem usta in očistim zobe, kot celo sedežno, tepih in zavese.\"",
                "Kaj dobimo, če seksata kmet in kmetica?\n" +
                        "Kmečkega otroka.\n" +
                        "Kaj pa če seksata ekološki kmet in njegova žena?\n" +
                        "Nič, ker ekološki kmet ne šprica!",
                "Klepetata na klopci v parku dva starejša upokojenca, pa gospa vpraša gospoda:\n" +
                        "\"Koliko let pa imate?\"\n" +
                        "On: \"95 \"\n" +
                        "Ona: \"Ne bi vam dala\"\n" +
                        "On: \"Sej tut ne bi mogu.\"",
                "V službi se pri kofetu menita kolegici:\n" +
                        "\n" +
                        "\"Kakšen sex pa si imela včeraj?\"\n" +
                        "\n" +
                        ">Katastrofa... Mož je prišel iz službe, v 3 minutah je pojedel kosilo, po kosilu 4 minute sexa in potem je po 2 minutah zaspal. A pri tebi?\n" +
                        "\n" +
                        "\"Pri meni fantazija. Mož je prišel domov, me je peljal na prekrasno romantično večerjo, po večerji sva se počasi eno uro sprehodila do doma, doma spet sveče in ena ura extra predigre, potlej pa ena ura fantastičnega sexa, na koncu pa sva se še eno uro pogovarjala. Z eno besedo – bajka.\n" +
                        "\n" +
                        "Ob istem času se pogovarjate dva kolega:\n" +
                        "\n" +
                        "-Kakšen sex pa si imel včeraj?\n" +
                        "\n" +
                        ">Super! Pridem domov, kosilo na mizi, pojedel sem, izseksal sem se in potem blaženo zaspal. Kaj pa pri tebi?\n" +
                        "\n" +
                        "\"Pri meni katastrofa. Pridem domov, pa ni elektrike, ker sem pozabil plačati račun. Kaj se mogel. Ženo sem moral peljati ven na večerjo. Neka brezvezna hrana je bila tako svinjsko draga, da še za taksi nisem imel denarja, pa sva morala domov peš. Prideva domov, doma – jasno – ni elektrike, pa sem moral prižgat tiste preklete sveče. Bil sem tolk besen, da se mi eno uro ni dvignil, potem mi od živčnosti eno uro ni prišlo, vse skupaj pa me je tolk razpizdilo, da še eno uro nisem mogel zaspati.",
                "Zakaj v državnih službah sodelavci ne seksajo med sabo? \nKer so si vsi v sorodu! ",
                "Mladenka je prišla k spovedniku in povedala, da ima fanta. Spovednik jo vpraša: \"Te kaj otipava?\" \n\"Da\"\"Zgoraj?\"\n\"Da.\"\n\"Spodaj?\"\n\"Tudi.\"\n\"Ali kaj grešita?\"\n\"Ne, to pa ne; vedno zadane!\" ",
                "\"Mladostnica se je odpravljala na ples in mama je opazila, da si ni \n" +
                        "oblekla \n" +
                        "spodnjih hlačk. \"Kaj? Brez spodnjih hlačk greš na ples?\" \n" +
                        "\"Ali si daš ti vato v ušesa, kadar greš na koncert?\" ",
                "Starejša gospoda, oba že več let spolno vzdržna, skleneta, da je skrajni čas, da obnovita znanje v javni hiši. \n" +
                        "Ko ju madame zagleda, si misli, da na teh dveh že ne bo trošila svojih deklet, zato obema podtakne napihljivo lutko. \n" +
                        "\n" +
                        "Ko se starca vrneta vsak iz svoje sobe, sta videti zbegana, a ne rečeta nobene. Na poti domov se eden le odpre: \n" +
                        "\n" +
                        "\"Brane, nerodno mi je tole priznati, ampak mislim, da je bila moja punca mrtva. Niti enkrat se ni premaknila, niti enkrat zastokala, niti ene besede mi ni namenila, nič. Kako je bilo pa pri tebi?\" \n" +
                        "\n" +
                        "Drugi tudi ni prepričan: \n" +
                        "\"Moja, mislim, da je bila čarovnica.\" \n" +
                        "\"Kako to misliš?\" \n" +
                        "\"Ko sem ji grizljal vrat, je iznenada zasikala in odfrčala skozi okno.\"",
                "Moški srednjih let se je peljal po samotni cesti in proti večeru ugledal napis: Obiščite bordel NUNE, 10km.Po nekaj minutah vožnje zagleda naslednji napis: Bordel NUNE, 5km. Malo pozneje zagleda še tretjo tablo: Bordel NUNE, prvi odcep desno. Ker si je zaželel zabave, je zavil desno in prišel pred velik kamnit samostan z napisom: Bordel NUNE. Pustil je avto na parkirišču in stopil k vhodu. Ko je potrkal, mu je odprla nuna. Ko ji je povedal, kaj želi, ga je brez besed peljala skozi neštete sobe in hodnike do nekih vrat. Potrkajte tukaj, mu je naročila in odšla. Mož je potrkal in odprla mu je druga nuna ter rekla: Plačajte 100 evrov in pojdite skozi velika lesena vrata na koncu hodnika. Moški je plačal in odhitel do konca hodnika ter stopil skozi velika lesena vrata, ki so se za njim spet sama zaprla. Ugotovil je, da stoji spet na parkirišču, kjer je pustil svoj avto. Hotel je nazaj, a vrata so bila zaklenjena. Jezno se je napotil proti avtu, ko je ob potki zagledal majhno tablo z napisom: Pravkar so vas nategnile NUNE. ",
                "- Kdaj veš, da moški ni več seksualno vznemirjen? \n" +
                        "Ko neha dihati. \n" +
                        "\n" +
                        "- Kako zenska občuti izgubo moža? \n" +
                        "Seksa ravno toliko kot prej, samo daljinec je prost. \n" +
                        "\n" +
                        "- Kakšna je razlika med moškim in steklenico? \n" +
                        "Oboje je prazno od vratu navzgor. \n" +
                        "\n" +
                        "- Kaj imajo skupnega - moški in parkirni prostori? \n" +
                        "Dobri so že zasedeni, prosti so samo še invalidni. \n" +
                        "\n" +
                        "- Kakšna je moška pomoč pri domačih opravilih? \n" +
                        "Dvigne noge da ti lažje posesaš. ",
                "Žena prosi moža: Povej mi nekaj, kar me bo osrečilo in razžalostilo hkrati.\n" +
                        "Naj pomislim ...\n" +
                        "No, le daj.\n" +
                        "Tvoje vađajna je tesnejša od vađajne tvoje sestre.",
                "Blagajničarka – vedno zahteva denar v naprej.\n" +
                        "Sprevodnica – vedno vpije: »Porini v sredini, da prideta noter še dva, ki sta zunaj.«\n" +
                        "Profesorica – vedno pravi: »Bilo je dobro, ponoviva še enkrat.«\n" +
                        "Zdravnica – govori: »Naslednji prosim.«\n" +
                        "Šefinja v rudniku – ukazuje: »Pripravite se, da greste v jamo.«\n" +
                        "Lekarnarka – pravi: »Dvakrat pred jedjo in dvakrat po jedi.«\n" +
                        "Telefonistka – pravi: »Končajte gospod, drugače bom prekinila.«\n" +
                        "Kuharica – pravi: »Mešaj hitreje, da se ne prime.«",
                "Pacientka potoži ginekologu:\n" +
                        "- Nekaj je narobe z mano. Imam 35\n" +
                        "let in še nobene sramne dlake.\n" +
                        "- Hm. Kolikokrat na teden pa imate\n" +
                        "spolne odnose?\n" +
                        "- Od petindvajsetkrat do trideset-\n" +
                        "krat.\n" +
                        "- No, poglejte: Tudi na avtocesti\n" +
                        "ne raste trava...",
                "Pozno zvečer se hčerka vrne domov, oče pa je seveda še pokonci in čaka. \n" +
                        "\"Opet si pušila!\" \n" +
                        "\"Nisam. Je'l očeš, da dahnem u tebe?\" \n" +
                        "\"Ne treba, samo se obriši oko usana.\" ",
                "85 letnega dedka je zelo zanimala kvaliteta njegove sperme \n" +
                        "in je šel k svojemu zdravniku. \n" +
                        "Doktor mu je dal stekleničko rekoč: \n" +
                        "\n" +
                        "\"Jutri zjutraj mi prinesite vzorec vaše sperme.\" \n" +
                        "\n" +
                        "Naslednje jutro je dedek v ordinaciji in zdravniku moli prazno stekleničko. \n" +
                        "\n" +
                        "Zdravnik ga vpraša, kaj se mu je zgodilo. \n" +
                        "\n" +
                        "\"Doktor! To pa je bilo tako: najprej sem poskušal z desno roko, \n" +
                        "pa mi ni uspelo, nato z levo, pa spet nič. \n" +
                        "Potem sem poklical ženo, naj mi pomaga. Matrala se je z desno roko, \n" +
                        "nato je poskušala še z levico... pa nič. \n" +
                        "Poskusila je z usti, z zobmi, brez zob ... pa nič ni pomagalo, nič se ni \n" +
                        "zgodilo. \n" +
                        "Poklical sem celo sosedo Ano, ker je mlada. \n" +
                        "Poskusila je z obema rokama, s stisnjenima kolenoma in absolutno nič ni \n" +
                        "pomagalo. \n" +
                        "\n" +
                        "Doktor je zgrožen: \"Kaj, klicali ste še sosedo?\" \n" +
                        "\n" +
                        "Starček odgovori: \"Ja zares, karkoli smo poskusili, pokrovčka nismo mogli \n" +
                        "odviti!\"",
                "Mož se je odločil, da bo ženi za rojstni dan kupil lep kostim, zato je \n" +
                        "obiskal prodajalno in res izbral prelep kostim. Prodajalka ga je \n" +
                        "vprašala, katero številko potrebuje, on pa je pojasnil: \n" +
                        "\"Za številko ne vem, toda ko doma vstane s kavča, mi z ritjo zakrije \n" +
                        "celoten ekran televizije, ki v diagonali meri 82 cm!\" ",
                "Pride mož iz kopalnice in se začne smukati okrog žene. \n" +
                        "Ona kot vedno reče: \"Ne danes, dragi. Glava me boli.\" \n" +
                        "\"Ni problema, draga\", reče mož. \"Ravnokar sem napudral penis z aspirinom, tako, da lahko izbiraš! Ga boš vzela oralno ali kot svečko?\"",
                "Mlad igralec je dobil prvo vlogo na odru. Sicer vloga ni bila nič \n" +
                        "posebnega, moral bi priti na oder z rožo v roki, dvigniti rožo k nosu in reči:\n" +
                        "\"Oh, ta nežni vonj moje drage!\"\n" +
                        "Pred premiero je bil seveda močno živčen. Prišel je usodni\n" +
                        "trenutek. Fanta je nekdo sunil, stopil je na oder, privzdignil rožo k nosu, in na vso srečo \n" +
                        "brez problema povedal svoj znameniti stavek:\n" +
                        "\"Oh, ta nežni vonj moje drage!\"\n" +
                        "Ni se še dobro vrnil za oder, ko je dvorana eksplodirala od smeha. \n" +
                        "Ljudje so noreli in kričali.\n" +
                        "Seveda je zaskrbljen vprašujoče pogledal režiserja. Ta pa mu je odgovoril:\n" +
                        "\"Bedak neumni, rožo si pozabil!\"",
                "V lekarno vstopi moški z eno roko v zraku. \n" +
                        "Lekarnar vpraša: \"Kremo za roke?\"\n" +
                        "\"Ne,\" odgovori moški, \"pet tablet Viagre, sem namreč portir v hotelu \n" +
                        "in danes pride avtobus z dvajsetimi mladimi Francozinjami k nam.\"\n" +
                        "Naslednje jutro se spet pojavi v lekarni z obema rokama v zraku. \n" +
                        "Lekarnar: \"Jasno, deset tablet Viagre!\"\n" +
                        "\"Ne!\" reče moški, \"kremo za roke, avtobus ni prišel!\"",
                "Pride James Bond v en fancy lokal in pri baru sreča čudovito, dolgonogo, dolgolaso in na pravih mestih zaobljeno lepotico. Vrže ji dolg pogled, nato pa pogleda na uro. In tako še nekajkrat. \n" +
                        "\n" +
                        "Pa ga ogovori lepotica: Kaj pa je tako zanimivega na uri? \n" +
                        "In odvrne James Bond: Ah, tole je najnovejši model ure. Z njo komuniciram preko alfa zarkov. \n" +
                        "Lepotica: A ja? Kaj ti pa rece tvoja ura? \n" +
                        "Bond: Ravnokar mi je povedala,da ne nosiš spodnjih hlačk. \n" +
                        "Lepotica rahlo zardi, potem pa reče: To pa ni res. Saj imam spodnje hlačke. \n" +
                        "Bond pogleda uro, jo potrka in prinese k usešu. Nato pa rece: \n" +
                        "\n" +
                        "Jebenti, pa res prehiteva za eno uro! ",
                "Micka si je privoščila skok čez plot z Janezom. Ko sta tako nekega dne seksala, slišita avto, ki se ustavi na dvorišču. \n" +
                        "Micka plane iz postelje, pogleda na dvorišče in vzlikne: \"Moj Bog, moj mož se je prej vrnil s potovanja. Janez, takoj skoči skozi okno na cesto in izgini!\" \n" +
                        "Janez pogleda skozi okno in odvrne: \"Ne morem, Micka. Saj vidiš, da dežuje!\" \n" +
                        "Micka se obupano zgrabi za glavo in krikne: \"Janez, če naju moj mož zasači, naju bo oba ubil.\" \n" +
                        "Janez torej plane iz postelje, pograbi svojo obleko, skoči skozi okno na cesto in se znajde v skupini maratoncev, ki prav tisti hip tečejo mimo Mickine hiše. Da bi zabrisal sled za seboj, se jim Janez pridruži. \n" +
                        "Čez nekaj časa se Janezu med tekom približa prvi maratonec in vpraša: \n" +
                        "\"Kolega, ali teceš maraton vedno nag?\" \n" +
                        "Janez: \"Vedno. Tako prijetno je čutiti pihljanje vetra, ko sem nag, in tako bolje čutim povezanost z naravo.\" \n" +
                        "Čez nekaj časa se Janezu med tekom približa drugi maratonec in vpraša: \n" +
                        "\"Kolega, ali tečeš maraton vedno z obleko pod pazduho?\" \n" +
                        "Janez: \"Vedno. Tako praktično je imeti obleko pri sebi. Ko pritečem na cilj, se lahko takoj oblečem, usedem v avto in odpeljem domov.\" \n" +
                        "Čez nekaj časa se Janezu med tekom približa tretji maratonec in vpraša: \n" +
                        "\"Kolega, ali teceš maraton vedno s kondomom na tiču?\" \n" +
                        "Janez: \"Ne vedno. Samo če dežuje.\"",
                "Možakar vstopi v trgovino in pri mladi prodajalki naroči 10 dag pariškeklobase.\n" +
                        "\n" +
                        "Prodajalka nareže klobaso, jo položi na tehtnico in vpraša: \"12dag je,jo lahko zavijem?\"\n" +
                        "Možakar zavije z očmi: \"Rekel sem 10 dag, prosim, da to upoštevate!\"\n" +
                        "\n" +
                        "Prodajalki ne preostane drugega kakor, da odstrani dve rezini klobase in\n" +
                        "vpraša: \"Devet dag je, bo v redu?\"\n" +
                        "Možak nejevolno zmaja z glavo: Devet ni 10. Rekel sem 10 dag.\"\n" +
                        "Prodajalka doda eno rezino nazaj: \"Ali je lahko 10 dag in pol?\"\n" +
                        "Možakar pa vzroji: \"Ali res moram stokrat ponavljati?! Hočem 10 dag in pika!\"\n" +
                        "\n" +
                        "Prodajalka se nagne k njemu in ga po tiho vpraša: \"Me lahko prosim\n" +
                        "primete za prsi?\"\n" +
                        "\n" +
                        "Možakar je šokiran in zmedeno vpraša: \"Zakaaaj pa zdaj to?\"\n" +
                        "\n" +
                        "Prodajalka pa mirno odvrne: \"Kadar me kdo jebe, mi je všeč, če me zraven\n" +
                        "drži za joške!\"",
                "Pride kmet na banko in želi dvigniti denar z računa. Pobrska po žepih in na dan privleče potrdilo o depozitu.\n" +
                        "Gospa za okencem si ga oglede in reče:\n" +
                        "\"Žal mi je, ampak tega denarja ne morete dvigniti. Je namreč vezan za eno leto.\"\n" +
                        "Kmet se začudi: \"Kako ne morem, če ga pa potrebujem?\"\n" +
                        "\"Ja vezan je, gospod, šele čez eno leto ga boste lahko dvignili,\" mu pojasni uslužbenka.\n" +
                        "Kmet se malo zamisli, potem pa se spomni, da ima še en depozit na drugem računu. Na dan privleče še drugo potrdilo,\n" +
                        "a tudi tukaj se zatakne.\n" +
                        "\"Zelo mi je žal, veste, ampak tudi ta denar je vezan. Šele čez dve leti ga boste lahko dvignili.\"\n" +
                        "\"Kako to mislite vezan?\"\n" +
                        "\"Ja vezan je, gospod, in to pomeni, da ga v tem trenutku ne morete dvigniti.\"\n" +
                        "Kmet že precej nejevoljno reče: \"Ampak jaz moram odplačati dolgove in nujno potrebujem ta denar sedaj.\"\n" +
                        "Uslužbnenka za okencem spredvidi, da bo preprostemu možaku težko razložiti vse skupaj, zato predlaga drugačno rešitev:\n" +
                        "\"Gospod, vi ste kmet, kajneda? Kaj pa če bi poskusili upniku plačati kako drugače? Recmo… ali imate jajca? Morda bi šlo pa na ta način?\"\n" +
                        "Kmet jo za daljši trenutek pogleda, potem pa reče:\n" +
                        "\"Da, imam jajca. Ampak veste, so vezana ",
                "Zakaj po dobrem seksu ne moremo zaspati?\n" +
                        "Ker moramo vstati in oditi domov. ",
                "Arestant po 15 letih zbeži iz zapora.\n" +
                        "\n" +
                        "Vdre v hišo, da bi našel hrano in orožje, in naleti na par v postelji.\n" +
                        "Ukaže moškemu, naj zleze iz nje, in ga priveže na stol, žensko pa priveže na posteljo, jo poljubi na vrat, vstane in odide v kopalnico.\n" +
                        "Medtem mož reče ženi: \"Poslušaj, ta tip je pobegli zapornik. Verjetno je bil dolgo v zaporu in že leta ni videl ženske.\n" +
                        "Videl sem, kako je poljubil tvoj vrat.\n" +
                        "Če bo želel seksati s tabo, se mu ne upiraj in se ne pritožuj, samo naredi, kar hoče.\n" +
                        "Bodi močna, draga. Ljubim te.\"\n" +
                        "\n" +
                        "Žena mu odgovori:\n" +
                        "\"Ni poljubil mojega vratu, na uho mi je zašepetal, da je gej in da se mu zdiš seksi, in me vprašal, ali imava kaj vazelina.\n" +
                        "Rekla sem mu, da je v kopalnici.\n" +
                        "Bodi močen, dragi. Tudi jaz te ljubim.\" ",
                "Dekle s čudovitim telesom je tik pred tem, da jo operirajo. Lezi na\n" +
                        "gibljivi postelji, povsem gola, na njej je le rjuha. Medicinska sestra jo\n" +
                        "pripelje do vrat operacijske sobe in vstopi, da bi preverila, ali je ze\n" +
                        "vse pripravljeno.\n" +
                        "Po hodniku k punci pristopi mož v belem, privzdigne rjuho, si ogleduje\n" +
                        "njeno telo in nato stopi se po enega tipa v belem. Tudi ta privzdigne\n" +
                        "rjuhico, pozorno analizira. Pride se tretji, ki je že bolj drobnogleden kot \n" +
                        "prejšnja dva. Dekle naposled izgubi potrpljenje:\n" +
                        "\n" +
                        "\"Super, da me tako natančno pregledujete, toda zanima me, kdaj me boste\n" +
                        "ze enkrat operirali??\"\n" +
                        "\n" +
                        "Eden izmed trojice skomigne:\"Ne vem, mi samo malamo hodnik.",
                "- Ati, ati, kako sem jaz prišel na svet??\n" +
                        "\n" +
                        "- Jaaa ... veš, štorklja te je prinesla. - Uuuu, ati, kwa si ti vse jebu!?",
                "So se dogovorile tri prijateljice, da bodo svojim dragim pripravile presenečenje.\n" +
                        "\n" +
                        "Oblekle so se v sado-mazo črne oprijete usnjene jakne, črne tange, štikle, črne preveze čez oči in vse kar pač zraven paše. Pa da vidijo kaj bo.\n" +
                        "\n" +
                        "Prva je imela ljubimca, druga zaročenca, tretja pa je bila že kar nekaj let poročena. Čez nekaj dni se srečajo in...\n" +
                        "\n" +
                        "Tista z ljubimcem: \" ej stara, ko mej zagledu je čist znoru, je reku da sem ženska njegovega življenja in pol stara, sva sekala ceeellooo noč pa še dopoldne...\" Zaročenka: \" ja itak, ko me je zagledu me je pograbu pa sva seksala kot mlada zajčka.\"\n" +
                        "\n" +
                        "In tista poročena: \" ma ja , ko je prišel s šihta, me je najprej vprašujoče pogledal ,potem pa dejal: ''Hej, Zorro kva je pa za večerjo??''",
                "Starejša gospa gre h župniku, da se izpove in mu reče: \"Joj gospod župnik kako pogrešam sex!\"\n" +
                        "\n" +
                        "in župnik ji odgovori: \"Na onem svetu boš imela toliko sexa, kolikor boš hotela.\"\n" +
                        "\n" +
                        "Ženska gre malo razočarana iz cerkve, pride do mosta, ko se ji porodi ideja, da bi se vrgla z mosta na avtocesto in tako prišla do sexa. Spleza preko ograje in skoči. Ravno v tistem trenutku se pripelje tovarnjak z bananami in ženska zleti na banane. Ko pride k sebi je vse temno okrog nje, začne otipavati okoli sebe in vzhičeno reče: \"Počasi fantje počasi..., vsi pridete na vrsto,..",
                "Mož in žena praznujeta 30. obletnico poroke. Odločita se, da bosta ponovila poročno potovanje. In res se odpravita na pot. Ko se peljeta po neki cesti na podeželju, ob kateri je ograja za krave, žena reče: \"Kaj če bi zdaj naredila tisto, kar sva pred 30 leti?\" Mož ustavi avto in naslonita se na ograjo ter začneta seksat. Ko končata, mož reče ženi: \"Pred 30 leti pa nisi tolk migala.\" Žena mu odgovori: \"Pred 30 leti ograja še ni bla električna.\"",
                "So bili trije pedri na nočnem prekooceanskem letu. Pa reče prvi: \"Kaj, ko bi me vidva nabrisala?\"\n" +
                        "\n" +
                        "\"Si nor, bo kdo videl!\" \"Ma nobeden, saj vsi spijo.\" \"Bo pa kdo slišal in se zbudil, verjetno je pa vsaj stevardesa budna!!\"\n" +
                        "\n" +
                        "\"Nobeden, bosta videla!\" In začne klicati: \"Bi lahko dobil kozarec vode!\" In nič se ni zgodilo. \"BI LAHKO DOBIL KOZAREC VODE, KER MI JE SLABO!!\"\n" +
                        "\n" +
                        "In spet se ni nič zgodilo. \"No vidiš, nobeden se ne zbudi, sedaj me pa kar po vrsti naguzita.\"\n" +
                        "\n" +
                        "Zgodaj zjutraj gre stevardesa po avionu in opazi starčka, ki se trese od mraza. \"Gospod, vam je hladno?\" \"Ma, zebe me kot psa!\" \"Zakaj pa niste poklicali in prosili za odejo?\" \"Ha, je eden klical in prosil za vodo, pa so ga potem celo noč jebali!!\"",
                "Se poročita 80-letnik in 20-letnica. Po nekaj mesecih se jima rodi otrok in sestra v porodnišnici vpraša očeta: To je nemogoče. Kako vam je to uspelo pri teh letih? Pa ji odgovori: \"Star motor je treba negovati.\" Zgodba se po kakem letu ponovi. Še drugo rojstvo.\n" +
                        "\n" +
                        "Sestra ponovno: \"Ne morem verjeti. Kako vam je lahko spet uspelo?\" Pa 80-letnik spet ponosno: \"Star motor je treba negovati.\"\n" +
                        "\n" +
                        "Naslednje leto pa že tretje rojstvo. Sestra: \"Ste pa res možakar!\"\n" +
                        "\n" +
                        "Srečni oča: \"Star motor je treba negovati\", ji odgovori. Sestra pa pripomni: \"Samo sedaj je pa že čas, da zamenjate olje, ker je vaš tretji otrok črn!\"",
                "Babica stara 98 let lezi na smrtni postelji in zeli se pred smrtjo razkriti 99 letnemu mozu, ki sedi zalosten ob njeni postelji, še zadnjo skrivnost. Gerardo, moj mali Gege, preden bom za vedno zatisnila oci, ti zelim razodeti mojo skrivnost. Pojdi na skedenj in pod tretjim stebrom na levi strani strehe, bos nasel dve skatlji in jih prinesi. Gerardo gre na skedenj in se po petih minutah vrne nosec v rokah dve skatlji.\n" +
                        "\n" +
                        "V prvi najde tri jajca, v drugi pa 250,000,00 evrov, kar oci se mu razsvetljijo. Povej mi moja draga, kaj pomenijo ta tri jajca. Ves Gerardo, porocena sva ze 78 let, in vsakic ko sva seksala in jaz nisem dosegla orgazma, sem polozola v skatljo eno jajco. Gerardo postane izredno zadovoljen in ponosen, v 78 letih ni uspel zadovoljiti svoje zene samo trikrat, nato pa se vprasa: in kaj pomeni 250,000,00 evrov?\n" +
                        "\n" +
                        "Oh, vsakikrat, ko sem napolnila škatljo z dvanajstimi jajci, sem jih šla prodati na tržnico.",
                "Na sprehajališču dregne študent prijatelja:\n" +
                        "\"Ali vidiš tisto v mini krilu na oni strani ceste?\"\n" +
                        "\"Vidim, dobra mačka. Kaj je z njo?\"\n" +
                        "\"Z njo sem že večkrat spal...\"\n" +
                        "\"Res? Kje pa?\"\n" +
                        "\"Na predavanjih.",
                "Duhovnik iz male slovenske vasi je bil velik ljubitelj ptic,\n" +
                        "ki jih je skrbno čuval v kletki za cerkvijo.\n" +
                        "Neko nedeljsko jutro je ob običajnem sprehodu med perjadjo opazil,\n" +
                        "da je izginil njegov najlepši ptič in ker je vedel, da ga je moral ukrasti\n" +
                        "nekdo tik pred mašo, se je odločil nagovoriti svoje vernike.\n" +
                        "'Kdo ima tiča?!'\n" +
                        "Vstali so vsi moški.\n" +
                        "'Ne, nisem mislil tako.\n" +
                        "Je kdo videl tiča?'\n" +
                        "Vstale so vse ženske.'\n" +
                        "Ne, ne, tudi tega nisem mislil.\n" +
                        "Je kdo videl tiča, ki mu ne pripada?'\n" +
                        "Vstala je polovica žensk.\n" +
                        "'Neeee, ne in ne, mislil sem ali je kdo videl MOJEGA tiča?\n" +
                        "Vstali so ministranti, dva duhovnika in koza.\n" +
                        "Neee mislil sem ali ima kdo zdaj tiča v rokah?\n" +
                        "Vstala je punca v zadnji klopi in rekla fantu. 'Sm ti rekla, da bo vidu!' ",
                "- Gospod župnik, grešila sem !\n" +
                        "- Povej, dete moje, svoj greh. \n" +
                        "- Nosim prekratko mini krilo.\n" +
                        "- No, saj to pa ni tak greh.\n" +
                        "- Ampak, gospod župnik, jaz spodaj ne nosim hlačk.\n" +
                        "- Jezus Marija, to je pa hud greh. Za pokoro zmoli tri Oče naše,\n" +
                        "tri Zdrava Marije pa še deset prevalov po sredini cerkve boš naredila! ",
                "France Prešeren – Dominus vobiscum (Gospod z vami)\n" +
                        "\n" +
                        "Oče Janez ječmen seje,\n" +
                        "tam na polju pr’ Ljubljan’,\n" +
                        "mim’ se vandrovček prismeje,\n" +
                        "sam presveti Kozmijan.\n" +
                        "\n" +
                        "Prav prijazno ga pozdravi:\n" +
                        "”Kaj pa delaš Janez tu?!”\n" +
                        "Janez pa je slabe volje:\n" +
                        "”Kurc te gleda!” reče mu.\n" +
                        "\n" +
                        "”Kaj svetnika kurc bi gledal!”\n" +
                        "reče sveti Kozmijan.\n" +
                        "”Bom naredil coprnijo,\n" +
                        "da bo svet v pokoro djan!”\n" +
                        "\n" +
                        "Komaj misli te izreče,\n" +
                        "z njive kurci poženo.\n" +
                        "Janez brž po Katro teče:\n" +
                        "”Katra, Katra kaj bo to?”\n" +
                        "\n" +
                        "Katra ven iz kajže teče,\n" +
                        "vid’ na njiv’ soldate stat,\n" +
                        "od veselja si jo mane:\n" +
                        "”Moj ga ‘ma t’ko sam za scat!”\n" +
                        "\n" +
                        "Katra prvega natakne\n" +
                        "gori doli vzdihujoč.\n" +
                        "Niti enkrat ji ne zmakne,\n" +
                        "z njim jo drajsa celo noč.\n" +
                        "\n" +
                        "Drugo jutro polna njiva\n" +
                        "samih strumnih je devic,\n" +
                        "vse počepa in poriva,\n" +
                        "saj na svet je dost’ prasic.\n" +
                        "\n" +
                        "Izmed vseh ljubljanske frajle\n" +
                        "najbolj vnetih so pizda,\n" +
                        "zaslužile bi kolajne,\n" +
                        "znajo fukat kar za dva.\n" +
                        "\n" +
                        "Sem prišle so na kurbanje,\n" +
                        "tud’ Ljubljančanke gospe,\n" +
                        "najdeb’lejši so le zanje,\n" +
                        "da se v pizdah ne zgube.\n" +
                        "\n" +
                        "Jel’ to morje Adrijansko,\n" +
                        "ki tak strašno valovi.\n" +
                        "Ne, to pizdovje je ljubljansko,\n" +
                        "ki na kurcih se besni.\n" +
                        "\n" +
                        "Sred največje kurbarije\n" +
                        "pride mimo coprn’ca,\n" +
                        "pa si zmisli coprnijo,\n" +
                        "da bi stvar še lažje šla.\n" +
                        "\n" +
                        "”Stojte pizde nenasitne!\n" +
                        "Kaj nek fukate čepe?\n" +
                        "Zmatrajo se žile ritne,\n" +
                        "lepš’ porivat je leže.\n" +
                        "\n" +
                        "Kurce ven iz zemlje spul’te\n" +
                        "in zavijte jih v papir.\n" +
                        "Z njim doma si pizde gul’te,\n" +
                        "da bo rit imela mir.\n" +
                        "\n" +
                        "Reci:”Dominus vobiscum!”\n" +
                        "dominus ti v pizdo skoč’,\n" +
                        "pa boš imela svoj pritiskum,\n" +
                        "k’ te bo drajsal celo noč.\n" +
                        "\n" +
                        "Kadar pride ti zastoči:\n" +
                        "”Etkum spiritus tuo!”\n" +
                        "Dominus ti iz ritke skoči\n" +
                        "požegnavši te z vodo.\n" +
                        "\n" +
                        "Ženske so tako storile,\n" +
                        "kurc pod pajsko pa domov,\n" +
                        "kar naprej so se gonile,\n" +
                        "furt na furt jih je bezov.\n" +
                        "\n" +
                        "Pele dominus so rano,\n" +
                        "pele dominus zvečer.\n" +
                        "Vse po poslah je poscano,\n" +
                        "dominus je huda zver.\n" +
                        "\n" +
                        "Tudi Katra s svojim leže\n" +
                        "in nastavi si ga v rit.\n" +
                        "Dominus ji koj postreže,\n" +
                        "tri dni se je nič ne vid.\n" +
                        "\n" +
                        "Še četrti in še peti\n" +
                        "Katra v luštih izdrži.\n" +
                        "A deveti in deseti\n" +
                        "pizda več je ne srbi.\n" +
                        "\n" +
                        "Že sta tedna dva minila,\n" +
                        "Katra je že čisto preč,\n" +
                        "je besede pozabila,\n" +
                        "da b’ je kurc ne fukal več.\n" +
                        "\n" +
                        "Dominus pa kar poriva,\n" +
                        "ne minute ni pr’ mir’.\n" +
                        "Katra je napol še živa,\n" +
                        "pizda kot zmečkan krompir.\n" +
                        "\n" +
                        "Kje si pizdica nekdanja,\n" +
                        "ki si kurce stiskala?\n" +
                        "Razcefrana kakor cunja\n" +
                        "blagor mu k’ spomin ima.\n" +
                        "\n" +
                        "”O nesrečni fuk gol’fivi,”\n" +
                        "še enkrat spregovori.\n" +
                        "Med neštetimi porivi\n" +
                        "bogu dušo izpusti.\n" +
                        "\n" +
                        "Dajo gor jo na te pare,\n" +
                        "ni je več ko par kosti.\n" +
                        "Dominus naprej jih tare,\n" +
                        "moč ustaviti ga ni.\n" +
                        "\n" +
                        "Še ko trugo so zabili,\n" +
                        "spaka je po njej bezov.\n" +
                        "Kmal’ bi trugo iz rok spustili,\n" +
                        "t’ko je butal ob pokrov.\n" +
                        "\n" +
                        "S štriki so jo povezali\n" +
                        "in spustili jo v zemljo.\n" +
                        "Pol so patra poklicali,\n" +
                        "pričak’vali, kaj da bo.\n" +
                        "\n" +
                        "Pater grobu se približa\n" +
                        "sliš’ v jami ropotat,\n" +
                        "od strahu se brž prekriža,\n" +
                        "mal’ ga tudi prime srat.\n" +
                        "\n" +
                        "Pater dominus zapoje,\n" +
                        "hoče Katro poškropit,\n" +
                        "-kurc naj gleda žegne tvoje-\n" +
                        "dominus mu skoči v rit.\n" +
                        "\n" +
                        "K sreči mežnar se požuri:\n" +
                        "”Etkum spiritus tuo!”\n" +
                        "Dominus jo z rit odkuri,\n" +
                        "več nazaj ga ni bilo.\n" +
                        "\n" +
                        "Katra v grobu mir uživa,\n" +
                        "moli zanjo če s’ kristjan.\n" +
                        "”Vsega zla je pizda kriva!”\n" +
                        "pravi sveti Kozmijan.",
                "Velika razširjena abeceda\n" +
                        "\n" +
                        "Angeli so zgolj duhovi,\n" +
                        "ajda na jesen zori,\n" +
                        "afna se po drevju goni,\n" +
                        "abrank ji od rit visi.\n" +
                        "\n" +
                        "Beduin živi v puščavi,\n" +
                        "bolhe ti prežene Flit,\n" +
                        "bik najraj čepi na kravi,\n" +
                        "buzerant obrajta rit.\n" +
                        "\n" +
                        "Cankar pisal je romane,\n" +
                        "culukafer žre ljudi,\n" +
                        "cipa z roko si jo mane,\n" +
                        "cura svet pokonc drži.\n" +
                        "\n" +
                        "Čargo zna umetno risat,\n" +
                        "čuk ima iz perja rep,\n" +
                        "časopis za rit je brisat,\n" +
                        "češplja za preprosti jeb.\n" +
                        "\n" +
                        "Drava je široka reka,\n" +
                        "dromedar v puščav gara,\n" +
                        "danka je skladišče dreka,\n" +
                        "debel kurc ponos moža.\n" +
                        "\n" +
                        "Eva v raju je živela,\n" +
                        "Etna bruha spred in zad,\n" +
                        "ekstravuršt ni mortadela,\n" +
                        "embrio še ni soldat.\n" +
                        "\n" +
                        "Faraon ni jedel z žlico,\n" +
                        "fantič hodi k ljubci v vas,\n" +
                        "far poriva kuharico,\n" +
                        "fuk je Kranjcu v kratek čas.\n" +
                        "\n" +
                        "Glista nima domotožja,\n" +
                        "Gandhi shaja tud brez gat,\n" +
                        "gonokok je šiba božja,\n" +
                        "glej, da hodiš redno srat!\n" +
                        "\n" +
                        "Hrček je podoben zajcu,\n" +
                        "Hindenburg je star soldat,\n" +
                        "Harry Piel ma v levem jajcu\n" +
                        "heksenšus kar za zbezlat.\n" +
                        "\n" +
                        "Izidor ovčice pase,\n" +
                        "Ivan Grozni godrnja,\n" +
                        "Ita Rina vleče nase,\n" +
                        "idiot urin grgra.\n" +
                        "\n" +
                        "Jazbec je žival učena,\n" +
                        "Jurčič bil je literat,\n" +
                        "jebaj, če si mož al žena,\n" +
                        "jebaj tud, če si kastrat.\n" +
                        "\n" +
                        "Kiša pada, trava rase,\n" +
                        "kože črne je zamurc,\n" +
                        "kurba se kurba kot prase,\n" +
                        "klincu pravjo tudi kurc.\n" +
                        "\n" +
                        "Lačnemu se srat upira,\n" +
                        "lev ma v džungli svoj kvartir,\n" +
                        "list se z muho onanira,\n" +
                        "lapis peče kot hudir.\n" +
                        "\n" +
                        "Mia Maya ni devica,\n" +
                        "mrko gleda policist,\n" +
                        "Mussollini je prasica,\n" +
                        "mačkofuk je vsak fašist.\n" +
                        "\n" +
                        "Nobel človek pije whisky,\n" +
                        "netopir ni tič ne miš,\n" +
                        "Nero umrl je na driski,\n" +
                        "nago babo kar nabriš!\n" +
                        "\n" +
                        "Opij pospešuje spanje,\n" +
                        "orden zdaj že vsak ima,\n" +
                        "ozka rit ovira sranje,\n" +
                        "oslu manjka dar duha.\n" +
                        "\n" +
                        "Pes brez gobca nima ksihta,\n" +
                        "pop ti grehe odpusti,\n" +
                        "pezdec je prikrita rihta,\n" +
                        "prdec rad spregovori.\n" +
                        "\n" +
                        "Rana ura – zlata ura!\n" +
                        "Roparja se je za bat,\n" +
                        "ritni fuk je sinekura,\n" +
                        "Rin Tin Tin ma kuzle rad.\n" +
                        "\n" +
                        "Sonce greje vso naravo,\n" +
                        "samski stan – najlepši stan!\n" +
                        "Sekt je za ta boljš zabavo,\n" +
                        "siflo fenta salvarzan.\n" +
                        "\n" +
                        "Španska muha dviga tiča,\n" +
                        "ščurke išči po pečeh,\n" +
                        "šimel spada med konjiče,\n" +
                        "šlatanje je smrtni greh.\n" +
                        "\n" +
                        "Tank se ne boji kamele,\n" +
                        "tempelj je molitve hram,\n" +
                        "troti fukajo čebele,\n" +
                        "Tarzan si ga goni sam.\n" +
                        "\n" +
                        "Ura čas nam bije točna,\n" +
                        "Urša se konča na »a«,\n" +
                        "uš žival je krvoločna,\n" +
                        "Urha kliče, kdor kozla.\n" +
                        "\n" +
                        "Vrat na štriku, to ni šala,\n" +
                        "vamp rumen ma vsak Kitajc,\n" +
                        "Venera je rit kazala,\n" +
                        "vol je bik, ki nima jajc.\n" +
                        "\n" +
                        "Zora puca – bit će dana!\n" +
                        "Zlodju pravjo tud hudič,\n" +
                        "zadnjica je včas usrana,\n" +
                        "zmeren fuk ne škodi nič.\n" +
                        "\n" +
                        "Žulj preživlja revne sloje,\n" +
                        "žrebca jaše kanonir,\n" +
                        "žalostno je srce moje,\n" +
                        "žaltav je od pizde sir!"




        };

}
