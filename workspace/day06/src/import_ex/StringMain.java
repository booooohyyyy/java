package import_ex;

public class StringMain {
	
	public static void main(String[] args) {
		
		//String도 참조타입
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		//str1,str2는 같은 주소값에 있는 홍길동
		//str3은 다른 주소값에 있는 홍길동
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		/*
		 * 같은 클래스에서 동일 문자열을 저장하면, 같은 String을 가리키지만,
		 * 직접 String생성을 내리거나 다른 클래스에서 넘어온 String은
		 * 다른 주소를 가지게 됌
		 * 
		 * 그래서, String클래스가 제공하는 equals()를 이용해서 문자열 배교를 해야 함
		 */
		
		if(str1.equals(str3)) {
			System.out.println("문자열 자체는 같음");
		}
		
	}

}
