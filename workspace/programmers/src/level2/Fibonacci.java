package level2;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int n = 3;
		int n2 = 5;
		
		System.out.println(solution(n));
		System.out.println(solution(n2));
		
		
		
	}//end main
	
	static int solution(int n) {
		
		int answer = 0;
		
		for(int i = 0; i <= n; i++) {
			
			if(n == 0) return 0;
			else if(n == 1) return 1;
			
			
			answer = solution(n-2) + solution(n-1);
			
		}
		
		return answer;
		
	}
	
	

}
