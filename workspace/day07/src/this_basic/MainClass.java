package this_basic;

public class MainClass {
	
	public static void main(String[] args) {
		
//		//Student 생성 후 확인
//		Student s = new Student();
//		s.age = 18;
//		s.name = "김을동";
//		s.studentId = "201802883";
//		
//		System.out.println(s.info());
//		
//		//Employee 생성 후 확인
//		Employee e = new Employee();
//		e.age = 27;
//		e.name = "장도리";
//		e.department = "회계부";
//		
//		System.out.println(e.info());
//		
//		//Teacher 생성 후 확인
//		Teacher t = new Teacher();
//		t.age = 32;
//		t.name = "고길동";
//		t.subject = "math";
//		
//		System.out.println(t.info());
		
		Person p = new Person("홍길동", 22);
//		System.out.println(p);
//		System.out.println(p.info());
		
		Person p2 = new Person("이순신");
//		System.out.println(p2.info());
		
		Person p3 = new Person();
//		System.out.println(p3.info());
		
		Employee e = new Employee();
		System.out.println(e.info());
		
		
	}

}
