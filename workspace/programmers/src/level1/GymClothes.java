package level1;

public class GymClothes {
	
	public static void main(String[] args) {
		
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {1, 3, 5};
		
		int n2 = 5;
		int[] lost2 = {2,4};
		int[] reserve2 = {3};
		
		int n3 = 3;
		int[] lost3 = {3};
		int[] reserve3 = {1};
		
		int n4 = 10;
		int[] lost4 = {1,2,3,5,9};
		int[] reserve4 = {2,5,6,7};
		
		System.out.println(solution(n, lost, reserve));
		System.out.println(solution(n2, lost2, reserve2));
		System.out.println(solution(n3, lost3, reserve3));
		System.out.println(solution(n4, lost4, reserve4));
		
		
		
	}//end main
	
	static int solution(int n, int[] lost, int[] reserve) {
		
        int answer = 0;
        answer = n - lost.length;
       
        ex:for (int i = 0; i < lost.length; i++) {
        	for(int j = 0; j < reserve.length; j++) {
        		if((reserve[j] == lost[i]) || (reserve[j]-1 == lost[i]) || (reserve[j]+1 == lost[i])) {
        			answer++;
        			lost[i] = 0;
        			reserve[j] = 0;
        			continue ex;
        		}
        	}
        	
        	
        }
        
        
        return answer;
        
    }

}
