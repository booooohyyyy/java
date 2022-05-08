package level2;

public class Expression_Num {
	
	public static void main(String[] args) {
		
		int n = 15;
		
		System.out.println(solution(n));
		
	}//end main
	
	static int solution(int n) {
		
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
        	
        	int sum = 0;
        	
        	for(int j = i; j <= n; j++) {
        		
        		sum += j;
        		
        		if(sum == n) {
        			answer++;
        		}else if(sum > n) {
        			break;
        		}
        		
        	}
        	
        }
        return answer;     
    }

}
