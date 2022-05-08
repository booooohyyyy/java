package level1;

import java.util.Arrays;


public class Element_Divisor {
	
	public static void main(String[] args) {
		
		int[] arr = {5, 9, 7, 10};
		int divisor = 5;
		
		int[] arr2 = {2, 36, 1, 3};
		int divisor2 = 1;
		
		int[] arr3 = {3,2,6};
		int divisor3 = 10;
		
		System.out.println(Arrays.toString(solution(arr, divisor)));
		System.out.println(Arrays.toString(solution(arr2, divisor2)));
		System.out.println(Arrays.toString(solution(arr3, divisor3)));
		
		
	}//end main
	
	static int[] solution(int[] arr, int divisor) {
		
        int[] answer = {};
        int[] temp = new int[arr.length];
        int cnt = 0;
        
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] % divisor == 0) {
        		temp[i] = arr[i];
        		cnt++;
        	}
        }
        
        for(int i = 0; i < temp.length-1; i++) {
        	for(int j = (i+1); j < temp.length; j++) {
        		if(temp[i] < temp[j]) {
        			int str = temp[i];
        			temp[i] = temp[j];
        			temp[j] = str;
        		}
        	}
        }
              
        if(cnt == 0) {
        	answer = new int[1];
        	answer[0] = -1;
        }else {        	
        	answer = new int[cnt];
        	
        	for(int i = 0; i < cnt; i++) {
        		answer[i] = temp[i];
        	}
        }
        
        Arrays.sort(answer);
        
        return answer;
        
    }

}
