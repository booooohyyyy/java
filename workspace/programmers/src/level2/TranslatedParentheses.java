package level2;

public class TranslatedParentheses {
	
	public static void main(String[] args) {
		
		String p = "(()())()";
		String p2 = ")(";
		String p3 = "()))((()";
		String p4 = ")))((()())((";
		
		System.out.println(solution(p));
		System.out.println(solution(p2));
		System.out.println(solution(p3));
		System.out.println(solution(p4));
		
		
	}//end main
	
	static  String solution(String p) {
		
        String answer = "";
        char[] arr = new char[p.length()];
        		
        //올바른 괄호 문자열 확인
        int cnt1 = 0; //'('의 개수
        int cnt2 = 0; //')'의 개수
        for(int i = 0; i < p.length(); i++) {
        	arr[i] = p.charAt(i);
        	
        	if(p.charAt(i) == '(') {
        		cnt1++;
        	}else {
        		cnt2++;
        	}
        }
        
        boolean bool = false;
        if(cnt1 == cnt2) {
        	bool = true;
        }
        
        //올바른 괄호 문자열일때 괄호 재배치
		boolean bool2 = false;
        while(bool) {
        	if(p.length() == 2) {
        		arr[0] = '(';
        		arr[1] = ')';
        		break;
        	}else {
        		
        		for(int i = 0; i < p.length()-1; i++) {
        			
        			for(int j = i+1; j < p.length(); j++) {
        				if(p.charAt(i) == '(') {
        					cnt1++;
        				}else {
        					cnt2++;
        				}
        				
        				if(p.charAt(j) == '(') {
        					cnt1++;
        				}else {
        					cnt2++;
        				}
        				
        				if(cnt1 < cnt2) {
        					char temp = arr[i];
        					arr[i] = arr[j];
        					arr[j] = temp;
        				}
        				
            	        cnt1 = 0;
            			cnt2 = 0;
            			for(int k = 0; k < j; k++) {
            				if(arr[k] == '(') {
            					cnt1++;
            				}else {
            					cnt2++;
            				}
            			}
        				
        			}
        			
        		}
        		break;
        	}
        	
        }
        
        for(char c : arr) {
        	answer += c;
        }
        
        return answer;
        
    }
}
