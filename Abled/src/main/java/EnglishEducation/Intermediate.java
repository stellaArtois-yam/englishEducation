package EnglishEducation;

import java.util.Arrays;
import java.util.Collections;

public class Intermediate extends Basic{

	
	
	String words1[][] = {
			{"inform", "알리다"},
			{"advise", "충고하다"},
			{"service", "서비스"},
			{"provide", "제공하다"},
			{"behave", "행동하다"},
			{"improve", "향상시키다"},
			{"individual", "개인"},
			{"require", "요구하다"},
			{"develop", "개발하다"},
			{"social", "사회의"},
			{"amount", "양"},
			{"employ", "고용하다"},
			{"terrible", "끔찍한"},
			{"attitude", "태도"},
			{"research", "연구"},
			{"audience", "청중"},
			{"volunteer", "지원자"},
			{"influence", "영향을 끼치다"},
			{"international", "국제적인"},
			{"opportunity", "기회"}};
	
	
	String words2[][] = {
			{"ability", "능력"},
			{"expense", "지출"},
			{"involve", "포함하다"},
			{"stress", "강조하다"},
			{"therefore", "그러므로"},
			{"average", "평균"},
			{"ride", "타다"},
			{"local", "지역의"},
			{"encourage", "격려하다"},
			{"determine", "결정하다"},
			{"comfort", "편안"},
			{"consume", "소비하다"},
			{"object", "물체"},
			{"impress", "깊은 인상을 주다"},
			{"available", "쓸모있는"},
			{"contain", "포함하다"},
			{"revenue", "수입"},
			{"recognize", "인지하다"},
			{"material", "재료"},
			{"positive", "긍정적인"}};
	
	
	String words3[][] = {
			{"emotion", "감정"},
			{"amaze", "놀라게 하다"},
			{"level", "수준"},
			{"discover", "발견하다"},
			{"essence", "본질"},
			{"benefit", "이익"},
			{"affect", "영향을 미치다"},
			{"reduce", "줄이다"},
			{"chemistry", "화학"},
			{"immediate", "즉각적인"},
			{"thus", "따라서"},
			{"consequently", "결과적으로"},
			{"hence", "이에 따라서"},
			{"accordingly", "따라서"},
			{"proper", "적절한"},
			{"profession", "직업"},
			{"economic", "경제의"},
			{"cell", "세포"},
			{"focus", "집중하다"},
			{"issue", "발행물"}};
	
	
	String words4[][] = {
			{"poetry", "시"},
			{"demand", "수요"},
			{"occur", "발생하다"},
			{"complex", "복잡한"},
			{"define", "정의하다"},
			{"proud", "자랑스러워하는"},
			{"aware", "알고 있는"},
			{"participate", "참여하다"},
			{"fashion", "유행"},
			{"package", "포장하다"},
			{"disappear", "사라지다"},
			{"career", "경력"},
			{"secure", "안전한"},
			{"despite", "~에도 불구하고"},
			{"background", "배경"},
			{"generate", "발생시키다"},
			{"eventually", "결국"},
			{"decrease", "감소하다"},
			{"recycle", "재활용하다"},
			{"desire", "욕망"}};
	
	
	String words5[][] = {
			{"balance", "균형을 이루다"},
			{"publish", "출판하다"},
			{"congratulate", "축하하다"},
			{"compose", "구성하다"},
			{"follow", "따라가다"},
			{"negative", "부정적인"},
			{"occasion", "경우"},
			{"replace", "대체하다"},
			{"expert", "전문가"},
			{"term", "관점"},
			{"relieve", "안도시키다"},
			{"describe", "표현하다"},
			{"biology", "생물학"},
			{"due", "만기의"},
			{"equipment", "장비"},
			{"account", "계좌"},
			{"birth", "탄생"},
			{"constant", "일정한"},
			{"genius", "천재"},
			{"frequent", "잦은"}};

	
	String wordsT[][] = {{"inform", "알리다"},{"advise", "충고하다"},{"service", "서비스"},{"provide", "제공하다"},
			{"behave", "행동하다"}, {"improve", "향상시키다"}, {"individual", "개인"}, {"require", "요구하다"},
			{"develop", "개발하다"},{"social", "사회의"},{"amount", "양"},{"employ", "고용하다"},{"terrible", "끔찍한"},
			{"attitude", "태도"},{"research", "연구"},{"audience", "청중"},{"volunteer", "지원자"},{"influence", "영향을 끼치다"},
			{"international", "국제적인"},{"opportunity", "기회"},{"ability", "능력"},{"expense", "지출"},{"involve", "포함하다"},
			{"stress", "강조하다"},{"therefore", "그러므로"},{"average", "평균"},{"ride", "타다"},{"local", "지역의"},
			{"encourage", "격려하다"},{"determine", "결정하다"},{"comfort", "편안"},{"consume", "소비하다"},{"object", "물체"},
			{"impress", "깊은 인상을 주다"},{"available", "쓸모있는"},{"contain", "포함하다"},{"revenue", "수입"},{"recognize", "인지하다"},
			{"material", "재료"},{"positive", "긍정적인"},	{"emotion", "감정"}, {"amaze", "놀라게 하다"},{"level", "수준"},
			{"discover", "발견하다"},{"essence", "본질"},{"benefit", "이익"},{"affect", "영향을 미치다"},{"reduce", "줄이다"},
			{"chemistry", "화학"},{"immediate", "즉각적인"},{"thus", "따라서"},{"consequently", "결과적으로"},{"hence", "이에 따라서"},
			{"accordingly", "따라서"},{"proper", "적절한"},{"profession", "직업"},{"economic", "경제의"},{"cell", "세포"},
			{"focus", "집중하다"},{"issue", "발행물"},{"poetry", "시"},{"demand", "수요"},{"occur", "발생하다"},{"complex", "복잡한"},
			{"define", "정의하다"},{"proud", "자랑스러워하는"},{"aware", "알고 있는"},{"participate", "참여하다"},
			{"fashion", "유행"},{"package", "포장하다"},{"disappear", "사라지다"},{"career", "경력"},{"secure", "안전한"},
			{"despite", "~에도 불구하고"},{"background", "배경"},{"generate", "발생시키다"},{"eventually", "결국"},
			{"decrease", "감소하다"},{"recycle", "재활용하다"},{"desire", "욕망"},{"balance", "균형을 이루다"},{"publish", "출판하다"},
			{"congratulate", "축하하다"},{"compose", "구성하다"},{"follow", "따라가다"},{"negative", "부정적인"},{"occasion", "경우"},
			{"replace", "대체하다"},{"expert", "전문가"},{"term", "관점"},{"relieve", "안도시키다"},{"describe", "표현하다"},
			{"biology", "생물학"},{"due", "만기의"},{"equipment", "장비"},{"account", "계좌"},{"birth", "탄생"},
			{"constant", "일정한"},{"genius", "천재"},{"frequent", "잦은"}};
	
	
	
	
	@Override
	public void wordTest(String[][] Word) {
		
		for(;;) {	
			System.out.println("🧒🏻 Intermediate level의 단어 테스트는 총 15문제로 12문제 이상 맞춰야 합격입니다.");
			System.out.println("⚠️Enter를 입력하면 다음 단어로 넘어갑니다.⚠️");
//			System.out.printf("제한시간은 총 90초입니다.%n%n");
			System.out.println("");
	    
			int score = 0;
			
			Collections.shuffle(Arrays.asList(Word));
		
			for(int i = 0; i < 8; i++) {
				sc.nextLine();
				System.out.printf("Q%d. %s%n", i+1, Word[i][0]);
				String answer = sc.nextLine();

				if(answer.equals( Word[i][1])) {
					System.out.println("정답 ⭕️ ");
					score += 10;
					System.out.println("score: " + score);
					System.out.println("");
				}else {
					System.out.println("오답 ❌: 정답은 " +  Word[i][1] + "입니다.");
					System.out.println("score: " +score);
					System.out.println("");
				}		  
			}	

			Collections.shuffle(Arrays.asList(Word));
		
			for(int i = 0; i < 7; i++) {	
				sc.nextLine();
				System.out.printf("Q%d. %s%n", i+9, Word[i][1]);
				String answer = sc.nextLine();
			
				if(answer.equals( Word[i][0])) {
					System.out.println("정답 ⭕️ ");
					score += 10;
					System.out.println("score: " + score);
					System.out.println("");
				}else {
					System.out.printf("오답 ❌: 정답은 " +  Word[i][0] + "입니다.%n%n");
					System.out.println("score: " +score);
					System.out.println("");
				}		 
			}
			System.out.println("Total score: " + score );
		
			if(score >= 120) {
				System.out.printf("😙 축하합니다. 합격입니다. %n");
			}else {
				System.out.printf("🤨 불합격입니다. 다시 도전해주세요. %n");
			}
		
			System.out.println("1. 다시 공부하기 ");
			System.out.println("2. 나가기 ");
		
			int text = sc.nextInt();
			if(text == 1) {
				line2();
				continue;
			}else if(text == 2) {
				break;
			}
		}
	}

	
	//test 15 
	String grammar1[] = {"Chapter5. 시제1",
			"⏰ 시제란? 동사의 동작이 일어나는 시점을 구분하기 위해 사용하는 말을 말합니다.",
			"시제가 과거인지, 현재인지, 미래인지에 따라 동사의 형태가 변해요.",
			"1️⃣ 현재시제: 일반적인 사실이나 반복되는 상황😵‍💫, 동작🏃🏻‍♀️을 나태냅니다.",
			"           또는, 미래에 ❗️확실히❗️ 일어날 일일 때도 사용합니다.",
			"ex1) The monthly planning meeting 🌱is held🌱 in room 12.",
			"ex2) Please understand any inconvenience which 🌱will be caused/is caused🌱 by renovations next month.",
			"2️⃣ 과거시제: 과거에 발생한 사건이나 상태를 표현할 때",
			"📘 과거시제와 함께 쓰는 표현: ago ~전에            yesterday 어제",
			"                        last + 시점 지난 ~에   in + 과거연도 ",
			"ex) Mr. Mika 🌱joined🌱 the firm two years ago as a senior editor.",
			"3️⃣ 미래시제: 미래에 일어날 사건이나 상태를 표현할 때로 ❗현재진행형 시제❗로도 미래를 나타낼 수 있습니다.",
			"📘 미래시제와 함께 쓰는 표현: next + 시점 다음 ~에    tomorrow 내일",
			"                       in + 미래연도          as of ~부로, ~로부터 시작하여",
			"                       in + 기간 ~기간 이후에   soon/shortly 곧",
			"                       upcoming 다가오는      later + 시점 ~말, ~느즈막히",
			"ex) Goverment economists 🌱will gather🌱 next week to discuss whether to raise interest rates.",
			"4️⃣ 현재완료: have/has + p.p 의 형태로 사용하며, 과거부터 현재까지 있었던 일을 나타냅니다.",
			"           즉, 과거의 행위가 현재까지 영향을 미치는 경우 '현재완료'를, 과거의 사실만을 나타낸다면 '과거'시제를 사용합니다.",
			"           또한, 현재완료는 완료, 경험, 계속, 결과를 나타냅니다.",
			"🥠 완료 🥠 과거에 시작한 일이 현재 '끝난 상태'이거나 '막 끝난 것'을 강조",
			"📘 함께 쓰는 표현: just(막), already(이미), now(지금)",
			"ex) Mr.Russo  🌱has already finished🌱 his new assignment for the project.",
			"🥠 경험 🥠 과거에 ~해본 적이 있다",
			"📘 함께 쓰는 표현: never(절대), ever(~한 적이 있다), before(~전에), once(한 번)",
			"ex) I 🌱have never encountered🌱 such difficult problems to deal with.",
			"🥠 계속 🥠 '과거부터 현재까지 계속 ~해 왔다.'라는 의미로 현재완료 시제로만 나타낼 수 있습니다.",
			"📘 함께 쓰는 표현: for(~동안), since(~이후로)",
			"5️⃣ 과거완료: had + p.p 의 형태로 사용하며, 과거보다 더 과거의 일을 나타냅니다.",
			"           이때, 비교대상이 되는 과거 시점이 반드시 제시됩니다.",
			"ex1) After Mr.Kim 🌱had worked🌱 as a career expert, he 🌱decided🌱 to open a image consulting company.",
			"💁 Mr.Kim이 '진로상담 전문가로 일하는 것'이 '이미지 컨설팅 회사를 차리는 것'보다 더 먼저 발생하기 때문에 과거완료 시제를 사용합니다.",
			"ex2) All food products 🌱had been tested🌱 rigorously before they 🌱were put🌱 on the market.",
			"💁 '시장에 출시되는 것'보다 '검사를 받는 것'이 더 먼저 발생하기 때문에 과거완료 시제를 사용합니다.",
			"6️⃣ 미래완료: will have + p.p 의 형태로 사용하며, 과거/현재부터 시작된 일이 미래에 완료 되거나",
			"           두 가지의 미래 사건 중 하나가 먼저 발생할 때를 나타냅니다.",
			"특히 by the time + 현재시제와 자주 사용됩니다.",
			"ex1) I 🌱will have worked🌱 for 6 years at this company 🌱by the time you finish🌱 your graduate studies.",
			"💁 과거부터 일하기 시작해서 you가 대학원을 졸업할 때(미래의 한 시점) 일한지 6년이 되는 것이므로 미래완료를 사용합니다.",
			"ex2) Ms. Ginger 🌱will already have finished🌱 her presentation 🌱by the time you reach🌱 the convention center.",
			"💁 Ginger가 발표를 마치는 것과 you가 컨벤션 센터를 도착한다는 두 가지 미래 사건 중 발표를 마치는 것이 더 먼저 일어나므로 미래완료를 사용합니다."};
	
	
	
	String grammar2[] = {"Chapter 6. 시제2",
			"1️⃣ 진행시제: 진행 시제는 기준이 되는 특정 시점에 진행 중임을 나타냅니다.",
			"감정동사, 상태동사, 소유동사는 진행 시제로 사용할 수 없습니다.",
			"❌ The instructor 🌱was being pleased🌱 with the enthusiastic reaction from the seminar participants.",
			"⭕ The instructor 🌱was pleased🌱 with the enthusiastic reaction from the seminar participants.",
			"🥠 현재진행 🥠 현재진행 시제는 지금 이 시점에 일어나고 있는 상황을 나타냅니다.",
			"             또한, 현재진행형 시제로 미래를 타나낼 수 있습니다.",
			"ex1) The CEO of the company 🌱is exercising🌱 at a gym right now.",
			"ex2) Mr.Benny 🌱is leaving/will leave🌱 for Mexico tomorrow.",
			"🥠 과거진행 🥠 과거진행 시제는 과거 특정 시점에 진행되고 있던 상황을 나타냅니다.",
			"단순과거 시제) I 🌱talked🌱 to the new manager yesterday.",
			"과거진행 시제) I 🌱was talking🌱 to the new manager at 5 o'clock.",
			"🥠 미래진행 🥠 미래진행 시제는 미래의 특정 순간을 강조합니다.",
			"ex) Padox Co. 🌱will be introducing🌱 its latest SW next Friday.",
			"2️⃣ would/could/might + 동사원형 : 주로 📌미래시제📌를 나타냅니다.",
			"🥠 would + 동사원형 🥠 1. ~일 것이다 2. 과거에 ~하곤 했다",
			"🥠 could + 동사원형 🥠 1. ~할 수 있을 것 같다 2. 과거에 ~할 수 있었다",
			"🥠 might + 동사원형 🥠 1. ~일지도 모른다",
			"ex) I think he 🌱would take🌱 the course if given the chance (will take 보다 약한 의미)",
			"3️⃣ would/could/might + have p.p: 현재를 기준으로 📌일어나지 않은 일📌을 나타냅니다.",
			"🥠 would + have p.p 🥠 ~였을 텐데 (그러나 그러지 못했다)",
			"🥠 could + have p.p 🥠 ~할 수도 있었을 텐데 (그러나 하지 못했다)",
			"🥠 might + have p.p 🥠 ~였을 수도 있었는데 (그러나 아니였다)",
			"ex) Ms.Collins 🌱could have passed🌱 the exam.",
			"4️⃣ '주장, 명령, 요구, 제안'의 의미를 나타내는 동사가 쓰인 경우",
			"   : 목적어로 쓰인 that절의 동사는 「(should) + 동사원형」 의 형태로 씁니다.",
			"📘 주장/명령/요구/제안 동사 ✅ insist 주장하다   ✅ require[request] 요구하다",
			"                       ✅ ask 요청하다      ✅ recommend 제안하다",
			"                       ✅ order 명령하다    ✅ suggeest 제안하다",
			"ex) The Art Association 🌱requested🌱 that every artist 🌱retain🌱 full rights to distribute their works.",};
	
	
	String grammar3[] = {"Chapter 7. 명사",
			"명사는 사람, 사물, 관념(추상적 개념)을 가리키는 이름을 말해요.",
			"명사는 문장에서 주어, (동사, 전치사의) 목적어, 주격 보어, 목적격 보어의 역할을 수행합니다.",
			"또한, 관사, 소유격, 형용사의 수식을 받아 「관사/소유격/형용사 + 명사」 의 형태로 나타납니다.",
			"일반적으로 -ness/-ment/-ance/-tion/-sion/-ty/-cy/-th 등으로 끝나면 명사인 경우가 많습니다.",
			"하지만 예외적인 형태의 명사도 존재합니다❗",
			"이것들은 그냥 외워야 합니다 😇",
			"📘 예외적 형태의 명사 ✅ alternative 	(명)대안책 (형)대안의    ✅ objective (명)목적 (형)객관적인   ✅ initiative (명)계획, 진취성",
			"                  ✅ professional (명)전문가 (형)전문적인   ✅ characteristic (명)특성         ✅ renewal (명)갱신",
			"                  ✅ potential (명)잠재성 (형)잠재적인      ✅ adhesive (명)접착제 (형)들러붙는   ✅ specifics (명)세부사항",
			"                  ✅ representative (명)대표자 (형)대표하는 ✅ executive (명)중역 (형)경영의     ✅ remainder(명)잔량",
			"                  ✅ delegate (명)대표자 (동)파견하다       ✅ rental (명)대여(료) (형)대여의     ✅ critic (명)비평가",
			"                  ✅ original (명)원본 (형)원래/고유의      ✅ assembly (명)집회",
			"명사는 셀 수 있는 명사인 '가산명사'와 셀 수 없는 명사인 '불가산명사'로 구분할 수 있습니다.",
			"💁🏻‍♀️ 가산명사는 셀 수 있는 명사이므로 단수/복수로 나타낼 수 있습니다.",
			"'단수'일 때는 한정사(a/an/the/소유격/each/every/this/that/any)가 붙고, 그렇지 않은 경우 '복수'로 씁니다.",
			"💁🏻‍♀️ 불가산명사는 셀 수 없는 명사로 '단수'로만 사용합니다. ",
			"따라서 불가산명사 앞에는 a/an이 올 수 없고 ❌ , 뒤에 복수형 어미 -(e)s가 붙을 수 없습니다.❌ ",
			"불가산명사도 예외적 형태의 명사처럼 그냥 외워야 합니다 😇",
			"📘 불가산명사  ✅ information 정보     ✅ equipment 장비       ✅consent 허가",
			"             ✅ clothing 의류         ✅ furniture 가구      ✅ interest 이자",
			"             ✅ access 접근           ✅ potential 잠재력     ✅ advice 충고",
			"             ✅ merchandise 상품      ✅ research 연구       ✅ machinery 기계류",
			"             ✅ guidance 안내         ✅ permission 허가     ✅ cerification 증명",
			"             ✅ duplication 복사      ✅ estimation 견적     ✅ alternation 교대",
			"             ✅ luggage/baggage 짐",
			"📘 의미에 따라 가산/불가산 다 되는 단어  ✅ establishment (가산)설립한 회사  (불가산)설립 행위",
			"                                  ✅ acquisition   (가산)인수한 회사  (불가산)인수 행위",
			"                                  ✅ purchase      (가산)구매한 물품  (불가산)구매 행위"};
	
	
	String grammar4[] = {"Chapter 8. 형용사",
			"형용사는 사람/사물의 '성질'이나 '상태'를 나타내는 말이에요.",
			"형용사는 명사를 수식하는 역할과 보어 역할을 합니다.",
			"주로 명사 앞에 위치하여 명사를 수식하지만, 연결되는 표현 때문에 길어지면 명사 뒤에서 수식할 수도 있습니다.",
			"ex1) All of the 🛡protective🛡 ➡️ 🔩equipment⚙️ that is used in our factory is made in Germany.",
			"ex2) Mr.Kim called the 🫥person🫥 ⬅️ 👩🏻‍🔧resposible for stocking merchandise and repairing items in the store.👨🏻‍🔧",
			"형용사는 주어를 설명하는 '주격 보어', 목적어를 설명하는 '목적격 보어'로 쓰입니다.",
			"📘 주격 보어를 취하는 2형식 동사 ✅ prove ~한 상태로 증명되다    ✅ become ~가 되다                ✅ remain ~로 남아 있다",
			"                           ✅ look ~한 상태로 보인다      ✅ seem/appear ~한 상태인 것 같다   ✅ be ~이다 ",
			"",
			"📘 목적격 보어를 취하는 5형식 동사 ✅ keep + 목적어 + 형용사      ~을 ... 한 상태로 유지시키다",
			"                             ✅ find + 목적어 + 형용사      ~을 ... 한 상태라고 생각하다",
			"                             ✅ consider + 목적어 + 형용사  ~을 ... 한 상태로 간주하다",
			"                             ✅ leave + 목적어 + 형용사     ~을 ...한 상태로 남겨놓다",
			"                             ✅ make + 목적어 + 형용사      ~을 ... 한 상태로 만들다",
            "일반적인 형태의 형용사는 -tive/-sive/-able/-ible/-ful/-ic/-ous/-cal 로 끝나는 경우가 많습니다.",
            "예외적인 형태의 형용사도 존재합니다. 이 또한 그냥 외워야 합니다.",
            "📘 예외적 형태의 형용사  ✅ diverse 다양한     ✅ deliberate 신중한      ✅ complete 전적인",
            "                     ✅ managerial 관리의  ✅ lengthy 장황한         ✅ distinct 뚜렷한",
            "                     ✅ timely 시의적절한   ✅ costly 비용이 많이 드는   ✅ orderly 질서정연한",
            "",
            "📘 다른 의미의 비슷한 형태의 형용사  ✅ impressive 인상적인             ✅ impressed 감명받은(사람에게만 사용)",
            "                              ✅ complete 완전한, 완료된('완료된'의 의미일 때 명사 앞에 쓰지 않음) ✅ completed 완료된, 작성된",
            "                              ✅ successful 성공적인             ✅ successive 연속의",
            "                              ✅ considerate 사려 깊은, 배려하는   ✅ considerable 상당한, 중요한",
            "                              ✅ advisory 고문의                ✅ advisable 권할 만한, 바람직한",
            "                              ✅ grown (식물, 사람이)다 큰        ✅ growing 성장하고 있는",
            "                              ✅ confident 확신/자신하는          ✅ condiential 기밀의",
            "                              ✅ extensive 광범위한              ✅ extended 연장된",
            "                              ✅ various 다양한                 ✅ variable 변동이 심한",
            "                              ✅ informative 유용한, 정보가 많은   ✅ informed 현명한",
            "                              ✅ favorite 가장 좋아하는           ✅ favorable 우호적인"};
	
	
	String gramT[][] = {{"The 10th annual Summer Festival _____ next Sunday",
		"1. will begin   2. begin   3. began   4. has begun", "1",
		"주어가 3인칭 단수이고, 빈칸 뒤에 'next Sunday'라는 미래 시점을 나타내는 부사가 주어졌으므로 미래 시제인 🧐will begin🧐이 정답입니다."},
			{"We _____ the equipment last month and it's scheduled to be delivered next Monday",
			"1. will order   2. ordered   3. have ordered   4. were ordered","2",
			"A and B 병렬구조의 문장입니다. 빈칸이 있는 앞문장에는 'last month'라는 과거 시점 부사가 주어졌으므로 과거 시제인 🧐ordered🧐가 정답입니다."},
			{"Maintenance checks are performed ____ to ensure the safety of the machine ",
			"1. essentially   2. finely   3. regularly   4. shortly","3",
			"빈칸의 부사가 수식하는 것은 'are performed'로 현재 시제이므로 '정기적으로'라는 의미의 🧐regularly🧐가 적절합니다."},
			{"A good employee _____ initiatives and responsibilities for his tasks",
			"1. taken   2. took   3. take   4. takes","4",
			"주어는 3인칭 단수이고, 해석해보면 '훌륭한 직원은 솔선수범하고 자신의 업무에 책임을 진다.'이므로 '일반적 사실'을 나타내는 현재 시제 🧐takes🧐가 정답입니다."},
			{"By the time his boss got back from the business trip, Mr.Sin _____ the final project.",
			"1. had started   2. starts   3. will start   4. started ","1",
			"⌜By the time + 주어 + 과거시제, 주어 + 과거완료 시제⌟ 형태의 문제로 과거완료 시제인 🧐had started🧐가 정답입니다."},
			{"By the time new Italian restaurant is ready to open, its interior _____ elegantly.",
			"1. was decorated   2. will have been decorated   3. is decorated   4. decorating","2",
			"⌜By the time + 주어 + 현재시제, 주어 + 미래완료 시제⌟ 형태의 문제로 미래완료 시제인 🧐will have been decorated🧐가 정답입니다."},
			{"Ms. Chu _____ many innovative packaging ideas since joining Star Deliveries in 2010",
			"1. developing   2. developed   3. has developed   4. had developed","3",
			"빈칸은 동사 자리이고, 'since(~이래로)'를 통해 현재완료 시제임을 알 수 있습니다. 따라서 🧐has developed🧐가 정답입니다."},
			{"Next August, Seoul Women University _____ the portfolios of this year's graduating class.",
			"1. exhibited   2. exhibiting   3. will be exhibited   4. will exhibit","4",
			"빈칸은 동사 자리, '서울여자대학교가 전시하다'가 적절하므로 능동태입니다. 미래시점을 나타내는 부사 'Next August'로 🧐will exhibit🧐가 적절함을 알 수 있습니다."},
			{"The HRD _____ a special appreciation lunch for all employees later today.",
			"1. is holding   2. had been holding   3. will be held   4. held ","1",
			"빈칸은 동사 자리이고, '특별 감사 오찬을 열다'가 적절하므로 능동태입니다. 미래시점을 나타내는 'later today'를 통해 🧐is holding🧐이 적절함을 알 수 있습니다."},
			{"By the time Larry became the head of the company, he _____ there for more than 17 years",
			"1. works   2. had worked   3. has workred   4. will work","2",
			"⌜By the time + 주어 + 과거시제, 주어 + 과거완료 시제⌟ 형태의 문제로 과거완료 시제인 🧐had worked🧐가 정답입니다."},
			{"Simon Corprations ______ its new line of athletic gear on the market next month.",
		"1. will be introduced   2. will have introduced   3. will be introducing   4. has introduced","3",
		"'next month'로 미래 시점임을 알 수 있고, 'Simon Corporations가 소개하다'가 적절하므로 능동태, 미래완료 시제는 또 다른 미래 시점이 제시돼야 하므로 미래진행 시제인 🧐will be introducing🧐이 정답입니다."},
			{"The professional medicine association ______ research grant proposals until the end of next month.",
			"1. was accepting   2.to accept   3. have accepted   4. will be accepting","4",
			"빈칸은 동사 자리, 'end of the next month'를 통해 미래 시제임을 알 수 있습니다. 따라서 🧐will be accepting🧐이 정답입니다."},
			{"The National Child Safety Association has ______ that every parent consider the risks of allowing children to watch violent TV shows.",
			"1. specified   2. created   3. asked   4. noticed","3",
			"that절의 주어가 단수인데 동사원형이 쓰였으므로 '주장/명령/요구/제안' 동사 중 하나인 🧐asked🧐가 정답이 됩니다."},
			{"Air Nambia informed its customers that it ______ its services between Nambia and Germany.",
			"1. would continue   2. will have continue   3. was continued   4. has been continue ","1",
			"문맥상 'Air Nambia가 계속하다'가 적절하므로 능동태이고, 미래완료 시제는 또 다른 미래 시점이 제시돼야 하므로 🧐would continue🧐가 정답입니다."},
			{"Ted ______ the most recent investment funds the company has received at next week's meeting.",
			"1. was addressing   2. is addressing   3. will be addressed   4. should be addressed","2",
			"'next week's meeting'을 통해 미래 시점임을 알 수 있고, 해석해보면 'Ted가 다루다'가 적절하므로 능동태인 🧐is addressing🧐이 정답입니다. "},
			{"Mr.Davis has ______ that a few outstanding employees be posted to new overseas branches."
			,"1. mentioned   2. suggested   3. talked   4. implied","2",
			"that절의 동사가 원형이므로 제안 동사 🧐suggested🧐가 정답입니다. mentioned가 정답이 되려면 be posted가 아니라 will be posted 등의 시제를 써야합니다."},
			{"Mr.Nell ______ to announce the opening of the first International Bluegrass Festival.",
			"1. was pleased   2. is being pleased   3. pleases   4. had pleased","1",
			"Mr.Nell이 '기쁨을 느끼다'라고 쓰려면 수동태를 써야하고, 감정동사는 진행시제를 쓸 수 없으므로 🧐was pleased🧐가 정답입니다."},
			{"The CEO of the company ______ a welcoming ceremony in honor of Mr.Deng tomorrow, new vice president",
			"1. holds   2. will be held   3. is holding   4. has held","3",
			"해석해보면 'CEO가 개최하다'가 적절하므로 능동태를 써야하고, 'tomorrow'를 통해 미래 시제인 🧐is holding🧐이 정답임을 알 수 있습니다."},
			{"Mr.Kim ______ the press tomorrow about the incident.",
			"1. is addressing   2. will be addredsed   3. had addressed   4. addressing","1",
			"해석해보면 'Mr.Kim이 연설하다'가 적절하므로 능동태를 써야하고, 'tomorrow'를 통해 미래 시제인 🧐is addressing🧐이 정답임을 알 수 있습니다. "},
			{"The members of the board strongly ______ that Mr.Simpson take on the duties of CFO",
			"1. compel   2. recommend   3. recall   4. invent","2",
			"that절의 주어가 3인칭 단수(Mr.Simpson)인데 동사원형(take)이 쓰였으므로 주장/명령/요구/제안 동사 중 하나인 🧐recommend🧐가 정답이 됩니다."},
			{"The members of the sales team decided that they ______ the conference this year.",
			"1. would not be attending   2. would not have been attended   3. will not be attended   4. will not have been attedning","1",
			"문맥상 '그들이 총회에 참석하지 않다'가 적절하므로 능동태를 써야하고, 미래완료 시제는 또 다른 미래 시점이 제시돼야 하므로 🧐would not be attending🧐이 정답입니다."},
			{"He ______ that the budget be cut.",
			"1. disappointed   2. accepted   3. introduced   4. suggested","4",
			"that절의 주어가 3인칭 단수(the budget)인데 동사원형(be cut)이 쓰였으므로 주장/명령/요구/제안 동사 중 하나인 🧐suggested🧐가 정답이 됩니다."},
			{"She ______ that the policy be implemented.",
			"1. appeared   2. said   3. insisted   4. offered","3",
			"that절의 주어가 3인칭 단수(the policy)인데 동사원형이(be implemented) 쓰였으므로 주장/명령/요구/제안 동사 중 하나인 🧐insisted🧐가 정답이 됩니다."},
			{"Stella is having a driving lesson. It's the first time she ______ a car.",
			"1. to drive   2. has driven   3. driving   4. drived","2",
			"빈칸은 동사 자리이고, 문맥상 '그녀가 차를 몰아보다'라는 현재완료의 경험적 용법이 적절합니다. 따라서 🧐has driven🧐이 정답입니다.."},
			{"Canada shouldn't ______ humpback whales off the endangered species list last year.",
			"1. have taken   2.take   3. had taken   4. took","1",
			"문맥상 '캐나다는 혹등고래를 멸종위기종 명단에서 빼지 말았어야 했다'가 적절하므로 현재와 반대되는 상황을 나타낼 때 쓰는 ⌜조동사 + have + p.p⌟ 형태의 🧐have taken🧐이 정답입니다."},
		{"Florio Movers offers ______ of household items within 48 hours for customers.",
		"1. deliver   2. delivered   3. delivery   4. deliverable","3",
		"빈칸은 offers의 목적어 자리이며 of 이하의 수식을 받는 명사 자리 이므로 🧐delivery🧐가 정답입니다."},
			{"The ______ of new goverment safety standards has raised operating costs for nuclear power plants.",
			"1. implemental   2.implement   3. implementation   4. implemented","2",
			"정관사 the와 전치사 사이에는 반드시 명사가 와야 하므로 명사 🧐implement🧐가 정답입니다."},
			{"The airline is boarding passengers in all classed at this time to avoid further ______.",
			"1. delays   2. delayed   3. delaying   4. to delay","1",
			"빈칸은 further(추가적인)이라는 형용사의 수식을 받는 명사 자리 입니다. 따라서 명사 🧐delays🧐가 정답입니다."},
			{"Doctors suggest taking a walk every day as an ______ to taking anti-depression drugs.",
			"1. alternate   2. alternation   3. alternative   4. alternatively ","3",
			"부정관사 an 뒤에는 명사가 와야 합니다. alternation(교대)은 불가산 명사로 a/an 뒤에 올 수 없습니다. 따라서 🧐alternative(대안)🧐가 정답입니다."},
			{"The Advanced Computer Technology Conference will be attended by over three thousand ______ from around the world.",
			"1. professionals   2. profession   3. professional   4. professions","1",
			"profession(직업)/professional(전문가) 둘 다 명사이고, 총회에는 3000명이 넘는 '전문가들'이 참가하므로 🧐professionals🧐가 정답입니다."},
			{"Lulu's Cafe experienced a huge ______ in profits when they increased their hours."
			,"1. increasing   2. increase   3. increased   4. increases","2",
			"빈칸 앞에 관사 a와 형용사 huge(엄청난)가 있으므로 빈칸에는 단수명사가 와야 합니다. 따라서 🧐increase🧐가 정답입니다."},
			{"This coupon for 25% off is only valid on certain ______ totaling $50 or more of regularly priced items.",
			"1. purchased  2. to purchase   3. purchase   4.purchases","4",
			"빈칸 앞에 전치사 on과 형용사 certain(특정한)이 있으므로 명사가 와야하고, purchase는 가산명사인데 앞에 관사가 없으므로 복수 형태인 🧐purchases🧐가 정답입니다."},
			{"Japanese authorities are conducting preliminary talks to obtain ______ from other participating nations.",
			"1. consent   2. consents   3. consented   4. consenting","1",
			"obtain의 목적어 자리이므로 명사가 와야 하고, content(허가)는 불가산명사이므로 단수로만 쓸 수 있습니다. 따라서 정답은 🧐content🧐 입니다. "},
			{"The VCT staff is preparing a comprehensive ______ about the new insurance policy.",
			"1. information   2. news   3. presentation   4. pass","3",
			"문맥상 '종합적 발표/정보'모두 가능해보이지만, 불가산명사인 information은 앞에 관사 a가 올 수 없으므로 정답은 🧐presentation🧐 입니다."},
			{"______ to this facility is not permitted unless you hold an authorized pass.",
			"1. Approach   2. Guide   3. Access   4. Market","3",
			"빈칸은 주어 자리이므로 명사가 와야 합니다. 가산명사 Approach는 한정사 없이 단수로 쓰일 수 없기 때문에 불가산명사 🧐Access🧐가 정답입니다."},
			{"We are planning to interview ______ for the position of Corporate Development Director",
			"1. apply   2. applicants   3. applicant   4. appliance","2",
			"빈칸은 to interview의 목적어 자리이므로 명사가 와야합니다. 문맥상 '지원자'가 적절하고, 가산명사 applicant는 한정사 없이 단수로 쓸 수 없어 🧐applicants🧐가 정답입니다."},
			{"Mr.Abrams is preparing for the weekly meeting by making ______ for next year's budget.",
			"1. propose   2. proposed   3. proposal   4. proposals","4",
			"빈칸은 동명사 making의 목적어 자리이므로 명사가 와야하고, 가산명사 proposal은 한정사 없이 단수로 쓸 수 없어 복수 형태의 🧐proposals🧐가 정답입니다."},
			{"Miler's new book summarizes much-disputed ______ of a purely competitive labor market.",
			"1. characterized   2. characteristics   3. characteristic   4. character","2",
			"빈칸은 much-disputed의 수식을 받고, of 이하 전치사구와 연결되는 명사 자리입니다. 가산명사 characteristic 앞에 한정사가 없으므로 🧐charateristics🧐이 정답입니다."},
			{"During the conference, Mr.Sato made a presentation regarding recent urban ______ in Lagos.",
			"1. renewal   2. renew   3. to renew   4. renews","1",
			"빈칸 앞 recent(최근), urban(도시의)는 모두 형용사이므로 빈칸은 명사 자리 입니다. 따라서 정답은 🧐renewal🧐 입니다."},
			{"Sami Co. has expressed an ______ in acquiring five new retail outlets",
			"1. interested   2. interesting   3. interest   4. interests","3",
			"부정관사 a/an 뒤에는 반드시 단수명사가 와야하므로 정답은 🧐interest🧐 입니다."},
			{"We always make sure that all our customers' information is strictly ______.",
		"1. confidenct   2. confidential   3. confidentially   4. confidences","2",
		"빈칸은 동사 is의 보어 자리이고, 부사 strictly의 수식을 받아야 하므로 형용사 🧐confidential🧐이 정답입니다."},
		{"A clear and simple site layout will make your Web site ______ to clients.",
		"1. attraction   2. attract   3. to attract   4. attractive","4",
		"빈칸은 동사 5형식 동사 make의 목적격 보어 자리이고, 목적어 'Web site'의 성질을 설명하므로 형용사 🧐attractive🧐가 정답입니다."},
		{"The book was enriched with ______ footnotes and lovingly detailed illustraions.",
		"1. lengthen   2. length   3. lengthy   4. lengthens","3",
		"빈칸 앞은 with(전치사) 뒤에는 footnotes(명사)이므로 형용사나 복합명사를 이루는 명사가 나와야 합니다. 문맥상 '긴 주석'이 적절하므로 형용사 🧐lengthy🧐가 정답입니다."},
		{"The project was ______ when Dr.Prosser put the finishing touches on it this afternoon.",
		"1. completes   2. completing   3. completion   4. complete ","4",
		"빈칸은 동사 was의 주격 보어 자리이고, The project의 상태를 나타내므로 형용사가 와야 합니다. project는 '완성되는 것'이므로 🧐complete🧐가 정답입니다."},
		{"It is ______ to inspect your tires for wear and check air pressure before, during and after long journeys.",
		"1. advise   2. advisory   3. advisable   4. advising","3",
		"빈칸은 동사 is의 보어 자리이고, to 부정사 이하가 진주어이므로 해석해보면 '타이어를 점검하는 것이 바람직하다'가 적절하므로 🧐advisable🧐이 정답입니다."},
		{"Truckee Co. offers ______ reliable models of automobiles suitable to the needs of all consumers."
		,"1. variety   2. various   3. variable   4. variation","2",
		"빈칸에는 동사 offers의 목적어인 models를 수식하는 형용사가 와야 합니다. 문맥상 '믿을만한 다양한 모델'이 적절하므로 🧐various🧐가 정답입니다."},
		{"A range of healthcare issues ______ for the audience will be addressed during the discussion.",
		"1. relevant   2. relevantly   3. relevance   4. relevancy","1",
		"형용사가 수식하는 어구가 길어지면 명사 뒤에서 수식합니다. 따라서 A range of healthcare issues를 수식하는 형용사 🧐relevant🧐가 정답입니다."},
		{"The market for high-quality home furnishings has become very ______.",
		"1. compete   2. competition   3. competitive  4. to compete","3",
		"빈칸은 동사 become의 보어 자리이고, 부사 very의 수식을 받으므로 형용사 🧐competitive🧐가 들어가야합니다."},
		{"As long as you perform regular maintenance on your computer, it should remain ______.",
		"1. funtionally   2. function   3. functionality  4. functional","4",
		"동사 remian은 형용사 보어가 필요하므로 빈칸은 형용사 🧐functional🧐이 들어가야합니다."},
		{"Proper use of our tracking system will make your company more ______ among other similar companies.",
		"1. compete   2. competitive   3 competition   4. competes","2",
		"빈칸은 동사 make의 목적격 보어 자리이고, 빈칸 앞에 비교급 more이 있으므로 형용사 🧐competitive🧐가 들어가야 합니다."},
		{"Our customer sevice department strives to deal with any problems with our serive in a ______ manner.",
		"1. timely   2. timed   3. time   4. timing","1",
		"빈칸은 뒤의 manner을 수식하는 형용사 자리이고, 문맥상 '시의적절한 방식으로(in a timely manner)'가 적절하므로 🧐timely🧐가 정답입니다."},
		{"Among many new prominent recruits, Jaden is expected to be a particularly ______ perfromer.",
		"1. distinction   2. distinct   3. distinctive   4. distinctions","3",
		"빈칸은 부사 particularly의 수식을 받고, 명사 performer를 수식하는 형용사 자리이므로 🧐distinctive🧐가 들어가야 합니다."},
		{"We will keep all the committee members ______ on the progress of our search for a new Vice President.",
		"1. post   2. posted   3. posting   4. to post","2",
		"5형식 동사 keep은 ⌜keep + 목적어 + 형용사⌟ 형태로 쓰고, 문맥상 '위원회 전원에게 계속 정보를 제공하다(kepp + 사람 + posted)'가 적절하므로 🧐posted🧐가 정답입니다."},
		{"The all-in-one complete vitamin from Pinni Pharmaceuticals is ______ of its healthcare products.",
		"1. represented   2. representative   3. represent   4. representation","2",
		"빈칸은 동사 is와 of 사이에 있으므로 형용사/명사가 들어갑니다. 문맥상 vitamin이 '대표하는 것(be representative of)'이 적절하므로 🧐representative🧐가 정답입니다."},
		{"______ team leaders should be skilled in managing and resolving conflicts among their team.",
		"1. Successful   2. Successive   3. Success   4. Succession","1",
		"빈칸은 team leaders를 수식하는 형용사가 들어가야 합니다. 문맥상 '성공적인 팀장들'이 적절하므로 🧐successful🧐이 정답입니다."}};
	
	
	String grammarTest1[][] = {{"The 10th annual Summer Festival _____ next Sunday",
		"1. will begin   2. begin   3. began   4. has begun", "1",
		"주어가 3인칭 단수이고, 빈칸 뒤에 'next Sunday'라는 미래 시점을 나타내는 부사가 주어졌으므로 미래 시제인 🧐will begin🧐이 정답입니다."},
			{"We _____ the equipment last month and it's scheduled to be delivered next Monday",
			"1. will order   2. ordered   3. have ordered   4. were ordered","2",
			"A and B 병렬구조의 문장입니다. 빈칸이 있는 앞문장에는 'last month'라는 과거 시점 부사가 주어졌으므로 과거 시제인 🧐ordered🧐가 정답입니다."},
			{"Maintenance checks are performed ____ to ensure the safety of the machine ",
			"1. essentially   2. finely   3. regularly   4. shortly","3",
			"빈칸의 부사가 수식하는 것은 'are performed'로 현재 시제이므로 '정기적으로'라는 의미의 🧐regularly🧐가 적절합니다."},
			{"A good employee _____ initiatives and responsibilities for his tasks",
			"1. taken   2. took   3. take   4. takes","4",
			"주어는 3인칭 단수이고, 해석해보면 '훌륭한 직원은 솔선수범하고 자신의 업무에 책임을 진다.'이므로 '일반적 사실'을 나타내는 현재 시제 🧐takes🧐가 정답입니다."},
			{"By the time his boss got back from the business trip, Mr.Sin _____ the final project.",
			"1. had started   2. starts   3. will start   4. started ","1",
			"⌜By the time + 주어 + 과거시제, 주어 + 과거완료 시제⌟ 형태의 문제로 과거완료 시제인 🧐had started🧐가 정답입니다."},
			{"By the time new Italian restaurant is ready to open, its interior _____ elegantly.",
			"1. was decorated   2. will have been decorated   3. is decorated   4. decorating","2",
			"⌜By the time + 주어 + 현재시제, 주어 + 미래완료 시제⌟ 형태의 문제로 미래완료 시제인 🧐will have been decorated🧐가 정답입니다."},
			{"Ms. Chu _____ many innovative packaging ideas since joining Star Deliveries in 2010",
			"1. developing   2. developed   3. has developed   4. had developed","3",
			"빈칸은 동사 자리이고, 'since(~이래로)'를 통해 현재완료 시제임을 알 수 있습니다. 따라서 🧐has developed🧐가 정답입니다."},
			{"Next August, Seoul Women University _____ the portfolios of this year's graduating class.",
			"1. exhibited   2. exhibiting   3. will be exhibited   4. will exhibit","4",
			"빈칸은 동사 자리, '서울여자대학교가 전시하다'가 적절하므로 능동태입니다. 미래시점을 나타내는 부사 'Next August'로 🧐will exhibit🧐가 적절함을 알 수 있습니다."},
			{"The HRD _____ a special appreciation lunch for all employees later today.",
			"1. is holding   2. had been holding   3. will be held   4. held ","1",
			"빈칸은 동사 자리이고, '특별 감사 오찬을 열다'가 적절하므로 능동태입니다. 미래시점을 나타내는 'later today'를 통해 🧐is holding🧐이 적절함을 알 수 있습니다."},
			{"By the time Larry became the head of the company, he _____ there for more than 17 years",
			"1. works   2. had worked   3. has workred   4. will work","2",
			"⌜By the time + 주어 + 과거시제, 주어 + 과거완료 시제⌟ 형태의 문제로 과거완료 시제인 🧐had worked🧐가 정답입니다."}};
	

	String grammarTest2[][] = {{"Simon Corprations ______ its new line of athletic gear on the market next month.",
		"1. will be introduced   2. will have introduced   3. will be introducing   4. has introduced","3",
		"'next month'로 미래 시점임을 알 수 있고, 'Simon Corporations가 소개하다'가 적절하므로 능동태, 미래완료 시제는 또 다른 미래 시점이 제시돼야 하므로 미래진행 시제인 🧐will be introducing🧐이 정답입니다."},
			{"The professional medicine association ______ research grant proposals until the end of next month.",
			"1. was accepting   2.to accept   3. have accepted   4. will be accepting","4",
			"빈칸은 동사 자리, 'end of the next month'를 통해 미래 시제임을 알 수 있습니다. 따라서 🧐will be accepting🧐이 정답입니다."},
			{"The National Child Safety Association has ______ that every parent consider the risks of allowing children to watch violent TV shows.",
			"1. specified   2. created   3. asked   4. noticed","3",
			"that절의 주어가 단수인데 동사원형이 쓰였으므로 '주장/명령/요구/제안' 동사 중 하나인 🧐asked🧐가 정답이 됩니다."},
			{"Air Nambia informed its customers that it ______ its services between Nambia and Germany.",
			"1. would continue   2. will have continue   3. was continued   4. has been continue ","1",
			"문맥상 'Air Nambia가 계속하다'가 적절하므로 능동태이고, 미래완료 시제는 또 다른 미래 시점이 제시돼야 하므로 🧐would continue🧐가 정답입니다."},
			{"Ted ______ the most recent investment funds the company has received at next week's meeting.",
			"1. was addressing   2. is addressing   3. will be addressed   4. should be addressed","2",
			"'next week's meeting'을 통해 미래 시점임을 알 수 있고, 해석해보면 'Ted가 다루다'가 적절하므로 능동태인 🧐is addressing🧐이 정답입니다. "},
			{"Mr.Davis has ______ that a few outstanding employees be posted to new overseas branches."
			,"1. mentioned   2. suggested   3. talked   4. implied","2",
			"that절의 동사가 원형이므로 제안 동사 🧐suggested🧐가 정답입니다. mentioned가 정답이 되려면 be posted가 아니라 will be posted 등의 시제를 써야합니다."},
			{"Mr.Nell ______ to announce the opening of the first International Bluegrass Festival.",
			"1. was pleased   2. is being pleased   3. pleases   4. had pleased","1",
			"Mr.Nell이 '기쁨을 느끼다'라고 쓰려면 수동태를 써야하고, 감정동사는 진행시제를 쓸 수 없으므로 🧐was pleased🧐가 정답입니다."},
			{"The CEO of the company ______ a welcoming ceremony in honor of Mr.Deng tomorrow, new vice president",
			"1. holds   2. will be held   3. is holding   4. has held","3",
			"해석해보면 'CEO가 개최하다'가 적절하므로 능동태를 써야하고, 'tomorrow'를 통해 미래 시제인 🧐is holding🧐이 정답임을 알 수 있습니다."},
			{"Mr.Kim ______ the press tomorrow about the incident.",
			"1. is addressing   2. will be addredsed   3. had addressed   4. addressing","1",
			"해석해보면 'Mr.Kim이 연설하다'가 적절하므로 능동태를 써야하고, 'tomorrow'를 통해 미래 시제인 🧐is addressing🧐이 정답임을 알 수 있습니다. "},
			{"The members of the board strongly ______ that Mr.Simpson take on the duties of CFO",
			"1. compel   2. recommend   3. recall   4. invent","2",
			"that절의 주어가 3인칭 단수(Mr.Simpson)인데 동사원형(take)이 쓰였으므로 주장/명령/요구/제안 동사 중 하나인 🧐recommend🧐가 정답이 됩니다."},
			{"The members of the sales team decided that they ______ the conference this year.",
			"1. would not be attending   2. would not have been attended   3. will not be attended   4. will not have been attedning","1",
			"문맥상 '그들이 총회에 참석하지 않다'가 적절하므로 능동태를 써야하고, 미래완료 시제는 또 다른 미래 시점이 제시돼야 하므로 🧐would not be attending🧐이 정답입니다."},
			{"He ______ that the budget be cut.",
			"1. disappointed   2. accepted   3. introduced   4. suggested","4",
			"that절의 주어가 3인칭 단수(the budget)인데 동사원형(be cut)이 쓰였으므로 주장/명령/요구/제안 동사 중 하나인 🧐suggested🧐가 정답이 됩니다."},
			{"She ______ that the policy be implemented.",
			"1. appeared   2. said   3. insisted   4. offered","3",
			"that절의 주어가 3인칭 단수(the policy)인데 동사원형이(be implemented) 쓰였으므로 주장/명령/요구/제안 동사 중 하나인 🧐insisted🧐가 정답이 됩니다."},
			{"Stella is having a driving lesson. It's the first time she ______ a car.",
			"1. to drive   2. has driven   3. driving   4. drived","2",
			"빈칸은 동사 자리이고, 문맥상 '그녀가 차를 몰아보다'라는 현재완료의 경험적 용법이 적절합니다. 따라서 🧐has driven🧐이 정답입니다.."},
			{"Canada shouldn't ______ humpback whales off the endangered species list last year.",
			"1. have taken   2.take   3. had taken   4. took","1",
			"문맥상 '캐나다는 혹등고래를 멸종위기종 명단에서 빼지 말았어야 했다'가 적절하므로 현재와 반대되는 상황을 나타낼 때 쓰는 ⌜조동사 + have + p.p⌟ 형태의 🧐have taken🧐이 정답입니다."}};
	
	
	
	String grammarTest3[][] = {{"Florio Movers offers ______ of household items within 48 hours for customers.",
		"1. deliver   2. delivered   3. delivery   4. deliverable","3",
		"빈칸은 offers의 목적어 자리이며 of 이하의 수식을 받는 명사 자리 이므로 🧐delivery🧐가 정답입니다."},
			{"The ______ of new goverment safety standards has raised operating costs for nuclear power plants.",
			"1. implemental   2.implement   3. implementation   4. implemented","2",
			"정관사 the와 전치사 사이에는 반드시 명사가 와야 하므로 명사 🧐implement🧐가 정답입니다."},
			{"The airline is boarding passengers in all classed at this time to avoid further ______.",
			"1. delays   2. delayed   3. delaying   4. to delay","1",
			"빈칸은 further(추가적인)이라는 형용사의 수식을 받는 명사 자리 입니다. 따라서 명사 🧐delays🧐가 정답입니다."},
			{"Doctors suggest taking a walk every day as an ______ to taking anti-depression drugs.",
			"1. alternate   2. alternation   3. alternative   4. alternatively ","3",
			"부정관사 an 뒤에는 명사가 와야 합니다. alternation(교대)은 불가산 명사로 a/an 뒤에 올 수 없습니다. 따라서 🧐alternative(대안)🧐가 정답입니다."},
			{"The Advanced Computer Technology Conference will be attended by over three thousand ______ from around the world.",
			"1. professionals   2. profession   3. professional   4. professions","1",
			"profession(직업)/professional(전문가) 둘 다 명사이고, 총회에는 3000명이 넘는 '전문가들'이 참가하므로 🧐professionals🧐가 정답입니다."},
			{"Lulu's Cafe experienced a huge ______ in profits when they increased their hours."
			,"1. increasing   2. increase   3. increased   4. increases","2",
			"빈칸 앞에 관사 a와 형용사 huge(엄청난)가 있으므로 빈칸에는 단수명사가 와야 합니다. 따라서 🧐increase🧐가 정답입니다."},
			{"This coupon for 25% off is only valid on certain ______ totaling $50 or more of regularly priced items.",
			"1. purchased  2. to purchase   3. purchase   4.purchases","4",
			"빈칸 앞에 전치사 on과 형용사 certain(특정한)이 있으므로 명사가 와야하고, purchase는 가산명사인데 앞에 관사가 없으므로 복수 형태인 🧐purchases🧐가 정답입니다."},
			{"Japanese authorities are conducting preliminary talks to obtain ______ from other participating nations.",
			"1. consent   2. consents   3. consented   4. consenting","1",
			"obtain의 목적어 자리이므로 명사가 와야 하고, content(허가)는 불가산명사이므로 단수로만 쓸 수 있습니다. 따라서 정답은 🧐content🧐 입니다. "},
			{"The VCT staff is preparing a comprehensive ______ about the new insurance policy.",
			"1. information   2. news   3. presentation   4. pass","3",
			"문맥상 '종합적 발표/정보'모두 가능해보이지만, 불가산명사인 information은 앞에 관사 a가 올 수 없으므로 정답은 🧐presentation🧐 입니다."},
			{"______ to this facility is not permitted unless you hold an authorized pass.",
			"1. Approach   2. Guide   3. Access   4. Market","3",
			"빈칸은 주어 자리이므로 명사가 와야 합니다. 가산명사 Approach는 한정사 없이 단수로 쓰일 수 없기 때문에 불가산명사 🧐Access🧐가 정답입니다."},
			{"We are planning to interview ______ for the position of Corporate Development Director",
			"1. apply   2. applicants   3. applicant   4. appliance","2",
			"빈칸은 to interview의 목적어 자리이므로 명사가 와야합니다. 문맥상 '지원자'가 적절하고, 가산명사 applicant는 한정사 없이 단수로 쓸 수 없어 🧐applicants🧐가 정답입니다."},
			{"Mr.Abrams is preparing for the weekly meeting by making ______ for next year's budget.",
			"1. propose   2. proposed   3. proposal   4. proposals","4",
			"빈칸은 동명사 making의 목적어 자리이므로 명사가 와야하고, 가산명사 proposal은 한정사 없이 단수로 쓸 수 없어 복수 형태의 🧐proposals🧐가 정답입니다."},
			{"Miler's new book summarizes much-disputed ______ of a purely competitive labor market.",
			"1. characterized   2. characteristics   3. characteristic   4. character","2",
			"빈칸은 much-disputed의 수식을 받고, of 이하 전치사구와 연결되는 명사 자리입니다. 가산명사 characteristic 앞에 한정사가 없으므로 🧐charateristics🧐이 정답입니다."},
			{"During the conference, Mr.Sato made a presentation regarding recent urban ______ in Lagos.",
			"1. renewal   2. renew   3. to renew   4. renews","1",
			"빈칸 앞 recent(최근), urban(도시의)는 모두 형용사이므로 빈칸은 명사 자리 입니다. 따라서 정답은 🧐renewal🧐 입니다."},
			{"Sami Co. has expressed an ______ in acquiring five new retail outlets",
			"1. interested   2. interesting   3. interest   4. interests","3",
			"부정관사 a/an 뒤에는 반드시 단수명사가 와야하므로 정답은 🧐interest🧐 입니다."}};
	
	
	
	String grammarTest4[][] = {{"We always make sure that all our customers' information is strictly ______.",
		"1. confidenct   2. confidential   3. confidentially   4. confidences","2",
		"빈칸은 동사 is의 보어 자리이고, 부사 strictly의 수식을 받아야 하므로 형용사 🧐confidential🧐이 정답입니다."},
		{"A clear and simple site layout will make your Web site ______ to clients.",
		"1. attraction   2. attract   3. to attract   4. attractive","4",
		"빈칸은 동사 5형식 동사 make의 목적격 보어 자리이고, 목적어 'Web site'의 성질을 설명하므로 형용사 🧐attractive🧐가 정답입니다."},
		{"The book was enriched with ______ footnotes and lovingly detailed illustraions.",
		"1. lengthen   2. length   3. lengthy   4. lengthens","3",
		"빈칸 앞은 with(전치사) 뒤에는 footnotes(명사)이므로 형용사나 복합명사를 이루는 명사가 나와야 합니다. 문맥상 '긴 주석'이 적절하므로 형용사 🧐lengthy🧐가 정답입니다."},
		{"The project was ______ when Dr.Prosser put the finishing touches on it this afternoon.",
		"1. completes   2. completing   3. completion   4. complete ","4",
		"빈칸은 동사 was의 주격 보어 자리이고, The project의 상태를 나타내므로 형용사가 와야 합니다. project는 '완성되는 것'이므로 🧐complete🧐가 정답입니다."},
		{"It is ______ to inspect your tires for wear and check air pressure before, during and after long journeys.",
		"1. advise   2. advisory   3. advisable   4. advising","3",
		"빈칸은 동사 is의 보어 자리이고, to 부정사 이하가 진주어이므로 해석해보면 '타이어를 점검하는 것이 바람직하다'가 적절하므로 🧐advisable🧐이 정답입니다."},
		{"Truckee Co. offers ______ reliable models of automobiles suitable to the needs of all consumers."
		,"1. variety   2. various   3. variable   4. variation","2",
		"빈칸에는 동사 offers의 목적어인 models를 수식하는 형용사가 와야 합니다. 문맥상 '믿을만한 다양한 모델'이 적절하므로 🧐various🧐가 정답입니다."},
		{"A range of healthcare issues ______ for the audience will be addressed during the discussion.",
		"1. relevant   2. relevantly   3. relevance   4. relevancy","1",
		"형용사가 수식하는 어구가 길어지면 명사 뒤에서 수식합니다. 따라서 A range of healthcare issues를 수식하는 형용사 🧐relevant🧐가 정답입니다."},
		{"The market for high-quality home furnishings has become very ______.",
		"1. compete   2. competition   3. competitive  4. to compete","3",
		"빈칸은 동사 become의 보어 자리이고, 부사 very의 수식을 받으므로 형용사 🧐competitive🧐가 들어가야합니다."},
		{"As long as you perform regular maintenance on your computer, it should remain ______.",
		"1. funtionally   2. function   3. functionality  4. functional","4",
		"동사 remian은 형용사 보어가 필요하므로 빈칸은 형용사 🧐functional🧐이 들어가야합니다."},
		{"Proper use of our tracking system will make your company more ______ among other similar companies.",
		"1. compete   2. competitive   3 competition   4. competes","2",
		"빈칸은 동사 make의 목적격 보어 자리이고, 빈칸 앞에 비교급 more이 있으므로 형용사 🧐competitive🧐가 들어가야 합니다."},
		{"Our customer sevice department strives to deal with any problems with our serive in a ______ manner.",
		"1. timely   2. timed   3. time   4. timing","1",
		"빈칸은 뒤의 manner을 수식하는 형용사 자리이고, 문맥상 '시의적절한 방식으로(in a timely manner)'가 적절하므로 🧐timely🧐가 정답입니다."},
		{"Among many new prominent recruits, Jaden is expected to be a particularly ______ perfromer.",
		"1. distinction   2. distinct   3. distinctive   4. distinctions","3",
		"빈칸은 부사 particularly의 수식을 받고, 명사 performer를 수식하는 형용사 자리이므로 🧐distinctive🧐가 들어가야 합니다."},
		{"We will keep all the committee members ______ on the progress of our search for a new Vice President.",
		"1. post   2. posted   3. posting   4. to post","2",
		"5형식 동사 keep은 ⌜keep + 목적어 + 형용사⌟ 형태로 쓰고, 문맥상 '위원회 전원에게 계속 정보를 제공하다(kepp + 사람 + posted)'가 적절하므로 🧐posted🧐가 정답입니다."},
		{"The all-in-one complete vitamin from Pinni Pharmaceuticals is ______ of its healthcare products.",
		"1. represented   2. representative   3. represent   4. representation","2",
		"빈칸은 동사 is와 of 사이에 있으므로 형용사/명사가 들어갑니다. 문맥상 vitamin이 '대표하는 것(be representative of)'이 적절하므로 🧐representative🧐가 정답입니다."},
		{"______ team leaders should be skilled in managing and resolving conflicts among their team.",
		"1. Successful   2. Successive   3. Success   4. Succession","1",
		"빈칸은 team leaders를 수식하는 형용사가 들어가야 합니다. 문맥상 '성공적인 팀장들'이 적절하므로 🧐successful🧐이 정답입니다."}};
	
	
	
	
	



	@Override
	public void grammarTest(String[][] grammar) {
		for(;;) {
			System.out.println("🧒🏻 Intermediate level의 문법 테스트는 총 10문제로 7문제 이상 맞춰야 합격입니다.");
//			System.out.println("제한시간은 총 90초입니다.");
			System.out.println("");
			
			int score = 0;
		
			Collections.shuffle(Arrays.asList(grammar));
		
			for(int i = 0; i < 10; i++) {
				System.out.printf("Q%d. %s%n", i+1, grammar[i][0]);
				System.out.println(grammar[i][1]);
				
				int answer = sc.nextInt();
		
				if(answer == Integer.valueOf(grammar[i][2])) {
					System.out.println("정답 ⭕️ ");
					score += 10;
					System.out.println("score: " + score);
					System.out.println("");
				}else {
					System.out.println("오답 ❌: 정답은 " +  grammar[i][2] + "번 입니다.");
					System.out.println("해설 💁🏻‍♀️: " + grammar[i][3]);
					System.out.println("score: " +score);
					System.out.println("");
				}		 
			}
			if(score >= 70) {
				System.out.println("😙 축하합니다. 합격입니다.");
			}else {
				System.out.println("🤨 불합격입니다. 다시 도전해주세요.");
			}
			
			System.out.println("1. 다시 공부하기 ");
			System.out.println("2. 나가기 ");
			
			int text = sc.nextInt();
			if(text == 1) {
				line2();
				continue;
			}else if(text == 2) {
				break;
			}
		}
	}




	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
