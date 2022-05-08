package level2;

import java.util.Arrays;

public class Another_beat {
	
	public static void main(String[] args) {
		
		long[] number = {2, 7};
		
		System.out.println(Arrays.toString(solution(number)));
		
	}//end main
	
	static long[] solution(long[] numbers) {
		
        long[] answer = new long[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
        	
        	if(numbers[i] % 2 == 0) {              //짝수
        		answer[i] = numbers[i] + 1;
        	}else {
        		
        		long temp = numbers[i];
        		long cal = 1;
        		int cnt = 0;
        		
        		while(temp > 0) {
        			if(temp % 2 == 1) {
        				cnt++;
        			}else {
        				break;
        			}
        			temp /= 2;
        		}
        		for(int j = 0; j < cnt-1; j++) {
        			cal *= 2;
        		}
        		
        		answer[i] = numbers[i] + cal;
        		
        	}
        }

        return answer;   
    }
}
