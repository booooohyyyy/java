package quiz01;

import java.util.Scanner;

public class Quiz10 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int result = 0;
		System.out.print("정수1>");
		int num1 = scan.nextInt();
		System.out.print("연산을 선택하세요[+, -, *, /]>");
		String x = scan.next();
		System.out.print("정수2>");
		int num2 = scan.nextInt();
		
		switch(x) {
		case "+":
			result = num1 + num2;
			System.out.println("두 수의 덧셉은 " + result);
			break;
		case "-":
			result = num1 - num2;
			System.out.println("두 수의 뺄셈은 " + result);
			break;
		case "*":
			result = num1 * num2;
			System.out.println("두 수의 곱셈은 " + result);
			break;
		case "/":
			if (num2 == 0) {
				System.out.println("0으로 나눌 수 없음.");
			}else {
				result = num1 / num2;
				System.out.println("두 수의 나눗셈은 " + result);
			}
			break;
		default:
			System.out.println("연산자를 [+, -, *, /]를 입력하세요.");
			break;
		}
		
	}

}
