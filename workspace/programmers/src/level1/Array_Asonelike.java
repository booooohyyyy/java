package level1;

import java.util.Arrays;

public class Array_Asonelike {
	
	public static void main(String[] args) {
		
		String[] arr = {"sun", "bed", "car"};
		int n = 1;
		
		String[] arr2 = {"abce", "abcd", "cdx"};
		int n2 = 2;
			
		
		System.out.println(Arrays.toString(solution(arr, n)));
		System.out.println(Arrays.toString(solution(arr2, n2)));
	
		
		
		
	}//end main
	
	static String[] solution(String[] strings, int n) {
		
        String[] answer = strings;
        char[] arr = new char[strings.length];
        Arrays.sort(answer);
        
        for(int i = 0; i < strings.length; i++) {
        	arr[i] = strings[i].charAt(n); 
        }
//        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < strings.length-1; i++) {
        	for(int j = i+1; j < strings.length; j++) {
        		if(arr[i] > arr[j]) {
        			String temp = answer[i];
        			answer[i] = answer[j];
        			answer[j] = temp;
        		}
        	}
        }
 
        return answer;
        
    }
	

}
