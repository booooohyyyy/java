package quiz01;

import java.util.Arrays;

public class Quiz17 {
	
	public static void main(String[] args) {
		
		//변수의 swap
//		int x = 1;
//		int y = 5;
//		
//		int temp = x;
//		x = y;
//		y = temp;
//		
//		System.out.println(x);
//		System.out.println(y);
		
		
		//배열요소의 swap
		
//		int[] arr = {1,2,3}; //1, 3의 자리변경
//		
//		int temp = arr[0];
//		arr[0] = arr[2];
//		arr[2] = temp;
//		
//		System.out.println(Arrays.toString(arr));
		
		
		//숙제. Math.random을 이용해서 랜덤하게 배열을 9번 섞습니다.
		//섞인 배열의 0~2번째 상자를 추출해서 새로운 배열에 저장하는 프로그램 코드를 작성
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		for (int i = 0; i < arr.length; i++) {
			int x = (int)(Math.random() * arr.length);
			
			int temp = arr[i];
			arr[i] = arr[x];
			arr[x] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = new int[3];			//0~2번째 배열 생성
		
		for (int i = 0; i <= 2; i++) {
			arr2[i] = arr[i];
		}
		System.out.println(Arrays.toString(arr2));
		
	}

}
