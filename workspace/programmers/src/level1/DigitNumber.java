package level1;

public class DigitNumber {
	
	public static void main(String[] args) {
		
		int a = 123;
		int b = 987;
		
		System.out.println(solution(a));
		System.out.println(solution(b));
		
	}//end main
	
	static int solution(int n) {
        int answer = 0;

        while(true) {
        	
        	answer += (n % 10);
        	
        	if(n < 10) break;
        	
        	n /= 10;
        	
        	
        }

        return answer;
	}

}
