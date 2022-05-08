package day02;

import java.util.Arrays;

public class ArrayEx {
	
	public static void main(String[] args) {
		
		//1. 배열의 선언
		int[] arr;
		
		//2. 배열의 생성
		arr = new int[5];  //5 = 배열의 크기
		System.out.println(arr); //주소값
		
		//3. 배열의 초기화
		arr[0] = 1;        //arr[인덱스 번호] = 1;
		arr[1] = 100;
		arr[2] = 200;
		arr[3] = 5;
		arr[4] = 2;
		
		//4. 배열의 사용
		System.out.println("배열의 3번째 상자 값:" + arr[2]);
		
		arr[2] = 50;
		System.out.println("배열의 3번째 상자 값:" + arr[2]);
		
		//5. 배열의 지정된 값을 한 눈에 문자열형태로 확인  *******암기
		System.out.println(Arrays.toString(arr));
		
		//6. 배열의 길이                           *******암기
		System.out.println("arr의 길이:" + arr.length);
		
		//7. 배열의 선언과 생성을 한 번에          *******
		byte[] arr2 = new byte[7];  //배열은 초기화를 지정하지 않으면 각 타입의 기본값으로 초기화, 숫자:0 or 0.0 / 문자열:null
		System.out.println(Arrays.toString(arr2));
		
		//8. 배열의 선언과 생성, 초기화를 한 번에    *******
		int[] arr3 = {1,2,3,4,5};
		System.out.println(Arrays.toString(arr3));
		
		
		
		System.out.println("------------------------------");
		
		
		/*
		 * 크기가 3인 String배열을 생성하고, 월요일, 화요일, 수요일을 저장
		 */
		
		String[] arr4 = new String[3];
		arr4[0] = "월요일";
		arr4[1] = "화요일";
		arr4[2] = "수요일";			
//		String[] arr4 = {"월요일", "화요일", "수요일"};
		
		System.out.println(Arrays.toString(arr4));
		
		
				
	}

}
