package ramda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MainClass02 {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		Random ran = new Random();
		
		for(int i = 0; i < 100; i++) {
			list.add( ran.nextInt(100) +1 ); //1~100
		}
		System.out.println(list.toString());
		
		System.out.println("----------------------------------");
		
		/*
		 * 함수적 인터페이스의 형태
		 * Consumer - 매개변수 o, 반환 void
		 * Predicate - 매개변수 o, 반환 boolean
		 * Function - 매개변수 o, 반환은 결정해주는 형태
		 */
		
		//스트림의 중복 제거 distinct
		Long cnt = list.stream().distinct().count();
		System.out.println("스트림 크기:" + cnt);
		
		//스트림의 결과반복
		list.stream().distinct().forEach((a) -> System.out.print(a + " "));
		System.out.println(); //줄 바꿈
		
		//스트림의 정렬 sorted()
		list.stream().distinct().sorted().forEach((a) -> System.out.print(a + " "));
		System.out.println(); //줄 바꿈
		
		//스트림의 걸러내는 기능 filter() - return에 true인 값만 반환
		list.stream().distinct().sorted().filter((a) -> {
			return a % 2 == 0;
		}).forEach((a) -> System.out.print(a + " ")); //짝수만 남음
		System.out.println();
		
		System.out.println("----------------------------------");
		
		System.out.println("list의 형태:" + list.toString());
		
//		list.stream().map(new Function<Integer, String>() {
//			@Override
//			public String apply(Integer t) {
//				// TODO Auto-generated method stub
//				return t % 2 == 0 ? "짝" : "홀";
//			}
//		});
		
		//스트림을 새로운 스트림의 형태로 반환 map()
		list.stream().map((t) -> {
			return t % 2 == 0 ? "짝" : "홀";
		}).forEach( (a) -> System.out.print(a + " "));
		
		System.out.println("----------------------------------");
		
		//mapToint() 정수형 스트림으로 반환
		//정수형 스트림은 집계함수의 사용이 가능.
		int sum = list.stream().mapToInt((a) -> a).sum();
		System.out.println("리스트 요소들의 합:" + sum);
		long cnt2 = list.stream().mapToInt((t) -> t).count();
		System.out.println("리스트 요소의 개수:" + cnt2);
		double avg = list.stream().mapToInt((t) -> t).average().getAsDouble();
		System.out.println("리스트 요소들의 평균:" + avg);
		int max = list.stream().mapToInt((t) -> t).max().getAsInt(); //min도 가능
		System.out.println("리스트 요소중 가장 큰 값:" + max);
		
		System.out.println("----------------------------------");
		
		//최종함수 collect()
		List<Integer> newList = list.stream().filter((t) -> t % 3 == 0).collect(Collectors.toList());
		newList.stream().sorted().forEach((a) -> System.out.print(a + " "));
		System.out.println();
		
		System.out.println("----------------------------------");
		
		//실습
		//list의 5의 배수만 중복o 정렬해서 해당 리스트를 새로운 리스트로 반환
		//list의 5의 배수만 중복x 추출해서 평균.
		
		List<Integer> list5 = list.stream().filter((t) -> t % 5 == 0).sorted().collect(Collectors.toList());
		System.out.println(list5.toString());
		
		double exAvg = list.stream()
							.distinct()
							.filter((a) -> a % 5 == 0)
							.sorted().mapToInt((t) -> t)
							.average()
							.getAsDouble();
		System.out.println("평균:" + exAvg);
		
//		list5.stream().distinct().forEach((a) -> System.out.print(a + " "));
//		double avg2 = list5.stream().distinct().mapToInt((t) -> t).average().getAsDouble();
//		System.out.println("\n평균:" + avg2);
		
		
		
	}

}
