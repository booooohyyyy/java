package genric.good;

public class MainClass {
	
	public static void main(String[] args) {
		
		//제네릭 클래스 생성 1
		ABC<String> abc = new ABC<String>();
		abc.setT("홍길동");
		String name = abc.getT();
		System.out.println(name);
		
		//제네릭 클래스 2 - 제네릭에는 기본형이 저장될 수 없다.
		ABC<Integer> abc2 = new ABC<Integer>();
		
		//제네릭 클래스 3 - 뒤에 <>는 타입생략이 가능하다.
		ABC<Person> abc3 = new ABC<>();
		abc3.setT(new Person());
		Person p = abc3.getT();
		
	}

}
