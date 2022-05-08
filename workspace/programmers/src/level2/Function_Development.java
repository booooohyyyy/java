package level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Function_Development {
	
	public static void main(String[] args) {
		
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		
		int[] progresses2 = {95, 90, 99, 99, 80, 99};
		int[] speeds2 = {1, 1, 1, 1, 1, 1};
		
		System.out.println(Arrays.toString(solution(progresses, speeds)));
		System.out.println(Arrays.toString(solution(progresses2, speeds2)));
		
		
	}//end main
	
	static public int[] solution(int[] progresses, int[] speeds) {
		
        int[] temp = new int[progresses.length];
        
        for(int i = 0; i < progresses.length; i++) {
   	
        	if((100 - progresses[i]) % speeds[i] == 0){
        		temp[i] = (100 - progresses[i]) / speeds[i];
        	}else {
        		temp[i] = (100 - progresses[i]) / speeds[i] + 1;
        	}
        }
//        System.out.println(Arrays.toString(answer));
        
        List<Integer> list = new LinkedList();
		int cnt = 1;
        for(int i = 0; i < temp.length-1; i++) {
        
        	if(temp[i] < temp[i+1]) {
        		list.add(cnt);
        		cnt = 1;
        	}else {
        		cnt++;
        	}
        	
        	if(i+1 == temp.length -1) {
        		list.add(cnt);
        		
        	}
        }
//        System.out.println(list.toString());
        
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
        
    }

}
