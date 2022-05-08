package level1;

public class String_To_Int {
	
	public static void main(String[] args) {
		
		String s = "1234";
		String s2 = "-1234";
		
		System.out.println(solution(s));
		System.out.println(solution(s2));
		
		
	}//end main

	static int solution(String s) {
		
        int answer = 0;
        
        answer = Integer.parseInt(s);
        
        return answer;
        
    }
	
}
