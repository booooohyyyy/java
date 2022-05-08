package Inter.basic3;

public interface Printed {
	
	//클래스가 가져야 할 기능 추상메서드로 정의
	public void turnOn();
	public void turnOff();
	public void print(String document);
	public void colorPrint(String document, String color);
	public int copy(int n);

}
