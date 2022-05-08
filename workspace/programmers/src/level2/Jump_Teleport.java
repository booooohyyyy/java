package level2;

public class Jump_Teleport {
	
	public static void main(String[] args) {
		
		int n = 5;
		int n2 = 6;
		int n3 = 5000;
		
		System.out.println(solution(n));
		System.out.println(solution(n2));
		System.out.println(solution(n3));
		
		
	}//end main
	
	static int solution(int n) {
		
        int answer = 0;
        boolean bool = true;
        
        while(bool) {
        	
        	if(n % 2 == 0) {
        		n /= 2;
        	}else {
        		n--;
        		answer++;
        	}
        	
        	if(n == 0) break;
        	
        }

        return answer;
        
    }

}
