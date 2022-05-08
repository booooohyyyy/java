package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz23 {
	
	public static void main(String[] args) {
		
		//switch문, while문을 이용해서 작성.
		
		//1. Scanner를 이용하여 금액을 입력 받으세요.
		//2. 음료수를 선택하면 금액에서 차감하세요.(반복문)
		//3. 금액이 부족하다면 "금액이 부족합니다"를 출력
		//4. 4를 입력받으면 반복문을 종료
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액을 투입해 주세요>");
		int money = scan.nextInt();
		
		es:while(true) {
			System.out.println("남은금액:" + money + "원");
			System.out.println("[1]데미소다 400원, [2]밀키스 500원, [3]코카콜라 600원, 잔돈받기);");
			
			System.out.print("메뉴선택>");
			int menu = scan.nextInt();
			
			switch (menu) {
			case 1:
				if (money < 400) {
					System.out.println("금액이 부족합니다. 돈을 넣어주세요");
				}else {
					System.out.println("뎀이소다를 받았습니다.");
					money -= 400;
				}
				break;
			case 2 :
				if (money < 500) {
					System.out.println("금액이 부족합니다. 돈을 넣어주세요");
				}else {					
					System.out.println("밀킥스를 받았습니다.");
					money -= 500;
				}
				break;
			case 3 :
				if (money < 600) {
					System.out.println("금액이 부족합니다. 돈을 넣어주세요");
				}else {
					System.out.println("코카골라를 받았습니다.");
					money -= 600;					
				}
				break;
			case 4 :
				System.out.println("남는 금액 " + money + "을(를) 반환합니다.");
				break es;
			default :
				break;
			}
			System.out.println();			
		}
		
	}

}
