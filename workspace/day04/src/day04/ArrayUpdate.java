package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUpdate {
	
	public static void main(String[] args) {
		
		//배열 요소의 수정
		String[] arr = {"강타", "문희준", "토니안", "장우혁", "이재원"};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("찾을이름>");
		String name = scan.next();
		
		boolean bool = true;
		
		//배열 요소에 이름 존재여부를 탐색
		int i = 0;
		while (i < arr.length) {
			
			if (name.equals(arr[i])) {
				System.out.println(arr[i] + "의 별명을 수정합니다.");
				System.out.print("뭘로 변경?>");
				arr[i] = scan.next();
				bool = false;
				break;
			}
			i++;
		}
		if (bool) {
			System.out.println("해당 이름은 없는사람");
		}else {
			System.out.println(Arrays.toString(arr));
		}
		
		scan.close();
	}		

}
