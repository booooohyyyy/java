package Inter.basic2;

public class Cat extends Animal implements IPet{

	@Override
	public void eat() {
		System.out.println("고양이는 생선을 먹습니다.");
		
	}

	@Override
	public void play() {
		System.out.println("고양이는 방에서 놀아요.");
		
	}

	@Override
	public void sleep() {
		System.out.println("고양이는 방에서 잠을 자요.");
		
	}

}
