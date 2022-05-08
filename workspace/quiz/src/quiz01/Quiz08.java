package quiz01;

import java.util.Scanner;

public class Quiz08 {
	
	public static void main(String[] args) {
		
		//*. 메뉴를 보여준 후, Scanner로 해당 메뉴를 입력 받으세요.
		//없는 메뉴 라면 "~은 메뉴에 없습니다."를 출력하세요
		//switch 구문을 이용하세요.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("구입할 메뉴는?");
		System.out.println("[수박, 사과, 멜론, 포도, 귤]");
		System.out.print("> ");
		String manu = scan.next();
		
		switch(manu) {
		case "수박":
			System.out.println(manu + "의 가격은 2만원 입니다.");
			break;
		case "사과":
			System.out.println(manu + "의 가격은 3만원 입니다.");
			break;
		case "멜론":
			System.out.println(manu + "의 가격은 4만원 입니다.");
			break;
		case "포도":
			System.out.println(manu + "의 가격은 5만원 입니다.");
			break;
		case "귤":
			System.out.println(manu + "의 가격은 6만원 입니다.");
			break;
		default:
			System.out.println(manu + "은(는) 메뉴에 없습니다.");
			System.out.println("다시 입력해주세요.");
			break;
	
		}
		
	}

}
