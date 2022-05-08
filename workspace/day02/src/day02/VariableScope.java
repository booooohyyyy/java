package day02;

public class VariableScope {
	
	public static void main(String[] args) {
		
//		int num1 = 10;
//		int num2 = 20;
		
		//c언어 스타일
		int num1 = 10, num2 = 20; // 같은 타입은 묶어서 선언,초기화 가능
		int num4 = 20;
		
		if(true) {
			
			int num3 = 100;
		
//			int num4 = 20; // num4를 if문 안에서 선언하면 if문 안에서만 출력 가능
			num4 = num1; //변경
			num4 = 200;
			
			System.out.println(num3); //num3 = 100;
		
		}
		
//		System.out.println(num3); //중괄호 안에 선언한 변수는 그 안에서만 유효함
		int num3 = 200;			  //if문 안에 있는 num3과 다른 변수
		System.out.println(num3);	  //num3 = 200;
		
		System.out.println(num4); //num4 = 200;
	}

}
