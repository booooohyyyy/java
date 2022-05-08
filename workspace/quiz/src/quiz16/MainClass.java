package quiz16;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		/*
		 * 1. 스케너를 통해서 정수 2개를 입력받습니다.
		 * 2. 입력받은 값이 정수라면, 두 수의 합을 출력하고 반복문을 종료.
		 * 3. 입력받은 값이 예외를 발생시키면, "정수로 입력하세요"를 출력
		 * 4. 반복문 종료후에는 프로그램 정상 종료 문장을 띄워주세요.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			try {
				System.out.print(">");
				int a = Integer.parseInt(scan.nextLine());
				System.out.print(">");
				int b = Integer.parseInt(scan.nextLine());
				
				System.out.println(a+b);
				
				break;
			} catch (Exception e) {
				System.out.println("정수로 입력하세요");	
			} 

			
		}
		System.out.println("프로그램 정상 종료");
	}

}
