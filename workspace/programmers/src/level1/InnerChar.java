package level1;

public class InnerChar {
	
	public static void main(String[] args) {
		
		String s = "abced";
		String s2 = "qwer";
		
		
		
		System.out.println(solution(s));
		System.out.println(solution(s2));
		
		
	}//end main
	
	
	static String solution(String s) {
		
		String answer = "";
		
		
		if(s.length() % 2 != 0) {
			char ch = s.charAt(s.length()/2);
			answer += ch;
		}else {
			for(int i = 0; i < 2; i++) {
				char ch = s.charAt(s.length()/2-(1-i));
				answer += ch;
			}
		}
		
		return answer;
	}

}
