package quiz02;

public class MainClass {
	
	public static void main(String[] args) {
		
//		Person p1 = new Person("홍길동", 20, 180);
//		p1.info();
//		
//		System.out.println("-------------------------");
//		
//		Person p2 = new Person();
//		p2.age = 40;
//		p2.name = "김길동";
//		p2.tall = 170;
//		
//		p2.info();
		
//		System.out.println("=============================");
//		
//		Account Acc1 = new Account("홍길동", "1234", 3600);
//		
//		Acc1.deposit(800);
//		Acc1.withDraw(1900);
//		
//		int bal = Acc1.getbalance();
//		System.out.println(Acc1.name + "님의 계좌 잔액은: " + bal + "원 입니다.");
		
		System.out.println("=============================");
		
		Student stud1 = new Student("홍길동", 21,80,90,75);
		System.out.println("합계 점수: " + stud1.getTotal());
		System.out.println("평균 점수: " + stud1.getAvg());
		
		System.out.println("----------------------------");
		
		Student stud2 = new Student("김을동", 18, 92, 88, 82);
		System.out.println("합계 점수: " + stud2.getTotal());
		System.out.println("평균 점수: " + stud2.getAvg());
			
		
	}


}
