package quiz19;

public class User {
	
	private String name;
	private int age;

	//생성자
	public User(String n, int a) {
		this.name = n;
		this.age = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//getter,setter
	
}
