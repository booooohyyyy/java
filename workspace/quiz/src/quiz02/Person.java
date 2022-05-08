package quiz02;

public class Person {
	
	String name;
	int age;
	int tall;
	
	
	//생성자 추가
	Person(String n, int a, int t){
		name = n;
		age = a;
		tall = t;
	}
	
	Person() {
		
	}
	
	void info() {
		System.out.println(name);
		System.out.println(age + "세");
		System.out.println("키: " + tall);
		
		
	}

}
