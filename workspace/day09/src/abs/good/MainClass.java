package abs.good;

public class MainClass {
	
	public static void main(String[] args) {
		
//		new HeadStore(); //추상클래스는 객체로 생성불가
		
		//부모클래스를 사용하과 싶으면, 자식클래스를 통해서 부모클래스를 구체화시켜야 한다.
		//부모타입 = 자식으로 생성;
		HeadStore h = new Store(); //다형성 -> 클래스 구체화
		h.apple();	//ov
		h.orange();	//ov
		h.grape();	//ov
		h.melon();
		System.out.println(h.getName());
		
		HeadStore h2 = new Store2();
		h2.apple();	//ov
		h2.orange();//ov
		h2.grape();	//ov
		h2.melon();
		System.out.println(h2.getName());
		
	}

}
