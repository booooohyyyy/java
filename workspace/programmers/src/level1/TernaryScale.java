package level1;

public class TernaryScale {
	
	public static void main(String[] args) {
		
		System.out.println(solution(45));
		
		
		
	}//end main
	
	static int solution(int n) {
		
		int answer = 0;
		String str = "";
		
		while ( n >=3 ) {
			str += n % 3;
			n /= 3;
		}
		
		str += n;
		answer = Integer.parseInt(str, 3);
		return answer;
		
	}
	
}
