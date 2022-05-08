package quiz13;

public class Rect extends Shape {

	/*
	 * 사각형은 생성자를 통해서 이름과, 변의 길이를 받습니다.
	 * getArea()는 사각형의 넓이를 계산하도록 오버라이딩
	 * 
	 * 변의 길이를 저장하는 side변수를 선언.
	 * getter, setter생성
	 * 
	 * main에서 객체생성 후 확인
	 */
	
	private int side;

	public Rect(String name, int side) {
		super(name);
		this.side = side;
	}


	@Override
	public double getArea() {
		return side*side;
	}



	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	
	
	
	


}
