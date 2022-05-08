package collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetEx {
	
	public static void main(String[] args) {	
		//HashSet - 순서x, 중복x (리스트와 반대)
		//HashSet<String> set = new HashSet<>();
		Set<String> set = new HashSet<>();
		
		//add() - set에 추가
		set.add("java");
		set.add("spring");
		set.add("db");
		set.add("oracle");
		set.add("js");
		set.add("js");
		set.add("js");
		
		//size() - set의 크기
		System.out.println("set의 크기:" + set.size());
		System.out.println(set.toString());
		
		//iterator() - 값의 탐색 -> set에 저장된 값을 확인
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) { //다음에 존재여부 확인
			System.out.println(iter.next()); //다음에 대한 접근
		}
		
		//contains() - set의 값 포함여부
		if(set.contains("js")) {
			System.out.println("js가 포함");
		}
		
		//remove() - set의 삭제
		set.remove("db");
		System.out.println(set.toString());
		
		System.out.println("-----------------------------");
		
		//List에 set합쳐 사용하기
		List<String> list = new ArrayList<>();		
		list.addAll(set);
		System.out.println("리스트의 요소:" + list.toString());
		
	}
}
