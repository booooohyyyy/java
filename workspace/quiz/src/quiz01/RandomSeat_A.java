package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class RandomSeat_A {
	
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
		int[] arr = new int[size];
		
		//겹치지않는 난수 넣는법
		//1. 사이즈만큼 순차적으로 숫자를 넣은 후 섞는다.
		//2. 중복 되는지 확인하면서 넣는다.
		//(2)
		int i = 0;
		es:while(true) {
			
			int num = (int)(Math.random() * size) +1;
			for(int j = 0; j < i; j++) {
				if (num == arr[j]) continue es;
			}
			arr[i] = num;
			i++;
			
			if( i == size) break;
		}
		
//		System.out.println(Arrays.toString(arr));
		
		while(true) {
			System.out.println("=========좌석배정=========");
			
			for(int j = 0; j < size; j++) {
				System.out.printf("%-3d", j+1); //출력할때 3칸을 잡고 좌측에서 출력
				                                //양수는 출력할 때 3칸 잡고 우측에서 출력
			}
			System.out.println();			//줄 변경
			
			for(int j = 0; j< size; j++) {
				if(arr[j] != 0) {
					System.out.printf("%-3s", "○");					
				} else {
					System.out.printf("%-3s", "●");
				}
			}
			System.out.println();			//줄 변경
			
			//좌석입력
			System.out.print("좌석선택>");
			int seat = scan.nextInt();
			
			//
			if (arr[seat-1] != 0) {
				System.out.println("자리번호:" + arr[seat-1]);
				arr[seat-1] = 0;
			} else { 
				System.out.println("이미 선택한 자리입니다.");
			}
		}
		
	}

}
