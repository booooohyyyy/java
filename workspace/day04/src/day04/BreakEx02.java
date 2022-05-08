package day04;

import java.util.Scanner;

public class BreakEx02 {
	
	public static void main(String[] args) {
		
		//*. 정답맞추기 -> 오답인경우 횟수 체크
		Scanner scan = new Scanner(System.in);
		
		int cnt = 0;
		
		while(true) {
			System.out.println("4 x 6 = ?");
			System.out.print("정답> ");
			int answer = scan.nextInt();
			
			if (answer == 24) {
				System.out.println("정답입니다.");
				break;							//if문은 무시하고 반복문 빠져나감
			}
			
			System.out.println("오답입니다.");
			cnt++;
			
		}
		
		System.out.println("오답 횟수: " + cnt + "번");
		
		
		
	}

}
