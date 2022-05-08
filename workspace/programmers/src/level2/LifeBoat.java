package level2;

import java.util.Arrays;

public class LifeBoat {
	
	public static void main(String[] args) {
		
		int[] people = {70, 50, 80, 50};
		int limit = 100;
		
		int[] people2 = {70, 80, 50, 100};
		int limit2 = 100;
		
		System.out.println(solution(people, limit));
		System.out.println(solution(people2, limit2));
		
	}//end main
	
	
	static int solution(int[] people, int limit) {
		
        int answer = 1;
        int sum = 0;
        Arrays.sort(people);
        
        for(int i = 0; i < people.length; i++) {
        	
        	sum += people[i];
        	if(sum > limit) {
        		answer++;
        		sum -= people[i];
        		i--;
        		sum = 0;
        	}
        }
        
        
        return answer;
        
    }

}
