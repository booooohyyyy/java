package Inter.basic3;

public class MainClass {
	
	public static void main(String[] args) {
		
		//printed변수 선언
//		Printed p = new LG();
		Printed p = new Samsung();
		
		p.turnOn();
		p.print("hello world");
		p.colorPrint("hello", "Red");
		p.copy(5);
		p.turnOff();
		
	}

}
