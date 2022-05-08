package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch02 {
	
	public static void main(String[] args) {
		
		//이진탐색의 선행조건: 정렬
		
		int[] arr = {10, 20, 50, 40, 30, 60, 100, 150, 70};
		
		//오름차순 정리
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Scanner scan = new Scanner(System.in);
		System.out.print("찾을값>");
		int search = scan.nextInt();
		
		int low = 0;
		int high = arr.length -1;
		boolean bool = false;
		
		
		while ( low <= high ) {
			
			//중간값의 결정
			int mid = (low + high) / 2; //나눌값이 홀수, 짝수 상관x
			
			if (arr[mid] == search) {
				System.out.println("찾는값은" + mid + "번째 index에 존재");
				bool = true;
				break;
			}
			
			if (search > arr[mid]) {
				low = mid + 1;		//중간index 다음 번째로 low이동
			}else {
				high = mid - 1;		//중간index 이전 번째로 high이동
			}
			
		}
		if (!bool) {
			System.out.println(search + "는(은) 없습니다.");
		}
		
	}

}
