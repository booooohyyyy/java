package encap.obj;

public class MainClass {
	
	public static void main(String[] args) {
		
		Hotel ht = new Hotel();
		
		//getter의 사용
//		Employee e = ht.getEmp();
//		e.working();
		ht.getEmp().working();
		
		//setter의 사용
//		Chef c = new Chef();
//		ht.setCf(c);
		ht.setCf(new Chef());
		
		
		
		
	}

}
