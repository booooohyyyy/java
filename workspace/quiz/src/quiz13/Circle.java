package quiz13;

public class Circle extends Shape {

	/*
	 * 원은 생성자를 통해서 이름과, 반지름의 길이를 받습니다.
	 * getArea()는 원의 넓이를 계산하도록 오버라이딩
	 * 
	 * 반지름의 길이를 저장하는 side변수를 선언.
	 * getter, setter생성
	 * 
	 * 상수 PI선언
	 * 
	 * main에서 객체생성 후 확인
	 */

	private int side;
	public static final double PI = 3.14;
	
	public Circle(String name, int side) {
		super(name);
		this.side = side;
	}

	@Override
	public double getArea() {
		return side*side*PI;
	}

	

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	
	
	
	
	
	
	
}
