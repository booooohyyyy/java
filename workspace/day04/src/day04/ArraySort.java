package day04;

import java.util.Arrays;

public class ArraySort {
	
	public static void main(String[] args) {
		
		//반복문을 이용한 sort   *****시험문제 빈칸 채우기*****
		int[] arr = {5, 23, 1, 43, 100, 200, 40};
		
		for (int i = 0; i < arr.length-1; i++) {		//arr.length-1 **
			for (int j = (i+1); j < arr.length; j++ ) {	//int j = (i+1)**
				if (arr[i] > arr[j]) {  // > : 오름차순, < : 내림차순
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
 				}			
			}
		}
		System.out.println(Arrays.toString(arr));
		//배열이 커지면 효율이 안좋음.
		
		
		//퀵sort  =  이진탐색을 이용한 sort이다.
		
		
		
	}

}
