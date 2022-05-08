package thread.runable;

public class MainClass {
	
	public static void main(String[] args) {
		
		//메인 쓰레드
		//Runnable을 구현해서 사용하는 경우에는 해당클래스를 쓰레드 객체에 전달.
		
		ThreadTest tt = new ThreadTest();
		
		Thread thread = new Thread(tt);
		thread.start();
		
		System.out.println("MainThread end");
		
		
	}

}
