package level1;

public class Space_Sum {
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = 5;
		
		int a2 = 3;
		int b2 = 3;
		
		int a3 = 3;
		int b3 = 5;
		
		System.out.println(solution(a,b));
		System.out.println(solution(a2,b2));
		System.out.println(solution(a3,b3));
		
		
		
		
	}//end main
	
	static long solution(int a, int b) {
		
        long answer = 0;
        int max = 0;
        int min = 0;
        
        if(a > b) {
        	max = a;
        	min = b;
        }else {
        	max = b;
        	min = a;
        }
        
        for(int i = min; i <= max; i++) {
        	if(min == max) {
        		return min;
        	}else {
        		answer += i;
        	}
        }
       
        return answer;
        
    }

}
