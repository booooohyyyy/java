package static_.init;

public class Computer {
	
	
	/*
	 * 클래스가 호출될 때, 정적 초기화자는 단 한번 호출 된다. 
	 */
	
	public static String company = "LG"; //1번 방법
	public static String model;
	
	public int price;
	
	//정적 초기화자(static변수를 초기화) 2번 방법
	static {
		System.out.println("정적 초기화자 호출");
		model = "gram";
	}
	
	public Computer(int price) {
		System.out.println("생성자 호출");
		this.price = price;
	}

}
