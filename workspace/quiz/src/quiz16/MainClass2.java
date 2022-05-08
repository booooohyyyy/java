package quiz16;

import java.util.Scanner;

public class MainClass2 {
	
	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		int num = (int)(Math.random()*100) +1;		//임의의 숫자 생성
		int cnt = 0;
		
		
		while(true) {
			try {
				System.out.print("맞춰보세요> ");			//맞출 때까지 입력
				int a = Integer.parseInt(scan.nextLine());
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
				
			
			
			}catch (Exception e) {
				System.out.println("정수로 입력하세요");	
			}
			
		}
		System.out.println("시도횟수> " + cnt);		//횟수
		
	}
	
}
