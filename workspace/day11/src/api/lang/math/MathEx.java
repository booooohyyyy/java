package api.lang.math;

public class MathEx {
	
	public static void main(String[] args) {
		
		//Math클래스는 수학관련 기능 포함, static메서드로 구현
		double d = Math.random();
		System.out.println(d);
		
		int i = Math.abs(-3);
		System.out.println(i);
		
		double result = Math.ceil(3.14);
		System.out.println("올림값:" + result);
		
		double result2 = Math.floor(3.14);
		System.out.println("내림값:" + result2);
		
		long result3 = Math.max(100L, 30L);
		System.out.println(result3);
		
		double result4 = Math.round(3.5);
		System.out.println(result4);
		
		System.out.println(page(13));
		System.out.println(page(23));
	}//end main
	
	
	/*
	 * math.ceil()을 사용해서 1~10이 전달되면 1을 반환하는 page메서드를 생성
	 */
	
	public static int page(int a) {
		return (int)(Math.ceil(a / 10.0));
	}

}
