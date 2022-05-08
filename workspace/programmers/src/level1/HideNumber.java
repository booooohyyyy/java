package level1;

import java.util.Arrays;

public class HideNumber {
	
	public static void main(String[] args) {
		
		String num = "01033334444";
		String num2 = "027778888";
		
		System.out.println(solution(num));
		System.out.println(solution(num2));
		
		
		
	}//end main
	
	static String solution(String phone_number) {
		
        String answer = "";
//        String[] str = phone_number.split("");
        
//        System.out.println(Arrays.toString(a));
        
        for(int i = 0; i < phone_number.length(); i++) {
        	if( i < phone_number.length() -4) {
        		answer += "*";
        	}else {
//        		answer += str[i];
        		answer += phone_number.charAt(i);
        	}
        }
         
        return answer;
    }

}
