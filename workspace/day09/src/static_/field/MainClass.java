package static_.field;

public class MainClass {
	
	public static void main(String[] args) {
		
		Count c1 = new Count();
		c1.a++;
		c1.b++;
		
		System.out.println("일반 변수:" + c1.a);
		System.out.println("정적 변수:" + c1.b);
		
		System.out.println("-------------");
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		
		System.out.println("일반 변수:" + c2.a);
		System.out.println("정적 변수:" + c2.b);
		
		System.out.println("-------------");
		
		Count c3 = new Count();
		c3.a++;
		c3.b++; //count.b++;
		
		System.out.println("일반 변수:" + c3.a);
		System.out.println("정적 변수:" + c3.b);
		
		/*
		 * static은 클래스 밖에 1개 생성됌
		 * 객체 생성 없이 '클래스이름.변수명'으로 바로 사용할 수 있다.
		 */
	}
	

}
