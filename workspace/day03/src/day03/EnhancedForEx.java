package day03;

public class EnhancedForEx {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		//일반 for문
		for (int a = 0; a < arr.length; a++) {
			System.out.print(arr[a]);
		}
		
		System.out.println();
		
		//강화된 for문 *****************************
		for(int a : arr) {
			System.out.print(a);
		}
		
		System.out.println();
		
		System.out.println("---------------");
		
		String[] arr2 = {"월", "화", "수", "목", "금", "금", "금"};
		
		for (String s : arr2) {
			System.out.print(s);
		}
		
		System.out.println();
		
		System.out.println("---------------");
		
		//향상된 for문을 사용해서 합계를 구하고, 평균(실수부분까지)을 출력
		int[] point = {100, 34, 53, 78, 96};
		int sum = 0;
		double avg = 0;
		
		for (int a : point) {
			sum += a;
		}
		
		avg = (double)sum / point.length;
		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
		
	}

}
