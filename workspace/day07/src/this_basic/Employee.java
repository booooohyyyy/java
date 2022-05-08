package this_basic;

public class Employee extends Person {
	
//	this키워드 이용해서 name, age, department를 초기화하는 생성자
	
	String department;
	
	Employee(String n, int a, String d) {
		this.name = n;
		this.age = a;
		this.department = d;
	}
	
	Employee() {
		this("파피몬", 100, "홍보부");
	}
	
	String info() {
		return  "이름: " + name + ", 나이: " + age + ", 부서: " + department;
	}


}
