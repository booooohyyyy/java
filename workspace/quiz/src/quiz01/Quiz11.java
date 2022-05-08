package quiz01;

import java.util.Scanner;

public class Quiz11 {
	
	public static void main(String[] args) {
		
//		int a = 1;
//		
//		while ( a <= 10 ) {
//			
//			System.out.println(a +"번 학생의 출석을 체크합니다.");
//			a++;
//			
//		}
		
		//구구단 형식 출력 (단수 x 행수 = 단수 * 행수)
		//양수를 입력 받으세요.
		//입력 받은 수에 해당하는 구구단을 출력하세요.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("구구단 단수를 입력하세요: ");
		int dan = scan.nextInt();   // 단을 입력
		
		System.out.println("랜덤 구구단 " + dan + "단");
		System.out.println("---------------");
		
		int a = 1;  //제어변수
		
		while (a <= 9 ) {
			//System.out.println(dan + " x " + a + " = " + (dan * a));
			System.out.printf("%d x %d = %d\n", dan,a,(dan*a));
			a++;
		}		
		
	}

}
// ctrl + a >> ctrl + i  == 줄 맞추기.

