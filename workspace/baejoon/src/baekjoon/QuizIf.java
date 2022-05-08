package baekjoon;

import java.util.Scanner;

public class QuizIf {
	
	public static void main(String[] args) {
		
		//*. 두 정수 A,B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성 (제한 -10000 <= A,B <=10000)
		//큰 경우 ">", 작은경우"<", 같은 경우 "==" 출력
		
//		//int A = (int)(Math.random() * 20001) - 10000;		//랜덤변수 받아서
//		//int B = (int)(Math.random() * 20001) - 10000;
//		
//		Scanner scan = new Scanner(System.in);				//직접 입력
//		
//		int A = scan.nextInt();
//		int B = scan.nextInt();
//		
//		if ( A > B) {										//대수 비교
//			System.out.println(">");
//		}else if ( A < B ) {
//			System.out.println("<");
//		}else {
//			System.out.println("==");
//		}
		
		
		
		//*. 시험 점수를 입력받아 90 ~ 100점은 A, 80~89점은 B, 70~79점은 C, 60~69점은 D, 나머지는 F 출력
		
//		Scanner scan = new Scanner(System.in);			//점수 입력
//		
//		System.out.print("시험점수: ");
//		int num = scan.nextInt();
//		
//		if( num >= 90 ) {								//등급 매기기 
//			System.out.println("A");
//		}else if( num >= 80 ) {
//			System.out.println("B");
//		}else if( num >= 70 ) {
//			System.out.println("C");
//		}else if( num >= 60 ) {
//			System.out.println("D");
//		}else {
//			System.out.println("F");
//		}
		
		
		
		//* 윤년은 연도가 4의 배수 이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다
		//첫째 줄에 윤년이면 1, 아니면 0을 출력
		
//		Scanner scan = new Scanner(System.in);			//연도 입력
//		
//		System.out.print("연도 입력> ");
//		int year = scan.nextInt();
//		
//		if ( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ) {		//윤달 파악
//			System.out.println("1");
//		}else {
//			System.out.println("0");
//		}
		
		
		
		//*. 좌표로 몇사분면인지 출력하기.
		
//		Scanner scan = new Scanner(System.in); 		//좌표 입력
//		
//		int x = scan.nextInt();						//x좌표
//		int y = scan.nextInt();						//y좌표
//		
//		if (x > 0 && y > 0) {						//사분면 파악
//			System.out.println("1사분면");
//		}else if (x < 0 && y > 0) {
//			System.out.println("2사분면");
//		}else if (x < 0 && y < 0) {
//			System.out.println("3사분면");
//		}else { 
//			System.out.println("4사분면");
//		}
		
		
		
		//*. 시계 알람
		// 일어날 시간 45분전에 알람 맞추기.
		
//		Scanner scan = new Scanner(System.in);		//일어날 시간 입력
//		
//		System.out.print("H> ");					//시간
//		int h = scan.nextInt();
//		System.out.print("M> ");					//분
//		int m = scan.nextInt();
//		
//		if ( m >= 45) {								//알람시간 설정
//			System.out.println("알람 시간: " + h + "시 " + (m-45) + "분");
//		}else {
//			System.out.println("알람 시간: " + (h-1) + "시 " + ((m+60) -45) + "분");
//		}
		
		
		
	}
	
}
