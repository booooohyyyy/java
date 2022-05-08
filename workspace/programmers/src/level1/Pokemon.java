package level1;

import java.util.Arrays;

public class Pokemon {
	
	public static void main(String[] args) {
		
		int[] nums = {3,1,2,3};
		int[] nums2 = {3,3,3,2,2,4};
		int[] nums3 = {3,3,3,2,2,2};
		int[] nums4 = {1,3,3,2,2,2,1,5,3,4,4,6,6,1};
		
		System.out.println(solution(nums));
		System.out.println(solution(nums2));
		System.out.println(solution(nums3));
		System.out.println(solution(nums4));
		
	}//end main

	static int solution(int[] nums) {
		
        int answer = 0;
        
        for(int i = 0; i < nums.length-1; i++) {
        	for(int j = (i+1); j < nums.length; j++) {
        		if(nums[i] == nums[j]) {
        			nums[j] = 0;
        		}
        	}
        }
        
//        System.out.println(Arrays.toString(nums));
        
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] != 0) {
        		answer++;
        	}
        }
        if (answer > nums.length/2) {
        	answer = nums.length/2;
        }
        
        return answer;
        
    }
	
}
