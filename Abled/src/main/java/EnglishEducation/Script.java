package EnglishEducation;

public class Script {
	
	
	public void intro() {
		System.out.println("                                                 이 프로그램은 중학교 3학년 이상 수준의 영어 교육을 제공합니다.");
		System.out.println("                            Basic, Intermediate, Advanced 3단계로 이뤄져 있으며, 각 단계별 시험에 통과해야 다음 단계를 학습할 수 있습니다.");
		System.out.println("                                                모든 단계를 수료한 후 최종 TEST에 합격하면 프로그램이 종료됩니다.");
		System.out.println("");
		System.out.println("");
		System.out.println("                                                      -------------------------------------");
		System.out.println("");
		System.out.println("                                                        👩🏻‍🏫    S T U D Y   S T A R T    🧑🏻‍🏫");
		System.out.println("");
		System.out.println("                                                      -------------------------------------");
//		System.out.println("");
//		System.out.println("");
//		System.out.println("");
//		System.out.println("                                           프로그램을 시작하시려면 학습자의 이름을 입력해주세요.");
	}
	
	public void step() {
		
		System.out.printf("                                                        💁🏻‍♂️ 원하는 기능의 번호를 선택해주세요.%n");	
		System.out.println("                         ------------------------------------------------------------------------------------------");
		System.out.println("                        |                    |                     |                     |                         |");
		System.out.println("                        |     1.  Basic      |   2. Intermediate   |     3. Advanced     |   4. Graduation Test    |");
		System.out.println("                        |                    |                     |                     |                         |");
		System.out.printf("                         ------------------------------------------------------------------------------------------%n");
		line();
	}
	


	
	
	public void wordDay() {
		System.out.println("                                         --------------------------------------------------");
		System.out.println("                                        |                                                  |");
		System.out.println("                                        |    1.  Day 1   |    2. Day 2    |    3. Day 3    |");
		System.out.println("                                        |                                                  |");
		System.out.println("                                         --------------------------------------------------");    
		System.out.println("                                        |                                                  |");
		System.out.println("                                        |    4.  Day 4   |    5. Day 5    |    6. back     |");    
		System.out.println("                                        |                                                  |");
		System.out.println("                                         --------------------------------------------------");
		line();
	}
	
	public void gramDay() {
		System.out.println("                                          --------------------------------------------------");
		System.out.println("                                         |                                                  |");
		System.out.println("                                         |    1.  Day 1   |    2. Day 2    |    3. Day 3    |");
		System.out.println("                                         |                                                  |");
		System.out.println("                                          --------------------------------------------------");
		System.out.println("                                         |                                                  |");
		System.out.println("                                         |        4.  Day 4        |         5. back        |");
		System.out.println("                                         |                                                  |");
		System.out.println("                                          --------------------------------------------------");
		line();
	}
	
	public void menu() {
		
		System.out.printf("                                                         💁🏻‍♂️ 원하는 기능의 번호를 선택해주세요.%n");
		System.out.println("                              ------------------------------------------------------------------------------");
		System.out.println("                                                                                                           ");
		System.out.println("                                1. Word Book📙   |   2. Grammar💡   |     3. Test📝    |     4. Back 🔙   ");
		System.out.println("                                                              ");
		System.out.printf("                              ------------------------------------------------------------------------------%n");
		line();
	}
	
	public void test() {
		
		System.out.printf("                                                         💁🏻‍♂️ 원하는 기능의 번호를 선택해주세요.%n");
		System.out.println("                         -------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("                           1. Word Test🔤   |   2. Grammar Test🚀   |    3. Final Test🔥   |    4. Back 🔙   ");
		System.out.println("");
		System.out.printf("                          -------------------------------------------------------------------------------------%n");
		line();
	}
	
	public void line() {		
		try {
			for(int i=0; i<10; i++) {
				System.out.println("");
				Thread.sleep(10);
			}
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void line2() {
		try {
			for(int i=0; i<30; i++) {
				System.out.println("");
				Thread.sleep(10);
			}
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public void face(String name) {                 
	 System.out.println("		    		   	  !\\/\\/\\/!");
	 System.out.println("		    		   	  !  _  _!");
	 System.out.println("		    		   	 (! (.)(.)");
	 System.out.println("		    		   	  !   ___\\"); 
	 System.out.println("		    		   	  !____/     🪩"       + name + "님🪩이 학습 중입니다."); 
	 System.out.println("		    		   	  /    \\"); 
	 System.out.println("		    		   	 //****\\\\");
	}
	
	


	
	public void snoopy(String name) {
		  System.out.println("  		    		    	 \\,`/ /");
		  System.out.println("  		    		   	 _)..  `_");
		  System.out.println("  		    		   	( __  -\\");
		  System.out.println("  		    	  		    '`.          🐶"+  name + "님🐶이 학습 중입니다.");
		  System.out.println("  			      		   ( \\&gt;_-_,");
		  System.out.println("  		        		   _||_ ~-/");
		  System.out.println("");
		  System.out.println("");
	}
	
	public void graduate() {
		System.out.println("           		    		   	        __,=,__");
		System.out.println("           		    		   	    .~`` .`  `.``~.");
		System.out.println("           		    		   	   |   .      .    |____");
		System.out.println("           		    		   	   `-;=============;\"\"\"\"`");
		System.out.println("           		    		   	    (     (. _).) \\");
		System.out.println("           		    		   	     |            |");
		System.out.println("           		    		   	     \\   `-.___.' /");
		System.out.println("           		    		   	      '._      _.'");
		System.out.println("           		    		   	        /`''''\\");
		System.out.println("           		    		   	       /       \\");
		System.out.println("           		    		   	      | |/\\/\\/\\/|.-.");
		System.out.println("           		    		   	      |-|/\\/\\/\\/|;' )");
		System.out.println("           		    		   	     (__/_______|  _)");
		System.out.println("           		    		   	       #########'._)");
		System.out.println("           		    		   	   End   |==|=|__");
		System.out.println("           		    		   	     ,,,,(______)_),,,,");
		System.out.println("                                                ,,,;;;;;;;;;;;;;;;;;;;;;;,,,,");
		System.out.println("                                           ,,,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;,,,");
		System.out.println("                                         ,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;,");
		System.out.println("                                              Congratulations on your graduation!");
		System.out.println("");





	}

}
