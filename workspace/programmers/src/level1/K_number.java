package level1;

import java.util.Arrays;
import java.util.Scanner;

public class K_number {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		int[] arr = {1,5,2,6,3,7,4};
		
//		int[][] arr = new int[3][4];  //이중배열 ㅜㅜ
//		
//		[
//		 [, , , ,],
//		 [, , , ,],
//		 [, , , ,]
//		]
				
		int num = (int)(Math.random()*100) +1; 		//랜덤크기의 배열 생성
		int[] arr = new int[num];
		for (int m = 0; m < num; m++) {				//배열에 랜덤값 넣어줌
			arr[m] = (int)(Math.random()*100) +1;
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.print("i번째 부터>");
		int i = scan.nextInt();
		System.out.print("j번째 까지>");
		int j = scan.nextInt();
		System.out.print(i + "번째 부터 " + j + "번째 까지 배열의 k번째 수>");
		int k = scan.nextInt();
		
		int[] newArr = new int[(j-i)+1];
		
		for (int a = 0; a < (j-i)+1; a++) {
			newArr[a] = arr[a+(i-1)];
		}
		
		Arrays.sort(newArr);						//오름차순 정리
		System.out.println(Arrays.toString(newArr));
		
		System.out.println(k + "번째 숫자는 " + newArr[k-1]);
		
	}

}
