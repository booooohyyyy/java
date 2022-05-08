package level1;

import java.util.Scanner;

public class PlusMinus {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
//		int a = (int)(Math.random() * 1000) +1;
//		int b = (int)(Math.random() * 1000) +1;
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int left = 0;
		int right = 0;
		int cnt = 0;			//약수의 개수를 세는 변수
		int result = 0;			//약수를 더하거나 빼는 값을 넣는 변수
		
		if ( a < b ) { 
			left = a;
			right = b;
		}else {
			left = b;
			right = a;
		}
		
		for (int i = left; i <= right; i++) {
			for (int j = 1; j <= i; j++) {
				if(i % j == 0) {
					cnt++;
				}
			}
			if ( cnt % 2 == 0) {
				result += i;
			}else {
				result -= i;
			}
			cnt = 0;						//cnt 초기화
		}
		
		System.out.println(left + "~" + right + "에서의 결과값은 "+ result);
		
		scan.close();
	}

}
