package Inter.basic2;

public class MainClass {
	
	public static void main(String[] args) {
		
		Animal a1 = new Tiger();
		Animal a2 = new Cat();
		Animal a3 = new Dog();
		
		Animal[] ani =  {a1, a2, a3};
		
		for(Animal a : ani ) {
			a.eat();
		}
		
		
		System.out.println("------------------------");
		//1. IPet[]을 생성하고, 고양이, 강아지는 형변환, 금붕어는 생성해서 저장
		//2. 향상된 for문으로 pet의 기능을 실행
		
		IPet p1 = (IPet)a2;
		IPet p2 = (IPet)a3;
		IPet p3 = new GoldFish();
		
		IPet[] pet = {p1, p2, p3};
		
		for(IPet ip : pet) {
			ip.play();
			ip.sleep();
		}
		
		System.out.println("------------------------");
		
		PetHouse ph = new PetHouse();
		
		ph.carePet(pet[0]);
		ph.carePet((IPet)a3);
		ph.carePet(p3);
		
		ph.petInfo(pet);
		
		
		
		
	}

}
