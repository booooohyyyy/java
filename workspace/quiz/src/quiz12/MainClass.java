package quiz12;

public class MainClass {
	
	public static void main(String[] args) {
		
		MyCart mc = new MyCart(2000);
		
		Product p = new Computer();
		Product p1 = new Radio();
		Product p2 = new Tv();
		
		mc.buy(p);
		mc.buy(p1);
		mc.buy(p2);
		
		
		
	}

}
