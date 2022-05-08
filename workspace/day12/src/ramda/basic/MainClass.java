package ramda.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		
		//반환x, 매개변수x
		p.greeting(new Say01() {
			
			@Override
			public void talking() {
				System.out.println("니하오~");
				
			}
		});
		
		//반환o, 매개변수x
		p.greeting(new Say02() {
			
			@Override
			public String talking() {
				
				return "니하오";
			}
		});
		
		//반환o, 매개변수o
		p.greeting(new Say03() {
			
			@Override
			public String talking(String word) {
				return "(중국말)"+ word;
			}
		});
		
		String result = p.greeting(new Say04() {
			
			@Override
			public String talking(int a, String word) {
				String str = "";
				for(int i = 1; i <= a; i++) {
					str += word;
				}
				return str;
			}
		});
		System.out.println("최종결과:" + result);
		
		System.out.println("------------------------------");
		
		//함수적 인터페이스에 익명객체를 대신해서 람다식을 사용할 수 있다.
		//구현메서드의 매개변수 ()로 표현되고 몸체가 {}로 표현된다.
		

		//실행구문이 하나라면 중괄호 생략가능.
		p.greeting(() -> {
			System.out.println("안녕하세요~");
		});
		
		p.greeting(() -> {
			return "hello";
		});
		
		//타입 생략
		p.greeting((word) -> {
			return "(람다식 중국말)" + word;
		});

		//람다식 안에서는 static 변수만 예외적으로 참조할 수 있다.
		String result2 = p.greeting((a, word) -> {
			String str2 = "";
			for(int i = 1; i <= a; i++) {
				str2 += word;
			}
			return str2;
		});
		System.out.println("최종결과:" + result2);
		
	}

}
