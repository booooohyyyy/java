package this_basic;

public class Student extends Person {
	
	//this키워드 이용해서 name, age, studentId를 초기화하는 생성자

	String studentId;
	
	Student(String n, int a, String s) {
		this.name = n;
		this.age = a;
		this.studentId = s;	
	}
	
	Student() {
		this("둘리", 1, "2019");
	}
	
	
	String info() {
		return "이름: " + name + ", 나이: " + age + ", 학번: " + studentId;
	}
	

}
