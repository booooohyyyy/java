package super_basic;

public class Mother extends Person {

	//1.생성자 생략
	Mother() {
//		super(); //생략
		
		//기본 생성자가 없는 경우
		super("또치", 4); //메서드를 맞춰서 생성자를 연결 시켜줌 
	}
	
}
