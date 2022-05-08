package day03;

public class MultiForEx03 {
	
	public static void main(String[] args) {
		
		//1~10까지 정수 중에서 해당 수의 모든 약수의 합
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {		//1~10까지반복
			for (int j = 1; j <= i; j++) {	//i의 약수를 구할 for문
				//약수 판별
				if (i % j == 0) {			// j는 i의 약수
					sum += j;
				}		
			}
		}
		System.out.println("약수들의 합:" + sum);
	}

}
