package exception.throw_;

public class ThrowEx01 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. throw키워드를 사용해서 예외를 만들면, 즉시 예외가 발생된다.
		 * 2. 예외가 발생되면, 코드는 즉시 중단되고 예외를 처리할 수 있는 catch, throws 문으로 즉시 이동한다.
		 * 
		 */
		
		try {
			System.out.println(calc(10));
			System.out.println(calc(-5));			
		} catch (Exception e) {
//			System.out.println("0보다 큰 수를 입력!");
//			System.out.println(e.getMessage());
			
			e.printStackTrace(); //예외의 원인을 출력하는 메서드
		}
		System.out.println("프로그램 정상 종료");
	}
	
	
	//반환이 있는 메서드 안에서 잘못된 값이 전달되면, 메서드를 강제종료하고 싶을 때 throw키워드를 사용할 수 있다.
	public static int calc(int n) throws Exception {
		
		if(n < 0) {
			throw new Exception("0보다 큰 수를 입력!");
		}
		
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
}
