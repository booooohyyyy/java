package level1;

import java.util.Arrays;

public class InnerProduct {
	
	public static void main(String[] args) {
		
		int ab_len = (int)(Math.random() * 1000) +1;
		int[] a = new int[ab_len];
		int[] b = new int[ab_len];
		
		System.out.println(solution(a,b,ab_len));
		
		
		
		
	}//end main

	
	static int solution(int[] a, int[] b, int ab_len) {
		
		for(int i = 0; i < ab_len; i++) {
			a[i] = (int)(Math.random() * 2001) -1000;
			b[i] = (int)(Math.random() * 2001) -1000;
		}
		
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(b));
		
		int[] ab_sum = new int[ab_len];
		
		for(int i = 0; i < ab_len; i++) {
			ab_sum[i] = a[i] * b[i];
		}
		
//		System.out.println(Arrays.toString(ab_sum));
		
		int sum = 0;
		for(int i = 0; i < ab_len; i++) {
			sum += ab_sum[i];
		}
		return sum;
	}
	
}
