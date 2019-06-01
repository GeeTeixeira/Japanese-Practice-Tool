/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiragana;

/**
 *
 * @author guilhermeteixeira
 */
public class Hiragana {

    public static String[][] romanji(){
    String[][] romanji = {{"a","i","u","e","o"},
                           {"ka","ki","ku","ke","ko"},
                           {"sa","shi","su","se","so"},
                           {"ta","chi","tsu","te","to"},
                           {"na","ni","nu","ne","no"},
                           {"ha","hi","fu","he","ho"},
                           {"ma","mi","mu","me","mo"},
                           {"ya","yu","yo"},
                           {"ra","ri","ru","re","ro"},
                           {"wa","wo"},
                           {"n"},
                           {"ga","gi","gu","ge","go"},
                           {"za","zi(ji)","zu","ze","zo"},
                           {"da","di(ji)","zu(tsu)","de","do"},
                           {"ba","bi","bu","be","bo"},
                           {"pa","pi","pu","pe","po"}};
        return romanji;
    }
    public static String[][] hiragana(){
    String[][] hiragana = {{"あ","い","う","え","お"},
                           {"か","き","く","け","こ"},
                           {"さ","し","す","せ","そ"},
                           {"た","ち","つ","て","と"},
                           {"な","に","ぬ","ね","の"},
                           {"は","ひ","ふ","へ","ほ"},
                           {"ま","み","む","め","も"},
                           {"や","ゆ","よ"},
                           {"ら","り","る","れ","ろ"},
                           {"わ","を"},
                           {"ん"},
                           {"が","ぎ","ぐ","げ","ご"},
                           {"ざ","じ","ず","ぜ","ぞ"},
                           {"だ","ぢ","づ","で","ど"},
                           {"ば","び","ぶ","べ","ぼ"},
                           {"ぱ","ぴ","ぷ","ぺ","ぽ"}};
            return hiragana;
    }
    public static String[][] hiraganaWords(){
    String[][] hiragana ={{},
		{"あの","いま","えいご","ええ","がくせい","〜ご","こうこう","ごご","ごぜん","〜さい","〜さん","〜じ","〜じん","せんこう",
"せんせい","そうです","そうですか","だいがく",
"でんわ","ともだち","なまえ","なん・なに","にほん","〜ねんせい","はい","はん","ばんごう","りゅうがくせい","わたし","アメリカ","イギリス",
"オーストラりあ","かんこく","スウェーデン","ちゅうごく","かがく",
"アジアけんきゅう","けいざい","こくさいかんけい",
"コンピューター","じんるいがく","せいじ","ビジネス",
"ぶんがく","れきし","しごと","いしゃ","かいしゃいん",
"こうこうせい","しゅふ","だいがくいんせい","だいがくせい",
"べんごし","おかあさん","おとうさん","おねえさん","おにいさん","いもうと","おとうと"},
		{"これ","それ","あれ","どれ","この","その","あの","どの","ここ","そこ","あそこ","どこ","だれ","おいしい","さかな","とんかつ",
"にく","メニュー","やさい","えんぴつ","かさ","かばん","くつ","さいふ","ジーンズ","じしょ","じてんしゃ","しんぶん","Tシャツ","とけい","ノート",
"ペン","ぼうし","ほん","きっさてん","ぎんこう","トイレ","としょかん","ゆうびんきょく","アメリカ","イギリス",
"かんこく","ちゅうごく","けいざい",
"コンピューター","ビジネス","れきし","おかあさん","おとうさん","いくら","〜えん","たかい","いらっしゃいませ","(〜を)おねがいします","（〜を）ください",
"じゃあ","どうぞ","どうも"},
		{"えいが","おんがく","ざっし","スポーツ","デート","テニス","テレビ","アイスクリーム","あさごはん","おさけ","おちゃ",
"コーヒー","ばんごはん","はんばーがー","ひるごはん","みず","いえ","うち","がっこう","あさ","あした","いつ","きょう","〜ごろ","こんばん",
"しゅうまつ","どようび","にちようび","まいにち","まいばん","いく",
"かえる","きく","のむ","はなす","よむ","おきる","食べる","ねる","みる","くる","する",
"べんきょうする","いい","はやい","あまり+Negative",
"ぜんぜん+Negative","たいてい","ちょっと","ときどき","よく","そうですね","でも","どうですか"},
		{"アルバイト","かいもの","クラス","あなた","いす","いぬ","おみやげ","こども","ごはん","しゃしん","つくえ","てがみ","ねこ","ぱん",
"ひと","メール","おてら","こうえん","スーパー","デパート","バスてい","びょういん","ホテル","ほんや","まち","レストラン","きのう","〜じかん",
"いちじかん","せんしゅう","とき","げつようび",
"かようび","すいようび","もくようび","きにょうび","あう","ある","かう","かく","とる","まつ","わかる",
"いる","〜ぐらい","ごめんなさい","だから","たくさん","〜と","どうして","ひとりで"},
		{"うみ","きって","きっぷ","サーフィン","しゅくだい","たべもの","たんじょうび","テスト","てんき","のみもの","はがき","バス","ひこうき",
"へや","ぼく","やすみ","りょこう","あたらしい","あつい","あつい","いそがしい","おおきい","おもしろい","かっこいい","こわい","さむい","たのしい",
"ちいさい","つまらない","ふるい","むずかし","やさしい","やすい","きらいな",
"きれいな","げんきな","しずかな","すきな","だいきらいな","だいすきな",
"にぎやかな","ひまな","およぐ","きく","のる","やる","でかける",
"いっしょに","すごく","それから","だいじょうぶ","とても","どんな","〜まい","〜まで"},
		{"おかね","おふろ","かんじ","きょうかしょ","こんしゅう","シーディー","しみんびょういん","シャワー","つぎ","でんき","でんしゃ",
"にもつ","パソコン","ペーギ","まど","よる","らいしゅう","らいねん","たいへんな","あそぶ","いそぐ","おふろにはいる","かえす","けす","しぬ","すわる",
"たつ","たばこをすう","つかう","てつだう","はいる","もつ",
"やすむ","あける","おしえる","おりる","かりる","しめる",
"シャワーをあびる","つける","でんわをかける","わすれる",
"つれてくる","もってくる","あとで","おそく","〜から","けっこうです",
"すぐ","ほんとうですか","ゆっくり"},
		{"あね","アパート","いもうと","うた","おじいさん","おとうと","おとこのひと","おにいさん","おねえさん","おばあさん",
"おんなのひと","かいしゃ","かぞく","かみ","きょうだい","くち","くに","くるま","ゲーム","コンビニ","サークル","しょくどう","ちち","ディーブイディー",
"はは","め","めがね","あたまがいい","かわいい","せがたかい",
"せがひくい","ながい","はやい","みじかい","しんせつな","べんりな","うたう","かぶる","しる","しっています","しりません","すむ","はく","ふとる","ふとっています",
"かける","くる","つとめる","やせる","やせています","けっこんする",
"〜が","何も+Negative","〜にん","ひとり","ふたり","べつに+Negative","もしもし","もちろん","よかったら"},
		{"あさって","あめ","かいしゃいん","カメラ","カラオケ","くうき","けさ","こくばん","こんげつ","しごと","だいがくせい",
"てんきよほう","ところ","トマト","なつ","なにか","パーティー","バーベキュー","はし","ふゆ","ホームステイ","まいしゅう","らいげつ","じょうずな",
"へたな","ゆうめいな","あめがふる","あらう","いう","いる（〜が）",
"おそくなる","おもう","きる（〜を）","つくる","もっていく","ジロジロみる","すてる",
"はじめる","うんてんする","せんたくする","そうじする","でんわする",
"りょうりする","いつも","ううん","うん","かんぱい","ざんねん（ですね）","〜について","まだ+Negative","みんなで"},
		{"いいこ","いろ","おべんとう","かぶき","ギター","きょねん","くすり","くすりをのむ","コンサート","こんど","さくぶん","しけん","スキ",
"せんげつ","たんご","ピアノ","ピザ","びょうき","あおい","あかい",
"くろい","さびしい","しろい","わかい","いじわるな","おどる","おわる","にんきがある","はじまる","ひく","もらう",
"おぼえる","でる","うんどうする","さんぽする","〜から","ぜひ","ところで","みんな","もう","ひとつ","ふたつ",
"みっつ","よっつ","いつつ","むっつ","ななつ","やっつ","ここのつ","とお"},
		{"あき","いしゃ","えき","おかねもち","かお","きせつ","ぎゅうにゅう","クレジットカード","ケーキ","ことし","サッカー",
"シャツ","しんかんせん","すし","せいかつ","せかい","ちかてつ","てぶくろ","てんぷら","とこや","はる","パンツ","びよういん","びん",
"ふね","やきゅう","ゆうめいじん","よやく","らいがっき","りんご","あたたかい","おそい","すずしい","つめたい","ねむい",
"かんたん","かかる","とまる","なる","はらう","きめる","りょこうする","れんしゅうする","あるいて","いちばん","〜か〜","〜かげつ","〜ご",
"このごろ","〜しゅうかん","〜で","どうやって","どちら","どっち","どのぐらい","〜ねん","はやく"},
		{"オーストラリア","あかし","おしょうがつ","おとこのこ","おまつり","おもちゃ","おんせん","おんなのこ","がいこく","かしゅ","かわ","キャンプ","こちら",
"こんがっき","しゃちょう","じゅぎょう","しょうらい","じんじゃ","つり","ドライブ","ビール","びじゅつかん","ホストファミリー",
"みずうみ","やま","ゆめ","ルームメート","うそをつき","おなかがすく","かう（Pet）","サボる","とる","ならう","のぼる","はたらく","つかれる",
"やめる","けんかする","しょうかいする","ダイエットする","ちこくする","りゅうがくする","あと","しゅっしん","そして","〜だけ","〜てん",
"ひさしぶり","まあまあ","もっと","さっか","ジャーナリスト","けいさつかん","はいゆう","うちゅうひこうし",
"やきゅうせんしゅ","だいとうりょう","じょゆう","かんごし","しょうぼうし","まんがか"},
		{"あし","いみ","おてあらい","おなか","かぜ","かのじょ","かれ","きおん","くもり","しあい","ジュース","せいじ","せいせき","せき",
"のど","は","はな","はれ","ふく","ふつかよい","プレセント","ホームシック","マイナス","もの","ゆき","ようじ","あまい","いたい","おおい","せまい",
"いつごうがわるい","わるい","すてきな","あるく","かぜをひく",
"きょうみがある","なくす","ねつがある","のどがかわく","せきがでる","わかれる","わかれる","きんちょうする","しんぱいする",
"おだいじに","げんきがない","たぶん","できるだけ","〜でしょう","〜ど","にさんいち","〜ので","はじめて","もうすぐ"}};
return hiragana;
    }
    public static String[][] translation(){
        String[][] translation = {{},
		{"um…","now","English(Language)","yes","student","…language","high school","P.M.","A.M.","…years old","Mr./Ms….","o’clock","…people","major","teacher; Professor","That’s right.","I see.; Is that so?","college; university","telephone","friend","name","what","Japan","…year student","yes","half","number","international student","I","U.S.A.","Britain","Australia","Korea","Sweden","China","science","Asian studies","economics","international relations","computer","anthropology","politics","business","literature","history","job; work; occupation","doctor","office worker","high school student","housewife","graduate student","college student","lawyer","mother","father","older sister","older brother","younger sister","younger brother"},
		{"this one","that one","that one (over there)","which one","this…","that…","that…(over there)","which…","here","there","over there","where","who","delicious","fish","pork cutlet","meat","menu","vegetable","pencil","umbrella","bag","shoes","wallet","jeans","dictionary","bicycle","newspaper","T-shirt","watch; clock","notebook","pen","hat; cap","book","cafe","bank","toilet; restroom","library","post office","U.S.A.", "Britain","Korea","China","economics","computer","business","history","mother","father","how much","…yen","expensive; high","Welcome (to our store).","…, please.","Please give me…","then…; if that is the case, …","Please.; Here it is.","Thank you."},
		{"movie","music","magazine","sports","date (romantic, not calendar)","tennis","TV","ice cream","breakfast","sake; alcohol","green tea","coffee","dinner","hamburger","lunch","water","home; house","home; house; my place","school","morning","tomorrow","when","today","at about…","tonight","weekend","Saturday","Sunday","every day","every night","to go","to go back; to return","to listen; to hear","to drink","to speak; to talk","to read","to get up","to eat","to sleep; to go to sleep","to see; to look at; to watch","to come","to do","to study","good","early","not much","not at all","usually","a little","sometimes","often; much","That’s right.; Let me see.","but","How about…?; How is…?"},
		{"part-time job","shopping","class","you","chair","dog","souvenir","child","rice; meal","picture; photograph","desk","letter","cat","bread","person","e-mail","temple","park","supermarket","department store","bus stop","hospital","hotel","bookstore","town; city","restaurant","yesterday","…hours","one hour","last week","when…; at the time of…","Monday","Tuesday","Wednesday","Thursday","Friday","to meet; to see (a person)","there is…(thing)","to buy","to write","to take","to wait","to understand","is in…; stays at…","about(approximate measurement)","I’m sorry.","so; therefore","many; a lot","together with (a person)","why","alone"},
		{"sea","postal stamps","ticket","surfing","homework","food","birthday","test","weather","drink","postcard","bus","airplane","room","I (used by men)", "holiday; day off; absence","travel","new","hot (weather)","hot (things)","busy (people/days)","large","interesting; funny","good-looking (conjugates like いい)","frightening","cold (weather only)","fun","small","boring","old (things – not used for people)","difficult","easy (problem); kind (person)","inexpensive; cheap (thing)","disgusted with; to dislike","beautiful; clean","healthy; energetic","quiet","fond of; to like","to hate","very fond of; to love","lively","not busy; to have a lot of free time","to swim","to ask","to ride; to board","to do; to perform","to go out","together","extremely","and then","It’s ok.; Not to worry.; Everything is under control.", "very","what kind of…","[counter for flat objects]","to (a place); as far as (a place); till (a time)"},
		{"money","bath","kanji; Chinese character","textbook","this week","CD","municipal hospital","shower","next","electricity","train","baggage","personal computer","page","window","night","next week","next year","tough (situation)","to play; to spend time pleasantly","to hurry","to take a bath","to return (a thing)","to turn off; to erase","to die","to sit down","to stand up","to smoke","to use","to help","to enter","to carry; to hold","to be absent (from…); to rest","to open (something)","to teach; to instruct","to get off","to borrow","to close (something)","to take a shower","to turn on","to make a phone call","to forget; to leave behind","to bring (a person)","to bring (a thing)","later on","(do something) late","because…","That would be fine.; That wouldn’t be necessary. ","right away","Really?","slowly; leisurely; unhurriedly"},
		{"(my) older sister","apartment","younger sister","song","grandfather; old man","younger brother","man","older brother","older sister","grandmother; old woman","woman","company","family","hair","brothers and sisters (siblings)","mouth","country; place of origin","car","game","convenience store","club activity","cafeteria; dininng commons","(my) father","DVD","(my) mother","eye","glasses","bright; smart; clever","cute","tall (stature)","short (stature)", "long","fast","short (length)","kind","convenient","to sing","to put on (a hat)","to get to know","I know","I do not know","to live","to put on (items below your waist)","to gain weight","to be on the heavy side","to put on (glasses)","to put on (clothes above your waist)","to work for","to lose weight","to be thin","to get married","…, but","not… anything","[counter for people]","one person","two people","nothing in particular","Hello? (used on the phone)","of course","if you like"},
		{"the day after tomorrow","rain","office worker","camera","karaoke","air","this morning","blackboard","this month","job; work; occupation","college student","weather forecast","place","tomato","summer","something","party","barbecue","chopsticks","winter","homestay; living with local family","every week","next month","skillfull; good at…","clumsy; poor at…","famous","it rains","to wash","to say","to need","to be late","to think","to cut","to make","to take (a thing)","to stare (at…)","to throw away","to begin","to drive","to do laundry","to clean","to call","to cook","always","uh-uh; no","uh-huh; yes","Cheers! (a toast)","That’s too bad.","about…; concerning…","not… yet","all (of the people) together"},
		{"good child","color","boxed lunch","kabuki; traditional Japanese theatrical art","guitar","last year","medicine","to take medicine","concert","near future","essay; composition","exam","ski","last month","word; vocabulary","piano","pizza","illness; sickness","blue","red","black","lonely","white","young","mean-spirited","to dance","(somethng) ends","to be popular","(something) begins","to play (a string instrument or piano)","to get (from somebody)","to memorize","(1)to appear; to attend(〜に); (2) to exit （〜を）","to do physical exercise","to take a walk","from…","by all means","by the way","all","already","one","two","three","four","five","six","seven","eight","nine","ten"},
		{"fall","doctor","station","rich person","face","season","milk","credit card","cake","this year","soccer","shirt","Bullet Train","sushi","life; living","world","subway","gloves","tempura","barber’s","spring","pants","beauty parlor","flight","ship; boat","baseball","celebrity","reservation","next semester","apple","warm","slow; late","cool (weather – not used for things)","cool (things/people)","sleepy","easy; simple","to take (amount of time/money)","to stay (at a hotel, etc.)","to become","to pay","to decide","to travel","to practice","on foot","best","or","for… months","in… time; after…","these days","for… weeks","by (means of transportation); with (a tool)", "how; by what means","which","which","how much; how long","…years","(do something) early; fast"},
                {"Australia","sacks; sweets","New Year’s","boy","festival","toy","spa; hot spring","girl","foreign country","singer","river","camp","this person (polite)","this semester","president of a company","class","future","shrine","fishing","drive","beer","art museum","host family","lake","mountain","dream","roommate","to tell a lie","to become hungry","to own (a pet)","to cut (classes)","to take (a class); to get (a grade)","to learn","to climb","to work","to get tired","to quit","to have a fight; to quarrel","to introduce","to go on a diet","to be late (for an appointment)","to study abroad","after (an event)","coming from","and then","just…; only…","…points","it has been a long time","okay; so-so","more","writer","journalist","police officer","actor; actress","astronaut","baseball player","president of a country","actress","nurse","firefighter","cartoonist"},
		{"leg; foot","meaning","restroom","stomach","cold","girlfriend; she","boyfriend; he","temperature (weather – not used for things)","cloudy weather","match; game","juice","politics","grade (on a test, etc.)","cough","throat","tooth","flower","sunny weather","clothes","hangover","present","homesickness","minus","thing (concrete object)","snow","business to take care of","sweet","hurt; painful","there are many…","narrow; not spacious","inconvenient; to have a scheduling","conflict","bad","nice","to walk","to catch cold","to be interested (in…)","to lose","to have a fever","to become thirsty","to cough","to break up; to separate","to get nervous","to worry","Get well soon.","don’t look well","probably; maybe","as much as possible","probably; …,right?","…degrees (temperature)","for two to three days","because…","for the first time","very soon; in a few moments/days"}};

        return translation;
    }
    public static String[][] katakana(){
        String[][] katakana = {{"ア","イ","ウ","エ","オ"},
                               {"カ","キ","ク","ケ","コ"},
                               {"サ","シ","ス","セ","ソ"},
                               {"タ","チ","ツ","テ","ト"},
                               {"ナ","ニ","ヌ","ネ","ノ"},
                               {"ハ","ヒ","フ","ヘ","ホ"},
                               {"マ","ミ","ム","メ","モ"},
                               {"ヤ","ユ","ヨ"},
                               {"ラ","リ","ル","レ","ロ"},
                               {"ワ","ヲ"},
                               {"ン"},
                               {"ガ","ギ","グ","ゲ","ゴ"},
                               {"ザ","ジ","ズ","ゼ","ゾ"},
                               {"ダ","ヂ","ヅ","デ","ド"},
                               {"バ","ビ","ブ","ベ","ボ"},
                               {"パ","ピ","プ","ペ","ポ"}};
        return katakana;
    }
    public static String[][] kanjiMeaning(){
        String[][] kanji = {{},
{},
{},
{"one*","two*","three*","four*","five*","six*","seven*","eight*","nine*","ten*","hundred*","thousand*","ten thousand*","Yen; circle*","time*"},
{"day; sun*","book; basis*","person*","moon; month*","fire*","water*","tree*","gold; money*","soil*","week day*","up*","down*","middle*","half*"},
{"mountain*","river*","origin*","spirit*","heaven*","I*","now*","rice field*","woman*","man*","to see*","to go*","to eat*","to drink*"},
{"east*","west*","south*","north*","mouth*","to exit*","right*","left*","minute; to divide*","ahead*","birth*","big*","learning*","outside*","country*"},
{"capital*","child*","small*","to meet*","company*","father*","mother*","high*","school*","every*","word*","sentence*","to return*","to enter*"},
{"member*","new*","to listen*","to make*","to serve*","thing*","electricity*","car*","to rest*","to say*","to read*","to tink*","next*","Nani?!*"},
{"noon*","after*","before*","name*","white*","rain*","to write*","friend*","between*","house*","to speak*","little*","old*","to know*","to come*"},
{"to live*","right (used in New Year’s)*","year*","to sell*","to buy*","town*","long*","way*","snow*","to stand*","self*","night*","morning*","to hold*"},
{"hand*","paper*","favorite; to like*","near*","bright*","ill; sick*","institution*","to reflect*","picture*","to sing*","city*","place*","to make efforts*","strong*","to exist*","travel*"},
{"ancient times*","symbol of kanji repetition*","God*","early*","to get up*","cow*","to use*","to work*","to link*","to separate*","time; degress*","red*","blue*","color*"}};

        
        return kanji;
    }
    public static String[][] kanji(){
        String[][] kanji = {{},
{},
{},
{"一","二","三","四","五","六","七","八","九","十","百","千","万","円","時"},
{"日","本","人","月","火","水","木","金","土","曜","上","下","中","半"},
{"山","川","元","気","天","私","今","田","女","男","見","行","食","飲"},
{"東","西","南","北","口","出","右","左","分","先","生","大","学","外","国"},
{"京","子","小","会","社","父","母","高","校","毎","語","文","帰","入"},
{"員","新","聞","作","仕","事","電","車","休","言","読","思","次","何"},
{"午","後","前","名","白","雨","書","友","間","家","話","少","古","知","来"},
{"住","正","年","売","買","町","長","道","雪","立","自","夜","朝","持"},
{"手","紙","好","近","明","病","院","映","画","歌","市","所","勉","強","有","旅"},
{"昔","々","神","早","起","牛","使","働","連","別","度","赤","青","色"}};
return kanji;
    }
    
    
    public static String findChar(String[][] romanji){
        
        int revealList, revealIndex;
        String currentChar = "  ";
        
        for(int i = 0;i<romanji.length;i++){
                for(int n = 0; n <romanji[i].length;n++){
                    if (currentChar.equals(String.valueOf(romanji[i][n]))){
                        revealList = i;
                        revealIndex = n;
                        break;
                    }
                }
            }
        
        
        return currentChar;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
