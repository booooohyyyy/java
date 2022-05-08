package day02;

public class VariableEx {
	
	public static void main(String[] args) {
		
		/*
		 *  변수의 선언 방법
		 *  데이터타입 이름;
		 *  
		 *  int 정수를 저장하는 대표적인 유형
		 */
		
		int num;  //변수 선언
		num = 29; //변수 초기화
		System.out.println(num);
		
		int num2 = 20;  //변수 선언과 초기화를 동시에
	//	int num2 = 100; //같은 이름으로 변수를 생성할 수 없음
		
		//변수의 값을 변경
		num = 100;
		System.out.println(num);
		
		//변수에 변수를 저장가능
		int result = num + num2;
		System.out.println(result);
		
		
		
		
		//문자열 저장 (String은 문자열을 저장하는 대표적인 타입)
		String str = "안녕하세요"; //java에서 'S'tring 첫 글자 대문자
		System.out.println(str);
		
		
		System.out.println("-----------------------");
		
		
		//result2변수에 num + num2 + 20을 더해서 초기화 하고
		//변수값을 200으로 변경을 하고 출력
		//출력
		int result2 = num + num2 + 20;
		result2 = 200;
		System.out.println(result2);
		
		
	}

}
