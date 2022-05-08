package level2;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class More_Spicy {

	public static void main(String[] args) {
	
		int[] scoville = {1,2,3,9,10,12};
		int k = 7;
		
		System.out.println(solution(scoville, k));
		
	}//end main
	
	static int solution(int[] scoville, int K) {
		
        int answer = 0;
        List<Integer> list = new LinkedList<Integer>();
        
        for(int i = 0; i < scoville.length; i++) {
        	list.add(scoville[i]);
        }
        
        while(true) {
        	
        	list.sort(new Comparator<Integer>() {
        		@Override
        		public int compare(Integer a, Integer b) {			
        			return a.compareTo(b);
        		}
        	});
        	//System.out.println(list.toString());
        	
        	boolean bool = true;
        	for(int i = 0; i < list.size(); i++) {
        		if(list.get(i) < K) bool = false;
        	}
        	
        	if(bool) break;
        	
        	list.add(list.get(0) + (list.get(1)*2));
        	list.remove(0);
        	list.remove(0);
        	
        	answer++;
        	
        	
        }
        
        return answer;
        
    }
}
