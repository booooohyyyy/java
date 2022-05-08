package quiz01;

import java.util.Scanner;

public class Quiz19 {
	
	public static void main(String[] args) {
		
		//. 가로, 세로 입력받아 그 크기의 사각형 출력
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("가로>");
//		int x = scan.nextInt();
//		System.out.print("세로>");
//		int y = scan.nextInt();
//		
//		for (int i = 1; i <= y; i++) {
//			for (int j = 1; j <= x; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//. 가로, 세로 입력받아 그 크기의 테두리 사각형 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("가로>");
		int x = scan.nextInt();
		System.out.print("가로>");
		int y = scan.nextInt();
		
		for (int i = 1; i <= y; i++) {
			for (int j = 1; j<= x; j++) {
				if ((i == 1 || i == y) || (j == 1 || j == x)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		scan.close();
		
	}

}
