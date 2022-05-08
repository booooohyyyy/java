package day02;

public class CastingEx03 {
	
	public static void main(String[] args) {
		
		//연산이 일어날 때 형 변환
		int i = 2;
		char c = 'A';
		
		//1. 서로 다른 타입의 연산에서는 큰 타입에 맞추어 자동 형 변환이 됌
		char cc = (char)(i + c);
		int ii = i + c;
		
		System.out.println(cc);
		System.out.println(ii);
		
		
		int j = 10;
		double d = 3.14;
		double result = j + d;
		
		//2. int형보다 작은 타입의 연산의 결과는 무조건 int (컴큐터가 4byte(32bit)연산하기 때문)
		byte b1 = 100;
		byte b2 = 10;
		byte b3 = (byte)(b1 + b2);
		System.out.println(b3);
		

	}

}
