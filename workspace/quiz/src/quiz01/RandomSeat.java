package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class RandomSeat {
	
	public static void main(String[] args) {
		
		/*
		 *	사람 수를 입력받아서 자리를 배정할 수 있도록 하는 프로그램
		 * 
		 * 1. 사람 수를 입력 받음
		 * 2. 입력받은 사람 수 만큼 랜덤값을 생성해서 배열에 중복되지 않도록 
		 *    랜덤하게 지정.
		 *    
		 * 3. 해당 배열의 크기만큼 o으로 출력해주세요 (○ : ㅁ한자 + 9)
		 * 4. 선택좌석을 입력받아서, 제대로 된 좌석이라면 자리번호를 공개하고
		 *    제대로 선택되지 않은 좌석이라면, 다시 입력받으세요.
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배정할 좌석의 크기를 지정하세요>");
		int size = scan.nextInt();				//크기 지정
		int[] arr = new int[size];				//지정한 크기의 배열 생성
		boolean bool;
		
		for (int i = 0; i < size; i++) { 		//겹치지 않는 난수 배열에 넣기

			while(true) {
				
				arr[i] = (int)(Math.random() * size) +1;
				bool = false;
				
				for (int j = 0; j < i; j++) {
					if(arr[j] == arr[i]) {
						bool = true;
						break;
					}
				}
				if(!bool) {
					break;
				}
			}		
		}
//		System.out.println(Arrays.toString(arr)); // 자리번호
		
		System.out.println("---------좌석 선택 프로그램---------");
		
		for (int i = 1; i <= size; i++) {
			System.out.print(i + "\t");
		}
		
		System.out.println();
		
		String[] xxx = new String[size];
		
		for (int i = 0; i < size; i++) {
			xxx[i] = "○";
			System.out.print(xxx[i] + "\t");
		}
		System.out.println();
		
		while (true) {
					
			System.out.print("좌석 선택>");
			int seat = scan.nextInt();
			System.out.println("자리번호를 공개합니다:" + arr[seat-1]);
			
			System.out.println("---------좌석 선택 프로그램---------");
			
			for (int i = 1; i <= size; i++) {
				System.out.print(i + "\t");
			}
			
			System.out.println();
			
			for (int i = 0; i < size; i++) {
				if ( i == seat ) {
					xxx[i-1] = "●";
				}
			
			}
			
			System.out.println();
			
//			System.out.println(Arrays.toString(xxx));
			
			for (int i = 0; i < xxx.length; i++) {
				System.out.print(xxx[i] + "\t");
			}
			
			System.out.println();
			
			scan.close();

			
		}
		
	}

}
