package level1;

public class Subaksubaksubak {
	
	public static void main(String[] args) {
		
		int n = 3;
		int n2 = 4;
		
		System.out.println(solution(n));
		System.out.println(solution(n2));
		
	}//end main
	
	static String solution(int n) {
		
        String answer = "";
        
        for(int i = 1; i <= n; i++) {
        	if(i % 2 == 0 ) {
        		answer += "박";
        	}else {
        		answer += "수";
        	}
        }
        
        
        return answer;
        
    }
	
	

}
