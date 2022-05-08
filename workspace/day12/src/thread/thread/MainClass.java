package thread.thread;

public class MainClass {
	
	public static void main(String[] args) {
		
		ThreadTest tt = new ThreadTest();
		tt.setName("Thread2");
		tt.start();
		
		System.out.println("MainThread end");
		
		
	}
	
	

}
