package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class QuizFor {
	
	public static void main(String[] args) {
		
//		//*. 구구단
//		//N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오.
//		//첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
//		//출력형식과 같게 N*1부터 N*9까지 출력한다.
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("정수 입력>");
//		int dan = scan.nextInt();
//		
//		for (int i = 1; i <= 9; i++) {
//			System.out.printf("%d x %d = %d\n", dan,i,(dan*i));
//		}
//		scan.close();
		
		
		
//		//*. 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//		//첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//		//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. 
//		//(0 < A, B < 10)
//		
//		Scanner scan = new Scanner(System.in);
//		int t = scan.nextInt();
//		
//		int[] arr = new int[t];
//		
//		for (int i = 1; i <= t; i++) {
//			int x = (int)(Math.random()*11);
//			int y = (int)(Math.random()*11);
//			System.out.println(x + " " + y);
//			
//			arr[i-1] = x+y;
//		}
//		System.out.println(Arrays.toString(arr));
//		scan.close();
		
		
		
//		//*. n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("정수입력>");
//		int n = scan.nextInt();
//		
//		int sum = 0;
//		
//		for (int i = 1; i <= n; i++) {
//			sum += i;
//		}
//		System.out.println("1부터 "+ n + "까지 합은> " + sum);
//		scan.close();
		
		
		
//		//*. 자연수 N이 주어졌을 때, 
//		//1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("정수입력>");
//		int n = scan.nextInt();
//		
//		for (int i = 1; i <= n; i++) {
//			System.out.println(i);
//		}
//		scan.close();
		
		
		
		//*. BufferedReader? BufferedWriter?
		
		
		
//		//자연수 N이 주어졌을 때, 
//		//N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("정수입력>");
//		int n = scan.nextInt();
//		
//		for (int i = n; i >= 1; i--) {
//			System.out.println(i);
//		}
//		scan.close();
		
		
		
//		//*. 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//		//첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//		//각 테스트 케이스는 한 줄로 이루어져 있으며, 
//		//각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//		//각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 
//		//테스트 케이스 번호는 1부터 시작한다.
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("정수입력>");
//		int t = scan.nextInt();
//		
//		for (int i = 1; i <= t; i++) {
//			int x = (int)(Math.random()*9)+1;
//			int y = (int)(Math.random()*9)+1;
//			
//			System.out.println("case #"+ i + ": " + (x+y));
//		}
		
		
		
//		//*. 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//		//첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//		//각 테스트 케이스는 한 줄로 이루어져 있으며, 
//		//각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//		//각 테스트 케이스마다 "Case #x: A + B = C "를 출력한 다음, A+B를 출력한다.
//		//테스트 케이스 번호는 1부터 시작한다.
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("정수입력>");
//		int t = scan.nextInt();
//		
//		for (int i = 1; i <= t; i++) {
//			int a = (int)(Math.random()*9)+1;
//			int b = (int)(Math.random()*9)+1;
//			
//			System.out.printf("Case #%d: %d + %d = %d\n", i,a,b,(a+b));
//		}
		
		
		
//		//*. 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//		
//		Scanner scan = new Scanner(System.in);
//		
//		int n = scan.nextInt();
//		
//		for (int i = 1; i <= n; i++ ) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//							
//			}
//			
//			System.out.println();			
//		}		
//		scan.close();
		
		
		
		//*. 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		//but. 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
		
//		Scanner scan = new Scanner(System.in);
//		
//		int n = scan.nextInt();
//		
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= (n-i); j++) {
//				System.out.print(" ");
//			}
//			
//			for (int j = 1; j <= i ;j++ ) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
//		scan.close();
		
		
		//*. 정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
		//이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int X = scan.nextInt();
		
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = (int)(Math.random()*1000)+1;
			if (arr[i] < X) {
				System.out.print(arr[i] + " ");
				
			}
		}
		
	}

}
