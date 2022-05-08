package quiz01;

import java.util.Arrays;

public class Quiz16 {
	
	public static void main(String[] args) {
		
		//1. 7~100사이의 정수중에 7의 배수 가로 출력
		
		for (int i = 7; i <= 100; i++) {
			if (i % 7 == 0) {
				System.out.print(i + " ");
			}
		}	
		System.out.println();                  //위아래 값 같음
		
		for (int i = 7; i <= 100; i += 7) {    //7씩 증가도 가능함.
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("---------------------");
		
		//2. 1~100정수 중의 12 배수 가로출력
		
		for (int j = 1; j <= 100; j++) {
			if (j % 12 == 0) {
				System.out.print(j + " ");
			}
		}
		
		System.out.println();
		System.out.println("---------------------");
					
		//3. 50~100사이 두 수 사이의 합
		
		int sum = 0;
		
		for (int k = 50; k <= 100; k++) {
			sum += k;
		}
		System.out.println("50~100의 두 수의 합은:" + sum);
		
		System.out.println("---------------------");
		
		//4. char형을 이용해서 A~Z까지 문자열을 가로로 출력
			
//		for (int a = 65; a <= 90; a++) {  //문자로도 가능> for(char c = 'A'; c = 'Z'; c++) {
//			System.out.print((char)a);
//		}
//		
//		System.out.println();
//		System.out.println("---------------------");
		
		String str = "";			//문자열의 합을 넣을 변수
		for (char c = 'A'; c <= 'Z'; c++) {
			str += c;
		}
		System.out.println(str);
		
		System.out.println("---------------------");
		
		//5. 125의 약수의 개수를 구하세요.
		
		int cnt = 0;			//약수의 개수를 세는 카운터 변수
		
		for (int b = 1; b <= 125; b++) {
			if (125 % b == 0 ) {
				cnt++;
			}
		}
		System.out.println("125 약수의 개수는:" + cnt + "개");
		
		System.out.println("---------------------");
		
		//6. 100개의 크기를 가지는 int형 배열에 3의 배수를 순서대로 저장
		
		int[] arr = new int[100];   //100크기의 배열 생성
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ((i+1)*3);	
		}
		System.out.println(Arrays.toString(arr));
	}

}
