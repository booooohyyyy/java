package level1;

public class Avg {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		int[] arr2 = {5,5};
		
		System.out.println(solution(arr));
		System.out.println(solution(arr2));
		
	}//end main
	
	static double solution(int[] arr) {
		
        double answer = 0;
        
        for(int i = 0; i < arr.length; i++) {
        	answer += arr[i];
        }
        
        answer = answer / arr.length;
        
        return answer;
        
    }
	

}
