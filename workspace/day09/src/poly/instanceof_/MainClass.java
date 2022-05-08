package poly.instanceof_;

import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		//다형성 사용(부모타입으로 통일)
		Person s = new Student("가나다", 18, "2013");
		
		Person t = new Teacher("박가나", 30, "수학");
	
		Person e = new Employee("최가나", 55, "회계부");
		
		personInfo(s);
		personInfo(t);
		personInfo(e);
		
	}
	
	public static void personInfo(Person p) {
		
		if(p instanceof Student) {		//p객체가 Student로 생성되었다면 true
			Student s = (Student)p;
			System.out.println(s.info());
		}else if(p instanceof Teacher) {//p객체가 Teacher로 생성되었다면 true
			Teacher t = (Teacher)p;
			System.out.println(t.info());
		}else if(p instanceof Employee) {//p객체가 Employee로 생성되었다면 true
			Employee e = (Employee)p;
			System.out.println(e.info());
		}
		
	}

}
