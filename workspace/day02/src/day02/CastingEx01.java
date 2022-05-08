package day02;

public class CastingEx01 {
	
	public static void main(String[] args) {
		
		//작은 타입을 큰 타입에 넣을 때, 자바가상머신(JVM)이 자동 형 변환을 진행
		
		byte a = 10;
		short b = a; //byte -> short형으로 자동 형 변환
		int i = a;   //byte -> int형으로 자동 형 변환
		long l = a;  //byte -> long형으로 자동 형 변환
		
		char c = '가';
		int j = c;   //char -> int형으로 자동 형 변환
		System.out.println("가의 유니코드 숫자 값:" + j);
		
		int k = 1000;
		double d = k; //int -> double형으로 자동 형 변환
		System.out.println(d); //실수형이기 때문에 1000.0
		
	}

}
