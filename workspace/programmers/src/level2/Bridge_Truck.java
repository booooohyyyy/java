package level2;

import java.util.LinkedList;
import java.util.Queue;

public class Bridge_Truck {
	
	public static void main(String[] args) {
		
		int b_l = 2;
		int weight = 10;
		int[] t_w = {7,4,5,6};
		
		int b_l2 = 100;
		int weight2 = 100;
		int[] t_w2 = {10};
		
		int b_l3 = 100;
		int weight3 = 100;
		int[] t_w3 = {10,10,10,10,10,10,10,10,10,10};
		
		System.out.println(solution(b_l, weight, t_w));
		System.out.println(solution(b_l2, weight2, t_w2));
		System.out.println(solution(b_l3, weight3, t_w3));
		
		
	}//end main
	
	static int solution(int bridge_length, int weight, int[] truck_weights) {
		
        int answer = 0;
        
        Queue<Integer> q = new LinkedList<>();
        
        int hap = 0;
        for(int w : truck_weights) {
        	
        	while (true) {
        		
        		if(q.isEmpty()) {		//큐가 비어있을 때
        			q.offer(w);
        			hap += w;
        			answer++;
        			break;
        		}else if (q.size() == bridge_length) { 	//다리에 차가 찼을 때
        			hap -= q.poll();
        		}else {
        			if(hap + w > weight) {     //무게가 초과 됐을 때
        				q.offer(0);
        				answer++;
        			}else
        				q.offer(w);
        				hap += w;
        				answer++;
        				break;
        		}
        		
        	}

        }
        
        return answer + bridge_length;
        
    }

}
