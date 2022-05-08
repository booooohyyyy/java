package quiz01;

public class MethodQuiz04 {
	
	public static void main(String[] args) {
		
		/*
		 * 1.java 함수는 매개변수로 숫자를 받습니다.
		 * 매개변수 숫자길이만큼 "자바자바자바.."를 리턴하는 함수를 완성하세요.
		 */
		
		String str = java(5);
		System.out.println(str);
		
		System.out.println("---------------------------");
		
		/*
		 * 자연수 n을 입력받아 n의 약수를 모두 더한 값을 리턴 하는 함수를 완성
		 */
		
		System.out.println(sum(5));
		
		System.out.println("---------------------------");
		
		/*
		 * (숙제)
		 * 1. 1부터 입력 받은 숫자 a 사이에 있는 소수의 개수를 반환하는 함수 primeNum을 완성하세요.
		 * 2. 소수는 1과 자기 자신만으로만 나누어지는 수 (1은 소수가 아님)
		 */
		
		System.out.println("약수의 개수: "+ primeNum(20) + "개");
		
		System.out.println("---------------------------");
		
		/*
		 * 자연수의 자리수 합 구하기
		 * 자연수 n이 매개변수로 주어지면, 각 자리수의 합을 구해서 return하는 메서드를 구하세요.
		 * 
		 * 조건
		 * n은 1억 이하의 자연수 (int)형
		 * n을 자료형을 변환해서 연산하지 말것.
		 */
		
		System.out.println(method1(123456));
		
		
	}//end main
	
	static String java(int a) {
		
		String str = "";
		for (int  i = 1; i <= a; i++) {
			str = i % 2 == 1 ? (str += "자") : (str += "바");
		}	
		return str;
	}

	static int sum(int a) {
		
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				sum += i;
			}
		}
		
		return sum;
	}
	
	static int primeNum(int a) {
		
		int cnt1 = 0;		//약수의 개수를 카운트
		int cnt2 = 0;		//소수의 개수를 카운트
		ex:for (int i = 2; i <= a; i++) {
			cnt1 = 0;	
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt1++;
				}
				if(cnt1 >= 3) continue ex;
				
			}
			if (cnt1 == 2) {
				cnt2++;
			}
		}
		
		
		return cnt2;
	}

	static int method1(int a) {
		int result = 0;
		
		while (true) {
			
			result += (a % 10);
			
			if(a < 10) {
				break;
			}
			
			a /= 10;			
		}		
		return result;
	}
	
}
