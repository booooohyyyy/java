package level1;

import java.util.Arrays;

public class NonNumberPlus {
	
	public static void main(String[] args) {
		
		int result = 0;
		boolean bool;
		
		int num = (int)(Math.random() * 9) +1;
		int[] numbers = new int[num];
		
		for (int i = 0; i < num; i++) { 		//겹치지 않는 난수 배열에 넣기

			while(true) {
				
				numbers[i] = (int)(Math.random() * 10);
				bool = false;
				
				for (int j = 0; j < i; j++) {
					if(numbers[j] == numbers[i]) {
						bool = true;
						break;
					}
				}
				if(!bool) {
					break;
				}
			}		
		}
		
		System.out.println(Arrays.toString(numbers));
		
		for (int i = 1; i <= 9; i++) {
			result += i;
		}
		for (int i = 0; i < num; i++) {
			result -= numbers[i];
		}
		
		System.out.println("result:" + result);
		
		
		
	}

}
