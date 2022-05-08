package api.lang.object;

public class Person implements Cloneable {
	
	private String name;

	public Person(String name) {
		this.name = name;
	}
	
	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		//객체의 name값이 같은지 확인
		if(obj instanceof Person) {
			Person p = (Person)obj;
			
			if(p.getName().equals(this.name)) {
				return true;
			}
		}
		
		return false;
	}

	//Cloneable인터페이스를 구현해야 함
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


	
//	//alt + shift + s
//	@Override
//	public String toString() {
//		return "name:" + name;
//	}
	
	
	

}
