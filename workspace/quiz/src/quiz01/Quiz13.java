package quiz01;

import java.util.Scanner;

public class Quiz13 {
	
	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		
//		int i = 1;
//		int sum = 0;
//		
//		while ( i != 0) {
//			System.out.print("정수입력>");
//			int a = scan.nextInt();
//			sum += a;
//			i++;
//			
//			if ( a == 0 ) {
//				i = 0;
//			}	
//		}
//		System.out.println(sum);
//		scan.close();
		
		
		//-----------------------------------//
		
		
		Scanner scan = new Scanner(System.in);
		
		int a = 1;
		int sum = 0;
		
		while ( a != 0 ) {
			System.out.print("정수입력>");
			a = scan.nextInt();
			sum += a;
		}
		System.out.println(sum);
		scan.close();
	}

}
