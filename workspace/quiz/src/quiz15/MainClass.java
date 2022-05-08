package quiz15;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * 무한 반복문 안에서 인터페이스를 구현하는 클래스를 실행.
		 */
		
		Scanner scan = new Scanner(System.in);
		SongList melon = new MelonMusic();
		SongList bugs = new BugsMusic();
		
		while(true) {
			
			System.out.println("메뉴: 1.추가하기, 2.재생하기, 3.목록개수, 4.종료하기");
			System.out.print(">");
			String menu = scan.next();
			
			if(menu.equals("1")) {
				//추가하기
				System.out.print("추가할 음악>");
				String p = scan.next();
				melon.insertList(p);
//				bugs.insertList(p);
			}else if(menu.equals("2")) {
				//재생하기
				melon.playList();
//				bugs.playList();
			}else if(menu.equals("3")) {
				//목록개수
				int cnt = melon.playLength();
//				int cnt2 = bugs.playLength();
				System.out.println("저장된 음악의 개수: " + cnt + "개");
			}else if(menu.equals("4")) {
				System.out.println("종료");
				break;
			}
			
		}
	}

}
