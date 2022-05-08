package level2;

import java.util.Arrays;

public class Make_Minmum {
	
	public static void main(String[] args) {
		
		int[] a = {1, 4, 2};
		int[] b = {5, 4, 4};
		
		int[] a2 = {1,2};
		int[] b2 = {3,4};
		
		System.out.println(solution(a, b));
		System.out.println(solution(a2, b2));
		
		
	}//end main
	
	static int solution(int[] A, int[] B) {
		
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0; i < A.length; i++) {
        	answer += A[i] * B[B.length-(1+i)];
        }

        return answer;
        
    }

}
