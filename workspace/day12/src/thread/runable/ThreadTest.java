package thread.runable;

public class ThreadTest implements Runnable {
	
	//RunNable 인터페이스 상속
	@Override
	public void run() {
		//스레드2
		System.out.println("thread start");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000); //1초 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		
		System.out.println("thread end");
	}
}
