package day03;

public class WhileEx01 {
	
	public static void main(String[] args) {
		
		int a = 1;  // 제어변수 : 반복문의 횟수를 제어할 변수
		int sum = 0; // 누적할 합계변수는 밖에 선언
		
		while(a <= 10) {
			
			sum = sum + a;
			//sum += a;
			a++;
			
		}
		System.out.println("합: " + sum);
		
	}

}
