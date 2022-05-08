package encap.obj;

public class Hotel {
	
	//멤버 변수
	private Employee emp;
	private Chef cf;
	
	//생성자
	public Hotel() {
		this.emp = new Employee(); 	//=(Employee emp = new Employee();)
		this.cf = new Chef();		//=(Chef cf = new Chef();)
	}
	
	//Emp Setter
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	//Emp Getter
	public Employee getEmp() {
		return emp;
	}
	
	//Chef Setter
	public void setCf(Chef cf) {
		this.cf = cf;
	}
	//Chef Getter
	public Chef getCf() {
		return cf;
	}

}
