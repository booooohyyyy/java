package abs.bad;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		//프로그래머가 오버라이딩을 빼먹으면, 잘못된 메서드로 실행될 수 있다.
		Store s = new Store();
		s.apple();
		s.getClass();
		s.orange();
		s.melon();
		
		
	}

}
