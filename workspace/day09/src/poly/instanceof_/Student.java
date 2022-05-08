package poly.instanceof_;

public class Student extends Person {
	
	//this키워드 이용해서 name, age, studentId를 초기화하는 생성자

	String studentId;
	
	Student(String n, int a, String s) {
//		this.name = n;
//		this.age = a;
//		this.studentId = s;	
		super(n, a);
		this.studentId = s;
	}
	
	Student() {
		this("둘리", 1, "2019");
	}
	
	
	String info() {
		return super.info() + ", 학번: " + studentId;
	}
	

}
