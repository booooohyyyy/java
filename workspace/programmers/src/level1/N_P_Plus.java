package level1;

import java.util.Arrays;

public class N_P_Plus {
	
	public static void main(String[] args) {
		
		int absol_len = 4;
		int sign_len = absol_len;
		
		int[] absolutes = {4,3,8,9};
		boolean[] sign = {true, false, false, true};
		
		System.out.println(solution(absolutes, absol_len, sign, sign_len));
		
		
		
	}//end main
	
	
	static int solution(int[] absolutes, int absol_len, boolean[] sign, int sign_len) {
		
		int answer = 0;
		
		for(int i = 0; i < absol_len; i++) {
			if(sign[i] == true) {
				answer += absolutes[i];
			}else {
				answer -= absolutes[i];
			}
		}
		
		return answer;
	}
	

}
