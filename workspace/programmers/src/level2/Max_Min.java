package level2;

import java.util.Arrays;

public class Max_Min {
	
	public static void main(String[] args) {
		
		String s = "1 2 3 4";
		String s2 = "-1 -2 -3 -4";
		String s3 = "-1 -1";
		
		System.out.println(solution(s));
		System.out.println(solution(s2));
		System.out.println(solution(s3));

		
	}//end main
	
	static String solution(String s) {
		
        String answer = "";
        String[] arr = s.split(" ");
        int[] intArr = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
        	intArr[i] = Integer.parseInt(arr[i]);
        }
        
        Arrays.sort(intArr);
                
        return answer + intArr[0] + " " + intArr[intArr.length-1];
        
    }

}
