package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class OlnlyMethodQuiz {
	
	public static void main(String[] args) {
		
		/*
		 * (1) "안녕"을 출력하는 메소드
		 * (2) 문자열을 입력받아 출력하는 메소드
		 * (3) 숫자 3개를 입력받아 더하는 메소드
		 * (4) 홀,짝수 구하는 메소드
		 * (5) 문자열을 5번 출력하는 메소드
		 * (6) 대수비교하는 메소드
		 * (7) 절대값으로 나타내는 메소드
		 */
		//---------------------------------01
//		
//		method01();
//		System.out.println(method02("안녕하세요"));
//		System.out.println(method03(1,2,5));
//		System.out.println(method04(24));
//		method05("가", 5);
//		System.out.println(method06(32,12));
//		System.out.println(method07(-7));

		
		
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
		//위를 메소드로 4개의 메소드로 만들어서 출력
		//---------------------------------02
		
//		print();
//		int num1 = input();
//		int num2 = input();
//		int result = add(num1, num2);
//		show(result);
		
		
		
		/*
		 * 배열을 메소드에 
		 */
		//---------------------------------03
		
//		char[] arr = {'가','나','다'};
//		System.out.println(method08(arr));
//		int[] s = {1,2,3,4,5,6,7,8,9,10};
//		System.out.println(method09(s));
//		System.out.println(Arrays.toString(method10("hello", "world")));
		
		
		/*
		 * 1.java 함수는 매개변수로 숫자를 받습니다.
		 * 매개변수 숫자길이만큼 "자바자바자바.."를 리턴하는 함수를 완성하세요.
		 * 2.자연수 n을 입력받아 n의 약수를 모두 더한 값을 리턴 하는 함수를 완성
		 * 
		 * (숙제)
		 * 3. 1부터 입력 받은 숫자 a 사이에 있는 소수의 개수를 반환하는 함수 primeNum을 완성하세요.
		 * - 소수는 1과 자기 자신만으로만 나누어지는 수 (1은 소수가 아님)
		 */
		//---------------------------------04
		
		String str = java(5);
		System.out.println(str);
		System.out.println(sum(10));
		System.out.println("약수의 개수: "+ primeNum(10) + "개");

		
	}//end main
	
	static void method01() {
		System.out.println("안녕");
	}
	static String method02(String s) {
		return s;
	}
	static double method03(int a, int b, double c) {
		return a+b+c;
	}
	static String method04(int a) {
		if (a % 2 == 0) {
			return "짝수"; 
		} else {
			return "홀수";
		}
	}
	static void method05(String s, int a) {
		for(int i = 1; i <= a; i++) {
			System.out.print(s);
		}
		System.out.println();
	}
	static int method06(int a, int b) {
		if (a > b) {
			return a;
		}else {
			return b;
		}
	}
	static int method07(int a) {
		if(a < 0) {
			return -a;
		}else {
			return a;
		}
	}
	

	static void print() {
		System.out.println("두 수를 입력하세요.");
	}
	static int input() {
		Scanner scan = new Scanner(System.in);
		System.out.print(">");
		int num = scan.nextInt();
		return num;
	}
	static int add(int num1, int num2) {
		int result = 0;
		result = num1 + num2;
		return result;
	}
	static void show(int result) {
		System.out.println("두 수의 합:" + result);
	}
	
	
	static String method08(char[] a) {
		String str = "";		
		for (int i = 0; i < a.length; i++) {
			str += a[i];
		}
		return str;	
	}
	static int method09(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	static String[] method10(String a, String b) {
		String[] arr = {a, b};
		return arr;
	}


	/*
	 * (숙제)
	 * 3. 1부터 입력 받은 숫자 a 사이에 있는 소수의 개수를 반환하는 함수 primeNum을 완성하세요.
	 * - 소수는 1과 자기 자신만으로만 나누어지는 수 (1은 소수가 아님)
	 */
	//---------------------------------04
	
	static String java(int a) {
		String str = "";
		for(int i = 0; i < a; i++) {
			str += "자바";
		}
		return str;
	}
	static int sum(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	static int primeNum(int a) {
		int cnt1 = 0;	//약수의 개수
		int cnt2 = 0;	//소수의 개수
		
		for (int i = 2; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				if(i % j == 0) {
					cnt1++;
				}
				if (cnt1 >= 3) break;
			}
			if(cnt1 == 2) {
				cnt2++;
			}
			cnt1 = 0;
		}
		return cnt2;
	}
	
	
	
	
}
