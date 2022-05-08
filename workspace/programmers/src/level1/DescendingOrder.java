package level1;

import java.util.Arrays;

public class DescendingOrder {
	
	public static void main(String[] args) {
		
		String s = "Zbcdefg";
		
		System.out.println(solution(s));
		
		
		
	}//end main
	
	static String solution(String s) {
		
        String answer = "";
        char[] temp = s.toCharArray();
        int[] intTemp = new int[temp.length];
        for(int i =0; i<temp.length; i++){
            intTemp[i]=(int)temp[i];
        }
        
        for(int i = 0; i < intTemp.length-1; i++) {
        	for(int j = i; j < intTemp.length; j++) {
        		if(intTemp[i] < intTemp[j]) {
        			int str = intTemp[i];
        			intTemp[i] = intTemp[j];
        			intTemp[j] = str;		
        		}
        	}
        }
        
        for(int i = 0; i < temp.length; i++) {
        	answer += (char)intTemp[i];
        }
        
        
        
        return answer;
        
            
    }


}
