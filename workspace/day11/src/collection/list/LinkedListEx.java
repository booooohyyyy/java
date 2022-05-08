package collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
//		List<String> list = new LinkedList<>(); //list처럼 사용
		
		//추가
		list.add("피카츄");
		list.add("라이츄");
		list.add("파이리");
		list.add("꼬부기");
		
		//확인
		System.out.println(list.toString());
		
		//값 얻기 get(index)
		String name = list.get(2);
		System.out.println(name);
		
		//삭제
		list.remove(0);
		System.out.println(list.toString());
		
		System.out.println("-----------------------------");
		
		list.addFirst("피카츄");
		list.addLast("버터풀");
		System.out.println(list.toString());
		
		//queue 기능도 사용이 가능
		//대표적인 기능 offer, poll
		
		list.offer("a");
		list.offer("b");
		list.offer("c");
		System.out.println(list.toString());
		
		String result = list.poll();
		System.out.println(result);
		System.out.println("남아있는 리스트" + list.toString());
		
		System.out.println("-----------------------------");
		
		//linkedList가 가지고 있는 LIFO 
		//push, pop
		list.push("1");
		System.out.println(list.toString());
		
		String result2 = list.pop();
		System.out.println(result2);
		System.out.println(list.toString());
		
	}
	

}
