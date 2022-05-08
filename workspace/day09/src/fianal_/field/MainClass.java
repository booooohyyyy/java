package fianal_.field;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person p = new Person("1111111-1111111", "피카츄");
//		p.nation = "미국"; //변경(x)
		System.out.println("ssn:" + p.ssn);
		
		
		Person p2 = new Person("2222222-2222222", "파이리");
		System.out.println("ssn:" + p2.ssn);
		
	}

}
