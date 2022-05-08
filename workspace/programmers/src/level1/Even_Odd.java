package level1;

public class Even_Odd {

	public static void main(String[] args) {
		
		int num = 3;
		int num2 = 12;
		
		System.out.println(solution(num));
		System.out.println(solution(num2));
		
	}//end main
	
	static String solution(int num) {
		
        String answer = "";
        
        if ( num % 2 == 0) {
        	answer = "짝수";
        }else {
        	answer = "홀수";
        }
        
        return answer;
        
    }
	
}
