package day03;

import java.util.Scanner;

public class ForEx02 {
	
	public static void main(String[] args) {
		
		//개수를 이용해서, 소수판별(소수는 몫 개수가 항상2개)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력>");
		int num = scan.nextInt();
		int cnt = 0;				//몫의 개수를 카운트
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) { //num의 약수
				cnt++;
			}
		}
		System.out.println(cnt == 2 ? num + "은(는) 소수 입니다." : num + "은(는) 소수가 아닙니다.");
		scan.close();
		
	}

}
