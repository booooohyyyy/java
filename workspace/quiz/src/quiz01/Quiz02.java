package quiz01;

public class Quiz02 {
	
	public static void main(String[] args) {
		
		//1. 1~100까지 랜덤정수를 만들고, 짝수 인지 홀수인지 구분하는 삼항 연산식
		
		int result = (int)(Math.random() * 100) + 1;
		String result2 = result % 2 == 0 ? "짝수입니다." : "홀수입니다.";
		
//		System.out.println(result);
		System.out.println(result + "는 " + result2);
		
		
		System.out.println("------------------------------");
		
		//2. -5~5까지의 랜덤정수를 만들고, 절대값을 구하는 삼항 연산식
		
		int result3 = (int)(Math.random() * 11) - 5;
		int result4 = result3 < 0 ? -result3 : result3;
		
//		System.out.println(result3);
		System.out.println(result3 + "의 절대값은: " + result4);
		
		
		System.out.println("------------------------------");
		
		
		//3. 숙제
		//bucket는 바구니에 저장될 수 있는 수량.
		//랜덤한 사과개수가 주어질 때, 필요한 바구니의 개수를 구하세요.
		//ex) 사과 151개 -> 16개, 사과 150개 -> 15개
		
		int bucket = 10;
		int result5 = (int)(Math.random() * 1000) + 1;
		int result6 = result5 % bucket == 0 ? result5 / bucket : (result5 / bucket) + 1;
		
		System.out.println("사과 " + result5 + "개에 필요한 바구니의 개수는 " + result6 +"개 입니다.");
		
		
		
	}
}
 
// (Math.random() * 10) + 1   >> 1 ~ 10
// (Math.random() * 11)       >> 0 ~ 10