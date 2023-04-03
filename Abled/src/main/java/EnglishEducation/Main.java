package EnglishEducation;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		boolean level1 = false;
		boolean level2 = true;
		boolean last = false;
		
		Basic basic = new Basic();
		Intermediate inter = new Intermediate();
		Advanced adv = new Advanced();
//		adv.grammarTest(adv.grammarTest1);
	
		BGM bgm = new BGM();
		
//		bgm.setDaemon(true);	
//		bgm.start();
	
		String student;
		
		Script script = new Script();
	
		
		
		// 시작 화면 
		script.line();
		script.intro();	
		
		for(;;) {
			System.out.printf("                                                     프로그램을 시작하시려면 학습자의 이름을 입력해주세요.%n%n%n");
			script.line();
			student = sc.next();
			script.line();
			System.out.printf("                                                      학습자의 이름을 <" + student + "> 로 설정하시겠습니까?%n%n");	
		
			System.out.println("                                                                1. 이름 다시 입력하기");
			System.out.println("                                                                2. 실행 ");
			script.line();
			
			int select = sc.nextInt();

			if(select == 1) {
				script.line();
				continue;
			}else if(select == 2){
				break;
			}else {
				System.out.println("올바른 값을 입력해주세요.");
			}
		}
		
		
		// 1단계 화면
		for(;;) {
			script.snoopy(student);

			script.step();
			
			int step = sc.nextInt();
			
			if(step == 1) {			
				// 메뉴 화면
	
				for(;;) {
					script.snoopy(student);
					script.menu();
					
					int select = sc.nextInt();
					
					if (select ==1) {
						
						for(;;) {
							script.snoopy(student);
							script.wordDay();
							
							int day = sc.nextInt();
							script.line2();
							
							if(day == 1) {
								basic.wordBook(basic.words1);
							}else if(day == 2) {
								basic.wordBook(basic.words2);
							}else if(day == 3) {
								basic.wordBook(basic.words3);
							}else if(day == 4) {
								basic.wordBook(basic.words4);
							}else if(day ==5) {
								basic.wordBook(basic.words5);
							}else if(day == 6) {
								break;
							}else {
								System.out.println("                                    😵‍💫 해당 선택지가 존재하지 않습니다. 다시 선택해주세요.");
							}
						}
								
					}else if (select ==2) {				
						for(;;) {
							script.snoopy(student);
							script.gramDay();	
							int day = sc.nextInt();
							script.line2();
							if(day == 1) {
								basic.studyGrammar(basic.grammar1);
							}else if(day == 2) {
								basic.studyGrammar(basic.grammar2);
							}else if(day == 3) {
								basic.studyGrammar(basic.grammar3);
							}else if(day == 4) {
								basic.studyGrammar(basic.grammar4);
							}else if(day == 5) {
								break;
							}else {
								System.out.println("                                    😵‍💫 해당 선택지가 존재하지 않습니다. 다시 선택해주세요.");
							}
						}			
					
					}else if(select ==3) {
						for(;;) {
							script.snoopy(student);
							script.test();
							
							int test = sc.nextInt();
							
							if(test == 1) {
								for(;;) {
									script.snoopy(student);
									script.wordDay();
						
									int day = sc.nextInt();	
									script.line();
						
									if(day == 1) {
										basic.wordTest(basic.words1);
									}else if(day == 2) {
										basic.wordTest(basic.words2);
									}else if(day == 3) {
										basic.wordTest(basic.words3);
									}else if(day == 4) {
										basic.wordTest(basic.words4);
									}else if(day == 5) {
										basic.wordTest(basic.words5);
									}else if(day ==6) {		
										break;
									}else {
										System.out.println("                                    😵‍💫 해당 선택지가 존재하지 않습니다.‍ 다시 선택해주세요.");
									}
								}
								
							}else if(test == 2) {
								for(;;) {
									script.snoopy(student);
									script.gramDay();
							
									int day = sc.nextInt();
									script.line();
									if(day == 1) {
										basic.grammarTest(basic.grammarTest1);	
									}else if(day == 2) {
										basic.grammarTest(basic.grammarTest2);
									}else if(day == 3) {
										basic.grammarTest(basic.grammarTest3);
									}else if(day == 4) {
										basic.grammarTest(basic.grammarTest4);
									}else if(day ==5) {
										break;
									}else {
										System.out.println("                                    😵‍💫 해당 선택지가 존재하지 않습니다. 다시 선택해주세요.");
									}
								}
								
							}else if(test ==3) {
								script.line();
								level1 = basic.finalTest(basic.wordsT, basic.gramT);	
							
							}else if(test ==4) {
								break;
							
							}else {
								System.out.println("                                    😵‍💫 해당 선택지가 존재하지 않습니다. 다시 선택해주세요.");
							}		
						}
					}else if (select ==4) {
						break;
						
					}else {
						System.out.printf("                                    😵‍💫 해당 선택지가 존재하지 않습니다. 다른 선택지를 선택해주세요.%n");
					}
				}	
				
			}else if(step == 2 && level1 == false) {
				System.out.printf("                                 🔒 Intermediate 단계를 수강하시려면 Basic 단계의 Final Test를 합격해야 합니다.%n%n");
			
			}else if(step == 2 && level1 == true) {
				// 2단계 
		
				
				for(;;) {
					script.snoopy(student);
					script.menu();
					
					int select = sc.nextInt();
					
					if (select ==1) {
						
						for(;;) {
							script.snoopy(student);
							script.wordDay();				
							int day = sc.nextInt();
							script.line2();
							if(day == 1) {
								inter.wordBook(inter.words1);
							}else if(day == 2) {
								inter.wordBook(inter.words2);
							}else if(day == 3) {
								inter.wordBook(inter.words3);
							}else if(day == 4) {
								inter.wordBook(inter.words4);
							}else if(day ==5) {
								inter.wordBook(inter.words5);
							}else if(day == 6) {
								break;
							}else {
								System.out.println("                                    😵‍💫 해당 선택지가 존재하지 않습니다. 다시 선택해주세요.");
							}
						}
								
					}else if (select ==2) {				
						for(;;) {
							script.snoopy(student);
							script.gramDay();	
							int day = sc.nextInt();
							script.line2();
							if(day == 1) {
								inter.studyGrammar(inter.grammar1);
							}else if(day == 2) {
								inter.studyGrammar(inter.grammar2);
							}else if(day == 3) {
								inter.studyGrammar(inter.grammar3);
							}else if(day == 4) {
								inter.studyGrammar(inter.grammar4);
							}else if(day == 5) {
								break;
							}else {
								System.out.println("                                    😵‍💫 해당 선택지가 존재하지 않습니다. 다시 선택해주세요.");
							}
						}			
					
					}else if(select ==3) {
						for(;;) {
							script.snoopy(student);
							script.test();
							
							int test = sc.nextInt();
				
							if(test == 1) {
								for(;;) {
									script.snoopy(student);
									script.wordDay();
						
									int day = sc.nextInt();	
									script.line();
									if(day == 1) {
										inter.wordTest(inter.words1);
									}else if(day == 2) {
										inter.wordTest(inter.words2);
									}else if(day == 3) {
										inter.wordTest(inter.words3);
									}else if(day == 4) {
										inter.wordTest(inter.words4);
									}else if(day == 5) {
										inter.wordTest(inter.words5);
									}else if(day ==6) {		
										break;
									}else {
										System.out.println("                                    😵‍💫 해당 선택지가 존재하지 않습니다.‍ 다시 선택해주세요.");
									}
								}
								
							}else if(test == 2) {
								for(;;) {
									script.snoopy(student);
									script.gramDay();
							
									int day = sc.nextInt();
									script.line();
									if(day == 1) {
										inter.grammarTest(inter.grammarTest1);	
									}else if(day == 2) {
										inter.grammarTest(inter.grammarTest2);
									}else if(day == 3) {
										inter.grammarTest(inter.grammarTest3);
									}else if(day == 4) {
										inter.grammarTest(inter.grammarTest4);
									}else if(day ==5) {
										break;
									}else {
										System.out.println("                                    😵‍💫 해당 선택지가 존재하지 않습니다. 다시 선택해주세요.");
									}
								}
								
							}else if(test ==3) {
								script.line();
								level2 = inter.finalTest(inter.wordsT, inter.gramT);
							
							}else if(test ==4) {
								break;
							
							}else {
								System.out.println("                                    😵‍💫 해당 선택지가 존재하지 않습니다. 다시 선택해주세요.");
							}		
						}
					}else if (select ==4) {
						break;
						
					}else {
						System.out.printf("                                    😵‍💫 해당 선택지가 존재하지 않습니다. 다른 선택지를 선택해주세요.%n");
					}
				}	
				
			}else if(step == 3 && level2 == false) {
				System.out.printf("                                 🔒 Advanced 단계를 수강하시려면 Intermediate 단계의 Final Test를 합격해야 합니다.%n%n");
			}else if(step == 3 && level2 == true) {
				
				//3단계	
				for(;;) {
					
					script.snoopy(student);
					script.menu();
					
					int select = sc.nextInt();
					
					if (select ==1) {
						
						for(;;) {
							script.snoopy(student);
							script.wordDay();				
							int day = sc.nextInt();
							script.line2();
							if(day == 1) {
								adv.wordBook(adv.words1);
							}else if(day == 2) {
								adv.wordBook(adv.words2);
							}else if(day == 3) {
								adv.wordBook(adv.words3);
							}else if(day == 4) {
								adv.wordBook(adv.words4);
							}else if(day ==5) {
								adv.wordBook(adv.words5);
							}else if(day == 6) {
								break;
							}else {
								System.out.println("                                    😵‍💫 해당 선택지가 존재하지 않습니다. 다시 선택해주세요.");
							}
						}
								
					}else if (select ==2) {				
						for(;;) {
							script.snoopy(student);
							script.gramDay();	
							int day = sc.nextInt();
							script.line2();
							if(day == 1) {
								adv.studyGrammar(adv.grammar1);
							}else if(day == 2) {
								adv.studyGrammar(adv.grammar2);
							}else if(day == 3) {
								adv.studyGrammar(adv.grammar3);
							}else if(day == 4) {
								adv.studyGrammar(adv.grammar4);
							}else if(day == 5) {
								break;
							}else {
								System.out.println("                                    😵‍💫 해당 선택지가 존재하지 않습니다. 다시 선택해주세요.");
							}
						}			
					
					}else if(select ==3) {
						for(;;) {
							script.snoopy(student);
							script.test();
							
							int test = sc.nextInt();
							script.line();
							if(test == 1) {
								for(;;) {
									script.snoopy(student);
									script.wordDay();
						
									int day = sc.nextInt();	
									script.line();
									if(day == 1) {
										adv.wordTest(adv.words1);
									}else if(day == 2) {
										adv.wordTest(adv.words2);
									}else if(day == 3) {
										adv.wordTest(adv.words3);
									}else if(day == 4) {
										adv.wordTest(adv.words4);
									}else if(day == 5) {
										adv.wordTest(adv.words5);
									}else if(day ==6) {		
										break;
									}else {
										System.out.println("                                    😵‍💫 해당 선택지가 존재하지 않습니다.‍ 다시 선택해주세요.");
									}
								}
								
							}else if(test == 2) {
								for(;;) {
									script.snoopy(student);
									script.gramDay();
							
									int day = sc.nextInt();
									script.line();
									if(day == 1) {
										adv.grammarTest(adv.grammarTest1);	
									}else if(day == 2) {
										adv.grammarTest(adv.grammarTest2);
									}else if(day == 3) {
										adv.grammarTest(adv.grammarTest3);
									}else if(day == 4) {
										adv.grammarTest(adv.grammarTest4);
									}else if(day ==5) {
										break;
									}else {
										System.out.println("                                    😵‍💫 해당 선택지가 존재하지 않습니다. 다시 선택해주세요.");
									}
								}
								
							}else if(test ==3) {
								script.line();
								adv.finalTest(adv.wordsT, adv.gramT);	
							
							}else if(test ==4) {
								break;
							
							}else {
								System.out.println("                                    😵‍💫 해당 선택지가 존재하지 않습니다. 다시 선택해주세요.");
							}		
						}
					}else if (select ==4) {
						break;
						
					}else {
						System.out.printf("                                    😵‍💫 해당 선택지가 존재하지 않습니다. 다른 선택지를 선택해주세요.%n");
					}
				}	
				
				
			}else if(step == 4) {
				script.line();
				last = adv.graduateTest(basic.wordsT, inter.wordsT, adv.wordsT, basic.gramT, inter.gramT, adv.gramT);
				if(last == true) {
					bgm.interrupt();
					GraduationSound wow = new GraduationSound();
					wow.start();
					script.line2();
					script.graduate();
					System.out.println("                                      학습을 다시 시작하시려면 restart를 종료하시려면 end를 입력해주세요.");
					
					
					String re = sc.next();
					
					if(re.equals("restart")){
						script.line();
						continue;
					}else if(re.equals("end")){
						break;
					}
				}	
			}else {
				System.out.println("올바른 값을 입력해주세요.");
			}
		}
	}
}

	


