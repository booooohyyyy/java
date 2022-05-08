package level2;

public class Normal_Square {
	
	public static void main(String[] args) {
		
		int w = 8;
		int h = 12;
		
		System.out.println(solution(w, h));
		
		
	}//end main
	
	static long solution(int w, int h) {
		
		long answer = 0;
		
		for(int i=0; i<w; i++) {
			
	        answer += h*i/w ;
	        
	    }
	        
	    return answer * 2;
        
    }

}
