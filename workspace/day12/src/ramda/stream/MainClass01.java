package ramda.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MainClass01 {
	
	public static void main(String[] args) {
		
		String[] arr = {"피카츄", "라이츄", "파이리", "꼬부기", "버터풀"};
		List<String> list = Arrays.asList(arr);
		
		Iterator<String> iter = list.iterator(); //일반적 Iterator
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("------------------------------");
		
		Stream<String> stream = list.stream();
		
//		stream.forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//				
//			}
//		});
		
		//forEach()는 매개변수로 익명객체를 받기 때문에, 람다식으로 대체가 가능
		//실행문이 1줄이면 {}생략 가능
		stream.forEach((n) -> {
			System.out.println(n);
		});
		
		
	}
	
	

}
