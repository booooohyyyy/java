package quiz03;

public class Room {
	
	int window;
	int door;
	int computer;
	int student;
	
	
	Room(int w, int d, int c, int s) {
		
		window = w;
		door = d;
		computer = c;
		student = s;
		
		System.out.println("방안에는 학생 " + student + "명과 컴퓨터 " + computer + "대가 있습니다." );
		
	}
	
	void windowType() {
		System.out.println("창문은 직사각형이고 " + window + "개 있습니다.");
	}
	
	void doorType() {
		System.out.println("문은 직사각형이고 " + door + "개 있습니다.");
	}

}
