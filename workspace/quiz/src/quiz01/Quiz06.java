package quiz01;

import java.util.Scanner;

public class Quiz06 {
	
	public static void main(String[] args) {
		
		//*. 양의 정수를 입력 받아 짝수 라면 "x는 짝수 입니다., 홀수 라면 "x는 홀수 입니다"를 출력하세요.
		// 0이라면 "0입니다."
		// 음수라면 "음수 입니다."를 출력하세요.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("수를 입력하세요.");   //수를 입력 
		System.out.print(">");
		int num = scan.nextInt();
		
		if (num > 0) {    //양수, 0, 음수 파악
			
			if (num % 2 == 0) {  //홀,짝 파악
				
				System.out.println(num + "은(는) 짝수 입니다.");
				
			}else {
				
				System.out.println(num + "은(는) 홀수 입니다.");
			}
				
		}else if (num == 0) {
			
			System.out.println("0 입니다.");
			
		}else {
			
			System.out.println("음수 입니다.");
			
		}
		
		scan.close();
		
	}

}
