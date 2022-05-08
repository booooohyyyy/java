package level1;

import java.util.Arrays;

public class NatualNum_Turn {
	
	public static void main(String[] args) {
		
		long n = 12345L;
		System.out.println(Arrays.toString(solution(n)));
		
		
		
	}//end main
	
	static int[] solution(long n) {
		
        String str = ""+ n;
        int[] answer = new int[str.length()];
        
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = (int)(n%10);
        	n /= 10;
        }
        
        
        
        return answer;
    }
}
