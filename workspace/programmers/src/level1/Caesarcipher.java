package level1;

import java.util.Arrays;

public class Caesarcipher {
	
	public static void main(String[] args) {
		
		String s = "AB";
		int n = 1;
		
		String s2 = "z";
		int n2 = 1;
		
		String s3 = "a B z";
		int n3 = 4;
		
		System.out.println(solution(s,n));
		System.out.println(solution(s2,n2));
		System.out.println(solution(s3,n3));
		
		
		
	}//end main
	
	static String solution(String s, int n) {
		
        String answer = "";
               
        for(int i = 0; i < s.length(); i++) {
        	char ch = s.charAt(i);
        	if(ch == ' ') {
        		answer += ch;
        		continue;
        	}
        	
        	if(ch >= 'a' && ch <= 'z') {
        		if(ch+n > 'z') {
        			answer += (char)(ch-26+n);
        		}else {
        			answer += (char)(ch+n);
        		}	
        	}else if(ch >= 'A' && ch <= 'Z') {
        		if(ch+n > 'Z') {
        			answer += (char)(ch-26+n);
        		}else {
        			answer += (char)(ch+n);
        		}
        	}
        }
        
        return answer;
        
	}

}
