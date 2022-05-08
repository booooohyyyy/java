package poly.basic03;

import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args) {
		
		//다형성이 없다면? -> 클래스를 통일해서 사용할 수 없음
//		Student s = new Student("가나다", 18, "2013");
//		Student s2 = new Student("가나라", 19, "2014");
//		Student s3 = new Student("가라마", 20, "2015");
//		
//		Teacher t = new Teacher("박가나", 30, "수학");
//		Teacher t2 = new Teacher("박마바", 40, "국어");
//		
//		Employee e = new Employee("최가나", 55, "회계부");
//		
//		Student[] arr = {s, s2, s3};
//		Teacher[] arr2 = {t, t2};
//		Employee[] arr3 = {e};
//		
//		for(Student stud : arr) {
//			System.out.println(stud.info());
//		}
		
		
		
		//다형성 사용(부모타입으로 통일)
		Person s = new Student("가나다", 18, "2013");
		Person s2 = new Student("가나라", 19, "2014");
		Person s3 = new Student("가라마", 20, "2015");
		
		Person t = new Teacher("박가나", 30, "수학");
		Person t2 = new Teacher("박마바", 40, "국어");
		
		Person e = new Employee("최가나", 55, "회계부");
		
		Person[] arr = {s, s2, s3, t, t2, e}; //가능		
		
		for(Person per : arr) {
			System.out.println(per.info());
		}
		
		System.out.println("---------------------");
		
		House h = new House();
		
		h.setPerson(s);
		h.setPerson(s2);
		h.setPerson(s3);
		h.setPerson(t);
		h.setPerson(t2);
		h.setPerson(e);
		
		Person[] pArr = h.getPArr();
		System.out.println(Arrays.toString(pArr));
		
		
		
	}

}
