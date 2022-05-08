package level1;

import java.util.Arrays;

public class CommonMultiple_Dvisor {
	
	public static void main(String[] args) {
		
		int n = 3;
		int m = 12;
		
		int n2 = 2;
		int m2 = 5;
		
		int n3 = 94;
		int m3 = 4;
		
		System.out.println(Arrays.toString(solution(n, m)));
		System.out.println(Arrays.toString(solution(n2, m2)));
		System.out.println(Arrays.toString(solution(n3, m3)));
		
		
		
	}//end main
	
	static int[] solution(int n, int m) {
		
        int[] answer = {};
        answer = new int[2];
        
        int big = 0;
        int small = 0;
        
        if(n > m) {
        	big = n;
        	small = m;
        }else {
        	big = m;
        	small = n;
        }
        answer[0] = gcd(big, small);
        answer[1] = big*small/answer[0];
        
        return answer;
        
    }
	
	
	static int gcd(int a, int b ) {
		if (a % b == 0) {
			return b;
		}
		
		return gcd(b, a%b);
	}

}
