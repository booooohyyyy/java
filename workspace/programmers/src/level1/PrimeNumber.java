package level1;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int n = 10;
		int n2 = 5;
		
		System.out.println(solution(n));
		System.out.println(solution(n2));
		
	}//end main
	
	static int solution(int n) {
		
        int answer = 0;
        int cnt = 0; //약수의 개수
        
        for (int i = 2; i <= n; i++) {
        	for(int j = 1; j <= n; j++) {
        		if( i % j == 0) {
        			cnt++;
        		}
        		if( cnt > 3 ) {
        			break;
        		}
        	}
        	if(cnt == 2) {
    			answer++;        		
    		}
    		cnt = 0;
        }
      
        return answer;
        
    } 

}
