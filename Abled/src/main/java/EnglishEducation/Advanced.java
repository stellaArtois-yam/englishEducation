package EnglishEducation;

import java.util.Arrays;
import java.util.Collections;

public class Advanced extends Intermediate{
	
	
	String words1[][] = {{"efficient","효율적인"},
			{"terrific","굉장한"},
			{"react","반응하다"},
			{"independent","독립적인"},
			{"theory","이론"},
			{"qualify","자격을 얻다"},
			{"clue","단서"},
			{"recall","상기하다"},
			{"risk","위험"},
			{"cancer","암"},
			{"treatment","취급"},
			{"specific","구체적인"},
			{"mole","점"},
			{"passion","열정"},
			{"weed","잡초"},
			{"conscience","양심"},
			{"consider","고려하다"},
			{"salary","급료"},
			{"pose","자세"},
			{"purchase","구매하다"},
			{"length","길이"},
			{"occupy","차지하다"},
			{"acquire","습득하다"},
			{"interact","상호 작용하다"},
			{"grain","곡물"}};

	
	String words2[][] = {{"conduct","수행하다"},
			{"obtain","얻다"},
			{"access","접근하다"},
			{"implement","실행하다"},
			{"exceed","초과하다"},
			{"inspect","점검하다"},
			{"review","검토하다"},
			{"reserve","예약하다"},
			{"retain","유지하다"},
			{"enter","참가하다"},
			{"lead","이끌다"},
			{"register for","~에 등록하다"},
			{"compensation","보상"},
			{"participate in","~에 참석하다"},
			{"refer to","~를 참조하다"},
			{"function as","~의 역할을 하다"},
			{"consent to","~에 동의하다"},
			{"refrain from","~하는 것을 삼가다"},
			{"collaborate on","~에 대해 협력하다"},
			{"report to","~에게 보고하다"},
			{"transfer to","~로 전근가다"},
			{"turn up","도착하다"},
			{"disclosure","폭로"},
			{"supplement","보충하다"},
			{"instruct","~에게 지시하다"}};


	String words3[][] = {{"reimbursement","환급"},
			{"streamline","간소화하다"},
			{"remote","거리가 먼"},
			{"assure","확인하다"},
			{"reliably","신뢰할 수 있게"},
			{"capability","역량"},
			{"promote","승진시키다"},
			{"prosecution","기소"},
			{"suburb","교외지역"},
			{"admit","인정하다"},
			{"process","처리하다"},
			{"launch","시작하다"},
			{"achieve","달성하다"},
			{"locate","위치를 찾아내다"},
			{"resume","재개하다"},
			{"complete","완료하다"},
			{"accommodate","수용하다"},
			{"arrange","준비하다"},
			{"result in","~을 야기하다"},
			{"result from","~이 원인이다"},
			{"specailize in","~을 전문으로 하다"},
			{"revert to","~로 돌아가다"},
			{"proceed with","~을 진행하다"},
			{"merge with","~와 합병하다"},
			{"agree on","~에 대해 찬성하다"}};


	String words4[][] = {{"concide with","~와 일치하다"},
			{"inquire about","~에 관해 문의하다"},
			{"comply with","~을 준수하다"},
			{"vote for","~를 선출하다"},
			{"serve as","~로서 일하다"},
			{"commence","시작하다"},
			{"give birth","출산하다"},
			{"taking a leave of absence","휴직하다"},
			{"order of business","처리해야 할 업무"},
			{"perceive","인지하다"},
			{"conform","규칙을 따르다"},
			{"emerge","드러나다"},
			{"suspend","중단시키다"},
			{"on behalf of","~을 대신하여"},
			{"in recognition of","~을 인정하여"},
			{"replace","교체하다"},
			{"allocate","할당하다"},
			{"consult","상의하다"},
			{"address","연설하다"},
			{"feature","특징으로 삼다"},
			{"release","발표하다"},
			{"detail","상세히 알리다"},
			{"meet","충족시키다"},
			{"renew","갱신하다"},
			{"account for","차지하다"}};


	String words5[][] = {{"appeal to","~의 관심을 끌다"},
			{"compete with","~와 경쟁하다"},
			{"depend on","~에 달려있다"},
			{"succeed in","~에 성공하다"},
			{"respond to","~에 반응하다"},
			{"contribute to","~에 공헌하다"},
			{"fall by","~만큼 떨어지다"},
			{"inadvertently","부주의로"},
			{"initiate","시작하다"},
			{"proficiency","능력"},
			{"substantial","상당한"},
			{"desirably","바람직하게"},
			{"hospitality","환대"},
			{"submission","제출"},
			{"fondness","개인적인 기호"},
			{"tentative","임시의"},
			{"affiliate","연계하다"},
			{"proximity","근접"},
			{"venue","장소"},
			{"disrupt","방해하다"},
			{"accelerate","가속화하다"},
			{"remark on","~을 언급하다"},
			{"qualify for","~의 자격이 있다"},
			{"interfere with","~을 방해하다"},
			{"expand into","~로 확장하다"}};

	String wordsT[][]= {{"efficient","효율적인"},{"terrific","굉장한"},{"react","반응하다"},{"independent","독립적인"},
			{"theory","이론"},{"qualify","자격을 얻다"},{"clue","단서"},{"recall","상기하다"},{"risk","위험"},
			{"cancer","암"},{"treatment","취급"},{"specific","구체적인"},{"mole","점"},{"passion","열정"},
			{"weed","잡초"},{"conscience","양심"},{"consider","고려하다"},{"salary","급료"},{"pose","자세"},
			{"purchase","구매하다"},{"length","길이"},{"occupy","차지하다"},{"acquire","습득하다"},{"interact","상호 작용하다"},
			{"grain","곡물"},{"conduct","수행하다"},{"obtain","얻다"},{"access","접근하다"},{"implement","실행하다"},
			{"exceed","초과하다"},{"inspect","점검하다"},{"review","검토하다"},{"reserve","예약하다"},{"retain","유지하다"},
			{"enter","참가하다"},{"lead","이끌다"},{"register for","~에 등록하다"},{"compensation","보상"},
			{"participate in","~에 참석하다"},{"refer to","~를 참조하다"},{"function as","~의 역할을 하다"},{"consent to","~에 동의하다"},
			{"refrain from","~하는 것을 삼가다"},{"collaborate on","~에 대해 협력하다"},{"report to","~에게 보고하다"},
			{"transfer to","~로 전근가다"},{"turn up","도착하다"},{"disclosure","폭로"},{"reliably","신뢰할 수 있게"},
			{"supplement","보충하다"},{"instruct","~에게 지시하다"},{"reimbursement","환급"},{"streamline","간소화하다"},
			{"remote","거리가 먼"},{"assure","확인하다"},{"capability","역량"},	{"accommodate","수용하다"},{"arrange","준비하다"},
			{"promote","승진시키다"},{"prosecution","기소"},{"suburb","교외지역"},{"admit","인정하다"},{"process","처리하다"},
			{"launch","시작하다"},{"achieve","달성하다"},{"locate","위치를 찾아내다"},{"resume","재개하다"},{"complete","완료하다"},
			{"result in","~을 야기하다"},{"result from","~이 원인이다"},{"specailize in","~을 전문으로 하다"},
			{"revert to","~로 돌아가다"},{"proceed with","~을 진행하다"},{"merge with","~와 합병하다"},
			{"agree on","~에 대해 찬성하다"},{"concide with","~와 일치하다"},{"inquire about","~에 관해 문의하다"},{"comply with","~을 준수하다"},
			{"commence","시작하다"},{"give birth","출산하다"},{"consult","상의하다"},{"address","연설하다"},	{"serve as","~로서 일하다"},
			{"taking a leave of absence","휴직하다"},{"order of business","처리해야 할 업무"},{"vote for","~를 선출하다"},
			{"perceive","인지하다"},{"conform","규칙을 따르다"},{"emerge","드러나다"},{"suspend","중단시키다"},
			{"on behalf of","~을 대신하여"},{"in recognition of","~을 인정하여"},{"replace","교체하다"},{"allocate","할당하다"},
			{"feature","특징으로 삼다"},{"release","발표하다"},{"detail","상세히 알리다"},{"meet","충족시키다"},{"renew","갱신하다"},
			{"account for","차지하다"},{"appeal to","~의 관심을 끌다"},{"compete with","~와 경쟁하다"},{"depend on","~에 달려있다"},
			{"succeed in","~에 성공하다"},{"respond to","~에 반응하다"},{"initiate","시작하다"},{"proficiency","능력"},
			{"contribute to","~에 공헌하다"},{"fall by","~만큼 떨어지다"},{"inadvertently","부주의로"},
			{"substantial","상당한"},{"desirably","바람직하게"},{"hospitality","환대"},{"submission","제출"},
			{"fondness","개인적인 기호"},{"tentative","임시의"},{"affiliate","연계하다"},{"proximity","근접"},
			{"venue","장소"},{"disrupt","방해하다"},{"accelerate","가속화하다"},{"remark on","~을 언급하다"},
			{"qualify for","~의 자격이 있다"},{"interfere with","~을 방해하다"},{"expand into","~로 확장하다"}};
	
	
	
	@Override
	public void wordTest(String[][] Word) {
		for(;;) {	
			System.out.println("🧑🏻 Advanced level의 단어 테스트는 총 20문제로 17문제 이상 맞춰야 합격입니다.");
			System.out.println("⚠️Enter를 입력하면 다음 단어로 넘어갑니다.⚠️");
//			System.out.println("제한시간은 총 120초입니다.");
			System.out.println("");
	    
			int score = 0;
			
			Collections.shuffle(Arrays.asList(Word));
		
			for(int i = 0; i < 10; i++) {
				sc.nextLine();
				System.out.printf("Q%d. %s%n", i+1, Word[i][0]);
				String answer = sc.nextLine();

				if(answer.equals( Word[i][1])) {
					System.out.println("정답 ⭕️ ");
					score += 5;
					System.out.println("score: " + score);
					System.out.println("");
				}else {
					System.out.printf("오답 ❌: 정답은 " +  Word[i][1] + "입니다.%n%n");
					System.out.println("score: " +score);
					System.out.println("");
				}		  
			}	

			Collections.shuffle(Arrays.asList(Word));
		
			for(int i = 0; i < 10; i++) {	
				sc.nextLine();
				System.out.printf("Q%d. %s%n", i+11,  Word[i][1]);
				String answer = sc.nextLine();
			
				if(answer.equals( Word[i][0])) {
					System.out.println("정답 ⭕️ ");
					score += 5;
					System.out.println("score: " + score);
					System.out.println("");
				}else {
					System.out.printf("오답 ❌: 정답은 " +  Word[i][0] + "입니다.%n%n");
					System.out.println("score: " +score);
					System.out.println("");
				}		 
			}
			System.out.printf("%nTotal score: " + score + "%n" );
		
			if(score >= 85) {
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

	
	String grammar1[] = {"Chapter 9. 부사",
			"부사는 다른 단어 앞✋이나 뒤🤚에 놓여 그 의미를 더욱 명확하게🧐 해주는 말이에요.",
			"형용사/동사/부사/문장 전체를 더 자세하게 설명하고🧑🏽‍🏫 꾸며주는🪩 역할을 합니다.",
			"부사가 없어도 완전한 문장이 될 수 있고, 부사가 동사 외에 것을 수식할 때는 수식 어구 앞에 위치합니다.",
			"일반적으로 부사는 명사를 수식하지 않지만, 명사구를 수식하는 부사도 있습니다.",
			"ex) Oscar was ☝️once☝️ ➡️ 👩🏻‍🏫a high school teacher: 명사구👨🏻‍🏫.",
			"📘 빈출부사 📘",
			"1️⃣ ever: 긍정문에는 거의 쓰이지 않고, 부정문/의문문/조건문에 쓰여 📌부정어/최상급/비교급/if📌 를 강조합니다.",
			"         부정어 강조로는 'hardly ever', 비교급 강조로는 '비교급 + than + ever: 어느 때보다 더'로 사용됩니다.",
			"2️⃣ yet: ⌈have yet to V(아직 ~하지 않다)⌋를 제외하면 대개 부정문/의문문에 쓰입니다.",
			"3️⃣ just: '이제 금방, 단지'라는 두 가지 의미로 쓰이고, 원급 비교(as ~ as)를 강조하기도 합니다.",
			"4️⃣ even: '심지어🙀'라는 뜻으로 비교급/최상급을 강조하기도 합니다.",
			"          than 뒤에서 강조하는 ever과 달리 even은 비교급 '앞'에서 강조합니다.",
			"5️⃣ still: '여전히, 아직도'라는 뜻으로 not과 함께 쓰일 때는 not 앞에 옵니다.",
			"6️⃣ once: '한 번, 한때☝️'라는 의미로 '과거의 한때'의 의미일 때 과거 시제와 함께 쓰입니다.",
			"7️⃣ well: '잘👍'이라는 의미로 '전치사' 앞에서 전치사의 정도를 강조할 때는 '충분히'라는 의미로 쓰입니다.",
			"8️⃣ further: 형용사로 쓰이면 '더 많은, 추후의', 부사로는 '더, 더 많이'라는 의미를 나타냅니다.",
			"부사 well과 further은 일반 형용사와 부사는 수식하지 못하며❌, 동사만 수식할 수 있습니다⭕️.",
			"9️⃣ enough: 형용사로 쓰이면 '충분한', 부사로 쓰이면 '충분히'라는 의미를 나타내고 형용사/부사 뒤에 위치합니다.",
			"🔟 shortly: '곧(=soon)⏳'이라는 의미로 미래 시제와 자주 쓰이며, 전치사 앞에서는 '직전, 직후'를 의미합니다.",
			"🚨 otherwise ☝️다르게 ✌️그 외에는 🤟그렇지 않으면 이라는 세 가지 의미로 사용됩니다. "};
	
	
	String grammar2[] = {"Chapter 10. 대명사",
			"대명사는 명사를 대신하는 말이에요. 따라서 명사와 똑같이 주어, 목적어, 보어의 역할을 합니다.",
			"또한, 쓰임에 따라 인칭대명사, 재귀대명사, 지시대명사, 부정대명사로 나뉘어요.",
			"1️⃣ 인칭대명사: 사람👩🏻 또는 사물📦을 가리키는 대명사",
			"            인칭대명사는 앞에 나온 명사의 성별, 수, 격에 맞춰서 씁니다.",
			"            주격은 주어 자리, 소유격은 명사 앞자리, 목적격은 동사나 전치사의 목적어 자리에 쓰입니다.",
			"2️⃣ 재귀대명사: 주어와 목적어가 같거나🟰 의미를 강조📌할 때 쓰는 대명사",
			"            재귀대명사는 [동사의 동작을 행하는 주체 = 목적어]인 경우 목적어로 재귀대명사를 사용합니다.",
			"            주어 자리에는 쓰이지 않으며, 명사(특히 주어)를 강조하여 '~스스로, ~직접'이라는 의미로 쓰입니다.",
			"📘 재귀대명사의 숙어 표현 ✅ by oneself(=alone) 혼자서      ✅ for oneself 혼자의 힘으로",
			"                     ✅ one's own + 명사 ~만의 명사      ✅ one's own ~만의 것",
			"                     ✅ on one's own 혼자서, 혼자의 힘으로 ✅ of itself 저절로 ",
			"3️⃣ 지시대명사: 어떤 대상을 가리키는🫵🏻 대명사",
			"            지시대명사는 this(이것)/that(저것)/these(이것들)/those(저것들)이 있습니다.",
			"            앞에서 언급된 명사를 대신할 때 단수☝️는 that, 복수✌️는 those로 받습니다.",
			"            또한, those가 '사람들👨‍👩‍👦'이라는 의미일 때, 📌관계대명사 who 📌p.p 📌V-ing 📌전치사구 등 다양한 수식어가 뒤따를 수 있습니다.",
			"4️⃣ 부정대명사: 불특정한 사람이나 사물을 나타내는 대명사",
			"📘 종류 ✅ one 	하나            ✅ another 또 다른 하나       ✅ the other 나머지 하나",
			"       ✅ others 다른 것(사람)들 ✅ the others 나머지 것(사람들) ✅ other 다른",
			"       ✅ each other/one another 서로",
			"another은 정해지지 않은 하나, the other/the others는 정해진 범위 내에서 나머지를 가리킵니다.",
			"it과 one은 모두 앞의 명사를 가리키지만 it은 앞에 나온 명사를, one은 앞에 나온 명사와 '같은 종류🟰의 불특정한 것'을 가리킬 때 씁니다.",
			"또 다른 부정대명사로는 any와 some이 있습니다.",
			"any는 형용사로 '그 어떤, 전혀, 아무', 대명사로 '아무 (것), 그 어떤 것'으로 쓰이며, 부정문🙅‍♀️/의문문❓/조건문💁🏻‍♂️에 주로 쓰입니다.",
			"형용사) As Mr.Simpson has a lot of experience, he should 🌱not🌱 have 🌱any🌱 difficulty finding a job.",
			"대명사) We are sorry that we 🌱don't🌱 have 🌱any🌱.",
			"some은 형용사로 '약간의🤌, 어떤🤷‍♂️', 대명사로 '일부, 몇몇👭'으로 쓰이며, 주로 긍정문🙆‍♀️에서 쓰입니다.",
			"추가로 혼동하기 쉬운 부정어로는 no(형용사), none(대명사)가 있습니다.",
			"no는 명사를 수식하여 부정문을 만드는 '형용사'로 쓰이고, none은 ⌈no + 명사⌋의 의미입니다."};


	
	
	String grammar3[] = {"Chapter 11. 전치사",
			"전치사는 명사 앞에 위치해 시간, 장소, 이유, 목적 등을 나타냅니다.",
			"또한, 명사를 연결하는 역할을 하고, 전치사구(전치사 + 명사)는 형용사나 부사 역할을 합니다.",
			"명사 연결) There are many requests 🌱from🌱 the new management team.",
			"형용사 역할) The new building is 🌱under construction.🌱(is의 보어)",
			"부사 역할) Computer games are not allowed to be played 🌱in the office.🌱(be played 수식)",
			"전치사 뒤에 문장은 올 수 없고, 명사 형태(명사/동명사/명사절)가 옵니다.",
			"전치사 앞에는 명사뿐 아니라 형용사나 동사도 올 수 있습니다.",
			"⏰ 시간 전치사 ⏰",
			"✅ at + 시각/정확한 시점 : at 10 PM / at noon",
			"✅ on + 날짜/요일/주중/주말 : on Febrary 13 / on Wednesday / on weekends",
			"✅ in + 월/연도/계절/세기 : in September / in 2022 / in the Summer / in the 21st century",
			"시간 전치사를 사용할 때, 시점을 나타낼 때 쓰는 전치사와 기간을 나타낼 때 쓰는 전치사를 잘 구분해야 합니다.",
			"when으로 물어본다면 시점📅을 나타내는 표현을, how long으로 물어본다면 기간🎞을 나타내는 표현으로 대답합니다.",
			"📅 시점을 나타낼 때 쓰는 전치사 📅",
			"✅ since + 과거 시점 : ~이래로    ✅ by(no later than)+ 시점 : ~까지",
			"✅ until + 시점 : ~까지         ✅ before + 시점 : ~전에",
			"✅ from + 시점 : ~부터 ",
			"🎞 기간을 나타낼 때 쓰는 전치사 🎞",
			"✅ within 	+ 기간 : ~이내에   ✅ during + 기간 : ~동안에",
			"✅ for + 기간 : ~동안에       ✅ over + 기간 : ~동안에, ~이상",
			"✅ throughout + 기간 : ~내내",
			"🏝 장소 전치사 🏝",
			"✅ in + 공간(마을/도시/국가/대륙 등) : in (the) town / in London / in USA",
			"✅ at + 지점(공항/정류장 등) : at the airport / at the intersection of",
			"✅ on + 표면(층/선반/웹사이트 등) :  on the third floor / on the top shelf",
			"↕️ 위치/방향을 나타내는 전치사↔️",
			"✅ to : ~로/~에게      ✅ from : ~로부터                 ✅ beside/next to : ~ 옆에",
			"✅ near : 가까이에      ✅ within + 장소/범위 : ~ 이내에    ✅ throughout : ~곳곳에/~에 걸쳐",
			"✅ above/over : ~위에  ✅ under/below : ~밑에           ✅ across : ~을 건너/~곳곳에",
			"✅ beyond : ~너머      ✅ into : ~의 속으로              ✅ out of : ~의 밖으로",
			"✅ along : ~을 따라     ✅ against : ~에 맞서서/~에 기대에  ✅ past : ~을 지나",
			"✅ through : (장소/과정)을 거쳐/(시간) 끝까지,내내/(수단)을 통해"};
	
	
	
	String grammar4[] = {"Chapter 12. 접속사",
			"접속사는 문장을 연결🖇하는 역할을 합니다. 따라서 뒤에 ❗️문장❗️이 오는 반면, 전치사는 뒤에 문장이 아닌 ❗️명사 형태❗️가 와야 합니다.",
			"접속사, 전치사, 부사는 매우 다양하기 때문에 정확한 품사와 의미를 알아두어야 합니다.",
			"🖇 접속사 🖇",
			"1️⃣ 이유 : ✅ because/as/since/now that ~때문에",
			"2️⃣ 양보 : ✅ though/although/even though/even if ~에도 불구하고",
			"         ✅ while/whereas ~인 반면에",
			"3️⃣ 시간 : ✅ when/as/at the time ~할 때      ✅ once 일단 ~하면",
			"         ✅ as soon as ~하자마자             ✅ while ~하는 동안에",
			"         ✅ by the time ~할 때쯤에           ✅ every time ~할 때마다",
			"         ✅ before/after ~전에/~후에",
			"4️⃣ 조건 : ✅ provided that/providing that/if ~한다면",
			"         ✅ unless ~하지 않는 한              ✅ as long as ~하기만 한다면",
			"         ✅ only if ~하는 경우에만",
			"5️⃣ 기타 : ✅ in that ~라는 점에서               ✅ in the event ~할 경우에",
			"         ✅ assuming that ~라고 가정해볼 때     ✅ in case ~의 경우를 대비해서",
			"         ✅ whether or not ~이든 아니든 관계없이",
			"         ✅ as if/as though 마치 ~인 것처럼",
			"         ✅ so ~ that/such ~ that 너무 ~해서 ...하다",
			"         ✅ despite the fact that ~라는 사실에도 불구하고",
			"         ✅ given that/considering (that) ~라는 점을 고려하면",
			"접속사에는 📌상관접속사/등위접속사/부사절 접속사📌가 있습니다.",
			"상관접속사❗️는 다음과 같이 짝🤼‍♀️을 지어 쓰는 접속사 입니다.",
			"✅ either A and B : A이거나 B이거나   ✅ neither A nor B : A도 B도 아닌",
			"✅ not A but B : A가 아니라 B      ✅ not only A but (also) B : A뿐만 아니라 B도 역시",
			"✅ both A and B : A와 B 둘다",
			"등위접속사❗️는 같은 단위를 대등🟰하게 연결하는 접속사이므로 등위접속사 앞뒤는 같은 품사나 구조가 병렬되어야 합니다.",
			"✅ and/so 그래서   ✅ but 그러나   ✅ or 혹은, 그렇지 않으면  ✅ for ~때문에",
			"또한, 등위접속사는 문장을 연결할 때 두 문장의 가운데에 위치하며, 첫 문장 앞에 위치해 연결할 수는 없습니다🙅‍♀️.",
			"부사절 접속사❗는 완전한 두 문장을 연결하는 접속사 입니다.",
			"⌈부사절 접속사 + 문장⌋은 부사 역할을 하므로 생략해도 무방합니다.",
			"🚨혼동하기 쉬운 부사절 접속사🚨",
			"✅ once vs if : once는 '일단 ~한 후에'라는 의미의 시간 부사절 접속사이므로 조건을 나타내는 if와는 쓰임이 다릅니다.",
			"ex) (Once❌/If⭕️) you are looking for a pleasant vacation spot, visit Cast Lodge.",
			"✅ until vs while : until은 '완료'의 의미를 나타내는 동사와 while은 '진행'의 의미를 나타내는 동사와 자주 쓰입니다.",
			"ex) No one can enter the facility (until⭕️/while❌) renovations are completed."};
	
	
	
	String grammarTest1[][] = {{"Of the three proposals, Mr.Forest was ______ impressed with the one Frank submitted.",
		"1. particular   2. particulars   3. particularly   4. particularity","3",
		"⌜be동사 + p.p⌟ 사이에서 동사(was impressed)를 수식하기 때문에 부사 🧐particularly🧐가 정답입니다."},
			{"Sport fishing is becoming an ______ popular attraction for visiting tourists.",
			"1. increasing   2.increasingly   3. increased   4. increases","2",
			"빈칸이 ⌜형용사 + 명사⌟ 앞에 있으므로 부사/형용사가 올 수 있습니다. 문맥상 '점점 더 인기가 있는 볼거리'가 적절하므로 부사 🧐increasingly🧐가 정답입니다."},
			{"The new manager has worked ______ to creat an atmosphere of trust among team members.",
			"1. persist   2. persistent   3. persistence   4. persistently","4",
			"work는 자동사로 목적어를 갖지 않으므로 빈칸에는 자동사 work를 수식하는 부사가 와야 합니다. 따라서 정답은 🧐persistently🧐입니다."},
			{"The AbleD Corporation's profits are higher than they ______ were.",
			"1. ever   2. so   3. still   4. yet ","1",
			"빈칸은 부사 자리이고, 문맥상 '그 어느때 보다도'라는 의미가 적절하므로 비교급과 함께 쓰여 비교의 의미를 강조하는 부사 🧐ever🧐이 정답입니다."},
			{"If you have ______ to file an income tax return, please complete the form as soon as possible.",
			"1. already   2. yet   3. all   4. still","2",
			"'have already p.p'는 가능하지만 'have already to V'라는 표현은 없습니다. 'have yet to V (아직 ~하지 않다)'가 문맥상 적절하므로 정답은 🧐yet🧐입니다."},
			{"Even after failing to meet last year's sales target, Hyundai is ______ the number one automotive company."
			,"1. yet   2. ever   3. very   4. still","4",
			"매출 목표를 달성하지 못한 후에도 '여전히/아직도' 1위 기업'이라는 뜻이 되어야 하므로 정답은 🧐still🧐입니다."},
			{"Jaden requires that each employee conduct his own performance evaluation ______ a month.",
			"1. once   2. every   3. only   4. much","1",
			"'한 달에 한 번'이라는 뜻이 문맥상 적절하고, every 뒤에는 가산 단수명사가 와야 하므로 'every month'가 되어야 합니다. 따라서 정답은 🧐once🧐입니다."},
			{"The public library on Janggi Street will be closed until ______ notice due to renovations.",
			"1. extra   2. more   3. further   4.late ","3",
			"형용사 further(더 많은)와 extra(추가의/여분의)는 의미가 유사하지만, 관용적 숙어 'until further notice(추후 공지가 있을 때까지)'라는 표현이 있어 정답은 🧐further🧐입니다."},
			{"We will contact all applicants we would like to interview ______.",
			"1. nearly   2. shortly   3. recently   4. presently","2",
			"부사 nearly(거의)와 shortly(곧) 둘 다 문맥상 가능해 보이지만, nearly는 반드시 수식하는 단어 앞에 와야하므로 정답은 🧐shortly🧐입니다."},
			{"Hai Motors has ______ recalled its new SUV model due to mechanical problems with the vehicle.",
			"1. voluntarily   2. voluntary   3. voluntaries   4. volunteer","1",
			"동사 have recalled 사이에 빈칸이 있으므로 빈칸에는 부사가 들어가야 합니다. 따라서 정답은 🧐voluntarily🧐입니다."},
			{"The organizer of the meeting ______ asked that everyone refrain from using their phone during the presentation.",
			"1. kindly   2. kind   3. kindness   4. kindliest","1",
			"주어와 동사 사이에 빈칸이 있으므로 빈칸에는 동사 asked를 수식하는 부사가 들어가야 합니다. 따라서 정답은 🧐kindly🧐입니다."},
			{"______, your agent was not willing to listen to my complaints when I called her.",
			"1. Apparent   2. Apparently   3. Appear   4. Appearance ","2",
			"⌜---, + 문장⌟의 형태로 부사는 문장 앞에서 문장 전체를 수식할 수 있습니다. 따라서 정답은 🧐Apparently🧐입니다."},
			{"Please remain seated your seatbelt ______ fastened until the plane has come to a complete stop.",
			"1. secure   2. security   3. securely   4. secured","3",
			"⌜with + 명사 + --- + 형용사⌟는 형용사가 명사를 빈칸이 형용사를 수식하는 형태입니다. 따라서 빈칸은 fastened를 수식하는 부사 🧐securely🧐입니다."},
			{"______ located near Seoul University, Popping Printing offers 24-hour fax, copy and printing service.",
			"1. Convenience   2. Convenient   3. Convention   4. Conveniently","4",
			"______ ~ University는 분사구문입니다. 빈칸이 없어도 문장이 완벽하므로 빈칸은 과거분사 located를 수식하는 부사 🧐conveniently🧐입니다."},
			{"The CEO ______ announced the company's decision on the new operating procedures this morning.",
			"1. lately   2. just   3. yet   4. even","2",
			"빈칸이 주어와 동사 사이에 있으므로 부사가 들어가야 하고, 문맥상 '막 발표했다'가 적절하므로 🧐just🧐가 정답입니다."}};
	
	
	
	String grammarTest2[][] = {{"Before Ms.Liu left the company, ______ submitted her resignation to the head of the department.",
		"1. she   2. her   3. herself   4. hers","1",
		"빈칸은 주어 자리이고, 주격/소유대명사가 올 수 있습니다. 문맥상 '그녀가 제출했다'가 적절하므로 주격 대명사 🧐she🧐가 정답입니다."},
			{"Every member had to accept Mr.Lee's idea since ______ argued very persuasively.",
			"1. his   2.him   3. himself  4. he","4",
			"빈칸은 주어 자리이고, 주격/소유대명사가 올 수 있습니다. 문맥상 '그가 주장했다'가 적절하므로 주격 대명사 🧐he🧐가 정답입니다."},
			{"Mr.Ten has recently signed up for an accounting course at the university to increase ______ chances for promotion.",
			"1. him   2. he   3. his   4. himself","3",
			"빈칸은 명사 chances(가능성)를 수식하는 자리이므로 명사를 수식하는 소유격 🧐his🧐가 정답입니다."},
			{"Since Ms.Lang has been a valued customer, we will give ______ special discounts.",
			"1. her   2. hers   3. herself   4. she ","1",
			"4형식 동사 give는 목적어를 2개 가질 수 있습니다. 문맥상 '우리는 그녀에게 특별 할인을 줄 것이다'가 적절하므로 목적격 대명사 🧐her🧐이 정답입니다."},
			{"As all technicians were out of the office, Ms.Han had to fix the broken copy machine by ______.",
			"1. themselves   2. herself   3. sheself   4. theyselves","2",
			"by oneself는 '혼자서'라는 의미로, 주어가 Ms.Han이고 그녀 혼자서 복사기를 수리해야 했던 상황이므로 그녀를 가르키는 🧐herself🧐가 정답입니다."},
			{"The manager was not able to meet the deadline for the project by ______, so she had to ask for help."
			,"1. her  2. herself   3. she   4. hers","2",
			"by(전치사)는 뒤에 목적격/재귀대명사가 올 수 있습니다. 문맥상 '관리자가 혼자서 기한을 맞출 수 없었다'가 적절하므로 정답은 🧐herself🧐입니다."},
			{"With the help of our instructors, you will be able to learn at ______ own pace.",
			"1. your   2. you  3. yours   4. yourself","1",
			"'one's own'은 명사 앞에서 명사를 수식하여 '~만의(명사)'라는 뜻으로 쓰이므로 정답은 🧐your🧐이 됩니다."},
			{"Night shift employees are paid much higher than ______ working the day shift.",
			"1. them   2. they   3. those   4. these","3",
			"'night shift employees'와 'day shift employees'를 비교하고 있으므로 employees(복수명사)를 받는 지사대명사 🧐those🧐가 정답입니다."},
			{"The event coordinator suggested that ______ wishing to attend the show reserve a ticket two weeks ago.",
			"1. they   2. them   3. these   4. those","4",
			"빈칸은 that절의 주어 자리로 wishing의 수식을 받습니다. they(인칭대명사)는 수식을 받을 수 없으므로 정답은 🧐those🧐입니다."},
			{"A free information packet is available for ______ interested in the upcoming management seminar.",
			"1. whoever   2. they   3. these   4. those","4",
			"whoever(anyone who) 뒤에는 반드시 동사가 와야합니다. 따라서 interested in(형용사구)의 수식을 받을 수 있는 🧐those🧐가 정답입니다."},
			{"If any of the appliances turns out to be defective, we will replace each one with ______.",
			"1. each other   2. other   3. another   3. the others","3",
			"문맥상 가전기기를 '서로 교환하는 것'이 아니라 '다른 것으로 교체해 주는 것'이 적절하므로 '임의의 다른 하나'를 뜻하는 🧐another🧐가 정답입니다."},
			{"When I visited Emart at 8 in the morning, there were ______ working in the store.",
			"1. no   2. none   3.nothing   4.not ","2",
			"there문의 명사(빈칸)는 앞의 동사(were)와 수가 일치해야 하므로 단수/복수로 둘 다 쓰이는 🧐none🧐이 정답입니다."},
			{"We are sorry that we don't have ______ of the equipment you want to purchase now.",
			"1. many   2.any   3. some   4. each","2",
			"equipment는 불가산명사입니다. 'any of the'는 뒤에 가산 복수명사/불가산 단수명사가 올 수 있으므로 정답은 🧐any🧐입니다."},
			{"If you encounter a problem with our products, please report ____ to our sales representatives.",
			"1. one   2. it   3. them   3. its","2",
			"빈칸은 report의 목적어 자리로 it/them이 올 수 있다. 문맥상 '문제를 보고하다'가 적절하므로 a problem을 받는 🧐it🧐이 정답입니다."},
			{"______ of the proposals to build more production facilities are expected to be approved immediately.",
			"1. Several   2. Either   3. Any   4. Another","1",
			"문장의 동사(are)가 복수이므로 '여러 가지/여러 개'를 뜻하는 🧐Several🧐이 정답입니다. 나머지는 다 단수동사와 함께 쓰입니다."}};
	
	
	
	
	
	
	String grammarTest3[][] = {{"The cafeteria will be closed ______ 10 PM unless otherwise stated.",
		"1. lately   2. soon   3. at   4. why","3",
		"빈칸 뒤에 10 PM 이라는 시각을 알려주는 명사가 있으므로 명사 앞에 쓰일 수 있는 전치사 🧐at🧐이 정답입니다."},
			{"In ______ to your request, we agree to change the date and place of the conference.",
			"1. repond   2. reponded   3. response   4. responds ","3",
			"in(전치사) 뒤에는 명사만 올 수 있습니다. 따라서 명사 🧐response🧐가 정답입니다."},
			{"Your order will arrive ______ 3 days of purchase.",
			"1. during   2. within   3. into   4. as","2",
			"문맥상 '구매 3일 이내에'가 적절하기 때문에 '~이내에'라는 뜻을 가진 🧐within🧐이 정답입니다."},
			{"______ his time at UCLA, Mr.Blue began to take an interest in film.",
			"1. During   2. Among   3. Into   4. About","1",
			"빈칸 뒤에 his time(그가 보낸 시간)은 기간을 나타냅니다. 문맥상 '그가 보낸 시간 동안에'가 적절하므로 🧐During🧐이 정답입니다."},
			{"For 24 hours a day ______ the summer, the community center will remain open.",
			"1. among   2. throughout   3. without   4. down","2",
			"among은 3개 이상을 뜻하는 복수명사와, down은 장소 표현과 함께 사용합니다. 문맥상 '여름 내내'가 적절하므로 정답은 🧐throughout🧐입니다."},
			{"Expanding our product line will keep profits from ______ excessively during economic downturns.",
			"1. decrease   2. to decrease   3. decreasing   4. decreased","3",
			"from(전치사) 뒤에는 명사가 와야하고, 동사 keep은 'keep A from V-ing(A가 ~하는 것을 막다)'로 쓰이므로 🧐decreasing🧐이 정답입니다."},
			{"Chicken Shack has locations ______ North America.",
			"1. despite   2. across   3. behind   4. among","2",
			"문맥상 '북미 전역에 지점들을 가지고 있다'가 적절하므로 '전역에'라는 의미의 🧐across🧐가 정답입니다."},
			{"The company produces manufacturing equipment ______ Europe.",
			"1. among   2. at   3. in   4. besides","3",
			"장소 중에서 국가/대륙을 나타내는 전치사가 들어가야 합니다. 따라서 정답은 🧐in🧐입니다."},
			{" place an order, simply complete the enclosed order form and send it ______ your payment.",
			"1. to   2. with   3. on   4. across","2",
			"문맥상 '당신의 지불금과 함께 그것을 보내세요'가 적절하므로 '~와 함께'라는 의미의 🧐with🧐가 정답입니다."},
			{"All open positions in the HRD are expected to be filled ______ the end of the month.",
			"1. by   2. at   3. in   4. since","1",
			"the end of(~의 끝)와 함께 쓰이는 전치사는 by(~까지)/at(~에)입니다. 문맥상 '이달 말까지'가 적절하므로 정답은 🧐by🧐입니다."},
			{"The Kims Group has been operating its downtown location on Hay Street ______ last March.",
			"1. since   2. along   3. inside   4. until","1",
			"앞 문장의 시제가 현재완료이고, 문맥상 '지난 3월 이래로 킴스 그룹이 운영하고 있다'가 적절합니다. 따라서 정답은 🧐since🧐입니다."},
			{"It was just last month that Mr.Ortega retired ______ 20 years of service to the company.",
			"1. before   2. within   3. until   4. after","4",
			"빈칸 뒤에 '20 years'는 기간을 나타내는 명사입니다. 문맥상 '20년 간 근무 후 은퇴했다'가 적절하므로 '~후'를 나타내는 🧐after🧐가 정답입니다."},
			{"As soon as the concert ends, please exit ______ the door that is closest to your seat.",
			"1. except   2. inside   3. between   4. through","4",
			"between 뒤에는 A and B의 형태/복수명사가 와야하고, 문맥상 '문을 통해 퇴장하세요'가 적절하므로 '~을 통해'라는 뜻의 🧐through🧐가 정답입니다."},
			{"According to a news report, Berry Technology intends to expand ______ Latin America.",
			"1. of   2. around   3. at   4. into","4",
			"동사 expand는 '~로 확장하다'라고 할 때 보통 전치사 into와 함께 쓰입니다. 따라서 정답은 🧐into🧐입니다."},
			{"______ its production rates at an all-time low, CEO decided to fire the factory managers.",
			"1. Into   2. With   3. Until   4. Except","2",
			"⌜with + 명사 + 형용사⌟는 '명사가 형용사인 채로'로 쓰입니다. 'at an all-time low(전치사구)'는 형용사 역할로 '생산율이 사상 최저인 채로'가 됩니다."},
			{"The reviewer was enthusiastic ______ the new movie and gave it an excellent rating in her column.",
			"1. to   2. about   3. beside   4. of","2",
			"'be enthusiastic about'은 '~에 대해 열광하다'라는 의미의 숙어 표현입니다. 따라서 정답은 🧐about🧐입니다."},
			{"In order to build more factories, at least $1.2 million will have to be spent ______ the next few years.",
			"1. beside   2. over   3. above   4. since","2",
			"문맥상 '앞으로 몇 년을 걸쳐'가 적절하므로 '~에 걸쳐/~동안'이라는 의미의 🧐over🧐이 정답입니다."},
			{"All of the members of the Accounting Department are invited to dinner ______ Jack Campbell.",
			"1. with   2. throughout   3. off   4. among","1",
			"문맥상 'Jack Campbell과 함께하는 저녁식사에 초대되다'가 적절하므로 '~와 함께'라는 의미의 🧐with🧐가 정답입니다."},
			{"To meet the demand, We will increase production by 30% ______ the end of the year.",
			"1. by   2. as   3. without   4. for","1",
			"빈칸 뒤에 '연말'이라는 뜻의 'end of the year(명사구)' 시점 표현이 있으므로 '~까지'라는 기한을 나타내는 전치사 🧐by🧐가 정답입니다."},
			{"The annual meeting with clients scheduled for last April was not held ______ July 1.",
			"1. within   2. for   3. until   4. over","3",
			"'not ~ until ...'의 형태로 쓰여 '7월 1일이 되어서야 개최되다'라는 의미가 문맥상 적절하므로 정답은 🧐until🧐이 됩니다."}};

	
	
	String grammarTest4[][] = {{"Internal communications are expected to improve ______ the new telephone system is installed.",
		"1. once   2. following   3. along with   4. owing to","1",
		"빈칸 앞뒤로 문장이 있으므로 접속사가 정답이 됩니다. once(일단 ~하면)을 제외하고 모두 전치사이므로 정답은 🧐once🧐가 됩니다."},
			{"Happy toy still leads the way in craftmanship ______ competition from rival toy company has increased significantly.",
			"1. however   2. although   3. given   4. due to","2",
			"빈칸 앞뒤로 문장이 있으므로 접속사가 정답이 됩니다. however은 접속부사, given/due to는 전치사이므로 정답은 🧐although🧐가 됩니다."},
			{"Company executives are trying to find a more efficient marketing campaign ______ the launch of its new product line.",
			"1. in case   2. likewise   3. provided that   4. prior to","4",
			"빈칸 뒤에 명사구가 왔으므로 전치사가 정답입니다. in case/provided that은 접속사, likewise는 부사이므로 정답은 🧐prior to🧐가 됩니다."},
			{"The report was read by ______ the members of the board and the company's lawyers.",
			"1. yet   2. either   3. whether   4. both","4",
			"빈칸 뒤에 A and B 형태가 있는 것으로 보아 and와 짝을 이뤄 'A와 B 둘다'라는 의미를 만들 수 있는 🧐both🧐가 정답입니다."},
			{"The registration fee will cover all travel and accomodation costs, ______ dining expenses are the participant's responsibility.",
			"1. instead   2. but   3. and   4. than","2",
			"빈칸은 문장을 대등하게 연결하는 접속사 자리입니다. 문맥상 '등록비에 모든 여행 경비와 숙박비는 포함되지만, 식사 비용은 참가자 몫이다'가 적절하므로 🧐but🧐이 정답입니다."},
			{"The company has been aware of the problem for a while and ______ its server recently.",
			"1. update   2. updates   3. updated   4. updating","3",
			"문맥상 빈칸 앞 and가 동사를 연결하고 있습니다. 주어 company는 단수고, 부사 recently를 보아 현재 시제는 불가합니다. 따라서 🧐updated🧐가 정답입니다."},
			{"No employees are permitted to go home for the day ______ all of their tasks have been completed.",
			"1. upon   2. that   3. while   4. until","4",
			"빈칸 앞뒤로 문장이 있으므로 전치사 자리이고, while 뒤에는 완료동사는 올 수 없습니다. 문맥상 '모든 업무가 완료될 때까지'가 적절하므로 🧐until🧐이 정답입니다."},
			{"______ it was damaged beyond repair, the equipment had to be sent back to the manufacturer.",
			"1. Since   2. Rather   3. Before   4. Yet","1",
			"빈칸 뒤에 완전한 두 문장이 있어 부사절 접속사(since/before)가 와야합니다. 문맥상 '그것이 파손되었기 때문에'가 적절하므로 원인을 나타내는 🧐since🧐가 정답입니다."},
			{"______ we need audio technicians, our current budget doesn't allow us to hire any.",
			"1. Since   2. Despite   3. in case   4. Although","4",
			"빈칸 뒤 완전한 두 문장을 보아 접속사 자리입니다. '음향 기술자들이 필요하지만, 예산이 허락하지 않는다'가 적절하므로 반대의 의미를 나타내는 🧐although🧐가 정답입니다."},
			{"The manager couldn't meet the deadline for the project on her own, ______ she had to ask for help.",
			"1. when   2. while   3. so   4. if","3",
			"빈칸 앞뒤로 문장이 오므로 접속사 자리입니다. 문맥상 '관리자는 기한을 지킬 수 없어 도움을 요청했다'가 적절하므로 '그래서'라는 의미의 🧐so🧐가 정답입니다."},
			{"He served as high school principal ______ being promoted to Country Supervisor.",
			"1. unless   2. since   3. before   4. as","3",
			"⌜unless/as + V-ing⌟ 형태는 잘 쓰이지 않아 since/before가 와야합니다. since는 현재완료 시제와 함께 쓰이므로 정답은 🧐before🧐입니다."},
			{"______ launching the famous chicken restaurant, she worked as a nutritionist for over 7 years.",
			"1. Among   2. So that   3. Prior to   4. Provided that","3",
			"빈칸 뒤에 동명사가 오므로 전치사가 와야합니다. '레스토랑 사업 전 영양사로 일했다'가 문맥상 적절하므로 '~이전에'라는 의미의 🧐prior to🧐가 정답입니다."},
			{"The operation of Amy's Restaurant will not begin ______ it passes the official health inspection.",
			"1. instead   2. until   3. during   4. such as","2",
			"빈칸 앞뒤 문장을 연결하는 접속사 자리입니다. instead는 부사, during/such as는 전치사이므로 정답은 🧐until🧐이 됩니다."},
			{"Passengers may order from a free selection of beveragse ______ a variety of meal options.",
			"1. and   2. just as   3. so   4. than","1",
			"빈칸은 'a free selection of beverages'와 'a variety of meal options'라는 대등한 단위를 연결하는 자리이므로 🧐and🧐가 정답입니다."},
			{"The awards ceremony began ______ all of the attendees entered the auditorium.",
			"1. once   2. just   3. first   4. also","1",
			"빈칸 앞뒤 문장을 연결하는 접속사 자리입니다. just/first/also는 모두 부사이므로 부사와 접속사로 쓰이는 🧐once🧐가 정답입니다."},
			{"Ms.Miro will hire designers for the new project, ______ the budget has been approved by the company.",
			"1. as a result   2. now that   3. up until   4. in order to","2",
			"빈칸은 앞뒤 문장을 연결하는 접속사 자리입니다. 문맥상 '예산이 승인되었기 때문에 디자이너들을 고용할 것이다'가 적절하므로 🧐now that🧐이 정답입니다."},
			{"You should have ______ your driver's license or passport with you in order to take the test.",
			"1. neither   2. either   3. not only   4. both","2",
			"either A and B (A와 B 중 하나)의 구조를 이루는 🧐either🧐이 정답이 됩니다."},
			{"Reducing energy use ______ promoting alternative energy can be a way of increasing profits at our company.",
			"1. and   2. but   3. although   4. despite","1",
			"빈칸 앞뒤로 명사구를 대등하게 연결하고 있으므로 전치사 🧐and🧐가 정답이 됩니다."},
			{"Most participants of last week's meeting agreed that Mr.Oscar's presentation was long but ______.",
			"1. information   2. informative   3. inform   4. informed","2",
			"but 뒤에 빈칸이 있어 앞 내용에 반대되는 내용이 와야합니다. 등위접속사 but이 long(형용사)과 연결하고 있으므로 🧐informative🧐가 정답입니다."},
			{"Genetech Lab vows to develop and ______ improve products that people want to enhance their lifestyle.",
			"1. continue   2. continual   3. continually   4. continuous","3",
			"and가 to develop과 (to) improve를 연결하고 있으므로 빈칸은 improve를 수식하는 부사 🧐continually🧐가 와야합니다."}};
	
	
	
	String gramT[][] = {{"Of the three proposals, Mr.Forest was ______ impressed with the one Frank submitted.",
		"1. particular   2. particulars   3. particularly   4. particularity","3",
		"⌜be동사 + p.p⌟ 사이에서 동사(was impressed)를 수식하기 때문에 부사 🧐particularly🧐가 정답입니다."},
			{"Sport fishing is becoming an ______ popular attraction for visiting tourists.",
			"1. increasing   2.increasingly   3. increased   4. increases","2",
			"빈칸이 ⌜형용사 + 명사⌟ 앞에 있으므로 부사/형용사가 올 수 있습니다. 문맥상 '점점 더 인기가 있는 볼거리'가 적절하므로 부사 🧐increasingly🧐가 정답입니다."},
			{"The new manager has worked ______ to creat an atmosphere of trust among team members.",
			"1. persist   2. persistent   3. persistence   4. persistently","4",
			"work는 자동사로 목적어를 갖지 않으므로 빈칸에는 자동사 work를 수식하는 부사가 와야 합니다. 따라서 정답은 🧐persistently🧐입니다."},
			{"The AbleD Corporation's profits are higher than they ______ were.",
			"1. ever   2. so   3. still   4. yet ","1",
			"빈칸은 부사 자리이고, 문맥상 '그 어느때 보다도'라는 의미가 적절하므로 비교급과 함께 쓰여 비교의 의미를 강조하는 부사 🧐ever🧐이 정답입니다."},
			{"If you have ______ to file an income tax return, please complete the form as soon as possible.",
			"1. already   2. yet   3. all   4. still","2",
			"'have already p.p'는 가능하지만 'have already to V'라는 표현은 없습니다. 'have yet to V (아직 ~하지 않다)'가 문맥상 적절하므로 정답은 🧐yet🧐입니다."},
			{"Even after failing to meet last year's sales target, Hyundai is ______ the number one automotive company."
			,"1. yet   2. ever   3. very   4. still","4",
			"매출 목표를 달성하지 못한 후에도 '여전히/아직도' 1위 기업'이라는 뜻이 되어야 하므로 정답은 🧐still🧐입니다."},
			{"Jaden requires that each employee conduct his own performance evaluation ______ a month.",
			"1. once   2. every   3. only   4. much","1",
			"'한 달에 한 번'이라는 뜻이 문맥상 적절하고, every 뒤에는 가산 단수명사가 와야 하므로 'every month'가 되어야 합니다. 따라서 정답은 🧐once🧐입니다."},
			{"The public library on Janggi Street will be closed until ______ notice due to renovations.",
			"1. extra   2. more   3. further   4.late ","3",
			"형용사 further(더 많은)와 extra(추가의/여분의)는 의미가 유사하지만, 관용적 숙어 'until further notice(추후 공지가 있을 때까지)'라는 표현이 있어 정답은 🧐further🧐입니다."},
			{"We will contact all applicants we would like to interview ______.",
			"1. nearly   2. shortly   3. recently   4. presently","2",
			"부사 nearly(거의)와 shortly(곧) 둘 다 문맥상 가능해 보이지만, nearly는 반드시 수식하는 단어 앞에 와야하므로 정답은 🧐shortly🧐입니다."},
			{"Hai Motors has ______ recalled its new SUV model due to mechanical problems with the vehicle.",
			"1. voluntarily   2. voluntary   3. voluntaries   4. volunteer","1",
			"동사 have recalled 사이에 빈칸이 있으므로 빈칸에는 부사가 들어가야 합니다. 따라서 정답은 🧐voluntarily🧐입니다."},
			{"The organizer of the meeting ______ asked that everyone refrain from using their phone during the presentation.",
			"1. kindly   2. kind   3. kindness   4. kindliest","1",
			"주어와 동사 사이에 빈칸이 있으므로 빈칸에는 동사 asked를 수식하는 부사가 들어가야 합니다. 따라서 정답은 🧐kindly🧐입니다."},
			{"______, your agent was not willing to listen to my complaints when I called her.",
			"1. Apparent   2. Apparently   3. Appear   4. Appearance ","2",
			"⌜---, + 문장⌟의 형태로 부사는 문장 앞에서 문장 전체를 수식할 수 있습니다. 따라서 정답은 🧐Apparently🧐입니다."},
			{"Please remain seated your seatbelt ______ fastened until the plane has come to a complete stop.",
			"1. secure   2. security   3. securely   4. secured","3",
			"⌜with + 명사 + --- + 형용사⌟는 형용사가 명사를 빈칸이 형용사를 수식하는 형태입니다. 따라서 빈칸은 fastened를 수식하는 부사 🧐securely🧐입니다."},
			{"______ located near Seoul University, Popping Printing offers 24-hour fax, copy and printing service.",
			"1. Convenience   2. Convenient   3. Convention   4. Conveniently","4",
			"______ ~ University는 분사구문입니다. 빈칸이 없어도 문장이 완벽하므로 빈칸은 과거분사 located를 수식하는 부사 🧐conveniently🧐입니다."},
			{"The CEO ______ announced the company's decision on the new operating procedures this morning.",
			"1. lately   2. just   3. yet   4. even","2",
			"빈칸이 주어와 동사 사이에 있으므로 부사가 들어가야 하고, 문맥상 '막 발표했다'가 적절하므로 🧐just🧐가 정답입니다."},
			{"Before Ms.Liu left the company, ______ submitted her resignation to the head of the department.",
		"1. she   2. her   3. herself   4. hers","1",
		"빈칸은 주어 자리이고, 주격/소유대명사가 올 수 있습니다. 문맥상 '그녀가 제출했다'가 적절하므로 주격 대명사 🧐she🧐가 정답입니다."},
			{"Every member had to accept Mr.Lee's idea since ______ argued very persuasively.",
			"1. his   2.him   3. himself  4. he","4",
			"빈칸은 주어 자리이고, 주격/소유대명사가 올 수 있습니다. 문맥상 '그가 주장했다'가 적절하므로 주격 대명사 🧐he🧐가 정답입니다."},
			{"Mr.Ten has recently signed up for an accounting course at the university to increase ______ chances for promotion.",
			"1. him   2. he   3. his   4. himself","3",
			"빈칸은 명사 chances(가능성)를 수식하는 자리이므로 명사를 수식하는 소유격 🧐his🧐가 정답입니다."},
			{"Since Ms.Lang has been a valued customer, we will give ______ special discounts.",
			"1. her   2. hers   3. herself   4. she ","1",
			"4형식 동사 give는 목적어를 2개 가질 수 있습니다. 문맥상 '우리는 그녀에게 특별 할인을 줄 것이다'가 적절하므로 목적격 대명사 🧐her🧐이 정답입니다."},
			{"As all technicians were out of the office, Ms.Han had to fix the broken copy machine by ______.",
			"1. themselves   2. herself   3. sheself   4. theyselves","2",
			"by oneself는 '혼자서'라는 의미로, 주어가 Ms.Han이고 그녀 혼자서 복사기를 수리해야 했던 상황이므로 그녀를 가르키는 🧐herself🧐가 정답입니다."},
			{"The manager was not able to meet the deadline for the project by ______, so she had to ask for help."
			,"1. her  2. herself   3. she   4. hers","2",
			"by(전치사)는 뒤에 목적격/재귀대명사가 올 수 있습니다. 문맥상 '관리자가 혼자서 기한을 맞출 수 없었다'가 적절하므로 정답은 🧐herself🧐입니다."},
			{"With the help of our instructors, you will be able to learn at ______ own pace.",
			"1. your   2. you  3. yours   4. yourself","1",
			"'one's own'은 명사 앞에서 명사를 수식하여 '~만의(명사)'라는 뜻으로 쓰이므로 정답은 🧐your🧐이 됩니다."},
			{"Night shift employees are paid much higher than ______ working the day shift.",
			"1. them   2. they   3. those   4. these","3",
			"'night shift employees'와 'day shift employees'를 비교하고 있으므로 employees(복수명사)를 받는 지사대명사 🧐those🧐가 정답입니다."},
			{"The event coordinator suggested that ______ wishing to attend the show reserve a ticket two weeks ago.",
			"1. they   2. them   3. these   4. those","4",
			"빈칸은 that절의 주어 자리로 wishing의 수식을 받습니다. they(인칭대명사)는 수식을 받을 수 없으므로 정답은 🧐those🧐입니다."},
			{"A free information packet is available for ______ interested in the upcoming management seminar.",
			"1. whoever   2. they   3. these   4. those","4",
			"whoever(anyone who) 뒤에는 반드시 동사가 와야합니다. 따라서 interested in(형용사구)의 수식을 받을 수 있는 🧐those🧐가 정답입니다."},
			{"If any of the appliances turns out to be defective, we will replace each one with ______.",
			"1. each other   2. other   3. another   3. the others","3",
			"문맥상 가전기기를 '서로 교환하는 것'이 아니라 '다른 것으로 교체해 주는 것'이 적절하므로 '임의의 다른 하나'를 뜻하는 🧐another🧐가 정답입니다."},
			{"When I visited Emart at 8 in the morning, there were ______ working in the store.",
			"1. no   2. none   3.nothing   4.not ","2",
			"there문의 명사(빈칸)는 앞의 동사(were)와 수가 일치해야 하므로 단수/복수로 둘 다 쓰이는 🧐none🧐이 정답입니다."},
			{"We are sorry that we don't have ______ of the equipment you want to purchase now.",
			"1. many   2.any   3. some   4. each","2",
			"equipment는 불가산명사입니다. 'any of the'는 뒤에 가산 복수명사/불가산 단수명사가 올 수 있으므로 정답은 🧐any🧐입니다."},
			{"If you encounter a problem with our products, please report ____ to our sales representatives.",
			"1. one   2. it   3. them   3. its","2",
			"빈칸은 report의 목적어 자리로 it/them이 올 수 있다. 문맥상 '문제를 보고하다'가 적절하므로 a problem을 받는 🧐it🧐이 정답입니다."},
			{"______ of the proposals to build more production facilities are expected to be approved immediately.",
			"1. Several   2. Either   3. Any   4. Another","1",
			"문장의 동사(are)가 복수이므로 '여러 가지/여러 개'를 뜻하는 🧐Several🧐이 정답입니다. 나머지는 다 단수동사와 함께 쓰입니다."},
			{"The cafeteria will be closed ______ 10 PM unless otherwise stated.",
		"1. lately   2. soon   3. at   4. why","3",
		"빈칸 뒤에 10 PM 이라는 시각을 알려주는 명사가 있으므로 명사 앞에 쓰일 수 있는 전치사 🧐at🧐이 정답입니다."},
			{"In ______ to your request, we agree to change the date and place of the conference.",
			"1. repond   2. reponded   3. response   4. responds ","3",
			"in(전치사) 뒤에는 명사만 올 수 있습니다. 따라서 명사 🧐response🧐가 정답입니다."},
			{"Your order will arrive ______ 3 days of purchase.",
			"1. during   2. within   3. into   4. as","2",
			"문맥상 '구매 3일 이내에'가 적절하기 때문에 '~이내에'라는 뜻을 가진 🧐within🧐이 정답입니다."},
			{"______ his time at UCLA, Mr.Blue began to take an interest in film.",
			"1. During   2. Among   3. Into   4. About","1",
			"빈칸 뒤에 his time(그가 보낸 시간)은 기간을 나타냅니다. 문맥상 '그가 보낸 시간 동안에'가 적절하므로 🧐During🧐이 정답입니다."},
			{"For 24 hours a day ______ the summer, the community center will remain open.",
			"1. among   2. throughout   3. without   4. down","2",
			"among은 3개 이상을 뜻하는 복수명사와, down은 장소 표현과 함께 사용합니다. 문맥상 '여름 내내'가 적절하므로 정답은 🧐throughout🧐입니다."},
			{"Expanding our product line will keep profits from ______ excessively during economic downturns.",
			"1. decrease   2. to decrease   3. decreasing   4. decreased","3",
			"from(전치사) 뒤에는 명사가 와야하고, 동사 keep은 'keep A from V-ing(A가 ~하는 것을 막다)'로 쓰이므로 🧐decreasing🧐이 정답입니다."},
			{"Chicken Shack has locations ______ North America.",
			"1. despite   2. across   3. behind   4. among","2",
			"문맥상 '북미 전역에 지점들을 가지고 있다'가 적절하므로 '전역에'라는 의미의 🧐across🧐가 정답입니다."},
			{"The company produces manufacturing equipment ______ Europe.",
			"1. among   2. at   3. in   4. besides","3",
			"장소 중에서 국가/대륙을 나타내는 전치사가 들어가야 합니다. 따라서 정답은 🧐in🧐입니다."},
			{"In order to place an order, simply complete the enclosed order form and send it ______ your payment.",
			"1. to   2. with   3. on   4. across","2",
			"문맥상 '당신의 지불금과 함께 그것을 보내세요'가 적절하므로 '~와 함께'라는 의미의 🧐with🧐가 정답입니다."},
			{"All open positions in the HRD are expected to be filled ______ the end of the month.",
			"1. by   2. at   3. in   4. since","1",
			"the end of(~의 끝)와 함께 쓰이는 전치사는 by(~까지)/at(~에)입니다. 문맥상 '이달 말까지'가 적절하므로 정답은 🧐by🧐입니다."},
			{"The Kims Group has been operating its downtown location on Hay Street ______ last March.",
			"1. since   2. along   3. inside   4. until","1",
			"앞 문장의 시제가 현재완료이고, 문맥상 '지난 3월 이래로 킴스 그룹이 운영하고 있다'가 적절합니다. 따라서 정답은 🧐since🧐입니다."},
			{"It was just last month that Mr.Ortega retired ______ 20 years of service to the company.",
			"1. before   2. within   3. until   4. after","4",
			"빈칸 뒤에 '20 years'는 기간을 나타내는 명사입니다. 문맥상 '20년 간 근무 후 은퇴했다'가 적절하므로 '~후'를 나타내는 🧐after🧐가 정답입니다."},
			{"As soon as the concert ends, please exit ______ the door that is closest to your seat.",
			"1. except   2. inside   3. between   4. through","4",
			"between 뒤에는 A and B의 형태/복수명사가 와야하고, 문맥상 '문을 통해 퇴장하세요'가 적절하므로 '~을 통해'라는 뜻의 🧐through🧐가 정답입니다."},
			{"According to a news report, Berry Technology intends to expand ______ Latin America.",
			"1. of   2. around   3. at   4. into","4",
			"동사 expand는 '~로 확장하다'라고 할 때 보통 전치사 into와 함께 쓰입니다. 따라서 정답은 🧐into🧐입니다."},
			{"______ its production rates at an all-time low, CEO decided to fire the factory managers.",
			"1. Into   2. With   3. Until   4. Except","2",
			"⌜with + 명사 + 형용사⌟는 '명사가 형용사인 채로'로 쓰입니다. 'at an all-time low(전치사구)'는 형용사 역할로 '생산율이 사상 최저인 채로'가 됩니다."},
			{"The reviewer was enthusiastic ______ the new movie and gave it an excellent rating in her column.",
			"1. to   2. about   3. beside   4. of","2",
			"'be enthusiastic about'은 '~에 대해 열광하다'라는 의미의 숙어 표현입니다. 따라서 정답은 🧐about🧐입니다."},
			{"In order to build more factories, at least $1.2 million will have to be spent ______ the next few years.",
			"1. beside   2. over   3. above   4. since","2",
			"문맥상 '앞으로 몇 년을 걸쳐'가 적절하므로 '~에 걸쳐/~동안'이라는 의미의 🧐over🧐이 정답입니다."},
			{"All of the members of the Accounting Department are invited to dinner ______ Jack Campbell.",
			"1. with   2. throughout   3. off   4. among","1",
			"문맥상 'Jack Campbell과 함께하는 저녁식사에 초대되다'가 적절하므로 '~와 함께'라는 의미의 🧐with🧐가 정답입니다."},
			{"To meet the demand, We will increase production by 30% ______ the end of the year.",
			"1. by   2. as   3. without   4. for","1",
			"빈칸 뒤에 '연말'이라는 뜻의 'end of the year(명사구)' 시점 표현이 있으므로 '~까지'라는 기한을 나타내는 전치사 🧐by🧐가 정답입니다."},
			{"The annual meeting with clients scheduled for last April was not held ______ July 1.",
			"1. within   2. for   3. until   4. over","3",
			"'not ~ until ...'의 형태로 쓰여 '7월 1일이 되어서야 개최되다'라는 의미가 문맥상 적절하므로 정답은 🧐until🧐이 됩니다."},
			{"Internal communications are expected to improve ______ the new telephone system is installed.",
		"1. once   2. following   3. along with   4. owing to","1",
		"빈칸 앞뒤로 문장이 있으므로 접속사가 정답이 됩니다. once(일단 ~하면)을 제외하고 모두 전치사이므로 정답은 🧐once🧐가 됩니다."},
			{"Happy toy still leads the way in craftmanship ______ competition from rival toy company has increased significantly.",
			"1. however   2. although   3. given   4. due to","2",
			"빈칸 앞뒤로 문장이 있으므로 접속사가 정답이 됩니다. however은 접속부사, given/due to는 전치사이므로 정답은 🧐although🧐가 됩니다."},
			{"Company executives are trying to find a more efficient marketing campaign ______ the launch of its new product line.",
			"1. in case   2. likewise   3. provided that   4. prior to","4",
			"빈칸 뒤에 명사구가 왔으므로 전치사가 정답입니다. in case/provided that은 접속사, likewise는 부사이므로 정답은 🧐prior to🧐가 됩니다."},
			{"The report was read by ______ the members of the board and the company's lawyers.",
			"1. yet   2. either   3. whether   4. both","4",
			"빈칸 뒤에 A and B 형태가 있는 것으로 보아 and와 짝을 이뤄 'A와 B 둘다'라는 의미를 만들 수 있는 🧐both🧐가 정답입니다."},
			{"The registration fee will cover all travel and accomodation costs, ______ dining expenses are the participant's responsibility.",
			"1. instead   2. but   3. and   4. than","2",
			"빈칸은 문장을 대등하게 연결하는 접속사 자리입니다. 문맥상 '등록비에 모든 여행 경비와 숙박비는 포함되지만, 식사 비용은 참가자 몫이다'가 적절하므로 🧐but🧐이 정답입니다."},
			{"The company has been aware of the problem for a while and ______ its server recently.",
			"1. update   2. updates   3. updated   4. updating","3",
			"문맥상 빈칸 앞 and가 동사를 연결하고 있습니다. 주어 company는 단수고, 부사 recently를 보아 현재 시제는 불가합니다. 따라서 🧐updated🧐가 정답입니다."},
			{"No employees are permitted to go home for the day ______ all of their tasks have been completed.",
			"1. upon   2. that   3. while   4. until","4",
			"빈칸 앞뒤로 문장이 있으므로 전치사 자리이고, while 뒤에는 완료동사는 올 수 없습니다. 문맥상 '모든 업무가 완료될 때까지'가 적절하므로 🧐until🧐이 정답입니다."},
			{"______ it was damaged beyond repair, the equipment had to be sent back to the manufacturer.",
			"1. Since   2. Rather   3. Before   4. Yet","1",
			"빈칸 뒤에 완전한 두 문장이 있어 부사절 접속사(since/before)가 와야합니다. 문맥상 '그것이 파손되었기 때문에'가 적절하므로 원인을 나타내는 🧐since🧐가 정답입니다."},
			{"______ we need audio technicians, our current budget doesn't allow us to hire any.",
			"1. Since   2. Despite   3. in case   4. Although","4",
			"빈칸 뒤 완전한 두 문장을 보아 접속사 자리입니다. '음향 기술자들이 필요하지만, 예산이 허락하지 않는다'가 적절하므로 반대의 의미를 나타내는 🧐although🧐가 정답입니다."},
			{"The manager couldn't meet the deadline for the project on her own, ______ she had to ask for help.",
			"1. when   2. while   3. so   4. if","3",
			"빈칸 앞뒤로 문장이 오므로 접속사 자리입니다. 문맥상 '관리자는 기한을 지킬 수 없어 도움을 요청했다'가 적절하므로 '그래서'라는 의미의 🧐so🧐가 정답입니다."},
			{"He served as high school principal ______ being promoted to Country Supervisor.",
			"1. unless   2. since   3. before   4. as","3",
			"⌜unless/as + V-ing⌟ 형태는 잘 쓰이지 않아 since/before가 와야합니다. since는 현재완료 시제와 함께 쓰이므로 정답은 🧐before🧐입니다."},
			{"______ launching the famous chicken restaurant, she worked as a nutritionist for over 7 years.",
			"1. Among   2. So that   3. Prior to   4. Provided that","3",
			"빈칸 뒤에 동명사가 오므로 전치사가 와야합니다. '레스토랑 사업 전 영양사로 일했다'가 문맥상 적절하므로 '~이전에'라는 의미의 🧐prior to🧐가 정답입니다."},
			{"The operation of Amy's Restaurant will not begin ______ it passes the official health inspection.",
			"1. instead   2. until   3. during   4. such as","2",
			"빈칸 앞뒤 문장을 연결하는 접속사 자리입니다. instead는 부사, during/such as는 전치사이므로 정답은 🧐until🧐이 됩니다."},
			{"Passengers may order from a free selection of beveragse ______ a variety of meal options.",
			"1. and   2. just as   3. so   4. than","1",
			"빈칸은 'a free selection of beverages'와 'a variety of meal options'라는 대등한 단위를 연결하는 자리이므로 🧐and🧐가 정답입니다."},
			{"The awards ceremony began ______ all of the attendees entered the auditorium.",
			"1. once   2. just   3. first   4. also","1",
			"빈칸 앞뒤 문장을 연결하는 접속사 자리입니다. just/first/also는 모두 부사이므로 부사와 접속사로 쓰이는 🧐once🧐가 정답입니다."},
			{"Ms.Miro will hire designers for the new project, ______ the budget has been approved by the company.",
			"1. as a result   2. now that   3. up until   4. in order to","2",
			"빈칸은 앞뒤 문장을 연결하는 접속사 자리입니다. 문맥상 '예산이 승인되었기 때문에 디자이너들을 고용할 것이다'가 적절하므로 🧐now that🧐이 정답입니다."},
			{"You should have ______ your driver's license or passport with you in order to take the test.",
			"1. neither   2. either   3. not only   4. both","2",
			"either A and B (A와 B 중 하나)의 구조를 이루는 🧐either🧐이 정답이 됩니다."},
			{"Reducing energy use ______ promoting alternative energy can be a way of increasing profits at our company.",
			"1. and   2. but   3. although   4. despite","1",
			"빈칸 앞뒤로 명사구를 대등하게 연결하고 있으므로 전치사 🧐and🧐가 정답이 됩니다."},
			{"Most participants of last week's meeting agreed that Mr.Oscar's presentation was long but ______.",
			"1. information   2. informative   3. inform   4. informed","2",
			"but 뒤에 빈칸이 있어 앞 내용에 반대되는 내용이 와야합니다. 등위접속사 but이 long(형용사)과 연결하고 있으므로 🧐informative🧐가 정답입니다."},
			{"Genetech Lab vows to develop and ______ improve products that people want to enhance their lifestyle.",
			"1. continue   2. continual   3. continually   4. continuous","3",
			"and가 to develop과 (to) improve를 연결하고 있으므로 빈칸은 improve를 수식하는 부사 🧐continually🧐가 와야합니다."}};
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void grammarTest(String[][] grammar) {
		for(;;) {
			System.out.println("🧑🏻 Advanced level의 문법 테스트는 총 15문제로 13문제 이상 맞춰야 합격입니다.");
//			System.out.println("제한시간은 총 120초입니다.");
			System.out.println("");
			int score = 0;
		
			Collections.shuffle(Arrays.asList(grammar));
		
			for(int i = 0; i < 15; i++) {
				System.out.printf("Q%d. %s%n", i+1, grammar[i][0]);
				System.out.println(grammar[i][1]);
				
				int answer = sc.nextInt();
		
				if(answer == Integer.valueOf(grammar[i][2])) {
					System.out.println("정답 ⭕️ ");
					score += 5;
					System.out.println("score: " + score);
					System.out.println("");
				}else {
					System.out.println("오답 ❌: 정답은 " +  grammar[i][2] + "번 입니다.");
					System.out.println("해설 💁🏻‍♀️: " + grammar[i][3]);
					System.out.println("score: " +score);
					System.out.println("");
				}		 
			}
			if(score >= 13) {
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
	
	
	
	



	int scoreWord = 0;
	int scoreGram = 0;
	int num1 = 1;
	int num2 = 8;
	int num3 = 15;
	
	public void wordGradu1(String word[][], int num) {
		Collections.shuffle(Arrays.asList(word));
		
		for(int i = 0; i < 7; i++) {
			sc.nextLine();
			System.out.printf("Q%d. %s%n", i+num, word[i][0]);
			String answer = sc.nextLine();
	
			if(answer.equals(word[i][1])) {
				scoreWord+= 1;
//				System.out.println("O");
			}			  
		}	
	}
	
	public void wordGradu2(String word[][], int num) {
		Collections.shuffle(Arrays.asList(word));
		
		for(int i = 0; i < 7; i++) {
			sc.nextLine();
			System.out.printf("Q%d. %s%n", i+num, word[i][1]);
			String answer = sc.nextLine();
	
			if(answer.equals(word[i][0])) {
				scoreWord+= 1;
				
			}			  
		}	
	}

	public void gramGradu(String gram[][], int num) {
		Collections.shuffle(Arrays.asList(gram));
		
		for(int i = 0; i < 7; i++) {
			System.out.printf("Q%d. %s%n", i+num, gram[i][0]);
			System.out.println(gram[i][1]);
			
			int answer = sc.nextInt();
	
			if(answer == Integer.valueOf(gram[i][2])) {
				scoreGram += 1;	
			}		 
		}
	}



	public boolean graduateTest(String word1[][], String word2[][], String word3[][], String gram1[][], String gram2[][], String gram3[][]) {
		for(;;) {
	
			
			System.out.println("🚀 Graduation Test는 Basic, Intermediate, Advanced 내용에서 랜덤으로 출제됩니다.");
			System.out.println("단어 21문제 문법 21문제로 총 42문제가 출제됩니다‼️");
			System.out.println("총 42문제 중 단어 17문제, 문법 17문제 이상을 맞춰야 합격할 수 있습니다.😁");
			System.out.println("🎬 시작하시려면 Enter를 입력해주세요❗️");
			
			wordGradu1(word1, num1);
			wordGradu2(word2, num2);
			wordGradu1(word3, num3);
			gramGradu(gram1, num1);
			gramGradu(gram2, num2);
			gramGradu(gram3, num3);
		
			if(scoreWord >= 18 && scoreGram >= 18) {
				System.out.println("단어:" + scoreWord + "/21  문법: " + scoreGram + "/21");
				System.out.printf("😙 축하합니다. 합격입니다. %n");
				level = true;
				
			}else {
				System.out.println("단어:" + scoreWord + "/21  문법: " + scoreGram + "/21");
				System.out.printf("🤨 불합격입니다. 다시 도전해주세요. %n");
				System.out.println("엔딩을 위한 치트키가 발생되었습니다. end를 입력하시면 엔딩을 볼 수 있습니다.");
				for(;;) {
					String gradu = sc.next();
				
					if(gradu.equals("end")) {
						level = true;
						break;
					}else {
						System.out.println("올바른 값을 입력해주세요.");
					}	
				}
			}
		
			System.out.println("1. 다시 시험보기");
			System.out.println("2. 나가기 ");
		
			int text = sc.nextInt();
			if(text == 1) {
				line2();
				continue;
			}else if(text == 2) {
				break;
			}
		}
		return level;
	}
	
	
}
