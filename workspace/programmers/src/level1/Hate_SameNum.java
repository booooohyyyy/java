package level1;

import java.util.Arrays;

public class Hate_SameNum {
	
	public static void main(String[] args) {
		
		int[] arr = {1,1,3,3,0,1,1};
		int[] arr2 = {4,4,4,3,3};
		int[] arr3 = {1,1,2,2,2,4,4,1,1,3,3,2,3};
		
		System.out.println(Arrays.toString(solution(arr)));
		System.out.println(Arrays.toString(solution(arr2)));
		System.out.println(Arrays.toString(solution(arr3)));
		
		
	}//end main

	static int[] solution(int[] arr) {
		
        int j = 0;
        int[] temp = new int[arr.length];
        for(int i = 0; i < arr.length-1; i++) {
        	if(arr[i] != arr[i+1]) {
        		temp[j++] = arr[i];
        	}
        }

        temp[j++] = arr[arr.length-1];

        
        int[] answer = new int[j];
        for(int i = 0; i < j; i++) {
        	answer[i] = temp[i];
        }
        
        return answer;
        
    }
	
}
