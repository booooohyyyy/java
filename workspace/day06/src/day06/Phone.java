package day06;

public class Phone {
	
	String model;
	int price;
	String color;
	
	//생성자: 생성자는 클래스 이름과 동일합니다. 반환유형은 없습니다.
	//주된 목적은 값의 초기화
	Phone() {
		System.out.println("생성자 호출");
		
		model = "삼성";
		price = 1999999;
		color = "회색";
	}
	
	
	//생성자는 중복해서 여러개 생성할 수 있다. (생성자 오버로딩)
	//단, 매개변수의 종류 or 개수가 달라야 한다.
	//매개변수의 순서는 상관 없음
	Phone(String color2) {
		model = "애플";
		price = 2180000;
		color = color2;
		
	}
	
	Phone(String color2, int price2){
		model = "샤오미";
		price = price2;
		color = color2;
	}
	
	Phone(String model2, int price2, String color2){
		model = model2;
		price = price2;
		color = color2;
	}
	
	void info() {
		System.out.println("====폰의 정보====");
		System.out.println("모델: " + model);
		System.out.println("가격: " + price);
		System.out.println("색상: " + color);
	}

}
