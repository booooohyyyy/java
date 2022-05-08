package level1;

import java.util.Arrays;

public class X_Space_N {
	
	public static void main(String[] args) {
		
		
		int x = 2;
		int n = 5;
		
		int x2 = 4;
		int n2 = 3;
		
		int x3 = -4;
		int n3 = 2;
		
		System.out.println(Arrays.toString(solution(x,n)));
		System.out.println(Arrays.toString(solution(x2,n2)));
		System.out.println(Arrays.toString(solution(x3,n3)));
		
		
	}//end main
	
	
	static long[] solution(int x, int n) {
		
        long[] answer = {};
        answer = new long[n];
        
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = x;
        	x += (x/(i+1));
        	
        }
        
        return answer;
        
    }

}
