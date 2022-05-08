package level1;

public class Sqrt {
	
	public static void main(String[] args) {
		
		long n = 121L;
		System.out.println(solution(n));
		
		long n2 = 3L;
		System.out.println(solution(n2));
		
		
	}//end main
	
	static long solution(long n) {
		
        long answer = 0;
        long sqrt = (long)Math.sqrt(n);
        
        if(n == Math.pow(sqrt, 2)) {
        	sqrt++;
        	answer = (long)Math.pow(sqrt, 2);
        }else {
        	answer = -1;
        }
        
        return answer;
        
    }

}
