package EnglishEducation;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Basic extends Script{
	
	boolean level;

	
	Scanner sc = new Scanner(System.in);

	
	
	
	String words1[][] = {
			{"elder", "나이가 더 많은"},
			{"neice", "여자 조카"},
			{"nephew", "남자 조카"},
			{"relative", "친척"},
			{"contact", "연락"},
			{"relationship", "관계"},
			{"community", "공동체"},
			{"fate", "운명"},
			{"faith", "믿음"},
			{"trust", "신뢰"},
			{"funeral", "장례식"},
			{"belong", "속하다"},
			{"valuable", "소중한"},
			{"engage", "약속하다"},
			{"anniversary", "기념일"}};
	
	
	
	
	String words2[][] = {
			{"marriage", "결혼"},
			{"ceremony", "의식"},
			{"bride", "신부"},
			{"guest", "손님"},
			{"oppose", "반대하다"},
			{"suicide", "자살"},
			{"dive", "뛰어들다"},
			{"wave", "흔들다"},
			{"rescue", "구조"},
			{"appreciate", "감사하다"},
			{"mate", "짝"},
			{"seek", "찾다"},
			{"fit", "알맞은"},
			{"perfection", "완벽"},
			{"harmony", "조화"}};
	
	
	
	
	String words3[][] = {
			{"sincere", "성실한"},
			{"pray", "기원하다"},
			{"miracle", "기적"},
			{"bless", "축복하다"},
			{"realize", "깨닫다"},
			{"tale", "이야기"},
			{"crow", "까마귀"},
			{"heaven", "천국"},
			{"bridge", "다리"},
			{"connect", "연결하다"},
			{"humid", "축축한"},
			{"moisture", "습기"},
			{"temperture", "온도"},
			{"degree", "학위"},
			{"rub", "문지르다"}};
	
	
	
	
	String words4[][] = {
			{"branch", "가지"},
			{"pond", "연못"},
			{"poet", "시인"},
			{"shy", "수줍은"},
			{"reflect", "반사하다"},
			{"appearance", "겉모습"},
			{"fascinate", "반하게 하다"},
			{"impression", "인상"},
			{"reality", "사실"},
			{"disappoint", "실망시키다"},
			{"option", "선택"},
			{"cost", "비용"},
			{"possibility", "가능성"},
			{"risk", "위험"},
			{"prefer", "선호하다"}};
	
	
		
	
	String words5[][] = {
			{"natural", "자연의"},
			{"surgeon", "외과의사"},
			{"purpose", "목적"},
			{"artificial", "인공적인"},
			{"recognize", "알아보다"},
			{"arrow", "화살"},
			{"attract", "흥미를 끌다"},
			{"origin", "기원"},
			{"instinct", "본능"},
			{"sight", "광경"},
			{"suit", "어울리다"},
			{"romantic", "낭만적인"},
			{"accept", "받아들이다"},
			{"urge", "주장하다"},
			{"envy", "부러움"}};
	
		
	
	
	
	String wordsT[][] = {{"elder", "나이가 더 많은"},{"neice", "여자 조카"},{"nephew", "남자 조카"},{"relative", "친척"},
			{"contact", "연락"},{"relationship", "관계"},{"community", "공동체"},{"fate", "운명"},{"faith", "믿음"},
			{"trust", "신뢰"},{"funeral", "장례식"},{"belong", "속하다"},{"valuable", "소중한"},{"engage", "약속하다"},
			{"anniversary", "기념일"},{"marriage", "결혼"},{"ceremony", "의식"},{"bride", "신부"},{"guest", "손님"},
			{"oppose", "반대하다"},{"suicide", "자살"},{"dive", "뛰어들다"},{"wave", "흔들다"},{"rescue", "구조"},
			{"appreciate", "감사하다"},{"mate", "짝"},{"seek", "찾다"},{"fit", "알맞은"},{"perfection", "완벽"},
			{"harmony", "조화"},{"sincere", "성실한"},{"pray", "기원하다"},{"miracle", "기적"},{"possibility", "가능성"},
			{"bless", "축복하다"},{"realize", "깨닫다"},{"tale", "이야기"},{"crow", "까마귀"},{"heaven", "천국"},{"envy", "부러움"},
			{"bridge", "다리"},{"connect", "연결하다"},{"humid", "축축한"},{"moisture", "습기"},{"temperture", "온도"},
			{"degree", "학위"},{"rub", "문지르다"},{"branch", "가지"},{"pond", "연못"},{"poet", "시인"},{"arrow", "화살"},
			{"shy", "수줍은"},{"reflect", "반사하다"},{"appearance", "겉모습"},{"fascinate", "반하게 하다"},{"origin", "기원"},
			{"impression", "인상"},{"reality", "사실"},{"disappoint", "실망시키다"},{"option", "선택"},{"cost", "비용"},
			{"risk", "위험"},{"prefer", "선호하다"},{"natural", "자연의"},{"surgeon", "외과의사"},{"purpose", "목적"},
			{"artificial", "인공적인"},{"recognize", "알아보다"},{"attract", "흥미를 끌다"},{"instinct", "본능"},
			{"sight", "광경"},{"suit", "어울리다"},{"romantic", "낭만적인"},{"accept", "받아들이다"},{"urge", "주장하다"}};

	
	
	
	
	
	
	public void wordBook(String Word[][]) {

		for(;;) {
			System.out.printf("Enter를 입력하면 다음 단어로 넘어갑니다. 단어 공부를 멈추고 싶으면 stop을 입력해주세요.%n");
			sc.nextLine();
			for(int i=0; i<Word.length; i++) {
				sc.nextLine();
				for(int j=0; j<2; j++) {
					System.out.println(Word[i][j]);
				}
				
				String put = sc.nextLine();
				//예외처리 필요 : 지금 상태는 다른 것 입력하면 그냥 넘김 enter만 입력하면 그냥 넘어감
				if(put.equals("//n")){
					continue;
				}else if(put.equals("stop")) {
					break;	
				}
			}
			
			System.out.println("");
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
	
	
	
	public void wordTest(String Word[][])  {	
		
		for(;;) {	
			System.out.println("👶🏻 Basic level의 단어 테스트는 총 10문제로 7문제 이상 맞춰야 합격입니다.");
			System.out.println("⚠️Enter를 입력하면 다음 단어로 넘어갑니다.⚠️");
//			System.out.println("제한시간은 총 60초입니다.");
			System.out.println("");
			int quizNum = 1;
			int score = 0;
//			Timer timer = new Timer();	
//			timer.start();
//		try {
//			while(timer.time<60) {
				
				Collections.shuffle(Arrays.asList(Word));

				for(quizNum = 1; quizNum <= 5; quizNum++) {
					sc.nextLine();
					System.out.printf("Q%d. %s%n", quizNum, Word[quizNum][0]);
					String answer = sc.nextLine();
		
					if(answer.equals( Word[quizNum][1])) {
						System.out.println("정답 ⭕️ ");
						score += 10;
						System.out.println("score: " + score);
						System.out.println("");
					}else {
						System.out.println("오답 ❌: 정답은 " +  Word[quizNum][1] + "입니다.");
						System.out.println("score: " +score);
						System.out.println("");
					}
				}	

				Collections.shuffle(Arrays.asList(Word));
		
				for(quizNum = 6; quizNum <= 10; quizNum++) {						
					sc.nextLine();
					System.out.printf("Q%d. %s%n", quizNum,  Word[quizNum][1]);
					String answer = sc.nextLine();
			
					if(answer.equals( Word[quizNum][0])) {
						System.out.println("정답 ⭕️ ");
					score += 10;	
						System.out.println("score: " + score);
						System.out.println("");
					}else {
						System.out.println("오답 ❌: 정답은 " +  Word[quizNum][0] + "입니다.");
						System.out.println("score: " +score);
						System.out.println("");
					}		 
				}
				
//				timer.interrupt();
//				System.out.println("basic: "+timer.interrupted());
//				System.out.println("basic: "+timer.getState());
//				break;
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//			System.out.println("wow");
//		}
//			
//				System.out.println(timer.time);
//				System.out.println("basicOut: "+timer.interrupted());
			
			
			System.out.println("Total score: " + score);
		
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
	
	
	
	
	
	String grammar1[]= {"Chapter 1. 문장의 구조",
	"문장을 완성하려면 반드시 '주어'와 '동사'가 필요합니다.",
	"주어는 '나🤓', '너🫵', '우리👫', '그👱🏻‍♂️', '그녀👩🏻' 등의 주체를 말합니다.",
	"주어 자리에는 1.명사 2.대명사 3.동명사 4.부정사 5.명사절 이 올 수 있어요.",
	"예문을 통해 알아보도록 하겠습니다.",
	"1️⃣ 명사 주어: 🌱Reservations🌱 for the annual event should be confirmed by the end of this month.",
	"2️⃣ 대명사 주어: Although Monday staff meetings used to begin at 9:00, 🌱they🌱 now begin one hour later.",
	"3️⃣ 동명사(부정사) 주어: 🌱Making(To make) copies🌱 for the upcoming seminar should be done by tomorrow.",
	"4️⃣ 명사절 주어: 🌱Who will lead the committee🌱 has not been decided yet.",
	"동사는 행동을 묘사하는 '동작🏃🏻‍♀️', '상태🤔'를 말합니다.",
	"또한, 주어의 인칭과 수, 시제, 태에 따라서 모양이 달라집니다.",
	"동사는 1.일반동사 2.조동사 3.be동사 로 나눌 수 있어요.",
	"1️⃣ 일반동사는 조동사와 be동사를 제외한 동사를 말합니다.",
	"ex) He 🌱wants🌱 to gain extensive experience in sales.",
	"2️⃣ 조동사는 동사를 보조하여 동사의 의미를 구체화하는 동사입니다.",
	"📘 조동사의 종류: may(might), can(could), will(would), should, must",
	"조동사 뒤에는 반드시 📌동사원형📌을 사용해야 합니다.",
	"ex) You 🌱may request🌱 a full refund of the purchase price.",
	"3️⃣ be동사는 주어의 인칭, 수, 시제에 따라 📌am, are, is, was, were📌 로 변형됩니다.",
	"ex) I 🌱am🌱 suitable for the job becuase I work diligently."
	};
	

	
	String grammar2[]= {"Chapter 2. 주어와 동사의 수 일치",
			"주어와 동사의 수를 일치시키려면 주어가 단수☝️인지, 복수✌️인지 확인하면 됩니다.",
			"단수주어☝️이면 단수동사☝️를, 복수주어✌️이면 복수동사✌️를 사용해야 합니다.",
			"주어가 3인칭 단수(I와 you를 제외한 단수)일 때 단수동사를 사용하고, 현재완료 시제는 「has+p.p」 를 사용합니다.",
			"1️⃣ 일반동사의 경우 단수동사는 (e)s를 붙이고 복수동사는 기본 원형을 사용합니다.",
			"ex) makes(단수동사) - make(복수동사)      loves(단수동사) - love(복수동사)",
			"has(단수동사) - have(복수동사) 처럼 단수와 복수의 형태가 다른 불규칙 동사들도 존재합니다.",			
			"2️⃣ be 동사의 경우 시제에 따라 주어가 1인칭 단수이면 am/was, 3인칭 단수이면 is/was, 2인칭 단수 또는 모든 인칭의 복수이면 am/were을 사용합니다.",
			"ex1) We(1인칭 복수) 🌱were🌱 very impressed with the new manager's technical knowledge and his warm personality.",
			"ex2) The weather 🌱is🌱 so nice.",
			"3️⃣ 조동사는 주어의 수에 영향을 받지 않습니다 ❌",
			"4️⃣ each/every + 단수명사는 '단수동사'를 사용합니다.",
			"ex1) Every student who has completed AbleD 🌱is🌱 expected to get a good job.",
			"ex2) Each applicant 🌱has🌱 to submit all the documentation by next Monday.",
			"5️⃣ one/each of the + 복수명사는 '단수동사'를 사용합니다.",
			"ex) We have to make sure that each of our assignments 🌱is🌱 perfectly done. ",
			"6️⃣ A and B 형태가 주어일 때 '복수동사'를 사용합니다.",
			"ex) Steak and Salmon sashimi 🌱are🌱 my favorite menu.",
			"7️⃣ a number of(많은), a variety of(다양한), a range of(다양한), a series of(일련의) + 복수명사는 '복수동사'를 사용합니다.",
			"ex1) A number of students 🌱study🌱 hard to get high score.",
			"ex2) A series of training sessions 🌱were🌱 presented by prominent leaders."
			};
	
	
	String grammar3[] = {"Chapter 3. 능동태와 수동태 1",
			"주어가 직접 행동을 '하다'라고 해석되면 '능동태', 주어가 무엇에 의해 '되다'라고 해석되면 '수동태'라고 합니다.",
			"수동태는 「be동사 + p.p + by + 명사」 의 형태를 취합니다. (p.p: past participle 과거분사)",
			"ex1) You should 🌱send all requested documents🌱 to personnel department.",
			"💁🏻‍♀️ 모든 요청된 문서들을 보내는 것이므로 '능동태' 문장입니다.",
			"ex2) The equipment 🌱was sent🌱 back to the manufacturer bacause it was damaged beyond repair.",
			"💁🏻‍♀️ 장비가 보내지는 것이므로 '수동태' 문장입니다.",
			"능동태 문장을 수동태 문장으로 만들기 위해서는 목적어가 꼭❗️필요해요 그러므로 자동사는 수동태가 될 수 없습니다.",
			"(자동사: 목적어가 필요 없는 동사 ❌)",
			"(타동사: 목적어가 필요한 동사 ⭕)",
			"1️⃣ 자동사인 1, 2형식 동사는 항상 능동태로 씁니다.",
			"ex) Fuel prices were risen dramatically: ❌",
			"💁: rise는 자동사로 목적어를 취하지 못해 수동태로 사용할 수 없습니다.",
			"📘 빈출 자동사: remain 남아 있다         arrive 도착하다    depart 떠나다      emerge 출현하다   work 일하다",
			"              participate 참석하다      appear 나타나다    exist 존재하다     rise 오르다      last 지속되다",
			"              specialize 전문으로 하다   proceed 진행하다   consist 구성하다   expand(자/타동사) 확장되다(시키다)",
			"              happen/occur/take place 발생하다",
			"2️⃣ 4형식 동사는 목적어를  2개(간접, 직접)가지고 있어 수동태로 바뀌면 동사 뒤에 📌직접 목적어📌가 남습니다.",
			"능동태: The company offers all employees a free financial assistance program.",
			"수동태: All employees are offered 📌a free financial assistance program📌 by the company.",
			"3️⃣ 5형식 동사는 목적어와 목적격 보어로 이뤄져 있어 수동태로 바뀌면 뒤에 📌목적격 보어📌가 남습니다.",
			"🥠 목적격 보어 = 명사 🥠",
			"능동태: We consider the marketing program an effective tool.",
			"수동태: The marketing program is considered 📌an effective tool📌 by us.",
			"🥠 목적격 보어 = 형용사 🥠",
			"능동태: We consider Miro intelligent.",
			"수동태: Miro is considered 📌intelligent📌 by us."
			};
	
	
	
	String grammar4[] = {"Chapter4. 능동태와 수동태2",
			"4️⃣ 감정동사의 수동태",
			"감정동사는 대부분 '~한 감정을 느끼게 만들다' 라는 의미이므로 '~한 감정을 느끼다' 라는 의미는 📌수동태📌로 나타냅니다.",
			"ex) Oscar 🌱is very pleased with🌱 the features of the new phone.",
			"🥠 외워야 하는 수동태 🥠",
			"행위의 주체를 나타낼 때 수동태 뒤에 by + 명사 로 쓰지만, 동사에 따라 by가 아닌 다른 전치사가 올 수 있습니다.",
			"이것들은 그냥 외워야 합니다 😇",
			"📘 수동태 + 전치사: be concerned about ~에 대해 걱정하다   be involved in ~에 개입되다",
			"                  be based on ~에 기초하고 있다          be devided into ~로 나눠지다",
			"                  be associated with ~와 관련있다       be made of ~로 만들어지다",
			"                  be limited to ~로 제한되다            be satisfied[pleased] with ~에 만족하다",
			"                  be faced with ~에 직면하다            be known as ~로 알려져 있다(자격)",
			"                  be known for ~때문에 알려져 있다(이유)   be skilled in[at] ~에 숙련되어 있다",
			"                  be disappointed with ~에 실망하다 "};
	
	
	
	
	
	
	public void studyGrammar(String grammar[]) {

		for(;;) {
			System.out.printf("Enter를 누르면 다음 문장으로 넘어갑니다. 문법 공부를 멈추고 싶으면 stop을 입력해주세요.%n");
			try {
				for(int i = 0; i < grammar.length; i++){
					sc.nextLine();
					String split[] = grammar[i].split("");
					
					for(int j=0; j<split.length; j++) {
					System.out.print(split[j]);
					Thread.sleep(50);
					}
					
					String put = sc.nextLine();
					//예외 처리 필요
					if(put.equals("//n")) {
						continue;
					}else if(put.equals("stop")) {
						break;
					}
				}
			}catch (InterruptedException e) {
					e.printStackTrace();
			}
			
			System.out.println("1. 다시 공부하기 ");
			System.out.println("2. 나가기 ");
		
			int text = sc.nextInt();
			if(text == 1) {
				line2();
				continue;
			}else if(text == 2) {
				break;
			}else {
				System.out.println("해당 선택지가 존재하지 않습니다.");
			}
			
		}
	}
	

	
	
	String grammarTest1[][] = {{"_____ should have valid identification when first purchasing any product at this shop", 
		"1. Consume   2. Consumes   3. Consumed   4. Consumers", "4",
		"💁🏻‍♀️ 빈칸은 '주어' 자리이므로 명사 형태만 올 수 있습니다. 따라서 정답은 🧐(4)Consumers🧐가 됩니다."},
			{"Mr.Paek will report on the status of our overseas plants when ______ returns from his trip to Hanoi",
			"1. him   2. he   3. his   4. himself ", "2",
			"💁🏻‍♀️ when은 부사절 접속사로 returns이 동사이고 빈칸은 '주어' 자리이므로 주격 인칭대명사인 🧐(2)he🧐가 정답입니다."},
			{"The Happyland Travel cunstomer service department ______ seven days a week", 
			"1. operating   2. operates   3. operation   4. to operate", "2",
			"💁🏻‍♀️ 'The Happyland Travel cunstomer service department'가 주어이므로 문장에 '동사'가 없습니다. 따라서 동사인 🧐(2)operates🧐가 정답입니다."},
			{"Please _____ our apologies for the delay in replying to your e-mail.",
			"1. accept   2. accepted   3. acceptance   4. acceping", "1",
			"💁🏻‍♀️ 문장이 Please로 시작하는 명령문이므로 빈칸에는 '동사원형'이 나와야 합니다. 따라서 🧐(1)accept🧐가 정답입니다."},
			{"The report must _____ detailed methods.", 
			"1. including   2. inclusion   3. included   4. include", "4",
			"💁🏻‍♀️ 조동사 must 뒤에는 '동사원형'이 와야합니다. 따라서 🧐(4)inculde🧐가 정답입니다."},
			{"___ the construction of a sports complex in Largo will bring long-term employment to the area is good news.",
			"1. If   2. That   3. It   4. This" , "2",
			"💁🏻‍♀️ 문장의 동사는 is이므로 is 앞까지 주어입니다. 따라서 명사절이 되어야 하는데, If는 '~인지 아닌지'라는 의미로 적합하지 않아 🧐(2)That(~라는 점)🧐이 정답입니다."},
			{"If Mr.Taylor _____ the plan, the construction project can begin within two weeks.",
			"1. approvingly   2. approval   3. approves  4. approvable ", "3",
			"💁🏻‍♀️ 빈칸은 if절의 '동사' 자리이므로 🧐(3)approves🧐가 정답입니다."},
			{"To gain valuable experience, simply ________ in our intership program", 
			"1. participate    2. participation   3. to participate   4. participating", "1",
			"💁🏻‍♀️ 문장에 주어와 동사가 없으므로 '명령문' 형태의 문장이 되어야 합니다. 따라서 동사 🧐(1)participate🧐가 정답입니다."},
			{"To obtain the certification, _____ the company's training course.",
			"1. attending   2. to attend   3. attend   4. attendance", "3",
			"💁🏻‍♀️ 문장에 주어와 동사가 없으므로 '명령문' 형태의 문장이 되어야 합니다. 따라서 동사 🧐(3)attend🧐가 정답입니다."},
			{"The chief editor of AbleD News announced that the electronic edition will _____ nationwide",
			"1. be distributed   2. distribution   3. distribute   4. distributed", "1",
			"💁🏻‍♀️ 조동사 will 뒤에는 '동사원형'이 와야 하고, electornic edition은 배포'되는 것'이기 때문에 수동태 형태인 🧐(1)be distributed🧐가 정답입니다."}};
	
	
	
	
	String grammarTest2[][] = {{"Flights out of Jeju Airport ______ more than two hours today due to a fuel supply problem.",
		"1. dealying   2.is delaying   3. deplays   4. deplayed", "4",
		"💁🏻‍♀️ 빈칸은 '동사' 자리이고, 주어 Flights는 '복수'이므로 정답은 🧐(4)delayed🧐 입니다."},
		{"Please contact Mr.Simon in the HRD before 5 PM ______ a hall for the conference.",
		"1. to reserve   2. will reserve   3. are reserving   4. reserve", "1",
		"💁🏻‍♀️ Please + 동사원형으로 시작하는 '명령문'이므로 완전한 문장입니다. 따라서 to 부정사의 '부사적 용법'을 사용한 🧐(1)to reserve🧐가 정답입니다."},
		{"This training program _______ necessary skills needed by the company.",
		"1. including   2. have included   3. includes   4. include", "3",
		"💁🏻‍♀️ 빈칸은 '동사' 자리이고, 주어는 This training program이므로 단수동사 🧐(3)includes🧐가 정답입니다."},
		{"We need to adopt marketing _____ that are more specific and detailed to reach our sales target for this quater.",
		"1. strategy   2. strategies   3. strategically   4. strategic", "2",
		"💁🏻‍♀️ 빈칸은 to adopt의 목적어로 '명사'가 나와야 하고, 빈칸을 수식하는 주격 관계대명사 that의 동사가 '복수'이므로 선행사가 복수여야 합니다. 따라서 🧐(2)strategies 🧐가 정답입니다."},
		{"A variety of ways to enhance the company's image ______ by the company's board of directors. ",
		"1. to have been presented   2. presents   3. are presented   4. is presented ", "3",
		"💁🏻‍♀️ 빈칸은 '동사' 자리, A variety of(다양한)는 형용사이므로 주어는 ways이다. 따라서 주어와 수가 일치한 🧐(3)are presented🧐가 정답입니다."},
		{"The results of the election ______ now available on the city hall Web site.", 
		"1. is   2. was   3. are   4. am", "3",
		"💁🏻‍♀️ 빈칸은 '동사' 자리, 주어는 The results이므로 복수동사 🧐(3)are🧐이 정답입니다."},
		{"If you encounter any problem with your device, please check the user manual that _______ the product.",
		"1. accompany   2. accompaniment   3. accompanies   4. accompaying", "3",
		"💁🏻‍♀️ 빈칸은 관계대명사 that절의 '동사' 자리입니다. 수식하는 선행사 the user manual이 '단수주어'이므로 🧐(3)accompanies🧐가 정답입니다."},
		{"The first touch screen _____ was developed in 1960s.",
		"1. technology   2. technologists   3. technologies   4. technological", "1",
		"💁🏻‍♀️ 동사 was 앞까지 주어이므로 문맥상 '첫 번째 터치 스크린 기술'이 되어야 하고, was는 단수동사 이므로 🧐(1)technology🧐가 정답입니다."},
		{"The new automobile insurance policy specifies that the coverage ______ to all 2022 hybrid car models.",
		"1. have applied   2. applies   3. applying   4. are applied", "2",
		"💁🏻‍♀️ 빈칸은 목적어 that절의 '동사' 자리이고, 주어가 coverage로 '단수'이므로 🧐(2)applies🧐가 정답입니다."},
		{"Mr.Cowell and I _____ for appropriate facilities for the company events.",
		"1. arragement   2. arranges   3. to arrange   4. arrange", "4",
		"💁🏻‍♀️ 빈칸은 '동사' 자리이고, 주어가 Mr.Cowell and I로 복수이므로 🧐(4)arrange🧐가 정답입니다."}};
	
	
	
	
	String grammarTest3[][] = {{"Business Finder _____ its delivery prices last month because of high oil prices.",
		"1. increased   2. was increased   3. increasing   4. has been increased", "1",
		"💁🏻‍♀️ 빈칸 뒤에 its delivery prices라는 목적어와 동사를 함께 해석하면 '자사의 운송비를 올리다'가 적절하므로 능동태 🧐increased🧐가 정답입니다."},
		{"Fress copies of AbleD News _______ to the citizens of Suwon only for two weeks.",
		"1. distributed   2. are distributing   3. distribution   4. were distributed", "4",
		"💁🏻‍♀️ 주어는 copies(신문들), distribute(~을 유통시키다)는 타동사이다. 신문은 유통'되는 것'이므로 수동태 🧐were distributed🧐가 정답이다. "},
		{"In order to meet the deadline, we _____ overtime during the past week.",
		"1. was worked   2. have been working   3. working   4. to work", "2",
		"💁🏻‍♀️ 빈칸은 동사 자리이고, work는 자동사로 반드시 능동태로 써야 합니다. 따라서 🧐have been working🧐이 정답입니다."},
		{"WooWa Supplier guarantees that all orders will be _____ within one week.",
		"1. arrived   2. arriving   3. arrives   4. arrival", "2",
		"💁🏻‍♀️ be 뒤에 -ing가 오면 능동태, p.p가 오면 수동태입니다. arrive는 자동사로 반드시 능동태로 써야 하므로 🧐arriving🧐이 정답입니다."},
		{"The country's new student visa policy ______ the amount and type of employment for students.",
		"1. restricts   2. was restricted   3. to be restricted   4. restricting", "1",
		"💁🏻‍♀️ 빈칸은 '동사' 자리이고, 목적어 the amount and type와 동사를 함께 해석하면 '양과 유형을 제한하다'가 적절하므로 능동태 🧐restricts🧐가 정답입니다."},
		{"The CEO chose ______ the three top salespeople at the company for their outstanding performances",
		"1. honor   2. to hornor   3. to be honored   4. honors", "2",
		"💁🏻‍♀️ 동사 choose는 'to 부정사'를 목적어로 취하고, 빈칸 뒤 목적어와 함께 해석하면 '표창하는 것'이 적절하므로 능동태 🧐to honor🧐이 정답입니다."},
		{"Pinni _____ a very infomative presentation to all those who want to learn how to play bass guitar.",
		"1. give   2. was given   3. has given   4. giving", "3",
		"💁🏻‍♀️ 빈칸은 '동사' 자리이고, 주어 Pinni는 단수이다. 또한, 주어가 발표 '했다'가 적절하므로 능동태 🧐has given🧐이 정답입니다."},
		{"she _____ one of the most influential economists in the country",
		"1. has named   2. named   3. was named   4. to name", "3",
		"💁🏻‍♀️ 빈칸은 '동사' 자리이고, 그녀가 one of the most influential economists라고 '불린 것'이 문맥상 적절하므로 수동태 🧐was named🧐가 정답입니다."},
		{"Critics of the movie have _____ that it was too predictable.",
		"1. complaint   2. been complained   3. complain   4. complained", "4",
		"💁🏻‍♀️ 해석해보면 'Critics(비평가들)이 that절이라고 비판하다'가 적절하므로 have와 함께 쓰여 능동태가 되는 🧐complained🧐가 정답입니다. "},
		{"EBS is well known for its free online lectures which ____ for all students.",
		"1. have provided   2. are provided   3. providing   4. is provided", "2",
		"💁🏻‍♀️ 빈칸은 관계대명사 which의 '동사' 자리이고, 선행사 online lectures는 복수이면서 제공'되는 것'이기 때문에 수동태 🧐are provided🧐가 정답입니다."}};
	
	
	
	
	String grammarTest4[][] = {{"Travel industry is adversely affected ___ the rise in fuel prices", 
		"1. by   2. to   3. on   4.about", "1",
		"💁🏻‍♀️ '~에 의해서'라는 의미로 행위의 주체를 나타내는 경우 'by'를 사용합니다. 따라서 🧐by🧐가 정답입니다."},
		{"We _____ to offer you a discount coupon.",
		"1. being pleased   2. are pleased   3. have pleased   4. pleasing", "2",
		"💁🏻‍♀️ 빈칸은 '동사' 자리이고, please는 '~를 기쁘게 하다'라는 의미로 '기쁘다'라고 표현하려면 수동태로 써야합니다. 따라서 🧐are pleased🧐가 정답입니다."},
		{"Ms. May is concerned ______ the possible side effects of tourist attraction development.",
		"1. to   2. in   3. with   4. about", "4",
		"💁🏻‍♀️ '~에 대해 걱정하다'는 'be concerned about'으로 나타내므로 🧐about🧐이 정답입니다."},
		{"Stella ______  frustration of beginner.",
		"1. was faced with   2. was involved by   3. was faced by   4. was involved in", "1",
		"💁🏻‍♀️ 해석해보면 주어가 frustration(좌절감)을 '~을 직면했다'가 적절하므로 🧐was faced with🧐가 정답입니다."},
		{"Goggle is well known ____ offering various kind of information.",
		"1. about  2. as   3. for   4. by", "3",
		"💁🏻‍♀️ be known(알려져 있다) 뒤에는 다양한 전치사가 올 수 있는데, 빈칸 뒤에 알려진 '이유'가 왔으므로 🧐for🧐이 정답입니다."},
		{"Computers _____  various parts.",
		"1. are made of   2. are made by   3. made   3. has made", "1",
		"💁🏻‍♀️ '~로 이루어져 있다'는 'be made of'로 나타내므로 🧐are made of🧐가 정답입니다."},
		{"Emma was disappointed _____ lower midterm score.",
		"1. as   2. by   3. for   4. with", "4",
		"💁🏻‍♀️ '~에 실망하다'는 'be disappointed with'로 나타내므로 🧐with🧐가 정답입니다."},
		{"The abnormal climate ______ global warming.",
		"1. is faced with   2. is associated with   3. is known for   4. is known as", "2",
		"💁🏻‍♀️ 해석해보면 '이상기후는 지구 온난화와 '연관되어' 있다'가 적절하므로 🧐is associated with🧐가 정답입니다."},
		{"The teaching of history should not ______ dates and figures",
		"1. be based on   2. be involved in   3. be limited to   4. be faced with", "3",
		"💁🏻‍♀️ 해석해보면 '역사를 가르치는 것은 날짜와 수치로 '제한되어서'는 안된다'가 적절하므로 🧐be limited to🧐가 정답입니다."},
		{"We know that you ______ a plot to assassinate the president.",
		"1.are made of   2. are skilled in   3. are pleased with   4. are involved in", "4",
		"💁🏻‍♀️ 해석해보면 '당신이 대통령 암살 모의에 '가담하고 있는 것'을 알고 있다'가 적절하므로 🧐are involoved in🧐이 정답입니다."}};
	
	
	
	
	
	
	
	String gramT[][] = {{"_____ should have valid identification when first purchasing any product at this shop", 
		"1. Consume   2. Consumes   3. Consumed   4. Consumer", "4"},
			{"Mr.Paek will report on the status of our overseas plants when ______ returns from his trip to Hanoi",
			"1. he   2. him   3. his   4. himself ", "1"},
			{"The Happyland Travel cunstomer service department ______ seven days a week", 
			"1. operating   2. operates   3. operation   4. to operate", "2"},
			{"Please _____ our apologies for the delay in replying to your e-mail.",
			"1. accept   2. accepted   3. acceptance   4. acceping", "1"},
			{"The report must _____ detailed methods.", 
			"1. including   2. inclusion   3. included   4. include", "4"},
			{"___ the construction of a sports complex in Largo will bring long-term employment to the area is good news.",
			"1. If   2. That" , "1"},
			{"If Mr.Taylor _____ the plan, the construction project can begin within two weeks.",
			"1. approves   2. approval   3. approvingly   4. approvable ", "1"},
			{"To gain valuable experience, simply ________ in our intership program", 
			"1. participate    2. participation   3. to participate   4. participating", "1"},
			{"To obtain the certification, _____ the company's training course.",
			"1. attending   2. to attend   3. attend   4. attendance", "3"},
			{"The chief editor of AbleD News announced that the electronic edtion will _____ nationwide",
			"1. be distributed   2. distribution   3. distribute   4. distributed", "1"},
			{"Flights out of Jeju Airport ______ more than two hours today due to a fuel supply problem.",
				"1. dealying   2.is delaying   3. deplays   4. deplayed", "4"},
				{"Please contact Mr.Simon in the HRD before 5 PM ______ a hall for the conference.",
				"1. to reserve   2. will reserve   3. are reserving   4. reserve", "1"},
				{"This training program _______ necessary skills needed by the company.",
				"1. including   2. have included   3. includes   4. include", "3"},
				{"We need to adopt marketing _____ that are more specific and detailed to reach our sales target for this quater.",
				"1. strategy   2. strategies   3. strategically   4. strategic", "2"},
				{"A variety of ways to enhance the company's image ______ by the company's board of directors. ",
				"1. to have been presented   2. presents   3. are presented   4. is presented ", "3"},
				{"The results of the election ______ now available on the city hall Web site.", 
				"1. is   2. was   3. are   4. am", "3"},
				{"If you encounter any problem with your device, please check the user manual that _______ the product.",
				"1. accompany   2. accompaniment   3. accompanies   4. accompaying", "3"},
				{"The first touch screen _____ was developed in 1960s.",
				"1. technology   2. technologists   3. technologies   4. technological", "1"},
				{"The new automobile insurance policy specifies that the coverage ______ to all 2022 hybrid car models.",
				"1. have applied   2. applies   3. applying   4. are applied", "2"},
				{"Mr.Cowell and I _____ for appropriate facilities for the company events.",
				"1. arragement   2. arranges   3. to arrange   4. arrange", "4"},
				{"Business Finder _____ its delivery prices last month because of high oil prices.",
					"1. increased   2. was increased   3. increasing   4. has been increased", "1"},
					{"Fress copies of AbleD News _______ to the citizens of Suwon only for two weeks.",
					"1. distributed   2. are distributing   3. distribution   4. were distributed", "4"},
					{"In order to meet the deadline, we _____ overtime during the past week.",
					"1. was worked   2. have been working   3. working   4. to work", "2"},
					{"WooWa Supplier guarantees that all orders will be _____ within one week.",
					"1. arrived   2. arriving   3. arrives   4. arrival", "2"},
					{"The country's new student visa policy ______ the amount and type of employment for students.",
					"1. restricts   2. was restricted   3. to be restricted   4. restricting", "1"},
					{"The CEO chose ______ the three top salespeople at the company for their outstanding performances",
					"1. honor   2. to hornor   3. to be honored   4. honors", "2"},
					{"Pinni _____ a very infomative study program to all those who want to learn how to play bass guitar.",
					"1. give   2. was given   3. has given   4. giving", "3"},
					{"she _____ one of the most influential economists in the country",
					"1. has named   2. named   3. was named   4. to name", "3"},
					{"Critics of the movie have _____ that it was too predictable.",
					"1. complaint   2. been complained   3. complain   4. complained", "4"},
					{"EBS is well known for its free online lectures which ____ for all students.",
					"1. have provided   2. are provided   3. providing   4. is provided", "2"},
					{"Travel industry is adversely affected ___ the rise in fuel prices", 
						"1. by   2. to   3. on   4.about", "1"},
						{"We _____ to offer you a discount coupon.",
						"1. being pleased   2. are pleased   3. have pleased   4. pleasing", "2"},
						{"Ms. May is concerned ______ the possible side effects of tourist attraction development.",
						"1. to   2. in   3. with   4. about", "4"},
						{"Stella ______  frustration of beginner.",
						"1. was faced with   2. was involved by   3. was faced by   4. was involved in", "1"},
						{"Goggle is well known ____ offering various kind of information.",
						"1. about  2. as   3. for   4. by", "3"},
						{"Computer _____  various parts.",
						"1. is made of   2. is made by   3. made   3. has made", "1"},
						{"Emma was disappointed _____ lower midterm score.",
						"1. as   2. by   3. for   4. with", "4"},
						{"The abnormal climate ______ global warming.",
						"1. is faced with   2. is associated with   3. is known for   4. is known as", "2"},
						{"The teaching of history should not ______ dates and figures",
						"1. be based on   2. be involved in   3. be limited to   4. be faced with", "3"},
						{"We know that you ______ a plot to assassinate the president.",
						"1.are made of   2. are skilled in   3. are pleased with   4. are involved in", "4"}};
	
	
	
	
	public void grammarTest(String grammar[][]) {
		
		for(;;) {
			System.out.println("👶🏻 Basic level의 문법 테스트는 총 5문제로 3문제 이상 맞춰야 합격입니다.");
			System.out.println("");
//			System.out.printf("제한시간은 총 60초입니다.%n%n");
			
			int score = 0;
		
			Collections.shuffle(Arrays.asList(grammar));
		
			for(int i = 0; i < 5; i++) {
				System.out.printf("Q%d. %s%n", i+1, grammar[i][0]);
				System.out.println(grammar[i][1]);
		
				int answer = sc.nextInt();
		
				if(answer == Integer.valueOf(grammar[i][2])) {
					System.out.println("정답 ⭕️ ");
					score += 20;
					System.out.println("score: " + score);
					System.out.println("");
					
				}else {
					System.out.printf("오답 ❌: 정답은 " +  grammar[i][2] + "번 입니다.%n%n", grammar[i][2]);
					System.out.println(grammar[i][3]);
					System.out.println("");
					System.out.println("score: " +score);
					System.out.println("");
				}		 
			}
			if(score >= 60) {
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

	
	
	public boolean finalTest(String word[][], String grammar[][]) {
		
		for(;;) {	
			System.out.println("Final Test🔥는 그동안 학습했던 내용에서 랜덤으로 출제됩니다.");
			System.out.println("단어 20문제 문법 10문제로 총 30문제가 출제됩니다.");
			System.out.println("총 30문제 중 단어 16문제, 문법 7문제 이상을 맞춰야 합격할 수 있습니다.🙆🏻‍♂️");
			System.out.println("💡Final Test를 합격하면 다음 단계를 학습할 수 있습니다.");
			System.out.println("시작하시려면 Enter를 입력해주세요❗️");
			
			int scoreWord = 0;
			int scoreGram = 0;
		
			Collections.shuffle(Arrays.asList(word));
		
			for(int i = 0; i < 10; i++) {
				sc.nextLine();
				System.out.printf("Q%d. %s%n", i+1, word[i][0]);
				
				String answer = sc.nextLine();
		
				if(answer.equals(word[i][1])) {
					scoreWord+= 1;
					System.out.println("정답 ⭕️ ");
				}else {
					System.out.println("오답 ❌");		 
				}		  
			}	

			Collections.shuffle(Arrays.asList(word));
		
			for(int i = 0; i < 10; i++) {	
				sc.nextLine();
				System.out.printf("Q%d. %s%n", i+11,  word[i][1]);
			 
				String answer = sc.nextLine();
			
				if(answer.equals( word[i][0])) {
					scoreWord += 1;
					System.out.println("정답 ⭕️ ");
					System.out.println("");
				}else {
					System.out.println("오답 ❌");		
					System.out.println("");
				}
			}
			
			Collections.shuffle(Arrays.asList(grammar));
			
			for(int i = 0; i < 10; i++) {
				System.out.printf("Q%d. %s%n", i+1, grammar[i][0]);
				System.out.println(grammar[i][1]);
				
				int answer = sc.nextInt();
		
				if(answer == Integer.valueOf(grammar[i][2])) {
					scoreGram += 1;		
					System.out.println("정답 ⭕️ ");
					System.out.println("");
				}else {
					System.out.println("오답 ❌");		
					System.out.println("");
				}
			}
		
			if(scoreWord >= 16 && scoreGram >= 7) {
				System.out.println("단어:" + scoreWord + "/20  문법: " + scoreGram + "/10");
				System.out.printf("😙 축하합니다. 합격입니다. %n");
				
				String pass = "🎊 다음 단계를 학습하실 수 있습니다‼️";
				String[] split = pass.split("");
				try {
					for(int j=0; j<split.length; j++) {
						System.out.print(split[j]);
						Thread.sleep(50);
					}
					System.out.println("");
				}catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				

				level = true;
				
			}else {
				System.out.println("단어:" + scoreWord + "/20  문법: " + scoreGram + "/10");
				System.out.printf("🤨 불합격입니다. 다시 도전해주세요. %n");
				
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
