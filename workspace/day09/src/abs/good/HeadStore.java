package abs.good;

public abstract class HeadStore {
	
	/*
	 * 1. 메서드에 abstract를 붙이면 추상 메서드가 된다.
	 *    일반 클래스에 추상 메서드를 선언할 수 없기 때문에 추상 클래스로 만들어 준다.
	 * 2. 추상 메서드는 {}가 없는 메서드의 선언
	 * 3. 추상 클래스는 일반메섣, 일반변수, 생서자 모두 사용가능
	 */
	
	private String name = "호식이";	//멤버변수
	
	public HeadStore() {			//생성자 
		
	}
	
	public String getName() {
		return name;
	}
	
	public abstract void apple();
	public abstract void orange();
	public abstract void grape();

	public final void melon() {			//일반 메서드
		System.out.println("본점에서 판매하는 멜론");
	}
	
}
