package level1;

import java.util.Arrays;

public class SosuMake {
	
	public static void main(String[] args) {
		
		int num = (int)(Math.random() * 48) +3;
		int[] nums = new int[num];
		System.out.println(solution(nums) + "개");
		
		
		
	}//end main
	
	
	static int solution(int[] nums) {
		
		boolean bool;
		
		for(int i = 0; i < nums.length; i++) {
			
			while(true) {
				nums[i] = (int)(Math.random() * 1000) +1;
				bool = false;
				
				for (int j = 0; j <= i; j++) {
					if(nums[i] == nums[j]) {
						bool = true;
						break;
					}
				}
				if(!bool) {
					break;
				}			
			}	
		}
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		int sum = 0;
		int cnt1 = 0; //약수의 개수
		int cnt2 = 0; //소수의 개수
		
		for (int i = 0; i < nums.length-2; i++) {
			for(int j = i+1; j < nums.length-1; j++) {
				for (int k = j+1; k < nums.length; k++) {
					sum = 0;
					sum = nums[i] + nums[j] + nums[k];
					for (int m = 1; m <= sum; m++) {
						if (sum % m == 0) {
							cnt1++;
						}
						if (cnt1 >= 3) break;
					}
					if(cnt1 == 2) {
						cnt2++;
					}
					cnt1 = 0;
				}
			}
		}
		return cnt2;
	}

}
