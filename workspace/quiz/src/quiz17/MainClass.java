package quiz17;

public class MainClass {
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		try {
			
			int answer = cal.inputTest();
			System.out.println(answer);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
