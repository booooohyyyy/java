package day04;

import java.util.Scanner;

public class ContinueEx02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num = scan.nextInt();	//정수입력
		int cnt = 0; 				//약수의 개수를 카우트
		int sum = 0;				//합계변수
		
		start:for (int i = 2; i <= num; i++) {
			
			cnt = 0; 					//약수의 개수 초기화
			for (int j = 1; j <= i; j++) {
				
				if (i % j == 0) {	//약수 파악 후, 약수이면 카운트
					cnt++;	
				}
				
				if ( cnt >= 3 ) continue start; // 바깥반복문의 다음으로 이동
				
			} //end inner
			if (cnt == 2) sum += i;		//약수의 개수가 2개이면 i 더해줌 	
		}//end outer
		System.out.println(num + "까지 소수의 합은: " + sum);
		
	}

}
