package level2;import java.util.Arrays;

public class N_leastCommonMultiple {
	
	public static void main(String[] args) {
		
		int[] arr = {2,6,8,14};
		int[] arr2 = {1,2,3};
		
		System.out.println(solution(arr));
		System.out.println(solution(arr2));
		
		
		
	}//end main
	
	static int solution(int[] arr) {
	
        int answer = arr[0];
        
        for(int i = 0; i < arr.length; i++) {
        	answer = lcm(answer, arr[i]); 
        }
        
        return answer;
    }
	
	static int gcd(int a, int b) {
		int temp;
		while(b != 0) {
			temp = b;
			b = a%b;
			a = temp;
		}
		
		return a;
	}
	
	static int lcm(int a, int b) {
		if(a<=0 || b<=0) return -1;
		return a * b/gcd(a,b);
	}
}
