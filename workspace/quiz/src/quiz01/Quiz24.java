package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz24 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] arr = {"무지", "네오", "어피치", "라이언", "단무지"};
		System.out.println("현재 저장된 친구들: " + Arrays.toString(arr));
		
		System.out.print("검색할 카카오친구>");
		String search = scan.next();
		
		int i = 0;
		while(i < arr.length) {
			
			if (arr[i].equals(search)) {  //문자열 비교
				System.out.println(search + " 친구는 " + (i+1) + "번째에 있습니다.");
				break;
			}
			i++;
		}

		if(i == arr.length) {
			System.out.println(search + " 친구는 없습니다!");
		}
		
	}

}
