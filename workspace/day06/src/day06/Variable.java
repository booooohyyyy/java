package day06;

public class Variable {
	
	int a;
//	a = 10;	(x)		>>메서드 안에서는 가능

	void printNum(int c) {
		int b = 1;
	
		System.out.println("지역변수: " + b);
		System.out.println("멤버변수: " + a); //초기값 지정이 없으면 자동으로 기본 값
		System.out.println("매개변수: " + c);
	}
}
