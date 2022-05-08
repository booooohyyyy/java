package quiz01;

public class Quiz18 {
	
	public static void main(String[] args) {
		
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 1; j <= 3; j++) {
//				System.out.print(j + " x " + i + " = " + (i*j) + "\t");
//				if (j % 3 == 0 ) {			//3번째 마다 끊기
//					System.out.println();
//				}
//			}
//		}
//		
//		System.out.println(); 				//3단마다 한줄 띄우기
//		
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 4; j <= 6; j++) {
//				System.out.print(j + " x " + i + " = " + (i*j) + "\t");
//				if (j % 3 == 0 ) {			//3번째 마다 끊기
//					System.out.println();
//				}
//			}
//		}	
//		
//		System.out.println();				//3단마다 한줄 띄우기
//		
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 7; j <= 9; j++) {
//				System.out.print(j + " x " + i + " = " + (i*j) + "\t");
//				if (j % 3 == 0 ) {			//3번째 마다 끊기
//					System.out.println();
//				}
//			}
//		}
		
		
		//. 강사님 답안
		for (int i = 1; i <= 9; i+=3) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\t", i,j,(i*j));
				System.out.printf("%d x %d = %d\t", (i+1),j,((i+1)*j));
				System.out.printf("%d x %d = %d\t", (i+2),j,((i+2)*j));
				
				System.out.println();
			}
			System.out.println();
		}
	}
}
