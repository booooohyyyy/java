package day03;

public class WhileEx04 {
	
	public static void main(String[] args) {
		
		//배열과 반복
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		int a = 0;
		int sum = 0;
		
		while (a < arr.length /*10*/) {
			System.out.println(arr[a]);
			sum += arr[a];
			a++;
		}
		System.out.println("합: " + sum);
	}

}
