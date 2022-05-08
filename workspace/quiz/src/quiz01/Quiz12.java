package quiz01;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {

		//*. 200까지 정수중에서 3의 배수이거나 4의 배수인 경우에만 가로로 출력

		int a = 1;

		while ( a <= 200 ) {

			if ( a % 3 == 0 || a % 4 == 0 ) {
				System.out.print(a + " ");
			}

			a++;

		}
		
		System.out.println();        //줄 바꿈
		System.out.println("------------------");


		//*. 100까지 정수중에서 5의 배수의 합계를 구함.

		int b = 1;
		int sum = 0;  //합 변수

		while ( b <= 100 ) {

			if ( b % 5 == 0 ) {
				sum += b;
			}

			b++;
		}

		System.out.println("1~100까지 5의 배수의 합:" + sum);
		System.out.println("------------------");

		//*. 100까지 정수중에 4의 배수이면서 8의 배수가 아닌 수의 개수. (카운팅)

		int c = 1;
		int count = 0;  //개수 변수

		while ( c <= 100 ) {
			if ( c % 4 == 0 && c % 8 != 0 ) {
				count++;  //체크
			}
			
			c++;

		}

		System.out.println("개수: " + count + "개");
		System.out.println("------------------");


		//*. 스캐너를 이용해서 입력받은 정수까지의 약수 출력

		Scanner scan = new Scanner(System.in);

		System.out.print("정수 입력:");
		int d = scan.nextInt();  //약수를 판별할 수
		int f = 1;

		while ( f <= d ) {       //약수

			if ( d % f == 0) {
				System.out.print(f + " ");
			}
			
			f++;

		}
		
		System.out.println();        //줄 바꿈


	}

}
