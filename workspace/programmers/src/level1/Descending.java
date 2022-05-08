package level1;

import java.util.Arrays;

public class Descending {
	
	public static void main(String[] args) {
		
		long n = 118372L;
		System.out.println(solution(n));
		
	}//end main
	
	static long solution(long n) {
		
        long answer = 0;
        String str = "" + n;
        char[] arr = new char[str.length()];
        
        for(int i = 0; i < arr.length; i++) {
        	arr[i] = str.charAt(i);
        }
//        System.out.println(Arrays.toString(arr));
        
        for(int i = 0; i < arr. length-1; i++) {
        	for(int j = i; j < arr.length; j++) {
        		if(arr[i] < arr[j]) {
        			char temp = arr[i];
        			arr[i] = arr[j];
        			arr[j] = temp;
        		}
        	}
        }
//        System.out.println(Arrays.toString(arr));
        
        str = "";
        for(int i = 0; i < arr.length; i++) {
        	str += arr[i];
        }
 
        answer = Long.parseLong(str); //문자열으르 롱타입으로 변환
        return answer;
        
    }

}
