package quiz01;

public class MethodQuiz01 {
	
	public static void main(String[] args) {
		
		method1();
		
		System.out.println(method2("가"));
		
		System.out.println(method3(1,3,5));
		
		System.out.println(method4(20));
		
		method5("가", 5);
		
		System.out.println(maxNum(3, 9));
		
		System.out.println(abs(-21));
		
	}//end main
	
	
	static void method1() {
		System.out.println("안녕");
	}

	static String method2(String a) {
		return a;
	}
	
	static double method3(int a, int b, double c) {
		return a+b+c;
	}
	
	static String method4(int a) {
		
		if (a % 2 == 0) {
			return "짝수";
		}else {
			return "홀수";
		}
		
	}
	
	static void method5(String a, int b) {
		for (int i = 1; i <= b; i++) {
			System.out.print(a);
		}
		System.out.println();
	}
	
	static int maxNum(int a, int b) {
		if (a > b) {
			return a;
		}else {
			return b;
		}
		//return a > b ? a : b;
	}
	
	static int abs(int a) {
		if (a >= 0) {
			return a;
		}else {
			return -a;
		}
		
	}
	
	
}
