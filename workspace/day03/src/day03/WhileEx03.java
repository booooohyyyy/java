package day03;

import java.util.Scanner;

public class WhileEx03 {
	
	public static void main(String[] args) {
		
		//조건을 달리해서 수를 판별.(입력받은 값이 소수)
		//소수 - 자기 자신으로만 나눠지는 수
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수입력> ");
		int num = scan.nextInt();
		
		int i = 2;                //제어변수
		
		while ( num % i != 0 ) {
			
			i++;	
		}
		
		//a가 num까지 증가했다면, 소수
		if ( i == num ) {
			System.out.println(num + "은(는) 소수 입니다.");
		}else {
			System.out.println(num + "은(는) 소수가 아닙니다.");
		}
		
		scan.close();
		
	}

}
