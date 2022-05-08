package level2;

import java.util.Arrays;

public class Repeat_BinaryChanges {
	
	public static void main(String[] args) {
		
		String s = "110010101001";
		String s2 = "01110";
		String s3 = "1111111";
		
		System.out.println(Arrays.toString(solution(s)));
		System.out.println(Arrays.toString(solution(s2)));
		System.out.println(Arrays.toString(solution(s3)));
		
				
		
		
	}//end main
	
	
	static int[] solution(String s) {
		
        int[] answer = new int[2];
        int cnt1 = 0;
        int cnt2 = 0;
        boolean bool = true;
        
        while(bool) {
        	
        	for(int i = 0; i < s.length(); i++) {
        		char ch = s.charAt(i);
        		if (ch == '0') {
        			cnt2++;
        		}
        	}
        	
        	s = s.replace("0", "");
        	
        	int s_leng = s.length();
        	s = Integer.toBinaryString(s_leng);
        	
        	cnt1++;
        	
        	if(s.length() == 1) {      		
        		bool = false;
        	}
        }
        
        answer[0] = cnt1;
        answer[1] = cnt2;
        
        return answer;
        
    }

}
