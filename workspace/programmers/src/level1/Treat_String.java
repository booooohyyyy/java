package level1;

public class Treat_String {
	
	public static void main(String[] args) {
		
		String s = "a234";
		String s2 = "1234";
		
		System.out.println(solution(s));
		System.out.println(solution(s2));
		
		
		
		
	}//end main
	
	static boolean solution(String s) {
		
        boolean answer = true;
        
        if(s.length() == 4 || s.length() == 6) {
        	for (int i = 0; i < s.length(); i++) {
        		char ch = s.charAt(i);
        		if(ch < '0' || ch > '9') {
        			answer = false;
        		}	
        	}
        }else {
        	answer = false;
        }
        
        return answer;
        
    }
	
	
}
