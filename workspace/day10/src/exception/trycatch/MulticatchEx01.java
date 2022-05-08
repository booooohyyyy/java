package exception.trycatch;

public class MulticatchEx01 {
	
	public static void main(String[] args) {
		
		/*
		 * main에 값을 전달하는 방법
		 * 
		 * run -< run configuration -> argsments탭
		 */
		
		try {
			
			String data1 = args[0];
			String data2 = args[1];
			
			int num1 = Integer.parseInt(data1);	//문자열을 정수로 변경
			int num2 = Integer.parseInt(data2);
			
			System.out.println("두수의 합: " + (num1+num2));
			
			String str = null;
			str.charAt(0);
			
		} catch (ArrayIndexOutOfBoundsException e) { //다중캐치문을 사용할 때 정확한 예외 종류가 ()안에 들어감
			System.out.println("실행 매개값은 반드시 2개 입력하세요.");
			
		} catch (NumberFormatException e) {
			System.out.println("매개값을 숫자로 입력하세요.");
		} catch (Exception e) {						//부모클래스이기에 모든 실행예외처리 가능
			System.out.println("기타 예외 입니다.");
		}
		
	}

}
