package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
	
	public static void main(String[] args) {
		
		//HashMap<Integer, String> map = new HashMap<>();
		Map<Integer, String> map = new HashMap<>();
		
		//put(키, 값) - 값 추가
		map.put(1, "피카츄");
		map.put(2, "라이츄");
		map.put(3, "파이리");
		map.put(4, "꼬부기");
		
		System.out.println("맵의 크기:" + map.size());
		System.out.println(map.toString());
		
		//값 수정 -> map에 같은 key를 저장하면, key에 대한 value를 수정
		map.put(4, "리자드");
		System.out.println(map.toString());
		
		//get(키) - 값 얻기
		String name = map.get(4);
		System.out.println(name);
		
		//keySet(), EntrySet() - 맵에 저장된 값을 순서대로 확인
		Set<Integer> keyset = map.keySet();
		System.out.println(keyset.toString());
		
		for(Integer i : keyset) {
			System.out.println("키:" + i);
			System.out.println("값:" + map.get(i));
		}
		
//		Iterator<Integer> iter = keyset.iterator();
//		while(iter.hasNext()) {
//			int i = iter.next();
//			System.out.println("키:" + i);
//			System.out.println("값:" + map.get(i));
//		}
		
		System.out.println("------------------------------");
		
		//entrySet을 이용해서 Entry 뽑기
		Set<Entry<Integer, String>> entrys = map.entrySet();
		
		for(Entry<Integer, String> e : entrys) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}

		
		//containsKey() - 키의 여부
		if(map.containsKey(1)) {
			System.out.println("키가 포함되어 있다.");
		}
		
		//remove(키) - map의 값 삭제
		map.remove(1);
		System.out.println(map.toString());
		
	}

}
