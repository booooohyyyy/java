package quiz01;

import java.util.Scanner;

public class Quiz21 {
	
	public static void main(String[] args) {
		
		/*
		 * up - down 게임
		 * 
		 * 1~100까지 (한번) 임의 숫자를 생성.
		 * 정답을 맞출 때 까지 스캐너를 통해서 입력을 받습니다.
		 * 
		 * 랜덤수가 정답보다 작으면 "더 큰 수를 입력하세요"
		 * 랜덤수가 정답보다 크면 "더 작은 수를 입력하세요"
		 * 정답이면, 시도횟수를 체크하고 종료합니다.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int num = (int)(Math.random()*100) +1;		//임의의 숫자 생성
		int cnt = 0;
		
		while(true) {
			System.out.print("맞춰보세요> ");			//맞출 때까지 입력
			int a = scan.nextInt();
//			cnt++;		//여기다 한번만 넣어도 똑같음
			
			if (a != num) {							//틀렸을 때
				cnt++;								//횟수 증가
				if(a < num) {						
					System.out.println("더 큰 수를 입력하세요.");
				}else {
					System.out.println("더 작은 수를 입력하세요.");
				}
			}else {									//맞췄을 때
				cnt++;								//마지막으로 횟수 증가
				System.out.println("정답입니다.");			
				break;								//맞추면 탈출
			}
		
		}
		System.out.println("시도횟수> " + cnt);		//횟수
	}

}
