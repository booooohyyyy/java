package quiz17;

import java.util.Scanner;

public class Calculator {
	
	/*
	 * 1. 정수 2개를 메서드 안에서 입력받습니다.
	 * 2. 입력한 값의 합계를 반환해주면 됩니다.
	 * 3. 조건- 예외가 발생할 수 있는 상황이라면 예외를 직접 생성하고, throws처리하고 메서드 강제종료.
	 *    (hint: try~catch와 throw new Exception()을 함께 사용.)
	 * 4. scan.close()는 적절하게 처리해주세요.
	 */
	

	public int inputTest() throws Exception {
		
		Scanner scan = new Scanner (System.in);
		
		try {
			
			System.out.print(">");
			int a = scan.nextInt();
			System.out.print(">");
			int b = scan.nextInt();
			
			int result = a + b;
			return result;
			
		} catch (Exception e) {
			throw new Exception("입력 도중 예외 발생");
			
		} finally {
			scan.close();
		}
		
	}

}
