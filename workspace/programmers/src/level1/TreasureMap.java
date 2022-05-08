package level1;

import java.util.Arrays;

public class TreasureMap {
	
	public static void main(String[] args) {
		
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		
		int n2 = 6;
		int[] arr3 = {46, 33, 33 ,22, 31, 50};
		int[] arr4 = {27 ,56, 19, 14, 14, 10};
		
		
		System.out.println(Arrays.toString(solution(n, arr1, arr2)));
		System.out.println(Arrays.toString(solution(n2, arr3, arr4)));
		
	}//end main
	
	static String[] solution(int n, int[] arr1, int[] arr2) {
		
        String[] answer = new String[n];
        String str = "";
        
		for(int i = 0; i < n; i++) {	
			str = Integer.toBinaryString(arr1[i]|arr2[i]);
			
			str = String.format("%"+n+"s", str);
			
			str = str.replaceAll("1", "#");
			str = str.replaceAll("0", " ");
			
			answer[i] = str;
			
		}
			
        return answer;
        
    }

}
