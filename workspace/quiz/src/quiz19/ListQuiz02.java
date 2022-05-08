package quiz19;

import java.util.ArrayList;
import java.util.List;

public class ListQuiz02 {
	
	public static void main(String[] args) {
		
		/*
		 * 1.User 클래스에 생성자, getter, setter생성
		 * 2. User를 제네릭으로 갖는 리스트 하나 생성
		 * 3. User를 3개 만들어서 리스트에 추가
		 * 4. list에 저장된 모든 이름, 나이를 for(향상된)으로 출력
		 * 5. list에 홍길동이 있다면, 홍길동의 이름과 나이 출력
		 * 6. list에 홍길동이 있다면, 홍길동 객체를 삭제.(첫번째 홍길동)
		 */
		
		List<User> list = new ArrayList<>();
		
		User u1 = new User("홍길동", 11);
		User u2 = new User("피카츄", 22);
		User u3 = new User("파이리", 33);
		
		list.add(u1);
		list.add(u2);
		list.add(u3);
		
		for(User u : list) {
			System.out.println("이름:" + u.getName() + " 나이:" + u.getAge());
		}
		
		System.out.println("----------------------------------");
		
		for(User u : list) {
			if(u.getName().equals("홍길동")) {
				System.out.println("이름:" + u.getName() + " 나이:" + u.getAge());
			}
		}
		
		System.out.println("----------------------------------");
		
//		for(User u : list) {
//			if(u.getName().equals("홍길동")) {
//				list.remove(u);
//				break;
//			}
//		}
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals("홍길동")) {
				list.remove(i);
				break;
			}
		}
		
		System.out.println(list.toString());

	}

}
