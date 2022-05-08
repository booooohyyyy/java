package quiz01;

import java.util.Scanner;

public class MethodQuiz02 {
	
	public static void main(String[] args) {
		
//		//void, 매개변수x 인 print() 메서드로 변경		
//		System.out.println("두 수를 입력하세요");
//		
//		//input() 만들고, 2번 호출
//		Scanner scan = new Scanner(System.in);
//		System.out.print("정수> ");
//		int a = scan.nextInt();
//		System.out.print("정수> ");
//		int b = scan.nextInt();
//		
//		//두 수의 합을 리턴하는 add()
//		int result = a + b;				//두 수의 합
//		
//		//result를 전달 받아서 결과를 출력해주는 show()
//		System.out.println("두 수의 합:" + result);
		
		print();
		
		int num1 = input();
		int num2 = input();
		
		int result = add(num1, num2);
		
		show(result);
		
		
	}//end main
	
	static void print() {
		System.out.println("두 수를 입력하세요");
	}
	
	static int input() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수>");
		int num = scan.nextInt();
		
		return num;
		
	}
	 
	static int add(int num1, int num2) {
		
		return num1 + num2;
	}
	
	static void show(int result) {
		
		System.out.println("두 수의 합:" + result);
	}


}
