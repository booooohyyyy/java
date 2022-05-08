package poly.basic02;

public class MainClass {
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.method01();
		p.method02();
		
		Child c = new Child();
		c.method01();	//상속받은 메서드
		c.method02();	//override된 메서드
		c.method03();
		
		System.out.println("-------다형성-------");
		Parent p2 = c;	//Parent p2 = new Child();
//		System.out.println(p2);			//주소
//		System.out.println(c);
//		System.out.println(p2 == c);	//같음
		p2.method01();
		p2.method02();	//override된 메서드
		
		System.out.println("------클래스 캐스팅------");
		//다형성이 일어나지 않은 객체를 대상으로 캐스팅을 실행하면 에러가 발생
		Child cc = (Child)p2;
		cc.method01();
		cc.method02();
		cc.method03();
		
		//캐스팅 에러
//		Child ccc = (Child)new Object();
	}
	
	

}
