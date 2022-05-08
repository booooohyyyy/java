package level2;

import java.util.Arrays;

public class JadenCase {
	
	public static void main(String[] args) {
		
		String s = "3people unFollowed me";
		String s2 = "for the last week";
		
		System.out.println(solution(s));
		System.out.println(solution(s2));
		
		
	}//end main

	static String solution(String s) {
		
        String answer = "";
        char[] ch = s.toCharArray();        

        
        for(int i = 0; i < ch.length; i++) {
        	if(i == 0) {
        		if(ch[i] <= 122 && ch[i] > 97) {
        			ch[i] -= 32;
        		}
        	}else {
        		if(ch[i] == ' ') {
        			ch[i+1] -= 32;	
        		}
        	}
        }
        
        for(int i = 0; i < ch.length; i++) {
        	answer += ch[i];
        }
        
        return answer;
        
    }
	
}
