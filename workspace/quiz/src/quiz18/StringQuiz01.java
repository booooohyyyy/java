package quiz18;

import java.util.Scanner;

public class StringQuiz01 {
	
	public static void main(String[] args) {
		
		/*
		 * 스캐너의 nextLine()을 이용해서 id를 입력받습니다.
		 * 아이디는 공백을 포함해서 받을 수 있습니다.
		 * 단, 공백을 제거한 아이디가 5글자 미만이면 다시 입력받으세요.
		 * 
		 * 정상입력이라면 "id등록" 출력후에 종료
		 */
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("만들 id를 입력해주세요>");
			String id = scan.nextLine();
			
			id = id.replace(" ", "");
			
			if(id.length() < 5) {
				System.out.println("5글자 이상으로 만드세요.");
			}else {
				System.out.println(id + " id 등록");
				break;
			}
		}
		
		scan.close();
		
	}

}
