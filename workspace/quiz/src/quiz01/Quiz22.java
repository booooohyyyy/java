package quiz01;

import java.util.Scanner;

public class Quiz22 {
	
	public static void main(String[] args) {
		
		//*. 두 수의 더하기를 맞추는 문제를 지속적으로 출제하는 프로그램
		// 2가지 정수 1~100사이의 난수를 발생시켜 문제 발생
		// 정답이면 정답카운트 +1, 오답이면 오답 카운트 +1 프로그램을 만드세요
		// 또한 0을 입력받으면 반복을 중단.
		// - 문제도 추가
		
		Scanner scan = new Scanner(System.in);
		int cnt1 = 0; //정답 횟수
		int cnt2 = 0; //오답 횟수
		
		while (true) {
			System.out.println("---------------");
			int a = (int)(Math.random() * 100) +1;	//문제 생성
			int b = (int)(Math.random() * 100) +1;
			
			int x = (int)(Math.random() * 2); // 0 or 1
			if (x == 0) {
				System.out.printf("%d + %d = ?\n", a,b);
			}else {
				System.out.printf("%d - %d = ?\n", a,b);
			}
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
			
			System.out.print("> ");
			int c = scan.nextInt();
			int result = x == 0 ? a+b : a-b; //정답
			
			if (c == 0) {					//0이면 탈출
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			if (c == result) {					//정답, 오답 확인
				cnt1++;
				System.out.println("정답입니다.");
				
			}else {
				cnt2++;
				System.out.println("틀렸는데요?");
			}
			
		}
		System.out.println("====================");
		System.out.println("정답 횟수: " + cnt1 + "회");
		System.out.println("오답 횟수: " + cnt2 + "회");
		
		
		//------------------------------------------------

		
	}

}
