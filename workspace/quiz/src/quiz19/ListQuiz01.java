package quiz19;

import java.util.ArrayList;
import java.util.List;

public class ListQuiz01 {
	
	public static void main(String[] args) {
		
		//list에 1~20까지 정수를 순서대로 저장.
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 20 ; i++) {
			list.add(i+1);
		}
		//list에 저장된 값을 반복문으로 순서대로 출력.
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		System.out.println("--------------------------");
		
		for(int a : list) {
			System.out.print(a+ " ");
		}
		
		
	}

}
