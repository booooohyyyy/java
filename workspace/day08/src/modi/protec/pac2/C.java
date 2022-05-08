package modi.protec.pac2;

import modi.protec.pac1.A;

public class C extends A {
	
	public C() {
		//default와 사용범위는 같다.
//		A a = new A();
//		a.bool = false;
//		a.method();
		
		//상속관계에서 super키워드로 참조 가능
		super();
		super.bool = true;
		super.method();
	}
	
	

}
