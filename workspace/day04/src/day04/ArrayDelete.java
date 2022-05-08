package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDelete {
	
	public static void main(String[] args) {
		
		//배열의 삭제 ->> i는 맨 마지막은 할 필요 없음.
		//            (오류) 당겨오는 index번호가 초과하기 때문
		
//		int[] arr = {1,2,3,4,5,6,7,8,9,10};
//		//4번째 인덱스의 삭제
//		
//		for (int i = 4; i < arr.length-1; i++) {	//마지막 전 번째까지 회전
//			arr[i] = arr[i+1];
//		}
//		System.out.println(Arrays.toString(arr));
		
		
		String[] arr = {"강타", "문희준", "토니안", "장우혁", "이재원"};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 이름>");
		String name = scan.next();
		boolean bool = true;
		
		int cnt = arr.length; //5
		
		for (int i = 0; i < cnt; i++) {	//탐색
			
			if (name.equals(arr[i])) {	//삭제할 학생을 찾은 경우
				//삭제진행
				for (int j = i; j < cnt-1; j++) {
					arr[j] = arr[j+1];
				}
				//삭제의 의미
				cnt--;     //삭제 시켰으니 배열의크기 축소
				bool = false;
			}
		}
		if (bool) {
			System.out.println("삭제할 별명이 없음");
		}else {
			System.out.println("-----삭제 후 정보-----");
			for (int i = 0; i < cnt; i++) {
				System.out.print(arr[i] + " ");
			}
		}
		
		scan.close();
	
		
	}

}
