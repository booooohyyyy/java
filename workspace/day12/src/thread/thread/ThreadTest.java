package thread.thread;

public class ThreadTest extends Thread{

	//Thread클래스 자체를 상속받아 쓰는 경우
	//run메서드 오버라이딩
	
	@Override
	public void run() {
		System.out.println(getName()); //thread name
		
		System.out.println("Thread2 start");
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
						
		}
		
		System.out.println("Thread2 end");
	}
	
	

}
