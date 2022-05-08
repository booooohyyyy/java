package quiz01;

public class Quiz15 {
	
	public static void main(String[] args) {
		
		//Math.radom()을 이용해서 2~9까지 랜덤수를 만들고, 해당 구구단을 for문 출력
		
		int a = (int)(Math.random()*8) +2;
		
		System.out.println("구구단:"+ a +"단");
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n", a,i,(a*i));
		}
		
	}

}
