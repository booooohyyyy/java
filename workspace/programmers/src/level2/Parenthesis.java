package level2;
import java.util.Arrays;

public class Parenthesis {
	
	
	public static void main(String[] args) {
	
		String s = "()()";
		String s2 = "(())()";
		String s3 = ")()(";
		String s4 = "(()(";
		
		System.out.println(solution(s));
		System.out.println(solution(s2));
		System.out.println(solution(s3));
		System.out.println(solution(s4));
		
		
	}//end main
	
	
	static boolean solution(String s) {
		
        boolean answer = true;
        char[] ch = s.toCharArray();
        int cnt1 = 0;
        int cnt2 = 0;
        
        for(int i = 0; i < ch.length; i++) {
        	if(ch[0] != '(') {
        		answer = false;
        	}
        	
        	if(ch[i] == '(') {
        		cnt1++;
        	}else {
        		cnt2++;
        	}
        	
        	if(cnt2 > cnt1) {
        		answer = false;
        	}
        	
        }
        if(cnt1 != cnt2) {
        	answer = false;
        }
        
        return answer;
        
    }

}
