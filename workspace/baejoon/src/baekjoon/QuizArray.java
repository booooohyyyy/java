package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class QuizArray {
	
	public static void main(String[] args) {
		
	
//		//*. 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 10)이 주어진다.
//		//둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 정수는 -100~100
//		//첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
//
//		int N = (int)(Math.random() * 10) +1;	//정수의 개수 'N'
//		int i = 1;
//		
//		int arr[] = new int[N];
//		
//		while ( i <= N ) {						//N번 반복할 때 배열안에 하나 씩 넣기
//			int a = (int)(Math.random()*100)+1;
//			System.out.print(a + " ");
//			arr[i-1] = a;
//			i++;
//		}
//		System.out.println();
//		
//		Arrays.sort(arr);								//오름차순 정리
//		System.out.println(arr[0] + " " + arr[N-1]);	//첫 번째 = 최소값, 마지막 번째 = 최대 값
		
		
		
		//*. 9개의 서로 다른 자연수가 주어질 때, 
		//이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
		//첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
		
//		int[] arr = new int[9];
//		int i = 1;							//제어변수
//		
//		while( i <= 9 ) {						//배열안에 상수 넣기
//			arr[i-1] = (int)(Math.random()*100);
//			System.out.println(arr[i-1]);
//			i++;
//		}
//		
//		System.out.println("--------------------------");		// 최대값과 번째 구하기
//		
//		if (arr[0] > arr[1] && arr[0] > arr[2] && arr[0] > arr[3] && arr[0] > arr[4] && arr[0] > arr[5] && arr[0] > arr[6] && arr[0] > arr[7] && arr[0] > arr[8]) {
//			System.out.println(arr[0]);
//			System.out.println(1);	
//		}if (arr[1] > arr[0] && arr[1] > arr[2] && arr[1] > arr[3] && arr[1] > arr[4] && arr[1] > arr[5] && arr[1] > arr[6] && arr[1] > arr[7] && arr[1] > arr[8]) {
//			System.out.println(arr[1]);
//			System.out.println(2);	
//		}if (arr[2] > arr[0] && arr[2] > arr[1] && arr[2] > arr[3] && arr[2] > arr[4] && arr[2] > arr[5] && arr[2] > arr[6] && arr[2] > arr[7] && arr[2] > arr[8]) {
//			System.out.println(arr[2]);
//			System.out.println(3);	
//		}if (arr[3] > arr[0] && arr[3] > arr[1] && arr[3] > arr[2] && arr[3] > arr[4] && arr[3] > arr[5] && arr[3] > arr[6] && arr[3] > arr[7] && arr[3] > arr[8]) {
//			System.out.println(arr[3]);
//			System.out.println(4);	
//		}if (arr[4] > arr[0] && arr[4] > arr[1] && arr[4] > arr[2] && arr[4] > arr[3] && arr[4] > arr[5] && arr[4] > arr[6] && arr[4] > arr[7] && arr[4] > arr[8]) {
//			System.out.println(arr[4]);
//			System.out.println(5);	
//		}if (arr[5] > arr[0] && arr[5] > arr[1] && arr[5] > arr[2] && arr[5] > arr[3] && arr[5] > arr[4] && arr[5] > arr[6] && arr[5] > arr[7] && arr[5] > arr[8]) {
//			System.out.println(arr[5]);
//			System.out.println(6);	
//		}if (arr[6] > arr[0] && arr[6] > arr[1] && arr[6] > arr[2] && arr[6] > arr[3] && arr[6] > arr[4] && arr[6] > arr[5] && arr[6] > arr[7] && arr[6] > arr[8]) {
//			System.out.println(arr[6]);
//			System.out.println(7);	
//		}if (arr[7] > arr[0] && arr[7] > arr[1] && arr[7] > arr[2] && arr[7] > arr[3] && arr[7] > arr[4] && arr[7] > arr[5] && arr[7] > arr[6] && arr[7] > arr[8]) {
//			System.out.println(arr[7]);
//			System.out.println(8);	
//		}if (arr[8] > arr[0] && arr[8] > arr[1] && arr[8] > arr[2] && arr[8] > arr[3] && arr[8] > arr[4] && arr[8] > arr[5] && arr[8] > arr[6] && arr[8] > arr[7]) {
//			System.out.println(arr[8]);
//			System.out.println(9);	
//		}
		
		
		
		//*. 세 개의 자연수 A, B, C가 주어질 때
		//A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
		
		
		
		//*. 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 
		//예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
		//수 5개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 
		//배열에 넣어서 세로로 출력
		
//		int i = 1;
//		int[] arr = new int[10];
//		int[] arr2 = new int[10];
//		
//		while ( i <= 5) {
//			int x = (int)(Math.random()*1001);
//			arr[i-1] = x;
//			System.out.println(x);
//			i++;
//		}
//		
//		System.out.println("------------------");
//		
//		int n = 1;
//		
//		while ( n <= 5 ) {
//			int y = arr[n-1] % 42;
//			arr2[n-1] = y;
//			System.out.println(y);
//			n++;
//		}
		
		
		
		//*. 세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 
		//일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 
		//그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
		//예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
		//세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
		
//		Scanner scan = new Scanner(System.in);
//		
//		int num = scan.nextInt();
//		System.out.println("-----------");
//		int i = 1;								//제어 변수
//		int max = 0;                            //최대값 넣을 변수
//		int[] arr = new int[num];
//		int[] arr2 = new int[num];
//		
//		while (i <= num) {
//			arr[i-1] = scan.nextInt();
//			i++;
//		}
//		
//		Arrays.sort(arr);						//오름차순
//		max = arr[num-1];						//최대값
//
//		double jum = 0;
//		int n = 1;
//		
//		while (n <= num) {
//			//System.out.println(arr[n-1]);
//			jum += arr2[n-1] = (int) (((double)arr[n-1]/(double)max)*100);
//			//System.out.println(arr2[n-1]);
//			n++;
//		}
//		
//		System.out.println(jum / num);
//		scan.close();
		
		
		
		//*. "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다.   ***************
		// O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 
		//"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
		//첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 
		//길이가 0보다 크고 20보다 작거나 같은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.
		
//		Scanner scan = new Scanner(System.in);
//		
//		String[] arr = new String[scan.nextInt()];
//		
//		int i = 1;
//		
//		while ( i <= arr.length ) { 
//			int cnt = 0;
//			int jum = 0;
//			
//			int j = 1;
//			while (j <= arr[i].length()) {
//				if ( arr[i-1] == "O") {
//					cnt++;
//				}else {
//					cnt = 0;
//				}
//				j++;
//			}
//			
//			jum += cnt;
//			i++;	
//			System.out.println(jum);
//		}
//		
//		scan.close();

		
		//첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
		//둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 
		//이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
		//각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
		
//		Scanner scan = new Scanner(System.in);
//		
//		int n = scan.nextInt();
//		
//		int i = 1;
//		int j = 1;
//		int result = 0;
//		
//		int[] arr = new int[n];
//		
//		while ( i <= n ) {
//			int a = (int)(Math.random()*100) +1;
//			System.out.print(a + " ");
//			arr[i-1] = a; 
//			result += arr[i-1];
//			i++;
//		}
//		
//		double avg = result / n;
//		
//		double b = 0;
//		int cnt = 0;
//		
//		while ( j <= n ) {
//
//			if (arr[j-1] >= avg) {
//				cnt++;
//			}
//			j++;
//		}
//		
//		b = ((double)cnt / (double)n) * 100;
//		System.out.println(b);
//		
//		scan.close();

	}
	
}
