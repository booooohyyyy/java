package Inter.basic2;

public class PetHouse {
	
	/*
	 * 1. carePet() 메서드를 선언
	 * 메개변수로 모든 펫타입을 받을 수 있도록 선언.
	 * 기능 - instanceof를 사용해서 클래스 캐스팅하여, 타입확인
	 * 
	 * 2. petInfo() 메서드를 선언
	 * 매개변수로 IPet[]을 받을 수 있도록 선언
	 * 기능 - 펫배열을 회전시켜 play(), sleep() 기능을 실행.
	 */
	
	void carePet(IPet p) {
		if(p instanceof Dog) {
			Dog d = (Dog)p;
			System.out.println("Dog타입 입니다.");
		}else if(p instanceof Cat) {
			Cat c = (Cat)p;
			System.out.println("Cat타입 입니다.");
		}else if(p instanceof GoldFish) {
			GoldFish gf = (GoldFish)p;
			System.out.println("GoldFish타입 입니다.");
		}else {
			System.out.println("애완동물이 아닙니다.");
		}
	}
	
	void petInfo(IPet[] ip) {
		for(IPet s : ip) {
			s.play();
			s.sleep();
		}
		
	}

}
