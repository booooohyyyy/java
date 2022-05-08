package level1;

import java.util.Arrays;

public class Lotto {
	
	public static void main(String[] args) {
		
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		
		int[] lottos2 = {0, 0, 0, 0, 0, 0};
		int[] win_nums2 = {38, 19, 20, 40, 15, 25};
		
		int[] lottos3 = {45, 4, 35, 20, 3, 9};
		int[] win_nums3 = {20, 9, 3, 45, 4, 35};
		
		System.out.println(Arrays.toString(solution(lottos, win_nums)));
		System.out.println(Arrays.toString(solution(lottos2, win_nums2)));
		System.out.println(Arrays.toString(solution(lottos3, win_nums3)));
		
	}//end main
	
	
	static int[] solution(int[] lottos, int[] win_nums) {
	
        int[] answer = {};
        
        int cnt = 0;  //로또 맞춘 개수 카운트
        
        for(int i = 0; i < lottos.length; i++) {
        	for(int j = 0; j < win_nums.length; j++) {
        		if(lottos[i] == win_nums[j]) {
        			cnt++;
        		}
        	}
        }
//        System.out.println(cnt);
        
        int cnt2 = 0; //모르는 로또 번호 개수
        
        for(int i = 0; i< lottos.length; i++) {
        	if(lottos[i] == 0) {
        		cnt2++;
        	}
        }
//        System.out.println(cnt2);
        
        answer = new int[2];
        answer[0] = (6-cnt+1) - cnt2;
        answer[1] = (6-cnt+1);
        
        return answer;
        
    }

}//6-1 5-2 4-3 3-4 2-5 1-6 0-7
