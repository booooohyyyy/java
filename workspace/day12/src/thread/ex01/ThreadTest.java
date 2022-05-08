package thread.ex01;

public class ThreadTest implements Runnable {

	private int num; //0
	
	@Override
	public void run() {
		
		//A thread
		for(int i = 1; i <= 10; i++) {
			
			if(Thread.currentThread().getName().equals("A")) {
				num++;
			}
			
			System.out.println("thread name:" + Thread.currentThread().getName() + ", num:" + num);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	

}
