package level1;

public class Find_remainder1 {
	
	public static void main(String[] args) {
		
		int n = 10;
		int n2 = 12;
		
		System.out.println(solution(n));
		System.out.println(solution(n2));
		
	}//end main
	
	static int solution(int n) {
		
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
        	if(n % i == 1) {
        		answer += i;
        		break;
        	}
        }
        
        return answer;
        
    }
	
}
