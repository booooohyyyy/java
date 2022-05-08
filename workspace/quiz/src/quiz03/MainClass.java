package quiz03;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * 현실에서 찾아볼 수 있는 물건 등을 생각해서 클래스로 표현
		 * 멤버변수 2개 이상, 메서드 2개 이상
		 * 설계하고 , 메인에서 사용 
		 */
		
		Room r1 = new Room(14, 1, 30, 10);
		r1.windowType();
		r1.doorType();
		
	}

}
