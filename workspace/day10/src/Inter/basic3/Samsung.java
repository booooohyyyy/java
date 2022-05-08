package Inter.basic3;

public class Samsung implements Printed {

	private String logo = "from Samsum"; 
	
	@Override
	public void turnOn() {
		System.out.println(logo);
		System.out.println("On");
		
	}

	@Override
	public void turnOff() {
		System.out.println(logo);
		System.out.println("Off");		
	}

	@Override
	public void print(String document) {
		System.out.println(document);	
	}

	@Override
	public void colorPrint(String document, String color) {
		System.out.println(color + "색 출력:" + document);
	}

	@Override
	public int copy(int n) {
		for(int i = 0; i < n; i++) {
			System.out.println(i+1 + "장 출력");
		}
		return n;
	}

}
