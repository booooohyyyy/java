package day03;

import java.util.Scanner;

public class MultiForEx02 {
	
	public static void main(String[] args) {
		
		//바깥 회전수에 따라 안쪽 반복의 횟수가 달라지는 경우.
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		
//		Scanner scan = new Scanner(System.in);
//		
//		int n = scan.nextInt();
//		
//		for (int i = 1; i <= n; i++ ) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//							
//			}
//			
//			System.out.println();			
//		}		
//		scan.close();
		
		
		/*
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		
//		Scanner scan = new Scanner(System.in);
//		
//		int n = scan.nextInt();
//		
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= (n+1)-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		scan.close();
		
		/*
		 *      *
		 *     **
		 *    ***
		 *   ****
		 *  *****   
		 */
		
		
//		Scanner scan = new Scanner(System.in);
//		
//		int n = scan.nextInt();
//		
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= (n-i); j++) {
//				System.out.print(" ");
//			}
//			
//			for (int j = 1; j <= i ;j++ ) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
//		scan.close();
		
		
		
		/*
		 * *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		 */
		
//		Scanner scan = new Scanner(System.in);
//		
//		int star = scan.nextInt();
//		
//		for (int i = 1; i <= star; i++) {
//			for (int j = 1; j <= (i-1) ;j++ ) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= (star-(i-1)); j++) {
//				System.out.print("*");
//			}
//			
//			
//			System.out.println();
//		}
//		scan.close();
		
		
		/*
		 *     *
		 *    ***
		 *   *****
		 *  *******
		 * ********* 
		 */  
		
//		Scanner scan = new Scanner(System.in);
//		
//		int star2 = scan.nextInt();
//		
//		for (int i = 1; i <= star2; i++) {
//			for (int j = 1; j <= (star2-i); j++) {
//				System.out.print(" ");
//			}for (int k = 1; k <= i+(i-1); k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		scan.close();
		
		Scanner scan = new Scanner(System.in);
		
		int star2 = scan.nextInt();
		
		for (int i = 1; i <= star2; i++) {
			for (int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}for (int k = 1; k <= (star2-i)+((star2-(i-1))); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
		
	}

}
