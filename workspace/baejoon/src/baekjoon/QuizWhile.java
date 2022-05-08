package baekjoon;

import java.util.Scanner;

public class QuizWhile {
	
	public static void main(String[] args) {
		
		//* 0 < a,b < 10 을 입력받아 a+b 출력하는 반복문.
		

//		int i = 1;							//제어변수
//		
//		while ( i <= 10 ) {					//10번 반복하는 반복문
//			int a = (int)(Math.random() * 10);	//a값
//			int b = (int)(Math.random() * 10);	//b값
//			System.out.println((a+b));			//a+b값 출력
//			i++;
//		}
		
		
		
		//*. 더하기 사이클
		//0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 
		//먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 
		//그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다.
		
		//다음 예를 보자.
		//26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
		//위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
		//N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
		
//		Scanner scan = new Scanner(System.in);
//		
//		int F = scan.nextInt();					//N 입력
//		
//		//int ran = (int)(Math.random() *100 );	//0~99까지 랜덤수
//		int ran = 26;	
//		
//		int arr[] = new int[2];
//		arr[0] = (int)(ran * 0.1);				//랜덤 수의 십의자리 수
//		arr[1] = ran - (arr[0] * 10);			//랜덤 수의 일의자리 수
//		
//		int i = 1;								//제어 변수
//		
//		while ( i <= 100 ) {					//위의 예를 만족하는 반복문
//	
//			int a = arr[0] + arr[1];
//			
//			if (a >= 10) {
//				int[] arr1 = new int[2];
//				arr1[0] = (int)(a * 0.1);
//				arr1[1] = a - (arr1[0] * 10);
//				arr[0] = arr[1];
//				arr[1] = arr1[1];
//			}else {
//				arr[0] = arr[1];
//				arr[1] = a;
//			}
//			int b = (arr[0]*10) + (arr[1]);
//			if (F == b) {						//N일 때의 사이클 
//				System.out.println(i);
//			}
//			
//			i++;
//				
//		}
////		//System.out.println((arr[0]*10) + (arr[1]));
		
	}

}
