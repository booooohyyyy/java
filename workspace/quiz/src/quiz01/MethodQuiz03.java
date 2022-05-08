package quiz01;

import java.util.Arrays;

public class MethodQuiz03 {
	
	public static void main(String[] args) {
		
		char[] arr = {'다', '나', '가'};
		String s1 = method06(arr);
		System.out.println(s1);
//		System.out.println(method06(arr));
		
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
		int s2 = method07(arr2);
		System.out.println(s2);
//		System.out.println(method07(arr2));
		
		
		String[] arr3 = new String[2];
		arr3 = method08("hello","world");
		System.out.println(Arrays.toString(arr3));
//		System.out.println(Arrays.toString(method08("hello","world")));
		
	
		
	}//end main
	
	static String method06(char[] c) {
		
		String str = "";
		for(int i = 0; i < c.length; i++) {
			str += c[i];
		}
		
		return str;
		
	}
	
	static int method07(int[] a) {
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}
	
	static String[] method08(String s1, String s2 ) {
		
		String[] arr = {s1, s2};
		
		return arr;
	}
	
	

}
