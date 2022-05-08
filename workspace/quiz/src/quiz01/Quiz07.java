package quiz01;

import java.util.Scanner;

public class Quiz07 {
	
	public static void main(String[] args) {
		
		/*
		 * 숙제. 
		 * 정수 3개를 받아서, 큰값, 중간값, 작은값을 구한 후
		 * 조건문안에서 max, mid, min 에 저장
		 */
		
		int max = 0;  //최대값 저장
		int mid = 0;  //중간값 저장
		int min = 0;  //최소값 저장
		
		Scanner scan = new Scanner(System.in);  
		
		System.out.print("정수 입력>");                 //정수 3개를 입력
		int num1 = scan.nextInt();
		System.out.print("정수 입력>");
		int num2 = scan.nextInt();
		System.out.print("정수 입력>");
		int num3 = scan.nextInt();

		
		if (num1 > num2) {                 //대수 비교
			if (num2 > num3) {
				max = num1;
				mid = num2;
				min = num3;
			}else {
				if (num1 > num3) {
					max = num1;
					mid = num3;
				} else {
					max = num3;
					mid = num1;
				}
				min = num2;
			}
		}else {
			if (num2 < num3) {
				max = num3;
				mid = num2;
				min = num1;
			}else {
				max = num2;
				if (num1 > num3) {
					mid = num1;
					min = num3;
				}else {
					mid = num3;
					min = num1;
				}
			}
		}
		
		System.out.println("최대값: " + max);        //출력
		System.out.println("중간값: " + mid);
		System.out.println("최소값: " + min);
		
		scan.close();
	}
}
	
