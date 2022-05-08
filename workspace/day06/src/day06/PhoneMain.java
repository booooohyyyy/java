package day06;

public class PhoneMain {
	
	public static void main(String[] args) {
		
		Phone p1 = new Phone();
		p1.info();
		
		Phone p2 = new Phone("검정");
		p2.info();
		
		Phone p3 = new Phone("빨강", 499999);
		p3.info();
		
		Phone p4 = new Phone("아이폰", 1000000, "하얀색");
		p4.info();
	}

}
