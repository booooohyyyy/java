package super_basic;

public class Teacher extends Person {

//	this키워드 이용해서 name, age, subject를 초기화하는 생성자
	
	String subject;
	
	Teacher(String n, int a, String s) {
		super(n,a);
		this.subject = s;
	}
	
	Teacher() {
		this("이상해씨", 70, "사회");
	}

	String info() {
		return  super.info() + ", 과목: " + subject;
	}
}
