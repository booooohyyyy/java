package day03;

import java.util.Scanner;

public class SwitchEx02 {
	
	public static void main(String[] args) {
		
		//입력
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수 입력> ");  //점수 입력
		int point = scan.nextInt();
		
		switch(point / 10) {    //학점 확인
		
		case 10:
		case 9:
			if (point >= 95) {
				System.out.println("A+학점 입니다.");
			}else {
				System.out.println("A학점 입니다.");
			}
			break;
		case 8:
			System.out.println("B학점 입니다.");
			break;
		case 7:
			System.out.println("C학점 입니다.");
			break;
		case 6:
			System.out.println("D학점 입니다.");
			break;
		default:
			System.out.println("F학점 입니다.");
			break;
		}
	}
}
