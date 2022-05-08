package static_.method;

public class Count {
	public int a;
	public static int b;
	
	
	//일반 메서드 - 일반멤버변수, 정적멤버변수 모두 사용가능
	public int method01() {
		a = 10;
		return ++b;
	}
	
	//정적 메서드 - static 붙은 변수나 메서드만 사용 가능
	//         - 단, 객체생성을 통해서는 일반 변수도 사용할 수 있다.
	public static int method02() {
		Count c = new Count();
		c.a = 10;
//		a = 10;    //(X)
		return ++b;
	}

}
