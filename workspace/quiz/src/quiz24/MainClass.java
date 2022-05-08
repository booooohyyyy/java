package quiz24;

public class MainClass {
	
	public static void main(String[] args) {
		
		//힌트
		/*
		 * 쓰레드 객체 3개, voteThread 3개
		 */
		
		VoteThread vt = new VoteThread();
		VoteThread vt2 = new VoteThread();
		VoteThread vt3 = new VoteThread();
		
		Thread thread = new Thread(vt, "Location1");
		Thread thread2 = new Thread(vt2, "Location2");
		Thread thread3 = new Thread(vt3, "Location3");
		
		thread.start();
		thread2.start();
		thread3.start();
	}
	
	

}
