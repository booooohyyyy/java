package day03;

public class MultiForEx01 {
	
	public static void main(String[] args) {
		
		//중첩 반복문
//		for (int i = 1; i <= 9; i++) {
//			
//			for (int j = 1; j <= 9; j++) {
//				
//				System.out.println(i + "-" + j);
//			}
//		}
		
		//구구단을 세로로 출력하는 반복문
		for (int i = 2; i <= 9; i++) { //단수
			for (int j = 1; j <= 9; j++) { //행수
				System.out.printf("%d x %d = %d\n", i,j,(i*j));
			}
			System.out.println("-----------");
		}
		
	}

}
