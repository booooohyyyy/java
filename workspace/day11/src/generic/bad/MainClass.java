package generic.bad;

public class MainClass {
	
	public static void main(String[] args) {
		
		ABC abc = new ABC();
		
		//String 저장
		abc.setObj("이순신");
		String s = (String)abc.getObj();
		System.out.println(s);
		
		//Person 저장
		abc.setObj(new Person());
		Person p = (Person)abc.getObj();
		
		/*
		 * Object형으로 선언하면, 무엇이든 저장할 수 있지만
		 * 반대로 저장했던 값을 사용할 때 타입별로 형변환을 해야하는 문제가 있다. 
		 * (잘못 형변환시에 예외를 발생시킴)
		 */
	}

}
