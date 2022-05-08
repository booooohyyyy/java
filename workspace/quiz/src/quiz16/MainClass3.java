package quiz16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass3 {
	
	public static void main(String[] args) {
		
		/*
		 * 정수 2개를 입력받습니다.
		 * 첫번째 입력받은 수의 랜덤번째 배열값, 두번째 입력받은 랜덤번째 배열 값으로 
		 * 나눈 결과를 출력하면 된다.
		 * 
		 * 예외가 발생될 수 있는 상황을 3개 이상 종류별로 처리해보세요.
		 */
		
		String[] arr = {"0", "1", "2", "3", "4", "5"};
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			
			try {
				
				System.out.print(">");
				int a = scan.nextInt();
				System.out.print(">");
				int b = scan.nextInt();
				
				String data1 = arr[a];
				String data2 = arr[b];
				
				int num1 = Integer.parseInt(data1);
				int num2 = Integer.parseInt(data2);
				
				System.out.println("두 수를 나눈값:" + (num1/num2));
				
				break;
				
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("0~5까지의 숫자를 입력하세요.");
				scan.nextLine(); //엔터값 제거
			} catch (InputMismatchException e) {
				System.out.println("숫자로 입력하세요.");
				scan.nextLine(); //엔터값 제거
			} catch (ArithmeticException e) {
				System.out.println("0으로 나누지 마세요.");
				scan.nextLine(); //엔터값 제거
			} catch (Exception e) {
				System.out.println("기타 예외");
				scan.nextLine(); //엔터값 제거
			}
		}
		scan.close();
		
	}

}
