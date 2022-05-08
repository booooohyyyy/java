package thread.ex01;

public class MainClass {
	
	public static void main(String[] args) {
		
		//thread 객체 2개, threadtest 객체 2개 각각 실행
//		ThreadTest tt = new ThreadTest();
//		ThreadTest tt2 = new ThreadTest();
//		
//		Thread thread = new Thread(tt);
//		thread.setName("A");
//		
//		Thread thread2 = new Thread(tt2);
//		thread2.setName("B");
//		
//		thread.start();
//		thread2.start();
		
		
		//Thread 객체 2개, threadtest  객체 1개 실행
		ThreadTest tt = new ThreadTest();
		
		Thread thread = new Thread(tt);
		thread.setName("A");
		
		Thread thread2 = new Thread(tt);
		thread2.setName("B");
		
		thread.start();
		thread2.start();
	}

}
