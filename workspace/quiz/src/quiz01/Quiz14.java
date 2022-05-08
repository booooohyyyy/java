package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz14 {
	
	public static void main(String[] args) {
		
		//입력받은 수 크기의 배열을 생성하고 1~10입력받은 수를 저장하는 프로그램코드
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수를 입력하세요>");
		int a = scan.nextInt();
		
		int[] arr = new int[a];		//입력받은 수 크기의 배열 생성
		
		int i = 0;					//제어변수
		
		while ( i < a ) {
			arr[i] = i+1;
			i++;
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
