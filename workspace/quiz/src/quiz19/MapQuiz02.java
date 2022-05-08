package quiz19;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapQuiz02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//맵을 이용한 간단한 프로그램 key: 메뉴이름, value: 가격
		Map<String, Integer> map = new HashMap<>();
		
		ex: while(true) {
			System.out.println("-------음식 메뉴 관리-------");
			System.out.println("1. 신규 메뉴 등록");
			System.out.println("2. 메뉴 전체 확인");
			System.out.println("3. 메뉴 수정");
			System.out.println("4. 메뉴 삭제");
			System.out.println("5. 종료");
			
			System.out.print("메뉴입력>");
			int menu = scan.nextInt();
			
			boolean bool = true;
			
			switch (menu) {
			case 1:
				//새로운 메뉴와 가격을 받아서 맵에 추가 (기존 메뉴가 있는지 확인)
				System.out.print("추가할 메뉴>");
				String newMenu = scan.next();
				
				if(map.containsKey(newMenu)) {
					System.out.println("기존 메뉴가 존재 합니다.");
				}else {
					System.out.print("가격>");
					int price = scan.nextInt();
					map.put(newMenu, price);
					System.out.println("정상입력 되었습니다.");
					
				}
				
//				Set<String> keyset = map.keySet();
//				
//				for(String s : keyset) {
//					if(s.equals(newMenu)) {
//						System.out.println("존재하는 메뉴 입니다.");
//						bool = false;
//					}
//				}
//				if(bool) {
//					map.put(newMenu, price);
//					System.out.println(newMenu + "을/를 추가했습니다.");
//				}
				
				break;
			case 2:
				//전체 메뉴를 출력
//				System.out.println(map.toString());
				
				Set<Entry<String, Integer>> iter = map.entrySet();
				
				for(Entry<String, Integer> e : iter) {
					System.out.println("메뉴:" + e.getKey() +"\t"+"가격:"+ e.getValue());
				}
				
				
				break;
			case 3:
				//가격을 변경할 메뉴를 입력 받아서, 메뉴가 존재하면 새로입력받은 가격으로 수정
				System.out.print("가격 변경할 메뉴>");
				String reMenu = scan.next();
				
				if(map.containsKey(reMenu)) {
					System.out.print("수정할 가격>");
					int reprice = scan.nextInt();
					map.put(reMenu, reprice);
					System.out.println("가격이 변경되었습니다.");
				}else {
					System.out.println("존재하지 않는 메뉴입니다.");
				}
				
//				Set<String> keyset2 = map.keySet();
//				
//				for(String s : keyset2) {
//					if(s.equals(reMenu)) {
//						System.out.print("변경가격>");
//						int rePrice = scan.nextInt();
//						map.put(reMenu, rePrice);
//						System.out.println(reMenu +"의 가격을 변경했습니다.");
//						bool = false;
//					}
//				}
//				if(bool) {
//					System.out.println(reMenu + "은/는 없는 메뉴입니다.");
//				}
				
				break;
			case 4:
				//메뉴를 받아서, 삭제
				System.out.print("삭제할 메뉴>");
				String delMenu = scan.next();
				
				if(map.containsKey(delMenu)) {
					map.remove(delMenu);
					System.out.println("메뉴가 삭제되었습니다.");
				}else {
					System.out.println("존재하지 않는 메뉴입니다.");
				}
				
//				Set<String> keyset3 = map.keySet();
//				
//				for(String s : keyset3) {
//					if(s.equals(delMenu)) {
//						map.remove(delMenu);
//						System.out.println(delMenu + "을/를 삭제했습니다.");
//						bool = false;
//					}
//				}
//				if(bool) {
//					System.out.println(delMenu + "은/는 없는 메뉴입니다.");
//				}
	
				break;
			case 5:
				//종료
				System.out.println("종료");
				break ex;
//				System.exit(0); //프로그램 종료
			default :
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
		
		
		
	}

}
