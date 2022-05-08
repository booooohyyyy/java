package level2;

import java.util.LinkedList;
import java.util.List;

public class Make_BigNum {
	
	public static void main(String[] args) {
		
		String number = "1924";
		int k = 2;
		
		String number2 = "1231234";
		int k2 = 2;
		
		String number3 = "4177252841";
		int k3 = 2;
		
		System.out.println(solution(number, k));
		System.out.println(solution(number2, k2));
		System.out.println(solution(number3, k3));
		
	}//end main
	
	
	static String solution(String number, int k) {
		
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int index = 0;
        int max = 0;
        
        for (int i = 0; i < number.length() -k; i++) {
        	max = 0;
        	
        	for (int j = index; j <= k+i; j++) {
        		if(max < number.charAt(j) - '0') {
        			max = number.charAt(j) - '0';
        			index = j+1;
        		}	
        	}
        	
        	sb.append(max);
        }
        
        answer = sb.toString();
        return answer;
        
    }

}
