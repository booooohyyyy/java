package day03;

public class DoWhileEx {
	
	public static void main(String[] args) {
		
		//10바퀴 돌아가는 반복
		
		//while문
		int a = 1;
		int sum = 0;
		
		while ( a <= 10 ) {
			sum += a;
			a++;
		}
		System.out.println("합은: " + sum);
		
		
		System.out.println("-----------------");
		
		
		//do~while문
		int b =1;
		int sum2 = 0;
		
		do {
			sum2 += b;
			b++;
		}while ( b <= 10 );		//조건이 false라도 무조건 한 번은 실행됌
		System.out.println("합은: " + sum2);
		
	}

}
