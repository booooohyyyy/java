package ramda.stream;

import java.util.stream.IntStream;

public class MainClass03 {
	
	public static int sum = 0;
	
	public static void main(String[] args) {
		
		//인트스트림의 반복문 (1~10미만)
		IntStream.range(1, 10).forEach((a) -> System.out.println(a));
		
		//1~10까지 반복문 (1~10이하)
		IntStream.rangeClosed(1, 10).forEach((a) -> System.out.println(a));
		
		//합계 (지역변수는 람다안에서 사용 불가)
		IntStream.rangeClosed(1, 10).forEach((a) -> {
			sum += a;
		});
		System.out.println(sum);
		
		//집계함수
		IntStream.rangeClosed(20, 100).average().getAsDouble();
		IntStream.rangeClosed(20, 100).sum();
		IntStream.rangeClosed(20, 100).max().getAsInt();
	}

}
