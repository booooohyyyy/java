package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
	
	public static void main(String[] args) {
		
		//ArrayList - 배열기반으로 만들어진 클래스
		//ArrayList<String> list = new ArrayList<>();
		List<String> list = new ArrayList<>();
		
		//add() - list에 값 추가 
		list.add("java");
		list.add("database");
		list.add("js");
		list.add("spring");
		list.add("java");
		
		//size() - list의 크기
		System.out.println(list.size());
		
		//toString() - list에 저장된 형태를 문자열로 확인
		System.out.println(list.toString());
		
		//add(index, 값) - list 중간에 값 추가
		list.add(2,  "react");
		System.out.println(list.toString());
		
		//set(index, 값) - list의 값 수정
		list.set(2, "vue");
		System.out.println(list.toString());
		
		//get(index) - list 값 확인
		String value = list.get(2); // String value = arr[2];
		System.out.println(value);
		
		//contains(값) - list의 존재여부 확인
		if(list.contains("js")) {   //있으면 true, 없으면 false
			System.out.println("존재한다.");
		}
		
		//remove(index), remove(값) - 앞에 것부터 list 값 삭제
		list.remove(1);
		System.out.println(list.toString());
		list.remove("java");
		System.out.println(list.toString());
		
		System.out.println("--------------------------------");
		
		List<String> list2 = new ArrayList<>();
		list2.add("홍길동");
		list2.add("이순신");
		
		list2.addAll(list); //list2에 list요소 전체추가
		System.out.println(list2.toString());
		
		System.out.println("--------------------------------");
		
		//배열을 리스트로 변경하기
		String[] arr = {"감자", "고구마"};
		List<String> list3 = Arrays.asList(arr);
		
		list2.addAll(list3);
		System.out.println(list2.toString());
		
		System.out.println("--------------------------------");
		
		list2.removeAll(list3);
		System.out.println(list2.toString());
		
	}

}
