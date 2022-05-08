package day06;


//펜을 설계할 클래스는 main이 없다. (사용자 정의 클래스)
public class Pen {
	
	//클래스의 속성을 나타내는 멤버변수(필드)
	String ink;
	int price;
	String company;
	
	//클래스의 기능을 나타내는 메서드
	void write() {
		System.out.println(ink + " 색상의 클씨를 씁니다.");
		
	}
	
	void info() {
		System.out.println("=========팬의 정보=========");
		System.out.println("색상: " + ink);
		System.out.println("가격: " + price);
		System.out.println("제조사: " + company);
	}
	
	

}
