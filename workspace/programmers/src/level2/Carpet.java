package level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Carpet {
	
	public static void main(String[] args) {
		
		int brown = 10;
		int yellow = 2;
		
		int brown2 = 8;
		int yellow2 = 1;
		
		int brown3 = 24;
		int yellow3 = 24;
		
		System.out.println(Arrays.toString(solution(brown, yellow)));
		System.out.println(Arrays.toString(solution(brown2, yellow2)));
		System.out.println(Arrays.toString(solution(brown3, yellow3)));
		
	}//end main
	
	static int[] solution(int brown, int yellow) {
		
        int[] answer = new int[2];
        int hap = brown + yellow;
        
        List<Integer> list = new LinkedList<>();
        
        for(int i = 1; i <= hap; i++) {
        	if(hap % i == 0) {
        		list.add(i);
        	}
        }
    
        
        if(list.size() % 2 == 0) {
        	answer[0] = list.get(list.size()/2);
        	answer[1] = list.get(list.size()/2 -1);
        }else {
        	answer[0] = list.get((int)list.size()/2);
        	answer[1] = list.get((int)list.size()/2);
        }
        
        
        return answer;

    }

}
