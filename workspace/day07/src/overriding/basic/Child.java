package overriding.basic;

public class Child extends Parent {
	
	void method02() {  //오버라이딩 들어가면 초록세모가 뜸
		System.out.println("자식의 오버라이딩된 2번 메서드 실행");
	}
	
	void method03() {
		System.out.println("자식의 3번 메서드 실행");
	}

}
