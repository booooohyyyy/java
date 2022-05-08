package quiz14;

public class MainClass {
	
	public static void main(String[] args) {
		
		Marine m = new Marine();
		
		m.location();
		m.move(3, 4);
		m.location();
		m.move(6, 7);
		m.location();
		
		System.out.println("------------");
		
		System.out.println(m.attack);
		m.steampack();
		System.out.println(m.attack);
	}

}
