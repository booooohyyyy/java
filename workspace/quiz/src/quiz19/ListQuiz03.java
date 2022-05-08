package quiz19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuiz03 {
	
	public static void main(String[] args) {
	
		//list를 이용해서 간단한 프로그램을 작성.
		//앞전에 사용했던 User 클래스 사용.
		
		Scanner scan = new Scanner(System.in);
		List<User> list = new ArrayList<>();
		
		while(true) {
			
			System.out.println("1.등록 | 2. 회원정보보기 | 3. 회원정보검색 | 4. 회원정보삭제 | 5. 종료");
			System.out.print("메뉴입력>");
			int menu = scan.nextInt();
			
			if(menu == 1) {
				//스캐너로 이름, 나이를 입력받고, User에 저장, 리스트에 추가.
				System.out.print("이릅>");
				String name = scan.next();
				System.out.print("나이>");
				int age = scan.nextInt();
				
				User user = new User(name, age);
				list.add(user);
				
			}else if(menu == 2) {
				//list에 있는 회원정보를 전부 출력
				for(User u : list ) {
					System.out.println("이름:" + u.getName() + " 나이:" + u.getAge());
				}
				
			}else if(menu == 3) {
				//찾을 이름을 입력받습니다. 이름이 있다면, 이름과 나이를 출력
				//찾을 이름이 없다면 "~~~님은 목록에 없습니다."를 출력
				System.out.print("찾는분 이름>");
				String find = scan.next();
				boolean bool = true;
				
				for(User u : list) {
					if(u.getName().equals(find)) {
						System.out.println("이름:" + u.getName() + " 나이:" + u.getAge());
						bool = false;
					}
				}
				if(bool) {
					System.out.println(find + "님은 목록에 없습니다.");
				}
				
			}else if(menu == 4) {
				//삭제할 이름을 받아사ㅓ, 입력받은 이름에 해당되는 User객체를 삭제
				System.out.print("삭제할 이름>");
				String del = scan.next();
				
				for(int i = 0; i < list.size(); i++) {
					if(list.get(i).getName().equals(del)) {
						list.remove(i);
						break;
					}
				}
				
			}else if(menu == 5) {
				//탈출
				System.out.println("종료");
				break;
				
			}else {
				//잘못 입력한 경우
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

}
