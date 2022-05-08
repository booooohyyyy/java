package level2;

import java.util.Arrays;

public class Cut_Arrangement {
	
	public static void main(String[] args) {
		
		int n = 3;
		long left = 2;
		long right = 5;
		
		int n2 = 4;
		long left2 = 7;
		long right2 = 14;
		
		System.out.println(Arrays.toString(solution(n, left, right)));
		System.out.println(Arrays.toString(solution(n2, left2, right2)));
		
	}//end main
	
	static  int[] solution(int n, long left, long right) {
		
        int[] answer = new int[(int)(right-left)+1];
        String temps = "";
        
        for(int i = 0; i < n; i++) {
        	for(int j = 0; j < n; j++) {
        		if(i <= j) {
        			int k = j+1;
        			String temp = Integer.toString(k);
        			temps += temp;
        			
        		}else {
        			int k = i+1;
        			String temp = Integer.toString(k);
        			temps += temp;	
        		}
        	}
        }
        
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = temps.charAt((int)(i+left)) - 48;
        }
        
        return answer;
        
    }

}
