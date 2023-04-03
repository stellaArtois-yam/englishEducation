package EnglishEducation;

public class Timer extends Thread {

	int time = 0;
	
	// 시험에서 thread의 time 가져다 써서 time 60되면 끝내버리던가
	// thread에서 시험 10번 되면 끝내버리던가
	public void run() {
				
				try {
				Thread.sleep(30000);
				time+=30;
				System.out.println("⏰ 30초 경과하였습니다.");
				
				for(int i=0;i<3;i++) {
					Thread.sleep(10000);
					time += 10;
					System.out.println("⏰ " + time + "초 경과하였습니다.");
				}
				System.out.println("❗️ Time over ❗️");
				Thread.currentThread().interrupt();
				System.out.println(Thread.currentThread().getState());
			}catch(InterruptedException e) {
				 e.printStackTrace();
			}
				Thread.currentThread().interrupt();
				System.out.println(Thread.currentThread().getState());
		}

}
