package quiz13;

public class MainClass {
	
	
	public static void main(String[] args) {
		
		Circle c = new Circle("원", 4);
		
		System.out.println(c.getName());
		System.out.println("넓이:" + c.getArea());
		System.out.println("반지름:" + c.getSide());
		

		Rect r = new Rect("정사각형", 4);
		System.out.println(r.getName());
		System.out.println("넓이:" + r.getArea());
		System.out.println("변의길이:" + r.getSide());
		
		
		
	}
	
	
	
	

}
