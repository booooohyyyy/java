package level1;

import java.util.Arrays;

public class Del_Min {
	
	public static void main(String[] args) {
		
		int[] arr = {4,3,2,1};
		int[] arr2 = {10};
		int[] arr3 = {8,4,5,2,7,1,9};
		
		System.out.println(Arrays.toString(solution(arr)));
		System.out.println(Arrays.toString(solution(arr2)));
		System.out.println(Arrays.toString(solution(arr3)));
		
	}//end main
	
	static int[] solution(int[] arr) {
		
        int[] answer = {};
        answer = new int[arr.length-1];
        
        if (arr.length == 1) {
        	arr = arr;
        }else {        	
        	for(int i = 0; i < arr.length-1; i++) {
        		for(int j = i+1; j < arr.length; j++) {
        			if(arr[i] < arr[j]) {
        				int temp = arr[i];
        				arr[i] = arr[j];
        				arr[j] = temp;
        			}
        		}
        	}
        }
        
//        System.out.println(Arrays.toString(arr));
        if(arr.length == 1) {
        	answer = arr;
        	if(answer[0] == 10) {
        		answer[0] = -1;
        	}else {
        		answer = answer;
        	}
        }else {        	
        	for(int i = 0; i < answer.length; i++) {
        		answer[i] = arr[i];
        	}
        }
        
        return answer;
        
    }

}
