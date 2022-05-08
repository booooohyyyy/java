package anomymous.basic2;

public class MainClass {
	
	public static void main(String[] args) {
		
		Tv tv = new Tv();
		tv.getRemote().turnOn();
		tv.getRemote().volumeUp();
		tv.getRemote().volumeUp();
		tv.getRemote().volumeUp();
		tv.getRemote().volumeDown();
		tv.getRemote().turnOff();
		
		Computer com = new Computer();
		com.getRemote().turnOn();
		com.getRemote().volumeUp();
		com.getRemote().volumeUp();
		com.getRemote().volumeDown();
		com.getRemote().turnOff();
		
		//익명객체 전달방식
//		tv.setRemote(new 익명객체());
		
		
	}

}
