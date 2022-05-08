package level2;

import java.util.Arrays;

public class Next_BigNum {
	
	public static void main(String[] args) {
		
		int n = 78;
		int n2 = 15;
		
		System.out.println(solution(n));
		System.out.println(solution(n2));
		
	}//end main
	
	static int solution(int n) {
		
		 String nB = Integer.toBinaryString(n); //n 이진수화.
	     int cnt = Integer.bitCount(n);
	     
	     for(int i = n+1; ; i++){ //조건1.
	    	 
	          String mB = Integer.toBinaryString(i);
	          
	          if(cnt == Integer.bitCount(i)) {  // 조건2  
	        	  return i;
	          }	
	     }    
	}

}
