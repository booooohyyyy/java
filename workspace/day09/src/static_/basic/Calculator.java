package static_.basic;

public class Calculator {
	
	/*
	 * 계산기 마다 원주율은 동일한 값을 가지기 때문에
	 * static 변수를 선언하는게 좋다. 
	 */
	
	private String color;
	private int result;
	
	public static double pi = 3.14;
	
	/*
	 * 
	 */
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	/*
	 * 범용성 있게 사용할 메서드는 static키워드를 붙이는 편이 좋다.
	 */
	
	public static double circle(int r) {
		return r*r*pi;
	}
	
	public static double rect(int side) {
		return side * side;
	}

}
