package quiz01;

import java.util.Scanner;

public class Quiz20 {
	
	public static void main(String[] args) {
		
		//*. 입력받은 수가 소수인지 판별?
		
//		Scanner scan = new Scanner(System.in);
//		int number = scan.nextInt();
//		
//		int count = 0;
//		for (int i = 2; i <= number; i++) {
//			if (number % i == 0) {
//				count++;
//			}
//		}
			
		
		
		//*. 정수를 입력받으세요
		//2중 for문을 이용하여 입력 받은 수 까지 소수들의 합을 구하세요.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num = scan.nextInt();	//정수입력
		int cnt = 0; 				//약수의 개수를 카우트
		int sum = 0;				//합계변수
		
		for (int i = 2; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {	//약수 파악 후, 약수이면 카운트
					cnt++;	
				}	
			}
			if (cnt == 2) {		//약수의 개수가 2개이면 i 더해줌 
				sum += i;
			}
			cnt = 0; 			//약수의 개수 초기화
		}
		System.out.println(num + "까지 소수의 합은: " + sum);
		
	}

}
