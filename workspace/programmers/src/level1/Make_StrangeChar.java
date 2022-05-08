package level1;

import java.util.Arrays;

public class Make_StrangeChar {
	
	public static void main(String[] args) {
		
		String s = "try hello world";
		
		System.out.println(solution(s));
		
		
		
	}//end main
	
	static String solution(String s) {
		
		String answer = "";
        String[] arr = s.split("");
        
//        System.out.println(Arrays.toString(arr));
        
        int index = 0;
        
        for(int i = 0; i < arr.length; i++) {
        	if(arr.equals("")) {
        		index = 0;
        	}else if(i % 2 == 0) {
        		arr[i] = arr[i].toUpperCase();
        	}else {
        		arr[i] = arr[i].toLowerCase();
        	}
        	answer += arr[i];
        }
            
        return answer;
        
    }

}
