package level1;

public class CollatzConjecture {
	
	public static void main(String[] args) {
		
		int n = 6;
		int n2 = 16;
		int n3 = 626331;
		
		System.out.println(solution(n));
		System.out.println(solution(n2));
		System.out.println(solution(n3));
		
		
		
		
	}//end main
	
	static int solution(int num) {
		
        int answer = 0;
        
        while(num!=1) {
        	if (num % 2 == 0) {
        		num /= 2;
        	}else {
        		num = (num*3)+1;
        	}
        	answer++;
        
        	if (answer == 500) {
        		return -1;
       		
        	}
        }
        
        return answer;
        
    }

}
