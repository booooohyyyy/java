package poly.basic;

/*
 * 하나의 클래스 파일에 여러 클래스 선언이 가능합니다.
 * 단, 파일명과 동일한 클래스가 존재해야 하고, 해당 클래스만 public이 되어야 합니다.
 */

class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class Basic {
	
	/*
	 * 다형성 - 자식 객체가 부모 타입을 가질 수 있는 성질
	 */
	
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	//다형성 - 상속관계가 없다면 다형성은 적용할 수 없음.
	//Object는 최상위이므로 모든 형태가 다 들어감. but 본래 기능을 잃어버림
	A a2 = b;			//B를 A로 형변환
	A a3 = new B();
	A a4 = new C();
	A a5 = new D();
	A a6 = new E();
	B b2 = new D();
	C c2 = new E();
	
//	B b3 = new E();		//상속관계 x
	
	//기본타입 멤버변수로 생각
	int x = 1;
	double y = x;	//int -> double형 형변환

}
