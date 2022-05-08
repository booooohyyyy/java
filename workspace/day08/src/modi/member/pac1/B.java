package modi.member.pac1;

public class B {
	
	
	public B() {
		A a = new A();
		a.v1 = 1;	//public(o)
		a.v2 = 2;	//default(o)
//		a.v3 = 3;	//private(x)
		
		a.method01();	//public(o)
		a.method02();	//default(o)
//		a.method03();	//private(x)
	}
	
	
	
	

}
