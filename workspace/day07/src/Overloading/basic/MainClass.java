package Overloading.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		Basic b = new Basic();
		
		b.input(4);
		b.input("18");
		b.input(9.2, "하하");
		b.input("하하", 12.1);
		b.input('다', 2, 6.0);
		
		
		
		
	}

}
