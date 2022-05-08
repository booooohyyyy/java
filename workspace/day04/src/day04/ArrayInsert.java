package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//크기 100인 배열 생성
		String[] arr = new String[100];
		
		System.out.println("# 먹고 싶은 음식을 입력하세요!!");
		System.out.println("# 중지하려면 '그만'을 입력하세요.");
		
		int cnt = 0; //입력받은 개수를 카운트해서 index로 사용할 변수
		while(true) {
			
			System.out.print("> ");
			String menu = scan.nextLine(); //공백을 포함한 문자열을 받습니다.
			
			if(menu.equals("그만")) {  //문자열 비교: 이름.equals.("") ***
				System.out.println("입력종료");
				break;
			}
			arr[cnt] = menu;
			cnt++;		
		}
		
		String str = "[";
		for (int i = 0; i < cnt; i++) {
			str += arr[i];
			if ( i == cnt - 1) break; //마지막 직전 , 안찍기
			str += ", ";
		}
		str += "]";
		System.out.println(str);
		
	}

}
