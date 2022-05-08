package collection.set;

import java.util.TreeSet;

public class TreeSetEx {
	
	public static void main(String[] args) {
		
		//TreeSet - 오름차순 정리
		TreeSet<String> tree = new TreeSet<>();
		
		tree.add("피카츄");
		tree.add("라이츄");
		tree.add("파이리");
		tree.add("꼬부기");
		tree.add("버터풀");
		
		for(String s : tree) {
			System.out.println(s);
		}
		
	}

}
