package day03;

public class ForEx01 {
	
	public static void main(String[] args) {
		
		//1~10까지 합 - for
		
		int hap = 0;
		
		for(int a = 1; a <= 10; a++) {
			hap += a;
		}
		System.out.println("1~10까지 합:" + hap);
		
		
		System.out.println("----------------------");
		
		
		//10~1로 돌아가는 for
		
		for (int b = 10; b >= 1; b--) {
			System.out.print(b+ " ");
		}
		
	}

}
