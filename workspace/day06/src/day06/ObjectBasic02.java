package day06;

public class ObjectBasic02 {
	
	public static void main(String[] args) {
		
		Calculator cal1 = new Calculator();
		
		//1번 계산기 사용
		System.out.println(cal1.add(1));
		System.out.println(cal1.add(2));
		System.out.println(cal1.add(3));
		
		Calculator cal2 = new Calculator();
		
		//2번 계산기 사용
		System.out.println(cal2.add(10));
		System.out.println(cal2.add(20));
		System.out.println(cal2.add(30));
	}

}
